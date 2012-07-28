// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockGrass

public class WorldGenShrub extends WorldGenerator
{

    private int field_48408_a;
    private int field_48407_b;

    public WorldGenShrub(int p_i1070_1_, int p_i1070_2_)
    {
        field_48407_b = p_i1070_1_;
        field_48408_a = p_i1070_2_;
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        for(int i = 0; ((i = p_419_1_.func_444_a(p_419_3_, p_419_4_, p_419_5_)) == 0 || i == Block.field_581_L.field_573_bc) && p_419_4_ > 0; p_419_4_--) { }
        int j = p_419_1_.func_444_a(p_419_3_, p_419_4_, p_419_5_);
        if(j == Block.field_533_w.field_573_bc || j == Block.field_534_v.field_573_bc)
        {
            p_419_4_++;
            func_41043_a(p_419_1_, p_419_3_, p_419_4_, p_419_5_, Block.field_582_K.field_573_bc, field_48407_b);
            for(int k = p_419_4_; k <= p_419_4_ + 2; k++)
            {
                int l = k - p_419_4_;
                int i1 = 2 - l;
                for(int j1 = p_419_3_ - i1; j1 <= p_419_3_ + i1; j1++)
                {
                    int k1 = j1 - p_419_3_;
                    for(int l1 = p_419_5_ - i1; l1 <= p_419_5_ + i1; l1++)
                    {
                        int i2 = l1 - p_419_5_;
                        if((Math.abs(k1) != i1 || Math.abs(i2) != i1 || p_419_2_.nextInt(2) != 0) && !Block.field_540_p[p_419_1_.func_444_a(j1, k, l1)])
                        {
                            func_41043_a(p_419_1_, j1, k, l1, Block.field_581_L.field_573_bc, field_48408_a);
                        }
                    }

                }

            }

        }
        return true;
    }
}
