// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, AxisAlignedBB

public class BlockLadder extends Block
{

    protected BlockLadder(int p_i95_1_, int p_i95_2_)
    {
        super(p_i95_1_, p_i95_2_, Material.field_513_n);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        int i = p_248_1_.func_446_b(p_248_2_, p_248_3_, p_248_4_);
        float f = 0.125F;
        if(i == 2)
        {
            func_229_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        }
        if(i == 3)
        {
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        }
        if(i == 4)
        {
            func_229_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        if(i == 5)
        {
            func_229_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        }
        return super.func_248_d(p_248_1_, p_248_2_, p_248_3_, p_248_4_);
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
        return 8;
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        if(p_259_1_.func_445_d(p_259_2_ - 1, p_259_3_, p_259_4_))
        {
            return true;
        }
        if(p_259_1_.func_445_d(p_259_2_ + 1, p_259_3_, p_259_4_))
        {
            return true;
        }
        if(p_259_1_.func_445_d(p_259_2_, p_259_3_, p_259_4_ - 1))
        {
            return true;
        }
        return p_259_1_.func_445_d(p_259_2_, p_259_3_, p_259_4_ + 1);
    }

    public void func_255_c(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, int p_255_5_)
    {
        int i = p_255_1_.func_446_b(p_255_2_, p_255_3_, p_255_4_);
        if((i == 0 || p_255_5_ == 2) && p_255_1_.func_445_d(p_255_2_, p_255_3_, p_255_4_ + 1))
        {
            i = 2;
        }
        if((i == 0 || p_255_5_ == 3) && p_255_1_.func_445_d(p_255_2_, p_255_3_, p_255_4_ - 1))
        {
            i = 3;
        }
        if((i == 0 || p_255_5_ == 4) && p_255_1_.func_445_d(p_255_2_ + 1, p_255_3_, p_255_4_))
        {
            i = 4;
        }
        if((i == 0 || p_255_5_ == 5) && p_255_1_.func_445_d(p_255_2_ - 1, p_255_3_, p_255_4_))
        {
            i = 5;
        }
        p_255_1_.func_511_b(p_255_2_, p_255_3_, p_255_4_, i);
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
        boolean flag = false;
        if(i == 2 && p_234_1_.func_445_d(p_234_2_, p_234_3_, p_234_4_ + 1))
        {
            flag = true;
        }
        if(i == 3 && p_234_1_.func_445_d(p_234_2_, p_234_3_, p_234_4_ - 1))
        {
            flag = true;
        }
        if(i == 4 && p_234_1_.func_445_d(p_234_2_ + 1, p_234_3_, p_234_4_))
        {
            flag = true;
        }
        if(i == 5 && p_234_1_.func_445_d(p_234_2_ - 1, p_234_3_, p_234_4_))
        {
            flag = true;
        }
        if(!flag)
        {
            func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, i, 0);
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
        }
        super.func_234_b(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_5_);
    }

    public int func_244_a(Random p_244_1_)
    {
        return 1;
    }
}
