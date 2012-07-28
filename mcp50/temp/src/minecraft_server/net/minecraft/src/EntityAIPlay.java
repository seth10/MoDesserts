// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityVillager, AxisAlignedBB, World, 
//            Entity, RandomPositionGenerator, PathNavigate, Vec3D, 
//            EntityLiving

public class EntityAIPlay extends EntityAIBase
{

    private EntityVillager field_48167_a;
    private EntityLiving field_48165_b;
    private float field_48166_c;
    private int field_48164_d;

    public EntityAIPlay(EntityVillager p_i1018_1_, float p_i1018_2_)
    {
        field_48167_a = p_i1018_1_;
        field_48166_c = p_i1018_2_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        if(field_48167_a.func_48351_J() >= 0)
        {
            return false;
        }
        if(field_48167_a.func_46019_ai().nextInt(400) != 0)
        {
            return false;
        }
        List list = field_48167_a.field_9093_l.func_457_a(net.minecraft.src.EntityVillager.class, field_48167_a.field_312_v.func_708_b(6D, 3D, 6D));
        double d = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Entity entity = (Entity)iterator.next();
            if(entity != field_48167_a)
            {
                EntityVillager entityvillager = (EntityVillager)entity;
                if(!entityvillager.func_48353_E_() && entityvillager.func_48351_J() < 0)
                {
                    double d1 = entityvillager.func_102_b(field_48167_a);
                    if(d1 <= d)
                    {
                        d = d1;
                        field_48165_b = entityvillager;
                    }
                }
            }
        } while(true);
        if(field_48165_b == null)
        {
            Vec3D vec3d = RandomPositionGenerator.func_48396_a(field_48167_a, 16, 3);
            if(vec3d == null)
            {
                return false;
            }
        }
        return true;
    }

    public boolean func_46092_g()
    {
        return field_48164_d > 0;
    }

    public void func_46088_e()
    {
        if(field_48165_b != null)
        {
            field_48167_a.func_48354_b(true);
        }
        field_48164_d = 1000;
    }

    public void func_46085_d()
    {
        field_48167_a.func_48354_b(false);
        field_48165_b = null;
    }

    public void func_46089_b()
    {
        field_48164_d--;
        if(field_48165_b != null)
        {
            if(field_48167_a.func_102_b(field_48165_b) > 4D)
            {
                field_48167_a.func_48333_ak().func_48652_a(field_48165_b, field_48166_c);
            }
        } else
        if(field_48167_a.func_48333_ak().func_46034_b())
        {
            Vec3D vec3d = RandomPositionGenerator.func_48396_a(field_48167_a, 16, 3);
            if(vec3d == null)
            {
                return;
            }
            field_48167_a.func_48333_ak().func_48658_a(vec3d.field_1055_a, vec3d.field_1054_b, vec3d.field_1058_c, field_48166_c);
        }
    }
}
