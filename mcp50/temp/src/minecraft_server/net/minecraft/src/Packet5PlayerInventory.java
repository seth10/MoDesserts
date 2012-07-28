// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, ItemStack, NetHandler

public class Packet5PlayerInventory extends Packet
{

    public int field_118_a;
    public int field_117_b;
    public int field_20028_c;
    public int field_21022_d;

    public Packet5PlayerInventory()
    {
    }

    public Packet5PlayerInventory(int p_i438_1_, int p_i438_2_, ItemStack p_i438_3_)
    {
        field_118_a = p_i438_1_;
        field_117_b = p_i438_2_;
        if(p_i438_3_ == null)
        {
            field_20028_c = -1;
            field_21022_d = 0;
        } else
        {
            field_20028_c = p_i438_3_.field_855_c;
            field_21022_d = p_i438_3_.func_21125_h();
        }
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_118_a = p_70_1_.readInt();
        field_117_b = p_70_1_.readShort();
        field_20028_c = p_70_1_.readShort();
        field_21022_d = p_70_1_.readShort();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_118_a);
        p_68_1_.writeShort(field_117_b);
        p_68_1_.writeShort(field_20028_c);
        p_68_1_.writeShort(field_21022_d);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_16_a(this);
    }

    public int func_71_a()
    {
        return 8;
    }
}
