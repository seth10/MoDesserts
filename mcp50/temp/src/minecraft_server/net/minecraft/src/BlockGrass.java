// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World

public class BlockGrass extends Block
{

    protected BlockGrass(int p_i562_1_)
    {
        super(p_i562_1_, Material.field_28132_b);
        field_575_bb = 3;
        func_231_a(true);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 1)
        {
            return 0;
        }
        return p_22009_1_ != 0 ? 3 : 2;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_1_.field_792_x)
        {
            return;
        }
        if(p_221_1_.func_495_h(p_221_2_, p_221_3_ + 1, p_221_4_) < 4 && Block.field_538_r[p_221_1_.func_444_a(p_221_2_, p_221_3_ + 1, p_221_4_)] > 2)
        {
            p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, Block.field_533_w.field_573_bc);
        } else
        if(p_221_1_.func_495_h(p_221_2_, p_221_3_ + 1, p_221_4_) >= 9)
        {
            for(int i = 0; i < 4; i++)
            {
                int j = (p_221_2_ + p_221_5_.nextInt(3)) - 1;
                int k = (p_221_3_ + p_221_5_.nextInt(5)) - 3;
                int l = (p_221_4_ + p_221_5_.nextInt(3)) - 1;
                int i1 = p_221_1_.func_444_a(j, k + 1, l);
                if(p_221_1_.func_444_a(j, k, l) == Block.field_533_w.field_573_bc && p_221_1_.func_495_h(j, k + 1, l) >= 4 && Block.field_538_r[i1] <= 2)
                {
                    p_221_1_.func_508_d(j, k, l, Block.field_534_v.field_573_bc);
                }
            }

        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_533_w.func_252_a(0, p_252_2_, p_252_3_);
    }
}
