// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, EntityJumpHelper

public class EntityAISwimming extends EntityAIBase
{

    private EntityLiving field_46105_a;

    public EntityAISwimming(EntityLiving p_i500_1_)
    {
        field_46105_a = p_i500_1_;
        func_46087_a(4);
        p_i500_1_.func_48333_ak().func_48660_e(true);
    }

    public boolean func_46090_a()
    {
        return field_46105_a.func_27011_Z() || field_46105_a.func_112_q();
    }

    public void func_46089_b()
    {
        if(field_46105_a.func_46019_ai().nextFloat() < 0.8F)
        {
            field_46105_a.func_46013_ag().func_46115_a();
        }
    }
}
