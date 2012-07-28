// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, World, IBlockAccess, Material, 
//            AxisAlignedBB

public class BlockPane extends Block
{

    private int field_35064_a;
    private final boolean field_40178_b;

    protected BlockPane(int p_i568_1_, int p_i568_2_, int p_i568_3_, Material p_i568_4_, boolean p_i568_5_)
    {
        super(p_i568_1_, p_i568_2_, p_i568_4_);
        field_35064_a = p_i568_3_;
        field_40178_b = p_i568_5_;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        if(!field_40178_b)
        {
            return 0;
        } else
        {
            return super.func_252_a(p_252_1_, p_252_2_, p_252_3_);
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

    public int func_40161_b()
    {
        return 18;
    }

    public void func_264_a(World p_264_1_, int p_264_2_, int p_264_3_, int p_264_4_, AxisAlignedBB p_264_5_, ArrayList p_264_6_)
    {
        boolean flag = func_35063_c(p_264_1_.func_444_a(p_264_2_, p_264_3_, p_264_4_ - 1));
        boolean flag1 = func_35063_c(p_264_1_.func_444_a(p_264_2_, p_264_3_, p_264_4_ + 1));
        boolean flag2 = func_35063_c(p_264_1_.func_444_a(p_264_2_ - 1, p_264_3_, p_264_4_));
        boolean flag3 = func_35063_c(p_264_1_.func_444_a(p_264_2_ + 1, p_264_3_, p_264_4_));
        if(flag2 && flag3 || !flag2 && !flag3 && !flag && !flag1)
        {
            func_229_a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        } else
        if(flag2 && !flag3)
        {
            func_229_a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        } else
        if(!flag2 && flag3)
        {
            func_229_a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        }
        if(flag && flag1 || !flag2 && !flag3 && !flag && !flag1)
        {
            func_229_a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        } else
        if(flag && !flag1)
        {
            func_229_a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        } else
        if(!flag && flag1)
        {
            func_229_a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        }
    }

    public void func_40163_f()
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        float f = 0.4375F;
        float f1 = 0.5625F;
        float f2 = 0.4375F;
        float f3 = 0.5625F;
        boolean flag = func_35063_c(p_233_1_.func_444_a(p_233_2_, p_233_3_, p_233_4_ - 1));
        boolean flag1 = func_35063_c(p_233_1_.func_444_a(p_233_2_, p_233_3_, p_233_4_ + 1));
        boolean flag2 = func_35063_c(p_233_1_.func_444_a(p_233_2_ - 1, p_233_3_, p_233_4_));
        boolean flag3 = func_35063_c(p_233_1_.func_444_a(p_233_2_ + 1, p_233_3_, p_233_4_));
        if(flag2 && flag3 || !flag2 && !flag3 && !flag && !flag1)
        {
            f = 0.0F;
            f1 = 1.0F;
        } else
        if(flag2 && !flag3)
        {
            f = 0.0F;
        } else
        if(!flag2 && flag3)
        {
            f1 = 1.0F;
        }
        if(flag && flag1 || !flag2 && !flag3 && !flag && !flag1)
        {
            f2 = 0.0F;
            f3 = 1.0F;
        } else
        if(flag && !flag1)
        {
            f2 = 0.0F;
        } else
        if(!flag && flag1)
        {
            f3 = 1.0F;
        }
        func_229_a(f, 0.0F, f2, f1, 1.0F, f3);
    }

    public final boolean func_35063_c(int p_35063_1_)
    {
        return Block.field_540_p[p_35063_1_] || p_35063_1_ == field_573_bc || p_35063_1_ == Block.field_4056_N.field_573_bc;
    }
}
