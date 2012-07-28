// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;

// Referenced classes of package net.minecraft.src:
//            Profiler, EntityLiving, Entity

public class EntitySenses
{

    EntityLiving field_48550_a;
    ArrayList field_48548_b;
    ArrayList field_48549_c;

    public EntitySenses(EntityLiving p_i1051_1_)
    {
        field_48548_b = new ArrayList();
        field_48549_c = new ArrayList();
        field_48550_a = p_i1051_1_;
    }

    public void func_48547_a()
    {
        field_48548_b.clear();
        field_48549_c.clear();
    }

    public boolean func_48546_a(Entity p_48546_1_)
    {
        if(field_48548_b.contains(p_48546_1_))
        {
            return true;
        }
        if(field_48549_c.contains(p_48546_1_))
        {
            return false;
        }
        Profiler.func_40518_a("canSee");
        boolean flag = field_48550_a.func_145_g(p_48546_1_);
        Profiler.func_40517_a();
        if(flag)
        {
            field_48548_b.add(p_48546_1_);
        } else
        {
            field_48549_c.add(p_48546_1_);
        }
        return flag;
    }
}
