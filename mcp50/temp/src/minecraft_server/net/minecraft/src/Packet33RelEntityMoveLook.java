// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet30Entity

public class Packet33RelEntityMoveLook extends Packet30Entity
{

    public Packet33RelEntityMoveLook()
    {
        field_84_g = true;
    }

    public Packet33RelEntityMoveLook(int p_i378_1_, byte p_i378_2_, byte p_i378_3_, byte p_i378_4_, byte p_i378_5_, byte p_i378_6_)
    {
        super(p_i378_1_);
        field_82_b = p_i378_2_;
        field_88_c = p_i378_3_;
        field_87_d = p_i378_4_;
        field_86_e = p_i378_5_;
        field_85_f = p_i378_6_;
        field_84_g = true;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        super.func_70_a(p_70_1_);
        field_82_b = p_70_1_.readByte();
        field_88_c = p_70_1_.readByte();
        field_87_d = p_70_1_.readByte();
        field_86_e = p_70_1_.readByte();
        field_85_f = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        super.func_68_a(p_68_1_);
        p_68_1_.writeByte(field_82_b);
        p_68_1_.writeByte(field_88_c);
        p_68_1_.writeByte(field_87_d);
        p_68_1_.writeByte(field_86_e);
        p_68_1_.writeByte(field_85_f);
    }

    public int func_71_a()
    {
        return 9;
    }
}
