// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagByte extends NBTBase
{

    public byte field_741_a;

    public NBTTagByte(String p_i392_1_)
    {
        super(p_i392_1_);
    }

    public NBTTagByte(String p_i393_1_, byte p_i393_2_)
    {
        super(p_i393_1_);
        field_741_a = p_i393_2_;
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        p_381_1_.writeByte(field_741_a);
    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        field_741_a = p_382_1_.readByte();
    }

    public byte func_379_a()
    {
        return 1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_741_a).toString();
    }

    public NBTBase func_40468_b()
    {
        return new NBTTagByte(func_384_c(), field_741_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagByte nbttagbyte = (NBTTagByte)p_equals_1_;
            return field_741_a == nbttagbyte.field_741_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_741_a;
    }
}
