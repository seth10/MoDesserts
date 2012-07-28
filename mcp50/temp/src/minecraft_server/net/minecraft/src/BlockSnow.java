// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, AxisAlignedBB, 
//            IBlockAccess, BlockLeaves, Item, EntityItem, 
//            ItemStack, StatList, EntityPlayer, EnumSkyBlock

public class BlockSnow extends Block
{

    protected BlockSnow(int p_i238_1_, int p_i238_2_)
    {
        super(p_i238_1_, p_i238_2_, Material.field_508_s);
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        func_231_a(true);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        int i = p_248_1_.func_446_b(p_248_2_, p_248_3_, p_248_4_) & 7;
        if(i >= 3)
        {
            return AxisAlignedBB.func_693_b((double)p_248_2_ + field_567_bf, (double)p_248_3_ + field_565_bg, (double)p_248_4_ + field_563_bh, (double)p_248_2_ + field_561_bi, (float)p_248_3_ + 0.5F, (double)p_248_4_ + field_557_bk);
        } else
        {
            return null;
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

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        int i = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_) & 7;
        float f = (float)(2 * (1 + i)) / 16F;
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        int i = p_259_1_.func_444_a(p_259_2_, p_259_3_ - 1, p_259_4_);
        if(i == 0 || i != Block.field_581_L.field_573_bc && !Block.field_542_n[i].func_240_b())
        {
            return false;
        } else
        {
            return p_259_1_.func_443_c(p_259_2_, p_259_3_ - 1, p_259_4_).func_218_c();
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        func_275_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_);
    }

    private boolean func_275_g(World p_275_1_, int p_275_2_, int p_275_3_, int p_275_4_)
    {
        if(!func_259_a(p_275_1_, p_275_2_, p_275_3_, p_275_4_))
        {
            func_247_a_(p_275_1_, p_275_2_, p_275_3_, p_275_4_, p_275_1_.func_446_b(p_275_2_, p_275_3_, p_275_4_), 0);
            p_275_1_.func_508_d(p_275_2_, p_275_3_, p_275_4_, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public void func_12007_g(World p_12007_1_, EntityPlayer p_12007_2_, int p_12007_3_, int p_12007_4_, int p_12007_5_, int p_12007_6_)
    {
        int i = Item.field_251_aB.field_234_aS;
        float f = 0.7F;
        double d = (double)(p_12007_1_.field_803_m.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d1 = (double)(p_12007_1_.field_803_m.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d2 = (double)(p_12007_1_.field_803_m.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(p_12007_1_, (double)p_12007_3_ + d, (double)p_12007_4_ + d1, (double)p_12007_5_ + d2, new ItemStack(i, 1, 0));
        entityitem.field_433_ad = 10;
        p_12007_1_.func_526_a(entityitem);
        p_12007_1_.func_508_d(p_12007_3_, p_12007_4_, p_12007_5_, 0);
        p_12007_2_.func_25046_a(StatList.field_25094_y[field_573_bc], 1);
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_251_aB.field_234_aS;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_1_.func_512_a(EnumSkyBlock.Block, p_221_2_, p_221_3_, p_221_4_) > 11)
        {
            func_247_a_(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_), 0);
            p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, 0);
        }
    }
}
