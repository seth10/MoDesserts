// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityThrowable, MovingObjectPosition, EntityBlaze, DamageSource, 
//            Entity, World, EntityLiving

public class EntitySnowball extends EntityThrowable
{

    public EntitySnowball(World p_i54_1_)
    {
        super(p_i54_1_);
    }

    public EntitySnowball(World p_i55_1_, EntityLiving p_i55_2_)
    {
        super(p_i55_1_, p_i55_2_);
    }

    public EntitySnowball(World p_i56_1_, double p_i56_2_, double p_i56_4_, double p_i56_6_)
    {
        super(p_i56_1_, p_i56_2_, p_i56_4_, p_i56_6_);
    }

    protected void func_40041_a(MovingObjectPosition p_40041_1_)
    {
        if(p_40041_1_.field_928_g != null)
        {
            byte byte0 = 0;
            if(p_40041_1_.field_928_g instanceof EntityBlaze)
            {
                byte0 = 3;
            }
            if(!p_40041_1_.field_928_g.func_121_a(DamageSource.func_35081_a(this, field_40050_c), byte0));
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
