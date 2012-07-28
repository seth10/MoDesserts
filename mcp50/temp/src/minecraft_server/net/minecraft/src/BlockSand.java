// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, EntityFallingSand, 
//            BlockFire

public class BlockSand extends Block
{

    public static boolean field_650_a = false;

    public BlockSand(int p_i168_1_, int p_i168_2_)
    {
        super(p_i168_1_, p_i168_2_, Material.field_514_m);
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
        func_284_h(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
    }

    private void func_284_h(World p_284_1_, int p_284_2_, int p_284_3_, int p_284_4_)
    {
        int i = p_284_2_;
        int j = p_284_3_;
        int k = p_284_4_;
        if(func_285_g(p_284_1_, i, j - 1, k) && j >= 0)
        {
            byte byte0 = 32;
            if(field_650_a || !p_284_1_.func_466_a(p_284_2_ - byte0, p_284_3_ - byte0, p_284_4_ - byte0, p_284_2_ + byte0, p_284_3_ + byte0, p_284_4_ + byte0))
            {
                p_284_1_.func_508_d(p_284_2_, p_284_3_, p_284_4_, 0);
                for(; func_285_g(p_284_1_, p_284_2_, p_284_3_ - 1, p_284_4_) && p_284_3_ > 0; p_284_3_--) { }
                if(p_284_3_ > 0)
                {
                    p_284_1_.func_508_d(p_284_2_, p_284_3_, p_284_4_, field_573_bc);
                }
            } else
            if(!p_284_1_.field_792_x)
            {
                EntityFallingSand entityfallingsand = new EntityFallingSand(p_284_1_, (float)p_284_2_ + 0.5F, (float)p_284_3_ + 0.5F, (float)p_284_4_ + 0.5F, field_573_bc);
                p_284_1_.func_526_a(entityfallingsand);
            }
        }
    }

    public int func_4028_b()
    {
        return 3;
    }

    public static boolean func_285_g(World p_285_0_, int p_285_1_, int p_285_2_, int p_285_3_)
    {
        int i = p_285_0_.func_444_a(p_285_1_, p_285_2_, p_285_3_);
        if(i == 0)
        {
            return true;
        }
        if(i == Block.field_599_as.field_573_bc)
        {
            return true;
        }
        Material material = Block.field_542_n[i].field_553_bn;
        if(material == Material.field_521_f)
        {
            return true;
        }
        return material == Material.field_520_g;
    }

}
