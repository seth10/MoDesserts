// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

public class RConOutputStream
{

    private ByteArrayOutputStream field_40400_a;
    private DataOutputStream field_40399_b;

    public RConOutputStream(int p_i124_1_)
    {
        field_40400_a = new ByteArrayOutputStream(p_i124_1_);
        field_40399_b = new DataOutputStream(field_40400_a);
    }

    public void func_40396_a(byte p_40396_1_[])
        throws IOException
    {
        field_40399_b.write(p_40396_1_, 0, p_40396_1_.length);
    }

    public void func_40397_a(String p_40397_1_)
        throws IOException
    {
        field_40399_b.writeBytes(p_40397_1_);
        field_40399_b.write(0);
    }

    public void func_40393_a(int p_40393_1_)
        throws IOException
    {
        field_40399_b.write(p_40393_1_);
    }

    public void func_40394_a(short p_40394_1_)
        throws IOException
    {
        field_40399_b.writeShort(Short.reverseBytes(p_40394_1_));
    }

    public byte[] func_40398_a()
    {
        return field_40400_a.toByteArray();
    }

    public void func_40395_b()
    {
        field_40400_a.reset();
    }
}
