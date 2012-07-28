// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIDoorInteract, EntityLiving, BlockDoor, World

public class EntityAIBreakDoor extends EntityAIDoorInteract
{

    private int field_48194_i;

    public EntityAIBreakDoor(EntityLiving p_i1012_1_)
    {
        super(p_i1012_1_);
    }

    public boolean func_46090_a()
    {
        if(!super.func_46090_a())
        {
            return false;
        } else
        {
            return !field_48189_e.func_48135_d(field_48192_a.field_9093_l, field_48190_b, field_48191_c, field_48188_d);
        }
    }

    public void func_46088_e()
    {
        super.func_46088_e();
        field_48194_i = 240;
    }

    public boolean func_46092_g()
    {
        double d = field_48192_a.func_101_d(field_48190_b, field_48191_c, field_48188_d);
        return field_48194_i >= 0 && !field_48189_e.func_48135_d(field_48192_a.field_9093_l, field_48190_b, field_48191_c, field_48188_d) && d < 4D;
    }

    public void func_46089_b()
    {
        super.func_46089_b();
        if(field_48192_a.func_46019_ai().nextInt(20) == 0)
        {
            field_48192_a.field_9093_l.func_28097_e(1010, field_48190_b, field_48191_c, field_48188_d, 0);
        }
        if(--field_48194_i == 0 && field_48192_a.field_9093_l.field_804_l == 3)
        {
            field_48192_a.field_9093_l.func_508_d(field_48190_b, field_48191_c, field_48188_d, 0);
            field_48192_a.field_9093_l.func_28097_e(1012, field_48190_b, field_48191_c, field_48188_d, 0);
            field_48192_a.field_9093_l.func_28097_e(2001, field_48190_b, field_48191_c, field_48188_d, field_48189_e.field_573_bc);
        }
    }
}
