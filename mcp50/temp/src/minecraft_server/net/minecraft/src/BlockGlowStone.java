// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, MathHelper, Item, Material

public class BlockGlowStone extends Block
{

    public BlockGlowStone(int p_i288_1_, int p_i288_2_, Material p_i288_3_)
    {
        super(p_i288_1_, p_i288_2_, p_i288_3_);
    }

    public int func_40162_a(int p_40162_1_, Random p_40162_2_)
    {
        return MathHelper.func_41051_a(func_244_a(p_40162_2_) + p_40162_2_.nextInt(p_40162_1_ + 1), 1, 4);
    }

    public int func_244_a(Random p_244_1_)
    {
        return 2 + p_244_1_.nextInt(3);
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_4194_aR.field_234_aS;
    }
}
