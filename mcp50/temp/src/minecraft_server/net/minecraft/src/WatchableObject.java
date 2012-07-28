// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class WatchableObject
{

    private final int field_21175_a;
    private final int field_21174_b;
    private Object field_21177_c;
    private boolean field_21176_d;

    public WatchableObject(int p_i291_1_, int p_i291_2_, Object p_i291_3_)
    {
        field_21174_b = p_i291_2_;
        field_21177_c = p_i291_3_;
        field_21175_a = p_i291_1_;
        field_21176_d = true;
    }

    public int func_21172_a()
    {
        return field_21174_b;
    }

    public void func_21171_a(Object p_21171_1_)
    {
        field_21177_c = p_21171_1_;
    }

    public Object func_21168_b()
    {
        return field_21177_c;
    }

    public int func_21169_c()
    {
        return field_21175_a;
    }

    public boolean func_21170_d()
    {
        return field_21176_d;
    }

    public void func_21173_a(boolean p_21173_1_)
    {
        field_21176_d = p_21173_1_;
    }
}
