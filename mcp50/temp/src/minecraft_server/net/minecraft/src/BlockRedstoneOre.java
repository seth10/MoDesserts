// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, Item, 
//            ItemStack, EntityPlayer, Entity

public class BlockRedstoneOre extends Block
{

    private boolean field_665_a;

    public BlockRedstoneOre(int p_i49_1_, int p_i49_2_, boolean p_i49_3_)
    {
        super(p_i49_1_, p_i49_2_, Material.field_523_d);
        if(p_i49_3_)
        {
            func_231_a(true);
        }
        field_665_a = p_i49_3_;
    }

    public int func_4028_b()
    {
        return 30;
    }

    public void func_235_b(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_, EntityPlayer p_235_5_)
    {
        func_321_g(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        super.func_235_b(p_235_1_, p_235_2_, p_235_3_, p_235_4_, p_235_5_);
    }

    public void func_249_b(World p_249_1_, int p_249_2_, int p_249_3_, int p_249_4_, Entity p_249_5_)
    {
        func_321_g(p_249_1_, p_249_2_, p_249_3_, p_249_4_);
        super.func_249_b(p_249_1_, p_249_2_, p_249_3_, p_249_4_, p_249_5_);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        func_321_g(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
        return super.func_246_a(p_246_1_, p_246_2_, p_246_3_, p_246_4_, p_246_5_);
    }

    private void func_321_g(World p_321_1_, int p_321_2_, int p_321_3_, int p_321_4_)
    {
        func_320_h(p_321_1_, p_321_2_, p_321_3_, p_321_4_);
        if(field_573_bc == Block.field_630_aO.field_573_bc)
        {
            p_321_1_.func_508_d(p_321_2_, p_321_3_, p_321_4_, Block.field_629_aP.field_573_bc);
        }
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(field_573_bc == Block.field_629_aP.field_573_bc)
        {
            p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, Block.field_630_aO.field_573_bc);
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_252_aA.field_234_aS;
    }

    public int func_40162_a(int p_40162_1_, Random p_40162_2_)
    {
        return func_244_a(p_40162_2_) + p_40162_2_.nextInt(p_40162_1_ + 1);
    }

    public int func_244_a(Random p_244_1_)
    {
        return 4 + p_244_1_.nextInt(2);
    }

    private void func_320_h(World p_320_1_, int p_320_2_, int p_320_3_, int p_320_4_)
    {
        Random random = p_320_1_.field_803_m;
        double d = 0.0625D;
        for(int i = 0; i < 6; i++)
        {
            double d1 = (float)p_320_2_ + random.nextFloat();
            double d2 = (float)p_320_3_ + random.nextFloat();
            double d3 = (float)p_320_4_ + random.nextFloat();
            if(i == 0 && !p_320_1_.func_28095_p(p_320_2_, p_320_3_ + 1, p_320_4_))
            {
                d2 = (double)(p_320_3_ + 1) + d;
            }
            if(i == 1 && !p_320_1_.func_28095_p(p_320_2_, p_320_3_ - 1, p_320_4_))
            {
                d2 = (double)(p_320_3_ + 0) - d;
            }
            if(i == 2 && !p_320_1_.func_28095_p(p_320_2_, p_320_3_, p_320_4_ + 1))
            {
                d3 = (double)(p_320_4_ + 1) + d;
            }
            if(i == 3 && !p_320_1_.func_28095_p(p_320_2_, p_320_3_, p_320_4_ - 1))
            {
                d3 = (double)(p_320_4_ + 0) - d;
            }
            if(i == 4 && !p_320_1_.func_28095_p(p_320_2_ + 1, p_320_3_, p_320_4_))
            {
                d1 = (double)(p_320_2_ + 1) + d;
            }
            if(i == 5 && !p_320_1_.func_28095_p(p_320_2_ - 1, p_320_3_, p_320_4_))
            {
                d1 = (double)(p_320_2_ + 0) - d;
            }
            if(d1 < (double)p_320_2_ || d1 > (double)(p_320_2_ + 1) || d2 < 0.0D || d2 > (double)(p_320_3_ + 1) || d3 < (double)p_320_4_ || d3 > (double)(p_320_4_ + 1))
            {
                p_320_1_.func_514_a("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
            }
        }

    }

    protected ItemStack func_41001_e(int p_41001_1_)
    {
        return new ItemStack(Block.field_630_aO);
    }
}
