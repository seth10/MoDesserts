// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerAddIsland extends GenLayer
{

    public GenLayerAddIsland(long p_i60_1_, GenLayer p_i60_3_)
    {
        super(p_i60_1_);
        field_35023_a = p_i60_3_;
    }

    public int[] func_35018_a(int p_35018_1_, int p_35018_2_, int p_35018_3_, int p_35018_4_)
    {
        int i = p_35018_1_ - 1;
        int j = p_35018_2_ - 1;
        int k = p_35018_3_ + 2;
        int l = p_35018_4_ + 2;
        int ai[] = field_35023_a.func_35018_a(i, j, k, l);
        int ai1[] = IntCache.func_35549_a(p_35018_3_ * p_35018_4_);
        for(int i1 = 0; i1 < p_35018_4_; i1++)
        {
            for(int j1 = 0; j1 < p_35018_3_; j1++)
            {
                int k1 = ai[j1 + 0 + (i1 + 0) * k];
                int l1 = ai[j1 + 2 + (i1 + 0) * k];
                int i2 = ai[j1 + 0 + (i1 + 2) * k];
                int j2 = ai[j1 + 2 + (i1 + 2) * k];
                int k2 = ai[j1 + 1 + (i1 + 1) * k];
                func_35017_a(j1 + p_35018_1_, i1 + p_35018_2_);
                if(k2 == 0 && (k1 != 0 || l1 != 0 || i2 != 0 || j2 != 0))
                {
                    int l2 = 1;
                    int i3 = 1;
                    if(k1 != 0 && func_35016_a(l2++) == 0)
                    {
                        i3 = k1;
                    }
                    if(l1 != 0 && func_35016_a(l2++) == 0)
                    {
                        i3 = l1;
                    }
                    if(i2 != 0 && func_35016_a(l2++) == 0)
                    {
                        i3 = i2;
                    }
                    if(j2 != 0 && func_35016_a(l2++) == 0)
                    {
                        i3 = j2;
                    }
                    if(func_35016_a(3) == 0)
                    {
                        ai1[j1 + i1 * p_35018_3_] = i3;
                        continue;
                    }
                    if(i3 == BiomeGenBase.field_40462_n.field_35529_y)
                    {
                        ai1[j1 + i1 * p_35018_3_] = BiomeGenBase.field_40464_l.field_35529_y;
                    } else
                    {
                        ai1[j1 + i1 * p_35018_3_] = 0;
                    }
                    continue;
                }
                if(k2 > 0 && (k1 == 0 || l1 == 0 || i2 == 0 || j2 == 0))
                {
                    if(func_35016_a(5) == 0)
                    {
                        if(k2 == BiomeGenBase.field_40462_n.field_35529_y)
                        {
                            ai1[j1 + i1 * p_35018_3_] = BiomeGenBase.field_40464_l.field_35529_y;
                        } else
                        {
                            ai1[j1 + i1 * p_35018_3_] = 0;
                        }
                    } else
                    {
                        ai1[j1 + i1 * p_35018_3_] = k2;
                    }
                } else
                {
                    ai1[j1 + i1 * p_35018_3_] = k2;
                }
            }

        }

        return ai1;
    }
}
