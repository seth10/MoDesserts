// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, ItemStack, NetHandler

public class Packet103SetSlot extends Packet
{

    public int field_20017_a;
    public int field_20016_b;
    public ItemStack field_20018_c;

    public Packet103SetSlot()
    {
    }

    public Packet103SetSlot(int p_i195_1_, int p_i195_2_, ItemStack p_i195_3_)
    {
        field_20017_a = p_i195_1_;
        field_20016_b = p_i195_2_;
        field_20018_c = p_i195_3_ != null ? p_i195_3_.func_578_d() : p_i195_3_;
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_20003_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_20017_a = p_70_1_.readByte();
        field_20016_b = p_70_1_.readShort();
        field_20018_c = func_40262_b(p_70_1_);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeByte(field_20017_a);
        p_68_1_.writeShort(field_20016_b);
        func_40261_a(field_20018_c, p_68_1_);
    }

    public int func_71_a()
    {
        return 8;
    }
}
