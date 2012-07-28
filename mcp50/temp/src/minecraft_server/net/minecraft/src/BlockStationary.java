// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFluid, Material, World, Block, 
//            BlockFire, IBlockAccess

public class BlockStationary extends BlockFluid
{

    protected BlockStationary(int p_i330_1_, Material p_i330_2_)
    {
        super(p_i330_1_, p_i330_2_);
        func_231_a(false);
        if(p_i330_2_ == Material.field_520_g)
        {
            func_231_a(true);
        }
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int p_48127_4_)
    {
        return field_553_bn != Material.field_520_g;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        super.func_234_b(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_5_);
        if(p_234_1_.func_444_a(p_234_2_, p_234_3_, p_234_4_) == field_573_bc)
        {
            func_30005_i(p_234_1_, p_234_2_, p_234_3_, p_234_4_);
        }
    }

    private void func_30005_i(World p_30005_1_, int p_30005_2_, int p_30005_3_, int p_30005_4_)
    {
        int i = p_30005_1_.func_446_b(p_30005_2_, p_30005_3_, p_30005_4_);
        p_30005_1_.field_808_h = true;
        p_30005_1_.func_470_a(p_30005_2_, p_30005_3_, p_30005_4_, field_573_bc - 1, i);
        p_30005_1_.func_519_b(p_30005_2_, p_30005_3_, p_30005_4_, p_30005_2_, p_30005_3_, p_30005_4_);
        p_30005_1_.func_22074_c(p_30005_2_, p_30005_3_, p_30005_4_, field_573_bc - 1, func_4028_b());
        p_30005_1_.field_808_h = false;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(field_553_bn == Material.field_520_g)
        {
            int i = p_221_5_.nextInt(3);
            for(int j = 0; j < i; j++)
            {
                p_221_2_ += p_221_5_.nextInt(3) - 1;
                p_221_3_++;
                p_221_4_ += p_221_5_.nextInt(3) - 1;
                int l = p_221_1_.func_444_a(p_221_2_, p_221_3_, p_221_4_);
                if(l == 0)
                {
                    if(func_4033_j(p_221_1_, p_221_2_ - 1, p_221_3_, p_221_4_) || func_4033_j(p_221_1_, p_221_2_ + 1, p_221_3_, p_221_4_) || func_4033_j(p_221_1_, p_221_2_, p_221_3_, p_221_4_ - 1) || func_4033_j(p_221_1_, p_221_2_, p_221_3_, p_221_4_ + 1) || func_4033_j(p_221_1_, p_221_2_, p_221_3_ - 1, p_221_4_) || func_4033_j(p_221_1_, p_221_2_, p_221_3_ + 1, p_221_4_))
                    {
                        p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, Block.field_599_as.field_573_bc);
                        return;
                    }
                    continue;
                }
                if(Block.field_542_n[l].field_553_bn.func_218_c())
                {
                    return;
                }
            }

            if(i == 0)
            {
                int k = p_221_2_;
                int i1 = p_221_4_;
                for(int j1 = 0; j1 < 3; j1++)
                {
                    p_221_2_ = (k + p_221_5_.nextInt(3)) - 1;
                    p_221_4_ = (i1 + p_221_5_.nextInt(3)) - 1;
                    if(p_221_1_.func_20111_e(p_221_2_, p_221_3_ + 1, p_221_4_) && func_4033_j(p_221_1_, p_221_2_, p_221_3_, p_221_4_))
                    {
                        p_221_1_.func_508_d(p_221_2_, p_221_3_ + 1, p_221_4_, Block.field_599_as.field_573_bc);
                    }
                }

            }
        }
    }

    private boolean func_4033_j(World p_4033_1_, int p_4033_2_, int p_4033_3_, int p_4033_4_)
    {
        return p_4033_1_.func_443_c(p_4033_2_, p_4033_3_, p_4033_4_).func_4051_e();
    }
}
