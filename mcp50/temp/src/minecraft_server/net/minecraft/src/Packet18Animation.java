// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, NetHandler

public class Packet18Animation extends Packet
{

    public int field_120_a;
    public int field_119_b;

    public Packet18Animation()
    {
    }

    public Packet18Animation(Entity p_i321_1_, int p_i321_2_)
    {
        field_120_a = p_i321_1_.field_331_c;
        field_119_b = p_i321_2_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_120_a = p_70_1_.readInt();
        field_119_b = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_120_a);
        p_68_1_.writeByte(field_119_b);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_3_a(this);
    }

    public int func_71_a()
    {
        return 5;
    }
}
