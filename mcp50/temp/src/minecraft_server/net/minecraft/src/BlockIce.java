// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockBreakable, Material, World, Block, 
//            EnumSkyBlock, EntityPlayer, ItemStack

public class BlockIce extends BlockBreakable
{

    public BlockIce(int p_i317_1_, int p_i317_2_)
    {
        super(p_i317_1_, p_i317_2_, Material.field_509_r, false);
        field_552_bo = 0.98F;
        func_231_a(true);
    }

    public void func_12007_g(World p_12007_1_, EntityPlayer p_12007_2_, int p_12007_3_, int p_12007_4_, int p_12007_5_, int p_12007_6_)
    {
        super.func_12007_g(p_12007_1_, p_12007_2_, p_12007_3_, p_12007_4_, p_12007_5_, p_12007_6_);
        Material material = p_12007_1_.func_443_c(p_12007_3_, p_12007_4_ - 1, p_12007_5_);
        if(material.func_218_c() || material.func_217_d())
        {
            p_12007_1_.func_508_d(p_12007_3_, p_12007_4_, p_12007_5_, Block.field_598_B.field_573_bc);
        }
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_1_.func_512_a(EnumSkyBlock.Block, p_221_2_, p_221_3_, p_221_4_) > 11 - Block.field_538_r[field_573_bc])
        {
            func_247_a_(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_), 0);
            p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, Block.field_596_C.field_573_bc);
        }
    }

    public int func_31025_e()
    {
        return 0;
    }

    protected ItemStack func_41001_e(int p_41001_1_)
    {
        return null;
    }
}
