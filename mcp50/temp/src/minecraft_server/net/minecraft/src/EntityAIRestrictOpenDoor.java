// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, MathHelper, 
//            VillageCollection, Village, VillageDoorInfo, PathNavigate

public class EntityAIRestrictOpenDoor extends EntityAIBase
{

    private EntityCreature field_48160_a;
    private VillageDoorInfo field_48159_b;

    public EntityAIRestrictOpenDoor(EntityCreature p_i1011_1_)
    {
        field_48160_a = p_i1011_1_;
    }

    public boolean func_46090_a()
    {
        if(field_48160_a.field_9093_l.func_453_a())
        {
            return false;
        }
        Village village = field_48160_a.field_9093_l.field_48096_A.func_48632_a(MathHelper.func_584_b(field_48160_a.field_322_l), MathHelper.func_584_b(field_48160_a.field_321_m), MathHelper.func_584_b(field_48160_a.field_320_n), 16);
        if(village == null)
        {
            return false;
        }
        field_48159_b = village.func_48533_b(MathHelper.func_584_b(field_48160_a.field_322_l), MathHelper.func_584_b(field_48160_a.field_321_m), MathHelper.func_584_b(field_48160_a.field_320_n));
        if(field_48159_b == null)
        {
            return false;
        } else
        {
            return (double)field_48159_b.func_48486_b(MathHelper.func_584_b(field_48160_a.field_322_l), MathHelper.func_584_b(field_48160_a.field_321_m), MathHelper.func_584_b(field_48160_a.field_320_n)) < 2.25D;
        }
    }

    public boolean func_46092_g()
    {
        if(field_48160_a.field_9093_l.func_453_a())
        {
            return false;
        } else
        {
            return !field_48159_b.field_48488_g && field_48159_b.func_48479_a(MathHelper.func_584_b(field_48160_a.field_322_l), MathHelper.func_584_b(field_48160_a.field_320_n));
        }
    }

    public void func_46088_e()
    {
        field_48160_a.func_48333_ak().func_48663_b(false);
        field_48160_a.func_48333_ak().func_48655_c(false);
    }

    public void func_46085_d()
    {
        field_48160_a.func_48333_ak().func_48663_b(true);
        field_48160_a.func_48333_ak().func_48655_c(true);
        field_48159_b = null;
    }

    public void func_46089_b()
    {
        field_48159_b.func_48482_e();
    }
}
