// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Container, SlotEnchantmentTable, SlotEnchantment, Slot, 
//            ICrafting, IInventory, ItemStack, World, 
//            Block, EnchantmentHelper, EntityPlayer, PlayerCapabilities, 
//            EnchantmentData, InventoryPlayer

public class ContainerEnchantment extends Container
{

    public IInventory field_40334_a;
    private World field_40338_h;
    private int field_40339_i;
    private int field_40336_j;
    private int field_40337_k;
    private Random field_40335_l;
    public long field_40332_b;
    public int field_40333_c[];

    public ContainerEnchantment(InventoryPlayer p_i210_1_, World p_i210_2_, int p_i210_3_, int p_i210_4_, int p_i210_5_)
    {
        field_40334_a = new SlotEnchantmentTable(this, "Enchant", 1);
        field_40335_l = new Random();
        field_40333_c = new int[3];
        field_40338_h = p_i210_2_;
        field_40339_i = p_i210_3_;
        field_40336_j = p_i210_4_;
        field_40337_k = p_i210_5_;
        func_20122_a(new SlotEnchantment(this, field_40334_a, 0, 25, 47));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                func_20122_a(new Slot(p_i210_1_, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            func_20122_a(new Slot(p_i210_1_, j, 8 + j * 18, 142));
        }

    }

    public void func_20128_a(ICrafting p_20128_1_)
    {
        super.func_20128_a(p_20128_1_);
        p_20128_1_.func_20056_a(this, 0, field_40333_c[0]);
        p_20128_1_.func_20056_a(this, 1, field_40333_c[1]);
        p_20128_1_.func_20056_a(this, 2, field_40333_c[2]);
    }

    public void func_20125_a()
    {
        super.func_20125_a();
        for(int i = 0; i < field_20133_g.size(); i++)
        {
            ICrafting icrafting = (ICrafting)field_20133_g.get(i);
            icrafting.func_20056_a(this, 0, field_40333_c[0]);
            icrafting.func_20056_a(this, 1, field_40333_c[1]);
            icrafting.func_20056_a(this, 2, field_40333_c[2]);
        }

    }

    public void func_20121_a(IInventory p_20121_1_)
    {
        if(p_20121_1_ == field_40334_a)
        {
            ItemStack itemstack = p_20121_1_.func_82_a(0);
            if(itemstack == null || !itemstack.func_40606_q())
            {
                for(int i = 0; i < 3; i++)
                {
                    field_40333_c[i] = 0;
                }

            } else
            {
                field_40332_b = field_40335_l.nextLong();
                if(!field_40338_h.field_792_x)
                {
                    int j = 0;
                    for(int k = -1; k <= 1; k++)
                    {
                        for(int i1 = -1; i1 <= 1; i1++)
                        {
                            if(k == 0 && i1 == 0 || !field_40338_h.func_20111_e(field_40339_i + i1, field_40336_j, field_40337_k + k) || !field_40338_h.func_20111_e(field_40339_i + i1, field_40336_j + 1, field_40337_k + k))
                            {
                                continue;
                            }
                            if(field_40338_h.func_444_a(field_40339_i + i1 * 2, field_40336_j, field_40337_k + k * 2) == Block.field_604_ao.field_573_bc)
                            {
                                j++;
                            }
                            if(field_40338_h.func_444_a(field_40339_i + i1 * 2, field_40336_j + 1, field_40337_k + k * 2) == Block.field_604_ao.field_573_bc)
                            {
                                j++;
                            }
                            if(i1 == 0 || k == 0)
                            {
                                continue;
                            }
                            if(field_40338_h.func_444_a(field_40339_i + i1 * 2, field_40336_j, field_40337_k + k) == Block.field_604_ao.field_573_bc)
                            {
                                j++;
                            }
                            if(field_40338_h.func_444_a(field_40339_i + i1 * 2, field_40336_j + 1, field_40337_k + k) == Block.field_604_ao.field_573_bc)
                            {
                                j++;
                            }
                            if(field_40338_h.func_444_a(field_40339_i + i1, field_40336_j, field_40337_k + k * 2) == Block.field_604_ao.field_573_bc)
                            {
                                j++;
                            }
                            if(field_40338_h.func_444_a(field_40339_i + i1, field_40336_j + 1, field_40337_k + k * 2) == Block.field_604_ao.field_573_bc)
                            {
                                j++;
                            }
                        }

                    }

                    for(int l = 0; l < 3; l++)
                    {
                        field_40333_c[l] = EnchantmentHelper.func_40642_a(field_40335_l, l, j, itemstack);
                    }

                    func_20125_a();
                }
            }
        }
    }

    public boolean func_40331_a(EntityPlayer p_40331_1_, int p_40331_2_)
    {
        ItemStack itemstack = field_40334_a.func_82_a(0);
        if(field_40333_c[p_40331_2_] > 0 && itemstack != null && (p_40331_1_.field_35211_M >= field_40333_c[p_40331_2_] || p_40331_1_.field_35214_K.field_35657_d))
        {
            if(!field_40338_h.field_792_x)
            {
                List list = EnchantmentHelper.func_40629_a(field_40335_l, itemstack, field_40333_c[p_40331_2_]);
                if(list != null)
                {
                    p_40331_1_.func_40108_b(field_40333_c[p_40331_2_]);
                    EnchantmentData enchantmentdata;
                    for(Iterator iterator = list.iterator(); iterator.hasNext(); itemstack.func_40605_a(enchantmentdata.field_40494_a, enchantmentdata.field_40493_b))
                    {
                        enchantmentdata = (EnchantmentData)iterator.next();
                    }

                    func_20121_a(field_40334_a);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void func_20130_a(EntityPlayer p_20130_1_)
    {
        super.func_20130_a(p_20130_1_);
        if(field_40338_h.field_792_x)
        {
            return;
        }
        ItemStack itemstack = field_40334_a.func_48315_b(0);
        if(itemstack != null)
        {
            p_20130_1_.func_48348_b(itemstack);
        }
    }

    public boolean func_20126_b(EntityPlayer p_20126_1_)
    {
        if(field_40338_h.func_444_a(field_40339_i, field_40336_j, field_40337_k) != Block.field_40175_bF.field_573_bc)
        {
            return false;
        }
        return p_20126_1_.func_101_d((double)field_40339_i + 0.5D, (double)field_40336_j + 0.5D, (double)field_40337_k + 0.5D) <= 64D;
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
                if(!func_28126_a(itemstack1, 1, 37, true))
                {
                    return null;
                }
            } else
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
