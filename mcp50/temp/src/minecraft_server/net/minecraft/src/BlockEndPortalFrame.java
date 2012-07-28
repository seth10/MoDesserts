// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, EntityLiving, 
//            MathHelper, AxisAlignedBB

public class BlockEndPortalFrame extends Block
{

    public BlockEndPortalFrame(int p_i610_1_)
    {
        super(p_i610_1_, 159, Material.field_4216_o);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 1)
        {
            return field_575_bb - 1;
        }
        if(p_22009_1_ == 0)
        {
            return field_575_bb + 16;
        } else
        {
            return field_575_bb;
        }
    }

    public boolean func_240_b()
    {
        return false;
    }

    public int func_40161_b()
    {
        return 26;
    }

    public void func_40163_f()
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
    }

    public void func_264_a(World p_264_1_, int p_264_2_, int p_264_3_, int p_264_4_, AxisAlignedBB p_264_5_, ArrayList p_264_6_)
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        int i = p_264_1_.func_446_b(p_264_2_, p_264_3_, p_264_4_);
        if(func_40179_c(i))
        {
            func_229_a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
            super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        }
        func_40163_f();
    }

    public static boolean func_40179_c(int p_40179_0_)
    {
        return (p_40179_0_ & 4) != 0;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return 0;
    }

    public void func_4027_a(World p_4027_1_, int p_4027_2_, int p_4027_3_, int p_4027_4_, EntityLiving p_4027_5_)
    {
        int i = ((MathHelper.func_584_b((double)((p_4027_5_.field_316_r * 4F) / 360F) + 0.5D) & 3) + 2) % 4;
        p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, i);
    }
}
