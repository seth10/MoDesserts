// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            BlockTorch, Block, RedstoneUpdateInfo, World, 
//            IBlockAccess

public class BlockRedstoneTorch extends BlockTorch
{

    private boolean field_649_a;
    private static List field_648_b = new ArrayList();

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 1)
        {
            return Block.field_591_aw.func_22009_a(p_22009_1_, p_22009_2_);
        } else
        {
            return super.func_22009_a(p_22009_1_, p_22009_2_);
        }
    }

    private boolean func_280_a(World p_280_1_, int p_280_2_, int p_280_3_, int p_280_4_, boolean p_280_5_)
    {
        if(p_280_5_)
        {
            field_648_b.add(new RedstoneUpdateInfo(p_280_2_, p_280_3_, p_280_4_, p_280_1_.func_22080_k()));
        }
        int i = 0;
        for(int j = 0; j < field_648_b.size(); j++)
        {
            RedstoneUpdateInfo redstoneupdateinfo = (RedstoneUpdateInfo)field_648_b.get(j);
            if(redstoneupdateinfo.field_775_a == p_280_2_ && redstoneupdateinfo.field_774_b == p_280_3_ && redstoneupdateinfo.field_777_c == p_280_4_ && ++i >= 8)
            {
                return true;
            }
        }

        return false;
    }

    protected BlockRedstoneTorch(int p_i83_1_, int p_i83_2_, boolean p_i83_3_)
    {
        super(p_i83_1_, p_i83_2_);
        field_649_a = false;
        field_649_a = p_i83_3_;
        func_231_a(true);
    }

    public int func_4028_b()
    {
        return 2;
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        if(p_250_1_.func_446_b(p_250_2_, p_250_3_, p_250_4_) == 0)
        {
            super.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        }
        if(field_649_a)
        {
            p_250_1_.func_449_g(p_250_2_, p_250_3_ - 1, p_250_4_, field_573_bc);
            p_250_1_.func_449_g(p_250_2_, p_250_3_ + 1, p_250_4_, field_573_bc);
            p_250_1_.func_449_g(p_250_2_ - 1, p_250_3_, p_250_4_, field_573_bc);
            p_250_1_.func_449_g(p_250_2_ + 1, p_250_3_, p_250_4_, field_573_bc);
            p_250_1_.func_449_g(p_250_2_, p_250_3_, p_250_4_ - 1, field_573_bc);
            p_250_1_.func_449_g(p_250_2_, p_250_3_, p_250_4_ + 1, field_573_bc);
        }
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        if(field_649_a)
        {
            p_242_1_.func_449_g(p_242_2_, p_242_3_ - 1, p_242_4_, field_573_bc);
            p_242_1_.func_449_g(p_242_2_, p_242_3_ + 1, p_242_4_, field_573_bc);
            p_242_1_.func_449_g(p_242_2_ - 1, p_242_3_, p_242_4_, field_573_bc);
            p_242_1_.func_449_g(p_242_2_ + 1, p_242_3_, p_242_4_, field_573_bc);
            p_242_1_.func_449_g(p_242_2_, p_242_3_, p_242_4_ - 1, field_573_bc);
            p_242_1_.func_449_g(p_242_2_, p_242_3_, p_242_4_ + 1, field_573_bc);
        }
    }

    public boolean func_239_b(IBlockAccess p_239_1_, int p_239_2_, int p_239_3_, int p_239_4_, int p_239_5_)
    {
        if(!field_649_a)
        {
            return false;
        }
        int i = p_239_1_.func_446_b(p_239_2_, p_239_3_, p_239_4_);
        if(i == 5 && p_239_5_ == 1)
        {
            return false;
        }
        if(i == 3 && p_239_5_ == 3)
        {
            return false;
        }
        if(i == 4 && p_239_5_ == 2)
        {
            return false;
        }
        if(i == 1 && p_239_5_ == 5)
        {
            return false;
        }
        return i != 2 || p_239_5_ != 4;
    }

    private boolean func_30003_g(World p_30003_1_, int p_30003_2_, int p_30003_3_, int p_30003_4_)
    {
        int i = p_30003_1_.func_446_b(p_30003_2_, p_30003_3_, p_30003_4_);
        if(i == 5 && p_30003_1_.func_489_j(p_30003_2_, p_30003_3_ - 1, p_30003_4_, 0))
        {
            return true;
        }
        if(i == 3 && p_30003_1_.func_489_j(p_30003_2_, p_30003_3_, p_30003_4_ - 1, 2))
        {
            return true;
        }
        if(i == 4 && p_30003_1_.func_489_j(p_30003_2_, p_30003_3_, p_30003_4_ + 1, 3))
        {
            return true;
        }
        if(i == 1 && p_30003_1_.func_489_j(p_30003_2_ - 1, p_30003_3_, p_30003_4_, 4))
        {
            return true;
        }
        return i == 2 && p_30003_1_.func_489_j(p_30003_2_ + 1, p_30003_3_, p_30003_4_, 5);
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        boolean flag = func_30003_g(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
        for(; field_648_b.size() > 0 && p_221_1_.func_22080_k() - ((RedstoneUpdateInfo)field_648_b.get(0)).field_776_d > 60L; field_648_b.remove(0)) { }
        if(field_649_a)
        {
            if(flag)
            {
                p_221_1_.func_507_b(p_221_2_, p_221_3_, p_221_4_, Block.field_628_aQ.field_573_bc, p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_));
                if(func_280_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_, true))
                {
                    p_221_1_.func_502_a((float)p_221_2_ + 0.5F, (float)p_221_3_ + 0.5F, (float)p_221_4_ + 0.5F, "random.fizz", 0.5F, 2.6F + (p_221_1_.field_803_m.nextFloat() - p_221_1_.field_803_m.nextFloat()) * 0.8F);
                    for(int i = 0; i < 5; i++)
                    {
                        double d = (double)p_221_2_ + p_221_5_.nextDouble() * 0.59999999999999998D + 0.20000000000000001D;
                        double d1 = (double)p_221_3_ + p_221_5_.nextDouble() * 0.59999999999999998D + 0.20000000000000001D;
                        double d2 = (double)p_221_4_ + p_221_5_.nextDouble() * 0.59999999999999998D + 0.20000000000000001D;
                        p_221_1_.func_514_a("smoke", d, d1, d2, 0.0D, 0.0D, 0.0D);
                    }

                }
            }
        } else
        if(!flag && !func_280_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_, false))
        {
            p_221_1_.func_507_b(p_221_2_, p_221_3_, p_221_4_, Block.field_627_aR.field_573_bc, p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_));
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        super.func_234_b(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_5_);
        p_234_1_.func_22074_c(p_234_2_, p_234_3_, p_234_4_, field_573_bc, func_4028_b());
    }

    public boolean func_238_d(World p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_, int p_238_5_)
    {
        if(p_238_5_ == 0)
        {
            return func_239_b(p_238_1_, p_238_2_, p_238_3_, p_238_4_, p_238_5_);
        } else
        {
            return false;
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_627_aR.field_573_bc;
    }

    public boolean func_225_d()
    {
        return true;
    }

}
