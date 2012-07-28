// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, EntityLookHelper, 
//            AxisAlignedBB, World

public class EntityAIOcelotAttack extends EntityAIBase
{

    World field_48171_a;
    EntityLiving field_48169_b;
    EntityLiving field_48170_c;
    int field_48168_d;

    public EntityAIOcelotAttack(EntityLiving p_i1017_1_)
    {
        field_48168_d = 0;
        field_48169_b = p_i1017_1_;
        field_48171_a = p_i1017_1_.field_9093_l;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        EntityLiving entityliving = field_48169_b.func_48331_as();
        if(entityliving == null)
        {
            return false;
        } else
        {
            field_48170_c = entityliving;
            return true;
        }
    }

    public boolean func_46092_g()
    {
        if(!field_48170_c.func_120_t())
        {
            return false;
        }
        if(field_48169_b.func_102_b(field_48170_c) > 225D)
        {
            return false;
        } else
        {
            return !field_48169_b.func_48333_ak().func_46034_b() || func_46090_a();
        }
    }

    public void func_46085_d()
    {
        field_48170_c = null;
        field_48169_b.func_48333_ak().func_48662_f();
    }

    public void func_46089_b()
    {
        field_48169_b.func_46021_ae().func_46058_a(field_48170_c, 30F, 30F);
        double d = field_48169_b.field_300_D * 2.0F * (field_48169_b.field_300_D * 2.0F);
        double d1 = field_48169_b.func_101_d(field_48170_c.field_322_l, field_48170_c.field_312_v.field_963_b, field_48170_c.field_320_n);
        float f = 0.23F;
        if(d1 > d && d1 < 16D)
        {
            f = 0.4F;
        } else
        if(d1 < 225D)
        {
            f = 0.18F;
        }
        field_48169_b.func_48333_ak().func_48652_a(field_48170_c, f);
        field_48168_d = Math.max(field_48168_d - 1, 0);
        if(d1 > d)
        {
            return;
        }
        if(field_48168_d > 0)
        {
            return;
        } else
        {
            field_48168_d = 20;
            field_48169_b.func_35224_c(field_48170_c);
            return;
        }
    }
}
