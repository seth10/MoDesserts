// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, World, Block, 
//            BlockFire, ItemStack

public class ItemFlintAndSteel extends Item
{

    public ItemFlintAndSteel(int p_i595_1_)
    {
        super(p_i595_1_);
        field_233_aT = 1;
        func_21090_d(64);
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(p_78_7_ == 0)
        {
            p_78_5_--;
        }
        if(p_78_7_ == 1)
        {
            p_78_5_++;
        }
        if(p_78_7_ == 2)
        {
            p_78_6_--;
        }
        if(p_78_7_ == 3)
        {
            p_78_6_++;
        }
        if(p_78_7_ == 4)
        {
            p_78_4_--;
        }
        if(p_78_7_ == 5)
        {
            p_78_4_++;
        }
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        }
        int i = p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_);
        if(i == 0)
        {
            p_78_3_.func_502_a((double)p_78_4_ + 0.5D, (double)p_78_5_ + 0.5D, (double)p_78_6_ + 0.5D, "fire.ignite", 1.0F, field_4154_b.nextFloat() * 0.4F + 0.8F);
            p_78_3_.func_508_d(p_78_4_, p_78_5_, p_78_6_, Block.field_599_as.field_573_bc);
        }
        p_78_1_.func_25125_a(1, p_78_2_);
        return true;
    }
}
