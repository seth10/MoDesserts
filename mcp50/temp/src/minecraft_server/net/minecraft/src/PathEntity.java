// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            PathPoint, Entity, Vec3D

public class PathEntity
{

    private final PathPoint field_1004_b[];
    private int field_48430_b;
    private int field_1005_a;

    public PathEntity(PathPoint p_i87_1_[])
    {
        field_1004_b = p_i87_1_;
        field_1005_a = p_i87_1_.length;
    }

    public void func_728_a()
    {
        field_48430_b++;
    }

    public boolean func_729_b()
    {
        return field_48430_b >= field_1005_a;
    }

    public PathPoint func_48425_c()
    {
        if(field_1005_a > 0)
        {
            return field_1004_b[field_1005_a - 1];
        } else
        {
            return null;
        }
    }

    public PathPoint func_48429_a(int p_48429_1_)
    {
        return field_1004_b[p_48429_1_];
    }

    public int func_48424_d()
    {
        return field_1005_a;
    }

    public void func_48421_b(int p_48421_1_)
    {
        field_1005_a = p_48421_1_;
    }

    public int func_48423_e()
    {
        return field_48430_b;
    }

    public void func_48422_c(int p_48422_1_)
    {
        field_48430_b = p_48422_1_;
    }

    public Vec3D func_48428_a(Entity p_48428_1_, int p_48428_2_)
    {
        double d = (double)field_1004_b[p_48428_2_].field_1016_a + (double)(int)(p_48428_1_.field_300_D + 1.0F) * 0.5D;
        double d1 = field_1004_b[p_48428_2_].field_1015_b;
        double d2 = (double)field_1004_b[p_48428_2_].field_1014_c + (double)(int)(p_48428_1_.field_300_D + 1.0F) * 0.5D;
        return Vec3D.func_768_b(d, d1, d2);
    }

    public Vec3D func_48420_a(Entity p_48420_1_)
    {
        return func_48428_a(p_48420_1_, field_48430_b);
    }

    public boolean func_48427_a(PathEntity p_48427_1_)
    {
        if(p_48427_1_ == null)
        {
            return false;
        }
        if(p_48427_1_.field_1004_b.length != field_1004_b.length)
        {
            return false;
        }
        for(int i = 0; i < field_1004_b.length; i++)
        {
            if(field_1004_b[i].field_1016_a != p_48427_1_.field_1004_b[i].field_1016_a || field_1004_b[i].field_1015_b != p_48427_1_.field_1004_b[i].field_1015_b || field_1004_b[i].field_1014_c != p_48427_1_.field_1004_b[i].field_1014_c)
            {
                return false;
            }
        }

        return true;
    }

    public boolean func_48426_a(Vec3D p_48426_1_)
    {
        PathPoint pathpoint = func_48425_c();
        if(pathpoint == null)
        {
            return false;
        } else
        {
            return pathpoint.field_1016_a == (int)p_48426_1_.field_1055_a && pathpoint.field_1014_c == (int)p_48426_1_.field_1058_c;
        }
    }
}
