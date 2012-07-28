// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockGrass

public class WorldGenTrees extends WorldGenerator
{

    private final int field_48402_a;
    private final boolean field_48400_b;
    private final int field_48401_c;
    private final int field_48399_d;

    public WorldGenTrees(boolean p_i601_1_)
    {
        this(p_i601_1_, 4, 0, 0, false);
    }

    public WorldGenTrees(boolean p_i1002_1_, int p_i1002_2_, int p_i1002_3_, int p_i1002_4_, boolean p_i1002_5_)
    {
        super(p_i1002_1_);
        field_48402_a = p_i1002_2_;
        field_48401_c = p_i1002_3_;
        field_48399_d = p_i1002_4_;
        field_48400_b = p_i1002_5_;
    }

    public boolean func_419_a(World p_419_1_, Random p_419_2_, int p_419_3_, int p_419_4_, int p_419_5_)
    {
        int i = p_419_2_.nextInt(3) + field_48402_a;
        boolean flag = true;
        if(p_419_4_ < 1 || p_419_4_ + i + 1 > 256)
        {
            return false;
        }
        for(int j = p_419_4_; j <= p_419_4_ + 1 + i; j++)
        {
            byte byte0 = 1;
            if(j == p_419_4_)
            {
                byte0 = 0;
            }
            if(j >= (p_419_4_ + 1 + i) - 2)
            {
                byte0 = 2;
            }
            for(int l = p_419_3_ - byte0; l <= p_419_3_ + byte0 && flag; l++)
            {
                for(int j1 = p_419_5_ - byte0; j1 <= p_419_5_ + byte0 && flag; j1++)
                {
                    if(j >= 0 && j < 256)
                    {
                        int j2 = p_419_1_.func_444_a(l, j, j1);
                        if(j2 != 0 && j2 != Block.field_581_L.field_573_bc && j2 != Block.field_534_v.field_573_bc && j2 != Block.field_533_w.field_573_bc && j2 != Block.field_582_K.field_573_bc)
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
        func_50023_a(p_419_1_, p_419_3_, p_419_4_ - 1, p_419_5_, Block.field_533_w.field_573_bc);
        byte byte1 = 3;
        int i1 = 0;
        for(int k1 = (p_419_4_ - byte1) + i; k1 <= p_419_4_ + i; k1++)
        {
            int k2 = k1 - (p_419_4_ + i);
            int j3 = (i1 + 1) - k2 / 2;
            for(int l3 = p_419_3_ - j3; l3 <= p_419_3_ + j3; l3++)
            {
                int j4 = l3 - p_419_3_;
                for(int l4 = p_419_5_ - j3; l4 <= p_419_5_ + j3; l4++)
                {
                    int i5 = l4 - p_419_5_;
                    if((Math.abs(j4) != j3 || Math.abs(i5) != j3 || p_419_2_.nextInt(2) != 0 && k2 != 0) && !Block.field_540_p[p_419_1_.func_444_a(l3, k1, l4)])
                    {
                        func_41043_a(p_419_1_, l3, k1, l4, Block.field_581_L.field_573_bc, field_48399_d);
                    }
                }

            }

        }

        for(int l1 = 0; l1 < i; l1++)
        {
            int l2 = p_419_1_.func_444_a(p_419_3_, p_419_4_ + l1, p_419_5_);
            if(l2 != 0 && l2 != Block.field_581_L.field_573_bc)
            {
                continue;
            }
            func_41043_a(p_419_1_, p_419_3_, p_419_4_ + l1, p_419_5_, Block.field_582_K.field_573_bc, field_48401_c);
            if(!field_48400_b || l1 <= 0)
            {
                continue;
            }
            if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_ - 1, p_419_4_ + l1, p_419_5_))
            {
                func_41043_a(p_419_1_, p_419_3_ - 1, p_419_4_ + l1, p_419_5_, Block.field_35045_bv.field_573_bc, 8);
            }
            if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_ + 1, p_419_4_ + l1, p_419_5_))
            {
                func_41043_a(p_419_1_, p_419_3_ + 1, p_419_4_ + l1, p_419_5_, Block.field_35045_bv.field_573_bc, 2);
            }
            if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_, p_419_4_ + l1, p_419_5_ - 1))
            {
                func_41043_a(p_419_1_, p_419_3_, p_419_4_ + l1, p_419_5_ - 1, Block.field_35045_bv.field_573_bc, 1);
            }
            if(p_419_2_.nextInt(3) > 0 && p_419_1_.func_20111_e(p_419_3_, p_419_4_ + l1, p_419_5_ + 1))
            {
                func_41043_a(p_419_1_, p_419_3_, p_419_4_ + l1, p_419_5_ + 1, Block.field_35045_bv.field_573_bc, 4);
            }
        }

        if(field_48400_b)
        {
            for(int i2 = (p_419_4_ - 3) + i; i2 <= p_419_4_ + i; i2++)
            {
                int i3 = i2 - (p_419_4_ + i);
                int k3 = 2 - i3 / 2;
                for(int i4 = p_419_3_ - k3; i4 <= p_419_3_ + k3; i4++)
                {
                    for(int k4 = p_419_5_ - k3; k4 <= p_419_5_ + k3; k4++)
                    {
                        if(p_419_1_.func_444_a(i4, i2, k4) != Block.field_581_L.field_573_bc)
                        {
                            continue;
                        }
                        if(p_419_2_.nextInt(4) == 0 && p_419_1_.func_444_a(i4 - 1, i2, k4) == 0)
                        {
                            func_48398_a(p_419_1_, i4 - 1, i2, k4, 8);
                        }
                        if(p_419_2_.nextInt(4) == 0 && p_419_1_.func_444_a(i4 + 1, i2, k4) == 0)
                        {
                            func_48398_a(p_419_1_, i4 + 1, i2, k4, 2);
                        }
                        if(p_419_2_.nextInt(4) == 0 && p_419_1_.func_444_a(i4, i2, k4 - 1) == 0)
                        {
                            func_48398_a(p_419_1_, i4, i2, k4 - 1, 1);
                        }
                        if(p_419_2_.nextInt(4) == 0 && p_419_1_.func_444_a(i4, i2, k4 + 1) == 0)
                        {
                            func_48398_a(p_419_1_, i4, i2, k4 + 1, 4);
                        }
                    }

                }

            }

        }
        return true;
    }

    private void func_48398_a(World p_48398_1_, int p_48398_2_, int p_48398_3_, int p_48398_4_, int p_48398_5_)
    {
        func_41043_a(p_48398_1_, p_48398_2_, p_48398_3_, p_48398_4_, Block.field_35045_bv.field_573_bc, p_48398_5_);
        for(int i = 4; p_48398_1_.func_444_a(p_48398_2_, --p_48398_3_, p_48398_4_) == 0 && i > 0; i--)
        {
            func_41043_a(p_48398_1_, p_48398_2_, p_48398_3_, p_48398_4_, Block.field_35045_bv.field_573_bc, p_48398_5_);
        }

    }
}
