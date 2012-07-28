// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet131MapData extends Packet
{

    public short field_28052_a;
    public short field_28051_b;
    public byte field_28053_c[];

    public Packet131MapData()
    {
        field_40_j = true;
    }

    public Packet131MapData(short p_i9_1_, short p_i9_2_, byte p_i9_3_[])
    {
        field_40_j = true;
        field_28052_a = p_i9_1_;
        field_28051_b = p_i9_2_;
        field_28053_c = p_i9_3_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_28052_a = p_70_1_.readShort();
        field_28051_b = p_70_1_.readShort();
        field_28053_c = new byte[p_70_1_.readByte() & 0xff];
        p_70_1_.readFully(field_28053_c);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeShort(field_28052_a);
        p_68_1_.writeShort(field_28051_b);
        p_68_1_.writeByte(field_28053_c.length);
        p_68_1_.write(field_28053_c);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_28001_a(this);
    }

    public int func_71_a()
    {
        return 4 + field_28053_c.length;
    }
}
