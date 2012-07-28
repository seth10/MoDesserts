// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerSwampRivers extends GenLayer
{

    public GenLayerSwampRivers(long p_i513_1_, GenLayer p_i513_3_)
    {
        super(p_i513_1_);
        field_35023_a = p_i513_3_;
    }

    public int[] func_35018_a(int p_35018_1_, int p_35018_2_, int p_35018_3_, int p_35018_4_)
    {
        int ai[] = field_35023_a.func_35018_a(p_35018_1_ - 1, p_35018_2_ - 1, p_35018_3_ + 2, p_35018_4_ + 2);
        int ai1[] = IntCache.func_35549_a(p_35018_3_ * p_35018_4_);
        for(int i = 0; i < p_35018_4_; i++)
        {
            for(int j = 0; j < p_35018_3_; j++)
            {
                func_35017_a(j + p_35018_1_, i + p_35018_2_);
                int k = ai[j + 1 + (i + 1) * (p_35018_3_ + 2)];
                if(k == BiomeGenBase.field_4299_b.field_35529_y && func_35016_a(6) == 0)
                {
                    ai1[j + i * p_35018_3_] = BiomeGenBase.field_35522_i.field_35529_y;
                    continue;
                }
                if((k == BiomeGenBase.field_48443_w.field_35529_y || k == BiomeGenBase.field_48444_x.field_35529_y) && func_35016_a(8) == 0)
                {
                    ai1[j + i * p_35018_3_] = BiomeGenBase.field_35522_i.field_35529_y;
                } else
                {
                    ai1[j + i * p_35018_3_] = k;
                }
            }

        }

        return ai1;
    }
}
