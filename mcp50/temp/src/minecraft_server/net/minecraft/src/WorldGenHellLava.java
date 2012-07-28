// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block

public class WorldGenHellLava extends WorldGenerator
{

    private int field_4250_a;

    public WorldGenHellLava(int p_i379_1_)
    {
        field_4250_a = p_i379_1_;
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        if(p_419_1_.func_444_a(p_419_3_, p_419_4_ + 1, p_419_5_) != Block.field_4050_bc.field_573_bc)
        {
            return false;
        }
        if(p_419_1_.func_444_a(p_419_3_, p_419_4_, p_419_5_) != 0 && p_419_1_.func_444_a(p_419_3_, p_419_4_, p_419_5_) != Block.field_4050_bc.field_573_bc)
        {
            return false;
        }
        int i = 0;
        if(p_419_1_.func_444_a(p_419_3_ - 1, p_419_4_, p_419_5_) == Block.field_4050_bc.field_573_bc)
        {
            i++;
        }
        if(p_419_1_.func_444_a(p_419_3_ + 1, p_419_4_, p_419_5_) == Block.field_4050_bc.field_573_bc)
        {
            i++;
        }
        if(p_419_1_.func_444_a(p_419_3_, p_419_4_, p_419_5_ - 1) == Block.field_4050_bc.field_573_bc)
        {
            i++;
        }
        if(p_419_1_.func_444_a(p_419_3_, p_419_4_, p_419_5_ + 1) == Block.field_4050_bc.field_573_bc)
        {
            i++;
        }
        if(p_419_1_.func_444_a(p_419_3_, p_419_4_ - 1, p_419_5_) == Block.field_4050_bc.field_573_bc)
        {
            i++;
        }
        int j = 0;
        if(p_419_1_.func_20111_e(p_419_3_ - 1, p_419_4_, p_419_5_))
        {
            j++;
        }
        if(p_419_1_.func_20111_e(p_419_3_ + 1, p_419_4_, p_419_5_))
        {
            j++;
        }
        if(p_419_1_.func_20111_e(p_419_3_, p_419_4_, p_419_5_ - 1))
        {
            j++;
        }
        if(p_419_1_.func_20111_e(p_419_3_, p_419_4_, p_419_5_ + 1))
        {
            j++;
        }
        if(p_419_1_.func_20111_e(p_419_3_, p_419_4_ - 1, p_419_5_))
        {
            j++;
        }
        if(i == 4 && j == 1)
        {
            p_419_1_.func_508_d(p_419_3_, p_419_4_, p_419_5_, field_4250_a);
            p_419_1_.field_4280_a = true;
            Block.field_542_n[field_4250_a].func_221_a(p_419_1_, p_419_3_, p_419_4_, p_419_5_, p_419_2_);
            p_419_1_.field_4280_a = false;
        }
        return true;
    }
}
