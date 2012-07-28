// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityIronGolem, World, EntityVillager, 
//            AxisAlignedBB, EntityLookHelper

public class EntityAILookAtVillager extends EntityAIBase
{

    private EntityIronGolem field_48226_a;
    private EntityVillager field_48224_b;
    private int field_48225_c;

    public EntityAILookAtVillager(EntityIronGolem p_i1036_1_)
    {
        field_48226_a = p_i1036_1_;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        if(!field_48226_a.field_9093_l.func_453_a())
        {
            return false;
        }
        if(field_48226_a.func_46019_ai().nextInt(8000) != 0)
        {
            return false;
        } else
        {
            field_48224_b = (EntityVillager)field_48226_a.field_9093_l.func_48085_a(net.minecraft.src.EntityVillager.class, field_48226_a.field_312_v.func_708_b(6D, 2D, 6D), field_48226_a);
            return field_48224_b != null;
        }
    }

    public boolean func_46092_g()
    {
        return field_48225_c > 0;
    }

    public void func_46088_e()
    {
        field_48225_c = 400;
        field_48226_a.func_48383_a(true);
    }

    public void func_46085_d()
    {
        field_48226_a.func_48383_a(false);
        field_48224_b = null;
    }

    public void func_46089_b()
    {
        field_48226_a.func_46021_ae().func_46058_a(field_48224_b, 30F, 30F);
        field_48225_c--;
    }
}
