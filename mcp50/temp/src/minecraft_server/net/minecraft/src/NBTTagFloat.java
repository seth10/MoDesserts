// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagFloat extends NBTBase
{

    public float field_739_a;

    public NBTTagFloat(String p_i413_1_)
    {
        super(p_i413_1_);
    }

    public NBTTagFloat(String p_i414_1_, float p_i414_2_)
    {
        super(p_i414_1_);
        field_739_a = p_i414_2_;
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        p_381_1_.writeFloat(field_739_a);
    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        field_739_a = p_382_1_.readFloat();
    }

    public byte func_379_a()
    {
        return 5;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_739_a).toString();
    }

    public NBTBase func_40468_b()
    {
        return new NBTTagFloat(func_384_c(), field_739_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagFloat nbttagfloat = (NBTTagFloat)p_equals_1_;
            return field_739_a == nbttagfloat.field_739_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ Float.floatToIntBits(field_739_a);
    }
}
