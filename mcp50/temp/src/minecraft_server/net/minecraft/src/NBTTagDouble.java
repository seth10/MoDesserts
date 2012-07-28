// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagDouble extends NBTBase
{

    public double field_735_a;

    public NBTTagDouble(String p_i453_1_)
    {
        super(p_i453_1_);
    }

    public NBTTagDouble(String p_i454_1_, double p_i454_2_)
    {
        super(p_i454_1_);
        field_735_a = p_i454_2_;
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        p_381_1_.writeDouble(field_735_a);
    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        field_735_a = p_382_1_.readDouble();
    }

    public byte func_379_a()
    {
        return 6;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_735_a).toString();
    }

    public NBTBase func_40468_b()
    {
        return new NBTTagDouble(func_384_c(), field_735_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagDouble nbttagdouble = (NBTTagDouble)p_equals_1_;
            return field_735_a == nbttagdouble.field_735_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(field_735_a);
        return super.hashCode() ^ (int)(l ^ l >>> 32);
    }
}
