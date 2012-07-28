// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, World, 
//            AxisAlignedBB, EntityPlayer, FoodStats

public class BlockCake extends Block
{

    protected BlockCake(int p_i488_1_, int p_i488_2_)
    {
        super(p_i488_1_, p_i488_2_, Material.field_21100_y);
        func_231_a(true);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        int i = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_);
        float f = 0.0625F;
        float f1 = (float)(1 + i * 2) / 16F;
        float f2 = 0.5F;
        func_229_a(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
    }

    public void func_40163_f()
    {
        float f = 0.0625F;
        float f1 = 0.5F;
        func_229_a(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        int i = p_248_1_.func_446_b(p_248_2_, p_248_3_, p_248_4_);
        float f = 0.0625F;
        float f1 = (float)(1 + i * 2) / 16F;
        float f2 = 0.5F;
        return AxisAlignedBB.func_693_b((float)p_248_2_ + f1, p_248_3_, (float)p_248_4_ + f, (float)(p_248_2_ + 1) - f, ((float)p_248_3_ + f2) - f, (float)(p_248_4_ + 1) - f);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 1)
        {
            return field_575_bb;
        }
        if(p_22009_1_ == 0)
        {
            return field_575_bb + 3;
        }
        if(p_22009_2_ > 0 && p_22009_1_ == 4)
        {
            return field_575_bb + 2;
        } else
        {
            return field_575_bb + 1;
        }
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 1)
        {
            return field_575_bb;
        }
        if(p_241_1_ == 0)
        {
            return field_575_bb + 3;
        } else
        {
            return field_575_bb + 1;
        }
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        func_21030_c(p_246_1_, p_246_2_, p_246_3_, p_246_4_, p_246_5_);
        return true;
    }

    public void func_235_b(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_, EntityPlayer p_235_5_)
    {
        func_21030_c(p_235_1_, p_235_2_, p_235_3_, p_235_4_, p_235_5_);
    }

    private void func_21030_c(World p_21030_1_, int p_21030_2_, int p_21030_3_, int p_21030_4_, EntityPlayer p_21030_5_)
    {
        if(p_21030_5_.func_35197_c(false))
        {
            p_21030_5_.func_35207_V().func_35590_a(2, 0.1F);
            int i = p_21030_1_.func_446_b(p_21030_2_, p_21030_3_, p_21030_4_) + 1;
            if(i >= 6)
            {
                p_21030_1_.func_508_d(p_21030_2_, p_21030_3_, p_21030_4_, 0);
            } else
            {
                p_21030_1_.func_511_b(p_21030_2_, p_21030_3_, p_21030_4_, i);
                p_21030_1_.func_21119_h(p_21030_2_, p_21030_3_, p_21030_4_);
            }
        }
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        if(!super.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_))
        {
            return false;
        } else
        {
            return func_220_f(p_259_1_, p_259_2_, p_259_3_, p_259_4_);
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(!func_220_f(p_234_1_, p_234_2_, p_234_3_, p_234_4_))
        {
            func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_), 0);
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
        }
    }

    public boolean func_220_f(World p_220_1_, int p_220_2_, int p_220_3_, int p_220_4_)
    {
        return p_220_1_.func_443_c(p_220_2_, p_220_3_ - 1, p_220_4_).func_216_a();
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return 0;
    }
}
