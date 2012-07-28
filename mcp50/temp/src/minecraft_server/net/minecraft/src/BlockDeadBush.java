// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, Material, Block, World, 
//            EntityPlayer, ItemStack, Item, ItemShears, 
//            StatList

public class BlockDeadBush extends BlockFlower
{

    protected BlockDeadBush(int p_i226_1_, int p_i226_2_)
    {
        super(p_i226_1_, p_i226_2_, Material.field_35574_k);
        float f = 0.4F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
    }

    protected boolean func_277_b(int p_277_1_)
    {
        return p_277_1_ == Block.field_590_F.field_573_bc;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        return field_575_bb;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return -1;
    }

    public void func_12007_g(World p_12007_1_, EntityPlayer p_12007_2_, int p_12007_3_, int p_12007_4_, int p_12007_5_, int p_12007_6_)
    {
        if(!p_12007_1_.field_792_x && p_12007_2_.func_172_B() != null && p_12007_2_.func_172_B().field_855_c == Item.field_31022_bc.field_234_aS)
        {
            p_12007_2_.func_25046_a(StatList.field_25094_y[field_573_bc], 1);
            func_31024_a(p_12007_1_, p_12007_3_, p_12007_4_, p_12007_5_, new ItemStack(Block.field_9030_Y, 1, p_12007_6_));
        } else
        {
            super.func_12007_g(p_12007_1_, p_12007_2_, p_12007_3_, p_12007_4_, p_12007_5_, p_12007_6_);
        }
    }
}
