// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IntHashMap

class IntHashMapEntry
{

    final int field_841_a;
    Object field_840_b;
    IntHashMapEntry field_843_c;
    final int field_842_d;

    IntHashMapEntry(int p_i559_1_, int p_i559_2_, Object p_i559_3_, IntHashMapEntry p_i559_4_)
    {
        field_840_b = p_i559_3_;
        field_843_c = p_i559_4_;
        field_841_a = p_i559_2_;
        field_842_d = p_i559_1_;
    }

    public final int func_559_a()
    {
        return field_841_a;
    }

    public final Object func_558_b()
    {
        return field_840_b;
    }

    public final boolean equals(Object p_equals_1_)
    {
        if(!(p_equals_1_ instanceof IntHashMapEntry))
        {
            return false;
        }
        IntHashMapEntry inthashmapentry = (IntHashMapEntry)p_equals_1_;
        Integer integer = Integer.valueOf(func_559_a());
        Integer integer1 = Integer.valueOf(inthashmapentry.func_559_a());
        if(integer == integer1 || integer != null && integer.equals(integer1))
        {
            Object obj = func_558_b();
            Object obj1 = inthashmapentry.func_558_b();
            if(obj == obj1 || obj != null && obj.equals(obj1))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return IntHashMap.func_546_f(field_841_a);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(func_559_a()).append("=").append(func_558_b()).toString();
    }
}
