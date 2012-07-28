// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, Block, World, Material

public class WorldGenClay extends WorldGenerator
{

    private int field_764_a;
    private int field_763_b;

    public WorldGenClay(int p_i301_1_)
    {
        field_764_a = Block.field_621_aX.field_573_bc;
        field_763_b = p_i301_1_;
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        if(p_419_1_.func_443_c(p_419_3_, p_419_4_, p_419_5_) != Material.field_521_f)
        {
            return false;
        }
        int i = p_419_2_.nextInt(field_763_b - 2) + 2;
        int j = 1;
        for(int k = p_419_3_ - i; k <= p_419_3_ + i; k++)
        {
            for(int l = p_419_5_ - i; l <= p_419_5_ + i; l++)
            {
                int i1 = k - p_419_3_;
                int j1 = l - p_419_5_;
                if(i1 * i1 + j1 * j1 > i * i)
                {
                    continue;
                }
                for(int k1 = p_419_4_ - j; k1 <= p_419_4_ + j; k1++)
                {
                    int l1 = p_419_1_.func_444_a(k, k1, l);
                    if(l1 == Block.field_533_w.field_573_bc || l1 == Block.field_621_aX.field_573_bc)
                    {
                        p_419_1_.func_462_a(k, k1, l, field_764_a);
                    }
                }

            }

        }

        return true;
    }
}
