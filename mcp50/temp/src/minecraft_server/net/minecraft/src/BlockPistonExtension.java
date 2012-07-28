// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, Facing, 
//            BlockPistonBase, IBlockAccess, AxisAlignedBB

public class BlockPistonExtension extends Block
{

    private int field_31046_a;

    public BlockPistonExtension(int p_i235_1_, int p_i235_2_)
    {
        super(p_i235_1_, p_i235_2_, Material.field_31062_B);
        field_31046_a = -1;
        func_4026_a(field_9025_h);
        func_237_c(0.5F);
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
        int i = p_242_1_.func_446_b(p_242_2_, p_242_3_, p_242_4_);
        int k = Facing.field_31052_a[func_31045_b(i)];
        p_242_2_ += Facing.field_31051_b[k];
        p_242_3_ += Facing.field_31054_c[k];
        p_242_4_ += Facing.field_31053_d[k];
        int l = p_242_1_.func_444_a(p_242_2_, p_242_3_, p_242_4_);
        if(l == Block.field_9029_Z.field_573_bc || l == Block.field_9033_V.field_573_bc)
        {
            int j = p_242_1_.func_446_b(p_242_2_, p_242_3_, p_242_4_);
            if(BlockPistonBase.func_31035_d(j))
            {
                Block.field_542_n[l].func_247_a_(p_242_1_, p_242_2_, p_242_3_, p_242_4_, j, 0);
                p_242_1_.func_508_d(p_242_2_, p_242_3_, p_242_4_, 0);
            }
        }
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        int i = func_31045_b(p_22009_2_);
        if(p_22009_1_ == i)
        {
            if(field_31046_a >= 0)
            {
                return field_31046_a;
            }
            if((p_22009_2_ & 8) != 0)
            {
                return field_575_bb - 1;
            } else
            {
                return field_575_bb;
            }
        }
        return p_22009_1_ != Facing.field_31052_a[i] ? 108 : 107;
    }

    public int func_40161_b()
    {
        return 17;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int i)
    {
        return false;
    }

    public boolean func_28026_e(World p_28026_1_, int p_28026_2_, int p_28026_3_, int i, int j)
    {
        return false;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public void func_264_a(World p_264_1_, int p_264_2_, int p_264_3_, int p_264_4_, AxisAlignedBB p_264_5_, ArrayList p_264_6_)
    {
        int i = p_264_1_.func_446_b(p_264_2_, p_264_3_, p_264_4_);
        switch(func_31045_b(i))
        {
        case 0: // '\0'
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            func_229_a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            break;

        case 1: // '\001'
            func_229_a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            func_229_a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            break;

        case 2: // '\002'
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            func_229_a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            break;

        case 3: // '\003'
            func_229_a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            func_229_a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            break;

        case 4: // '\004'
            func_229_a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            func_229_a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            break;

        case 5: // '\005'
            func_229_a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            func_229_a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
            break;
        }
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        int i = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_);
        switch(func_31045_b(i))
        {
        case 0: // '\0'
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
            break;

        case 1: // '\001'
            func_229_a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;

        case 2: // '\002'
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
            break;

        case 3: // '\003'
            func_229_a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            break;

        case 4: // '\004'
            func_229_a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
            break;

        case 5: // '\005'
            func_229_a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        int i = func_31045_b(p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_));
        int j = p_234_1_.func_444_a(p_234_2_ - Facing.field_31051_b[i], p_234_3_ - Facing.field_31054_c[i], p_234_4_ - Facing.field_31053_d[i]);
        if(j != Block.field_9029_Z.field_573_bc && j != Block.field_9033_V.field_573_bc)
        {
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
        } else
        {
            Block.field_542_n[j].func_234_b(p_234_1_, p_234_2_ - Facing.field_31051_b[i], p_234_3_ - Facing.field_31054_c[i], p_234_4_ - Facing.field_31053_d[i], p_234_5_);
        }
    }

    public static int func_31045_b(int p_31045_0_)
    {
        return p_31045_0_ & 7;
    }
}
