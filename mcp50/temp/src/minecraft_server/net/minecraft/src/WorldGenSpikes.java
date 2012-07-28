// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, EntityEnderCrystal, 
//            Entity

public class WorldGenSpikes extends WorldGenerator
{

    private int field_40207_a;

    public WorldGenSpikes(int p_i339_1_)
    {
        field_40207_a = p_i339_1_;
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        if(!p_419_1_.func_20111_e(p_419_3_, p_419_4_, p_419_5_) || p_419_1_.func_444_a(p_419_3_, p_419_4_ - 1, p_419_5_) != field_40207_a)
        {
            return false;
        }
        int i = p_419_2_.nextInt(32) + 6;
        int j = p_419_2_.nextInt(4) + 1;
        for(int k = p_419_3_ - j; k <= p_419_3_ + j; k++)
        {
            for(int i1 = p_419_5_ - j; i1 <= p_419_5_ + j; i1++)
            {
                int k1 = k - p_419_3_;
                int i2 = i1 - p_419_5_;
                if(k1 * k1 + i2 * i2 <= j * j + 1 && p_419_1_.func_444_a(k, p_419_4_ - 1, i1) != field_40207_a)
                {
                    return false;
                }
            }

        }

        for(int l = p_419_4_; l < p_419_4_ + i && l < 128; l++)
        {
            for(int j1 = p_419_3_ - j; j1 <= p_419_3_ + j; j1++)
            {
                for(int l1 = p_419_5_ - j; l1 <= p_419_5_ + j; l1++)
                {
                    int j2 = j1 - p_419_3_;
                    int k2 = l1 - p_419_5_;
                    if(j2 * j2 + k2 * k2 <= j * j + 1)
                    {
                        p_419_1_.func_508_d(j1, l, l1, Block.field_602_aq.field_573_bc);
                    }
                }

            }

        }

        EntityEnderCrystal entityendercrystal = new EntityEnderCrystal(p_419_1_);
        entityendercrystal.func_107_c((float)p_419_3_ + 0.5F, p_419_4_ + i, (float)p_419_5_ + 0.5F, p_419_2_.nextFloat() * 360F, 0.0F);
        p_419_1_.func_526_a(entityendercrystal);
        p_419_1_.func_508_d(p_419_3_, p_419_4_ + i, p_419_5_, Block.field_4064_A.field_573_bc);
        return true;
    }
}
