// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, IBlockAccess, TileEntity, 
//            Item, World, AxisAlignedBB

public class BlockSign extends BlockContainer
{

    private Class field_654_a;
    private boolean field_653_b;

    protected BlockSign(int p_i484_1_, Class p_i484_2_, boolean p_i484_3_)
    {
        super(p_i484_1_, Material.field_524_c);
        field_653_b = p_i484_3_;
        field_575_bb = 4;
        field_654_a = p_i484_2_;
        float f = 0.25F;
        float f1 = 1.0F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        if(field_653_b)
        {
            return;
        }
        int i = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_);
        float f = 0.28125F;
        float f1 = 0.78125F;
        float f2 = 0.0F;
        float f3 = 1.0F;
        float f4 = 0.125F;
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        if(i == 2)
        {
            func_229_a(f2, f, 1.0F - f4, f3, f1, 1.0F);
        }
        if(i == 3)
        {
            func_229_a(f2, f, 0.0F, f3, f1, f4);
        }
        if(i == 4)
        {
            func_229_a(1.0F - f4, f, f2, 1.0F, f1, f3);
        }
        if(i == 5)
        {
            func_229_a(0.0F, f, f2, f4, f1, f3);
        }
    }

    public int func_40161_b()
    {
        return -1;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int i)
    {
        return true;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public TileEntity func_294_a_()
    {
        try
        {
            return (TileEntity)field_654_a.newInstance();
        }
        catch(Exception exception)
        {
            throw new RuntimeException(exception);
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_4174_as.field_234_aS;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        boolean flag = false;
        if(field_653_b)
        {
            if(!p_234_1_.func_443_c(p_234_2_, p_234_3_ - 1, p_234_4_).func_216_a())
            {
                flag = true;
            }
        } else
        {
            int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
            flag = true;
            if(i == 2 && p_234_1_.func_443_c(p_234_2_, p_234_3_, p_234_4_ + 1).func_216_a())
            {
                flag = false;
            }
            if(i == 3 && p_234_1_.func_443_c(p_234_2_, p_234_3_, p_234_4_ - 1).func_216_a())
            {
                flag = false;
            }
            if(i == 4 && p_234_1_.func_443_c(p_234_2_ + 1, p_234_3_, p_234_4_).func_216_a())
            {
                flag = false;
            }
            if(i == 5 && p_234_1_.func_443_c(p_234_2_ - 1, p_234_3_, p_234_4_).func_216_a())
            {
                flag = false;
            }
        }
        if(flag)
        {
            func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_), 0);
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
        }
        super.func_234_b(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_5_);
    }
}
