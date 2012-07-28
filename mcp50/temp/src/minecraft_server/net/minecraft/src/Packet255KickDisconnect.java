// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet255KickDisconnect extends Packet
{

    public String field_41_a;

    public Packet255KickDisconnect()
    {
    }

    public Packet255KickDisconnect(String p_i607_1_)
    {
        field_41_a = p_i607_1_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_41_a = func_27037_a(p_70_1_, 256);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        func_27038_a(field_41_a, p_68_1_);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_4009_a(this);
    }

    public int func_71_a()
    {
        return field_41_a.length();
    }
}
