// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityIronGolem, Village, EntityLiving

public class EntityAIDefendVillage extends EntityAITarget
{

    EntityIronGolem field_48302_a;
    EntityLiving field_48301_b;

    public EntityAIDefendVillage(EntityIronGolem p_i1050_1_)
    {
        super(p_i1050_1_, 16F, false, true);
        field_48302_a = p_i1050_1_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        Village village = field_48302_a.func_48380_l_();
        if(village == null)
        {
            return false;
        } else
        {
            field_48301_b = village.func_48534_b(field_48302_a);
            return func_48284_a(field_48301_b, false);
        }
    }

    public void func_46088_e()
    {
        field_48302_a.func_48327_b(field_48301_b);
        super.func_46088_e();
    }
}
