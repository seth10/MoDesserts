// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public abstract class EntityAIBase
{

    private int field_46093_a;

    public EntityAIBase()
    {
        field_46093_a = 0;
    }

    public abstract boolean func_46090_a();

    public boolean func_46092_g()
    {
        return func_46090_a();
    }

    public boolean func_46086_f()
    {
        return true;
    }

    public void func_46088_e()
    {
    }

    public void func_46085_d()
    {
    }

    public void func_46089_b()
    {
    }

    public void func_46087_a(int p_46087_1_)
    {
        field_46093_a = p_46087_1_;
    }

    public int func_46091_c()
    {
        return field_46093_a;
    }
}
