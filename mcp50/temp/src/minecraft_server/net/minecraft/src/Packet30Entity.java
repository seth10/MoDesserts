// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet30Entity extends Packet
{

    public int field_83_a;
    public byte field_82_b;
    public byte field_88_c;
    public byte field_87_d;
    public byte field_86_e;
    public byte field_85_f;
    public boolean field_84_g;

    public Packet30Entity()
    {
        field_84_g = false;
    }

    public Packet30Entity(int p_i480_1_)
    {
        field_84_g = false;
        field_83_a = p_i480_1_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_83_a = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_83_a);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_30_a(this);
    }

    public int func_71_a()
    {
        return 4;
    }
}
