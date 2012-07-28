// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, BiomeGenBase, WorldType, IntCache

public class GenLayerBiome extends GenLayer
{

    private BiomeGenBase field_35029_b[];

    public GenLayerBiome(long p_i1078_1_, GenLayer p_i1078_3_, WorldType p_i1078_4_)
    {
        super(p_i1078_1_);
        field_35029_b = (new BiomeGenBase[] {
            BiomeGenBase.field_4293_h, BiomeGenBase.field_4297_d, BiomeGenBase.field_35518_e, BiomeGenBase.field_4299_b, BiomeGenBase.field_35520_c, BiomeGenBase.field_4294_g, BiomeGenBase.field_48443_w
        });
        field_35023_a = p_i1078_3_;
        if(p_i1078_4_ == WorldType.field_48456_d)
        {
            field_35029_b = (new BiomeGenBase[] {
                BiomeGenBase.field_4293_h, BiomeGenBase.field_4297_d, BiomeGenBase.field_35518_e, BiomeGenBase.field_4299_b, BiomeGenBase.field_35520_c, BiomeGenBase.field_4294_g
            });
        }
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
                int k = ai[j + i * p_35018_3_];
                if(k == 0)
                {
                    ai1[j + i * p_35018_3_] = 0;
                    continue;
                }
                if(k == BiomeGenBase.field_40467_p.field_35529_y)
                {
                    ai1[j + i * p_35018_3_] = k;
                    continue;
                }
                if(k == 1)
                {
                    ai1[j + i * p_35018_3_] = field_35029_b[func_35016_a(field_35029_b.length)].field_35529_y;
                } else
                {
                    ai1[j + i * p_35018_3_] = BiomeGenBase.field_40462_n.field_35529_y;
                }
            }

        }

        return ai1;
    }
}
