// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Path, IntHashMap, PathPoint, Entity, 
//            AxisAlignedBB, MathHelper, IBlockAccess, Block, 
//            Material, PathEntity

public class PathFinder
{

    private IBlockAccess field_941_a;
    private Path field_940_b;
    private IntHashMap field_943_c;
    private PathPoint field_942_d[];
    private boolean field_48412_e;
    private boolean field_48410_f;
    private boolean field_48411_g;
    private boolean field_48413_h;

    public PathFinder(IBlockAccess p_i1033_1_, boolean p_i1033_2_, boolean p_i1033_3_, boolean p_i1033_4_, boolean p_i1033_5_)
    {
        field_940_b = new Path();
        field_943_c = new IntHashMap();
        field_942_d = new PathPoint[32];
        field_941_a = p_i1033_1_;
        field_48412_e = p_i1033_2_;
        field_48410_f = p_i1033_3_;
        field_48411_g = p_i1033_4_;
        field_48413_h = p_i1033_5_;
    }

    public PathEntity func_657_a(Entity p_657_1_, Entity p_657_2_, float p_657_3_)
    {
        return func_652_a(p_657_1_, p_657_2_.field_322_l, p_657_2_.field_312_v.field_963_b, p_657_2_.field_320_n, p_657_3_);
    }

    public PathEntity func_651_a(Entity p_651_1_, int p_651_2_, int p_651_3_, int p_651_4_, float p_651_5_)
    {
        return func_652_a(p_651_1_, (float)p_651_2_ + 0.5F, (float)p_651_3_ + 0.5F, (float)p_651_4_ + 0.5F, p_651_5_);
    }

    private PathEntity func_652_a(Entity p_652_1_, double p_652_2_, double p_652_4_, double p_652_6_, 
            float p_652_8_)
    {
        field_940_b.func_417_a();
        field_943_c.func_551_a();
        boolean flag = field_48411_g;
        int i = MathHelper.func_584_b(p_652_1_.field_312_v.field_963_b + 0.5D);
        if(field_48413_h && p_652_1_.func_27011_Z())
        {
            i = (int)p_652_1_.field_312_v.field_963_b;
            for(int j = field_941_a.func_444_a(MathHelper.func_584_b(p_652_1_.field_322_l), i, MathHelper.func_584_b(p_652_1_.field_320_n)); j == Block.field_598_B.field_573_bc || j == Block.field_596_C.field_573_bc; j = field_941_a.func_444_a(MathHelper.func_584_b(p_652_1_.field_322_l), i, MathHelper.func_584_b(p_652_1_.field_320_n)))
            {
                i++;
            }

            flag = field_48411_g;
            field_48411_g = false;
        } else
        {
            i = MathHelper.func_584_b(p_652_1_.field_312_v.field_963_b + 0.5D);
        }
        PathPoint pathpoint = func_655_a(MathHelper.func_584_b(p_652_1_.field_312_v.field_964_a), i, MathHelper.func_584_b(p_652_1_.field_312_v.field_970_c));
        PathPoint pathpoint1 = func_655_a(MathHelper.func_584_b(p_652_2_ - (double)(p_652_1_.field_300_D / 2.0F)), MathHelper.func_584_b(p_652_4_), MathHelper.func_584_b(p_652_6_ - (double)(p_652_1_.field_300_D / 2.0F)));
        PathPoint pathpoint2 = new PathPoint(MathHelper.func_588_d(p_652_1_.field_300_D + 1.0F), MathHelper.func_588_d(p_652_1_.field_298_E + 1.0F), MathHelper.func_588_d(p_652_1_.field_300_D + 1.0F));
        PathEntity pathentity = func_656_a(p_652_1_, pathpoint, pathpoint1, pathpoint2, p_652_8_);
        field_48411_g = flag;
        return pathentity;
    }

