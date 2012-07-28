// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, AxisAlignedBB, 
//            EntitySenses, EntityLookHelper, EntityArrow, World, 
//            EntitySnowball, MathHelper

public class EntityAIArrowAttack extends EntityAIBase
{

    World field_48183_a;
    EntityLiving field_48181_b;
    EntityLiving field_48182_c;
    int field_48179_d;
    float field_48180_e;
    int field_48177_f;
    int field_48178_g;
    int field_48184_h;

    public EntityAIArrowAttack(EntityLiving p_i1005_1_, float p_i1005_2_, int p_i1005_3_, int p_i1005_4_)
    {
        field_48179_d = 0;
        field_48177_f = 0;
        field_48181_b = p_i1005_1_;
        field_48183_a = p_i1005_1_.field_9093_l;
        field_48180_e = p_i1005_2_;
        field_48178_g = p_i1005_3_;
        field_48184_h = p_i1005_4_;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        EntityLiving entityliving = field_48181_b.func_48331_as();
        if(entityliving == null)
        {
            return false;
        } else
        {
            field_48182_c = entityliving;
            return true;
        }
    }

    public boolean func_46092_g()
    {
        return func_46090_a() || !field_48181_b.func_48333_ak().func_46034_b();
    }

    public void func_46085_d()
    {
        field_48182_c = null;
    }

    public void func_46089_b()
    {
        double d = 100D;
        double d1 = field_48181_b.func_101_d(field_48182_c.field_322_l, field_48182_c.field_312_v.field_963_b, field_48182_c.field_320_n);
        boolean flag = field_48181_b.func_48318_al().func_48546_a(field_48182_c);
        if(flag)
        {
            field_48177_f++;
        } else
        {
            field_48177_f = 0;
        }
        if(d1 > d || field_48177_f < 20)
        {
            field_48181_b.func_48333_ak().func_48652_a(field_48182_c, field_48180_e);
        } else
        {
            field_48181_b.func_48333_ak().func_48662_f();
        }
        field_48181_b.func_46021_ae().func_46058_a(field_48182_c, 30F, 30F);
        field_48179_d = Math.max(field_48179_d - 1, 0);
        if(field_48179_d > 0)
        {
            return;
        }
        if(d1 > d || !flag)
        {
            return;
        } else
        {
            func_48176_f();
            field_48179_d = field_48184_h;
            return;
        }
    }

    private void func_48176_f()
    {
        if(field_48178_g == 1)
        {
            EntityArrow entityarrow = new EntityArrow(field_48183_a, field_48181_b, field_48182_c, 1.6F, 12F);
            field_48183_a.func_506_a(field_48181_b, "random.bow", 1.0F, 1.0F / (field_48181_b.func_46019_ai().nextFloat() * 0.4F + 0.8F));
            field_48183_a.func_526_a(entityarrow);
        } else
        if(field_48178_g == 2)
        {
            EntitySnowball entitysnowball = new EntitySnowball(field_48183_a, field_48181_b);
            double d = field_48182_c.field_322_l - field_48181_b.field_322_l;
            double d1 = (field_48182_c.field_321_m + (double)field_48182_c.func_104_p()) - 1.1000000238418579D - entitysnowball.field_321_m;
            double d2 = field_48182_c.field_320_n - field_48181_b.field_320_n;
            float f = MathHelper.func_583_a(d * d + d2 * d2) * 0.2F;
            entitysnowball.func_40043_a(d, d1 + (double)f, d2, 1.6F, 12F);
            field_48183_a.func_506_a(field_48181_b, "random.bow", 1.0F, 1.0F / (field_48181_b.func_46019_ai().nextFloat() * 0.4F + 0.8F));
            field_48183_a.func_526_a(entitysnowball);
        }
    }
}
