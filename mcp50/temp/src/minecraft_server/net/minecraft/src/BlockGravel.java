// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockSand, Item

public class BlockGravel extends BlockSand
{

    public BlockGravel(int p_i311_1_, int p_i311_2_)
    {
        super(p_i311_1_, p_i311_2_);
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        if(p_252_2_.nextInt(10 - p_252_3_ * 3) == 0)
        {
            return Item.field_216_an.field_234_aS;
        } else
        {
            return field_573_bc;
        }
    }
}
