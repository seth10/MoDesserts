// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WorldType

public final class WorldSettings
{

    private final long field_35043_a;
    private final int field_35041_b;
    private final boolean field_35042_c;
    private final boolean field_40280_d;
    private final WorldType field_46129_e;

    public WorldSettings(long p_i1039_1_, int p_i1039_3_, boolean p_i1039_4_, boolean p_i1039_5_, WorldType p_i1039_6_)
    {
        field_35043_a = p_i1039_1_;
        field_35041_b = p_i1039_3_;
        field_35042_c = p_i1039_4_;
        field_40280_d = p_i1039_5_;
        field_46129_e = p_i1039_6_;
    }

    public long func_35038_a()
    {
        return field_35043_a;
    }

    public int func_35039_b()
    {
        return field_35041_b;
    }

    public boolean func_40279_c()
    {
        return field_40280_d;
    }

    public boolean func_35040_c()
    {
        return field_35042_c;
    }

    public WorldType func_46128_e()
    {
        return field_46129_e;
    }

    public static int func_35037_a(int p_35037_0_)
    {
        switch(p_35037_0_)
        {
        case 0: // '\0'
        case 1: // '\001'
            return p_35037_0_;
        }
        return 0;
    }
}
