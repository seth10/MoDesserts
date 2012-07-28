// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockFlower

public class WorldGenTallGrass extends WorldGenerator
{

    private int field_28057_a;
    private int field_28056_b;

    public WorldGenTallGrass(int p_i18_1_, int p_i18_2_)
    {
        field_28057_a = p_i18_1_;
        field_28056_b = p_i18_2_;
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        for(int i = 0; ((i = p_419_1_.func_444_a(p_419_3_, p_419_4_, p_419_5_)) == 0 || i == Block.field_581_L.field_573_bc) && p_419_4_ > 0; p_419_4_--) { }
        for(int j = 0; j < 128; j++)
        {
            int k = (p_419_3_ + p_419_2_.nextInt(8)) - p_419_2_.nextInt(8);
            int l = (p_419_4_ + p_419_2_.nextInt(4)) - p_419_2_.nextInt(4);
            int i1 = (p_419_5_ + p_419_2_.nextInt(8)) - p_419_2_.nextInt(8);
            if(p_419_1_.func_20111_e(k, l, i1) && ((BlockFlower)Block.field_542_n[field_28057_a]).func_220_f(p_419_1_, k, l, i1))
            {
                p_419_1_.func_470_a(k, l, i1, field_28057_a, field_28056_b);
            }
        }

        return true;
    }
}
