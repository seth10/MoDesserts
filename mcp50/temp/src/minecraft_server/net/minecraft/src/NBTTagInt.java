// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagInt extends NBTBase
{

    public int field_742_a;

    public NBTTagInt(String p_i371_1_)
    {
        super(p_i371_1_);
    }

    public NBTTagInt(String p_i372_1_, int p_i372_2_)
    {
        super(p_i372_1_);
        field_742_a = p_i372_2_;
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        p_381_1_.writeInt(field_742_a);
    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        field_742_a = p_382_1_.readInt();
    }

    public byte func_379_a()
    {
        return 3;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_742_a).toString();
    }

    public NBTBase func_40468_b()
    {
        return new NBTTagInt(func_384_c(), field_742_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagInt nbttagint = (NBTTagInt)p_equals_1_;
            return field_742_a == nbttagint.field_742_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_742_a;
    }
}
