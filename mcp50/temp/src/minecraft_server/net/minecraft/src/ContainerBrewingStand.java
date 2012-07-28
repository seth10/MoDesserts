// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, SlotBrewingStandPotion, InventoryPlayer, SlotBrewingStandIngredient, 
//            Slot, TileEntityBrewingStand, ICrafting, ItemStack, 
//            EntityPlayer

public class ContainerBrewingStand extends Container
{

    private TileEntityBrewingStand field_40341_a;
    private int field_40340_b;

    public ContainerBrewingStand(InventoryPlayer p_i227_1_, TileEntityBrewingStand p_i227_2_)
    {
        field_40340_b = 0;
        field_40341_a = p_i227_2_;
        func_20122_a(new SlotBrewingStandPotion(this, p_i227_1_.field_497_f, p_i227_2_, 0, 56, 46));
        func_20122_a(new SlotBrewingStandPotion(this, p_i227_1_.field_497_f, p_i227_2_, 1, 79, 53));
        func_20122_a(new SlotBrewingStandPotion(this, p_i227_1_.field_497_f, p_i227_2_, 2, 102, 46));
        func_20122_a(new SlotBrewingStandIngredient(this, p_i227_2_, 3, 79, 17));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                func_20122_a(new Slot(p_i227_1_, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            func_20122_a(new Slot(p_i227_1_, j, 8 + j * 18, 142));
        }

    }

    public void func_20128_a(ICrafting p_20128_1_)
    {
        super.func_20128_a(p_20128_1_);
        p_20128_1_.func_20056_a(this, 0, field_40341_a.func_40077_h());
    }

    public void func_20125_a()
    {
        super.func_20125_a();
        for(int i = 0; i < field_20133_g.size(); i++)
        {
            ICrafting icrafting = (ICrafting)field_20133_g.get(i);
            if(field_40340_b != field_40341_a.func_40077_h())
            {
                icrafting.func_20056_a(this, 0, field_40341_a.func_40077_h());
            }
        }

        field_40340_b = field_40341_a.func_40077_h();
    }

    public boolean func_20126_b(EntityPlayer p_20126_1_)
    {
        return field_40341_a.func_20067_a_(p_20126_1_);
    }

    public ItemStack func_27086_a(int p_27086_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20135_e.get(p_27086_1_);
        if(slot != null && slot.func_27006_b())
        {
            ItemStack itemstack1 = slot.func_20092_c();
            itemstack = itemstack1.func_578_d();
            if(p_27086_1_ >= 0 && p_27086_1_ <= 2 || p_27086_1_ == 3)
            {
                if(!func_28126_a(itemstack1, 4, 40, true))
                {
                    return null;
                }
                slot.func_48417_a(itemstack1, itemstack);
            } else
            if(p_27086_1_ >= 4 && p_27086_1_ < 31)
            {
                if(!func_28126_a(itemstack1, 31, 40, false))
                {
                    return null;
                }
            } else
            if(p_27086_1_ >= 31 && p_27086_1_ < 40)
            {
                if(!func_28126_a(itemstack1, 4, 31, false))
                {
                    return null;
                }
            } else
            if(!func_28126_a(itemstack1, 4, 40, false))
            {
                return null;
            }
            if(itemstack1.field_853_a == 0)
            {
                slot.func_20089_b(null);
            } else
            {
                slot.func_20094_d();
            }
            if(itemstack1.field_853_a != itemstack.field_853_a)
            {
                slot.func_20091_b(itemstack1);
            } else
            {
                return null;
            }
        }
        return itemstack;
    }
}
