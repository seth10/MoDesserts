// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Comparator;

// Referenced classes of package net.minecraft.src:
//            Entity, EntityAINearestAttackableTarget

public class EntityAINearestAttackableTargetSorter
    implements Comparator
{

    private Entity field_48471_b;
    final EntityAINearestAttackableTarget field_48472_a; /* synthetic field */

    public EntityAINearestAttackableTargetSorter(EntityAINearestAttackableTarget p_i1016_1_, Entity p_i1016_2_)
    {
        field_48472_a = p_i1016_1_;
        super();
        field_48471_b = p_i1016_2_;
    }

    public int func_48470_a(Entity p_48470_1_, Entity p_48470_2_)
    {
        double d = field_48471_b.func_102_b(p_48470_1_);
        double d1 = field_48471_b.func_102_b(p_48470_2_);
        if(d < d1)
        {
            return -1;
        }
        return d <= d1 ? 0 : 1;
    }

    public int compare(Object p_compare_1_, Object p_compare_2_)
    {
        return func_48470_a((Entity)p_compare_1_, (Entity)p_compare_2_);
    }
}
