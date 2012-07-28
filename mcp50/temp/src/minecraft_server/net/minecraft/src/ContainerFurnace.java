// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, Slot, SlotFurnace, InventoryPlayer, 
//            TileEntityFurnace, ICrafting, ItemStack, FurnaceRecipes, 
//            Item, EntityPlayer

public class ContainerFurnace extends Container
{

    private TileEntityFurnace field_20139_a;
    private int field_20138_b;
    private int field_20141_c;
    private int field_20140_h;

    public ContainerFurnace(InventoryPlayer p_i39_1_, TileEntityFurnace p_i39_2_)
    {
        field_20138_b = 0;
        field_20141_c = 0;
        field_20140_h = 0;
        field_20139_a = p_i39_2_;
        func_20122_a(new Slot(p_i39_2_, 0, 56, 17));
        func_20122_a(new Slot(p_i39_2_, 1, 56, 53));
        func_20122_a(new SlotFurnace(p_i39_1_.field_497_f, p_i39_2_, 2, 116, 35));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                func_20122_a(new Slot(p_i39_1_, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            func_20122_a(new Slot(p_i39_1_, j, 8 + j * 18, 142));
        }

    }

    public void func_20128_a(ICrafting p_20128_1_)
    {
        super.func_20128_a(p_20128_1_);
        p_20128_1_.func_20056_a(this, 0, field_20139_a.field_486_h);
        p_20128_1_.func_20056_a(this, 1, field_20139_a.field_488_f);
        p_20128_1_.func_20056_a(this, 2, field_20139_a.field_487_g);
    }

    public void func_20125_a()
    {
        super.func_20125_a();
        for(int i = 0; i < field_20133_g.size(); i++)
        {
            ICrafting icrafting = (ICrafting)field_20133_g.get(i);
            if(field_20138_b != field_20139_a.field_486_h)
            {
                icrafting.func_20056_a(this, 0, field_20139_a.field_486_h);
            }
            if(field_20141_c != field_20139_a.field_488_f)
            {
                icrafting.func_20056_a(this, 1, field_20139_a.field_488_f);
            }
            if(field_20140_h != field_20139_a.field_487_g)
            {
                icrafting.func_20056_a(this, 2, field_20139_a.field_487_g);
            }
        }

        field_20138_b = field_20139_a.field_486_h;
        field_20141_c = field_20139_a.field_488_f;
        field_20140_h = field_20139_a.field_487_g;
    }

    public boolean func_20126_b(EntityPlayer p_20126_1_)
    {
        return field_20139_a.func_20067_a_(p_20126_1_);
    }

    public ItemStack func_27086_a(int p_27086_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20135_e.get(p_27086_1_);
        if(slot != null && slot.func_27006_b())
        {
            ItemStack itemstack1 = slot.func_20092_c();
            itemstack = itemstack1.func_578_d();
            if(p_27086_1_ == 2)
            {
                if(!func_28126_a(itemstack1, 3, 39, true))
                {
                    return null;
                }
                slot.func_48417_a(itemstack1, itemstack);
            } else
            if(p_27086_1_ == 1 || p_27086_1_ == 0)
            {
                if(!func_28126_a(itemstack1, 3, 39, false))
                {
                    return null;
                }
            } else
            if(FurnaceRecipes.func_21162_a().func_21161_a(itemstack1.func_569_a().field_234_aS) != null)
            {
                if(!func_28126_a(itemstack1, 0, 1, false))
                {
                    return null;
                }
            } else
            if(TileEntityFurnace.func_52006_b(itemstack1))
            {
                if(!func_28126_a(itemstack1, 1, 2, false))
                {
                    return null;
                }
            } else
            if(p_27086_1_ >= 3 && p_27086_1_ < 30)
            {
                if(!func_28126_a(itemstack1, 30, 39, false))
                {
                    return null;
                }
            } else
            if(p_27086_1_ >= 30 && p_27086_1_ < 39 && !func_28126_a(itemstack1, 3, 30, false))
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
