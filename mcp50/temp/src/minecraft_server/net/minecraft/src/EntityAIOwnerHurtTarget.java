// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityTameable, EntityLiving

public class EntityAIOwnerHurtTarget extends EntityAITarget
{

    EntityTameable field_48304_a;
    EntityLiving field_48303_b;

    public EntityAIOwnerHurtTarget(EntityTameable p_i1035_1_)
    {
        super(p_i1035_1_, 32F, false);
        field_48304_a = p_i1035_1_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        if(!field_48304_a.func_48373_u_())
        {
            return false;
        }
        EntityLiving entityliving = field_48304_a.func_48368_w_();
        if(entityliving == null)
        {
            return false;
        } else
        {
            field_48303_b = entityliving.func_48324_ao();
            return func_48284_a(field_48303_b, false);
        }
    }

    public void func_46088_e()
    {
        field_48291_c.func_48327_b(field_48303_b);
        super.func_46088_e();
    }
}
