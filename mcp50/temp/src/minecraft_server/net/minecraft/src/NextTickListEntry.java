// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class NextTickListEntry
    implements Comparable
{

    private static long field_1020_f = 0L;
    public int field_1018_a;
    public int field_1017_b;
    public int field_1023_c;
    public int field_1022_d;
    public long field_1021_e;
    private long field_1019_g;

    public NextTickListEntry(int p_i402_1_, int p_i402_2_, int p_i402_3_, int p_i402_4_)
    {
        field_1019_g = field_1020_f++;
        field_1018_a = p_i402_1_;
        field_1017_b = p_i402_2_;
        field_1023_c = p_i402_3_;
        field_1022_d = p_i402_4_;
    }

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ instanceof NextTickListEntry)
        {
            NextTickListEntry nextticklistentry = (NextTickListEntry)p_equals_1_;
            return field_1018_a == nextticklistentry.field_1018_a && field_1017_b == nextticklistentry.field_1017_b && field_1023_c == nextticklistentry.field_1023_c && field_1022_d == nextticklistentry.field_1022_d;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return (field_1018_a * 1024 * 1024 + field_1023_c * 1024 + field_1017_b) * 256 + field_1022_d;
    }

    public NextTickListEntry func_733_a(long p_733_1_)
    {
        field_1021_e = p_733_1_;
        return this;
    }

    public int func_734_a(NextTickListEntry p_734_1_)
    {
        if(field_1021_e < p_734_1_.field_1021_e)
        {
            return -1;
        }
        if(field_1021_e > p_734_1_.field_1021_e)
        {
            return 1;
        }
        if(field_1019_g < p_734_1_.field_1019_g)
        {
            return -1;
        }
        return field_1019_g <= p_734_1_.field_1019_g ? 0 : 1;
    }

    public int compareTo(Object p_compareTo_1_)
    {
        return func_734_a((NextTickListEntry)p_compareTo_1_);
    }

}
