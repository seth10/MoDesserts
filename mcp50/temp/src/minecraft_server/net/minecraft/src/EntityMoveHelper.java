// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving, AxisAlignedBB, MathHelper, EntityJumpHelper

public class EntityMoveHelper
{

    private EntityLiving field_46079_a;
    private double field_46077_b;
    private double field_46078_c;
    private double field_46075_d;
    private float field_46076_e;
    private boolean field_46074_f;

    public EntityMoveHelper(EntityLiving p_i1048_1_)
    {
        field_46074_f = false;
        field_46079_a = p_i1048_1_;
        field_46077_b = p_i1048_1_.field_322_l;
        field_46078_c = p_i1048_1_.field_321_m;
        field_46075_d = p_i1048_1_.field_320_n;
    }

    public boolean func_48438_a()
    {
        return field_46074_f;
    }

    public float func_48436_b()
    {
        return field_46076_e;
    }

    public void func_48439_a(double p_48439_1_, double p_48439_3_, double p_48439_5_, float p_48439_7_)
    {
        field_46077_b = p_48439_1_;
        field_46078_c = p_48439_3_;
        field_46075_d = p_48439_5_;
        field_46076_e = p_48439_7_;
        field_46074_f = true;
    }

    public void func_46072_a()
    {
        field_46079_a.func_46017_d(0.0F);
        if(!field_46074_f)
        {
            return;
        }
        field_46074_f = false;
        int i = MathHelper.func_584_b(field_46079_a.field_312_v.field_963_b + 0.5D);
        double d = field_46077_b - field_46079_a.field_322_l;
        double d1 = field_46075_d - field_46079_a.field_320_n;
        double d2 = field_46078_c - (double)i;
        double d3 = d * d + d2 * d2 + d1 * d1;
        if(d3 < 2.5000002779052011E-07D)
        {
            return;
        }
        float f = (float)((Math.atan2(d1, d) * 180D) / 3.1415927410125732D) - 90F;
        field_46079_a.field_316_r = func_48437_a(field_46079_a.field_316_r, f, 30F);
        field_46079_a.func_48320_d(field_46076_e);
        if(d2 > 0.0D && d * d + d1 * d1 < 1.0D)
        {
            field_46079_a.func_46013_ag().func_46115_a();
        }
    }

    private float func_48437_a(float p_48437_1_, float p_48437_2_, float p_48437_3_)
    {
        float f;
        for(f = p_48437_2_ - p_48437_1_; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        if(f > p_48437_3_)
        {
            f = p_48437_3_;
        }
        if(f < -p_48437_3_)
        {
            f = -p_48437_3_;
        }
        return p_48437_1_ + f;
    }
}
