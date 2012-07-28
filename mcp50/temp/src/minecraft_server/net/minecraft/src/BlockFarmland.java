// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, AxisAlignedBB, World, 
//            Entity

public class BlockFarmland extends Block
{

    protected BlockFarmland(int p_i520_1_)
    {
        super(p_i520_1_, Material.field_525_b);
        field_575_bb = 87;
        func_231_a(true);
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        func_258_c(255);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        return AxisAlignedBB.func_693_b(p_248_2_ + 0, p_248_3_ + 0, p_248_4_ + 0, p_248_2_ + 1, p_248_3_ + 1, p_248_4_ + 1);
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 1 && p_22009_2_ > 0)
        {
            return field_575_bb - 1;
        }
        if(p_22009_1_ == 1)
        {
            return field_575_bb;
        } else
        {
            return 2;
        }
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(func_283_h(p_221_1_, p_221_2_, p_221_3_, p_221_4_) || p_221_1_.func_27072_q(p_221_2_, p_221_3_ + 1, p_221_4_))
        {
            p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, 7);
        } else
        {
            int i = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
            if(i > 0)
            {
                p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, i - 1);
            } else
            if(!func_282_g(p_221_1_, p_221_2_, p_221_3_, p_221_4_))
            {
                p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, Block.field_533_w.field_573_bc);
            }
        }
    }

    public void func_43001_a(World p_43001_1_, int p_43001_2_, int p_43001_3_, int p_43001_4_, Entity p_43001_5_, float p_43001_6_)
    {
        if(p_43001_1_.field_803_m.nextFloat() < p_43001_6_ - 0.5F)
        {
            p_43001_1_.func_508_d(p_43001_2_, p_43001_3_, p_43001_4_, Block.field_533_w.field_573_bc);
        }
    }

    private boolean func_282_g(World p_282_1_, int p_282_2_, int p_282_3_, int p_282_4_)
    {
        int i = 0;
        for(int j = p_282_2_ - i; j <= p_282_2_ + i; j++)
        {
            for(int k = p_282_4_ - i; k <= p_282_4_ + i; k++)
            {
                int l = p_282_1_.func_444_a(j, p_282_3_ + 1, k);
                if(l == Block.field_644_aA.field_573_bc || l == Block.field_35050_bu.field_573_bc || l == Block.field_35051_bt.field_573_bc)
                {
                    return true;
                }
            }

        }

        return false;
    }

    private boolean func_283_h(World p_283_1_, int p_283_2_, int p_283_3_, int p_283_4_)
    {
        for(int i = p_283_2_ - 4; i <= p_283_2_ + 4; i++)
        {
            for(int j = p_283_3_; j <= p_283_3_ + 1; j++)
            {
                for(int k = p_283_4_ - 4; k <= p_283_4_ + 4; k++)
                {
                    if(p_283_1_.func_443_c(i, j, k) == Material.field_521_f)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        super.func_234_b(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_5_);
        Material material = p_234_1_.func_443_c(p_234_2_, p_234_3_ + 1, p_234_4_);
        if(material.func_216_a())
        {
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, Block.field_533_w.field_573_bc);
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_533_w.func_252_a(0, p_252_2_, p_252_3_);
    }
}
