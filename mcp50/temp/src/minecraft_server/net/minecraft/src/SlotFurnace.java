// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ItemStack, EntityPlayer, Item, 
//            AchievementList, IInventory

public class SlotFurnace extends Slot
{

    private EntityPlayer field_27007_d;
    private int field_48419_f;

    public SlotFurnace(EntityPlayer p_i525_1_, IInventory p_i525_2_, int p_i525_3_, int p_i525_4_, int p_i525_5_)
    {
        super(p_i525_2_, p_i525_3_, p_i525_4_, p_i525_5_);
        field_27007_d = p_i525_1_;
    }

    public boolean func_20095_a(ItemStack p_20095_1_)
    {
        return false;
    }

    public ItemStack func_20088_a(int p_20088_1_)
    {
        if(func_27006_b())
        {
            field_48419_f += Math.min(p_20088_1_, func_20092_c().field_853_a);
        }
        return super.func_20088_a(p_20088_1_);
    }

    public void func_20091_b(ItemStack p_20091_1_)
    {
        func_48416_b(p_20091_1_);
        super.func_20091_b(p_20091_1_);
    }

    protected void func_48415_a(ItemStack p_48415_1_, int p_48415_2_)
    {
        field_48419_f += p_48415_2_;
        func_48416_b(p_48415_1_);
    }

    protected void func_48416_b(ItemStack p_48416_1_)
    {
        p_48416_1_.func_48584_a(field_27007_d.field_9093_l, field_27007_d, field_48419_f);
        field_48419_f = 0;
        if(p_48416_1_.field_855_c == Item.field_166_m.field_234_aS)
        {
            field_27007_d.func_25046_a(AchievementList.field_27108_k, 1);
        }
        if(p_48416_1_.field_855_c == Item.field_4192_aT.field_234_aS)
        {
            field_27007_d.func_25046_a(AchievementList.field_27103_p, 1);
        }
    }
}
