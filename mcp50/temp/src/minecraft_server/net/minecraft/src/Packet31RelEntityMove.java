// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet30Entity

public class Packet31RelEntityMove extends Packet30Entity
{

    public Packet31RelEntityMove()
    {
    }

    public Packet31RelEntityMove(int p_i451_1_, byte p_i451_2_, byte p_i451_3_, byte p_i451_4_)
    {
        super(p_i451_1_);
        field_82_b = p_i451_2_;
        field_88_c = p_i451_3_;
        field_87_d = p_i451_4_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        super.func_70_a(p_70_1_);
        field_82_b = p_70_1_.readByte();
        field_88_c = p_70_1_.readByte();
        field_87_d = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        super.func_68_a(p_68_1_);
        p_68_1_.writeByte(field_82_b);
        p_68_1_.writeByte(field_88_c);
        p_68_1_.writeByte(field_87_d);
    }

    public int func_71_a()
    {
        return 7;
    }
}
