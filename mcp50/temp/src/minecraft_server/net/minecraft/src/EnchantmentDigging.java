// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType

public class EnchantmentDigging extends Enchantment
{

    protected EnchantmentDigging(int p_i94_1_, int p_i94_2_)
    {
        super(p_i94_1_, p_i94_2_, EnumEnchantmentType.digger);
        func_40349_a("digging");
    }

    public int func_40345_a(int p_40345_1_)
    {
        return 1 + 15 * (p_40345_1_ - 1);
    }

    public int func_40342_b(int p_40342_1_)
    {
        return super.func_40345_a(p_40342_1_) + 50;
    }

    public int func_40344_a()
    {
        return 5;
    }
}
