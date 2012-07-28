// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityAnimal, AxisAlignedBB, World, 
//            Entity, PathNavigate

public class EntityAIFollowParent extends EntityAIBase
{

    EntityAnimal field_48141_a;
    EntityAnimal field_48139_b;
    float field_48140_c;
    private int field_48138_d;

    public EntityAIFollowParent(EntityAnimal p_i1032_1_, float p_i1032_2_)
    {
        field_48141_a = p_i1032_1_;
        field_48140_c = p_i1032_2_;
    }

    public boolean func_46090_a()
    {
        if(field_48141_a.func_48351_J() >= 0)
        {
            return false;
        }
        List list = field_48141_a.field_9093_l.func_457_a(field_48141_a.getClass(), field_48141_a.field_312_v.func_708_b(8D, 4D, 8D));
        EntityAnimal entityanimal = null;
        double d = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Entity entity = (Entity)iterator.next();
            EntityAnimal entityanimal1 = (EntityAnimal)entity;
            if(entityanimal1.func_48351_J() >= 0)
            {
                double d1 = field_48141_a.func_102_b(entityanimal1);
                if(d1 <= d)
                {
                    d = d1;
                    entityanimal = entityanimal1;
                }
            }
        } while(true);
        if(entityanimal == null)
        {
            return false;
        }
        if(d < 9D)
        {
            return false;
        } else
        {
            field_48139_b = entityanimal;
            return true;
        }
    }

    public boolean func_46092_g()
    {
        if(!field_48139_b.func_120_t())
        {
            return false;
        }
        double d = field_48141_a.func_102_b(field_48139_b);
        return d >= 9D && d <= 256D;
    }

    public void func_46088_e()
    {
        field_48138_d = 0;
    }

    public void func_46085_d()
    {
        field_48139_b = null;
    }

    public void func_46089_b()
    {
        if(--field_48138_d > 0)
        {
            return;
        } else
        {
            field_48138_d = 10;
            field_48141_a.func_48333_ak().func_48652_a(field_48139_b, field_48140_c);
            return;
        }
    }
}
