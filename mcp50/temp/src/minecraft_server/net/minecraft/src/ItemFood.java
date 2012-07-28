// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, ItemStack, EntityPlayer, FoodStats, 
//            World, PotionEffect, EnumAction

public class ItemFood extends Item
{

    public final int field_35427_a = 32;
    private final int field_20901_a;
    private final float field_35431_bu;
    private final boolean field_25011_bi;
    private boolean field_35428_bw;
    private int field_35430_bx;
    private int field_35429_by;
    private int field_35425_bz;
    private float field_35426_bA;

    public ItemFood(int p_i613_1_, int p_i613_2_, float p_i613_3_, boolean p_i613_4_)
    {
        super(p_i613_1_);
        field_20901_a = p_i613_2_;
        field_25011_bi = p_i613_4_;
        field_35431_bu = p_i613_3_;
    }

    public ItemFood(int p_i614_1_, int p_i614_2_, boolean p_i614_3_)
    {
        this(p_i614_1_, p_i614_2_, 0.6F, p_i614_3_);
    }

    public ItemStack func_35405_b(ItemStack p_35405_1_, World p_35405_2_, EntityPlayer p_35405_3_)
    {
        p_35405_1_.field_853_a--;
        p_35405_3_.func_35207_V().func_35582_a(this);
        p_35405_2_.func_506_a(p_35405_3_, "random.burp", 0.5F, p_35405_2_.field_803_m.nextFloat() * 0.1F + 0.9F);
        if(!p_35405_2_.field_792_x && field_35430_bx > 0 && p_35405_2_.field_803_m.nextFloat() < field_35426_bA)
        {
            p_35405_3_.func_35182_d(new PotionEffect(field_35430_bx, field_35429_by * 20, field_35425_bz));
        }
        return p_35405_1_;
    }

    public int func_35404_c(ItemStack p_35404_1_)
    {
        return 32;
    }

    public EnumAction func_35406_b(ItemStack p_35406_1_)
    {
        return EnumAction.eat;
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        if(p_6152_3_.func_35197_c(field_35428_bw))
        {
            p_6152_3_.func_35201_a(p_6152_1_, func_35404_c(p_6152_1_));
        }
        return p_6152_1_;
    }

    public int func_25009_j()
    {
        return field_20901_a;
    }

    public float func_35424_l()
    {
        return field_35431_bu;
    }

    public boolean func_25010_k()
    {
        return field_25011_bi;
    }

    public ItemFood func_35422_a(int p_35422_1_, int p_35422_2_, int p_35422_3_, float p_35422_4_)
    {
        field_35430_bx = p_35422_1_;
        field_35429_by = p_35422_2_;
        field_35425_bz = p_35422_3_;
        field_35426_bA = p_35422_4_;
        return this;
    }

    public ItemFood func_35423_n()
    {
        field_35428_bw = true;
        return this;
    }

    public Item func_20105_a(String p_20105_1_)
    {
        return super.func_20105_a(p_20105_1_);
    }
}
