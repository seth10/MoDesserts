// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Item

public class BlockMelon extends Block
{

    protected BlockMelon(int p_i132_1_)
    {
        super(p_i132_1_, Material.field_4213_w);
        field_575_bb = 136;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        return p_22009_1_ != 1 && p_22009_1_ != 0 ? 136 : 137;
    }

    public int func_241_a(int p_241_1_)
    {
        return p_241_1_ != 1 && p_241_1_ != 0 ? 136 : 137;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_35416_bd.field_234_aS;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 3 + p_244_1_.nextInt(5);
    }

    public int func_40162_a(int p_40162_1_, Random p_40162_2_)
    {
        int i = func_244_a(p_40162_2_) + p_40162_2_.nextInt(1 + p_40162_1_);
        if(i > 9)
        {
            i = 9;
        }
        return i;
    }
}
