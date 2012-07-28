// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Packet, ItemStack, NetHandler

public class Packet104WindowItems extends Packet
{

    public int field_20011_a;
    public ItemStack field_20010_b[];

    public Packet104WindowItems()
    {
    }

    public Packet104WindowItems(int p_i245_1_, List p_i245_2_)
    {
        field_20011_a = p_i245_1_;
        field_20010_b = new ItemStack[p_i245_2_.size()];
        for(int i = 0; i < field_20010_b.length; i++)
        {
            ItemStack itemstack = (ItemStack)p_i245_2_.get(i);
            field_20010_b[i] = itemstack != null ? itemstack.func_578_d() : null;
        }

    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_20011_a = p_70_1_.readByte();
        short word0 = p_70_1_.readShort();
        field_20010_b = new ItemStack[word0];
        for(int i = 0; i < word0; i++)
        {
            field_20010_b[i] = func_40262_b(p_70_1_);
        }

    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeByte(field_20011_a);
        p_68_1_.writeShort(field_20010_b.length);
        for(int i = 0; i < field_20010_b.length; i++)
        {
            func_40261_a(field_20010_b[i], p_68_1_);
        }

    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_20001_a(this);
    }

    public int func_71_a()
    {
        return 3 + field_20010_b.length * 5;
    }
}
