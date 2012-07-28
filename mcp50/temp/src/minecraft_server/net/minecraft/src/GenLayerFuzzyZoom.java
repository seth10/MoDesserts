// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache

public class GenLayerFuzzyZoom extends GenLayer
{

    public GenLayerFuzzyZoom(long p_i566_1_, GenLayer p_i566_3_)
    {
        super(p_i566_1_);
        super.field_35023_a = p_i566_3_;
    }

    public int[] func_35018_a(int p_35018_1_, int p_35018_2_, int p_35018_3_, int p_35018_4_)
    {
        int i = p_35018_1_ >> 1;
        int j = p_35018_2_ >> 1;
        int k = (p_35018_3_ >> 1) + 3;
        int l = (p_35018_4_ >> 1) + 3;
        int ai[] = field_35023_a.func_35018_a(i, j, k, l);
        int ai1[] = IntCache.func_35549_a(k * 2 * (l * 2));
        int i1 = k << 1;
        for(int j1 = 0; j1 < l - 1; j1++)
        {
            int k1 = j1 << 1;
            int i2 = k1 * i1;
            int j2 = ai[0 + (j1 + 0) * k];
            int k2 = ai[0 + (j1 + 1) * k];
            for(int l2 = 0; l2 < k - 1; l2++)
            {
                func_35017_a(l2 + i << 1, j1 + j << 1);
                int i3 = ai[l2 + 1 + (j1 + 0) * k];
                int j3 = ai[l2 + 1 + (j1 + 1) * k];
                ai1[i2] = j2;
                ai1[i2++ + i1] = func_35032_a(j2, k2);
                ai1[i2] = func_35032_a(j2, i3);
                ai1[i2++ + i1] = func_35031_b(j2, i3, k2, j3);
                j2 = i3;
                k2 = j3;
            }

        }

        int ai2[] = IntCache.func_35549_a(p_35018_3_ * p_35018_4_);
        for(int l1 = 0; l1 < p_35018_4_; l1++)
        {
            System.arraycopy(ai1, (l1 + (p_35018_2_ & 1)) * (k << 1) + (p_35018_1_ & 1), ai2, l1 * p_35018_3_, p_35018_3_);
        }

        return ai2;
    }

    protected int func_35032_a(int p_35032_1_, int p_35032_2_)
    {
        return func_35016_a(2) != 0 ? p_35032_2_ : p_35032_1_;
    }

    protected int func_35031_b(int p_35031_1_, int p_35031_2_, int p_35031_3_, int p_35031_4_)
    {
        int i = func_35016_a(4);
        if(i == 0)
        {
            return p_35031_1_;
        }
        if(i == 1)
        {
            return p_35031_2_;
        }
        if(i == 2)
        {
            return p_35031_3_;
        } else
        {
            return p_35031_4_;
        }
    }
}
