// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Material, Block

public class WorldGenReed extends WorldGenerator
{

    public WorldGenReed()
    {
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        for(int i = 0; i < 20; i++)
        {
            int j = (p_419_3_ + p_419_2_.nextInt(4)) - p_419_2_.nextInt(4);
            int k = p_419_4_;
            int l = (p_419_5_ + p_419_2_.nextInt(4)) - p_419_2_.nextInt(4);
            if(!p_419_1_.func_20111_e(j, k, l) || p_419_1_.func_443_c(j - 1, k - 1, l) != Material.field_521_f && p_419_1_.func_443_c(j + 1, k - 1, l) != Material.field_521_f && p_419_1_.func_443_c(j, k - 1, l - 1) != Material.field_521_f && p_419_1_.func_443_c(j, k - 1, l + 1) != Material.field_521_f)
            {
                continue;
            }
            int i1 = 2 + p_419_2_.nextInt(p_419_2_.nextInt(3) + 1);
            for(int j1 = 0; j1 < i1; j1++)
            {
                if(Block.field_620_aY.func_220_f(p_419_1_, j, k + j1, l))
                {
                    p_419_1_.func_462_a(j, k + j1, l, Block.field_620_aY.field_573_bc);
                }
            }

        }

        return true;
    }
}
