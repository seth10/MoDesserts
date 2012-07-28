// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, EntitySilverfish, 
//            ItemStack, EntityPlayer

public class BlockSilverfish extends Block
{

    public BlockSilverfish(int p_i395_1_)
    {
        super(p_i395_1_, 1, Material.field_505_v);
        func_237_c(0.0F);
    }

    public void func_12007_g(World p_12007_1_, EntityPlayer p_12007_2_, int p_12007_3_, int p_12007_4_, int p_12007_5_, int p_12007_6_)
    {
        super.func_12007_g(p_12007_1_, p_12007_2_, p_12007_3_, p_12007_4_, p_12007_5_, p_12007_6_);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_2_ == 1)
        {
            return Block.field_532_x.field_575_bb;
        }
        if(p_22009_2_ == 2)
        {
            return Block.field_35052_bn.field_575_bb;
        } else
        {
            return Block.field_535_u.field_575_bb;
        }
    }

    public void func_251_a(World p_251_1_, int p_251_2_, int p_251_3_, int p_251_4_, int p_251_5_)
    {
        if(!p_251_1_.field_792_x)
        {
            EntitySilverfish entitysilverfish = new EntitySilverfish(p_251_1_);
            entitysilverfish.func_107_c((double)p_251_2_ + 0.5D, p_251_3_, (double)p_251_4_ + 0.5D, 0.0F, 0.0F);
            p_251_1_.func_526_a(entitysilverfish);
            entitysilverfish.func_156_D();
        }
        super.func_251_a(p_251_1_, p_251_2_, p_251_3_, p_251_4_, p_251_5_);
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public static boolean func_35060_c(int p_35060_0_)
    {
        return p_35060_0_ == Block.field_535_u.field_573_bc || p_35060_0_ == Block.field_532_x.field_573_bc || p_35060_0_ == Block.field_35052_bn.field_573_bc;
    }

    public static int func_35061_d(int p_35061_0_)
    {
        if(p_35061_0_ == Block.field_532_x.field_573_bc)
        {
            return 1;
        }
        return p_35061_0_ != Block.field_35052_bn.field_573_bc ? 0 : 2;
    }

    protected ItemStack func_41001_e(int p_41001_1_)
    {
        Block block = Block.field_535_u;
        if(p_41001_1_ == 1)
        {
            block = Block.field_532_x;
        }
        if(p_41001_1_ == 2)
        {
            block = Block.field_35052_bn;
        }
        return new ItemStack(block);
    }
}
