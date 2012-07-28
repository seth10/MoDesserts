// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, World, Block, EntityPlayer, 
//            ItemStack

public class ItemRedstone extends Item
{

    public ItemRedstone(int p_i204_1_)
    {
        super(p_i204_1_);
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_) != Block.field_625_aT.field_573_bc)
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
            if(!p_78_3_.func_20111_e(p_78_4_, p_78_5_, p_78_6_))
            {
                return false;
            }
        }
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        }
        if(Block.field_591_aw.func_259_a(p_78_3_, p_78_4_, p_78_5_, p_78_6_))
        {
            p_78_1_.field_853_a--;
            p_78_3_.func_508_d(p_78_4_, p_78_5_, p_78_6_, Block.field_591_aw.field_573_bc);
        }
        return true;
    }
}
