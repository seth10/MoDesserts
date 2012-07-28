// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, IInventory, Slot, ItemStack, 
//            EntityPlayer

public class ContainerChest extends Container
{

    private IInventory field_20137_a;
    private int field_27088_b;

    public ContainerChest(IInventory p_i59_1_, IInventory p_i59_2_)
    {
        field_20137_a = p_i59_2_;
        field_27088_b = p_i59_2_.func_83_a() / 9;
        p_i59_2_.func_35161_e();
        int i = (field_27088_b - 4) * 18;
        for(int j = 0; j < field_27088_b; j++)
        {
            for(int i1 = 0; i1 < 9; i1++)
            {
                func_20122_a(new Slot(p_i59_2_, i1 + j * 9, 8 + i1 * 18, 18 + j * 18));
            }

        }

        for(int k = 0; k < 3; k++)
        {
            for(int j1 = 0; j1 < 9; j1++)
            {
                func_20122_a(new Slot(p_i59_1_, j1 + k * 9 + 9, 8 + j1 * 18, 103 + k * 18 + i));
            }

        }

        for(int l = 0; l < 9; l++)
        {
            func_20122_a(new Slot(p_i59_1_, l, 8 + l * 18, 161 + i));
        }

    }

    public boolean func_20126_b(EntityPlayer p_20126_1_)
    {
        return field_20137_a.func_20067_a_(p_20126_1_);
    }

    public ItemStack func_27086_a(int p_27086_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20135_e.get(p_27086_1_);
        if(slot != null && slot.func_27006_b())
        {
            ItemStack itemstack1 = slot.func_20092_c();
            itemstack = itemstack1.func_578_d();
            if(p_27086_1_ < field_27088_b * 9)
            {
                if(!func_28126_a(itemstack1, field_27088_b * 9, field_20135_e.size(), true))
                {
                    return null;
                }
            } else
            if(!func_28126_a(itemstack1, 0, field_27088_b * 9, false))
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
        }
        return itemstack;
    }

    public void func_20130_a(EntityPlayer p_20130_1_)
    {
        super.func_20130_a(p_20130_1_);
        field_20137_a.func_35162_t_();
    }
}
