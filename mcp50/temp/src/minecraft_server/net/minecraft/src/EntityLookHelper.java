// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, EntityLiving, AxisAlignedBB, MathHelper, 
//            PathNavigate

public class EntityLookHelper
{

    private EntityLiving field_46068_a;
    private float field_46066_b;
    private float field_46067_c;
    private boolean field_46064_d;
    private double field_46065_e;
    private double field_46062_f;
    private double field_46063_g;

    public EntityLookHelper(EntityLiving p_i98_1_)
    {
        field_46064_d = false;
        field_46068_a = p_i98_1_;
    }

    public void func_46058_a(Entity p_46058_1_, float p_46058_2_, float p_46058_3_)
    {
        field_46065_e = p_46058_1_.field_322_l;
        if(p_46058_1_ instanceof EntityLiving)
        {
            field_46062_f = p_46058_1_.field_321_m + (double)((EntityLiving)p_46058_1_).func_104_p();
        } else
        {
            field_46062_f = (p_46058_1_.field_312_v.field_963_b + p_46058_1_.field_312_v.field_968_e) / 2D;
        }
        field_46063_g = p_46058_1_.field_320_n;
        field_46066_b = p_46058_2_;
        field_46067_c = p_46058_3_;
        field_46064_d = true;
    }

    public void func_46060_a(double p_46060_1_, double p_46060_3_, double p_46060_5_, float p_46060_7_, 
            float p_46060_8_)
    {
        field_46065_e = p_46060_1_;
        field_46062_f = p_46060_3_;
        field_46063_g = p_46060_5_;
        field_46066_b = p_46060_7_;
        field_46067_c = p_46060_8_;
        field_46064_d = true;
    }

    public void func_46059_a()
    {
        field_46068_a.field_315_s = 0.0F;
        if(field_46064_d)
        {
            field_46064_d = false;
            double d = field_46065_e - field_46068_a.field_322_l;
            double d1 = field_46062_f - (field_46068_a.field_321_m + (double)field_46068_a.func_104_p());
            double d2 = field_46063_g - field_46068_a.field_320_n;
            double d3 = MathHelper.func_583_a(d * d + d2 * d2);
            float f1 = (float)((Math.atan2(d2, d) * 180D) / 3.1415927410125732D) - 90F;
            float f2 = (float)(-((Math.atan2(d1, d3) * 180D) / 3.1415927410125732D));
            field_46068_a.field_315_s = func_46061_a(field_46068_a.field_315_s, f2, field_46067_c);
            field_46068_a.field_46027_X = func_46061_a(field_46068_a.field_46027_X, f1, field_46066_b);
        } else
        {
            field_46068_a.field_46027_X = func_46061_a(field_46068_a.field_46027_X, field_46068_a.field_9095_az, 10F);
        }
        float f;
        for(f = field_46068_a.field_46027_X - field_46068_a.field_9095_az; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        if(!field_46068_a.func_48333_ak().func_46034_b())
        {
            if(f < -75F)
            {
                field_46068_a.field_46027_X = field_46068_a.field_9095_az - 75F;
            }
            if(f > 75F)
            {
                field_46068_a.field_46027_X = field_46068_a.field_9095_az + 75F;
            }
        }
    }

    private float func_46061_a(float p_46061_1_, float p_46061_2_, float p_46061_3_)
    {
        float f;
        for(f = p_46061_2_ - p_46061_1_; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        if(f > p_46061_3_)
        {
            f = p_46061_3_;
        }
        if(f < -p_46061_3_)
        {
            f = -p_46061_3_;
        }
        return p_46061_1_ + f;
    }
}
