// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet200Statistic extends Packet
{

    public int field_27041_a;
    public int field_27040_b;

    public Packet200Statistic()
    {
    }

    public Packet200Statistic(int p_i342_1_, int p_i342_2_)
    {
        field_27041_a = p_i342_1_;
        field_27040_b = p_i342_2_;
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_27001_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_27041_a = p_70_1_.readInt();
        field_27040_b = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_27041_a);
        p_68_1_.writeByte(field_27040_b);
    }

    public int func_71_a()
    {
        return 6;
    }
}
