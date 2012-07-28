// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving

public class EntityJumpHelper
{

    private EntityLiving field_46118_a;
    private boolean field_46117_b;

    public EntityJumpHelper(EntityLiving p_i341_1_)
    {
        field_46117_b = false;
        field_46118_a = p_i341_1_;
    }

    public void func_46115_a()
    {
        field_46117_b = true;
    }

    public void func_46116_b()
    {
        field_46118_a.func_46014_e(field_46117_b);
        field_46117_b = false;
    }
}
