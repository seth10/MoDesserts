// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, Slot, TileEntityDispenser, ItemStack, 
//            IInventory, EntityPlayer

public class ContainerDispenser extends Container
{

    private TileEntityDispenser field_21133_a;

    public ContainerDispenser(IInventory p_i436_1_, TileEntityDispenser p_i436_2_)
    {
        field_21133_a = p_i436_2_;
        for(int i = 0; i < 3; i++)
        {
            for(int l = 0; l < 3; l++)
            {
                func_20122_a(new Slot(p_i436_2_, l + i * 3, 62 + l * 18, 17 + i * 18));
            }

        }

        for(int j = 0; j < 3; j++)
        {
            for(int i1 = 0; i1 < 9; i1++)
            {
                func_20122_a(new Slot(p_i436_1_, i1 + j * 9 + 9, 8 + i1 * 18, 84 + j * 18));
            }

        }

        for(int k = 0; k < 9; k++)
        {
            func_20122_a(new Slot(p_i436_1_, k, 8 + k * 18, 142));
        }

    }

    public boolean func_20126_b(EntityPlayer p_20126_1_)
    {
        return field_21133_a.func_20067_a_(p_20126_1_);
    }

    public ItemStack func_27086_a(int p_27086_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20135_e.get(p_27086_1_);
        if(slot != null && slot.func_27006_b())
        {
            ItemStack itemstack1 = slot.func_20092_c();
            itemstack = itemstack1.func_578_d();
            if(p_27086_1_ < 9)
            {
                if(!func_28126_a(itemstack1, 9, 45, true))
                {
                    return null;
                }
            } else
            if(!func_28126_a(itemstack1, 0, 9, false))
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
