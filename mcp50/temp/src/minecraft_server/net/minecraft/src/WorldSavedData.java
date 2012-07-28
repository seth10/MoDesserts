// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NBTTagCompound

public abstract class WorldSavedData
{

    public final String field_28152_a;
    private boolean field_28151_b;

    public WorldSavedData(String p_i190_1_)
    {
        field_28152_a = p_i190_1_;
    }

    public abstract void func_28148_a(NBTTagCompound nbttagcompound);

    public abstract void func_28147_b(NBTTagCompound nbttagcompound);

    public void func_28146_a()
    {
        func_28149_a(true);
    }

    public void func_28149_a(boolean p_28149_1_)
    {
        field_28151_b = p_28149_1_;
    }

    public boolean func_28150_b()
    {
        return field_28151_b;
    }
}
