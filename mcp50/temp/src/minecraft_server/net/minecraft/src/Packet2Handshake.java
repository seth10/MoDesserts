// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet2Handshake extends Packet
{

    public String field_141_a;

    public Packet2Handshake()
    {
    }

    public Packet2Handshake(String p_i298_1_)
    {
        field_141_a = p_i298_1_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_141_a = func_27037_a(p_70_1_, 64);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        func_27038_a(field_141_a, p_68_1_);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_6004_a(this);
    }

    public int func_71_a()
    {
        return 4 + field_141_a.length() + 4;
    }
}
