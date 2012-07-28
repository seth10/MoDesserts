// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet10Flying

public class Packet13PlayerLookMove extends Packet10Flying
{

    public Packet13PlayerLookMove()
    {
        field_65_i = true;
        field_66_h = true;
    }

    public Packet13PlayerLookMove(double p_i123_1_, double p_i123_3_, double p_i123_5_, double p_i123_7_, float p_i123_9_, float p_i123_10_, boolean p_i123_11_)
    {
        field_73_a = p_i123_1_;
        field_72_b = p_i123_3_;
        field_70_d = p_i123_5_;
        field_71_c = p_i123_7_;
        field_69_e = p_i123_9_;
        field_68_f = p_i123_10_;
        field_67_g = p_i123_11_;
        field_65_i = true;
        field_66_h = true;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_73_a = p_70_1_.readDouble();
        field_72_b = p_70_1_.readDouble();
        field_70_d = p_70_1_.readDouble();
        field_71_c = p_70_1_.readDouble();
        field_69_e = p_70_1_.readFloat();
        field_68_f = p_70_1_.readFloat();
        super.func_70_a(p_70_1_);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeDouble(field_73_a);
        p_68_1_.writeDouble(field_72_b);
        p_68_1_.writeDouble(field_70_d);
        p_68_1_.writeDouble(field_71_c);
        p_68_1_.writeFloat(field_69_e);
        p_68_1_.writeFloat(field_68_f);
        super.func_68_a(p_68_1_);
    }

    public int func_71_a()
    {
        return 41;
    }
}
