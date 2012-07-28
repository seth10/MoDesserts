// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet22Collect extends Packet
{

    public int field_137_a;
    public int field_136_b;

    public Packet22Collect()
    {
    }

    public Packet22Collect(int p_i88_1_, int p_i88_2_)
    {
        field_137_a = p_i88_1_;
        field_136_b = p_i88_2_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_137_a = p_70_1_.readInt();
        field_136_b = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_137_a);
        p_68_1_.writeInt(field_136_b);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_28_a(this);
    }

    public int func_71_a()
    {
        return 8;
    }
}
