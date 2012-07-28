// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IEnchantmentModifier, Enchantment, DamageSource, Empty3

final class EnchantmentModifierDamage
    implements IEnchantmentModifier
{

    public int field_40484_a;
    public DamageSource field_40483_b;

    private EnchantmentModifierDamage()
    {
    }

    public void func_40482_a(Enchantment p_40482_1_, int p_40482_2_)
    {
        field_40484_a += p_40482_1_.func_40350_a(p_40482_2_, field_40483_b);
    }

    EnchantmentModifierDamage(Empty3 p_i261_1_)
    {
        this();
    }
}
