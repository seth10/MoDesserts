// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityThrowable, MovingObjectPosition, DamageSource, Entity, 
//            World, EntityLiving

public class EntityEnderPearl extends EntityThrowable
{

    public EntityEnderPearl(World p_i324_1_)
    {
        super(p_i324_1_);
    }

    public EntityEnderPearl(World p_i325_1_, EntityLiving p_i325_2_)
    {
        super(p_i325_1_, p_i325_2_);
    }

    public EntityEnderPearl(World p_i326_1_, double p_i326_2_, double p_i326_4_, double p_i326_6_)
    {
        super(p_i326_1_, p_i326_2_, p_i326_4_, p_i326_6_);
    }

    protected void func_40041_a(MovingObjectPosition p_40041_1_)
    {
        if(p_40041_1_.field_928_g != null)
        {
            if(!p_40041_1_.field_928_g.func_121_a(DamageSource.func_35081_a(this, field_40050_c), 0));
        }
        for(int i = 0; i < 32; i++)
        {
            field_9093_l.func_514_a("portal", field_322_l, field_321_m + field_9064_W.nextDouble() * 2D, field_320_n, field_9064_W.nextGaussian(), 0.0D, field_9064_W.nextGaussian());
        }

        if(!field_9093_l.field_792_x)
        {
            if(field_40050_c != null)
            {
                field_40050_c.func_40098_a_(field_322_l, field_321_m, field_320_n);
                field_40050_c.field_9072_N = 0.0F;
                field_40050_c.func_121_a(DamageSource.field_35098_h, 5);
            }
            func_118_j();
        }
    }
}
