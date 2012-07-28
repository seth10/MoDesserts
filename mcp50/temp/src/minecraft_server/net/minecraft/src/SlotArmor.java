// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ItemStack, ItemArmor, Item, 
//            Block, ContainerPlayer, IInventory

class SlotArmor extends Slot
{

    final int field_20102_a; /* synthetic field */
    final ContainerPlayer field_20101_b; /* synthetic field */

    SlotArmor(ContainerPlayer p_i374_1_, IInventory p_i374_2_, int p_i374_3_, int p_i374_4_, int p_i374_5_, int p_i374_6_)
    {
        field_20101_b = p_i374_1_;
        field_20102_a = p_i374_6_;
        super(p_i374_2_, p_i374_3_, p_i374_4_, p_i374_5_);
    }

    public int func_20093_a()
    {
        return 1;
    }

    public boolean func_20095_a(ItemStack p_20095_1_)
    {
        if(p_20095_1_.func_569_a() instanceof ItemArmor)
        {
            return ((ItemArmor)p_20095_1_.func_569_a()).field_257_aX == field_20102_a;
        }
        if(p_20095_1_.func_569_a().field_234_aS == Block.field_4052_bb.field_573_bc)
        {
            return field_20102_a == 0;
        } else
        {
            return false;
        }
    }
}
