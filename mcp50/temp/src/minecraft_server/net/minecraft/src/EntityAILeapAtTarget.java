// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, MathHelper

public class EntityAILeapAtTarget extends EntityAIBase
{

    EntityLiving field_48163_a;
    EntityLiving field_48161_b;
    float field_48162_c;

    public EntityAILeapAtTarget(EntityLiving p_i1020_1_, float p_i1020_2_)
    {
        field_48163_a = p_i1020_1_;
        field_48162_c = p_i1020_2_;
        func_46087_a(5);
    }

    public boolean func_46090_a()
    {
        field_48161_b = field_48163_a.func_48331_as();
        if(field_48161_b == null)
        {
            return false;
        }
        double d = field_48163_a.func_102_b(field_48161_b);
        if(d < 4D || d > 16D)
        {
            return false;
        }
        if(!field_48163_a.field_9086_A)
        {
            return false;
        }
        return field_48163_a.func_46019_ai().nextInt(5) == 0;
    }

    public boolean func_46092_g()
    {
        return !field_48163_a.field_9086_A;
    }

    public void func_46088_e()
    {
        double d = field_48161_b.field_322_l - field_48163_a.field_322_l;
        double d1 = field_48161_b.field_320_n - field_48163_a.field_320_n;
        float f = MathHelper.func_583_a(d * d + d1 * d1);
        field_48163_a.field_319_o += (d / (double)f) * 0.5D * 0.80000001192092896D + field_48163_a.field_319_o * 0.20000000298023224D;
        field_48163_a.field_317_q += (d1 / (double)f) * 0.5D * 0.80000001192092896D + field_48163_a.field_317_q * 0.20000000298023224D;
        field_48163_a.field_318_p = field_48162_c;
    }
}
