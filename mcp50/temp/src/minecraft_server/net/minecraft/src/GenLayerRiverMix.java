// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerRiverMix extends GenLayer
{

    private GenLayer field_35033_b;
    private GenLayer field_35034_c;

    public GenLayerRiverMix(long p_i558_1_, GenLayer p_i558_3_, GenLayer p_i558_4_)
    {
        super(p_i558_1_);
        field_35033_b = p_i558_3_;
        field_35034_c = p_i558_4_;
    }

    public void func_35015_b(long p_35015_1_)
    {
        field_35033_b.func_35015_b(p_35015_1_);
        field_35034_c.func_35015_b(p_35015_1_);
        super.func_35015_b(p_35015_1_);
    }

    public int[] func_35018_a(int p_35018_1_, int p_35018_2_, int p_35018_3_, int p_35018_4_)
    {
        int ai[] = field_35033_b.func_35018_a(p_35018_1_, p_35018_2_, p_35018_3_, p_35018_4_);
        int ai1[] = field_35034_c.func_35018_a(p_35018_1_, p_35018_2_, p_35018_3_, p_35018_4_);
        int ai2[] = IntCache.func_35549_a(p_35018_3_ * p_35018_4_);
        for(int i = 0; i < p_35018_3_ * p_35018_4_; i++)
        {
            if(ai[i] == BiomeGenBase.field_35519_b.field_35529_y)
            {
                ai2[i] = ai[i];
                continue;
            }
            if(ai1[i] >= 0)
            {
                if(ai[i] == BiomeGenBase.field_40462_n.field_35529_y)
                {
                    ai2[i] = BiomeGenBase.field_40465_m.field_35529_y;
                    continue;
                }
                if(ai[i] == BiomeGenBase.field_40467_p.field_35529_y || ai[i] == BiomeGenBase.field_40466_q.field_35529_y)
                {
                    ai2[i] = BiomeGenBase.field_40466_q.field_35529_y;
                } else
                {
                    ai2[i] = ai1[i];
                }
            } else
            {
                ai2[i] = ai[i];
            }
        }

        return ai2;
    }
}
