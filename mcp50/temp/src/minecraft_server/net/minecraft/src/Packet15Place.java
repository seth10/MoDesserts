// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, ItemStack

public class Packet15Place extends Packet
{

    public int field_78_a;
    public int field_77_b;
    public int field_81_c;
    public int field_80_d;
    public ItemStack field_79_e;

    public Packet15Place()
    {
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_78_a = p_70_1_.readInt();
        field_77_b = p_70_1_.read();
        field_81_c = p_70_1_.readInt();
        field_80_d = p_70_1_.read();
        field_79_e = func_40262_b(p_70_1_);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_78_a);
        p_68_1_.write(field_77_b);
        p_68_1_.writeInt(field_81_c);
        p_68_1_.write(field_80_d);
        func_40261_a(field_79_e, p_68_1_);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_24_a(this);
    }

    public int func_71_a()
    {
        return 15;
    }
}
