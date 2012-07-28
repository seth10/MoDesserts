// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet3Chat extends Packet
{

    public static int field_52004_b = 119;
    public String field_150_a;

    public Packet3Chat()
    {
    }

    public Packet3Chat(String p_i366_1_)
    {
        if(p_i366_1_.length() > field_52004_b)
        {
            p_i366_1_ = p_i366_1_.substring(0, field_52004_b);
        }
        field_150_a = p_i366_1_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_150_a = func_27037_a(p_70_1_, field_52004_b);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        func_27038_a(field_150_a, p_68_1_);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_23_a(this);
    }

    public int func_71_a()
    {
        return 2 + field_150_a.length() * 2;
    }

}
