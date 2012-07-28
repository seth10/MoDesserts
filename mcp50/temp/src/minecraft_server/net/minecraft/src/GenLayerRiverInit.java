// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache

public class GenLayerRiverInit extends GenLayer
{

    public GenLayerRiverInit(long p_i313_1_, GenLayer p_i313_3_)
    {
        super(p_i313_1_);
        field_35023_a = p_i313_3_;
    }

    public int[] func_35018_a(int p_35018_1_, int p_35018_2_, int p_35018_3_, int p_35018_4_)
    {
        int ai[] = field_35023_a.func_35018_a(p_35018_1_, p_35018_2_, p_35018_3_, p_35018_4_);
        int ai1[] = IntCache.func_35549_a(p_35018_3_ * p_35018_4_);
        for(int i = 0; i < p_35018_4_; i++)
        {
            for(int j = 0; j < p_35018_3_; j++)
            {
                func_35017_a(j + p_35018_1_, i + p_35018_2_);
                ai1[j + i * p_35018_3_] = ai[j + i * p_35018_3_] <= 0 ? 0 : func_35016_a(2) + 2;
            }

        }

        return ai1;
    }
}
