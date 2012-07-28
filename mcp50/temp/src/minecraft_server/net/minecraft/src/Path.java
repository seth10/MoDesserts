// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            PathPoint

public class Path
{

    private PathPoint field_744_a[];
    private int field_743_b;

    public Path()
    {
        field_744_a = new PathPoint[1024];
        field_743_b = 0;
    }

    public PathPoint func_413_a(PathPoint p_413_1_)
    {
        if(p_413_1_.field_1012_e >= 0)
        {
            throw new IllegalStateException("OW KNOWS!");
        }
        if(field_743_b == field_744_a.length)
        {
            PathPoint apathpoint[] = new PathPoint[field_743_b << 1];
            System.arraycopy(field_744_a, 0, apathpoint, 0, field_743_b);
            field_744_a = apathpoint;
        }
        field_744_a[field_743_b] = p_413_1_;
        p_413_1_.field_1012_e = field_743_b;
        func_412_a(field_743_b++);
        return p_413_1_;
    }

    public void func_417_a()
    {
        field_743_b = 0;
    }

    public PathPoint func_415_b()
    {
        PathPoint pathpoint = field_744_a[0];
        field_744_a[0] = field_744_a[--field_743_b];
        field_744_a[field_743_b] = null;
        if(field_743_b > 0)
        {
            func_416_b(0);
        }
        pathpoint.field_1012_e = -1;
        return pathpoint;
    }

    public void func_414_a(PathPoint p_414_1_, float p_414_2_)
    {
        float f = p_414_1_.field_1009_h;
        p_414_1_.field_1009_h = p_414_2_;
        if(p_414_2_ < f)
        {
            func_412_a(p_414_1_.field_1012_e);
        } else
        {
            func_416_b(p_414_1_.field_1012_e);
        }
    }

    private void func_412_a(int p_412_1_)
    {
        PathPoint pathpoint = field_744_a[p_412_1_];
        float f = pathpoint.field_1009_h;
        do
        {
            if(p_412_1_ <= 0)
            {
                break;
            }
            int i = p_412_1_ - 1 >> 1;
            PathPoint pathpoint1 = field_744_a[i];
            if(f >= pathpoint1.field_1009_h)
            {
                break;
            }
            field_744_a[p_412_1_] = pathpoint1;
            pathpoint1.field_1012_e = p_412_1_;
            p_412_1_ = i;
        } while(true);
        field_744_a[p_412_1_] = pathpoint;
        pathpoint.field_1012_e = p_412_1_;
    }

    private void func_416_b(int p_416_1_)
    {
        PathPoint pathpoint = field_744_a[p_416_1_];
        float f = pathpoint.field_1009_h;
        do
        {
            int i = 1 + (p_416_1_ << 1);
            int j = i + 1;
            if(i >= field_743_b)
            {
                break;
            }
            PathPoint pathpoint1 = field_744_a[i];
            float f1 = pathpoint1.field_1009_h;
            PathPoint pathpoint2;
            float f2;
            if(j >= field_743_b)
            {
                pathpoint2 = null;
                f2 = (1.0F / 0.0F);
            } else
            {
                pathpoint2 = field_744_a[j];
                f2 = pathpoint2.field_1009_h;
            }
            if(f1 < f2)
            {
                if(f1 >= f)
                {
                    break;
                }
                field_744_a[p_416_1_] = pathpoint1;
                pathpoint1.field_1012_e = p_416_1_;
                p_416_1_ = i;
                continue;
            }
            if(f2 >= f)
            {
                break;
            }
            field_744_a[p_416_1_] = pathpoint2;
            pathpoint2.field_1012_e = p_416_1_;
            p_416_1_ = j;
        } while(true);
        field_744_a[p_416_1_] = pathpoint;
        pathpoint.field_1012_e = p_416_1_;
    }

    public boolean func_418_c()
    {
        return field_743_b == 0;
    }
}
