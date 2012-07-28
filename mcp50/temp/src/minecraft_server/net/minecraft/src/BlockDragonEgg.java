// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, BlockSand, 
//            EntityFallingSand, EntityPlayer

public class BlockDragonEgg extends Block
{

    public BlockDragonEgg(int p_i102_1_, int p_i102_2_)
    {
        super(p_i102_1_, p_i102_2_, Material.field_41042_z);
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        p_250_1_.func_22074_c(p_250_2_, p_250_3_, p_250_4_, field_573_bc, func_4028_b());
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        p_234_1_.func_22074_c(p_234_2_, p_234_3_, p_234_4_, field_573_bc, func_4028_b());
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        func_41005_c(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
    }

    private void func_41005_c(World p_41005_1_, int p_41005_2_, int p_41005_3_, int p_41005_4_)
    {
        int i = p_41005_2_;
        int j = p_41005_3_;
        int k = p_41005_4_;
        if(BlockSand.func_285_g(p_41005_1_, i, j - 1, k) && j >= 0)
        {
            byte byte0 = 32;
            if(BlockSand.field_650_a || !p_41005_1_.func_466_a(p_41005_2_ - byte0, p_41005_3_ - byte0, p_41005_4_ - byte0, p_41005_2_ + byte0, p_41005_3_ + byte0, p_41005_4_ + byte0))
            {
                p_41005_1_.func_508_d(p_41005_2_, p_41005_3_, p_41005_4_, 0);
                for(; BlockSand.func_285_g(p_41005_1_, p_41005_2_, p_41005_3_ - 1, p_41005_4_) && p_41005_3_ > 0; p_41005_3_--) { }
                if(p_41005_3_ > 0)
                {
                    p_41005_1_.func_508_d(p_41005_2_, p_41005_3_, p_41005_4_, field_573_bc);
                }
            } else
            {
                EntityFallingSand entityfallingsand = new EntityFallingSand(p_41005_1_, (float)p_41005_2_ + 0.5F, (float)p_41005_3_ + 0.5F, (float)p_41005_4_ + 0.5F, field_573_bc);
                p_41005_1_.func_526_a(entityfallingsand);
            }
        }
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        func_41004_h(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
        return true;
    }

    public void func_235_b(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_, EntityPlayer p_235_5_)
    {
        func_41004_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
    }

    private void func_41004_h(World p_41004_1_, int p_41004_2_, int p_41004_3_, int p_41004_4_)
    {
        if(p_41004_1_.func_444_a(p_41004_2_, p_41004_3_, p_41004_4_) != field_573_bc)
        {
            return;
        }
        if(p_41004_1_.field_792_x)
        {
            return;
        }
        for(int i = 0; i < 1000; i++)
        {
            int j = (p_41004_2_ + p_41004_1_.field_803_m.nextInt(16)) - p_41004_1_.field_803_m.nextInt(16);
            int k = (p_41004_3_ + p_41004_1_.field_803_m.nextInt(8)) - p_41004_1_.field_803_m.nextInt(8);
            int l = (p_41004_4_ + p_41004_1_.field_803_m.nextInt(16)) - p_41004_1_.field_803_m.nextInt(16);
            if(p_41004_1_.func_444_a(j, k, l) == 0)
            {
                p_41004_1_.func_507_b(j, k, l, field_573_bc, p_41004_1_.func_446_b(p_41004_2_, p_41004_3_, p_41004_4_));
                p_41004_1_.func_508_d(p_41004_2_, p_41004_3_, p_41004_4_, 0);
                char c = '\200';
                for(int i1 = 0; i1 < c; i1++)
                {
                    double d = p_41004_1_.field_803_m.nextDouble();
                    float f = (p_41004_1_.field_803_m.nextFloat() - 0.5F) * 0.2F;
                    float f1 = (p_41004_1_.field_803_m.nextFloat() - 0.5F) * 0.2F;
                    float f2 = (p_41004_1_.field_803_m.nextFloat() - 0.5F) * 0.2F;
                    double d1 = (double)j + (double)(p_41004_2_ - j) * d + (p_41004_1_.field_803_m.nextDouble() - 0.5D) * 1.0D + 0.5D;
                    double d2 = ((double)k + (double)(p_41004_3_ - k) * d + p_41004_1_.field_803_m.nextDouble() * 1.0D) - 0.5D;
                    double d3 = (double)l + (double)(p_41004_4_ - l) * d + (p_41004_1_.field_803_m.nextDouble() - 0.5D) * 1.0D + 0.5D;
                    p_41004_1_.func_514_a("portal", d1, d2, d3, f, f1, f2);
                }

                return;
            }
        }

    }

    public int func_4028_b()
    {
        return 3;
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return super.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_);
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public int func_40161_b()
    {
        return 27;
    }
}
