// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, LongHashMap, EmptyChunk, ChunkCoordIntPair, 
//            WorldServer, WorldProvider, ChunkCoordinates, Chunk, 
//            IChunkLoader, IProgressUpdate, EnumCreatureType, World, 
//            ChunkPosition

public class ChunkProviderServer
    implements IChunkProvider
{

    private Set field_725_a;
    private Chunk field_724_b;
    private IChunkProvider field_730_c;
    private IChunkLoader field_729_d;
    public boolean field_28068_a;
    private LongHashMap field_728_e;
    private List field_727_f;
    private WorldServer field_726_g;

    public ChunkProviderServer(WorldServer p_i265_1_, IChunkLoader p_i265_2_, IChunkProvider p_i265_3_)
    {
        field_725_a = new HashSet();
        field_28068_a = false;
        field_728_e = new LongHashMap();
        field_727_f = new ArrayList();
        field_724_b = new EmptyChunk(p_i265_1_, 0, 0);
        field_726_g = p_i265_1_;
        field_729_d = p_i265_2_;
        field_730_c = p_i265_3_;
    }

    public boolean func_365_a(int p_365_1_, int p_365_2_)
    {
        return field_728_e.func_35508_b(ChunkCoordIntPair.func_22006_a(p_365_1_, p_365_2_));
    }

    public void func_374_c(int p_374_1_, int p_374_2_)
    {
        if(field_726_g.field_4272_q.func_28108_d())
        {
            ChunkCoordinates chunkcoordinates = field_726_g.func_22078_l();
            int i = (p_374_1_ * 16 + 8) - chunkcoordinates.field_22216_a;
            int j = (p_374_2_ * 16 + 8) - chunkcoordinates.field_528_b;
            char c = '\200';
            if(i < -c || i > c || j < -c || j > c)
            {
                field_725_a.add(Long.valueOf(ChunkCoordIntPair.func_22006_a(p_374_1_, p_374_2_)));
            }
        } else
        {
            field_725_a.add(Long.valueOf(ChunkCoordIntPair.func_22006_a(p_374_1_, p_374_2_)));
        }
    }

    public void func_46041_c()
    {
        Chunk chunk;
        for(Iterator iterator = field_727_f.iterator(); iterator.hasNext(); func_374_c(chunk.field_685_j, chunk.field_684_k))
        {
            chunk = (Chunk)iterator.next();
        }

    }

    public Chunk func_376_d(int p_376_1_, int p_376_2_)
    {
        long l = ChunkCoordIntPair.func_22006_a(p_376_1_, p_376_2_);
        field_725_a.remove(Long.valueOf(l));
        Chunk chunk = (Chunk)field_728_e.func_677_a(l);
        if(chunk == null)
        {
            chunk = func_4063_e(p_376_1_, p_376_2_);
            if(chunk == null)
            {
                if(field_730_c == null)
                {
                    chunk = field_724_b;
                } else
                {
                    chunk = field_730_c.func_363_b(p_376_1_, p_376_2_);
                }
            }
            field_728_e.func_675_a(l, chunk);
            field_727_f.add(chunk);
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
        Chunk chunk = (Chunk)field_728_e.func_677_a(ChunkCoordIntPair.func_22006_a(p_363_1_, p_363_2_));
        if(chunk == null)
        {
            if(field_726_g.field_9209_x || field_28068_a)
            {
                return func_376_d(p_363_1_, p_363_2_);
            } else
            {
                return field_724_b;
            }
        } else
        {
            return chunk;
        }
    }

    private Chunk func_4063_e(int p_4063_1_, int p_4063_2_)
    {
        if(field_729_d == null)
        {
            return null;
        }
        try
        {
            Chunk chunk = field_729_d.func_659_a(field_726_g, p_4063_1_, p_4063_2_);
            if(chunk != null)
            {
                chunk.field_676_s = field_726_g.func_22080_k();
            }
            return chunk;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    private void func_375_a(Chunk p_375_1_)
    {
        if(field_729_d == null)
        {
            return;
        }
        try
        {
            field_729_d.func_4104_b(field_726_g, p_375_1_);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_373_b(Chunk p_373_1_)
    {
        if(field_729_d == null)
        {
            return;
        }
        try
        {
            p_373_1_.field_676_s = field_726_g.func_22080_k();
            field_729_d.func_662_a(field_726_g, p_373_1_);
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
            if(field_730_c != null)
            {
                field_730_c.func_4055_a(p_4055_1_, p_4055_2_, p_4055_3_);
                chunk.func_336_e();
            }
        }
    }

    public boolean func_360_a(boolean p_360_1_, IProgressUpdate p_360_2_)
    {
        int i = 0;
        for(int j = 0; j < field_727_f.size(); j++)
        {
            Chunk chunk = (Chunk)field_727_f.get(j);
            if(p_360_1_)
            {
                func_375_a(chunk);
            }
            if(!chunk.func_347_a(p_360_1_))
            {
                continue;
            }
            func_373_b(chunk);
            chunk.field_680_o = false;
            if(++i == 24 && !p_360_1_)
            {
                return false;
            }
        }

        if(p_360_1_)
        {
            if(field_729_d == null)
            {
                return true;
            }
            field_729_d.func_660_b();
        }
        return true;
    }

    public boolean func_361_a()
    {
        if(!field_726_g.field_816_A)
        {
            for(int i = 0; i < 100; i++)
            {
                if(!field_725_a.isEmpty())
                {
                    Long long1 = (Long)field_725_a.iterator().next();
                    Chunk chunk = (Chunk)field_728_e.func_677_a(long1.longValue());
                    chunk.func_331_d();
                    func_373_b(chunk);
                    func_375_a(chunk);
                    field_725_a.remove(long1);
                    field_728_e.func_670_b(long1.longValue());
                    field_727_f.remove(chunk);
                }
            }

            if(field_729_d != null)
            {
                field_729_d.func_661_a();
            }
        }
        return field_730_c.func_361_a();
    }

    public boolean func_364_b()
    {
        return !field_726_g.field_816_A;
    }

    public String func_46040_d()
    {
        return (new StringBuilder()).append("ServerChunkCache: ").append(field_728_e.func_46048_a()).append(" Drop: ").append(field_725_a.size()).toString();
    }

    public List func_40181_a(EnumCreatureType p_40181_1_, int p_40181_2_, int p_40181_3_, int p_40181_4_)
    {
        return field_730_c.func_40181_a(p_40181_1_, p_40181_2_, p_40181_3_, p_40181_4_);
    }

    public ChunkPosition func_40182_a(World p_40182_1_, String p_40182_2_, int p_40182_3_, int p_40182_4_, int p_40182_5_)
    {
        return field_730_c.func_40182_a(p_40182_1_, p_40182_2_, p_40182_3_, p_40182_4_, p_40182_5_);
    }
}
