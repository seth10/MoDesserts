// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.Arrays;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagIntArray extends NBTBase
{

    public int field_48447_a[];

    public NBTTagIntArray(String p_i1044_1_)
    {
        super(p_i1044_1_);
    }

    public NBTTagIntArray(String p_i1045_1_, int p_i1045_2_[])
    {
        super(p_i1045_1_);
        field_48447_a = p_i1045_2_;
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        p_381_1_.writeInt(field_48447_a.length);
        for(int i = 0; i < field_48447_a.length; i++)
        {
            p_381_1_.writeInt(field_48447_a[i]);
        }

    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        int i = p_382_1_.readInt();
        field_48447_a = new int[i];
        for(int j = 0; j < i; j++)
        {
            field_48447_a[j] = p_382_1_.readInt();
        }

    }

    public byte func_379_a()
    {
        return 11;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(field_48447_a.length).append(" bytes]").toString();
    }

    public NBTBase func_40468_b()
    {
        int ai[] = new int[field_48447_a.length];
        System.arraycopy(field_48447_a, 0, ai, 0, field_48447_a.length);
        return new NBTTagIntArray(func_384_c(), ai);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagIntArray nbttagintarray = (NBTTagIntArray)p_equals_1_;
            return field_48447_a == null && nbttagintarray.field_48447_a == null || field_48447_a != null && field_48447_a.equals(nbttagintarray.field_48447_a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ Arrays.hashCode(field_48447_a);
    }
}
