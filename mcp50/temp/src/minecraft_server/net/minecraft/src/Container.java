// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Slot, ICrafting, ItemStack, EntityPlayer, 
//            InventoryPlayer, IInventory

public abstract class Container
{

    public List field_20136_d;
    public List field_20135_e;
    public int field_20134_f;
    private short field_20132_a;
    protected List field_20133_g;
    private Set field_20131_b;

    public Container()
    {
        field_20136_d = new ArrayList();
        field_20135_e = new ArrayList();
        field_20134_f = 0;
        field_20132_a = 0;
        field_20133_g = new ArrayList();
        field_20131_b = new HashSet();
    }

    protected void func_20122_a(Slot p_20122_1_)
    {
        p_20122_1_.field_20100_c = field_20135_e.size();
        field_20135_e.add(p_20122_1_);
        field_20136_d.add(null);
    }

    public void func_20128_a(ICrafting p_20128_1_)
    {
        if(field_20133_g.contains(p_20128_1_))
        {
            throw new IllegalArgumentException("Listener already listening");
        } else
        {
            field_20133_g.add(p_20128_1_);
            p_20128_1_.func_20054_a(this, func_28127_b());
            func_20125_a();
            return;
        }
    }

    public List func_28127_b()
    {
        ArrayList arraylist = new ArrayList();
        for(int i = 0; i < field_20135_e.size(); i++)
        {
            arraylist.add(((Slot)field_20135_e.get(i)).func_20092_c());
        }

        return arraylist;
    }

    public void func_20125_a()
    {
        for(int i = 0; i < field_20135_e.size(); i++)
        {
            ItemStack itemstack = ((Slot)field_20135_e.get(i)).func_20092_c();
            ItemStack itemstack1 = (ItemStack)field_20136_d.get(i);
            if(ItemStack.func_20119_a(itemstack1, itemstack))
            {
                continue;
            }
            itemstack1 = itemstack != null ? itemstack.func_578_d() : null;
            field_20136_d.set(i, itemstack1);
            for(int j = 0; j < field_20133_g.size(); j++)
            {
                ((ICrafting)field_20133_g.get(j)).func_20055_a(this, i, itemstack1);
            }

        }

    }

    public boolean func_40331_a(EntityPlayer p_40331_1_, int p_40331_2_)
    {
        return false;
    }

    public Slot func_20127_a(IInventory p_20127_1_, int p_20127_2_)
    {
        for(int i = 0; i < field_20135_e.size(); i++)
        {
            Slot slot = (Slot)field_20135_e.get(i);
            if(slot.func_20090_a(p_20127_1_, p_20127_2_))
            {
                return slot;
            }
        }

        return null;
    }

    public Slot func_20120_a(int p_20120_1_)
    {
        return (Slot)field_20135_e.get(p_20120_1_);
    }

    public ItemStack func_27086_a(int p_27086_1_)
    {
        Slot slot = (Slot)field_20135_e.get(p_27086_1_);
        if(slot != null)
        {
            return slot.func_20092_c();
        } else
        {
            return null;
        }
    }

