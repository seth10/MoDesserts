// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, World, WorldGenTaiga2, WorldGenForest, 
//            WorldGenHugeTrees, WorldGenTrees, WorldGenBigTree, WorldGenerator

public class BlockSapling extends BlockFlower
{

    protected BlockSapling(int p_i182_1_, int p_i182_2_)
    {
        super(p_i182_1_, p_i182_2_);
        float f = 0.4F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_1_.field_792_x)
        {
            return;
        }
        super.func_221_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_5_);
        if(p_221_1_.func_495_h(p_221_2_, p_221_3_ + 1, p_221_4_) >= 9 && p_221_5_.nextInt(7) == 0)
        {
            int i = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
            if((i & 8) == 0)
            {
                p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, i | 8);
            } else
            {
                func_21027_b(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_5_);
            }
        }
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        p_22009_2_ &= 3;
        if(p_22009_2_ == 1)
        {
            return 63;
        }
        if(p_22009_2_ == 2)
        {
            return 79;
        }
        if(p_22009_2_ == 3)
        {
            return 30;
        } else
        {
            return super.func_22009_a(p_22009_1_, p_22009_2_);
        }
    }

    public void func_21027_b(World p_21027_1_, int p_21027_2_, int p_21027_3_, int p_21027_4_, Random p_21027_5_)
    {
        int i = p_21027_1_.func_446_b(p_21027_2_, p_21027_3_, p_21027_4_) & 3;
        Object obj = null;
        int j = 0;
        int k = 0;
        boolean flag = false;
        if(i == 1)
        {
            obj = new WorldGenTaiga2(true);
        } else
        if(i == 2)
        {
            obj = new WorldGenForest(true);
        } else
        if(i == 3)
        {
            j = 0;
            do
            {
                if(j < -1)
                {
                    break;
                }
                k = 0;
                do
                {
                    if(k < -1)
                    {
                        break;
                    }
                    if(func_50010_f(p_21027_1_, p_21027_2_ + j, p_21027_3_, p_21027_4_ + k, 3) && func_50010_f(p_21027_1_, p_21027_2_ + j + 1, p_21027_3_, p_21027_4_ + k, 3) && func_50010_f(p_21027_1_, p_21027_2_ + j, p_21027_3_, p_21027_4_ + k + 1, 3) && func_50010_f(p_21027_1_, p_21027_2_ + j + 1, p_21027_3_, p_21027_4_ + k + 1, 3))
                    {
                        obj = new WorldGenHugeTrees(true, 10 + p_21027_5_.nextInt(20), 3, 3);
                        flag = true;
                        break;
                    }
                    k--;
                } while(true);
                if(obj != null)
                {
                    break;
                }
                j--;
            } while(true);
            if(obj == null)
            {
                j = k = 0;
                obj = new WorldGenTrees(true, 4 + p_21027_5_.nextInt(7), 3, 3, false);
            }
        } else
        {
            obj = new WorldGenTrees(true);
            if(p_21027_5_.nextInt(10) == 0)
            {
                obj = new WorldGenBigTree(true);
            }
        }
        if(flag)
        {
            p_21027_1_.func_462_a(p_21027_2_ + j, p_21027_3_, p_21027_4_ + k, 0);
            p_21027_1_.func_462_a(p_21027_2_ + j + 1, p_21027_3_, p_21027_4_ + k, 0);
            p_21027_1_.func_462_a(p_21027_2_ + j, p_21027_3_, p_21027_4_ + k + 1, 0);
            p_21027_1_.func_462_a(p_21027_2_ + j + 1, p_21027_3_, p_21027_4_ + k + 1, 0);
        } else
        {
            p_21027_1_.func_462_a(p_21027_2_, p_21027_3_, p_21027_4_, 0);
        }
        if(!((WorldGenerator) (obj)).func_419_a(p_21027_1_, p_21027_5_, p_21027_2_ + j, p_21027_3_, p_21027_4_ + k))
        {
            if(flag)
            {
                p_21027_1_.func_470_a(p_21027_2_ + j, p_21027_3_, p_21027_4_ + k, field_573_bc, i);
                p_21027_1_.func_470_a(p_21027_2_ + j + 1, p_21027_3_, p_21027_4_ + k, field_573_bc, i);
                p_21027_1_.func_470_a(p_21027_2_ + j, p_21027_3_, p_21027_4_ + k + 1, field_573_bc, i);
                p_21027_1_.func_470_a(p_21027_2_ + j + 1, p_21027_3_, p_21027_4_ + k + 1, field_573_bc, i);
            } else
            {
                p_21027_1_.func_470_a(p_21027_2_, p_21027_3_, p_21027_4_, field_573_bc, i);
            }
        }
    }

    public boolean func_50010_f(World p_50010_1_, int p_50010_2_, int p_50010_3_, int p_50010_4_, int p_50010_5_)
    {
        return p_50010_1_.func_444_a(p_50010_2_, p_50010_3_, p_50010_4_) == field_573_bc && (p_50010_1_.func_446_b(p_50010_2_, p_50010_3_, p_50010_4_) & 3) == p_50010_5_;
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_ & 3;
    }
}
