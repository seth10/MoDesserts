// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Vec3D, MathHelper, World, PathEntity, 
//            EntityLiving, EntityMoveHelper, PathPoint, AxisAlignedBB, 
//            Block, Material

public class PathNavigate
{

    private EntityLiving field_46039_a;
    private World field_46037_b;
    private PathEntity field_46038_c;
    private float field_46036_d;
    private float field_48672_e;
    private boolean field_48670_f;
    private int field_48671_g;
    private int field_48677_h;
    private Vec3D field_48678_i;
    private boolean field_48675_j;
    private boolean field_48676_k;
    private boolean field_48673_l;
    private boolean field_48674_m;

    public PathNavigate(EntityLiving p_i1092_1_, World p_i1092_2_, float p_i1092_3_)
    {
        field_48670_f = false;
        field_48678_i = Vec3D.func_760_a(0.0D, 0.0D, 0.0D);
        field_48675_j = true;
        field_48676_k = false;
        field_48673_l = false;
        field_48674_m = false;
        field_46039_a = p_i1092_1_;
        field_46037_b = p_i1092_2_;
        field_48672_e = p_i1092_3_;
    }

    public void func_48656_a(boolean p_48656_1_)
    {
        field_48673_l = p_48656_1_;
    }

    public boolean func_48649_a()
    {
        return field_48673_l;
    }

    public void func_48663_b(boolean p_48663_1_)
    {
        field_48676_k = p_48663_1_;
    }

    public void func_48655_c(boolean p_48655_1_)
    {
        field_48675_j = p_48655_1_;
    }

    public boolean func_48657_b()
    {
        return field_48676_k;
    }

    public void func_48669_d(boolean p_48669_1_)
    {
        field_48670_f = p_48669_1_;
    }

    public void func_48654_a(float p_48654_1_)
    {
        field_46036_d = p_48654_1_;
    }

    public void func_48660_e(boolean p_48660_1_)
    {
        field_48674_m = p_48660_1_;
    }

    public PathEntity func_48650_a(double p_48650_1_, double p_48650_3_, double p_48650_5_)
    {
        if(!func_48651_j())
        {
            return null;
        } else
        {
            return field_46037_b.func_48088_a(field_46039_a, MathHelper.func_584_b(p_48650_1_), (int)p_48650_3_, MathHelper.func_584_b(p_48650_5_), field_48672_e, field_48675_j, field_48676_k, field_48673_l, field_48674_m);
        }
    }

    public boolean func_48658_a(double p_48658_1_, double p_48658_3_, double p_48658_5_, float p_48658_7_)
    {
        PathEntity pathentity = func_48650_a(MathHelper.func_584_b(p_48658_1_), (int)p_48658_3_, MathHelper.func_584_b(p_48658_5_));
        return func_48647_a(pathentity, p_48658_7_);
    }

    public PathEntity func_48661_a(EntityLiving p_48661_1_)
    {
        if(!func_48651_j())
        {
            return null;
        } else
        {
            return field_46037_b.func_48083_a(field_46039_a, p_48661_1_, field_48672_e, field_48675_j, field_48676_k, field_48673_l, field_48674_m);
        }
    }

    public boolean func_48652_a(EntityLiving p_48652_1_, float p_48652_2_)
    {
        PathEntity pathentity = func_48661_a(p_48652_1_);
        if(pathentity != null)
        {
            return func_48647_a(pathentity, p_48652_2_);
        } else
        {
            return false;
        }
    }

    public boolean func_48647_a(PathEntity p_48647_1_, float p_48647_2_)
    {
        if(p_48647_1_ == null)
        {
            field_46038_c = null;
            return false;
        }
        if(!p_48647_1_.func_48427_a(field_46038_c))
        {
            field_46038_c = p_48647_1_;
        }
        if(field_48670_f)
        {
            func_48667_l();
        }
        if(field_46038_c.func_48424_d() == 0)
        {
            return false;
        } else
        {
            field_46036_d = p_48647_2_;
            Vec3D vec3d = func_48665_h();
            field_48677_h = field_48671_g;
            field_48678_i.field_1055_a = vec3d.field_1055_a;
            field_48678_i.field_1054_b = vec3d.field_1054_b;
            field_48678_i.field_1058_c = vec3d.field_1058_c;
            return true;
        }
    }

    public PathEntity func_48668_c()
    {
        return field_46038_c;
    }

