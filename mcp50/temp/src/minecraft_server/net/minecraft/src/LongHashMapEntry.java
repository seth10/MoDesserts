// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            LongHashMap

class LongHashMapEntry
{

    final long field_1025_a;
    Object field_1024_b;
    LongHashMapEntry field_1027_c;
    final int field_1026_d;

    LongHashMapEntry(int p_i396_1_, long p_i396_2_, Object p_i396_4_, LongHashMapEntry p_i396_5_)
    {
        field_1024_b = p_i396_4_;
        field_1027_c = p_i396_5_;
        field_1025_a = p_i396_2_;
        field_1026_d = p_i396_1_;
    }

    public final long func_736_a()
    {
        return field_1025_a;
    }

    public final Object func_735_b()
    {
        return field_1024_b;
    }

    public final boolean equals(Object p_equals_1_)
    {
        if(!(p_equals_1_ instanceof LongHashMapEntry))
        {
            return false;
        }
        LongHashMapEntry longhashmapentry = (LongHashMapEntry)p_equals_1_;
        Long long1 = Long.valueOf(func_736_a());
        Long long2 = Long.valueOf(longhashmapentry.func_736_a());
        if(long1 == long2 || long1 != null && long1.equals(long2))
        {
            Object obj = func_735_b();
            Object obj1 = longhashmapentry.func_735_b();
            if(obj == obj1 || obj != null && obj.equals(obj1))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return LongHashMap.func_674_d(field_1025_a);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(func_736_a()).append("=").append(func_735_b()).toString();
    }
}
