// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, BlockFlower, Material

public class BlockMushroomCap extends Block
{

    private int field_35069_a;

    public BlockMushroomCap(int p_i524_1_, Material p_i524_2_, int p_i524_3_, int p_i524_4_)
    {
        super(p_i524_1_, p_i524_3_, p_i524_2_);
        field_35069_a = p_i524_4_;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_2_ == 10 && p_22009_1_ > 1)
        {
            return field_575_bb - 1;
        }
        if(p_22009_2_ >= 1 && p_22009_2_ <= 9 && p_22009_1_ == 1)
        {
            return field_575_bb - 16 - field_35069_a;
        }
        if(p_22009_2_ >= 1 && p_22009_2_ <= 3 && p_22009_1_ == 2)
        {
            return field_575_bb - 16 - field_35069_a;
        }
        if(p_22009_2_ >= 7 && p_22009_2_ <= 9 && p_22009_1_ == 3)
        {
            return field_575_bb - 16 - field_35069_a;
        }
        if((p_22009_2_ == 1 || p_22009_2_ == 4 || p_22009_2_ == 7) && p_22009_1_ == 4)
        {
            return field_575_bb - 16 - field_35069_a;
        }
        if((p_22009_2_ == 3 || p_22009_2_ == 6 || p_22009_2_ == 9) && p_22009_1_ == 5)
        {
            return field_575_bb - 16 - field_35069_a;
        }
        if(p_22009_2_ == 14)
        {
            return field_575_bb - 16 - field_35069_a;
        }
        if(p_22009_2_ == 15)
        {
            return field_575_bb - 1;
        } else
        {
            return field_575_bb;
        }
    }

    public int func_244_a(Random p_244_1_)
    {
        int i = p_244_1_.nextInt(10) - 7;
        if(i < 0)
        {
            i = 0;
        }
        return i;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_4070_ag.field_573_bc + field_35069_a;
    }
}
