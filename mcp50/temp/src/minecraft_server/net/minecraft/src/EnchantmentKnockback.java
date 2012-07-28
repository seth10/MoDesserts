// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType

public class EnchantmentKnockback extends Enchantment
{

    protected EnchantmentKnockback(int p_i376_1_, int p_i376_2_)
    {
        super(p_i376_1_, p_i376_2_, EnumEnchantmentType.weapon);
        func_40349_a("knockback");
    }

    public int func_40345_a(int p_40345_1_)
    {
        return 5 + 20 * (p_40345_1_ - 1);
    }

    public int func_40342_b(int p_40342_1_)
    {
        return super.func_40345_a(p_40342_1_) + 50;
    }

    public int func_40344_a()
    {
        return 2;
    }
}
