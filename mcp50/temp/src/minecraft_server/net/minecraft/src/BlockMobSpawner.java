// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, TileEntityMobSpawner, TileEntity

public class BlockMobSpawner extends BlockContainer
{

    protected BlockMobSpawner(int p_i84_1_, int p_i84_2_)
    {
        super(p_i84_1_, p_i84_2_, Material.field_523_d);
    }

    public TileEntity func_294_a_()
    {
        return new TileEntityMobSpawner();
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return 0;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public boolean func_240_b()
    {
        return false;
    }
}
