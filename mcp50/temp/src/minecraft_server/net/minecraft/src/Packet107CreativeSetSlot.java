// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, ItemStack

public class Packet107CreativeSetSlot extends Packet
{

    public int field_35108_a;
    public ItemStack field_40263_b;

    public Packet107CreativeSetSlot()
    {
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_35004_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_35108_a = p_70_1_.readShort();
        field_40263_b = func_40262_b(p_70_1_);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeShort(field_35108_a);
        func_40261_a(field_40263_b, p_68_1_);
    }

    public int func_71_a()
    {
        return 8;
    }
}
