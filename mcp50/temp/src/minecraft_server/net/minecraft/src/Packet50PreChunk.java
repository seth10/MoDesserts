// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet50PreChunk extends Packet
{

    public int field_103_a;
    public int field_102_b;
    public boolean field_104_c;

    public Packet50PreChunk()
    {
        field_40_j = false;
    }

    public Packet50PreChunk(int p_i434_1_, int p_i434_2_, boolean p_i434_3_)
    {
        field_40_j = false;
        field_103_a = p_i434_1_;
        field_102_b = p_i434_2_;
        field_104_c = p_i434_3_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_103_a = p_70_1_.readInt();
        field_102_b = p_70_1_.readInt();
        field_104_c = p_70_1_.read() != 0;
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_103_a);
        p_68_1_.writeInt(field_102_b);
        p_68_1_.write(field_104_c ? 1 : 0);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_29_a(this);
    }

    public int func_71_a()
    {
        return 9;
    }
}
