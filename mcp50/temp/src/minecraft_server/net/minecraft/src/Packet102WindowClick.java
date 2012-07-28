// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, ItemStack

public class Packet102WindowClick extends Packet
{

    public int field_20024_a;
    public int field_20023_b;
    public int field_20027_c;
    public short field_20026_d;
    public ItemStack field_20025_e;
    public boolean field_27039_f;

    public Packet102WindowClick()
    {
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_20007_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_20024_a = p_70_1_.readByte();
        field_20023_b = p_70_1_.readShort();
        field_20027_c = p_70_1_.readByte();
        field_20026_d = p_70_1_.readShort();
        field_27039_f = p_70_1_.readBoolean();
        field_20025_e = func_40262_b(p_70_1_);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeByte(field_20024_a);
        p_68_1_.writeShort(field_20023_b);
        p_68_1_.writeByte(field_20027_c);
        p_68_1_.writeShort(field_20026_d);
        p_68_1_.writeBoolean(field_27039_f);
        func_40261_a(field_20025_e, p_68_1_);
    }

    public int func_71_a()
    {
        return 11;
    }
}
