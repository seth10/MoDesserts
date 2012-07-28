// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Item, EnumSkyBlock, 
//            World

public class BlockSnowBlock extends Block
{

    protected BlockSnowBlock(int p_i5_1_, int p_i5_2_)
    {
        super(p_i5_1_, p_i5_2_, Material.field_507_t);
        func_231_a(true);
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_251_aB.field_234_aS;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 4;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_1_.func_512_a(EnumSkyBlock.Block, p_221_2_, p_221_3_, p_221_4_) > 11)
        {
            func_247_a_(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_), 0);
            p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, 0);
        }
    }
}
