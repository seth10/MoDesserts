// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet19EntityAction extends Packet
{

    public int field_21021_a;
    public int field_21020_b;

    public Packet19EntityAction()
    {
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_21021_a = p_70_1_.readInt();
        field_21020_b = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_21021_a);
        p_68_1_.writeByte(field_21020_b);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_21001_a(this);
    }

    public int func_71_a()
    {
        return 5;
    }
}
