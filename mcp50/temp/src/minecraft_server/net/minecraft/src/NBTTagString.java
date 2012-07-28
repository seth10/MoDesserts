// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagString extends NBTBase
{

    public String field_732_a;

    public NBTTagString(String p_i573_1_)
    {
        super(p_i573_1_);
    }

    public NBTTagString(String p_i574_1_, String p_i574_2_)
    {
        super(p_i574_1_);
        field_732_a = p_i574_2_;
        if(p_i574_2_ == null)
        {
            throw new IllegalArgumentException("Empty string not allowed");
        } else
        {
            return;
        }
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        p_381_1_.writeUTF(field_732_a);
    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        field_732_a = p_382_1_.readUTF();
    }

    public byte func_379_a()
    {
        return 8;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_732_a).toString();
    }

    public NBTBase func_40468_b()
    {
        return new NBTTagString(func_384_c(), field_732_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagString nbttagstring = (NBTTagString)p_equals_1_;
            return field_732_a == null && nbttagstring.field_732_a == null || field_732_a != null && field_732_a.equals(nbttagstring.field_732_a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_732_a.hashCode();
    }
}
