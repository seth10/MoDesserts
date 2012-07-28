// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, BiomeDecorator, Block, BlockMycelium, 
//            SpawnListEntry, EntityMooshroom

public class BiomeGenMushroomIsland extends BiomeGenBase
{

    public BiomeGenMushroomIsland(int p_i209_1_)
    {
        super(p_i209_1_);
        field_35523_u.field_35284_r = -100;
        field_35523_u.field_35283_s = -100;
        field_35523_u.field_35282_t = -100;
        field_35523_u.field_35280_v = 1;
        field_35523_u.field_40318_J = 1;
        field_4286_o = (byte)Block.field_40164_bz.field_573_bc;
        field_25058_r.clear();
        field_25057_s.clear();
        field_25056_t.clear();
        field_25057_s.add(new SpawnListEntry(net.minecraft.src.EntityMooshroom.class, 8, 4, 8));
    }
}
