// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFluid, World, Material, WorldProvider, 
//            Block, IBlockAccess

public class BlockFlowing extends BlockFluid
{

    int field_659_a;
    boolean field_658_b[];
    int field_660_c[];

    protected BlockFlowing(int p_i349_1_, Material p_i349_2_)
    {
        super(p_i349_1_, p_i349_2_);
        field_659_a = 0;
        field_658_b = new boolean[4];
        field_660_c = new int[4];
    }

    private void func_30004_i(World p_30004_1_, int p_30004_2_, int p_30004_3_, int p_30004_4_)
    {
        int i = p_30004_1_.func_446_b(p_30004_2_, p_30004_3_, p_30004_4_);
        p_30004_1_.func_470_a(p_30004_2_, p_30004_3_, p_30004_4_, field_573_bc + 1, i);
        p_30004_1_.func_519_b(p_30004_2_, p_30004_3_, p_30004_4_, p_30004_2_, p_30004_3_, p_30004_4_);
        p_30004_1_.func_521_f(p_30004_2_, p_30004_3_, p_30004_4_);
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int p_48127_4_)
    {
        return field_553_bn != Material.field_520_g;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        int i = func_301_g(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
        byte byte0 = 1;
        if(field_553_bn == Material.field_520_g && !p_221_1_.field_4272_q.field_6166_d)
        {
            byte0 = 2;
        }
        boolean flag = true;
        if(i > 0)
        {
            int j = -100;
            field_659_a = 0;
            j = func_307_e(p_221_1_, p_221_2_ - 1, p_221_3_, p_221_4_, j);
            j = func_307_e(p_221_1_, p_221_2_ + 1, p_221_3_, p_221_4_, j);
            j = func_307_e(p_221_1_, p_221_2_, p_221_3_, p_221_4_ - 1, j);
            j = func_307_e(p_221_1_, p_221_2_, p_221_3_, p_221_4_ + 1, j);
            int k = j + byte0;
            if(k >= 8 || j < 0)
            {
                k = -1;
            }
            if(func_301_g(p_221_1_, p_221_2_, p_221_3_ + 1, p_221_4_) >= 0)
            {
                int i1 = func_301_g(p_221_1_, p_221_2_, p_221_3_ + 1, p_221_4_);
                if(i1 >= 8)
                {
                    k = i1;
                } else
                {
                    k = i1 + 8;
                }
            }
            if(field_659_a >= 2 && field_553_bn == Material.field_521_f)
            {
                if(p_221_1_.func_443_c(p_221_2_, p_221_3_ - 1, p_221_4_).func_216_a())
                {
                    k = 0;
                } else
                if(p_221_1_.func_443_c(p_221_2_, p_221_3_ - 1, p_221_4_) == field_553_bn && p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_) == 0)
                {
                    k = 0;
                }
            }
            if(field_553_bn == Material.field_520_g && i < 8 && k < 8 && k > i && p_221_5_.nextInt(4) != 0)
            {
                k = i;
                flag = false;
            }
            if(k != i)
            {
                i = k;
                if(i < 0)
                {
                    p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, 0);
                } else
                {
                    p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, i);
                    p_221_1_.func_22074_c(p_221_2_, p_221_3_, p_221_4_, field_573_bc, func_4028_b());
                    p_221_1_.func_449_g(p_221_2_, p_221_3_, p_221_4_, field_573_bc);
                }
            } else
            if(flag)
            {
                func_30004_i(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
            }
        } else
        {
            func_30004_i(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
        }
        if(func_312_l(p_221_1_, p_221_2_, p_221_3_ - 1, p_221_4_))
        {
            if(field_553_bn == Material.field_520_g && p_221_1_.func_443_c(p_221_2_, p_221_3_ - 1, p_221_4_) == Material.field_521_f)
            {
                p_221_1_.func_508_d(p_221_2_, p_221_3_ - 1, p_221_4_, Block.field_535_u.field_573_bc);
                func_300_h(p_221_1_, p_221_2_, p_221_3_ - 1, p_221_4_);
                return;
            }
            if(i >= 8)
            {
                p_221_1_.func_507_b(p_221_2_, p_221_3_ - 1, p_221_4_, field_573_bc, i);
            } else
            {
                p_221_1_.func_507_b(p_221_2_, p_221_3_ - 1, p_221_4_, field_573_bc, i + 8);
            }
        } else
        if(i >= 0 && (i == 0 || func_309_k(p_221_1_, p_221_2_, p_221_3_ - 1, p_221_4_)))
        {
            boolean aflag[] = func_4035_j(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
            int l = i + byte0;
            if(i >= 8)
            {
                l = 1;
            }
            if(l >= 8)
            {
                return;
            }
            if(aflag[0])
            {
                func_311_f(p_221_1_, p_221_2_ - 1, p_221_3_, p_221_4_, l);
            }
            if(aflag[1])
            {
                func_311_f(p_221_1_, p_221_2_ + 1, p_221_3_, p_221_4_, l);
            }
            if(aflag[2])
            {
                func_311_f(p_221_1_, p_221_2_, p_221_3_, p_221_4_ - 1, l);
            }
            if(aflag[3])
            {
                func_311_f(p_221_1_, p_221_2_, p_221_3_, p_221_4_ + 1, l);
            }
        }
    }

    private void func_311_f(World p_311_1_, int p_311_2_, int p_311_3_, int p_311_4_, int p_311_5_)
    {
        if(func_312_l(p_311_1_, p_311_2_, p_311_3_, p_311_4_))
        {
            int i = p_311_1_.func_444_a(p_311_2_, p_311_3_, p_311_4_);
            if(i > 0)
            {
                if(field_553_bn == Material.field_520_g)
                {
                    func_300_h(p_311_1_, p_311_2_, p_311_3_, p_311_4_);
                } else
                {
                    Block.field_542_n[i].func_247_a_(p_311_1_, p_311_2_, p_311_3_, p_311_4_, p_311_1_.func_446_b(p_311_2_, p_311_3_, p_311_4_), 0);
                }
            }
            p_311_1_.func_507_b(p_311_2_, p_311_3_, p_311_4_, field_573_bc, p_311_5_);
        }
    }

    private int func_4034_a(World p_4034_1_, int p_4034_2_, int p_4034_3_, int p_4034_4_, int p_4034_5_, int p_4034_6_)
    {
        int i = 1000;
        for(int j = 0; j < 4; j++)
        {
            if(j == 0 && p_4034_6_ == 1 || j == 1 && p_4034_6_ == 0 || j == 2 && p_4034_6_ == 3 || j == 3 && p_4034_6_ == 2)
            {
                continue;
            }
            int k = p_4034_2_;
            int l = p_4034_3_;
            int i1 = p_4034_4_;
            if(j == 0)
            {
                k--;
            }
            if(j == 1)
            {
                k++;
            }
            if(j == 2)
            {
                i1--;
            }
            if(j == 3)
            {
                i1++;
            }
            if(func_309_k(p_4034_1_, k, l, i1) || p_4034_1_.func_443_c(k, l, i1) == field_553_bn && p_4034_1_.func_446_b(k, l, i1) == 0)
            {
                continue;
            }
            if(!func_309_k(p_4034_1_, k, l - 1, i1))
            {
                return p_4034_5_;
            }
            if(p_4034_5_ >= 4)
            {
                continue;
            }
            int j1 = func_4034_a(p_4034_1_, k, l, i1, p_4034_5_ + 1, j);
            if(j1 < i)
            {
                i = j1;
            }
        }

        return i;
    }

    private boolean[] func_4035_j(World p_4035_1_, int p_4035_2_, int p_4035_3_, int p_4035_4_)
    {
        for(int i = 0; i < 4; i++)
        {
            field_660_c[i] = 1000;
            int k = p_4035_2_;
            int j1 = p_4035_3_;
            int k1 = p_4035_4_;
            if(i == 0)
            {
                k--;
            }
            if(i == 1)
            {
                k++;
            }
            if(i == 2)
            {
                k1--;
            }
            if(i == 3)
            {
                k1++;
            }
            if(func_309_k(p_4035_1_, k, j1, k1) || p_4035_1_.func_443_c(k, j1, k1) == field_553_bn && p_4035_1_.func_446_b(k, j1, k1) == 0)
            {
                continue;
            }
            if(!func_309_k(p_4035_1_, k, j1 - 1, k1))
            {
                field_660_c[i] = 0;
            } else
            {
                field_660_c[i] = func_4034_a(p_4035_1_, k, j1, k1, 1, i);
            }
        }

        int j = field_660_c[0];
        for(int l = 1; l < 4; l++)
        {
            if(field_660_c[l] < j)
            {
                j = field_660_c[l];
            }
        }

        for(int i1 = 0; i1 < 4; i1++)
        {
            field_658_b[i1] = field_660_c[i1] == j;
        }

        return field_658_b;
    }

    private boolean func_309_k(World p_309_1_, int p_309_2_, int p_309_3_, int p_309_4_)
    {
        int i = p_309_1_.func_444_a(p_309_2_, p_309_3_, p_309_4_);
        if(i == Block.field_639_aF.field_573_bc || i == Block.field_632_aM.field_573_bc || i == Block.field_4084_aE.field_573_bc || i == Block.field_638_aG.field_573_bc || i == Block.field_620_aY.field_573_bc)
        {
            return true;
        }
        if(i == 0)
        {
            return false;
        }
        Material material = Block.field_542_n[i].field_553_bn;
        if(material == Material.field_4212_x)
        {
            return true;
        }
        return material.func_218_c();
    }

    protected int func_307_e(World p_307_1_, int p_307_2_, int p_307_3_, int p_307_4_, int p_307_5_)
    {
        int i = func_301_g(p_307_1_, p_307_2_, p_307_3_, p_307_4_);
        if(i < 0)
        {
            return p_307_5_;
        }
        if(i == 0)
        {
            field_659_a++;
        }
        if(i >= 8)
        {
            i = 0;
        }
        return p_307_5_ >= 0 && i >= p_307_5_ ? p_307_5_ : i;
    }

    private boolean func_312_l(World p_312_1_, int p_312_2_, int p_312_3_, int p_312_4_)
    {
        Material material = p_312_1_.func_443_c(p_312_2_, p_312_3_, p_312_4_);
        if(material == field_553_bn)
        {
            return false;
        }
        if(material == Material.field_520_g)
        {
            return false;
        } else
        {
            return !func_309_k(p_312_1_, p_312_2_, p_312_3_, p_312_4_);
        }
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        super.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        if(p_250_1_.func_444_a(p_250_2_, p_250_3_, p_250_4_) == field_573_bc)
        {
            p_250_1_.func_22074_c(p_250_2_, p_250_3_, p_250_4_, field_573_bc, func_4028_b());
        }
    }
}
