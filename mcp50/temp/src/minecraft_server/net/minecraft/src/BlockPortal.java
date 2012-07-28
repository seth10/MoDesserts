// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockBreakable, Material, IBlockAccess, World, 
//            Block, BlockFire, Entity, AxisAlignedBB

public class BlockPortal extends BlockBreakable
{

    public BlockPortal(int p_i12_1_, int p_i12_2_)
    {
        super(p_i12_1_, p_i12_2_, Material.field_4212_x, false);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        if(p_233_1_.func_444_a(p_233_2_ - 1, p_233_3_, p_233_4_) == field_573_bc || p_233_1_.func_444_a(p_233_2_ + 1, p_233_3_, p_233_4_) == field_573_bc)
        {
            float f = 0.5F;
            float f2 = 0.125F;
            func_229_a(0.5F - f, 0.0F, 0.5F - f2, 0.5F + f, 1.0F, 0.5F + f2);
        } else
        {
            float f1 = 0.125F;
            float f3 = 0.5F;
            func_229_a(0.5F - f1, 0.0F, 0.5F - f3, 0.5F + f1, 1.0F, 0.5F + f3);
        }
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_4030_a_(World p_4030_1_, int p_4030_2_, int p_4030_3_, int p_4030_4_)
    {
        int i = 0;
        int j = 0;
        if(p_4030_1_.func_444_a(p_4030_2_ - 1, p_4030_3_, p_4030_4_) == Block.field_602_aq.field_573_bc || p_4030_1_.func_444_a(p_4030_2_ + 1, p_4030_3_, p_4030_4_) == Block.field_602_aq.field_573_bc)
        {
            i = 1;
        }
        if(p_4030_1_.func_444_a(p_4030_2_, p_4030_3_, p_4030_4_ - 1) == Block.field_602_aq.field_573_bc || p_4030_1_.func_444_a(p_4030_2_, p_4030_3_, p_4030_4_ + 1) == Block.field_602_aq.field_573_bc)
        {
            j = 1;
        }
        if(i == j)
        {
            return false;
        }
        if(p_4030_1_.func_444_a(p_4030_2_ - i, p_4030_3_, p_4030_4_ - j) == 0)
        {
            p_4030_2_ -= i;
            p_4030_4_ -= j;
        }
        for(int k = -1; k <= 2; k++)
        {
            for(int i1 = -1; i1 <= 3; i1++)
            {
                boolean flag = k == -1 || k == 2 || i1 == -1 || i1 == 3;
                if((k == -1 || k == 2) && (i1 == -1 || i1 == 3))
                {
                    continue;
                }
                int k1 = p_4030_1_.func_444_a(p_4030_2_ + i * k, p_4030_3_ + i1, p_4030_4_ + j * k);
                if(flag)
                {
                    if(k1 != Block.field_602_aq.field_573_bc)
                    {
                        return false;
                    }
                    continue;
                }
                if(k1 != 0 && k1 != Block.field_599_as.field_573_bc)
                {
                    return false;
                }
            }

        }

        p_4030_1_.field_808_h = true;
        for(int l = 0; l < 2; l++)
        {
            for(int j1 = 0; j1 < 3; j1++)
            {
                p_4030_1_.func_508_d(p_4030_2_ + i * l, p_4030_3_ + j1, p_4030_4_ + j * l, Block.field_4044_bf.field_573_bc);
            }

        }

        p_4030_1_.field_808_h = false;
        return true;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        int i = 0;
        int j = 1;
        if(p_234_1_.func_444_a(p_234_2_ - 1, p_234_3_, p_234_4_) == field_573_bc || p_234_1_.func_444_a(p_234_2_ + 1, p_234_3_, p_234_4_) == field_573_bc)
        {
            i = 1;
            j = 0;
        }
        int k;
        for(k = p_234_3_; p_234_1_.func_444_a(p_234_2_, k - 1, p_234_4_) == field_573_bc; k--) { }
        if(p_234_1_.func_444_a(p_234_2_, k - 1, p_234_4_) != Block.field_602_aq.field_573_bc)
        {
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            return;
        }
        int l;
        for(l = 1; l < 4 && p_234_1_.func_444_a(p_234_2_, k + l, p_234_4_) == field_573_bc; l++) { }
        if(l != 3 || p_234_1_.func_444_a(p_234_2_, k + l, p_234_4_) != Block.field_602_aq.field_573_bc)
        {
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            return;
        }
        boolean flag = p_234_1_.func_444_a(p_234_2_ - 1, p_234_3_, p_234_4_) == field_573_bc || p_234_1_.func_444_a(p_234_2_ + 1, p_234_3_, p_234_4_) == field_573_bc;
        boolean flag1 = p_234_1_.func_444_a(p_234_2_, p_234_3_, p_234_4_ - 1) == field_573_bc || p_234_1_.func_444_a(p_234_2_, p_234_3_, p_234_4_ + 1) == field_573_bc;
        if(flag && flag1)
        {
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            return;
        }
        if((p_234_1_.func_444_a(p_234_2_ + i, p_234_3_, p_234_4_ + j) != Block.field_602_aq.field_573_bc || p_234_1_.func_444_a(p_234_2_ - i, p_234_3_, p_234_4_ - j) != field_573_bc) && (p_234_1_.func_444_a(p_234_2_ - i, p_234_3_, p_234_4_ - j) != Block.field_602_aq.field_573_bc || p_234_1_.func_444_a(p_234_2_ + i, p_234_3_, p_234_4_ + j) != field_573_bc))
        {
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            return;
        } else
        {
            return;
        }
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public void func_263_a(World p_263_1_, int p_263_2_, int p_263_3_, int p_263_4_, Entity p_263_5_)
    {
        if(p_263_5_.field_327_g == null && p_263_5_.field_328_f == null)
        {
            p_263_5_.func_4042_C();
        }
    }
}
