// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet10Flying extends Packet
{

    public double field_73_a;
    public double field_72_b;
    public double field_71_c;
    public double field_70_d;
    public float field_69_e;
    public float field_68_f;
    public boolean field_67_g;
    public boolean field_66_h;
    public boolean field_65_i;

    public Packet10Flying()
    {
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_18_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_67_g = p_70_1_.read() != 0;
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.write(field_67_g ? 1 : 0);
    }

    public int func_71_a()
    {
        return 1;
    }
}
