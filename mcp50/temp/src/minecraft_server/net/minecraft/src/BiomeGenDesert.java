// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, Block, BiomeDecorator, WorldGenDesertWells, 
//            World, WorldGenerator

public class BiomeGenDesert extends BiomeGenBase
{

    public BiomeGenDesert(int p_i455_1_)
    {
        super(p_i455_1_);
        field_25057_s.clear();
        field_4286_o = (byte)Block.field_590_F.field_573_bc;
        field_4285_p = (byte)Block.field_590_F.field_573_bc;
        field_35523_u.field_35284_r = -999;
        field_35523_u.field_35281_u = 2;
        field_35523_u.field_35279_w = 50;
        field_35523_u.field_35289_x = 10;
    }

    public void func_35513_a(World p_35513_1_, Random p_35513_2_, int p_35513_3_, int p_35513_4_)
    {
        super.func_35513_a(p_35513_1_, p_35513_2_, p_35513_3_, p_35513_4_);
        if(p_35513_2_.nextInt(1000) == 0)
        {
            int i = p_35513_3_ + p_35513_2_.nextInt(16) + 8;
            int j = p_35513_4_ + p_35513_2_.nextInt(16) + 8;
            WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
            worldgendesertwells.func_419_a(p_35513_1_, p_35513_2_, i, p_35513_1_.func_488_c(i, j) + 1, j);
        }
    }
}
