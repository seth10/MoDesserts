// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, InventoryCrafting, InventoryCraftResult, SlotCrafting, 
//            InventoryPlayer, Slot, SlotArmor, CraftingManager, 
//            IInventory, EntityPlayer, ItemStack

public class ContainerPlayer extends Container
{

    public InventoryCrafting field_20143_a;
    public IInventory field_20142_b;
    public boolean field_20144_c;

    public ContainerPlayer(InventoryPlayer p_i2_1_)
    {
        this(p_i2_1_, true);
    }

    public ContainerPlayer(InventoryPlayer p_i3_1_, boolean p_i3_2_)
    {
        field_20143_a = new InventoryCrafting(this, 2, 2);
        field_20142_b = new InventoryCraftResult();
        field_20144_c = false;
        field_20144_c = p_i3_2_;
        func_20122_a(new SlotCrafting(p_i3_1_.field_497_f, field_20143_a, field_20142_b, 0, 144, 36));
        for(int i = 0; i < 2; i++)
        {
            for(int i1 = 0; i1 < 2; i1++)
            {
                func_20122_a(new Slot(field_20143_a, i1 + i * 2, 88 + i1 * 18, 26 + i * 18));
            }

        }

        for(int j = 0; j < 4; j++)
        {
            int j1 = j;
            func_20122_a(new SlotArmor(this, p_i3_1_, p_i3_1_.func_83_a() - 1 - j, 8, 8 + j * 18, j1));
        }

        for(int k = 0; k < 3; k++)
        {
            for(int k1 = 0; k1 < 9; k1++)
            {
                func_20122_a(new Slot(p_i3_1_, k1 + (k + 1) * 9, 8 + k1 * 18, 84 + k * 18));
            }

        }

        for(int l = 0; l < 9; l++)
        {
            func_20122_a(new Slot(p_i3_1_, l, 8 + l * 18, 142));
        }

        func_20121_a(field_20143_a);
    }

    public void func_20121_a(IInventory p_20121_1_)
    {
        field_20142_b.func_206_a(0, CraftingManager.func_20151_a().func_21147_a(field_20143_a));
    }

    public void func_20130_a(EntityPlayer p_20130_1_)
    {
        super.func_20130_a(p_20130_1_);
        for(int i = 0; i < 4; i++)
        {
            ItemStack itemstack = field_20143_a.func_48315_b(i);
            if(itemstack != null)
            {
                p_20130_1_.func_48348_b(itemstack);
            }
        }

        field_20142_b.func_206_a(0, null);
    }

    public boolean func_20126_b(EntityPlayer p_20126_1_)
    {
        return true;
    }

    public ItemStack func_27086_a(int p_27086_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20135_e.get(p_27086_1_);
        if(slot != null && slot.func_27006_b())
        {
            ItemStack itemstack1 = slot.func_20092_c();
            itemstack = itemstack1.func_578_d();
            if(p_27086_1_ == 0)
            {
                if(!func_28126_a(itemstack1, 9, 45, true))
                {
                    return null;
                }
                slot.func_48417_a(itemstack1, itemstack);
            } else
            if(p_27086_1_ >= 9 && p_27086_1_ < 36)
            {
                if(!func_28126_a(itemstack1, 36, 45, false))
                {
                    return null;
                }
            } else
            if(p_27086_1_ >= 36 && p_27086_1_ < 45)
            {
                if(!func_28126_a(itemstack1, 9, 36, false))
                {
                    return null;
                }
            } else
            if(!func_28126_a(itemstack1, 9, 45, false))
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
