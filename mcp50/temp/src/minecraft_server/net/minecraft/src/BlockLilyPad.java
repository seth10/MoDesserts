// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BlockFlower, AxisAlignedBB, Block, World, 
//            Material

public class BlockLilyPad extends BlockFlower
{

    protected BlockLilyPad(int p_i156_1_, int p_i156_2_)
    {
        super(p_i156_1_, p_i156_2_);
        float f = 0.5F;
        float f1 = 0.015625F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    public int func_40161_b()
    {
        return 23;
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        return AxisAlignedBB.func_693_b((double)p_248_2_ + field_567_bf, (double)p_248_3_ + field_565_bg, (double)p_248_4_ + field_563_bh, (double)p_248_2_ + field_561_bi, (double)p_248_3_ + field_559_bj, (double)p_248_4_ + field_557_bk);
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return super.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_);
    }

    protected boolean func_277_b(int p_277_1_)
    {
        return p_277_1_ == Block.field_596_C.field_573_bc;
    }

    public boolean func_220_f(World p_220_1_, int p_220_2_, int p_220_3_, int p_220_4_)
    {
        if(p_220_3_ < 0 || p_220_3_ >= 256)
        {
            return false;
        } else
        {
            return p_220_1_.func_443_c(p_220_2_, p_220_3_ - 1, p_220_4_) == Material.field_521_f && p_220_1_.func_446_b(p_220_2_, p_220_3_ - 1, p_220_4_) == 0;
        }
    }
}
