// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, World, 
//            ItemStack, AxisAlignedBB

public class BlockStep extends Block
{

    public static final String field_35062_a[] = {
        "stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick"
    };
    private boolean field_20910_a;

    public BlockStep(int p_i608_1_, boolean p_i608_2_)
    {
        super(p_i608_1_, 6, Material.field_523_d);
        field_20910_a = p_i608_2_;
        if(!p_i608_2_)
        {
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        } else
        {
            field_540_p[p_i608_1_] = true;
        }
        func_258_c(255);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        if(field_20910_a)
        {
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        } else
        {
            boolean flag = (p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_) & 8) != 0;
            if(flag)
            {
                func_229_a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            } else
            {
                func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            }
        }
    }

    public void func_40163_f()
    {
        if(field_20910_a)
        {
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        } else
        {
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        }
    }

    public void func_264_a(World p_264_1_, int p_264_2_, int p_264_3_, int p_264_4_, AxisAlignedBB p_264_5_, ArrayList p_264_6_)
    {
        func_233_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        int i = p_22009_2_ & 7;
        if(i == 0)
        {
            return p_22009_1_ > 1 ? 5 : 6;
        }
        if(i == 1)
        {
            if(p_22009_1_ == 0)
            {
                return 208;
            }
            return p_22009_1_ != 1 ? 192 : 176;
        }
        if(i == 2)
        {
            return 4;
        }
        if(i == 3)
        {
            return 16;
        }
        if(i == 4)
        {
            return Block.field_9047_al.field_575_bb;
        }
        if(i == 5)
        {
            return Block.field_35052_bn.field_575_bb;
        } else
        {
            return 6;
        }
    }

    public int func_241_a(int p_241_1_)
    {
        return func_22009_a(p_241_1_, 0);
    }

    public boolean func_240_b()
    {
        return field_20910_a;
    }

    public void func_255_c(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, int p_255_5_)
    {
        if(p_255_5_ == 0 && !field_20910_a)
        {
            int i = p_255_1_.func_446_b(p_255_2_, p_255_3_, p_255_4_) & 7;
            p_255_1_.func_511_b(p_255_2_, p_255_3_, p_255_4_, i | 8);
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_607_al.field_573_bc;
    }

    public int func_244_a(Random p_244_1_)
    {
        return !field_20910_a ? 1 : 2;
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_ & 7;
    }

    public boolean func_28025_b()
    {
        return field_20910_a;
    }

    protected ItemStack func_41001_e(int p_41001_1_)
    {
        return new ItemStack(Block.field_607_al.field_573_bc, 1, p_41001_1_ & 7);
    }

}
