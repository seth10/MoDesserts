// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, SpawnListEntry, EntityEnderman, Block, 
//            BiomeEndDecorator

public class BiomeGenEnd extends BiomeGenBase
{

    public BiomeGenEnd(int p_i201_1_)
    {
        super(p_i201_1_);
        field_25058_r.clear();
        field_25057_s.clear();
        field_25056_t.clear();
        field_25058_r.add(new SpawnListEntry(net.minecraft.src.EntityEnderman.class, 10, 4, 4));
        field_4286_o = (byte)Block.field_533_w.field_573_bc;
        field_4285_p = (byte)Block.field_533_w.field_573_bc;
        field_35523_u = new BiomeEndDecorator(this);
    }
}
