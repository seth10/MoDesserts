// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, BlockLeaves, BlockTallGrass, 
//            World, WorldProviderEnd, IBlockAccess, WorldProvider, 
//            BlockPortal, AxisAlignedBB

public class BlockFire extends Block
{

    private int field_646_a[];
    private int field_645_b[];

    protected BlockFire(int p_i606_1_, int p_i606_2_)
    {
        super(p_i606_1_, p_i606_2_, Material.field_515_l);
        field_646_a = new int[256];
        field_645_b = new int[256];
        func_231_a(true);
    }

    public void func_28028_f()
    {
        func_267_a(Block.field_531_y.field_573_bc, 5, 20);
        func_267_a(Block.field_9050_aZ.field_573_bc, 5, 20);
        func_267_a(Block.field_9045_at.field_573_bc, 5, 20);
        func_267_a(Block.field_582_K.field_573_bc, 5, 5);
        func_267_a(Block.field_581_L.field_573_bc, 30, 60);
        func_267_a(Block.field_604_ao.field_573_bc, 30, 20);
        func_267_a(Block.field_605_an.field_573_bc, 15, 100);
        func_267_a(Block.field_9031_X.field_573_bc, 60, 100);
        func_267_a(Block.field_616_ac.field_573_bc, 30, 60);
        func_267_a(Block.field_35045_bv.field_573_bc, 15, 100);
    }

