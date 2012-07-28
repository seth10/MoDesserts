// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Chunk, World, EnumSkyBlock, Entity, 
//            TileEntity, AxisAlignedBB

public class EmptyChunk extends Chunk
{

    public EmptyChunk(World p_i267_1_, int p_i267_2_, int p_i267_3_)
    {
        super(p_i267_1_, p_i267_2_, p_i267_3_);
    }

    public boolean func_351_a(int p_351_1_, int p_351_2_)
    {
        return p_351_1_ == field_685_j && p_351_2_ == field_684_k;
    }

    public int func_337_b(int p_337_1_, int p_337_2_)
    {
        return 0;
    }

    public void func_353_b()
    {
    }

    public void func_4053_c()
    {
    }

    public int func_344_a(int p_344_1_, int p_344_2_, int p_344_3_)
    {
        return 0;
    }

    public int func_48555_b(int p_48555_1_, int p_48555_2_, int p_48555_3_)
    {
        return 255;
    }

    public boolean func_346_a(int p_346_1_, int p_346_2_, int p_346_3_, int i, int j)
    {
        return true;
    }

    public boolean func_357_a(int p_357_1_, int p_357_2_, int p_357_3_, int i)
    {
        return true;
    }

    public int func_356_b(int p_356_1_, int p_356_2_, int p_356_3_)
    {
        return 0;
    }

    public boolean func_345_b(int p_345_1_, int p_345_2_, int p_345_3_, int i)
    {
        return false;
    }

    public int func_341_a(EnumSkyBlock p_341_1_, int p_341_2_, int p_341_3_, int i)
    {
        return 0;
    }

    public void func_330_a(EnumSkyBlock enumskyblock, int i, int j, int k, int l)
    {
    }

    public int func_354_c(int p_354_1_, int p_354_2_, int p_354_3_, int i)
    {
        return 0;
    }

    public void func_335_a(Entity entity)
    {
    }

    public void func_350_b(Entity entity)
    {
    }

    public void func_332_a(Entity entity, int i)
    {
    }

    public boolean func_343_c(int p_343_1_, int p_343_2_, int p_343_3_)
    {
        return false;
    }

    public TileEntity func_338_d(int p_338_1_, int p_338_2_, int p_338_3_)
    {
        return null;
    }

    public void func_349_a(TileEntity tileentity)
    {
    }

    public void func_352_a(int i, int j, int k, TileEntity tileentity)
    {
    }

    public void func_359_e(int i, int j, int k)
    {
    }

    public void func_358_c()
    {
    }

    public void func_331_d()
    {
    }

    public void func_336_e()
    {
    }

    public void func_329_a(Entity entity, AxisAlignedBB axisalignedbb, List list)
    {
    }

    public void func_342_a(Class class1, AxisAlignedBB axisalignedbb, List list)
    {
    }

    public boolean func_347_a(boolean p_347_1_)
    {
        return false;
    }

    public Random func_334_a(long p_334_1_)
    {
        return new Random(field_691_d.func_22079_j() + (long)(field_685_j * field_685_j * 0x4c1906) + (long)(field_685_j * 0x5ac0db) + (long)(field_684_k * field_684_k) * 0x4307a7L + (long)(field_684_k * 0x5f24f) ^ p_334_1_);
    }

    public boolean func_41049_g()
    {
        return true;
    }

    public boolean func_48556_c(int p_48556_1_, int p_48556_2_)
    {
        return true;
    }
}
