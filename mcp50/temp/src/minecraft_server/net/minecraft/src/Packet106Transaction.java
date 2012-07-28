// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet106Transaction extends Packet
{

    public int field_20034_a;
    public short field_20033_b;
    public boolean field_20035_c;

    public Packet106Transaction()
    {
    }

    public Packet106Transaction(int p_i345_1_, short p_i345_2_, boolean p_i345_3_)
    {
        field_20034_a = p_i345_1_;
        field_20033_b = p_i345_2_;
        field_20035_c = p_i345_3_;
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_20008_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_20034_a = p_70_1_.readByte();
        field_20033_b = p_70_1_.readShort();
        field_20035_c = p_70_1_.readByte() != 0;
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeByte(field_20034_a);
        p_68_1_.writeShort(field_20033_b);
        p_68_1_.writeByte(field_20035_c ? 1 : 0);
    }

    public int func_71_a()
    {
        return 4;
    }
}
