// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ContainerEnchantment, IInventory, ItemStack

class SlotEnchantment extends Slot
{

    final ContainerEnchantment field_40268_a; /* synthetic field */

    SlotEnchantment(ContainerEnchantment p_i47_1_, IInventory p_i47_2_, int p_i47_3_, int p_i47_4_, int p_i47_5_)
    {
        field_40268_a = p_i47_1_;
        super(p_i47_2_, p_i47_3_, p_i47_4_, p_i47_5_);
    }

    public boolean func_20095_a(ItemStack p_20095_1_)
    {
        return true;
    }
}
