// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Entity, Item, 
//            World, AxisAlignedBB

public class BlockWeb extends Block
{

    public BlockWeb(int p_i418_1_, int p_i418_2_)
    {
        super(p_i418_1_, p_i418_2_, Material.field_31063_A);
    }

    public void func_263_a(World p_263_1_, int p_263_2_, int p_263_3_, int p_263_4_, Entity p_263_5_)
    {
        p_263_5_.func_35147_q();
    }

    public boolean func_240_b()
    {
        return false;
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public int func_40161_b()
    {
        return 1;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_196_I.field_234_aS;
    }
}
