// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, BiomeDecorator, WorldGenerator

public class BiomeGenSwamp extends BiomeGenBase
{

    protected BiomeGenSwamp(int p_i459_1_)
    {
        super(p_i459_1_);
        field_35523_u.field_35284_r = 2;
        field_35523_u.field_35283_s = -999;
        field_35523_u.field_35281_u = 1;
        field_35523_u.field_35280_v = 8;
        field_35523_u.field_35279_w = 10;
        field_35523_u.field_35261_A = 1;
        field_35523_u.field_40321_y = 4;
        field_40461_A = 0xe0ffae;
    }

    public WorldGenerator func_21114_a(Random p_21114_1_)
    {
        return field_35517_C;
    }
}
