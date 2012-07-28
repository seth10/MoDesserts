// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, World, EntityLiving, MathHelper, 
//            IBlockAccess, AxisAlignedBB, EntityPlayer, Entity, 
//            Vec3D

public class BlockStairs extends Block
{

    private Block field_651_a;

    protected BlockStairs(int p_i450_1_, Block p_i450_2_)
    {
        super(p_i450_1_, p_i450_2_.field_575_bb, p_i450_2_.field_553_bn);
        field_651_a = p_i450_2_;
        func_237_c(p_i450_2_.field_571_bd);
        func_232_b(p_i450_2_.field_569_be / 3F);
        func_4026_a(p_i450_2_.field_555_bl);
        func_258_c(255);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        return super.func_248_d(p_248_1_, p_248_2_, p_248_3_, p_248_4_);
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
        return 10;
    }

    public void func_264_a(World p_264_1_, int p_264_2_, int p_264_3_, int p_264_4_, AxisAlignedBB p_264_5_, ArrayList p_264_6_)
    {
        int i = p_264_1_.func_446_b(p_264_2_, p_264_3_, p_264_4_);
        int j = i & 3;
        float f = 0.0F;
        float f1 = 0.5F;
        float f2 = 0.5F;
        float f3 = 1.0F;
        if((i & 4) != 0)
        {
            f = 0.5F;
            f1 = 1.0F;
            f2 = 0.0F;
            f3 = 0.5F;
        }
        func_229_a(0.0F, f, 0.0F, 1.0F, f1, 1.0F);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        if(j == 0)
        {
            func_229_a(0.5F, f2, 0.0F, 1.0F, f3, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        } else
        if(j == 1)
        {
            func_229_a(0.0F, f2, 0.0F, 0.5F, f3, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        } else
        if(j == 2)
        {
            func_229_a(0.0F, f2, 0.5F, 1.0F, f3, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        } else
        if(j == 3)
        {
            func_229_a(0.0F, f2, 0.0F, 1.0F, f3, 0.5F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        }
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_235_b(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_, EntityPlayer p_235_5_)
    {
        field_651_a.func_235_b(p_235_1_, p_235_2_, p_235_3_, p_235_4_, p_235_5_);
    }

    public void func_251_a(World p_251_1_, int p_251_2_, int p_251_3_, int p_251_4_, int p_251_5_)
    {
        field_651_a.func_251_a(p_251_1_, p_251_2_, p_251_3_, p_251_4_, p_251_5_);
    }

    public float func_226_a(Entity p_226_1_)
    {
        return field_651_a.func_226_a(p_226_1_);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        return field_651_a.func_22009_a(p_22009_1_, 0);
    }

    public int func_241_a(int p_241_1_)
    {
        return field_651_a.func_22009_a(p_241_1_, 0);
    }

    public int func_4028_b()
    {
        return field_651_a.func_4028_b();
    }

    public void func_230_a(World p_230_1_, int p_230_2_, int p_230_3_, int p_230_4_, Entity p_230_5_, Vec3D p_230_6_)
    {
        field_651_a.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
    }

    public boolean func_245_e()
    {
        return field_651_a.func_245_e();
    }

    public boolean func_243_a(int p_243_1_, boolean p_243_2_)
    {
        return field_651_a.func_243_a(p_243_1_, p_243_2_);
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return field_651_a.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_);
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        func_234_b(p_250_1_, p_250_2_, p_250_3_, p_250_4_, 0);
        field_651_a.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        field_651_a.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
    }

    public void func_249_b(World p_249_1_, int p_249_2_, int p_249_3_, int p_249_4_, Entity p_249_5_)
    {
        field_651_a.func_249_b(p_249_1_, p_249_2_, p_249_3_, p_249_4_, p_249_5_);
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        field_651_a.func_221_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_5_);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        return field_651_a.func_246_a(p_246_1_, p_246_2_, p_246_3_, p_246_4_, p_246_5_);
    }

    public void func_4029_c(World p_4029_1_, int p_4029_2_, int p_4029_3_, int p_4029_4_)
    {
        field_651_a.func_4029_c(p_4029_1_, p_4029_2_, p_4029_3_, p_4029_4_);
    }

    public void func_4027_a(World p_4027_1_, int p_4027_2_, int p_4027_3_, int p_4027_4_, EntityLiving p_4027_5_)
    {
        int i = MathHelper.func_584_b((double)((p_4027_5_.field_316_r * 4F) / 360F) + 0.5D) & 3;
        int j = p_4027_1_.func_446_b(p_4027_2_, p_4027_3_, p_4027_4_) & 4;
        if(i == 0)
        {
            p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, 2 | j);
        }
        if(i == 1)
        {
            p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, 1 | j);
        }
        if(i == 2)
        {
            p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, 3 | j);
        }
        if(i == 3)
        {
            p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, 0 | j);
        }
    }

    public void func_255_c(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, int p_255_5_)
    {
        if(p_255_5_ == 0)
        {
            int i = p_255_1_.func_446_b(p_255_2_, p_255_3_, p_255_4_);
            p_255_1_.func_511_b(p_255_2_, p_255_3_, p_255_4_, i | 4);
        }
    }
}
