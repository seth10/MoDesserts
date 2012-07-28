// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, BlockGrass, 
//            Item, AxisAlignedBB

public class BlockReed extends Block
{

    protected BlockReed(int p_i411_1_, int p_i411_2_)
    {
        super(p_i411_1_, Material.field_518_i);
        field_575_bb = p_i411_2_;
        float f = 0.375F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
        func_231_a(true);
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_1_.func_20111_e(p_221_2_, p_221_3_ + 1, p_221_4_))
        {
            int i;
            for(i = 1; p_221_1_.func_444_a(p_221_2_, p_221_3_ - i, p_221_4_) == field_573_bc; i++) { }
            if(i < 3)
            {
                int j = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
                if(j == 15)
                {
                    p_221_1_.func_508_d(p_221_2_, p_221_3_ + 1, p_221_4_, field_573_bc);
                    p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, 0);
                } else
                {
                    p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, j + 1);
                }
            }
        }
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        int i = p_259_1_.func_444_a(p_259_2_, p_259_3_ - 1, p_259_4_);
        if(i == field_573_bc)
        {
            return true;
        }
        if(i != Block.field_534_v.field_573_bc && i != Block.field_533_w.field_573_bc && i != Block.field_590_F.field_573_bc)
        {
            return false;
        }
        if(p_259_1_.func_443_c(p_259_2_ - 1, p_259_3_ - 1, p_259_4_) == Material.field_521_f)
        {
            return true;
        }
        if(p_259_1_.func_443_c(p_259_2_ + 1, p_259_3_ - 1, p_259_4_) == Material.field_521_f)
        {
            return true;
        }
        if(p_259_1_.func_443_c(p_259_2_, p_259_3_ - 1, p_259_4_ - 1) == Material.field_521_f)
        {
            return true;
        }
        return p_259_1_.func_443_c(p_259_2_, p_259_3_ - 1, p_259_4_ + 1) == Material.field_521_f;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        func_4037_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_);
    }

    protected final void func_4037_g(World p_4037_1_, int p_4037_2_, int p_4037_3_, int p_4037_4_)
    {
        if(!func_220_f(p_4037_1_, p_4037_2_, p_4037_3_, p_4037_4_))
        {
            func_247_a_(p_4037_1_, p_4037_2_, p_4037_3_, p_4037_4_, p_4037_1_.func_446_b(p_4037_2_, p_4037_3_, p_4037_4_), 0);
            p_4037_1_.func_508_d(p_4037_2_, p_4037_3_, p_4037_4_, 0);
        }
    }

    public boolean func_220_f(World p_220_1_, int p_220_2_, int p_220_3_, int p_220_4_)
    {
        return func_259_a(p_220_1_, p_220_2_, p_220_3_, p_220_4_);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_4202_aH.field_234_aS;
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
        return 1;
    }
}
