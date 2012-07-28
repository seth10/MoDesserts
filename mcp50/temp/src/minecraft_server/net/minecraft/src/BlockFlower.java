// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, BlockGrass, 
//            AxisAlignedBB

public class BlockFlower extends Block
{

    protected BlockFlower(int p_i1088_1_, int p_i1088_2_, Material p_i1088_3_)
    {
        super(p_i1088_1_, p_i1088_3_);
        field_575_bb = p_i1088_2_;
        func_231_a(true);
        float f = 0.2F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3F, 0.5F + f);
    }

    protected BlockFlower(int p_i548_1_, int p_i548_2_)
    {
        this(p_i548_1_, p_i548_2_, Material.field_518_i);
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return super.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_) && func_277_b(p_259_1_.func_444_a(p_259_2_, p_259_3_ - 1, p_259_4_));
    }

    protected boolean func_277_b(int p_277_1_)
    {
        return p_277_1_ == Block.field_534_v.field_573_bc || p_277_1_ == Block.field_533_w.field_573_bc || p_277_1_ == Block.field_643_aB.field_573_bc;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        super.func_234_b(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_5_);
        func_276_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_);
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        func_276_g(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
    }

    protected final void func_276_g(World p_276_1_, int p_276_2_, int p_276_3_, int p_276_4_)
    {
        if(!func_220_f(p_276_1_, p_276_2_, p_276_3_, p_276_4_))
        {
            func_247_a_(p_276_1_, p_276_2_, p_276_3_, p_276_4_, p_276_1_.func_446_b(p_276_2_, p_276_3_, p_276_4_), 0);
            p_276_1_.func_508_d(p_276_2_, p_276_3_, p_276_4_, 0);
        }
    }

    public boolean func_220_f(World p_220_1_, int p_220_2_, int p_220_3_, int p_220_4_)
    {
        return (p_220_1_.func_28098_j(p_220_2_, p_220_3_, p_220_4_) >= 8 || p_220_1_.func_497_g(p_220_2_, p_220_3_, p_220_4_)) && func_277_b(p_220_1_.func_444_a(p_220_2_, p_220_3_ - 1, p_220_4_));
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
        return 1;
    }
}
