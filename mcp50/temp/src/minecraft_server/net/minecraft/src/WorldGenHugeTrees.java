// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockGrass, MathHelper

public class WorldGenHugeTrees extends WorldGenerator
{

    private final int field_48406_a;
    private final int field_48404_b;
    private final int field_48405_c;

    public WorldGenHugeTrees(boolean p_i1083_1_, int p_i1083_2_, int p_i1083_3_, int p_i1083_4_)
    {
        super(p_i1083_1_);
        field_48406_a = p_i1083_2_;
        field_48404_b = p_i1083_3_;
        field_48405_c = p_i1083_4_;
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        int i = p_419_2_.nextInt(3) + field_48406_a;
        boolean flag = true;
        if(p_419_4_ < 1 || p_419_4_ + i + 1 > 256)
        {
            return false;
        }
        for(int j = p_419_4_; j <= p_419_4_ + 1 + i; j++)
        {
            byte byte0 = 2;
            if(j == p_419_4_)
            {
                byte0 = 1;
            }
            if(j >= (p_419_4_ + 1 + i) - 2)
            {
                byte0 = 2;
            }
            for(int i1 = p_419_3_ - byte0; i1 <= p_419_3_ + byte0 && flag; i1++)
            {
                for(int k1 = p_419_5_ - byte0; k1 <= p_419_5_ + byte0 && flag; k1++)
                {
                    if(j >= 0 && j < 256)
                    {
                        int k2 = p_419_1_.func_444_a(i1, j, k1);
                        if(k2 != 0 && k2 != Block.field_581_L.field_573_bc && k2 != Block.field_534_v.field_573_bc && k2 != Block.field_533_w.field_573_bc && k2 != Block.field_582_K.field_573_bc && k2 != Block.field_6047_y.field_573_bc)
                        {
                            flag = false;
                        }
                    } else
                    {
                        flag = false;
                    }
                }

            }

        }

        if(!flag)
        {
            return false;
        }
        int k = p_419_1_.func_444_a(p_419_3_, p_419_4_ - 1, p_419_5_);
        if(k != Block.field_534_v.field_573_bc && k != Block.field_533_w.field_573_bc || p_419_4_ >= 256 - i - 1)
        {
            return false;
        }
        p_419_1_.func_462_a(p_419_3_, p_419_4_ - 1, p_419_5_, Block.field_533_w.field_573_bc);
        p_419_1_.func_462_a(p_419_3_ + 1, p_419_4_ - 1, p_419_5_, Block.field_533_w.field_573_bc);
        p_419_1_.func_462_a(p_419_3_, p_419_4_ - 1, p_419_5_ + 1, Block.field_533_w.field_573_bc);
        p_419_1_.func_462_a(p_419_3_ + 1, p_419_4_ - 1, p_419_5_ + 1, Block.field_533_w.field_573_bc);
        func_48403_a(p_419_1_, p_419_3_, p_419_5_, p_419_4_ + i, 2, p_419_2_);
        for(int l = (p_419_4_ + i) - 2 - p_419_2_.nextInt(4); l > p_419_4_ + i / 2; l -= 2 + p_419_2_.nextInt(4))
        {
            float f = p_419_2_.nextFloat() * 3.141593F * 2.0F;
            int l1 = p_419_3_ + (int)(0.5F + MathHelper.func_582_b(f) * 4F);
            int l2 = p_419_5_ + (int)(0.5F + MathHelper.func_585_a(f) * 4F);
            func_48403_a(p_419_1_, l1, l2, l, 0, p_419_2_);
            for(int j3 = 0; j3 < 5; j3++)
            {
                int i2 = p_419_3_ + (int)(1.5F + MathHelper.func_582_b(f) * (float)j3);
                int i3 = p_419_5_ + (int)(1.5F + MathHelper.func_585_a(f) * (float)j3);
                func_41043_a(p_419_1_, i2, (l - 3) + j3 / 2, i3, Block.field_582_K.field_573_bc, field_48404_b);
            }

        }

        for(int j1 = 0; j1 < i; j1++)
        {
            int j2 = p_419_1_.func_444_a(p_419_3_, p_419_4_ + j1, p_419_5_);
            if(j2 == 0 || j2 == Block.field_581_L.field_573_bc)
            {
                func_41043_a(p_419_1_, p_419_3_, p_419_4_ + j1, p_419_5_, Block.field_582_K.field_573_bc, field_48404_b);
                if(j1 > 0)
                {
                    if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_ - 1, p_419_4_ + j1, p_419_5_))
                    {
                        func_41043_a(p_419_1_, p_419_3_ - 1, p_419_4_ + j1, p_419_5_, Block.field_35045_bv.field_573_bc, 8);
                    }
                    if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_, p_419_4_ + j1, p_419_5_ - 1))
                    {
                        func_41043_a(p_419_1_, p_419_3_, p_419_4_ + j1, p_419_5_ - 1, Block.field_35045_bv.field_573_bc, 1);
                    }
                }
            }
            if(j1 >= i - 1)
            {
                continue;
            }
            j2 = p_419_1_.func_444_a(p_419_3_ + 1, p_419_4_ + j1, p_419_5_);
            if(j2 == 0 || j2 == Block.field_581_L.field_573_bc)
            {
                func_41043_a(p_419_1_, p_419_3_ + 1, p_419_4_ + j1, p_419_5_, Block.field_582_K.field_573_bc, field_48404_b);
                if(j1 > 0)
                {
                    if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_ + 2, p_419_4_ + j1, p_419_5_))
                    {
                        func_41043_a(p_419_1_, p_419_3_ + 2, p_419_4_ + j1, p_419_5_, Block.field_35045_bv.field_573_bc, 2);
                    }
                    if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_ + 1, p_419_4_ + j1, p_419_5_ - 1))
                    {
                        func_41043_a(p_419_1_, p_419_3_ + 1, p_419_4_ + j1, p_419_5_ - 1, Block.field_35045_bv.field_573_bc, 1);
                    }
                }
            }
            j2 = p_419_1_.func_444_a(p_419_3_ + 1, p_419_4_ + j1, p_419_5_ + 1);
            if(j2 == 0 || j2 == Block.field_581_L.field_573_bc)
            {
                func_41043_a(p_419_1_, p_419_3_ + 1, p_419_4_ + j1, p_419_5_ + 1, Block.field_582_K.field_573_bc, field_48404_b);
                if(j1 > 0)
                {
                    if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_ + 2, p_419_4_ + j1, p_419_5_ + 1))
                    {
                        func_41043_a(p_419_1_, p_419_3_ + 2, p_419_4_ + j1, p_419_5_ + 1, Block.field_35045_bv.field_573_bc, 2);
                    }
                    if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_ + 1, p_419_4_ + j1, p_419_5_ + 2))
                    {
                        func_41043_a(p_419_1_, p_419_3_ + 1, p_419_4_ + j1, p_419_5_ + 2, Block.field_35045_bv.field_573_bc, 4);
                    }
                }
            }
            j2 = p_419_1_.func_444_a(p_419_3_, p_419_4_ + j1, p_419_5_ + 1);
            if(j2 != 0 && j2 != Block.field_581_L.field_573_bc)
            {
                continue;
            }
            func_41043_a(p_419_1_, p_419_3_, p_419_4_ + j1, p_419_5_ + 1, Block.field_582_K.field_573_bc, field_48404_b);
            if(j1 <= 0)
            {
                continue;
            }
            if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_ - 1, p_419_4_ + j1, p_419_5_ + 1))
            {
                func_41043_a(p_419_1_, p_419_3_ - 1, p_419_4_ + j1, p_419_5_ + 1, Block.field_35045_bv.field_573_bc, 8);
            }
            if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_, p_419_4_ + j1, p_419_5_ + 2))
            {
                func_41043_a(p_419_1_, p_419_3_, p_419_4_ + j1, p_419_5_ + 2, Block.field_35045_bv.field_573_bc, 4);
            }
        }

        return true;
    }

    private void func_48403_a(World p_48403_1_, int p_48403_2_, int p_48403_3_, int p_48403_4_, int p_48403_5_, Random p_48403_6_)
    {
        byte byte0 = 2;
        for(int i = p_48403_4_ - byte0; i <= p_48403_4_; i++)
        {
            int j = i - p_48403_4_;
            int k = (p_48403_5_ + 1) - j;
            for(int l = p_48403_2_ - k; l <= p_48403_2_ + k + 1; l++)
            {
                int i1 = l - p_48403_2_;
                for(int j1 = p_48403_3_ - k; j1 <= p_48403_3_ + k + 1; j1++)
                {
                    int k1 = j1 - p_48403_3_;
                    if((i1 >= 0 || k1 >= 0 || i1 * i1 + k1 * k1 <= k * k) && (i1 <= 0 && k1 <= 0 || i1 * i1 + k1 * k1 <= (k + 1) * (k + 1)) && (p_48403_6_.nextInt(4) != 0 || i1 * i1 + k1 * k1 <= (k - 1) * (k - 1)) && !Block.field_540_p[p_48403_1_.func_444_a(l, i, j1)])
                    {
                        func_41043_a(p_48403_1_, l, i, j1, Block.field_581_L.field_573_bc, field_48405_c);
                    }
                }

            }

        }

    }
}
