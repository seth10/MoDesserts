// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityThrowable, World, EntityXPOrb, EntityLiving, 
//            MovingObjectPosition

public class EntityExpBottle extends EntityThrowable
{

    public EntityExpBottle(World p_i1052_1_)
    {
        super(p_i1052_1_);
    }

    public EntityExpBottle(World p_i1053_1_, EntityLiving p_i1053_2_)
    {
        super(p_i1053_1_, p_i1053_2_);
    }

    public EntityExpBottle(World p_i1054_1_, double p_i1054_2_, double p_i1054_4_, double p_i1054_6_)
    {
        super(p_i1054_1_, p_i1054_2_, p_i1054_4_, p_i1054_6_);
    }

    protected float func_40042_e()
    {
        return 0.07F;
    }

    protected float func_40044_c()
    {
        return 0.7F;
    }

    protected float func_40040_d()
    {
        return -20F;
    }

    protected void func_40041_a(MovingObjectPosition p_40041_1_)
    {
        if(!field_9093_l.field_792_x)
        {
            field_9093_l.func_28097_e(2002, (int)Math.round(field_322_l), (int)Math.round(field_321_m), (int)Math.round(field_320_n), 0);
            for(int i = 3 + field_9093_l.field_803_m.nextInt(5) + field_9093_l.field_803_m.nextInt(5); i > 0;)
            {
                int j = EntityXPOrb.func_35152_b(i);
                i -= j;
                field_9093_l.func_526_a(new EntityXPOrb(field_9093_l, field_322_l, field_321_m, field_320_n, j));
            }

            func_118_j();
        }
    }
}
