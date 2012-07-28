// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            World, Chunk

public abstract class WorldGenerator
{

    private final boolean field_41044_a;

    public WorldGenerator()
    {
        field_41044_a = false;
    }

    public WorldGenerator(boolean p_i367_1_)
    {
        field_41044_a = p_i367_1_;
    }

    public abstract boolean func_419_a(World world, Random random, int i, int j, int k);

    public void func_420_a(double d, double d1, double d2)
    {
    }

    protected void func_50023_a(World p_50023_1_, int p_50023_2_, int p_50023_3_, int p_50023_4_, int p_50023_5_)
    {
        func_41043_a(p_50023_1_, p_50023_2_, p_50023_3_, p_50023_4_, p_50023_5_, 0);
    }

    protected void func_41043_a(World p_41043_1_, int p_41043_2_, int p_41043_3_, int p_41043_4_, int p_41043_5_, int p_41043_6_)
    {
        if(field_41044_a)
        {
            p_41043_1_.func_507_b(p_41043_2_, p_41043_3_, p_41043_4_, p_41043_5_, p_41043_6_);
        } else
        if(p_41043_1_.func_530_e(p_41043_2_, p_41043_3_, p_41043_4_) && p_41043_1_.func_492_a(p_41043_2_, p_41043_4_).field_50025_o)
        {
            if(p_41043_1_.func_470_a(p_41043_2_, p_41043_3_, p_41043_4_, p_41043_5_, p_41043_6_))
            {
                p_41043_1_.func_521_f(p_41043_2_, p_41043_3_, p_41043_4_);
            }
        } else
        {
            p_41043_1_.func_470_a(p_41043_2_, p_41043_3_, p_41043_4_, p_41043_5_, p_41043_6_);
        }
    }
}
