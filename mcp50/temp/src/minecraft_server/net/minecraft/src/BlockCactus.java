// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, AxisAlignedBB, 
//            DamageSource, Entity

public class BlockCactus extends Block
{

    protected BlockCactus(int p_i351_1_, int p_i351_2_)
    {
        super(p_i351_1_, p_i351_2_, Material.field_4214_u);
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

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        float f = 0.0625F;
        return AxisAlignedBB.func_693_b((float)p_248_2_ + f, p_248_3_, (float)p_248_4_ + f, (float)(p_248_2_ + 1) - f, (float)(p_248_3_ + 1) - f, (float)(p_248_4_ + 1) - f);
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 1)
        {
            return field_575_bb - 1;
        }
        if(p_241_1_ == 0)
        {
            return field_575_bb + 1;
        } else
        {
            return field_575_bb;
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

    public int func_40161_b()
    {
        return 13;
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
        if(p_220_1_.func_443_c(p_220_2_ - 1, p_220_3_, p_220_4_).func_216_a())
        {
            return false;
        }
        if(p_220_1_.func_443_c(p_220_2_ + 1, p_220_3_, p_220_4_).func_216_a())
        {
            return false;
        }
        if(p_220_1_.func_443_c(p_220_2_, p_220_3_, p_220_4_ - 1).func_216_a())
        {
            return false;
        }
        if(p_220_1_.func_443_c(p_220_2_, p_220_3_, p_220_4_ + 1).func_216_a())
        {
            return false;
        } else
        {
            int i = p_220_1_.func_444_a(p_220_2_, p_220_3_ - 1, p_220_4_);
            return i == Block.field_622_aW.field_573_bc || i == Block.field_590_F.field_573_bc;
        }
    }

    public void func_263_a(World p_263_1_, int p_263_2_, int p_263_3_, int p_263_4_, Entity p_263_5_)
    {
        p_263_5_.func_121_a(DamageSource.field_35086_g, 1);
    }
}