    private PathEntity func_656_a(Entity p_656_1_, PathPoint p_656_2_, PathPoint p_656_3_, PathPoint p_656_4_, float p_656_5_)
    {
        p_656_2_.field_1011_f = 0.0F;
        p_656_2_.field_1010_g = p_656_2_.func_731_a(p_656_3_);
        p_656_2_.field_1009_h = p_656_2_.field_1010_g;
        field_940_b.func_417_a();
        field_940_b.func_413_a(p_656_2_);
        PathPoint pathpoint = p_656_2_;
        while(!field_940_b.func_418_c()) 
        {
            PathPoint pathpoint1 = field_940_b.func_415_b();
            if(pathpoint1.equals(p_656_3_))
            {
                return func_653_a(p_656_2_, p_656_3_);
            }
            if(pathpoint1.func_731_a(p_656_3_) < pathpoint.func_731_a(p_656_3_))
            {
                pathpoint = pathpoint1;
            }
            pathpoint1.field_1007_j = true;
            int i = func_654_b(p_656_1_, pathpoint1, p_656_4_, p_656_3_, p_656_5_);
            int j = 0;
            while(j < i) 
            {
                PathPoint pathpoint2 = field_942_d[j];
                float f = pathpoint1.field_1011_f + pathpoint1.func_731_a(pathpoint2);
                if(!pathpoint2.func_730_a() || f < pathpoint2.field_1011_f)
                {
                    pathpoint2.field_1008_i = pathpoint1;
                    pathpoint2.field_1011_f = f;
                    pathpoint2.field_1010_g = pathpoint2.func_731_a(p_656_3_);
                    if(pathpoint2.func_730_a())
                    {
                        field_940_b.func_414_a(pathpoint2, pathpoint2.field_1011_f + pathpoint2.field_1010_g);
                    } else
                    {
                        pathpoint2.field_1009_h = pathpoint2.field_1011_f + pathpoint2.field_1010_g;
                        field_940_b.func_413_a(pathpoint2);
                    }
                }
                j++;
            }
        }
        if(pathpoint == p_656_2_)
        {
            return null;
        } else
        {
            return func_653_a(p_656_2_, pathpoint);
        }
    }

    private int func_654_b(Entity p_654_1_, PathPoint p_654_2_, PathPoint p_654_3_, PathPoint p_654_4_, float p_654_5_)
    {
        int i = 0;
        int j = 0;
        if(func_649_a(p_654_1_, p_654_2_.field_1016_a, p_654_2_.field_1015_b + 1, p_654_2_.field_1014_c, p_654_3_) == 1)
        {
            j = 1;
        }
        PathPoint pathpoint = func_650_a(p_654_1_, p_654_2_.field_1016_a, p_654_2_.field_1015_b, p_654_2_.field_1014_c + 1, p_654_3_, j);
        PathPoint pathpoint1 = func_650_a(p_654_1_, p_654_2_.field_1016_a - 1, p_654_2_.field_1015_b, p_654_2_.field_1014_c, p_654_3_, j);
        PathPoint pathpoint2 = func_650_a(p_654_1_, p_654_2_.field_1016_a + 1, p_654_2_.field_1015_b, p_654_2_.field_1014_c, p_654_3_, j);
        PathPoint pathpoint3 = func_650_a(p_654_1_, p_654_2_.field_1016_a, p_654_2_.field_1015_b, p_654_2_.field_1014_c - 1, p_654_3_, j);
        if(pathpoint != null && !pathpoint.field_1007_j && pathpoint.func_731_a(p_654_4_) < p_654_5_)
        {
            field_942_d[i++] = pathpoint;
        }
        if(pathpoint1 != null && !pathpoint1.field_1007_j && pathpoint1.func_731_a(p_654_4_) < p_654_5_)
        {
            field_942_d[i++] = pathpoint1;
        }
        if(pathpoint2 != null && !pathpoint2.field_1007_j && pathpoint2.func_731_a(p_654_4_) < p_654_5_)
        {
            field_942_d[i++] = pathpoint2;
        }
        if(pathpoint3 != null && !pathpoint3.field_1007_j && pathpoint3.func_731_a(p_654_4_) < p_654_5_)
        {
            field_942_d[i++] = pathpoint3;
        }
        return i;
    }