    public void func_46032_a()
    {
        field_48671_g++;
        if(func_46034_b())
        {
            return;
        }
        if(func_48651_j())
        {
            func_48664_g();
        }
        if(func_46034_b())
        {
            return;
        }
        Vec3D vec3d = field_46038_c.func_48420_a(field_46039_a);
        if(vec3d == null)
        {
            return;
        } else
        {
            field_46039_a.func_46012_af().func_48439_a(vec3d.field_1055_a, vec3d.field_1054_b, vec3d.field_1058_c, field_46036_d);
            return;
        }
    }

    private void func_48664_g()
    {
        Vec3D vec3d = func_48665_h();
        int i = field_46038_c.func_48424_d();
        float f = field_46038_c.func_48423_e();
        do
        {
            if(f >= field_46038_c.func_48424_d())
            {
                break;
            }
            if(field_46038_c.func_48429_a(f).field_1015_b != (int)vec3d.field_1054_b)
            {
                i = f;
                break;
            }
            f++;
        } while(true);
        f = field_46039_a.field_300_D * field_46039_a.field_300_D;
        for(int j = field_46038_c.func_48423_e(); j < i; j++)
        {
            if(vec3d.func_764_b(field_46038_c.func_48428_a(field_46039_a, j)) < (double)f)
            {
                field_46038_c.func_48422_c(j + 1);
            }
        }

        int k = (int)Math.ceil(field_46039_a.field_300_D);
        int l = (int)field_46039_a.field_298_E + 1;
        int i1 = k;
        int j1 = i - 1;
        do
        {
            if(j1 < field_46038_c.func_48423_e())
            {
                break;
            }
            if(func_48653_a(vec3d, field_46038_c.func_48428_a(field_46039_a, j1), k, l, i1))
            {
                field_46038_c.func_48422_c(j1);
                break;
            }
            j1--;
        } while(true);
        if(field_48671_g - field_48677_h > 100)
        {
            if(vec3d.func_764_b(field_48678_i) < 2.25D)
            {
                func_48662_f();
            }
            field_48677_h = field_48671_g;
            field_48678_i.field_1055_a = vec3d.field_1055_a;
            field_48678_i.field_1054_b = vec3d.field_1054_b;
            field_48678_i.field_1058_c = vec3d.field_1058_c;
        }
    }

    public boolean func_46034_b()
    {
        return field_46038_c == null || field_46038_c.func_729_b();
    }

    public void func_48662_f()
    {
        field_46038_c = null;
    }

    private Vec3D func_48665_h()
    {
        return Vec3D.func_768_b(field_46039_a.field_322_l, func_48659_i(), field_46039_a.field_320_n);
    }

    private int func_48659_i()
    {
        if(!field_46039_a.func_27011_Z() || !field_48674_m)
        {
            return (int)(field_46039_a.field_312_v.field_963_b + 0.5D);
        }
        int i = (int)field_46039_a.field_312_v.field_963_b;
        int j = field_46037_b.func_444_a(MathHelper.func_584_b(field_46039_a.field_322_l), i, MathHelper.func_584_b(field_46039_a.field_320_n));
        int k = 0;
        while(j == Block.field_598_B.field_573_bc || j == Block.field_596_C.field_573_bc) 
        {
            i++;
            j = field_46037_b.func_444_a(MathHelper.func_584_b(field_46039_a.field_322_l), i, MathHelper.func_584_b(field_46039_a.field_320_n));
            if(++k > 16)
            {
                return (int)field_46039_a.field_312_v.field_963_b;
            }
        }
        return i;
    }

    private boolean func_48651_j()
    {
        return field_46039_a.field_9086_A || field_48674_m && func_48648_k();
    }

    private boolean func_48648_k()
    {
        return field_46039_a.func_27011_Z() || field_46039_a.func_112_q();
    }

    private void func_48667_l()
    {
        if(field_46037_b.func_497_g(MathHelper.func_584_b(field_46039_a.field_322_l), (int)(field_46039_a.field_312_v.field_963_b + 0.5D), MathHelper.func_584_b(field_46039_a.field_320_n)))
        {
            return;
        }
        for(int i = 0; i < field_46038_c.func_48424_d(); i++)
        {
            PathPoint pathpoint = field_46038_c.func_48429_a(i);
            if(field_46037_b.func_497_g(pathpoint.field_1016_a, pathpoint.field_1015_b, pathpoint.field_1014_c))
            {
                field_46038_c.func_48421_b(i - 1);
                return;
            }
        }

    }

