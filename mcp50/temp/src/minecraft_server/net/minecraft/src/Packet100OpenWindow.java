// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet100OpenWindow extends Packet
{

    public int field_20013_a;
    public int field_20012_b;
    public String field_20015_c;
    public int field_20014_d;

    public Packet100OpenWindow()
    {
    }

    public Packet100OpenWindow(int p_i217_1_, int p_i217_2_, String p_i217_3_, int p_i217_4_)
    {
        field_20013_a = p_i217_1_;
        field_20012_b = p_i217_2_;
        field_20015_c = p_i217_3_;
        field_20014_d = p_i217_4_;
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_20004_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_20013_a = p_70_1_.readByte() & 0xff;
        field_20012_b = p_70_1_.readByte() & 0xff;
        field_20015_c = func_27037_a(p_70_1_, 32);
        field_20014_d = p_70_1_.readByte() & 0xff;
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeByte(field_20013_a & 0xff);
        p_68_1_.writeByte(field_20012_b & 0xff);
        func_27038_a(field_20015_c, p_68_1_);
        p_68_1_.writeByte(field_20014_d & 0xff);
    }

    public int func_71_a()
    {
        return 3 + field_20015_c.length();
    }
}
