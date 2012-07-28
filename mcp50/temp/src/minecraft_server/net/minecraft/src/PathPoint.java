// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            MathHelper

public class PathPoint
{

    public final int field_1016_a;
    public final int field_1015_b;
    public final int field_1014_c;
    private final int field_1013_d;
    int field_1012_e;
    float field_1011_f;
    float field_1010_g;
    float field_1009_h;
    PathPoint field_1008_i;
    public boolean field_1007_j;

    public PathPoint(int p_i97_1_, int p_i97_2_, int p_i97_3_)
    {
        field_1012_e = -1;
        field_1007_j = false;
        field_1016_a = p_i97_1_;
        field_1015_b = p_i97_2_;
        field_1014_c = p_i97_3_;
        field_1013_d = func_22203_a(p_i97_1_, p_i97_2_, p_i97_3_);
    }

    public static int func_22203_a(int p_22203_0_, int p_22203_1_, int p_22203_2_)
    {
        return p_22203_1_ & 0xff | (p_22203_0_ & 0x7fff) << 8 | (p_22203_2_ & 0x7fff) << 24 | (p_22203_0_ >= 0 ? 0 : 0x80000000) | (p_22203_2_ >= 0 ? 0 : 0x8000);
    }

    public float func_731_a(PathPoint p_731_1_)
    {
        float f = p_731_1_.field_1016_a - field_1016_a;
        float f1 = p_731_1_.field_1015_b - field_1015_b;
        float f2 = p_731_1_.field_1014_c - field_1014_c;
        return MathHelper.func_586_c(f * f + f1 * f1 + f2 * f2);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ instanceof PathPoint)
        {
            PathPoint pathpoint = (PathPoint)p_equals_1_;
            return field_1013_d == pathpoint.field_1013_d && field_1016_a == pathpoint.field_1016_a && field_1015_b == pathpoint.field_1015_b && field_1014_c == pathpoint.field_1014_c;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return field_1013_d;
    }

    public boolean func_730_a()
    {
        return field_1012_e >= 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(field_1016_a).append(", ").append(field_1015_b).append(", ").append(field_1014_c).toString();
    }
}
