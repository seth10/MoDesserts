// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockStoneBrick extends Block
{

    public BlockStoneBrick(int p_i404_1_)
    {
        super(p_i404_1_, 54, Material.field_523_d);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        switch(p_22009_2_)
        {
        default:
            return 54;

        case 1: // '\001'
            return 100;

        case 2: // '\002'
            return 101;

        case 3: // '\003'
            return 213;
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_;
    }
}
