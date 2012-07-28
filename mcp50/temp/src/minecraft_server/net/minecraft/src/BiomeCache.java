// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            LongHashMap, BiomeCacheBlock, WorldChunkManager, BiomeGenBase

public class BiomeCache
{

    private final WorldChunkManager field_35687_a;
    private long field_35685_b;
    private LongHashMap field_35686_c;
    private List field_35684_d;

    public BiomeCache(WorldChunkManager p_i506_1_)
    {
        field_35685_b = 0L;
        field_35686_c = new LongHashMap();
        field_35684_d = new ArrayList();
        field_35687_a = p_i506_1_;
    }

    public BiomeCacheBlock func_35680_c(int p_35680_1_, int p_35680_2_)
    {
        p_35680_1_ >>= 4;
        p_35680_2_ >>= 4;
        long l = (long)p_35680_1_ & 0xffffffffL | ((long)p_35680_2_ & 0xffffffffL) << 32;
        BiomeCacheBlock biomecacheblock = (BiomeCacheBlock)field_35686_c.func_677_a(l);
        if(biomecacheblock == null)
        {
            biomecacheblock = new BiomeCacheBlock(this, p_35680_1_, p_35680_2_);
            field_35686_c.func_675_a(l, biomecacheblock);
            field_35684_d.add(biomecacheblock);
        }
        biomecacheblock.field_35701_f = System.currentTimeMillis();
        return biomecacheblock;
    }

    public BiomeGenBase func_35683_a(int p_35683_1_, int p_35683_2_)
    {
        return func_35680_c(p_35683_1_, p_35683_2_).func_35700_a(p_35683_1_, p_35683_2_);
    }

    public void func_35681_a()
    {
        long l = System.currentTimeMillis();
        long l1 = l - field_35685_b;
        if(l1 > 7500L || l1 < 0L)
        {
            field_35685_b = l;
            for(int i = 0; i < field_35684_d.size(); i++)
            {
                BiomeCacheBlock biomecacheblock = (BiomeCacheBlock)field_35684_d.get(i);
                long l2 = l - biomecacheblock.field_35701_f;
                if(l2 > 30000L || l2 < 0L)
                {
                    field_35684_d.remove(i--);
                    long l3 = (long)biomecacheblock.field_35703_d & 0xffffffffL | ((long)biomecacheblock.field_35704_e & 0xffffffffL) << 32;
                    field_35686_c.func_670_b(l3);
                }
            }

        }
    }

    public BiomeGenBase[] func_35682_b(int p_35682_1_, int p_35682_2_)
    {
        return func_35680_c(p_35682_1_, p_35682_2_).field_35706_c;
    }

    static WorldChunkManager func_35679_a(BiomeCache p_35679_0_)
    {
        return p_35679_0_.field_35687_a;
    }
}
