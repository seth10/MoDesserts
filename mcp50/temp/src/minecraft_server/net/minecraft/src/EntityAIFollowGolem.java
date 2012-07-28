// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityVillager, World, EntityIronGolem, 
//            AxisAlignedBB, Entity, PathNavigate, EntityLookHelper

public class EntityAIFollowGolem extends EntityAIBase
{

    private EntityVillager field_48216_a;
    private EntityIronGolem field_48214_b;
    private int field_48215_c;
    private boolean field_48213_d;

    public EntityAIFollowGolem(EntityVillager p_i1037_1_)
    {
        field_48213_d = false;
        field_48216_a = p_i1037_1_;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        if(field_48216_a.func_48351_J() >= 0)
        {
            return false;
        }
        if(!field_48216_a.field_9093_l.func_453_a())
        {
            return false;
        }
        List list = field_48216_a.field_9093_l.func_457_a(net.minecraft.src.EntityIronGolem.class, field_48216_a.field_312_v.func_708_b(6D, 2D, 6D));
        if(list.size() == 0)
        {
            return false;
        }
        Iterator iterator = list.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Entity entity = (Entity)iterator.next();
            EntityIronGolem entityirongolem = (EntityIronGolem)entity;
            if(entityirongolem.func_48382_m_() <= 0)
            {
                continue;
            }
            field_48214_b = entityirongolem;
            break;
        } while(true);
        return field_48214_b != null;
    }

    public boolean func_46092_g()
    {
        return field_48214_b.func_48382_m_() > 0;
    }

    public void func_46088_e()
    {
        field_48215_c = field_48216_a.func_46019_ai().nextInt(320);
        field_48213_d = false;
        field_48214_b.func_48333_ak().func_48662_f();
    }

    public void func_46085_d()
    {
        field_48214_b = null;
        field_48216_a.func_48333_ak().func_48662_f();
    }

    public void func_46089_b()
    {
        field_48216_a.func_46021_ae().func_46058_a(field_48214_b, 30F, 30F);
        if(field_48214_b.func_48382_m_() == field_48215_c)
        {
            field_48216_a.func_48333_ak().func_48652_a(field_48214_b, 0.15F);
            field_48213_d = true;
        }
        if(field_48213_d && field_48216_a.func_102_b(field_48214_b) < 4D)
        {
            field_48214_b.func_48383_a(false);
            field_48216_a.func_48333_ak().func_48662_f();
        }
    }
}
