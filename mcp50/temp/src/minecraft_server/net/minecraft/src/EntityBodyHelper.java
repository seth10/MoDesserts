// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving

public class EntityBodyHelper
{

    private EntityLiving field_48435_a;
    private int field_48433_b;
    private float field_48434_c;

    public EntityBodyHelper(EntityLiving p_i1021_1_)
    {
        field_48433_b = 0;
        field_48434_c = 0.0F;
        field_48435_a = p_i1021_1_;
    }

    public void func_48431_a()
    {
        double d = field_48435_a.field_322_l - field_48435_a.field_9092_m;
        double d1 = field_48435_a.field_320_n - field_48435_a.field_9090_o;
        if(d * d + d1 * d1 > 2.5000002779052011E-07D)
        {
            field_48435_a.field_9095_az = field_48435_a.field_316_r;
            field_48435_a.field_46027_X = func_48432_a(field_48435_a.field_9095_az, field_48435_a.field_46027_X, 75F);
            field_48434_c = field_48435_a.field_46027_X;
            field_48433_b = 0;
            return;
        }
        float f = 75F;
        if(Math.abs(field_48435_a.field_46027_X - field_48434_c) > 15F)
        {
            field_48433_b = 0;
            field_48434_c = field_48435_a.field_46027_X;
        } else
        {
            field_48433_b++;
            if(field_48433_b > 10)
            {
                f = Math.max(1.0F - (float)(field_48433_b - 10) / 10F, 0.0F) * 75F;
            }
        }
        field_48435_a.field_9095_az = func_48432_a(field_48435_a.field_46027_X, field_48435_a.field_9095_az, f);
    }

    private float func_48432_a(float p_48432_1_, float p_48432_2_, float p_48432_3_)
    {
        float f;
        for(f = p_48432_1_ - p_48432_2_; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        if(f < -p_48432_3_)
        {
            f = -p_48432_3_;
        }
        if(f >= p_48432_3_)
        {
            f = p_48432_3_;
        }
        return p_48432_1_ - f;
    }
}
