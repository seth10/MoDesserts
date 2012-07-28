// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, BlockLeaves, 
//            EntityPlayer

public class BlockLog extends Block
{

    protected BlockLog(int p_i514_1_)
    {
        super(p_i514_1_, Material.field_524_c);
        field_575_bb = 20;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 1;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_582_K.field_573_bc;
    }

    public void func_12007_g(World p_12007_1_, EntityPlayer p_12007_2_, int p_12007_3_, int p_12007_4_, int p_12007_5_, int p_12007_6_)
    {
        super.func_12007_g(p_12007_1_, p_12007_2_, p_12007_3_, p_12007_4_, p_12007_5_, p_12007_6_);
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        byte byte0 = 4;
        int i = byte0 + 1;
        if(p_242_1_.func_466_a(p_242_2_ - i, p_242_3_ - i, p_242_4_ - i, p_242_2_ + i, p_242_3_ + i, p_242_4_ + i))
        {
            for(int j = -byte0; j <= byte0; j++)
            {
                for(int k = -byte0; k <= byte0; k++)
                {
                    for(int l = -byte0; l <= byte0; l++)
                    {
                        int i1 = p_242_1_.func_444_a(p_242_2_ + j, p_242_3_ + k, p_242_4_ + l);
                        if(i1 != Block.field_581_L.field_573_bc)
                        {
                            continue;
                        }
                        int j1 = p_242_1_.func_446_b(p_242_2_ + j, p_242_3_ + k, p_242_4_ + l);
                        if((j1 & 8) == 0)
                        {
                            p_242_1_.func_463_c(p_242_2_ + j, p_242_3_ + k, p_242_4_ + l, j1 | 8);
                        }
                    }

                }

            }

        }
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 1)
        {
            return 21;
        }
        if(p_22009_1_ == 0)
        {
            return 21;
        }
        if(p_22009_2_ == 1)
        {
            return 116;
        }
        if(p_22009_2_ == 2)
        {
            return 117;
        }
        return p_22009_2_ != 3 ? 20 : 153;
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_;
    }
}