    private boolean func_48653_a(Vec3D p_48653_1_, Vec3D p_48653_2_, int p_48653_3_, int p_48653_4_, int p_48653_5_)
    {
        int i = MathHelper.func_584_b(p_48653_1_.field_1055_a);
        int j = MathHelper.func_584_b(p_48653_1_.field_1058_c);
        double d = p_48653_2_.field_1055_a - p_48653_1_.field_1055_a;
        double d1 = p_48653_2_.field_1058_c - p_48653_1_.field_1058_c;
        double d2 = d * d + d1 * d1;
        if(d2 < 1E-08D)
        {
            return false;
        }
        double d3 = 1.0D / Math.sqrt(d2);
        d *= d3;
        d1 *= d3;
        p_48653_3_ += 2;
        p_48653_5_ += 2;
        if(!func_48646_a(i, (int)p_48653_1_.field_1054_b, j, p_48653_3_, p_48653_4_, p_48653_5_, p_48653_1_, d, d1))
        {
            return false;
        }
        p_48653_3_ -= 2;
        p_48653_5_ -= 2;
        double d4 = 1.0D / Math.abs(d);
        double d5 = 1.0D / Math.abs(d1);
        double d6 = (double)(i * 1) - p_48653_1_.field_1055_a;
        double d7 = (double)(j * 1) - p_48653_1_.field_1058_c;
        if(d >= 0.0D)
        {
            d6++;
        }
        if(d1 >= 0.0D)
        {
            d7++;
        }
        d6 /= d;
        d7 /= d1;
        byte byte0 = ((byte)(d >= 0.0D ? 1 : -1));
        byte byte1 = ((byte)(d1 >= 0.0D ? 1 : -1));
        int k = MathHelper.func_584_b(p_48653_2_.field_1055_a);
        int l = MathHelper.func_584_b(p_48653_2_.field_1058_c);
        int i1 = k - i;
        for(int j1 = l - j; i1 * byte0 > 0 || j1 * byte1 > 0;)
        {
            if(d6 < d7)
            {
                d6 += d4;
                i += byte0;
                i1 = k - i;
            } else
            {
                d7 += d5;
                j += byte1;
                j1 = l - j;
            }
            if(!func_48646_a(i, (int)p_48653_1_.field_1054_b, j, p_48653_3_, p_48653_4_, p_48653_5_, p_48653_1_, d, d1))
            {
                return false;
            }
        }

        return true;
    }

    private boolean func_48646_a(int p_48646_1_, int p_48646_2_, int p_48646_3_, int p_48646_4_, int p_48646_5_, int p_48646_6_, Vec3D p_48646_7_, 
            double p_48646_8_, double p_48646_10_)
    {
        int i = p_48646_1_ - p_48646_4_ / 2;
        int j = p_48646_3_ - p_48646_6_ / 2;
        if(!func_48666_b(i, p_48646_2_, j, p_48646_4_, p_48646_5_, p_48646_6_, p_48646_7_, p_48646_8_, p_48646_10_))
        {
            return false;
        }
        for(int k = i; k < i + p_48646_4_; k++)
        {
            for(int l = j; l < j + p_48646_6_; l++)
            {
                double d = ((double)k + 0.5D) - p_48646_7_.field_1055_a;
                double d1 = ((double)l + 0.5D) - p_48646_7_.field_1058_c;
                if(d * p_48646_8_ + d1 * p_48646_10_ < 0.0D)
                {
                    continue;
                }
                int i1 = field_46037_b.func_444_a(k, p_48646_2_ - 1, l);
                if(i1 <= 0)
                {
                    return false;
                }
                Material material = Block.field_542_n[i1].field_553_bn;
                if(material == Material.field_521_f && !field_46039_a.func_27011_Z())
                {
                    return false;
                }
                if(material == Material.field_520_g)
                {
                    return false;
                }
            }

        }

        return true;
    }

    private boolean func_48666_b(int p_48666_1_, int p_48666_2_, int p_48666_3_, int p_48666_4_, int p_48666_5_, int p_48666_6_, Vec3D p_48666_7_, 
            double p_48666_8_, double p_48666_10_)
    {
        for(int i = p_48666_1_; i < p_48666_1_ + p_48666_4_; i++)
        {
            for(int j = p_48666_2_; j < p_48666_2_ + p_48666_5_; j++)
            {
                for(int k = p_48666_3_; k < p_48666_3_ + p_48666_6_; k++)
                {
                    double d = ((double)i + 0.5D) - p_48666_7_.field_1055_a;
                    double d1 = ((double)k + 0.5D) - p_48666_7_.field_1058_c;
                    if(d * p_48666_8_ + d1 * p_48666_10_ < 0.0D)
                    {
                        continue;
                    }
                    int l = field_46037_b.func_444_a(i, j, k);
                    if(l > 0 && !Block.field_542_n[l].func_48127_b(field_46037_b, i, j, k))
                    {
                        return false;
                    }
                }

            }

        }

        return true;
    }
}
