// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, EntityPlayer, World, 
//            AxisAlignedBB, Entity, EntityLookHelper

public class EntityAIWatchClosest extends EntityAIBase
{

    private EntityLiving field_46110_a;
    private Entity field_48242_b;
    private float field_46106_d;
    private int field_46107_e;
    private float field_48241_e;
    private Class field_48240_f;

    public EntityAIWatchClosest(EntityLiving p_i1076_1_, Class p_i1076_2_, float p_i1076_3_)
    {
        field_46110_a = p_i1076_1_;
        field_48240_f = p_i1076_2_;
        field_46106_d = p_i1076_3_;
        field_48241_e = 0.02F;
        func_46087_a(2);
    }

    public EntityAIWatchClosest(EntityLiving p_i1077_1_, Class p_i1077_2_, float p_i1077_3_, float p_i1077_4_)
    {
        field_46110_a = p_i1077_1_;
        field_48240_f = p_i1077_2_;
        field_46106_d = p_i1077_3_;
        field_48241_e = p_i1077_4_;
        func_46087_a(2);
    }

    public boolean func_46090_a()
    {
        if(field_46110_a.func_46019_ai().nextFloat() >= field_48241_e)
        {
            return false;
        }
        if(field_48240_f == (net.minecraft.src.EntityPlayer.class))
        {
            field_48242_b = field_46110_a.field_9093_l.func_472_a(field_46110_a, field_46106_d);
        } else
        {
            field_48242_b = field_46110_a.field_9093_l.func_48085_a(field_48240_f, field_46110_a.field_312_v.func_708_b(field_46106_d, 3D, field_46106_d), field_46110_a);
        }
        return field_48242_b != null;
    }

    public boolean func_46092_g()
    {
        if(!field_48242_b.func_120_t())
        {
            return false;
        }
        if(field_46110_a.func_102_b(field_48242_b) > (double)(field_46106_d * field_46106_d))
        {
            return false;
        } else
        {
            return field_46107_e > 0;
        }
    }

    public void func_46088_e()
    {
        field_46107_e = 40 + field_46110_a.func_46019_ai().nextInt(40);
    }

    public void func_46085_d()
    {
        field_48242_b = null;
    }

    public void func_46089_b()
    {
        field_46110_a.func_46021_ae().func_46060_a(field_48242_b.field_322_l, field_48242_b.field_321_m + (double)field_48242_b.func_104_p(), field_48242_b.field_320_n, 10F, field_46110_a.func_25018_n_());
        field_46107_e--;
    }
}
