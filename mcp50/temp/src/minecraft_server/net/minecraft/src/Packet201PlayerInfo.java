// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet201PlayerInfo extends Packet
{

    public String field_35111_a;
    public boolean field_35109_b;
    public int field_35110_c;

    public Packet201PlayerInfo()
    {
    }

    public Packet201PlayerInfo(String p_i106_1_, boolean p_i106_2_, int p_i106_3_)
    {
        field_35111_a = p_i106_1_;
        field_35109_b = p_i106_2_;
        field_35110_c = p_i106_3_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_35111_a = func_27037_a(p_70_1_, 16);
        field_35109_b = p_70_1_.readByte() != 0;
        field_35110_c = p_70_1_.readShort();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        func_27038_a(field_35111_a, p_68_1_);
        p_68_1_.writeByte(field_35109_b ? 1 : 0);
        p_68_1_.writeShort(field_35110_c);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_35006_a(this);
    }

    public int func_71_a()
    {
        return field_35111_a.length() + 2 + 1 + 2;
    }
}
