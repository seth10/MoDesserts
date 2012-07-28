// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType

public class EnchantmentLootBonus extends Enchantment
{

    protected EnchantmentLootBonus(int p_i363_1_, int p_i363_2_, EnumEnchantmentType p_i363_3_)
    {
        super(p_i363_1_, p_i363_2_, p_i363_3_);
        func_40349_a("lootBonus");
        if(p_i363_3_ == EnumEnchantmentType.digger)
        {
            func_40349_a("lootBonusDigger");
        }
    }

    public int func_40345_a(int p_40345_1_)
    {
        return 20 + (p_40345_1_ - 1) * 12;
    }

    public int func_40342_b(int p_40342_1_)
    {
        return super.func_40345_a(p_40342_1_) + 50;
    }

    public int func_40344_a()
    {
        return 3;
    }

    public boolean func_40343_a(Enchantment p_40343_1_)
    {
        return super.func_40343_a(p_40343_1_) && p_40343_1_.field_40368_t != field_40371_q.field_40368_t;
    }
}
