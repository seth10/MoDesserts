// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, ItemStack, World, EntityPlayer, 
//            EnumAction

public class ItemBucketMilk extends Item
{

    public ItemBucketMilk(int p_i494_1_)
    {
        super(p_i494_1_);
        func_21086_c(1);
    }

    public ItemStack func_35405_b(ItemStack p_35405_1_, World p_35405_2_, EntityPlayer p_35405_3_)
    {
        p_35405_1_.field_853_a--;
        if(!p_35405_2_.field_792_x)
        {
            p_35405_3_.func_40089_ar();
        }
        if(p_35405_1_.field_853_a <= 0)
        {
            return new ItemStack(Item.field_205_au);
        } else
        {
            return p_35405_1_;
        }
    }

    public int func_35404_c(ItemStack p_35404_1_)
    {
        return 32;
    }

    public EnumAction func_35406_b(ItemStack p_35406_1_)
    {
        return EnumAction.drink;
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        p_6152_3_.func_35201_a(p_6152_1_, func_35404_c(p_6152_1_));
        return p_6152_1_;
    }
}
