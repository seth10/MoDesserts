// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block

public class WorldGenWaterlily extends WorldGenerator
{

    public WorldGenWaterlily()
    {
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        for(int i = 0; i < 10; i++)
        {
            int j = (p_419_3_ + p_419_2_.nextInt(8)) - p_419_2_.nextInt(8);
            int k = (p_419_4_ + p_419_2_.nextInt(4)) - p_419_2_.nextInt(4);
            int l = (p_419_5_ + p_419_2_.nextInt(8)) - p_419_2_.nextInt(8);
            if(p_419_1_.func_20111_e(j, k, l) && Block.field_40165_bA.func_259_a(p_419_1_, j, k, l))
            {
                p_419_1_.func_462_a(j, k, l, Block.field_40165_bA.field_573_bc);
            }
        }

        return true;
    }
}
