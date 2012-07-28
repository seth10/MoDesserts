// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, Direction, 
//            Facing

public class WorldGenVines extends WorldGenerator
{

    public WorldGenVines()
    {
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        int i = p_419_3_;
        int j = p_419_5_;
label0:
        for(; p_419_4_ < 128; p_419_4_++)
        {
            if(p_419_1_.func_20111_e(p_419_3_, p_419_4_, p_419_5_))
            {
                int k = 2;
                do
                {
                    if(k > 5)
                    {
                        continue label0;
                    }
                    if(Block.field_35045_bv.func_28026_e(p_419_1_, p_419_3_, p_419_4_, p_419_5_, k))
                    {
                        p_419_1_.func_470_a(p_419_3_, p_419_4_, p_419_5_, Block.field_35045_bv.field_573_bc, 1 << Direction.field_35609_d[Facing.field_31052_a[k]]);
                        continue label0;
                    }
                    k++;
                } while(true);
            }
            p_419_3_ = (i + p_419_2_.nextInt(4)) - p_419_2_.nextInt(4);
            p_419_5_ = (j + p_419_2_.nextInt(4)) - p_419_2_.nextInt(4);
        }

        return true;
    }
}
