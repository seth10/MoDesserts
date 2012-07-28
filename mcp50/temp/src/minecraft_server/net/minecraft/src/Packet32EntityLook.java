// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet30Entity

public class Packet32EntityLook extends Packet30Entity
{

    public Packet32EntityLook()
    {
        field_84_g = true;
    }

    public Packet32EntityLook(int p_i432_1_, byte p_i432_2_, byte p_i432_3_)
    {
        super(p_i432_1_);
        field_86_e = p_i432_2_;
        field_85_f = p_i432_3_;
        field_84_g = true;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        super.func_70_a(p_70_1_);
        field_86_e = p_70_1_.readByte();
        field_85_f = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        super.func_68_a(p_68_1_);
        p_68_1_.writeByte(field_86_e);
        p_68_1_.writeByte(field_85_f);
    }

    public int func_71_a()
    {
        return 6;
    }
}
