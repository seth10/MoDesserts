// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerHills extends GenLayer
{

    public GenLayerHills(long p_i17_1_, GenLayer p_i17_3_)
    {
        super(p_i17_1_);
        field_35023_a = p_i17_3_;
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
                if(func_35016_a(3) == 0)
                {
                    int l = k;
                    if(k == BiomeGenBase.field_4293_h.field_35529_y)
                    {
                        l = BiomeGenBase.field_46083_s.field_35529_y;
                    } else
                    if(k == BiomeGenBase.field_4297_d.field_35529_y)
                    {
                        l = BiomeGenBase.field_46082_t.field_35529_y;
                    } else
                    if(k == BiomeGenBase.field_4294_g.field_35529_y)
                    {
                        l = BiomeGenBase.field_46081_u.field_35529_y;
                    } else
                    if(k == BiomeGenBase.field_35520_c.field_35529_y)
                    {
                        l = BiomeGenBase.field_4297_d.field_35529_y;
                    } else
                    if(k == BiomeGenBase.field_40462_n.field_35529_y)
                    {
                        l = BiomeGenBase.field_40463_o.field_35529_y;
                    } else
                    if(k == BiomeGenBase.field_48443_w.field_35529_y)
                    {
                        l = BiomeGenBase.field_48444_x.field_35529_y;
                    }
                    if(l != k)
                    {
                        int i1 = ai[j + 1 + ((i + 1) - 1) * (p_35018_3_ + 2)];
                        int j1 = ai[j + 1 + 1 + (i + 1) * (p_35018_3_ + 2)];
                        int k1 = ai[((j + 1) - 1) + (i + 1) * (p_35018_3_ + 2)];
                        int l1 = ai[j + 1 + (i + 1 + 1) * (p_35018_3_ + 2)];
                        if(i1 == k && j1 == k && k1 == k && l1 == k)
                        {
                            ai1[j + i * p_35018_3_] = l;
                        } else
                        {
                            ai1[j + i * p_35018_3_] = k;
                        }
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
