// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, LongHashMap, EmptyChunk, ChunkCoordIntPair, 
//            World, ChunkCoordinates, Chunk, IChunkLoader, 
//            IProgressUpdate, EnumCreatureType, ChunkPosition

public class ChunkProvider
    implements IChunkProvider
{

    private Set field_28062_a;
    private Chunk field_28061_b;
    private IChunkProvider field_28067_c;
    private IChunkLoader field_28066_d;
    private LongHashMap field_28065_e;
    private List field_28064_f;
    private World field_28063_g;
    private int field_35557_h;

    public ChunkProvider(World p_i346_1_, IChunkLoader p_i346_2_, IChunkProvider p_i346_3_)
    {
        field_28062_a = new HashSet();
        field_28065_e = new LongHashMap();
        field_28064_f = new ArrayList();
        field_28061_b = new EmptyChunk(p_i346_1_, 0, 0);
        field_28063_g = p_i346_1_;
        field_28066_d = p_i346_2_;
        field_28067_c = p_i346_3_;
    }

    public boolean func_365_a(int p_365_1_, int p_365_2_)
    {
        return field_28065_e.func_35508_b(ChunkCoordIntPair.func_22006_a(p_365_1_, p_365_2_));
    }

    public void func_35556_d(int p_35556_1_, int p_35556_2_)
    {
        ChunkCoordinates chunkcoordinates = field_28063_g.func_22078_l();
        int i = (p_35556_1_ * 16 + 8) - chunkcoordinates.field_22216_a;
        int j = (p_35556_2_ * 16 + 8) - chunkcoordinates.field_528_b;
        char c = '\200';
        if(i < -c || i > c || j < -c || j > c)
        {
            field_28062_a.add(Long.valueOf(ChunkCoordIntPair.func_22006_a(p_35556_1_, p_35556_2_)));
        }
    }

    public Chunk func_376_d(int p_376_1_, int p_376_2_)
    {
        long l = ChunkCoordIntPair.func_22006_a(p_376_1_, p_376_2_);
        field_28062_a.remove(Long.valueOf(l));
        Chunk chunk = (Chunk)field_28065_e.func_677_a(l);
        if(chunk == null)
        {
            int i = 0x1c9c3c;
            if(p_376_1_ < -i || p_376_2_ < -i || p_376_1_ >= i || p_376_2_ >= i)
            {
                return field_28061_b;
            }
            chunk = func_28058_d(p_376_1_, p_376_2_);
            if(chunk == null)
            {
                if(field_28067_c == null)
                {
                    chunk = field_28061_b;
                } else
                {
                    chunk = field_28067_c.func_363_b(p_376_1_, p_376_2_);
                }
            }
            field_28065_e.func_675_a(l, chunk);
            field_28064_f.add(chunk);
            if(chunk != null)
            {
                chunk.func_4053_c();
                chunk.func_358_c();
            }
            chunk.func_35632_a(this, this, p_376_1_, p_376_2_);
        }
        return chunk;
    }

    public Chunk func_363_b(int p_363_1_, int p_363_2_)
    {
        Chunk chunk = (Chunk)field_28065_e.func_677_a(ChunkCoordIntPair.func_22006_a(p_363_1_, p_363_2_));
        if(chunk == null)
        {
            return func_376_d(p_363_1_, p_363_2_);
        } else
        {
            return chunk;
        }
    }

    private Chunk func_28058_d(int p_28058_1_, int p_28058_2_)
    {
        if(field_28066_d == null)
        {
            return null;
        }
        try
        {
            Chunk chunk = field_28066_d.func_659_a(field_28063_g, p_28058_1_, p_28058_2_);
            if(chunk != null)
            {
                chunk.field_676_s = field_28063_g.func_22080_k();
            }
            return chunk;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    private void func_28060_a(Chunk p_28060_1_)
    {
        if(field_28066_d == null)
        {
            return;
        }
        try
        {
            field_28066_d.func_4104_b(field_28063_g, p_28060_1_);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_28059_b(Chunk p_28059_1_)
    {
        if(field_28066_d == null)
        {
            return;
        }
        try
        {
            p_28059_1_.field_676_s = field_28063_g.func_22080_k();
            field_28066_d.func_662_a(field_28063_g, p_28059_1_);
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void func_4055_a(IChunkProvider p_4055_1_, int p_4055_2_, int p_4055_3_)
    {
        Chunk chunk = func_363_b(p_4055_2_, p_4055_3_);
        if(!chunk.field_681_n)
        {
            chunk.field_681_n = true;
            if(field_28067_c != null)
            {
                field_28067_c.func_4055_a(p_4055_1_, p_4055_2_, p_4055_3_);
                chunk.func_336_e();
            }
        }
    }

    public boolean func_360_a(boolean p_360_1_, IProgressUpdate p_360_2_)
    {
        int i = 0;
        for(int j = 0; j < field_28064_f.size(); j++)
        {
            Chunk chunk = (Chunk)field_28064_f.get(j);
            if(p_360_1_)
            {
                func_28060_a(chunk);
            }
            if(!chunk.func_347_a(p_360_1_))
            {
                continue;
            }
            func_28059_b(chunk);
            chunk.field_680_o = false;
            if(++i == 24 && !p_360_1_)
            {
                return false;
            }
        }

        if(p_360_1_)
        {
            if(field_28066_d == null)
            {
                return true;
            }
            field_28066_d.func_660_b();
        }
        return true;
    }

    public boolean func_361_a()
    {
        for(int i = 0; i < 100; i++)
        {
            if(!field_28062_a.isEmpty())
            {
                Long long1 = (Long)field_28062_a.iterator().next();
                Chunk chunk1 = (Chunk)field_28065_e.func_677_a(long1.longValue());
                chunk1.func_331_d();
                func_28059_b(chunk1);
                func_28060_a(chunk1);
                field_28062_a.remove(long1);
                field_28065_e.func_670_b(long1.longValue());
                field_28064_f.remove(chunk1);
            }
        }

        for(int j = 0; j < 10; j++)
        {
            if(field_35557_h >= field_28064_f.size())
            {
                field_35557_h = 0;
                break;
            }
            Chunk chunk = (Chunk)field_28064_f.get(field_35557_h++);
            EntityPlayer entityplayer = field_28063_g.func_48087_a((double)(chunk.field_685_j << 4) + 8D, (double)(chunk.field_684_k << 4) + 8D, 288D);
            if(entityplayer == null)
            {
                func_35556_d(chunk.field_685_j, chunk.field_684_k);
            }
        }

        if(field_28066_d != null)
        {
            field_28066_d.func_661_a();
        }
        return field_28067_c.func_361_a();
    }

    public boolean func_364_b()
    {
        return true;
    }

    public List func_40181_a(EnumCreatureType p_40181_1_, int p_40181_2_, int p_40181_3_, int p_40181_4_)
    {
        return field_28067_c.func_40181_a(p_40181_1_, p_40181_2_, p_40181_3_, p_40181_4_);
    }

    public ChunkPosition func_40182_a(World p_40182_1_, String p_40182_2_, int p_40182_3_, int p_40182_4_, int p_40182_5_)
    {
        return field_28067_c.func_40182_a(p_40182_1_, p_40182_2_, p_40182_3_, p_40182_4_, p_40182_5_);
    }
}
