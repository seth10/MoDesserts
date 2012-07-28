// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

public class MathHelper
{

    private static float field_886_a[];

    public MathHelper()
    {
    }

    public static final float func_585_a(float p_585_0_)
    {
        return field_886_a[(int)(p_585_0_ * 10430.38F) & 0xffff];
    }

    public static final float func_582_b(float p_582_0_)
    {
        return field_886_a[(int)(p_582_0_ * 10430.38F + 16384F) & 0xffff];
    }

    public static final float func_586_c(float p_586_0_)
    {
        return (float)Math.sqrt(p_586_0_);
    }

    public static final float func_583_a(double p_583_0_)
    {
        return (float)Math.sqrt(p_583_0_);
    }

    public static int func_588_d(float p_588_0_)
    {
        int i = (int)p_588_0_;
        return p_588_0_ >= (float)i ? i : i - 1;
    }

    public static int func_584_b(double p_584_0_)
    {
        int i = (int)p_584_0_;
        return p_584_0_ >= (double)i ? i : i - 1;
    }

    public static long func_35477_c(double p_35477_0_)
    {
        long l = (long)p_35477_0_;
        return p_35477_0_ >= (double)l ? l : l - 1L;
    }

    public static float func_587_e(float p_587_0_)
    {
        return p_587_0_ < 0.0F ? -p_587_0_ : p_587_0_;
    }

    public static int func_35475_a(int p_35475_0_)
    {
        return p_35475_0_ < 0 ? -p_35475_0_ : p_35475_0_;
    }

    public static int func_41051_a(int p_41051_0_, int p_41051_1_, int p_41051_2_)
    {
        if(p_41051_0_ < p_41051_1_)
        {
            return p_41051_1_;
        }
        if(p_41051_0_ > p_41051_2_)
        {
            return p_41051_2_;
        } else
        {
            return p_41051_0_;
        }
    }

    public static double func_581_a(double p_581_0_, double p_581_2_)
    {
        if(p_581_0_ < 0.0D)
        {
            p_581_0_ = -p_581_0_;
        }
        if(p_581_2_ < 0.0D)
        {
            p_581_2_ = -p_581_2_;
        }
        return p_581_0_ <= p_581_2_ ? p_581_2_ : p_581_0_;
    }

    public static int func_35476_a(Random p_35476_0_, int p_35476_1_, int p_35476_2_)
    {
        if(p_35476_1_ >= p_35476_2_)
        {
            return p_35476_1_;
        } else
        {
            return p_35476_0_.nextInt((p_35476_2_ - p_35476_1_) + 1) + p_35476_1_;
        }
    }

    static 
    {
        field_886_a = new float[0x10000];
        for(int i = 0; i < 0x10000; i++)
        {
            field_886_a[i] = (float)Math.sin(((double)i * 3.1415926535897931D * 2D) / 65536D);
        }

    }
}
