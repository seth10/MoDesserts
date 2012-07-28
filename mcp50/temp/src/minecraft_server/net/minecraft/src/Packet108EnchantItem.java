// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet108EnchantItem extends Packet
{

    public int field_40265_a;
    public int field_40264_b;

    public Packet108EnchantItem()
    {
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_40001_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_40265_a = p_70_1_.readByte();
        field_40264_b = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeByte(field_40265_a);
        p_68_1_.writeByte(field_40264_b);
    }

    public int func_71_a()
    {
        return 2;
    }
}
