// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Material, Block, 
//            BlockGrass

public class WorldGenSand extends WorldGenerator
{

    private int field_35291_a;
    private int field_35290_b;

    public WorldGenSand(int p_i157_1_, int p_i157_2_)
    {
        field_35291_a = p_i157_2_;
        field_35290_b = p_i157_1_;
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        if(p_419_1_.func_443_c(p_419_3_, p_419_4_, p_419_5_) != Material.field_521_f)
        {
            return false;
        }
        int i = p_419_2_.nextInt(field_35290_b - 2) + 2;
        byte byte0 = 2;
        for(int j = p_419_3_ - i; j <= p_419_3_ + i; j++)
        {
            for(int k = p_419_5_ - i; k <= p_419_5_ + i; k++)
            {
                int l = j - p_419_3_;
                int i1 = k - p_419_5_;
                if(l * l + i1 * i1 > i * i)
                {
                    continue;
                }
                for(int j1 = p_419_4_ - byte0; j1 <= p_419_4_ + byte0; j1++)
                {
                    int k1 = p_419_1_.func_444_a(j, j1, k);
                    if(k1 == Block.field_533_w.field_573_bc || k1 == Block.field_534_v.field_573_bc)
                    {
                        p_419_1_.func_462_a(j, j1, k, field_35291_a);
                    }
                }

            }

        }

        return true;
    }
}
