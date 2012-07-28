// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, World, Block, BlockMycelium, 
//            WorldGenBigMushroom, WorldGenerator

public class BlockMushroom extends BlockFlower
{

    protected BlockMushroom(int p_i463_1_, int p_i463_2_)
    {
        super(p_i463_1_, p_i463_2_);
        float f = 0.2F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        func_231_a(true);
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_5_.nextInt(25) == 0)
        {
            byte byte0 = 4;
            int i = 5;
            for(int j = p_221_2_ - byte0; j <= p_221_2_ + byte0; j++)
            {
                for(int l = p_221_4_ - byte0; l <= p_221_4_ + byte0; l++)
                {
                    for(int j1 = p_221_3_ - 1; j1 <= p_221_3_ + 1; j1++)
                    {
                        if(p_221_1_.func_444_a(j, j1, l) == field_573_bc && --i <= 0)
                        {
                            return;
                        }
                    }

                }

            }

            int k = (p_221_2_ + p_221_5_.nextInt(3)) - 1;
            int i1 = (p_221_3_ + p_221_5_.nextInt(2)) - p_221_5_.nextInt(2);
            int k1 = (p_221_4_ + p_221_5_.nextInt(3)) - 1;
            for(int l1 = 0; l1 < 4; l1++)
            {
                if(p_221_1_.func_20111_e(k, i1, k1) && func_220_f(p_221_1_, k, i1, k1))
                {
                    p_221_2_ = k;
                    p_221_3_ = i1;
                    p_221_4_ = k1;
                }
                k = (p_221_2_ + p_221_5_.nextInt(3)) - 1;
                i1 = (p_221_3_ + p_221_5_.nextInt(2)) - p_221_5_.nextInt(2);
                k1 = (p_221_4_ + p_221_5_.nextInt(3)) - 1;
            }

            if(p_221_1_.func_20111_e(k, i1, k1) && func_220_f(p_221_1_, k, i1, k1))
            {
                p_221_1_.func_508_d(k, i1, k1, field_573_bc);
            }
        }
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return super.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_) && func_220_f(p_259_1_, p_259_2_, p_259_3_, p_259_4_);
    }

    protected boolean func_277_b(int p_277_1_)
    {
        return Block.field_540_p[p_277_1_];
    }

    public boolean func_220_f(World p_220_1_, int p_220_2_, int p_220_3_, int p_220_4_)
    {
        if(p_220_3_ < 0 || p_220_3_ >= 256)
        {
            return false;
        } else
        {
            int i = p_220_1_.func_444_a(p_220_2_, p_220_3_ - 1, p_220_4_);
            return i == Block.field_40164_bz.field_573_bc || p_220_1_.func_28098_j(p_220_2_, p_220_3_, p_220_4_) < 13 && func_277_b(i);
        }
    }

    public boolean func_35065_b(World p_35065_1_, int p_35065_2_, int p_35065_3_, int p_35065_4_, Random p_35065_5_)
    {
        int i = p_35065_1_.func_446_b(p_35065_2_, p_35065_3_, p_35065_4_);
        p_35065_1_.func_462_a(p_35065_2_, p_35065_3_, p_35065_4_, 0);
        WorldGenBigMushroom worldgenbigmushroom = null;
        if(field_573_bc == Block.field_4070_ag.field_573_bc)
        {
            worldgenbigmushroom = new WorldGenBigMushroom(0);
        } else
        if(field_573_bc == Block.field_4069_ah.field_573_bc)
        {
            worldgenbigmushroom = new WorldGenBigMushroom(1);
        }
        if(worldgenbigmushroom == null || !worldgenbigmushroom.func_419_a(p_35065_1_, p_35065_5_, p_35065_2_, p_35065_3_, p_35065_4_))
        {
            p_35065_1_.func_470_a(p_35065_2_, p_35065_3_, p_35065_4_, field_573_bc, i);
            return false;
        } else
        {
            return true;
        }
    }
}
