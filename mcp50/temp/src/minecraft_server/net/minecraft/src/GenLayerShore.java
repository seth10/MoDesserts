// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerShore extends GenLayer
{

    public GenLayerShore(long p_i212_1_, GenLayer p_i212_3_)
    {
        super(p_i212_1_);
        field_35023_a = p_i212_3_;
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
                if(k == BiomeGenBase.field_40467_p.field_35529_y)
                {
                    int l = ai[j + 1 + ((i + 1) - 1) * (p_35018_3_ + 2)];
                    int k1 = ai[j + 1 + 1 + (i + 1) * (p_35018_3_ + 2)];
                    int j2 = ai[((j + 1) - 1) + (i + 1) * (p_35018_3_ + 2)];
                    int i3 = ai[j + 1 + (i + 1 + 1) * (p_35018_3_ + 2)];
                    if(l == BiomeGenBase.field_35519_b.field_35529_y || k1 == BiomeGenBase.field_35519_b.field_35529_y || j2 == BiomeGenBase.field_35519_b.field_35529_y || i3 == BiomeGenBase.field_35519_b.field_35529_y)
                    {
                        ai1[j + i * p_35018_3_] = BiomeGenBase.field_40466_q.field_35529_y;
                    } else
                    {
                        ai1[j + i * p_35018_3_] = k;
                    }
                    continue;
                }
                if(k != BiomeGenBase.field_35519_b.field_35529_y && k != BiomeGenBase.field_35522_i.field_35529_y && k != BiomeGenBase.field_4299_b.field_35529_y && k != BiomeGenBase.field_35518_e.field_35529_y)
                {
                    int i1 = ai[j + 1 + ((i + 1) - 1) * (p_35018_3_ + 2)];
                    int l1 = ai[j + 1 + 1 + (i + 1) * (p_35018_3_ + 2)];
                    int k2 = ai[((j + 1) - 1) + (i + 1) * (p_35018_3_ + 2)];
                    int j3 = ai[j + 1 + (i + 1 + 1) * (p_35018_3_ + 2)];
                    if(i1 == BiomeGenBase.field_35519_b.field_35529_y || l1 == BiomeGenBase.field_35519_b.field_35529_y || k2 == BiomeGenBase.field_35519_b.field_35529_y || j3 == BiomeGenBase.field_35519_b.field_35529_y)
                    {
                        ai1[j + i * p_35018_3_] = BiomeGenBase.field_46084_r.field_35529_y;
                    } else
                    {
                        ai1[j + i * p_35018_3_] = k;
                    }
                    continue;
                }
                if(k == BiomeGenBase.field_35518_e.field_35529_y)
                {
                    int j1 = ai[j + 1 + ((i + 1) - 1) * (p_35018_3_ + 2)];
                    int i2 = ai[j + 1 + 1 + (i + 1) * (p_35018_3_ + 2)];
                    int l2 = ai[((j + 1) - 1) + (i + 1) * (p_35018_3_ + 2)];
                    int k3 = ai[j + 1 + (i + 1 + 1) * (p_35018_3_ + 2)];
                    if(j1 != BiomeGenBase.field_35518_e.field_35529_y || i2 != BiomeGenBase.field_35518_e.field_35529_y || l2 != BiomeGenBase.field_35518_e.field_35529_y || k3 != BiomeGenBase.field_35518_e.field_35529_y)
                    {
                        ai1[j + i * p_35018_3_] = BiomeGenBase.field_46080_v.field_35529_y;
                    } else
                    {
                        ai1[j + i * p_35018_3_] = k;
                    }
                } else
                {
                    ai1[j + i * p_35018_3_] = k;
                }
            }

        }

        return ai1;
    }
}