    public ItemStack func_27085_a(int p_27085_1_, int p_27085_2_, boolean p_27085_3_, EntityPlayer p_27085_4_)
    {
        ItemStack itemstack = null;
        if(p_27085_2_ > 1)
        {
            return null;
        }
        if(p_27085_2_ == 0 || p_27085_2_ == 1)
        {
            InventoryPlayer inventoryplayer = p_27085_4_.field_416_aj;
            if(p_27085_1_ == -999)
            {
                if(inventoryplayer.func_20072_i() != null && p_27085_1_ == -999)
                {
                    if(p_27085_2_ == 0)
                    {
                        p_27085_4_.func_48348_b(inventoryplayer.func_20072_i());
                        inventoryplayer.func_20073_b(null);
                    }
                    if(p_27085_2_ == 1)
                    {
                        p_27085_4_.func_48348_b(inventoryplayer.func_20072_i().func_20118_a(1));
                        if(inventoryplayer.func_20072_i().field_853_a == 0)
                        {
                            inventoryplayer.func_20073_b(null);
                        }
                    }
                }
            } else
            if(p_27085_3_)
            {
                ItemStack itemstack1 = func_27086_a(p_27085_1_);
                if(itemstack1 != null)
                {
                    int i = itemstack1.field_855_c;
                    itemstack = itemstack1.func_578_d();
                    Slot slot1 = (Slot)field_20135_e.get(p_27085_1_);
                    if(slot1 != null && slot1.func_20092_c() != null && slot1.func_20092_c().field_855_c == i)
                    {
                        func_35497_b(p_27085_1_, p_27085_2_, p_27085_3_, p_27085_4_);
                    }
                }
            } else
            {
                if(p_27085_1_ < 0)
                {
                    return null;
                }
                Slot slot = (Slot)field_20135_e.get(p_27085_1_);
                if(slot != null)
                {
                    slot.func_20094_d();
                    ItemStack itemstack2 = slot.func_20092_c();
                    ItemStack itemstack4 = inventoryplayer.func_20072_i();
                    if(itemstack2 != null)
                    {
                        itemstack = itemstack2.func_578_d();
                    }
                    if(itemstack2 == null)
                    {
                        if(itemstack4 != null && slot.func_20095_a(itemstack4))
                        {
                            int j = p_27085_2_ != 0 ? 1 : itemstack4.field_853_a;
                            if(j > slot.func_20093_a())
                            {
                                j = slot.func_20093_a();
                            }
                            slot.func_20089_b(itemstack4.func_20118_a(j));
                            if(itemstack4.field_853_a == 0)
                            {
                                inventoryplayer.func_20073_b(null);
                            }
                        }
                    } else
                    if(itemstack4 == null)
                    {
                        int k = p_27085_2_ != 0 ? (itemstack2.field_853_a + 1) / 2 : itemstack2.field_853_a;
                        ItemStack itemstack6 = slot.func_20088_a(k);
                        inventoryplayer.func_20073_b(itemstack6);
                        if(itemstack2.field_853_a == 0)
                        {
                            slot.func_20089_b(null);
                        }
                        slot.func_20091_b(inventoryplayer.func_20072_i());
                    } else
                    if(slot.func_20095_a(itemstack4))
                    {
                        if(itemstack2.field_855_c != itemstack4.field_855_c || itemstack2.func_21128_e() && itemstack2.func_21125_h() != itemstack4.func_21125_h() || !ItemStack.func_46124_a(itemstack2, itemstack4))
                        {
                            if(itemstack4.field_853_a <= slot.func_20093_a())
                            {
                                ItemStack itemstack5 = itemstack2;
                                slot.func_20089_b(itemstack4);
                                inventoryplayer.func_20073_b(itemstack5);
                            }
                        } else
                        {
                            int l = p_27085_2_ != 0 ? 1 : itemstack4.field_853_a;
                            if(l > slot.func_20093_a() - itemstack2.field_853_a)
                            {
                                l = slot.func_20093_a() - itemstack2.field_853_a;
                            }
                            if(l > itemstack4.func_576_b() - itemstack2.field_853_a)
                            {
                                l = itemstack4.func_576_b() - itemstack2.field_853_a;
                            }
                            itemstack4.func_20118_a(l);
                            if(itemstack4.field_853_a == 0)
                            {
                                inventoryplayer.func_20073_b(null);
                            }
                            itemstack2.field_853_a += l;
                        }
                    } else
                    if(itemstack2.field_855_c == itemstack4.field_855_c && itemstack4.func_576_b() > 1 && (!itemstack2.func_21128_e() || itemstack2.func_21125_h() == itemstack4.func_21125_h()) && ItemStack.func_46124_a(itemstack2, itemstack4))
                    {
                        int i1 = itemstack2.field_853_a;
                        if(i1 > 0 && i1 + itemstack4.field_853_a <= itemstack4.func_576_b())
                        {
                            itemstack4.field_853_a += i1;
                            ItemStack itemstack3 = slot.func_20088_a(i1);
                            if(itemstack3.field_853_a == 0)
                            {
                                slot.func_20089_b(null);
                            }
                            slot.func_20091_b(inventoryplayer.func_20072_i());
                        }
                    }
                }
            }
        }
        return itemstack;
    }

