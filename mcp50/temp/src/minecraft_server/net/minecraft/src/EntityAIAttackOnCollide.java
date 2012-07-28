// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, MathHelper, 
//            EntityLookHelper, EntitySenses, AxisAlignedBB, World, 
//            PathEntity

public class EntityAIAttackOnCollide extends EntityAIBase
{

    World field_46099_a;
    EntityLiving field_48156_b;
    EntityLiving field_46098_c;
    int field_46095_d;
    float field_48155_e;
    boolean field_48153_f;
    PathEntity field_48154_g;
    Class field_48157_h;
    private int field_48158_i;

    public EntityAIAttackOnCollide(EntityLiving p_i1009_1_, Class p_i1009_2_, float p_i1009_3_, boolean p_i1009_4_)
    {
        this(p_i1009_1_, p_i1009_3_, p_i1009_4_);
        field_48157_h = p_i1009_2_;
    }

    public EntityAIAttackOnCollide(EntityLiving p_i1010_1_, float p_i1010_2_, boolean p_i1010_3_)
    {
        field_46095_d = 0;
        field_48156_b = p_i1010_1_;
        field_46099_a = p_i1010_1_.field_9093_l;
        field_48155_e = p_i1010_2_;
        field_48153_f = p_i1010_3_;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        EntityLiving entityliving = field_48156_b.func_48331_as();
        if(entityliving == null)
        {
            return false;
        }
        if(field_48157_h != null && !field_48157_h.isAssignableFrom(entityliving.getClass()))
        {
            return false;
        } else
        {
            field_46098_c = entityliving;
            field_48154_g = field_48156_b.func_48333_ak().func_48661_a(field_46098_c);
            return field_48154_g != null;
        }
    }

    public boolean func_46092_g()
    {
        EntityLiving entityliving = field_48156_b.func_48331_as();
        if(entityliving == null)
        {
            return false;
        }
        if(!field_46098_c.func_120_t())
        {
            return false;
        }
        if(!field_48153_f)
        {
            return !field_48156_b.func_48333_ak().func_46034_b();
        }
        return field_48156_b.func_48328_e(MathHelper.func_584_b(field_46098_c.field_322_l), MathHelper.func_584_b(field_46098_c.field_321_m), MathHelper.func_584_b(field_46098_c.field_320_n));
    }

    public void func_46088_e()
    {
        field_48156_b.func_48333_ak().func_48647_a(field_48154_g, field_48155_e);
        field_48158_i = 0;
    }

    public void func_46085_d()
    {
        field_46098_c = null;
        field_48156_b.func_48333_ak().func_48662_f();
    }

    public void func_46089_b()
    {
        field_48156_b.func_46021_ae().func_46058_a(field_46098_c, 30F, 30F);
        if((field_48153_f || field_48156_b.func_48318_al().func_48546_a(field_46098_c)) && --field_48158_i <= 0)
        {
            field_48158_i = 4 + field_48156_b.func_46019_ai().nextInt(7);
            field_48156_b.func_48333_ak().func_48652_a(field_46098_c, field_48155_e);
        }
        field_46095_d = Math.max(field_46095_d - 1, 0);
        double d = field_48156_b.field_300_D * 2.0F * (field_48156_b.field_300_D * 2.0F);
        if(field_48156_b.func_101_d(field_46098_c.field_322_l, field_46098_c.field_312_v.field_963_b, field_46098_c.field_320_n) > d)
        {
            return;
        }
        if(field_46095_d > 0)
        {
            return;
        } else
        {
            field_46095_d = 20;
            field_48156_b.func_35224_c(field_46098_c);
            return;
        }
    }
}
