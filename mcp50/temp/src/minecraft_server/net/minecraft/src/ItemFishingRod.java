// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, EntityFishHook, ItemStack, 
//            World

public class ItemFishingRod extends Item
{

    public ItemFishingRod(int p_i79_1_)
    {
        super(p_i79_1_);
        func_21090_d(64);
        func_21086_c(1);
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        if(p_6152_3_.field_6124_at != null)
        {
            int i = p_6152_3_.field_6124_at.func_6143_c();
            p_6152_1_.func_25125_a(i, p_6152_3_);
            p_6152_3_.func_168_z();
        } else
        {
            p_6152_2_.func_506_a(p_6152_3_, "random.bow", 0.5F, 0.4F / (field_4154_b.nextFloat() * 0.4F + 0.8F));
            if(!p_6152_2_.field_792_x)
            {
                p_6152_2_.func_526_a(new EntityFishHook(p_6152_2_, p_6152_3_));
            }
            p_6152_3_.func_168_z();
        }
        return p_6152_1_;
    }
}
