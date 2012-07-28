// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class RConUtils
{

    public static char field_40587_a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    public RConUtils()
    {
    }

    public static String func_40583_a(byte p_40583_0_[], int p_40583_1_, int p_40583_2_)
    {
        int i = p_40583_2_ - 1;
        int j;
        for(j = p_40583_1_ <= i ? p_40583_1_ : i; 0 != p_40583_0_[j] && j < i; j++) { }
        return new String(p_40583_0_, p_40583_1_, j - p_40583_1_);
    }

    public static int func_40582_a(byte p_40582_0_[], int p_40582_1_)
    {
        return func_40586_b(p_40582_0_, p_40582_1_, p_40582_0_.length);
    }

    public static int func_40586_b(byte p_40586_0_[], int p_40586_1_, int p_40586_2_)
    {
        if(0 > p_40586_2_ - p_40586_1_ - 4)
        {
            return 0;
        } else
        {
            return p_40586_0_[p_40586_1_ + 3] << 24 | (p_40586_0_[p_40586_1_ + 2] & 0xff) << 16 | (p_40586_0_[p_40586_1_ + 1] & 0xff) << 8 | p_40586_0_[p_40586_1_] & 0xff;
        }
    }

    public static int func_40585_c(byte p_40585_0_[], int p_40585_1_, int p_40585_2_)
    {
        if(0 > p_40585_2_ - p_40585_1_ - 4)
        {
            return 0;
        } else
        {
            return p_40585_0_[p_40585_1_] << 24 | (p_40585_0_[p_40585_1_ + 1] & 0xff) << 16 | (p_40585_0_[p_40585_1_ + 2] & 0xff) << 8 | p_40585_0_[p_40585_1_ + 3] & 0xff;
        }
    }

    public static String func_40584_a(byte p_40584_0_)
    {
        return (new StringBuilder()).append("").append(field_40587_a[(p_40584_0_ & 0xf0) >>> 4]).append(field_40587_a[p_40584_0_ & 0xf]).toString();
    }

}
