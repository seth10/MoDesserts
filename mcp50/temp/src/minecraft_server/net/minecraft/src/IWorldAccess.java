// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, TileEntity, EntityPlayer

public interface IWorldAccess
{

    public abstract void func_683_a(int i, int j, int k);

    public abstract void func_48414_b(int i, int j, int k);

    public abstract void func_685_a(int i, int j, int k, int l, int i1, int j1);

    public abstract void func_689_a(String s, double d, double d1, double d2, 
            float f, float f1);

    public abstract void func_687_a(String s, double d, double d1, double d2, 
            double d3, double d4, double d5);

    public abstract void func_681_a(Entity entity);

    public abstract void func_688_b(Entity entity);

    public abstract void func_682_a(String s, int i, int j, int k);

    public abstract void func_686_a(int i, int j, int k, TileEntity tileentity);

    public abstract void func_28133_a(EntityPlayer entityplayer, int i, int j, int k, int l, int i1);
}
