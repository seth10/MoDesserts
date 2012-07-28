// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockFlower

public class WorldGenFlowers extends WorldGenerator
{

    private int field_765_a;

    public WorldGenFlowers(int p_i33_1_)
    {
        field_765_a = p_i33_1_;
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        for(int i = 0; i < 64; i++)
        {
            int j = (p_419_3_ + p_419_2_.nextInt(8)) - p_419_2_.nextInt(8);
            int k = (p_419_4_ + p_419_2_.nextInt(4)) - p_419_2_.nextInt(4);
            int l = (p_419_5_ + p_419_2_.nextInt(8)) - p_419_2_.nextInt(8);
            if(p_419_1_.func_20111_e(j, k, l) && ((BlockFlower)Block.field_542_n[field_765_a]).func_220_f(p_419_1_, j, k, l))
            {
                p_419_1_.func_462_a(j, k, l, field_765_a);
            }
        }

        return true;
    }
}
