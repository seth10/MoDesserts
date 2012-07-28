// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet16BlockItemSwitch extends Packet
{

    public int field_74_b;

    public Packet16BlockItemSwitch()
    {
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_74_b = p_70_1_.readShort();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeShort(field_74_b);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_11_a(this);
    }

    public int func_71_a()
    {
        return 2;
    }
}
