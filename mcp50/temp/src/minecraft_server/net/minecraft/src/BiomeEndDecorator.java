// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeDecorator, WorldGenSpikes, Block, World, 
//            WorldGenerator, EntityDragon, BiomeGenBase

public class BiomeEndDecorator extends BiomeDecorator
{

    protected WorldGenerator field_40323_L;

    public BiomeEndDecorator(BiomeGenBase p_i292_1_)
    {
        super(p_i292_1_);
        field_40323_L = new WorldGenSpikes(Block.field_40168_bK.field_573_bc);
    }

    protected void func_35256_b()
    {
        func_35253_a();
        if(field_35263_C.nextInt(5) == 0)
        {
            int i = field_35258_D + field_35263_C.nextInt(16) + 8;
            int j = field_35259_E + field_35263_C.nextInt(16) + 8;
            int k = field_35262_B.func_4075_e(i, j);
            if(k <= 0);
            field_40323_L.func_419_a(field_35262_B, field_35263_C, i, k, j);
        }
        if(field_35258_D == 0 && field_35259_E == 0)
        {
            EntityDragon entitydragon = new EntityDragon(field_35262_B);
            entitydragon.func_107_c(0.0D, 128D, 0.0D, field_35263_C.nextFloat() * 360F, 0.0F);
            field_35262_B.func_526_a(entitydragon);
        }
    }
}
