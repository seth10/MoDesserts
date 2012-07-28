// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block

public class WorldGenGlowStone2 extends WorldGenerator
{

    public WorldGenGlowStone2()
    {
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        if(!p_419_1_.func_20111_e(p_419_3_, p_419_4_, p_419_5_))
        {
            return false;
        }
        if(p_419_1_.func_444_a(p_419_3_, p_419_4_ + 1, p_419_5_) != Block.field_4050_bc.field_573_bc)
        {
            return false;
        }
        p_419_1_.func_508_d(p_419_3_, p_419_4_, p_419_5_, Block.field_6065_bd.field_573_bc);
        for(int i = 0; i < 1500; i++)
        {
            int j = (p_419_3_ + p_419_2_.nextInt(8)) - p_419_2_.nextInt(8);
            int k = p_419_4_ - p_419_2_.nextInt(12);
            int l = (p_419_5_ + p_419_2_.nextInt(8)) - p_419_2_.nextInt(8);
            if(p_419_1_.func_444_a(j, k, l) != 0)
            {
                continue;
            }
            int i1 = 0;
            for(int j1 = 0; j1 < 6; j1++)
            {
                int k1 = 0;
                if(j1 == 0)
                {
                    k1 = p_419_1_.func_444_a(j - 1, k, l);
                }
                if(j1 == 1)
                {
                    k1 = p_419_1_.func_444_a(j + 1, k, l);
                }
                if(j1 == 2)
                {
                    k1 = p_419_1_.func_444_a(j, k - 1, l);
                }
                if(j1 == 3)
                {
                    k1 = p_419_1_.func_444_a(j, k + 1, l);
                }
                if(j1 == 4)
                {
                    k1 = p_419_1_.func_444_a(j, k, l - 1);
                }
                if(j1 == 5)
                {
                    k1 = p_419_1_.func_444_a(j, k, l + 1);
                }
                if(k1 == Block.field_6065_bd.field_573_bc)
                {
                    i1++;
                }
            }

            if(i1 == 1)
            {
                p_419_1_.func_508_d(j, k, l, Block.field_6065_bd.field_573_bc);
            }
        }

        return true;
    }
}
