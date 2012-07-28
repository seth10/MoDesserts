// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Vec3D, MovingObjectPosition

public class AxisAlignedBB
{

    private static List field_966_g = new ArrayList();
    private static int field_965_h = 0;
    public double field_964_a;
    public double field_963_b;
    public double field_970_c;
    public double field_969_d;
    public double field_968_e;
    public double field_967_f;

    public static AxisAlignedBB func_698_a(double p_698_0_, double p_698_2_, double p_698_4_, double p_698_6_, 
            double p_698_8_, double p_698_10_)
    {
        return new AxisAlignedBB(p_698_0_, p_698_2_, p_698_4_, p_698_6_, p_698_8_, p_698_10_);
    }

    public static void func_703_a()
    {
        field_965_h = 0;
    }

    public static AxisAlignedBB func_693_b(double p_693_0_, double p_693_2_, double p_693_4_, double p_693_6_, 
            double p_693_8_, double p_693_10_)
    {
        if(field_965_h >= field_966_g.size())
        {
            field_966_g.add(func_698_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D));
        }
        return ((AxisAlignedBB)field_966_g.get(field_965_h++)).func_695_c(p_693_0_, p_693_2_, p_693_4_, p_693_6_, p_693_8_, p_693_10_);
    }

    private AxisAlignedBB(double p_i120_1_, double p_i120_3_, double p_i120_5_, double p_i120_7_, double p_i120_9_, double p_i120_11_)
    {
        field_964_a = p_i120_1_;
        field_963_b = p_i120_3_;
        field_970_c = p_i120_5_;
        field_969_d = p_i120_7_;
        field_968_e = p_i120_9_;
        field_967_f = p_i120_11_;
    }

    public AxisAlignedBB func_695_c(double p_695_1_, double p_695_3_, double p_695_5_, double p_695_7_, double p_695_9_, double p_695_11_)
    {
        field_964_a = p_695_1_;
        field_963_b = p_695_3_;
        field_970_c = p_695_5_;
        field_969_d = p_695_7_;
        field_968_e = p_695_9_;
        field_967_f = p_695_11_;
        return this;
    }

    public AxisAlignedBB func_700_a(double p_700_1_, double p_700_3_, double p_700_5_)
    {
        double d = field_964_a;
        double d1 = field_963_b;
        double d2 = field_970_c;
        double d3 = field_969_d;
        double d4 = field_968_e;
        double d5 = field_967_f;
        if(p_700_1_ < 0.0D)
        {
            d += p_700_1_;
        }
        if(p_700_1_ > 0.0D)
        {
            d3 += p_700_1_;
        }
        if(p_700_3_ < 0.0D)
        {
            d1 += p_700_3_;
        }
        if(p_700_3_ > 0.0D)
        {
            d4 += p_700_3_;
        }
        if(p_700_5_ < 0.0D)
        {
            d2 += p_700_5_;
        }
        if(p_700_5_ > 0.0D)
        {
            d5 += p_700_5_;
        }
        return func_693_b(d, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB func_708_b(double p_708_1_, double p_708_3_, double p_708_5_)
    {
        double d = field_964_a - p_708_1_;
        double d1 = field_963_b - p_708_3_;
        double d2 = field_970_c - p_708_5_;
        double d3 = field_969_d + p_708_1_;
        double d4 = field_968_e + p_708_3_;
        double d5 = field_967_f + p_708_5_;
        return func_693_b(d, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB func_696_c(double p_696_1_, double p_696_3_, double p_696_5_)
    {
        return func_693_b(field_964_a + p_696_1_, field_963_b + p_696_3_, field_970_c + p_696_5_, field_969_d + p_696_1_, field_968_e + p_696_3_, field_967_f + p_696_5_);
    }

    public double func_710_a(AxisAlignedBB p_710_1_, double p_710_2_)
    {
        if(p_710_1_.field_968_e <= field_963_b || p_710_1_.field_963_b >= field_968_e)
        {
            return p_710_2_;
        }
        if(p_710_1_.field_967_f <= field_970_c || p_710_1_.field_970_c >= field_967_f)
        {
            return p_710_2_;
        }
        if(p_710_2_ > 0.0D && p_710_1_.field_969_d <= field_964_a)
        {
            double d = field_964_a - p_710_1_.field_969_d;
            if(d < p_710_2_)
            {
                p_710_2_ = d;
            }
        }
        if(p_710_2_ < 0.0D && p_710_1_.field_964_a >= field_969_d)
        {
            double d1 = field_969_d - p_710_1_.field_964_a;
            if(d1 > p_710_2_)
            {
                p_710_2_ = d1;
            }
        }
        return p_710_2_;
    }

    public double func_701_b(AxisAlignedBB p_701_1_, double p_701_2_)
    {
        if(p_701_1_.field_969_d <= field_964_a || p_701_1_.field_964_a >= field_969_d)
        {
            return p_701_2_;
        }
        if(p_701_1_.field_967_f <= field_970_c || p_701_1_.field_970_c >= field_967_f)
        {
            return p_701_2_;
        }
        if(p_701_2_ > 0.0D && p_701_1_.field_968_e <= field_963_b)
        {
            double d = field_963_b - p_701_1_.field_968_e;
            if(d < p_701_2_)
            {
                p_701_2_ = d;
            }
        }
        if(p_701_2_ < 0.0D && p_701_1_.field_963_b >= field_968_e)
        {
            double d1 = field_968_e - p_701_1_.field_963_b;
            if(d1 > p_701_2_)
            {
                p_701_2_ = d1;
            }
        }
        return p_701_2_;
    }

    public double func_709_c(AxisAlignedBB p_709_1_, double p_709_2_)
    {
        if(p_709_1_.field_969_d <= field_964_a || p_709_1_.field_964_a >= field_969_d)
        {
            return p_709_2_;
        }
        if(p_709_1_.field_968_e <= field_963_b || p_709_1_.field_963_b >= field_968_e)
        {
            return p_709_2_;
        }
        if(p_709_2_ > 0.0D && p_709_1_.field_967_f <= field_970_c)
        {
            double d = field_970_c - p_709_1_.field_967_f;
            if(d < p_709_2_)
            {
                p_709_2_ = d;
            }
        }
        if(p_709_2_ < 0.0D && p_709_1_.field_970_c >= field_967_f)
        {
            double d1 = field_967_f - p_709_1_.field_970_c;
            if(d1 > p_709_2_)
            {
                p_709_2_ = d1;
            }
        }
        return p_709_2_;
    }

    public boolean func_704_a(AxisAlignedBB p_704_1_)
    {
        if(p_704_1_.field_969_d <= field_964_a || p_704_1_.field_964_a >= field_969_d)
        {
            return false;
        }
        if(p_704_1_.field_968_e <= field_963_b || p_704_1_.field_963_b >= field_968_e)
        {
            return false;
        }
        return p_704_1_.field_967_f > field_970_c && p_704_1_.field_970_c < field_967_f;
    }

    public AxisAlignedBB func_702_d(double p_702_1_, double p_702_3_, double p_702_5_)
    {
        field_964_a += p_702_1_;
        field_963_b += p_702_3_;
        field_970_c += p_702_5_;
        field_969_d += p_702_1_;
        field_968_e += p_702_3_;
        field_967_f += p_702_5_;
        return this;
    }

    public boolean func_28183_a(Vec3D p_28183_1_)
    {
        if(p_28183_1_.field_1055_a <= field_964_a || p_28183_1_.field_1055_a >= field_969_d)
        {
            return false;
        }
        if(p_28183_1_.field_1054_b <= field_963_b || p_28183_1_.field_1054_b >= field_968_e)
        {
            return false;
        }
        return p_28183_1_.field_1058_c > field_970_c && p_28183_1_.field_1058_c < field_967_f;
    }

    public AxisAlignedBB func_694_e(double p_694_1_, double p_694_3_, double p_694_5_)
    {
        double d = field_964_a + p_694_1_;
        double d1 = field_963_b + p_694_3_;
        double d2 = field_970_c + p_694_5_;
        double d3 = field_969_d - p_694_1_;
        double d4 = field_968_e - p_694_3_;
        double d5 = field_967_f - p_694_5_;
        return func_693_b(d, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB func_711_b()
    {
        return func_693_b(field_964_a, field_963_b, field_970_c, field_969_d, field_968_e, field_967_f);
    }

    public MovingObjectPosition func_706_a(Vec3D p_706_1_, Vec3D p_706_2_)
    {
        Vec3D vec3d = p_706_1_.func_766_a(p_706_2_, field_964_a);
        Vec3D vec3d1 = p_706_1_.func_766_a(p_706_2_, field_969_d);
        Vec3D vec3d2 = p_706_1_.func_763_b(p_706_2_, field_963_b);
        Vec3D vec3d3 = p_706_1_.func_763_b(p_706_2_, field_968_e);
        Vec3D vec3d4 = p_706_1_.func_762_c(p_706_2_, field_970_c);
        Vec3D vec3d5 = p_706_1_.func_762_c(p_706_2_, field_967_f);
        if(!func_697_a(vec3d))
        {
            vec3d = null;
        }
        if(!func_697_a(vec3d1))
        {
            vec3d1 = null;
        }
        if(!func_705_b(vec3d2))
        {
            vec3d2 = null;
        }
        if(!func_705_b(vec3d3))
        {
            vec3d3 = null;
        }
        if(!func_707_c(vec3d4))
        {
            vec3d4 = null;
        }
        if(!func_707_c(vec3d5))
        {
            vec3d5 = null;
        }
        Vec3D vec3d6 = null;
        if(vec3d != null && (vec3d6 == null || p_706_1_.func_764_b(vec3d) < p_706_1_.func_764_b(vec3d6)))
        {
            vec3d6 = vec3d;
        }
        if(vec3d1 != null && (vec3d6 == null || p_706_1_.func_764_b(vec3d1) < p_706_1_.func_764_b(vec3d6)))
        {
            vec3d6 = vec3d1;
        }
        if(vec3d2 != null && (vec3d6 == null || p_706_1_.func_764_b(vec3d2) < p_706_1_.func_764_b(vec3d6)))
        {
            vec3d6 = vec3d2;
        }
        if(vec3d3 != null && (vec3d6 == null || p_706_1_.func_764_b(vec3d3) < p_706_1_.func_764_b(vec3d6)))
        {
            vec3d6 = vec3d3;
        }
        if(vec3d4 != null && (vec3d6 == null || p_706_1_.func_764_b(vec3d4) < p_706_1_.func_764_b(vec3d6)))
        {
            vec3d6 = vec3d4;
        }
        if(vec3d5 != null && (vec3d6 == null || p_706_1_.func_764_b(vec3d5) < p_706_1_.func_764_b(vec3d6)))
        {
            vec3d6 = vec3d5;
        }
        if(vec3d6 == null)
        {
            return null;
        }
        byte byte0 = -1;
        if(vec3d6 == vec3d)
        {
            byte0 = 4;
        }
        if(vec3d6 == vec3d1)
        {
            byte0 = 5;
        }
        if(vec3d6 == vec3d2)
        {
            byte0 = 0;
        }
        if(vec3d6 == vec3d3)
        {
            byte0 = 1;
        }
        if(vec3d6 == vec3d4)
        {
            byte0 = 2;
        }
        if(vec3d6 == vec3d5)
        {
            byte0 = 3;
        }
        return new MovingObjectPosition(0, 0, 0, byte0, vec3d6);
    }

    private boolean func_697_a(Vec3D p_697_1_)
    {
        if(p_697_1_ == null)
        {
            return false;
        } else
        {
            return p_697_1_.field_1054_b >= field_963_b && p_697_1_.field_1054_b <= field_968_e && p_697_1_.field_1058_c >= field_970_c && p_697_1_.field_1058_c <= field_967_f;
        }
    }

    private boolean func_705_b(Vec3D p_705_1_)
    {
        if(p_705_1_ == null)
        {
            return false;
        } else
        {
            return p_705_1_.field_1055_a >= field_964_a && p_705_1_.field_1055_a <= field_969_d && p_705_1_.field_1058_c >= field_970_c && p_705_1_.field_1058_c <= field_967_f;
        }
    }

    private boolean func_707_c(Vec3D p_707_1_)
    {
        if(p_707_1_ == null)
        {
            return false;
        } else
        {
            return p_707_1_.field_1055_a >= field_964_a && p_707_1_.field_1055_a <= field_969_d && p_707_1_.field_1054_b >= field_963_b && p_707_1_.field_1054_b <= field_968_e;
        }
    }

    public void func_699_b(AxisAlignedBB p_699_1_)
    {
        field_964_a = p_699_1_.field_964_a;
        field_963_b = p_699_1_.field_963_b;
        field_970_c = p_699_1_.field_970_c;
        field_969_d = p_699_1_.field_969_d;
        field_968_e = p_699_1_.field_968_e;
        field_967_f = p_699_1_.field_967_f;
    }

    public String toString()
    {
        return (new StringBuilder()).append("box[").append(field_964_a).append(", ").append(field_963_b).append(", ").append(field_970_c).append(" -> ").append(field_969_d).append(", ").append(field_968_e).append(", ").append(field_967_f).append("]").toString();
    }

}
