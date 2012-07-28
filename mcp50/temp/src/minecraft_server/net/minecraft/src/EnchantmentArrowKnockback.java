// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType

public class EnchantmentArrowKnockback extends Enchantment
{

    public EnchantmentArrowKnockback(int p_i543_1_, int p_i543_2_)
    {
        super(p_i543_1_, p_i543_2_, EnumEnchantmentType.bow);
        func_40349_a("arrowKnockback");
    }

    public int func_40345_a(int p_40345_1_)
    {
        return 12 + (p_40345_1_ - 1) * 20;
    }

    public int func_40342_b(int p_40342_1_)
    {
        return func_40345_a(p_40342_1_) + 25;
    }

    public int func_40344_a()
    {
        return 2;
    }
}
