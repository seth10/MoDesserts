// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, EntitySenses, AxisAlignedBB, 
//            EntityTameable, EntityPlayer, PlayerCapabilities, MathHelper, 
//            PathNavigate, PathEntity, PathPoint

public abstract class EntityAITarget extends EntityAIBase
{

    protected EntityLiving field_48291_c;
    protected float field_48288_d;
    protected boolean field_48289_e;
    private boolean field_48292_a;
    private int field_48290_b;
    private int field_48286_f;
    private int field_48287_g;

    public EntityAITarget(EntityLiving p_i1093_1_, float p_i1093_2_, boolean p_i1093_3_)
    {
        this(p_i1093_1_, p_i1093_2_, p_i1093_3_, false);
    }

    public EntityAITarget(EntityLiving p_i1094_1_, float p_i1094_2_, boolean p_i1094_3_, boolean p_i1094_4_)
    {
        field_48290_b = 0;
        field_48286_f = 0;
        field_48287_g = 0;
        field_48291_c = p_i1094_1_;
        field_48288_d = p_i1094_2_;
        field_48289_e = p_i1094_3_;
        field_48292_a = p_i1094_4_;
    }

    public boolean func_46092_g()
    {
        EntityLiving entityliving = field_48291_c.func_48331_as();
        if(entityliving == null)
        {
            return false;
        }
        if(!entityliving.func_120_t())
        {
            return false;
        }
        if(field_48291_c.func_102_b(entityliving) > (double)(field_48288_d * field_48288_d))
        {
            return false;
        }
        if(field_48289_e)
        {
            if(!field_48291_c.func_48318_al().func_48546_a(entityliving))
            {
                if(++field_48287_g > 60)
                {
                    return false;
                }
            } else
            {
                field_48287_g = 0;
            }
        }
        return true;
    }

    public void func_46088_e()
    {
        field_48290_b = 0;
        field_48286_f = 0;
        field_48287_g = 0;
    }

    public void func_46085_d()
    {
        field_48291_c.func_48327_b(null);
    }

    protected boolean func_48284_a(EntityLiving p_48284_1_, boolean p_48284_2_)
    {
        if(p_48284_1_ == null)
        {
            return false;
        }
        if(p_48284_1_ == field_48291_c)
        {
            return false;
        }
        if(!p_48284_1_.func_120_t())
        {
            return false;
        }
        if(p_48284_1_.field_312_v.field_968_e <= field_48291_c.field_312_v.field_963_b || p_48284_1_.field_312_v.field_963_b >= field_48291_c.field_312_v.field_968_e)
        {
            return false;
        }
        if(!field_48291_c.func_48336_a(p_48284_1_.getClass()))
        {
            return false;
        }
        if((field_48291_c instanceof EntityTameable) && ((EntityTameable)field_48291_c).func_48373_u_())
        {
            if((p_48284_1_ instanceof EntityTameable) && ((EntityTameable)p_48284_1_).func_48373_u_())
            {
                return false;
            }
            if(p_48284_1_ == ((EntityTameable)field_48291_c).func_48368_w_())
            {
                return false;
            }
        } else
        if((p_48284_1_ instanceof EntityPlayer) && !p_48284_2_ && ((EntityPlayer)p_48284_1_).field_35214_K.field_35660_a)
        {
            return false;
        }
        if(!field_48291_c.func_48328_e(MathHelper.func_584_b(p_48284_1_.field_322_l), MathHelper.func_584_b(p_48284_1_.field_321_m), MathHelper.func_584_b(p_48284_1_.field_320_n)))
        {
            return false;
        }
        if(field_48289_e && !field_48291_c.func_48318_al().func_48546_a(p_48284_1_))
        {
            return false;
        }
        if(field_48292_a)
        {
            if(--field_48286_f <= 0)
            {
                field_48290_b = 0;
            }
            if(field_48290_b == 0)
            {
                field_48290_b = func_48285_a(p_48284_1_) ? 1 : 2;
            }
            if(field_48290_b == 2)
            {
                return false;
            }
        }
        return true;
    }

    private boolean func_48285_a(EntityLiving p_48285_1_)
    {
        field_48286_f = 10 + field_48291_c.func_46019_ai().nextInt(5);
        PathEntity pathentity = field_48291_c.func_48333_ak().func_48661_a(p_48285_1_);
        if(pathentity == null)
        {
            return false;
        }
        PathPoint pathpoint = pathentity.func_48425_c();
        if(pathpoint == null)
        {
            return false;
        } else
        {
            int i = pathpoint.field_1016_a - MathHelper.func_584_b(p_48285_1_.field_322_l);
            int j = pathpoint.field_1014_c - MathHelper.func_584_b(p_48285_1_.field_320_n);
            return (double)(i * i + j * j) <= 2.25D;
        }
    }
}
