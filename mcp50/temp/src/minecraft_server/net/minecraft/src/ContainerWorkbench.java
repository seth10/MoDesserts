// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, InventoryCrafting, InventoryCraftResult, SlotCrafting, 
//            InventoryPlayer, Slot, CraftingManager, IInventory, 
//            World, EntityPlayer, Block, ItemStack

public class ContainerWorkbench extends Container
{

    public InventoryCrafting field_20146_a;
    public IInventory field_20145_b;
    private World field_20150_c;
    private int field_20149_h;
    private int field_20148_i;
    private int field_20147_j;

    public ContainerWorkbench(InventoryPlayer p_i214_1_, World p_i214_2_, int p_i214_3_, int p_i214_4_, int p_i214_5_)
    {
        field_20146_a = new InventoryCrafting(this, 3, 3);
        field_20145_b = new InventoryCraftResult();
        field_20150_c = p_i214_2_;
        field_20149_h = p_i214_3_;
        field_20148_i = p_i214_4_;
        field_20147_j = p_i214_5_;
        func_20122_a(new SlotCrafting(p_i214_1_.field_497_f, field_20146_a, field_20145_b, 0, 124, 35));
        for(int i = 0; i < 3; i++)
        {
            for(int l = 0; l < 3; l++)
            {
                func_20122_a(new Slot(field_20146_a, l + i * 3, 30 + l * 18, 17 + i * 18));
            }

        }

        for(int j = 0; j < 3; j++)
        {
            for(int i1 = 0; i1 < 9; i1++)
            {
                func_20122_a(new Slot(p_i214_1_, i1 + j * 9 + 9, 8 + i1 * 18, 84 + j * 18));
            }

        }

        for(int k = 0; k < 9; k++)
        {
            func_20122_a(new Slot(p_i214_1_, k, 8 + k * 18, 142));
        }

        func_20121_a(field_20146_a);
    }

    public void func_20121_a(IInventory p_20121_1_)
    {
        field_20145_b.func_206_a(0, CraftingManager.func_20151_a().func_21147_a(field_20146_a));
    }

    public void func_20130_a(EntityPlayer p_20130_1_)
    {
        super.func_20130_a(p_20130_1_);
        if(field_20150_c.field_792_x)
        {
            return;
        }
        for(int i = 0; i < 9; i++)
        {
            ItemStack itemstack = field_20146_a.func_48315_b(i);
            if(itemstack != null)
            {
                p_20130_1_.func_48348_b(itemstack);
            }
        }

    }

    public boolean func_20126_b(EntityPlayer p_20126_1_)
    {
        if(field_20150_c.func_444_a(field_20149_h, field_20148_i, field_20147_j) != Block.field_9044_ay.field_573_bc)
        {
            return false;
        }
        return p_20126_1_.func_101_d((double)field_20149_h + 0.5D, (double)field_20148_i + 0.5D, (double)field_20147_j + 0.5D) <= 64D;
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
                if(!func_28126_a(itemstack1, 10, 46, true))
                {
                    return null;
                }
                slot.func_48417_a(itemstack1, itemstack);
            } else
            if(p_27086_1_ >= 10 && p_27086_1_ < 37)
            {
                if(!func_28126_a(itemstack1, 37, 46, false))
                {
                    return null;
                }
            } else
            if(p_27086_1_ >= 37 && p_27086_1_ < 46)
            {
                if(!func_28126_a(itemstack1, 10, 37, false))
                {
                    return null;
                }
            } else
            if(!func_28126_a(itemstack1, 10, 46, false))
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
