// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            LongHashMapEntry

public class LongHashMap
{

    private transient LongHashMapEntry field_949_a[];
    private transient int field_948_b;
    private int field_952_c;
    private final float field_951_d = 0.75F;
    private volatile transient int field_950_e;

    public LongHashMap()
    {
        field_952_c = 12;
        field_949_a = new LongHashMapEntry[16];
    }

    private static int func_671_e(long p_671_0_)
    {
        return func_676_a((int)(p_671_0_ ^ p_671_0_ >>> 32));
    }

    private static int func_676_a(int p_676_0_)
    {
        p_676_0_ ^= p_676_0_ >>> 20 ^ p_676_0_ >>> 12;
        return p_676_0_ ^ p_676_0_ >>> 7 ^ p_676_0_ >>> 4;
    }

    private static int func_678_a(int p_678_0_, int p_678_1_)
    {
        return p_678_0_ & p_678_1_ - 1;
    }

    public int func_46048_a()
    {
        return field_948_b;
    }

    public Object func_677_a(long p_677_1_)
    {
        int i = func_671_e(p_677_1_);
        for(LongHashMapEntry longhashmapentry = field_949_a[func_678_a(i, field_949_a.length)]; longhashmapentry != null; longhashmapentry = longhashmapentry.field_1027_c)
        {
            if(longhashmapentry.field_1025_a == p_677_1_)
            {
                return longhashmapentry.field_1024_b;
            }
        }

        return null;
    }

    public boolean func_35508_b(long p_35508_1_)
    {
        return func_35507_c(p_35508_1_) != null;
    }

    final LongHashMapEntry func_35507_c(long p_35507_1_)
    {
        int i = func_671_e(p_35507_1_);
        for(LongHashMapEntry longhashmapentry = field_949_a[func_678_a(i, field_949_a.length)]; longhashmapentry != null; longhashmapentry = longhashmapentry.field_1027_c)
        {
            if(longhashmapentry.field_1025_a == p_35507_1_)
            {
                return longhashmapentry;
            }
        }

        return null;
    }

    public void func_675_a(long p_675_1_, Object p_675_3_)
    {
        int i = func_671_e(p_675_1_);
        int j = func_678_a(i, field_949_a.length);
        for(LongHashMapEntry longhashmapentry = field_949_a[j]; longhashmapentry != null; longhashmapentry = longhashmapentry.field_1027_c)
        {
            if(longhashmapentry.field_1025_a == p_675_1_)
            {
                longhashmapentry.field_1024_b = p_675_3_;
            }
        }

        field_950_e++;
        func_679_a(i, p_675_1_, p_675_3_, j);
    }

    private void func_680_b(int p_680_1_)
    {
        LongHashMapEntry alonghashmapentry[] = field_949_a;
        int i = alonghashmapentry.length;
        if(i == 0x40000000)
        {
            field_952_c = 0x7fffffff;
            return;
        } else
        {
            LongHashMapEntry alonghashmapentry1[] = new LongHashMapEntry[p_680_1_];
            func_673_a(alonghashmapentry1);
            field_949_a = alonghashmapentry1;
            field_952_c = (int)((float)p_680_1_ * field_951_d);
            return;
        }
    }

    private void func_673_a(LongHashMapEntry p_673_1_[])
    {
        LongHashMapEntry alonghashmapentry[] = field_949_a;
        int i = p_673_1_.length;
        for(int j = 0; j < alonghashmapentry.length; j++)
        {
            LongHashMapEntry longhashmapentry = alonghashmapentry[j];
            if(longhashmapentry == null)
            {
                continue;
            }
            alonghashmapentry[j] = null;
            do
            {
                LongHashMapEntry longhashmapentry1 = longhashmapentry.field_1027_c;
                int k = func_678_a(longhashmapentry.field_1026_d, i);
                longhashmapentry.field_1027_c = p_673_1_[k];
                p_673_1_[k] = longhashmapentry;
                longhashmapentry = longhashmapentry1;
            } while(longhashmapentry != null);
        }

    }

    public Object func_670_b(long p_670_1_)
    {
        LongHashMapEntry longhashmapentry = func_672_c(p_670_1_);
        return longhashmapentry != null ? longhashmapentry.field_1024_b : null;
    }

    final LongHashMapEntry func_672_c(long p_672_1_)
    {
        int i = func_671_e(p_672_1_);
        int j = func_678_a(i, field_949_a.length);
        LongHashMapEntry longhashmapentry = field_949_a[j];
        LongHashMapEntry longhashmapentry1;
        LongHashMapEntry longhashmapentry2;
        for(longhashmapentry1 = longhashmapentry; longhashmapentry1 != null; longhashmapentry1 = longhashmapentry2)
        {
            longhashmapentry2 = longhashmapentry1.field_1027_c;
            if(longhashmapentry1.field_1025_a == p_672_1_)
            {
                field_950_e++;
                field_948_b--;
                if(longhashmapentry == longhashmapentry1)
                {
                    field_949_a[j] = longhashmapentry2;
                } else
                {
                    longhashmapentry.field_1027_c = longhashmapentry2;
                }
                return longhashmapentry1;
            }
            longhashmapentry = longhashmapentry1;
        }

        return longhashmapentry1;
    }

    private void func_679_a(int p_679_1_, long p_679_2_, Object p_679_4_, int p_679_5_)
    {
        LongHashMapEntry longhashmapentry = field_949_a[p_679_5_];
        field_949_a[p_679_5_] = new LongHashMapEntry(p_679_1_, p_679_2_, p_679_4_, longhashmapentry);
        if(field_948_b++ >= field_952_c)
        {
            func_680_b(2 * field_949_a.length);
        }
    }

    static int func_674_d(long p_674_0_)
    {
        return func_671_e(p_674_0_);
    }
}
