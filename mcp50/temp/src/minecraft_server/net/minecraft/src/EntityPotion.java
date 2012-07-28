// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            EntityThrowable, World, Item, ItemPotion, 
//            AxisAlignedBB, EntityLiving, Entity, MovingObjectPosition, 
//            PotionEffect, Potion

public class EntityPotion extends EntityThrowable
{

    private int field_40055_d;

    public EntityPotion(World p_i42_1_)
    {
        super(p_i42_1_);
    }

    public EntityPotion(World p_i43_1_, EntityLiving p_i43_2_, int p_i43_3_)
    {
        super(p_i43_1_, p_i43_2_);
        field_40055_d = p_i43_3_;
    }

    public EntityPotion(World p_i44_1_, double p_i44_2_, double p_i44_4_, double p_i44_6_, 
            int p_i44_8_)
    {
        super(p_i44_1_, p_i44_2_, p_i44_4_, p_i44_6_);
        field_40055_d = p_i44_8_;
    }

    protected float func_40042_e()
    {
        return 0.05F;
    }

    protected float func_40044_c()
    {
        return 0.5F;
    }

    protected float func_40040_d()
    {
        return -20F;
    }

    public int func_40054_n_()
    {
        return field_40055_d;
    }

    protected void func_40041_a(MovingObjectPosition p_40041_1_)
    {
        if(!field_9093_l.field_792_x)
        {
            List list = Item.field_40238_bq.func_40255_b(field_40055_d);
            if(list != null && !list.isEmpty())
            {
                AxisAlignedBB axisalignedbb = field_312_v.func_708_b(4D, 2D, 4D);
                List list1 = field_9093_l.func_457_a(net.minecraft.src.EntityLiving.class, axisalignedbb);
                if(list1 != null && !list1.isEmpty())
                {
                    for(Iterator iterator = list1.iterator(); iterator.hasNext();)
                    {
                        Entity entity = (Entity)iterator.next();
                        double d = func_102_b(entity);
                        if(d < 16D)
                        {
                            double d1 = 1.0D - Math.sqrt(d) / 4D;
                            if(entity == p_40041_1_.field_928_g)
                            {
                                d1 = 1.0D;
                            }
                            Iterator iterator1 = list.iterator();
                            while(iterator1.hasNext()) 
                            {
                                PotionEffect potioneffect = (PotionEffect)iterator1.next();
                                int i = potioneffect.func_35649_a();
                                if(Potion.field_35455_a[i].func_40595_b())
                                {
                                    Potion.field_35455_a[i].func_40588_a(field_40050_c, (EntityLiving)entity, potioneffect.func_35652_c(), d1);
                                } else
                                {
                                    int j = (int)(d1 * (double)potioneffect.func_35653_b() + 0.5D);
                                    if(j > 20)
                                    {
                                        ((EntityLiving)entity).func_35182_d(new PotionEffect(i, j, potioneffect.func_35652_c()));
                                    }
                                }
                            }
                        }
                    }

                }
            }
            field_9093_l.func_28097_e(2002, (int)Math.round(field_322_l), (int)Math.round(field_321_m), (int)Math.round(field_320_n), field_40055_d);
            func_118_j();
        }
    }
}
