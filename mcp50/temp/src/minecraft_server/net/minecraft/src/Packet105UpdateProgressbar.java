// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet105UpdateProgressbar extends Packet
{

    public int field_20030_a;
    public int field_20029_b;
    public int field_20031_c;

    public Packet105UpdateProgressbar()
    {
    }

    public Packet105UpdateProgressbar(int p_i307_1_, int p_i307_2_, int p_i307_3_)
    {
        field_20030_a = p_i307_1_;
        field_20029_b = p_i307_2_;
        field_20031_c = p_i307_3_;
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_20002_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_20030_a = p_70_1_.readByte();
        field_20029_b = p_70_1_.readShort();
        field_20031_c = p_70_1_.readShort();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeByte(field_20030_a);
        p_68_1_.writeShort(field_20029_b);
        p_68_1_.writeShort(field_20031_c);
    }

    public int func_71_a()
    {
        return 5;
    }
}
