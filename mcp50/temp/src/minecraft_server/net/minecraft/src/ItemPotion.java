// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Item, ItemStack, PotionHelper, World, 
//            PotionEffect, EntityPlayer, InventoryPlayer, EnumAction, 
//            EntityPotion

public class ItemPotion extends Item
{

    private HashMap field_40257_a;

    public ItemPotion(int p_i143_1_)
    {
        super(p_i143_1_);
        field_40257_a = new HashMap();
        func_21086_c(1);
        func_21091_a(true);
        func_21090_d(0);
    }

    public List func_40256_b(ItemStack p_40256_1_)
    {
        return func_40255_b(p_40256_1_.func_21125_h());
    }

    public List func_40255_b(int p_40255_1_)
    {
        List list = (List)field_40257_a.get(Integer.valueOf(p_40255_1_));
        if(list == null)
        {
            list = PotionHelper.func_40550_a(p_40255_1_, false);
            field_40257_a.put(Integer.valueOf(p_40255_1_), list);
        }
        return list;
    }

    public ItemStack func_35405_b(ItemStack p_35405_1_, World p_35405_2_, EntityPlayer p_35405_3_)
    {
        p_35405_1_.field_853_a--;
        if(!p_35405_2_.field_792_x)
        {
            List list = func_40256_b(p_35405_1_);
            if(list != null)
            {
                PotionEffect potioneffect;
                for(Iterator iterator = list.iterator(); iterator.hasNext(); p_35405_3_.func_35182_d(new PotionEffect(potioneffect)))
                {
                    potioneffect = (PotionEffect)iterator.next();
                }

            }
        }
        if(p_35405_1_.field_853_a <= 0)
        {
            return new ItemStack(Item.field_40232_br);
        } else
        {
            p_35405_3_.field_416_aj.func_201_a(new ItemStack(Item.field_40232_br));
            return p_35405_1_;
        }
    }

    public int func_35404_c(ItemStack p_35404_1_)
    {
        return 32;
    }

    public EnumAction func_35406_b(ItemStack p_35406_1_)
    {
        return EnumAction.drink;
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        if(func_40254_c(p_6152_1_.func_21125_h()))
        {
            p_6152_1_.field_853_a--;
            p_6152_2_.func_506_a(p_6152_3_, "random.bow", 0.5F, 0.4F / (field_4154_b.nextFloat() * 0.4F + 0.8F));
            if(!p_6152_2_.field_792_x)
            {
                p_6152_2_.func_526_a(new EntityPotion(p_6152_2_, p_6152_3_, p_6152_1_.func_21125_h()));
            }
            return p_6152_1_;
        } else
        {
            p_6152_3_.func_35201_a(p_6152_1_, func_35404_c(p_6152_1_));
            return p_6152_1_;
        }
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int i, int j, int k, int l)
    {
        return false;
    }

    public static boolean func_40254_c(int p_40254_0_)
    {
        return (p_40254_0_ & 0x4000) != 0;
    }
}