    protected void func_35497_b(int p_35497_1_, int p_35497_2_, boolean p_35497_3_, EntityPlayer p_35497_4_)
    {
        func_27085_a(p_35497_1_, p_35497_2_, p_35497_3_, p_35497_4_);
    }

    public void func_20130_a(EntityPlayer p_20130_1_)
    {
        InventoryPlayer inventoryplayer = p_20130_1_.field_416_aj;
        if(inventoryplayer.func_20072_i() != null)
        {
            p_20130_1_.func_48348_b(inventoryplayer.func_20072_i());
            inventoryplayer.func_20073_b(null);
        }
    }

    public void func_20121_a(IInventory p_20121_1_)
    {
        func_20125_a();
    }

    public void func_35498_a(int p_35498_1_, ItemStack p_35498_2_)
    {
        func_20120_a(p_35498_1_).func_20089_b(p_35498_2_);
    }

    public boolean func_20124_c(EntityPlayer p_20124_1_)
    {
        return !field_20131_b.contains(p_20124_1_);
    }

    public void func_20129_a(EntityPlayer p_20129_1_, boolean p_20129_2_)
    {
        if(p_20129_2_)
        {
            field_20131_b.remove(p_20129_1_);
        } else
        {
            field_20131_b.add(p_20129_1_);
        }
    }

    public abstract boolean func_20126_b(EntityPlayer entityplayer);

    protected boolean func_28126_a(ItemStack p_28126_1_, int p_28126_2_, int p_28126_3_, boolean p_28126_4_)
    {
        boolean flag = false;
        int i = p_28126_2_;
        if(p_28126_4_)
        {
            i = p_28126_3_ - 1;
        }
        if(p_28126_1_.func_21132_c())
        {
            while(p_28126_1_.field_853_a > 0 && (!p_28126_4_ && i < p_28126_3_ || p_28126_4_ && i >= p_28126_2_)) 
            {
                Slot slot = (Slot)field_20135_e.get(i);
                ItemStack itemstack = slot.func_20092_c();
                if(itemstack != null && itemstack.field_855_c == p_28126_1_.field_855_c && (!p_28126_1_.func_21128_e() || p_28126_1_.func_21125_h() == itemstack.func_21125_h()) && ItemStack.func_46124_a(p_28126_1_, itemstack))
                {
                    int k = itemstack.field_853_a + p_28126_1_.field_853_a;
                    if(k <= p_28126_1_.func_576_b())
                    {
                        p_28126_1_.field_853_a = 0;
                        itemstack.field_853_a = k;
                        slot.func_20094_d();
                        flag = true;
                    } else
                    if(itemstack.field_853_a < p_28126_1_.func_576_b())
                    {
                        p_28126_1_.field_853_a -= p_28126_1_.func_576_b() - itemstack.field_853_a;
                        itemstack.field_853_a = p_28126_1_.func_576_b();
                        slot.func_20094_d();
                        flag = true;
                    }
                }
                if(p_28126_4_)
                {
                    i--;
                } else
                {
                    i++;
                }
            }
        }
        if(p_28126_1_.field_853_a > 0)
        {
            int j;
            if(p_28126_4_)
            {
                j = p_28126_3_ - 1;
            } else
            {
                j = p_28126_2_;
            }
            do
            {
                if((p_28126_4_ || j >= p_28126_3_) && (!p_28126_4_ || j < p_28126_2_))
                {
                    break;
                }
                Slot slot1 = (Slot)field_20135_e.get(j);
                ItemStack itemstack1 = slot1.func_20092_c();
                if(itemstack1 == null)
                {
                    slot1.func_20089_b(p_28126_1_.func_578_d());
                    slot1.func_20094_d();
                    p_28126_1_.field_853_a = 0;
                    flag = true;
                    break;
                }
                if(p_28126_4_)
                {
                    j--;
                } else
                {
                    j++;
                }
            } while(true);
        }
        return flag;
    }
}
