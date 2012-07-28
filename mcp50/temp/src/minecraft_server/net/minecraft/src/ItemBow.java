// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, PlayerCapabilities, Enchantment, 
//            EnchantmentHelper, InventoryPlayer, EntityArrow, ItemStack, 
//            World, EnumAction

public class ItemBow extends Item
{

    public ItemBow(int p_i403_1_)
    {
        super(p_i403_1_);
        field_233_aT = 1;
        func_21090_d(384);
    }

    public void func_35408_a(ItemStack p_35408_1_, World p_35408_2_, EntityPlayer p_35408_3_, int p_35408_4_)
    {
        boolean flag = p_35408_3_.field_35214_K.field_35657_d || EnchantmentHelper.func_40638_b(Enchantment.field_46054_w.field_40368_t, p_35408_1_) > 0;
        if(flag || p_35408_3_.field_416_aj.func_35177_c(Item.field_4148_j.field_234_aS))
        {
            int i = func_35404_c(p_35408_1_) - p_35408_4_;
            float f = (float)i / 20F;
            f = (f * f + f * 2.0F) / 3F;
            if((double)f < 0.10000000000000001D)
            {
                return;
            }
            if(f > 1.0F)
            {
                f = 1.0F;
            }
            EntityArrow entityarrow = new EntityArrow(p_35408_2_, p_35408_3_, f * 2.0F);
            if(f == 1.0F)
            {
                entityarrow.field_35160_d = true;
            }
            int j = EnchantmentHelper.func_40638_b(Enchantment.field_46057_t.field_40368_t, p_35408_1_);
            if(j > 0)
            {
                entityarrow.func_46008_a(entityarrow.func_46009_j() + (double)j * 0.5D + 0.5D);
            }
            int k = EnchantmentHelper.func_40638_b(Enchantment.field_46056_u.field_40368_t, p_35408_1_);
            if(k > 0)
            {
                entityarrow.func_46007_b(k);
            }
            if(EnchantmentHelper.func_40638_b(Enchantment.field_46055_v.field_40368_t, p_35408_1_) > 0)
            {
                entityarrow.func_40034_j(100);
            }
            p_35408_1_.func_25125_a(1, p_35408_3_);
            p_35408_2_.func_506_a(p_35408_3_, "random.bow", 1.0F, 1.0F / (field_4154_b.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
            if(!flag)
            {
                p_35408_3_.field_416_aj.func_6127_b(Item.field_4148_j.field_234_aS);
            } else
            {
                entityarrow.field_28012_a = false;
            }
            if(!p_35408_2_.field_792_x)
            {
                p_35408_2_.func_526_a(entityarrow);
            }
        }
    }

    public ItemStack func_35405_b(ItemStack p_35405_1_, World p_35405_2_, EntityPlayer p_35405_3_)
    {
        return p_35405_1_;
    }

    public int func_35404_c(ItemStack p_35404_1_)
    {
        return 0x11940;
    }

    public EnumAction func_35406_b(ItemStack p_35406_1_)
    {
        return EnumAction.bow;
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        if(p_6152_3_.field_35214_K.field_35657_d || p_6152_3_.field_416_aj.func_35177_c(Item.field_4148_j.field_234_aS))
        {
            p_6152_3_.func_35201_a(p_6152_1_, func_35404_c(p_6152_1_));
        }
        return p_6152_1_;
    }

    public int func_40224_c()
    {
        return 1;
    }
}
