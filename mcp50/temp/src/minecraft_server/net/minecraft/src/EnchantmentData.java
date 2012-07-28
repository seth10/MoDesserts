// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WeightedRandomChoice, Enchantment

public class EnchantmentData extends WeightedRandomChoice
{

    public final Enchantment field_40494_a;
    public final int field_40493_b;

    public EnchantmentData(Enchantment p_i364_1_, int p_i364_2_)
    {
        super(p_i364_1_.func_40348_b());
        field_40494_a = p_i364_1_;
        field_40493_b = p_i364_2_;
    }
}
