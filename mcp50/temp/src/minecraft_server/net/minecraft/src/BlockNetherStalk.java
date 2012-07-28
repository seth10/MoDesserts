// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, Block, World, BiomeGenHell, 
//            ItemStack, Item

public class BlockNetherStalk extends BlockFlower
{

    protected BlockNetherStalk(int p_i590_1_)
    {
        super(p_i590_1_, 226);
        func_231_a(true);
        float f = 0.5F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    }

    protected boolean func_277_b(int p_277_1_)
    {
        return p_277_1_ == Block.field_4048_bd.field_573_bc;
    }

    public boolean func_220_f(World p_220_1_, int p_220_2_, int p_220_3_, int p_220_4_)
    {
        return func_277_b(p_220_1_.func_444_a(p_220_2_, p_220_3_ - 1, p_220_4_));
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        int i = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
        if(i < 3)
        {
            BiomeGenBase biomegenbase = p_221_1_.func_48091_a(p_221_2_, p_221_4_);
            if((biomegenbase instanceof BiomeGenHell) && p_221_5_.nextInt(10) == 0)
            {
                i++;
                p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, i);
            }
        }
        super.func_221_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_5_);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_2_ >= 3)
        {
            return field_575_bb + 2;
        }
        if(p_22009_2_ > 0)
        {
            return field_575_bb + 1;
        } else
        {
            return field_575_bb;
        }
    }

    public int func_40161_b()
    {
        return 6;
    }

    public void func_227_a(World p_227_1_, int p_227_2_, int p_227_3_, int p_227_4_, int p_227_5_, float p_227_6_, int p_227_7_)
    {
        if(p_227_1_.field_792_x)
        {
            return;
        }
        int i = 1;
        if(p_227_5_ >= 3)
        {
            i = 2 + p_227_1_.field_803_m.nextInt(3);
            if(p_227_7_ > 0)
            {
                i += p_227_1_.field_803_m.nextInt(p_227_7_ + 1);
            }
        }
        for(int j = 0; j < i; j++)
        {
            func_31024_a(p_227_1_, p_227_2_, p_227_3_, p_227_4_, new ItemStack(Item.field_40237_bp));
        }

    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return 0;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }
}
