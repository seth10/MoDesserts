// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityThrowable, MovingObjectPosition, DamageSource, Entity, 
//            World, EntityChicken, EntityLiving

public class EntityEgg extends EntityThrowable
{

    public EntityEgg(World p_i535_1_)
    {
        super(p_i535_1_);
    }

    public EntityEgg(World p_i536_1_, EntityLiving p_i536_2_)
    {
        super(p_i536_1_, p_i536_2_);
    }

    public EntityEgg(World p_i537_1_, double p_i537_2_, double p_i537_4_, double p_i537_6_)
    {
        super(p_i537_1_, p_i537_2_, p_i537_4_, p_i537_6_);
    }

    protected void func_40041_a(MovingObjectPosition p_40041_1_)
    {
        if(p_40041_1_.field_928_g != null)
        {
            if(!p_40041_1_.field_928_g.func_121_a(DamageSource.func_35081_a(this, field_40050_c), 0));
        }
        if(!field_9093_l.field_792_x && field_9064_W.nextInt(8) == 0)
        {
            byte byte0 = 1;
            if(field_9064_W.nextInt(32) == 0)
            {
                byte0 = 4;
            }
            for(int j = 0; j < byte0; j++)
            {
                EntityChicken entitychicken = new EntityChicken(field_9093_l);
                entitychicken.func_48350_c(-24000);
                entitychicken.func_107_c(field_322_l, field_321_m, field_320_n, field_316_r, 0.0F);
                field_9093_l.func_526_a(entitychicken);
            }

        }
        for(int i = 0; i < 8; i++)
        {
            field_9093_l.func_514_a("snowballpoof", field_322_l, field_321_m, field_320_n, 0.0D, 0.0D, 0.0D);
        }

        if(!field_9093_l.field_792_x)
        {
            func_118_j();
        }
    }
}
