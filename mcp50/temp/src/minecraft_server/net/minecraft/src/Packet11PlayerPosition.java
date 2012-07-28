// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet10Flying

public class Packet11PlayerPosition extends Packet10Flying
{

    public Packet11PlayerPosition()
    {
        field_66_h = true;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_73_a = p_70_1_.readDouble();
        field_72_b = p_70_1_.readDouble();
        field_70_d = p_70_1_.readDouble();
        field_71_c = p_70_1_.readDouble();
        super.func_70_a(p_70_1_);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeDouble(field_73_a);
        p_68_1_.writeDouble(field_72_b);
        p_68_1_.writeDouble(field_70_d);
        p_68_1_.writeDouble(field_71_c);
        super.func_68_a(p_68_1_);
    }

    public int func_71_a()
    {
        return 33;
    }
}
