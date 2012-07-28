// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ItemStack, Item, ItemPotion, 
//            AchievementList, EntityPlayer, ContainerBrewingStand, IInventory

class SlotBrewingStandPotion extends Slot
{

    private EntityPlayer field_40269_f;
    final ContainerBrewingStand field_40270_a; /* synthetic field */

    public SlotBrewingStandPotion(ContainerBrewingStand p_i278_1_, EntityPlayer p_i278_2_, IInventory p_i278_3_, int p_i278_4_, int p_i278_5_, int p_i278_6_)
    {
        field_40270_a = p_i278_1_;
        super(p_i278_3_, p_i278_4_, p_i278_5_, p_i278_6_);
        field_40269_f = p_i278_2_;
    }

    public boolean func_20095_a(ItemStack p_20095_1_)
    {
        return p_20095_1_ != null && (p_20095_1_.field_855_c == Item.field_40238_bq.field_234_aS || p_20095_1_.field_855_c == Item.field_40232_br.field_234_aS);
    }

    public int func_20093_a()
    {
        return 1;
    }

    public void func_20091_b(ItemStack p_20091_1_)
    {
        if(p_20091_1_.field_855_c == Item.field_40238_bq.field_234_aS && p_20091_1_.func_21125_h() > 0)
        {
            field_40269_f.func_25046_a(AchievementList.field_40475_A, 1);
        }
        super.func_20091_b(p_20091_1_);
    }
}
