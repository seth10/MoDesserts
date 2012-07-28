// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, EntityLookHelper

public class EntityAILookIdle extends EntityAIBase
{

    private EntityLiving field_46114_a;
    private double field_46112_b;
    private double field_46113_c;
    private int field_46111_d;

    public EntityAILookIdle(EntityLiving p_i35_1_)
    {
        field_46111_d = 0;
        field_46114_a = p_i35_1_;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        return field_46114_a.func_46019_ai().nextFloat() < 0.02F;
    }

    public boolean func_46092_g()
    {
        return field_46111_d >= 0;
    }

    public void func_46088_e()
    {
        double d = 6.2831853071795862D * field_46114_a.func_46019_ai().nextDouble();
        field_46112_b = Math.cos(d);
        field_46113_c = Math.sin(d);
        field_46111_d = 20 + field_46114_a.func_46019_ai().nextInt(20);
    }

    public void func_46089_b()
    {
        field_46111_d--;
        field_46114_a.func_46021_ae().func_46060_a(field_46114_a.field_322_l + field_46112_b, field_46114_a.field_321_m + (double)field_46114_a.func_104_p(), field_46114_a.field_320_n + field_46113_c, 10F, field_46114_a.func_25018_n_());
    }
}
