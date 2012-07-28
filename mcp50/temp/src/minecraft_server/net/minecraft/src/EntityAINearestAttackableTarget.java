// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityAINearestAttackableTargetSorter, EntityLiving, EntityPlayer, 
//            World, AxisAlignedBB, Entity

public class EntityAINearestAttackableTarget extends EntityAITarget
{

    EntityLiving field_48298_a;
    Class field_48297_b;
    int field_48295_f;
    private EntityAINearestAttackableTargetSorter field_48296_g;

    public EntityAINearestAttackableTarget(EntityLiving p_i1003_1_, Class p_i1003_2_, float p_i1003_3_, int p_i1003_4_, boolean p_i1003_5_)
    {
        this(p_i1003_1_, p_i1003_2_, p_i1003_3_, p_i1003_4_, p_i1003_5_, false);
    }

    public EntityAINearestAttackableTarget(EntityLiving p_i1004_1_, Class p_i1004_2_, float p_i1004_3_, int p_i1004_4_, boolean p_i1004_5_, boolean p_i1004_6_)
    {
        super(p_i1004_1_, p_i1004_3_, p_i1004_5_, p_i1004_6_);
        field_48297_b = p_i1004_2_;
        field_48288_d = p_i1004_3_;
        field_48295_f = p_i1004_4_;
        field_48296_g = new EntityAINearestAttackableTargetSorter(this, p_i1004_1_);
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
label0:
        {
            if(field_48295_f > 0 && field_48291_c.func_46019_ai().nextInt(field_48295_f) != 0)
            {
                return false;
            }
            if(field_48297_b == (net.minecraft.src.EntityPlayer.class))
            {
                EntityPlayer entityplayer = field_48291_c.field_9093_l.func_40211_b(field_48291_c, field_48288_d);
                if(func_48284_a(entityplayer, false))
                {
                    field_48298_a = entityplayer;
                    return true;
                }
                break label0;
            }
            List list = field_48291_c.field_9093_l.func_457_a(field_48297_b, field_48291_c.field_312_v.func_708_b(field_48288_d, 4D, field_48288_d));
            Collections.sort(list, field_48296_g);
            Iterator iterator = list.iterator();
            EntityLiving entityliving;
            do
            {
                if(!iterator.hasNext())
                {
                    break label0;
                }
                Entity entity = (Entity)iterator.next();
                entityliving = (EntityLiving)entity;
            } while(!func_48284_a(entityliving, false));
            field_48298_a = entityliving;
            return true;
        }
        return false;
    }

    public void func_46088_e()
    {
        field_48291_c.func_48327_b(field_48298_a);
        super.func_46088_e();
    }
}
