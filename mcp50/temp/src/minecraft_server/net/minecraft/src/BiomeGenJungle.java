// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, BiomeDecorator, SpawnListEntry, EntityOcelot, 
//            EntityChicken, WorldGenShrub, WorldGenHugeTrees, WorldGenTrees, 
//            WorldGenTallGrass, Block, BlockTallGrass, WorldGenVines, 
//            WorldGenerator, World

public class BiomeGenJungle extends BiomeGenBase
{

    public BiomeGenJungle(int p_i1013_1_)
    {
        super(p_i1013_1_);
        field_35523_u.field_35284_r = 50;
        field_35523_u.field_35282_t = 25;
        field_35523_u.field_35283_s = 4;
        field_25058_r.add(new SpawnListEntry(net.minecraft.src.EntityOcelot.class, 2, 1, 1));
        field_25057_s.add(new SpawnListEntry(net.minecraft.src.EntityChicken.class, 10, 4, 4));
    }

    public WorldGenerator func_21114_a(Random p_21114_1_)
    {
        if(p_21114_1_.nextInt(10) == 0)
        {
            return field_35515_A;
        }
        if(p_21114_1_.nextInt(2) == 0)
        {
            return new WorldGenShrub(3, 0);
        }
        if(p_21114_1_.nextInt(3) == 0)
        {
            return new WorldGenHugeTrees(false, 10 + p_21114_1_.nextInt(20), 3, 3);
        } else
        {
            return new WorldGenTrees(false, 4 + p_21114_1_.nextInt(7), 3, 3, true);
        }
    }

    public WorldGenerator func_48440_b(Random p_48440_1_)
    {
        if(p_48440_1_.nextInt(4) == 0)
        {
            return new WorldGenTallGrass(Block.field_9031_X.field_573_bc, 2);
        } else
        {
            return new WorldGenTallGrass(Block.field_9031_X.field_573_bc, 1);
        }
    }

    public void func_35513_a(World p_35513_1_, Random p_35513_2_, int p_35513_3_, int p_35513_4_)
    {
        super.func_35513_a(p_35513_1_, p_35513_2_, p_35513_3_, p_35513_4_);
        WorldGenVines worldgenvines = new WorldGenVines();
        for(int i = 0; i < 50; i++)
        {
            int j = p_35513_3_ + p_35513_2_.nextInt(16) + 8;
            byte byte0 = 64;
            int k = p_35513_4_ + p_35513_2_.nextInt(16) + 8;
            worldgenvines.func_419_a(p_35513_1_, p_35513_2_, j, byte0, k);
        }

    }
}
