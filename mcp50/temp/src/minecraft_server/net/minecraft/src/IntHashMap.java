// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package net.minecraft.src:
//            IntHashMapEntry

public class IntHashMap
{

    private transient IntHashMapEntry field_835_a[];
    private transient int field_834_b;
    private int field_838_c;
    private final float field_837_d = 0.75F;
    private volatile transient int field_836_e;
    private Set field_35619_f;

    public IntHashMap()
    {
        field_35619_f = new HashSet();
        field_838_c = 12;
        field_835_a = new IntHashMapEntry[16];
    }

    private static int func_545_g(int p_545_0_)
    {
        p_545_0_ ^= p_545_0_ >>> 20 ^ p_545_0_ >>> 12;
        return p_545_0_ ^ p_545_0_ >>> 7 ^ p_545_0_ >>> 4;
    }

    private static int func_555_a(int p_555_0_, int p_555_1_)
    {
        return p_555_0_ & p_555_1_ - 1;
    }

    public Object func_550_a(int p_550_1_)
    {
        int i = func_545_g(p_550_1_);
        for(IntHashMapEntry inthashmapentry = field_835_a[func_555_a(i, field_835_a.length)]; inthashmapentry != null; inthashmapentry = inthashmapentry.field_843_c)
        {
            if(inthashmapentry.field_841_a == p_550_1_)
            {
                return inthashmapentry.field_840_b;
            }
        }

        return null;
    }

    public boolean func_556_b(int p_556_1_)
    {
        return func_548_c(p_556_1_) != null;
    }

    final IntHashMapEntry func_548_c(int p_548_1_)
    {
        int i = func_545_g(p_548_1_);
        for(IntHashMapEntry inthashmapentry = field_835_a[func_555_a(i, field_835_a.length)]; inthashmapentry != null; inthashmapentry = inthashmapentry.field_843_c)
        {
            if(inthashmapentry.field_841_a == p_548_1_)
            {
                return inthashmapentry;
            }
        }

        return null;
    }

    public void func_554_a(int p_554_1_, Object p_554_2_)
    {
        field_35619_f.add(Integer.valueOf(p_554_1_));
        int i = func_545_g(p_554_1_);
        int j = func_555_a(i, field_835_a.length);
        for(IntHashMapEntry inthashmapentry = field_835_a[j]; inthashmapentry != null; inthashmapentry = inthashmapentry.field_843_c)
        {
            if(inthashmapentry.field_841_a == p_554_1_)
            {
                inthashmapentry.field_840_b = p_554_2_;
            }
        }

        field_836_e++;
        func_547_a(i, p_554_1_, p_554_2_, j);
    }

    private void func_552_h(int p_552_1_)
    {
        IntHashMapEntry ainthashmapentry[] = field_835_a;
        int i = ainthashmapentry.length;
        if(i == 0x40000000)
        {
            field_838_c = 0x7fffffff;
            return;
        } else
        {
            IntHashMapEntry ainthashmapentry1[] = new IntHashMapEntry[p_552_1_];
            func_549_a(ainthashmapentry1);
            field_835_a = ainthashmapentry1;
            field_838_c = (int)((float)p_552_1_ * field_837_d);
            return;
        }
    }

    private void func_549_a(IntHashMapEntry p_549_1_[])
    {
        IntHashMapEntry ainthashmapentry[] = field_835_a;
        int i = p_549_1_.length;
        for(int j = 0; j < ainthashmapentry.length; j++)
        {
            IntHashMapEntry inthashmapentry = ainthashmapentry[j];
            if(inthashmapentry == null)
            {
                continue;
            }
            ainthashmapentry[j] = null;
            do
            {
                IntHashMapEntry inthashmapentry1 = inthashmapentry.field_843_c;
                int k = func_555_a(inthashmapentry.field_842_d, i);
                inthashmapentry.field_843_c = p_549_1_[k];
                p_549_1_[k] = inthashmapentry;
                inthashmapentry = inthashmapentry1;
            } while(inthashmapentry != null);
        }

    }

    public Object func_553_d(int p_553_1_)
    {
        field_35619_f.remove(Integer.valueOf(p_553_1_));
        IntHashMapEntry inthashmapentry = func_557_e(p_553_1_);
        return inthashmapentry != null ? inthashmapentry.field_840_b : null;
    }

    final IntHashMapEntry func_557_e(int p_557_1_)
    {
        int i = func_545_g(p_557_1_);
        int j = func_555_a(i, field_835_a.length);
        IntHashMapEntry inthashmapentry = field_835_a[j];
        IntHashMapEntry inthashmapentry1;
        IntHashMapEntry inthashmapentry2;
        for(inthashmapentry1 = inthashmapentry; inthashmapentry1 != null; inthashmapentry1 = inthashmapentry2)
        {
            inthashmapentry2 = inthashmapentry1.field_843_c;
            if(inthashmapentry1.field_841_a == p_557_1_)
            {
                field_836_e++;
                field_834_b--;
                if(inthashmapentry == inthashmapentry1)
                {
                    field_835_a[j] = inthashmapentry2;
                } else
                {
                    inthashmapentry.field_843_c = inthashmapentry2;
                }
                return inthashmapentry1;
            }
            inthashmapentry = inthashmapentry1;
        }

        return inthashmapentry1;
    }

    public void func_551_a()
    {
        field_836_e++;
        IntHashMapEntry ainthashmapentry[] = field_835_a;
        for(int i = 0; i < ainthashmapentry.length; i++)
        {
            ainthashmapentry[i] = null;
        }

        field_834_b = 0;
    }

    private void func_547_a(int p_547_1_, int p_547_2_, Object p_547_3_, int p_547_4_)
    {
        IntHashMapEntry inthashmapentry = field_835_a[p_547_4_];
        field_835_a[p_547_4_] = new IntHashMapEntry(p_547_1_, p_547_2_, p_547_3_, inthashmapentry);
        if(field_834_b++ >= field_838_c)
        {
            func_552_h(2 * field_835_a.length);
        }
    }

    static int func_546_f(int p_546_0_)
    {
        return func_545_g(p_546_0_);
    }
}