    private void func_267_a(int p_267_1_, int p_267_2_, int p_267_3_)
    {
        field_646_a[p_267_1_] = p_267_2_;
        field_645_b[p_267_1_] = p_267_3_;
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public int func_40161_b()
    {
        return 3;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public int func_4028_b()
    {
        return 30;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        boolean flag = p_221_1_.func_444_a(p_221_2_, p_221_3_ - 1, p_221_4_) == Block.field_4050_bc.field_573_bc;
        if((p_221_1_.field_4272_q instanceof WorldProviderEnd) && p_221_1_.func_444_a(p_221_2_, p_221_3_ - 1, p_221_4_) == Block.field_4064_A.field_573_bc)
        {
            flag = true;
        }
        if(!func_259_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_))
        {
            p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, 0);
        }
        if(!flag && p_221_1_.func_27068_v() && (p_221_1_.func_27072_q(p_221_2_, p_221_3_, p_221_4_) || p_221_1_.func_27072_q(p_221_2_ - 1, p_221_3_, p_221_4_) || p_221_1_.func_27072_q(p_221_2_ + 1, p_221_3_, p_221_4_) || p_221_1_.func_27072_q(p_221_2_, p_221_3_, p_221_4_ - 1) || p_221_1_.func_27072_q(p_221_2_, p_221_3_, p_221_4_ + 1)))
        {
            p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, 0);
            return;
        }
        int i = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
        if(i < 15)
        {
            p_221_1_.func_463_c(p_221_2_, p_221_3_, p_221_4_, i + p_221_5_.nextInt(3) / 2);
        }
        p_221_1_.func_22074_c(p_221_2_, p_221_3_, p_221_4_, field_573_bc, func_4028_b() + p_221_5_.nextInt(10));
        if(!flag && !func_268_g(p_221_1_, p_221_2_, p_221_3_, p_221_4_))
        {
            if(!p_221_1_.func_445_d(p_221_2_, p_221_3_ - 1, p_221_4_) || i > 3)
            {
                p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, 0);
            }
            return;
        }
        if(!flag && !func_269_b(p_221_1_, p_221_2_, p_221_3_ - 1, p_221_4_) && i == 15 && p_221_5_.nextInt(4) == 0)
        {
            p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, 0);
            return;
        }
        boolean flag1 = p_221_1_.func_48089_z(p_221_2_, p_221_3_, p_221_4_);
        byte byte0 = 0;
        if(flag1)
        {
            byte0 = -50;
        }
        func_48133_a(p_221_1_, p_221_2_ + 1, p_221_3_, p_221_4_, 300 + byte0, p_221_5_, i);
        func_48133_a(p_221_1_, p_221_2_ - 1, p_221_3_, p_221_4_, 300 + byte0, p_221_5_, i);
        func_48133_a(p_221_1_, p_221_2_, p_221_3_ - 1, p_221_4_, 250 + byte0, p_221_5_, i);
        func_48133_a(p_221_1_, p_221_2_, p_221_3_ + 1, p_221_4_, 250 + byte0, p_221_5_, i);
        func_48133_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_ - 1, 300 + byte0, p_221_5_, i);
        func_48133_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_ + 1, 300 + byte0, p_221_5_, i);
        for(int j = p_221_2_ - 1; j <= p_221_2_ + 1; j++)
        {
            for(int k = p_221_4_ - 1; k <= p_221_4_ + 1; k++)
            {
                for(int l = p_221_3_ - 1; l <= p_221_3_ + 4; l++)
                {
                    if(j == p_221_2_ && l == p_221_3_ && k == p_221_4_)
                    {
                        continue;
                    }
                    int i1 = 100;
                    if(l > p_221_3_ + 1)
                    {
                        i1 += (l - (p_221_3_ + 1)) * 100;
                    }
                    int j1 = func_270_h(p_221_1_, j, l, k);
                    if(j1 <= 0)
                    {
                        continue;
                    }
                    int k1 = (j1 + 40) / (i + 30);
                    if(flag1)
                    {
                        k1 /= 2;
                    }
                    if(k1 <= 0 || p_221_5_.nextInt(i1) > k1 || p_221_1_.func_27068_v() && p_221_1_.func_27072_q(j, l, k) || p_221_1_.func_27072_q(j - 1, l, p_221_4_) || p_221_1_.func_27072_q(j + 1, l, k) || p_221_1_.func_27072_q(j, l, k - 1) || p_221_1_.func_27072_q(j, l, k + 1))
                    {
                        continue;
                    }
                    int l1 = i + p_221_5_.nextInt(5) / 4;
                    if(l1 > 15)
                    {
                        l1 = 15;
                    }
                    p_221_1_.func_507_b(j, l, k, field_573_bc, l1);
                }

            }

        }

    }

    private void func_48133_a(World p_48133_1_, int p_48133_2_, int p_48133_3_, int p_48133_4_, int p_48133_5_, Random p_48133_6_, int p_48133_7_)
    {
        int i = field_645_b[p_48133_1_.func_444_a(p_48133_2_, p_48133_3_, p_48133_4_)];
        if(p_48133_6_.nextInt(p_48133_5_) < i)
        {
            boolean flag = p_48133_1_.func_444_a(p_48133_2_, p_48133_3_, p_48133_4_) == Block.field_605_an.field_573_bc;
            if(p_48133_6_.nextInt(p_48133_7_ + 10) < 5 && !p_48133_1_.func_27072_q(p_48133_2_, p_48133_3_, p_48133_4_))
            {
                int j = p_48133_7_ + p_48133_6_.nextInt(5) / 4;
                if(j > 15)
                {
                    j = 15;
                }
                p_48133_1_.func_507_b(p_48133_2_, p_48133_3_, p_48133_4_, field_573_bc, j);
            } else
            {
                p_48133_1_.func_508_d(p_48133_2_, p_48133_3_, p_48133_4_, 0);
            }
            if(flag)
            {
                Block.field_605_an.func_251_a(p_48133_1_, p_48133_2_, p_48133_3_, p_48133_4_, 1);
            }
        }
    }

    private boolean func_268_g(World p_268_1_, int p_268_2_, int p_268_3_, int p_268_4_)
    {
        if(func_269_b(p_268_1_, p_268_2_ + 1, p_268_3_, p_268_4_))
        {
            return true;
        }
        if(func_269_b(p_268_1_, p_268_2_ - 1, p_268_3_, p_268_4_))
        {
            return true;
        }
        if(func_269_b(p_268_1_, p_268_2_, p_268_3_ - 1, p_268_4_))
        {
            return true;
        }
        if(func_269_b(p_268_1_, p_268_2_, p_268_3_ + 1, p_268_4_))
        {
            return true;
        }
        if(func_269_b(p_268_1_, p_268_2_, p_268_3_, p_268_4_ - 1))
        {
            return true;
        }
        return func_269_b(p_268_1_, p_268_2_, p_268_3_, p_268_4_ + 1);
    }

    private int func_270_h(World p_270_1_, int p_270_2_, int p_270_3_, int p_270_4_)
    {
        int i = 0;
        if(!p_270_1_.func_20111_e(p_270_2_, p_270_3_, p_270_4_))
        {
            return 0;
        } else
        {
            i = func_265_f(p_270_1_, p_270_2_ + 1, p_270_3_, p_270_4_, i);
            i = func_265_f(p_270_1_, p_270_2_ - 1, p_270_3_, p_270_4_, i);
            i = func_265_f(p_270_1_, p_270_2_, p_270_3_ - 1, p_270_4_, i);
            i = func_265_f(p_270_1_, p_270_2_, p_270_3_ + 1, p_270_4_, i);
            i = func_265_f(p_270_1_, p_270_2_, p_270_3_, p_270_4_ - 1, i);
            i = func_265_f(p_270_1_, p_270_2_, p_270_3_, p_270_4_ + 1, i);
            return i;
        }
    }

    public boolean func_245_e()
    {
        return false;
    }

    public boolean func_269_b(IBlockAccess p_269_1_, int p_269_2_, int p_269_3_, int p_269_4_)
    {
        return field_646_a[p_269_1_.func_444_a(p_269_2_, p_269_3_, p_269_4_)] > 0;
    }

    public int func_265_f(World p_265_1_, int p_265_2_, int p_265_3_, int p_265_4_, int p_265_5_)
    {
        int i = field_646_a[p_265_1_.func_444_a(p_265_2_, p_265_3_, p_265_4_)];
        if(i > p_265_5_)
        {
            return i;
        } else
        {
            return p_265_5_;
        }
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return p_259_1_.func_445_d(p_259_2_, p_259_3_ - 1, p_259_4_) || func_268_g(p_259_1_, p_259_2_, p_259_3_, p_259_4_);
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(!p_234_1_.func_445_d(p_234_2_, p_234_3_ - 1, p_234_4_) && !func_268_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_))
        {
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            return;
        } else
        {
            return;
        }
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        if(p_250_1_.field_4272_q.field_6165_g <= 0 && p_250_1_.func_444_a(p_250_2_, p_250_3_ - 1, p_250_4_) == Block.field_602_aq.field_573_bc && Block.field_4044_bf.func_4030_a_(p_250_1_, p_250_2_, p_250_3_, p_250_4_))
        {
            return;
        }
        if(!p_250_1_.func_445_d(p_250_2_, p_250_3_ - 1, p_250_4_) && !func_268_g(p_250_1_, p_250_2_, p_250_3_, p_250_4_))
        {
            p_250_1_.func_508_d(p_250_2_, p_250_3_, p_250_4_, 0);
            return;
        } else
        {
            p_250_1_.func_22074_c(p_250_2_, p_250_3_, p_250_4_, field_573_bc, func_4028_b() + p_250_1_.field_803_m.nextInt(10));
            return;
        }
    }
}
