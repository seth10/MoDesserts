// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, PotionEffect, NetHandler

public class Packet41EntityEffect extends Packet
{

    public int field_35116_a;
    public byte field_35114_b;
    public byte field_35115_c;
    public short field_35113_d;

    public Packet41EntityEffect()
    {
    }

    public Packet41EntityEffect(int p_i101_1_, PotionEffect p_i101_2_)
    {
        field_35116_a = p_i101_1_;
        field_35114_b = (byte)(p_i101_2_.func_35649_a() & 0xff);
        field_35115_c = (byte)(p_i101_2_.func_35652_c() & 0xff);
        field_35113_d = (short)p_i101_2_.func_35653_b();
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_35116_a = p_70_1_.readInt();
        field_35114_b = p_70_1_.readByte();
        field_35115_c = p_70_1_.readByte();
        field_35113_d = p_70_1_.readShort();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_35116_a);
        p_68_1_.writeByte(field_35114_b);
        p_68_1_.writeByte(field_35115_c);
        p_68_1_.writeShort(field_35113_d);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_35002_a(this);
    }

    public int func_71_a()
    {
        return 8;
    }
}
