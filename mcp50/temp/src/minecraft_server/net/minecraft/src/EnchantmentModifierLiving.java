// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IEnchantmentModifier, Enchantment, EntityLiving, Empty3

final class EnchantmentModifierLiving
    implements IEnchantmentModifier
{

    public int field_40486_a;
    public EntityLiving field_40485_b;

    private EnchantmentModifierLiving()
    {
    }

    public void func_40482_a(Enchantment p_40482_1_, int p_40482_2_)
    {
        field_40486_a += p_40482_1_.func_40346_a(p_40482_2_, field_40485_b);
    }

    EnchantmentModifierLiving(Empty3 p_i599_1_)
    {
        this();
    }
}
