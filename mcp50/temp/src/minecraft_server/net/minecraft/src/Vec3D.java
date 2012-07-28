// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            MathHelper

public class Vec3D
{

    private static List field_1057_d = new ArrayList();
    private static int field_1056_e = 0;
    public double field_1055_a;
    public double field_1054_b;
    public double field_1058_c;

    public static Vec3D func_760_a(double p_760_0_, double p_760_2_, double p_760_4_)
    {
        return new Vec3D(p_760_0_, p_760_2_, p_760_4_);
    }

    public static void func_761_a()
    {
        field_1056_e = 0;
    }

    public static Vec3D func_768_b(double p_768_0_, double p_768_2_, double p_768_4_)
    {
        if(field_1056_e >= field_1057_d.size())
        {
            field_1057_d.add(func_760_a(0.0D, 0.0D, 0.0D));
        }
        return ((Vec3D)field_1057_d.get(field_1056_e++)).func_756_e(p_768_0_, p_768_2_, p_768_4_);
    }

    private Vec3D(double p_i50_1_, double p_i50_3_, double p_i50_5_)
    {
        if(p_i50_1_ == -0D)
        {
            p_i50_1_ = 0.0D;
        }
        if(p_i50_3_ == -0D)
        {
            p_i50_3_ = 0.0D;
        }
        if(p_i50_5_ == -0D)
        {
            p_i50_5_ = 0.0D;
        }
        field_1055_a = p_i50_1_;
        field_1054_b = p_i50_3_;
        field_1058_c = p_i50_5_;
    }

    private Vec3D func_756_e(double p_756_1_, double p_756_3_, double p_756_5_)
    {
        field_1055_a = p_756_1_;
        field_1054_b = p_756_3_;
        field_1058_c = p_756_5_;
        return this;
    }

    public Vec3D func_758_b()
    {
        double d = MathHelper.func_583_a(field_1055_a * field_1055_a + field_1054_b * field_1054_b + field_1058_c * field_1058_c);
        if(d < 0.0001D)
        {
            return func_768_b(0.0D, 0.0D, 0.0D);
        } else
        {
            return func_768_b(field_1055_a / d, field_1054_b / d, field_1058_c / d);
        }
    }

    public double func_35570_a(Vec3D p_35570_1_)
    {
        return field_1055_a * p_35570_1_.field_1055_a + field_1054_b * p_35570_1_.field_1054_b + field_1058_c * p_35570_1_.field_1058_c;
    }

    public Vec3D func_757_c(double p_757_1_, double p_757_3_, double p_757_5_)
    {
        return func_768_b(field_1055_a + p_757_1_, field_1054_b + p_757_3_, field_1058_c + p_757_5_);
    }

    public double func_767_a(Vec3D p_767_1_)
    {
        double d = p_767_1_.field_1055_a - field_1055_a;
        double d1 = p_767_1_.field_1054_b - field_1054_b;
        double d2 = p_767_1_.field_1058_c - field_1058_c;
        return (double)MathHelper.func_583_a(d * d + d1 * d1 + d2 * d2);
    }

    public double func_764_b(Vec3D p_764_1_)
    {
        double d = p_764_1_.field_1055_a - field_1055_a;
        double d1 = p_764_1_.field_1054_b - field_1054_b;
        double d2 = p_764_1_.field_1058_c - field_1058_c;
        return d * d + d1 * d1 + d2 * d2;
    }

    public double func_759_d(double p_759_1_, double p_759_3_, double p_759_5_)
    {
        double d = p_759_1_ - field_1055_a;
        double d1 = p_759_3_ - field_1054_b;
        double d2 = p_759_5_ - field_1058_c;
        return d * d + d1 * d1 + d2 * d2;
    }

    public double func_765_c()
    {
        return (double)MathHelper.func_583_a(field_1055_a * field_1055_a + field_1054_b * field_1054_b + field_1058_c * field_1058_c);
    }

    public Vec3D func_766_a(Vec3D p_766_1_, double p_766_2_)
    {
        double d = p_766_1_.field_1055_a - field_1055_a;
        double d1 = p_766_1_.field_1054_b - field_1054_b;
        double d2 = p_766_1_.field_1058_c - field_1058_c;
        if(d * d < 1.0000000116860974E-07D)
        {
            return null;
        }
        double d3 = (p_766_2_ - field_1055_a) / d;
        if(d3 < 0.0D || d3 > 1.0D)
        {
            return null;
        } else
        {
            return func_768_b(field_1055_a + d * d3, field_1054_b + d1 * d3, field_1058_c + d2 * d3);
        }
    }

    public Vec3D func_763_b(Vec3D p_763_1_, double p_763_2_)
    {
        double d = p_763_1_.field_1055_a - field_1055_a;
        double d1 = p_763_1_.field_1054_b - field_1054_b;
        double d2 = p_763_1_.field_1058_c - field_1058_c;
        if(d1 * d1 < 1.0000000116860974E-07D)
        {
            return null;
        }
        double d3 = (p_763_2_ - field_1054_b) / d1;
        if(d3 < 0.0D || d3 > 1.0D)
        {
            return null;
        } else
        {
            return func_768_b(field_1055_a + d * d3, field_1054_b + d1 * d3, field_1058_c + d2 * d3);
        }
    }

    public Vec3D func_762_c(Vec3D p_762_1_, double p_762_2_)
    {
        double d = p_762_1_.field_1055_a - field_1055_a;
        double d1 = p_762_1_.field_1054_b - field_1054_b;
        double d2 = p_762_1_.field_1058_c - field_1058_c;
        if(d2 * d2 < 1.0000000116860974E-07D)
        {
            return null;
        }
        double d3 = (p_762_2_ - field_1058_c) / d2;
        if(d3 < 0.0D || d3 > 1.0D)
        {
            return null;
        } else
        {
            return func_768_b(field_1055_a + d * d3, field_1054_b + d1 * d3, field_1058_c + d2 * d3);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(field_1055_a).append(", ").append(field_1054_b).append(", ").append(field_1058_c).append(")").toString();
    }

    public void func_35571_a(float p_35571_1_)
    {
        float f = MathHelper.func_582_b(p_35571_1_);
        float f1 = MathHelper.func_585_a(p_35571_1_);
        double d = field_1055_a;
        double d1 = field_1054_b * (double)f + field_1058_c * (double)f1;
        double d2 = field_1058_c * (double)f - field_1054_b * (double)f1;
        field_1055_a = d;
        field_1054_b = d1;
        field_1058_c = d2;
    }

    public void func_35572_b(float p_35572_1_)
    {
        float f = MathHelper.func_582_b(p_35572_1_);
        float f1 = MathHelper.func_585_a(p_35572_1_);
        double d = field_1055_a * (double)f + field_1058_c * (double)f1;
        double d1 = field_1054_b;
        double d2 = field_1058_c * (double)f - field_1055_a * (double)f1;
        field_1055_a = d;
        field_1054_b = d1;
        field_1058_c = d2;
    }

}
