// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Item

public class BlockClay extends Block
{

    public BlockClay(int p_i429_1_, int p_i429_2_)
    {
        super(p_i429_1_, p_i429_2_, Material.field_505_v);
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_246_aG.field_234_aS;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 4;
    }
}
