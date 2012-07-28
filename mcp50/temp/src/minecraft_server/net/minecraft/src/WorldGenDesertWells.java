// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block

public class WorldGenDesertWells extends WorldGenerator
{

    public WorldGenDesertWells()
    {
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        for(; p_419_1_.func_20111_e(p_419_3_, p_419_4_, p_419_5_) && p_419_4_ > 2; p_419_4_--) { }
        int i = p_419_1_.func_444_a(p_419_3_, p_419_4_, p_419_5_);
        if(i != Block.field_590_F.field_573_bc)
        {
            return false;
        }
        for(int j = -2; j <= 2; j++)
        {
            for(int k1 = -2; k1 <= 2; k1++)
            {
                if(p_419_1_.func_20111_e(p_419_3_ + j, p_419_4_ - 1, p_419_5_ + k1) && p_419_1_.func_20111_e(p_419_3_ + j, p_419_4_ - 2, p_419_5_ + k1))
                {
                    return false;
                }
            }

        }

        for(int k = -1; k <= 0; k++)
        {
            for(int l1 = -2; l1 <= 2; l1++)
            {
                for(int k2 = -2; k2 <= 2; k2++)
                {
                    p_419_1_.func_462_a(p_419_3_ + l1, p_419_4_ + k, p_419_5_ + k2, Block.field_9039_Q.field_573_bc);
                }

            }

        }

        p_419_1_.func_462_a(p_419_3_, p_419_4_, p_419_5_, Block.field_598_B.field_573_bc);
        p_419_1_.func_462_a(p_419_3_ - 1, p_419_4_, p_419_5_, Block.field_598_B.field_573_bc);
        p_419_1_.func_462_a(p_419_3_ + 1, p_419_4_, p_419_5_, Block.field_598_B.field_573_bc);
        p_419_1_.func_462_a(p_419_3_, p_419_4_, p_419_5_ - 1, Block.field_598_B.field_573_bc);
        p_419_1_.func_462_a(p_419_3_, p_419_4_, p_419_5_ + 1, Block.field_598_B.field_573_bc);
        for(int l = -2; l <= 2; l++)
        {
            for(int i2 = -2; i2 <= 2; i2++)
            {
                if(l == -2 || l == 2 || i2 == -2 || i2 == 2)
                {
                    p_419_1_.func_462_a(p_419_3_ + l, p_419_4_ + 1, p_419_5_ + i2, Block.field_9039_Q.field_573_bc);
                }
            }

        }

        p_419_1_.func_470_a(p_419_3_ + 2, p_419_4_ + 1, p_419_5_, Block.field_607_al.field_573_bc, 1);
        p_419_1_.func_470_a(p_419_3_ - 2, p_419_4_ + 1, p_419_5_, Block.field_607_al.field_573_bc, 1);
        p_419_1_.func_470_a(p_419_3_, p_419_4_ + 1, p_419_5_ + 2, Block.field_607_al.field_573_bc, 1);
        p_419_1_.func_470_a(p_419_3_, p_419_4_ + 1, p_419_5_ - 2, Block.field_607_al.field_573_bc, 1);
        for(int i1 = -1; i1 <= 1; i1++)
        {
            for(int j2 = -1; j2 <= 1; j2++)
            {
                if(i1 == 0 && j2 == 0)
                {
                    p_419_1_.func_462_a(p_419_3_ + i1, p_419_4_ + 4, p_419_5_ + j2, Block.field_9039_Q.field_573_bc);
                } else
                {
                    p_419_1_.func_470_a(p_419_3_ + i1, p_419_4_ + 4, p_419_5_ + j2, Block.field_607_al.field_573_bc, 1);
                }
            }

        }

        for(int j1 = 1; j1 <= 3; j1++)
        {
            p_419_1_.func_462_a(p_419_3_ - 1, p_419_4_ + j1, p_419_5_ - 1, Block.field_9039_Q.field_573_bc);
            p_419_1_.func_462_a(p_419_3_ - 1, p_419_4_ + j1, p_419_5_ + 1, Block.field_9039_Q.field_573_bc);
            p_419_1_.func_462_a(p_419_3_ + 1, p_419_4_ + j1, p_419_5_ - 1, Block.field_9039_Q.field_573_bc);
            p_419_1_.func_462_a(p_419_3_ + 1, p_419_4_ + j1, p_419_5_ + 1, Block.field_9039_Q.field_573_bc);
        }

        return true;
    }
}
