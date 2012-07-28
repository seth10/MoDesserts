// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityLiving, AxisAlignedBB, World, 
//            Entity

public class EntityAIHurtByTarget extends EntityAITarget
{

    boolean field_48300_a;

    public EntityAIHurtByTarget(EntityLiving p_i1047_1_, boolean p_i1047_2_)
    {
        super(p_i1047_1_, 16F, false);
        field_48300_a = p_i1047_2_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        return func_48284_a(field_48291_c.func_46020_aj(), true);
    }

    public void func_46088_e()
    {
        field_48291_c.func_48327_b(field_48291_c.func_46020_aj());
        if(field_48300_a)
        {
            List list = field_48291_c.field_9093_l.func_457_a(field_48291_c.getClass(), AxisAlignedBB.func_693_b(field_48291_c.field_322_l, field_48291_c.field_321_m, field_48291_c.field_320_n, field_48291_c.field_322_l + 1.0D, field_48291_c.field_321_m + 1.0D, field_48291_c.field_320_n + 1.0D).func_708_b(field_48288_d, 4D, field_48288_d));
            Iterator iterator = list.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                Entity entity = (Entity)iterator.next();
                EntityLiving entityliving = (EntityLiving)entity;
                if(field_48291_c != entityliving && entityliving.func_48331_as() == null)
                {
                    entityliving.func_48327_b(field_48291_c.func_46020_aj());
                }
            } while(true);
        }
        super.func_46088_e();
    }
}
