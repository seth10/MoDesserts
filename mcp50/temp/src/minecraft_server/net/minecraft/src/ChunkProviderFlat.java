// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, MapGenVillage, Block, BlockGrass, 
//            Chunk, World, WorldChunkManager, BiomeGenBase, 
//            IProgressUpdate, EnumCreatureType, ChunkPosition

public class ChunkProviderFlat
    implements IChunkProvider
{

    private World field_46046_a;
    private Random field_46044_b;
    private final boolean field_46045_c;
    private MapGenVillage field_46043_d;

    public ChunkProviderFlat(World p_i162_1_, long p_i162_2_, boolean p_i162_4_)
    {
        field_46043_d = new MapGenVillage(1);
        field_46046_a = p_i162_1_;
        field_46045_c = p_i162_4_;
        field_46044_b = new Random(p_i162_2_);
    }

    private void func_46042_a(byte p_46042_1_[])
    {
        int i = p_46042_1_.length / 256;
        for(int j = 0; j < 16; j++)
        {
            for(int k = 0; k < 16; k++)
            {
                for(int l = 0; l < i; l++)
                {
                    int i1 = 0;
                    if(l == 0)
                    {
                        i1 = Block.field_4064_A.field_573_bc;
                    } else
                    if(l <= 2)
                    {
                        i1 = Block.field_533_w.field_573_bc;
                    } else
                    if(l == 3)
                    {
                        i1 = Block.field_534_v.field_573_bc;
                    }
                    p_46042_1_[j << 11 | k << 7 | l] = (byte)i1;
                }

            }

        }

    }

    public Chunk func_376_d(int p_376_1_, int p_376_2_)
    {
        return func_363_b(p_376_1_, p_376_2_);
    }

    public Chunk func_363_b(int p_363_1_, int p_363_2_)
    {
        byte abyte0[] = new byte[32768];
        func_46042_a(abyte0);
        Chunk chunk = new Chunk(field_46046_a, abyte0, p_363_1_, p_363_2_);
        if(field_46045_c)
        {
            field_46043_d.func_667_a(this, field_46046_a, p_363_1_, p_363_2_, abyte0);
        }
        BiomeGenBase abiomegenbase[] = field_46046_a.func_4077_a().func_4064_a(null, p_363_1_ * 16, p_363_2_ * 16, 16, 16);
        byte abyte1[] = chunk.func_48552_l();
        for(int i = 0; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)abiomegenbase[i].field_35529_y;
        }

        chunk.func_353_b();
        return chunk;
    }

    public boolean func_365_a(int p_365_1_, int p_365_2_)
    {
        return true;
    }

    public void func_4055_a(IChunkProvider p_4055_1_, int p_4055_2_, int p_4055_3_)
    {
        field_46044_b.setSeed(field_46046_a.func_22079_j());
        long l = (field_46044_b.nextLong() / 2L) * 2L + 1L;
        long l1 = (field_46044_b.nextLong() / 2L) * 2L + 1L;
        field_46044_b.setSeed((long)p_4055_2_ * l + (long)p_4055_3_ * l1 ^ field_46046_a.func_22079_j());
        if(field_46045_c)
        {
            field_46043_d.func_35532_a(field_46046_a, field_46044_b, p_4055_2_, p_4055_3_);
        }
    }

    public boolean func_360_a(boolean p_360_1_, IProgressUpdate p_360_2_)
    {
        return true;
    }

    public boolean func_361_a()
    {
        return false;
    }

    public boolean func_364_b()
    {
        return true;
    }

    public List func_40181_a(EnumCreatureType p_40181_1_, int p_40181_2_, int p_40181_3_, int p_40181_4_)
    {
        BiomeGenBase biomegenbase = field_46046_a.func_48091_a(p_40181_2_, p_40181_4_);
        if(biomegenbase == null)
        {
            return null;
        } else
        {
            return biomegenbase.func_25055_a(p_40181_1_);
        }
    }

    public ChunkPosition func_40182_a(World p_40182_1_, String p_40182_2_, int p_40182_3_, int i, int j)
    {
        return null;
    }
}
