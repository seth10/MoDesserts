// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class WorldType
{

    public static final WorldType field_48459_a[] = new WorldType[16];
    public static final WorldType field_48457_b = (new WorldType(0, "default", 1)).func_48448_d();
    public static final WorldType field_48458_c = new WorldType(1, "flat");
    public static final WorldType field_48456_d = (new WorldType(8, "default_1_1", 0)).func_48450_a(false);
    private final String field_46052_c;
    private final int field_48454_f;
    private boolean field_48455_g;
    private boolean field_48460_h;

    private WorldType(int p_i1025_1_, String p_i1025_2_)
    {
        this(p_i1025_1_, p_i1025_2_, 0);
    }

    private WorldType(int p_i1026_1_, String p_i1026_2_, int p_i1026_3_)
    {
        field_46052_c = p_i1026_2_;
        field_48454_f = p_i1026_3_;
        field_48455_g = true;
        field_48459_a[p_i1026_1_] = this;
    }

    public String func_48449_a()
    {
        return field_46052_c;
    }

    public int func_48452_b()
    {
        return field_48454_f;
    }

    public WorldType func_48451_a(int p_48451_1_)
    {
        if(this == field_48457_b && p_48451_1_ == 0)
        {
            return field_48456_d;
        } else
        {
            return this;
        }
    }

    private WorldType func_48450_a(boolean p_48450_1_)
    {
        field_48455_g = p_48450_1_;
        return this;
    }

    private WorldType func_48448_d()
    {
        field_48460_h = true;
        return this;
    }

    public boolean func_48453_c()
    {
        return field_48460_h;
    }

    public static WorldType func_46049_a(String p_46049_0_)
    {
        for(int i = 0; i < field_48459_a.length; i++)
        {
            if(field_48459_a[i] != null && field_48459_a[i].field_46052_c.equalsIgnoreCase(p_46049_0_))
            {
                return field_48459_a[i];
            }
        }

        return null;
    }

}
