// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, IBlockAccess, 
//            Vec3D, AxisAlignedBB, Entity

public abstract class BlockFluid extends Block
{

    protected BlockFluid(int p_i419_1_, Material p_i419_2_)
    {
        super(p_i419_1_, (p_i419_2_ != Material.field_520_g ? 12 : 14) * 16 + 13, p_i419_2_);
        float f = 0.0F;
        float f1 = 0.0F;
        func_229_a(0.0F + f1, 0.0F + f, 0.0F + f1, 1.0F + f1, 1.0F + f, 1.0F + f1);
        func_231_a(true);
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int p_48127_4_)
    {
        return field_553_bn != Material.field_520_g;
    }

    public static float func_299_b(int p_299_0_)
    {
        if(p_299_0_ >= 8)
        {
            p_299_0_ = 0;
        }
        float f = (float)(p_299_0_ + 1) / 9F;
        return f;
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 0 || p_241_1_ == 1)
        {
            return field_575_bb;
        } else
        {
            return field_575_bb + 1;
        }
    }

    protected int func_301_g(World p_301_1_, int p_301_2_, int p_301_3_, int p_301_4_)
    {
        if(p_301_1_.func_443_c(p_301_2_, p_301_3_, p_301_4_) != field_553_bn)
        {
            return -1;
        } else
        {
            return p_301_1_.func_446_b(p_301_2_, p_301_3_, p_301_4_);
        }
    }

    protected int func_303_b(IBlockAccess p_303_1_, int p_303_2_, int p_303_3_, int p_303_4_)
    {
        if(p_303_1_.func_443_c(p_303_2_, p_303_3_, p_303_4_) != field_553_bn)
        {
            return -1;
        }
        int i = p_303_1_.func_446_b(p_303_2_, p_303_3_, p_303_4_);
        if(i >= 8)
        {
            i = 0;
        }
        return i;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_243_a(int p_243_1_, boolean p_243_2_)
    {
        return p_243_2_ && p_243_1_ == 0;
    }

    public boolean func_253_a(IBlockAccess p_253_1_, int p_253_2_, int p_253_3_, int p_253_4_, int p_253_5_)
    {
        Material material = p_253_1_.func_443_c(p_253_2_, p_253_3_, p_253_4_);
        if(material == field_553_bn)
        {
            return false;
        }
        if(p_253_5_ == 1)
        {
            return true;
        }
        if(material == Material.field_509_r)
        {
            return false;
        } else
        {
            return super.func_253_a(p_253_1_, p_253_2_, p_253_3_, p_253_4_, p_253_5_);
        }
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public int func_40161_b()
    {
        return 4;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return 0;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    private Vec3D func_298_c(IBlockAccess p_298_1_, int p_298_2_, int p_298_3_, int p_298_4_)
    {
        Vec3D vec3d = Vec3D.func_768_b(0.0D, 0.0D, 0.0D);
        int i = func_303_b(p_298_1_, p_298_2_, p_298_3_, p_298_4_);
        for(int j = 0; j < 4; j++)
        {
            int k = p_298_2_;
            int l = p_298_3_;
            int i1 = p_298_4_;
            if(j == 0)
            {
                k--;
            }
            if(j == 1)
            {
                i1--;
            }
            if(j == 2)
            {
                k++;
            }
            if(j == 3)
            {
                i1++;
            }
            int j1 = func_303_b(p_298_1_, k, l, i1);
            if(j1 < 0)
            {
                if(p_298_1_.func_443_c(k, l, i1).func_218_c())
                {
                    continue;
                }
                j1 = func_303_b(p_298_1_, k, l - 1, i1);
                if(j1 >= 0)
                {
                    int k1 = j1 - (i - 8);
                    vec3d = vec3d.func_757_c((k - p_298_2_) * k1, (l - p_298_3_) * k1, (i1 - p_298_4_) * k1);
                }
                continue;
            }
            if(j1 >= 0)
            {
                int l1 = j1 - i;
                vec3d = vec3d.func_757_c((k - p_298_2_) * l1, (l - p_298_3_) * l1, (i1 - p_298_4_) * l1);
            }
        }

        if(p_298_1_.func_446_b(p_298_2_, p_298_3_, p_298_4_) >= 8)
        {
            boolean flag = false;
            if(flag || func_253_a(p_298_1_, p_298_2_, p_298_3_, p_298_4_ - 1, 2))
            {
                flag = true;
            }
            if(flag || func_253_a(p_298_1_, p_298_2_, p_298_3_, p_298_4_ + 1, 3))
            {
                flag = true;
            }
            if(flag || func_253_a(p_298_1_, p_298_2_ - 1, p_298_3_, p_298_4_, 4))
            {
                flag = true;
            }
            if(flag || func_253_a(p_298_1_, p_298_2_ + 1, p_298_3_, p_298_4_, 5))
            {
                flag = true;
            }
            if(flag || func_253_a(p_298_1_, p_298_2_, p_298_3_ + 1, p_298_4_ - 1, 2))
            {
                flag = true;
            }
            if(flag || func_253_a(p_298_1_, p_298_2_, p_298_3_ + 1, p_298_4_ + 1, 3))
            {
                flag = true;
            }
            if(flag || func_253_a(p_298_1_, p_298_2_ - 1, p_298_3_ + 1, p_298_4_, 4))
            {
                flag = true;
            }
            if(flag || func_253_a(p_298_1_, p_298_2_ + 1, p_298_3_ + 1, p_298_4_, 5))
            {
                flag = true;
            }
            if(flag)
            {
                vec3d = vec3d.func_758_b().func_757_c(0.0D, -6D, 0.0D);
            }
        }
        vec3d = vec3d.func_758_b();
        return vec3d;
    }

    public void func_230_a(World p_230_1_, int p_230_2_, int p_230_3_, int p_230_4_, Entity p_230_5_, Vec3D p_230_6_)
    {
        Vec3D vec3d = func_298_c(p_230_1_, p_230_2_, p_230_3_, p_230_4_);
        p_230_6_.field_1055_a += vec3d.field_1055_a;
        p_230_6_.field_1054_b += vec3d.field_1054_b;
        p_230_6_.field_1058_c += vec3d.field_1058_c;
    }

    public int func_4028_b()
    {
        if(field_553_bn == Material.field_521_f)
        {
            return 5;
        }
        return field_553_bn != Material.field_520_g ? 0 : 30;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        super.func_221_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_5_);
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        func_302_i(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        func_302_i(p_234_1_, p_234_2_, p_234_3_, p_234_4_);
    }

    private void func_302_i(World p_302_1_, int p_302_2_, int p_302_3_, int p_302_4_)
    {
        if(p_302_1_.func_444_a(p_302_2_, p_302_3_, p_302_4_) != field_573_bc)
        {
            return;
        }
        if(field_553_bn == Material.field_520_g)
        {
            boolean flag = false;
            if(flag || p_302_1_.func_443_c(p_302_2_, p_302_3_, p_302_4_ - 1) == Material.field_521_f)
            {
                flag = true;
            }
            if(flag || p_302_1_.func_443_c(p_302_2_, p_302_3_, p_302_4_ + 1) == Material.field_521_f)
            {
                flag = true;
            }
            if(flag || p_302_1_.func_443_c(p_302_2_ - 1, p_302_3_, p_302_4_) == Material.field_521_f)
            {
                flag = true;
            }
            if(flag || p_302_1_.func_443_c(p_302_2_ + 1, p_302_3_, p_302_4_) == Material.field_521_f)
            {
                flag = true;
            }
            if(flag || p_302_1_.func_443_c(p_302_2_, p_302_3_ + 1, p_302_4_) == Material.field_521_f)
            {
                flag = true;
            }
            if(flag)
            {
                int i = p_302_1_.func_446_b(p_302_2_, p_302_3_, p_302_4_);
                if(i == 0)
                {
                    p_302_1_.func_508_d(p_302_2_, p_302_3_, p_302_4_, Block.field_602_aq.field_573_bc);
                } else
                if(i <= 4)
                {
                    p_302_1_.func_508_d(p_302_2_, p_302_3_, p_302_4_, Block.field_532_x.field_573_bc);
                }
                func_300_h(p_302_1_, p_302_2_, p_302_3_, p_302_4_);
            }
        }
    }

    protected void func_300_h(World p_300_1_, int p_300_2_, int p_300_3_, int p_300_4_)
    {
        p_300_1_.func_502_a((float)p_300_2_ + 0.5F, (float)p_300_3_ + 0.5F, (float)p_300_4_ + 0.5F, "random.fizz", 0.5F, 2.6F + (p_300_1_.field_803_m.nextFloat() - p_300_1_.field_803_m.nextFloat()) * 0.8F);
        for(int i = 0; i < 8; i++)
        {
            p_300_1_.func_514_a("largesmoke", (double)p_300_2_ + Math.random(), (double)p_300_3_ + 1.2D, (double)p_300_4_ + Math.random(), 0.0D, 0.0D, 0.0D);
        }

    }
}