    private PathPoint func_650_a(Entity p_650_1_, int p_650_2_, int p_650_3_, int p_650_4_, PathPoint p_650_5_, int p_650_6_)
    {
        PathPoint pathpoint = null;
        int i = func_649_a(p_650_1_, p_650_2_, p_650_3_, p_650_4_, p_650_5_);
        if(i == 2)
        {
            return func_655_a(p_650_2_, p_650_3_, p_650_4_);
        }
        if(i == 1)
        {
            pathpoint = func_655_a(p_650_2_, p_650_3_, p_650_4_);
        }
        if(pathpoint == null && p_650_6_ > 0 && i != -3 && i != -4 && func_649_a(p_650_1_, p_650_2_, p_650_3_ + p_650_6_, p_650_4_, p_650_5_) == 1)
        {
            pathpoint = func_655_a(p_650_2_, p_650_3_ + p_650_6_, p_650_4_);
            p_650_3_ += p_650_6_;
        }
        if(pathpoint != null)
        {
            int j = 0;
            int k = 0;
            do
            {
                if(p_650_3_ <= 0)
                {
                    break;
                }
                k = func_649_a(p_650_1_, p_650_2_, p_650_3_ - 1, p_650_4_, p_650_5_);
                if(field_48411_g && k == -1)
                {
                    return null;
                }
                if(k != 1)
                {
                    break;
                }
                if(++j >= 4)
                {
                    return null;
                }
                if(--p_650_3_ > 0)
                {
                    pathpoint = func_655_a(p_650_2_, p_650_3_, p_650_4_);
                }
            } while(true);
            if(k == -2)
            {
                return null;
            }
        }
        return pathpoint;
    }

    private final PathPoint func_655_a(int p_655_1_, int p_655_2_, int p_655_3_)
    {
        int i = PathPoint.func_22203_a(p_655_1_, p_655_2_, p_655_3_);
        PathPoint pathpoint = (PathPoint)field_943_c.func_550_a(i);
        if(pathpoint == null)
        {
            pathpoint = new PathPoint(p_655_1_, p_655_2_, p_655_3_);
            field_943_c.func_554_a(i, pathpoint);
        }
        return pathpoint;
    }

    private int func_649_a(Entity p_649_1_, int p_649_2_, int p_649_3_, int p_649_4_, PathPoint p_649_5_)
    {
        boolean flag = false;
        for(int i = p_649_2_; i < p_649_2_ + p_649_5_.field_1016_a; i++)
        {
            for(int j = p_649_3_; j < p_649_3_ + p_649_5_.field_1015_b; j++)
            {
                for(int k = p_649_4_; k < p_649_4_ + p_649_5_.field_1014_c; k++)
                {
                    int l = field_941_a.func_444_a(i, j, k);
                    if(l <= 0)
                    {
                        continue;
                    }
                    if(l == Block.field_28030_bl.field_573_bc)
                    {
                        flag = true;
                    } else
                    if(l == Block.field_598_B.field_573_bc || l == Block.field_596_C.field_573_bc)
                    {
                        if(!field_48411_g)
                        {
                            flag = true;
                        } else
                        {
                            return -1;
                        }
                    } else
                    if(!field_48412_e && l == Block.field_639_aF.field_573_bc)
                    {
                        return 0;
                    }
                    Block block = Block.field_542_n[l];
                    if(block.func_48127_b(field_941_a, i, j, k) || field_48410_f && l == Block.field_639_aF.field_573_bc)
                    {
                        continue;
                    }
                    if(l == Block.field_9050_aZ.field_573_bc || l == Block.field_35044_bw.field_573_bc)
                    {
                        return -3;
                    }
                    if(l == Block.field_28030_bl.field_573_bc)
                    {
                        return -4;
                    }
                    Material material = block.field_553_bn;
                    if(material == Material.field_520_g)
                    {
                        if(!p_649_1_.func_112_q())
                        {
                            return -2;
                        }
                    } else
                    {
                        return 0;
                    }
                }

            }

        }

        return flag ? 2 : 1;
    }

    private PathEntity func_653_a(PathPoint p_653_1_, PathPoint p_653_2_)
    {
        int i = 1;
        for(PathPoint pathpoint = p_653_2_; pathpoint.field_1008_i != null; pathpoint = pathpoint.field_1008_i)
        {
            i++;
        }

        PathPoint apathpoint[] = new PathPoint[i];
        PathPoint pathpoint1 = p_653_2_;
        for(apathpoint[--i] = pathpoint1; pathpoint1.field_1008_i != null; apathpoint[--i] = pathpoint1)
        {
            pathpoint1 = pathpoint1.field_1008_i;
        }

        return new PathEntity(apathpoint);
    }
}
