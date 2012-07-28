// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityTameable, EntityLiving

public class EntityAIOwnerHurtByTarget extends EntityAITarget
{

    EntityTameable field_48294_a;
    EntityLiving field_48293_b;

    public EntityAIOwnerHurtByTarget(EntityTameable p_i1031_1_)
    {
        super(p_i1031_1_, 32F, false);
        field_48294_a = p_i1031_1_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        if(!field_48294_a.func_48373_u_())
        {
            return false;
        }
        EntityLiving entityliving = field_48294_a.func_48368_w_();
        if(entityliving == null)
        {
            return false;
        } else
        {
            field_48293_b = entityliving.func_46020_aj();
            return func_48284_a(field_48293_b, false);
        }
    }

    public void func_46088_e()
    {
        field_48291_c.func_48327_b(field_48293_b);
        super.func_46088_e();
    }
}
