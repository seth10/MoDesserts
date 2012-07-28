// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.Arrays;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagByteArray extends NBTBase
{

    public byte field_733_a[];

    public NBTTagByteArray(String p_i191_1_)
    {
        super(p_i191_1_);
    }

    public NBTTagByteArray(String p_i192_1_, byte p_i192_2_[])
    {
        super(p_i192_1_);
        field_733_a = p_i192_2_;
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        p_381_1_.writeInt(field_733_a.length);
        p_381_1_.write(field_733_a);
    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        int i = p_382_1_.readInt();
        field_733_a = new byte[i];
        p_382_1_.readFully(field_733_a);
    }

    public byte func_379_a()
    {
        return 7;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(field_733_a.length).append(" bytes]").toString();
    }

    public NBTBase func_40468_b()
    {
        byte abyte0[] = new byte[field_733_a.length];
        System.arraycopy(field_733_a, 0, abyte0, 0, field_733_a.length);
        return new NBTTagByteArray(func_384_c(), abyte0);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            return Arrays.equals(field_733_a, ((NBTTagByteArray)p_equals_1_).field_733_a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ Arrays.hashCode(field_733_a);
    }
}
