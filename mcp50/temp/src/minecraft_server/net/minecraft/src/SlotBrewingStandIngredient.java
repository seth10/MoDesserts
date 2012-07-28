// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, Item, ItemStack, ContainerBrewingStand, 
//            IInventory

class SlotBrewingStandIngredient extends Slot
{

    final ContainerBrewingStand field_40267_a; /* synthetic field */

    public SlotBrewingStandIngredient(ContainerBrewingStand p_i82_1_, IInventory p_i82_2_, int p_i82_3_, int p_i82_4_, int p_i82_5_)
    {
        field_40267_a = p_i82_1_;
        super(p_i82_2_, p_i82_3_, p_i82_4_, p_i82_5_);
    }

    public boolean func_20095_a(ItemStack p_20095_1_)
    {
        if(p_20095_1_ != null)
        {
            return Item.field_176_c[p_20095_1_.field_855_c].func_40220_m();
        } else
        {
            return false;
        }
    }

    public int func_20093_a()
    {
        return 64;
    }
}
