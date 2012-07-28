// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Item

public class BlockOre extends Block
{

    public BlockOre(int p_i303_1_, int p_i303_2_)
    {
        super(p_i303_1_, p_i303_2_, Material.field_523_d);
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        if(field_573_bc == Block.field_583_J.field_573_bc)
        {
            return Item.field_168_k.field_234_aS;
        }
        if(field_573_bc == Block.field_588_ax.field_573_bc)
        {
            return Item.field_167_l.field_234_aS;
        }
        if(field_573_bc == Block.field_9042_N.field_573_bc)
        {
            return Item.field_21097_aU.field_234_aS;
        } else
        {
            return field_573_bc;
        }
    }

    public int func_244_a(Random p_244_1_)
    {
        if(field_573_bc == Block.field_9042_N.field_573_bc)
        {
            return 4 + p_244_1_.nextInt(5);
        } else
        {
            return 1;
        }
    }

    public int func_40162_a(int p_40162_1_, Random p_40162_2_)
    {
        if(p_40162_1_ > 0 && field_573_bc != func_252_a(0, p_40162_2_, p_40162_1_))
        {
            int i = p_40162_2_.nextInt(p_40162_1_ + 2) - 1;
            if(i < 0)
            {
                i = 0;
            }
            return func_244_a(p_40162_2_) * (i + 1);
        } else
        {
            return func_244_a(p_40162_2_);
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return field_573_bc != Block.field_9042_N.field_573_bc ? 0 : 4;
    }
}
