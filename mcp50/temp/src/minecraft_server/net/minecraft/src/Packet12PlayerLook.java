// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet10Flying

public class Packet12PlayerLook extends Packet10Flying
{

    public Packet12PlayerLook()
    {
        field_65_i = true;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_69_e = p_70_1_.readFloat();
        field_68_f = p_70_1_.readFloat();
        super.func_70_a(p_70_1_);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeFloat(field_69_e);
        p_68_1_.writeFloat(field_68_f);
        super.func_68_a(p_68_1_);
    }

    public int func_71_a()
    {
        return 9;
    }
}
