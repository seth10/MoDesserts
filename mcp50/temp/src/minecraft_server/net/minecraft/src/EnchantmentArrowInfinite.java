// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType

public class EnchantmentArrowInfinite extends Enchantment
{

    public EnchantmentArrowInfinite(int p_i1_1_, int p_i1_2_)
    {
        super(p_i1_1_, p_i1_2_, EnumEnchantmentType.bow);
        func_40349_a("arrowInfinite");
    }

    public int func_40345_a(int p_40345_1_)
    {
        return 20;
    }

    public int func_40342_b(int p_40342_1_)
    {
        return 50;
    }

    public int func_40344_a()
    {
        return 1;
    }
}
