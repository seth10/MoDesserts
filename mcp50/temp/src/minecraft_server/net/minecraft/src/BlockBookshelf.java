// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Item

public class BlockBookshelf extends Block
{

    public BlockBookshelf(int p_i176_1_, int p_i176_2_)
    {
        super(p_i176_1_, p_i176_2_, Material.field_524_c);
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ <= 1)
        {
            return 4;
        } else
        {
            return field_575_bb;
        }
    }

    public int func_244_a(Random p_244_1_)
    {
        return 3;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_4200_aJ.field_234_aS;
    }
}
