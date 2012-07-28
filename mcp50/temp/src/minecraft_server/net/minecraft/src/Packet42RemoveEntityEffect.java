// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, PotionEffect, NetHandler

public class Packet42RemoveEntityEffect extends Packet
{

    public int field_35128_a;
    public byte field_35127_b;

    public Packet42RemoveEntityEffect()
    {
    }

    public Packet42RemoveEntityEffect(int p_i319_1_, PotionEffect p_i319_2_)
    {
        field_35128_a = p_i319_1_;
        field_35127_b = (byte)(p_i319_2_.func_35649_a() & 0xff);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_35128_a = p_70_1_.readInt();
        field_35127_b = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_35128_a);
        p_68_1_.writeByte(field_35127_b);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_35003_a(this);
    }

    public int func_71_a()
    {
        return 5;
    }
}
