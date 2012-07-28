// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, SpawnListEntry, EntityWolf, BiomeDecorator, 
//            WorldGenerator

public class BiomeGenForest extends BiomeGenBase
{

    public BiomeGenForest(int p_i405_1_)
    {
        super(p_i405_1_);
        field_25057_s.add(new SpawnListEntry(net.minecraft.src.EntityWolf.class, 5, 4, 4));
        field_35523_u.field_35284_r = 10;
        field_35523_u.field_35282_t = 2;
    }

    public WorldGenerator func_21114_a(Random p_21114_1_)
    {
        if(p_21114_1_.nextInt(5) == 0)
        {
            return field_35516_B;
        }
        if(p_21114_1_.nextInt(10) == 0)
        {
            return field_35515_A;
        } else
        {
            return field_35528_z;
        }
    }
}
