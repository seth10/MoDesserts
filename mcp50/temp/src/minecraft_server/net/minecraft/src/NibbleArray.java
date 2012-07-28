// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class NibbleArray
{

    public final byte field_844_a[];
    private final int field_35661_b;
    private final int field_35662_c;

    public NibbleArray(int p_i555_1_, int p_i555_2_)
    {
        field_844_a = new byte[p_i555_1_ >> 1];
        field_35661_b = p_i555_2_;
        field_35662_c = p_i555_2_ + 4;
    }

    public NibbleArray(byte p_i556_1_[], int p_i556_2_)
    {
        field_844_a = p_i556_1_;
        field_35661_b = p_i556_2_;
        field_35662_c = p_i556_2_ + 4;
    }

    public int func_562_a(int p_562_1_, int p_562_2_, int p_562_3_)
    {
        int i = p_562_2_ << field_35662_c | p_562_3_ << field_35661_b | p_562_1_;
        int j = i >> 1;
        int k = i & 1;
        if(k == 0)
        {
            return field_844_a[j] & 0xf;
        } else
        {
            return field_844_a[j] >> 4 & 0xf;
        }
    }

    public void func_561_a(int p_561_1_, int p_561_2_, int p_561_3_, int p_561_4_)
    {
        int i = p_561_2_ << field_35662_c | p_561_3_ << field_35661_b | p_561_1_;
        int j = i >> 1;
        int k = i & 1;
        if(k == 0)
        {
            field_844_a[j] = (byte)(field_844_a[j] & 0xf0 | p_561_4_ & 0xf);
        } else
        {
            field_844_a[j] = (byte)(field_844_a[j] & 0xf | (p_561_4_ & 0xf) << 4);
        }
    }
}
