// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World

public class BlockRedstoneLight extends Block
{

    private final boolean field_48137_a;

    public BlockRedstoneLight(int p_i1057_1_, boolean p_i1057_2_)
    {
        super(p_i1057_1_, 211, Material.field_48476_r);
        field_48137_a = p_i1057_2_;
        if(p_i1057_2_)
        {
            func_224_a(1.0F);
            field_575_bb++;
        }
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        if(!p_250_1_.field_792_x)
        {
            if(field_48137_a && !p_250_1_.func_474_n(p_250_2_, p_250_3_, p_250_4_))
            {
                p_250_1_.func_22074_c(p_250_2_, p_250_3_, p_250_4_, field_573_bc, 4);
            } else
            if(!field_48137_a && p_250_1_.func_474_n(p_250_2_, p_250_3_, p_250_4_))
            {
                p_250_1_.func_508_d(p_250_2_, p_250_3_, p_250_4_, Block.field_48131_bM.field_573_bc);
            }
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(!p_234_1_.field_792_x)
        {
            if(field_48137_a && !p_234_1_.func_474_n(p_234_2_, p_234_3_, p_234_4_))
            {
                p_234_1_.func_22074_c(p_234_2_, p_234_3_, p_234_4_, field_573_bc, 4);
            } else
            if(!field_48137_a && p_234_1_.func_474_n(p_234_2_, p_234_3_, p_234_4_))
            {
                p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, Block.field_48131_bM.field_573_bc);
            }
        }
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(!p_221_1_.field_792_x && field_48137_a && !p_221_1_.func_474_n(p_221_2_, p_221_3_, p_221_4_))
        {
            p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, Block.field_48130_bL.field_573_bc);
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_48130_bL.field_573_bc;
    }
}
