// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            NoiseGenerator, NoiseGeneratorPerlin, MathHelper

public class NoiseGeneratorOctaves extends NoiseGenerator
{

    private NoiseGeneratorPerlin field_939_a[];
    private int field_938_b;

    public NoiseGeneratorOctaves(Random p_i477_1_, int p_i477_2_)
    {
        field_938_b = p_i477_2_;
        field_939_a = new NoiseGeneratorPerlin[p_i477_2_];
        for(int i = 0; i < p_i477_2_; i++)
        {
            field_939_a[i] = new NoiseGeneratorPerlin(p_i477_1_);
        }

    }

    public double[] func_648_a(double p_648_1_[], int p_648_2_, int p_648_3_, int p_648_4_, int p_648_5_, int p_648_6_, int p_648_7_, 
            double p_648_8_, double p_648_10_, double p_648_12_)
    {
        if(p_648_1_ == null)
        {
            p_648_1_ = new double[p_648_5_ * p_648_6_ * p_648_7_];
        } else
        {
            for(int i = 0; i < p_648_1_.length; i++)
            {
                p_648_1_[i] = 0.0D;
            }

        }
        double d = 1.0D;
        for(int j = 0; j < field_938_b; j++)
        {
            double d1 = (double)p_648_2_ * d * p_648_8_;
            double d2 = (double)p_648_3_ * d * p_648_10_;
            double d3 = (double)p_648_4_ * d * p_648_12_;
            long l = MathHelper.func_35477_c(d1);
            long l1 = MathHelper.func_35477_c(d3);
            d1 -= l;
            d3 -= l1;
            l %= 0x1000000L;
            l1 %= 0x1000000L;
            d1 += l;
            d3 += l1;
            field_939_a[j].func_646_a(p_648_1_, d1, d2, d3, p_648_5_, p_648_6_, p_648_7_, p_648_8_ * d, p_648_10_ * d, p_648_12_ * d, d);
            d /= 2D;
        }

        return p_648_1_;
    }

    public double[] func_4103_a(double p_4103_1_[], int p_4103_2_, int p_4103_3_, int p_4103_4_, int p_4103_5_, double p_4103_6_, 
            double p_4103_8_, double p_4103_10_)
    {
        return func_648_a(p_4103_1_, p_4103_2_, 10, p_4103_3_, p_4103_4_, 1, p_4103_5_, p_4103_6_, 1.0D, p_4103_8_);
    }
}
