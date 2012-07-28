// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagShort extends NBTBase
{

    public short field_734_a;

    public NBTTagShort(String p_i486_1_)
    {
        super(p_i486_1_);
    }

    public NBTTagShort(String p_i487_1_, short p_i487_2_)
    {
        super(p_i487_1_);
        field_734_a = p_i487_2_;
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        p_381_1_.writeShort(field_734_a);
    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        field_734_a = p_382_1_.readShort();
    }

    public byte func_379_a()
    {
        return 2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_734_a).toString();
    }

    public NBTBase func_40468_b()
    {
        return new NBTTagShort(func_384_c(), field_734_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagShort nbttagshort = (NBTTagShort)p_equals_1_;
            return field_734_a == nbttagshort.field_734_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_734_a;
    }
}
