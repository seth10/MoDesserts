// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemFood, ItemStack, Item, World, 
//            EntityPlayer

public class ItemSoup extends ItemFood
{

    public ItemSoup(int p_i57_1_, int p_i57_2_)
    {
        super(p_i57_1_, p_i57_2_, false);
        func_21086_c(1);
    }

    public ItemStack func_35405_b(ItemStack p_35405_1_, World p_35405_2_, EntityPlayer p_35405_3_)
    {
        super.func_35405_b(p_35405_1_, p_35405_2_, p_35405_3_);
        return new ItemStack(Item.field_4173_C);
    }
}
