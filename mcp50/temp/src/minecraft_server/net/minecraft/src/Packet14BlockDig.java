// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet14BlockDig extends Packet
{

    public int field_54_a;
    public int field_53_b;
    public int field_57_c;
    public int field_56_d;
    public int field_55_e;

    public Packet14BlockDig()
    {
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_55_e = p_70_1_.read();
        field_54_a = p_70_1_.readInt();
        field_53_b = p_70_1_.read();
        field_57_c = p_70_1_.readInt();
        field_56_d = p_70_1_.read();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.write(field_55_e);
        p_68_1_.writeInt(field_54_a);
        p_68_1_.write(field_53_b);
        p_68_1_.writeInt(field_57_c);
        p_68_1_.write(field_56_d);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_26_a(this);
    }

    public int func_71_a()
    {
        return 11;
    }
}
