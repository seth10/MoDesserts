// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EnchantmentProtection, EnchantmentOxygen, EnchantmentWaterWorker, EnchantmentDamage, 
//            EnchantmentKnockback, EnchantmentFireAspect, EnchantmentLootBonus, EnumEnchantmentType, 
//            EnchantmentDigging, EnchantmentUntouching, EnchantmentDurability, EnchantmentArrowDamage, 
//            EnchantmentArrowKnockback, EnchantmentArrowFire, EnchantmentArrowInfinite, DamageSource, 
//            EntityLiving

public abstract class Enchantment
{

    public static final Enchantment field_40355_b[] = new Enchantment[256];
    public static final Enchantment field_40356_c = new EnchantmentProtection(0, 10, 0);
    public static final Enchantment field_40353_d = new EnchantmentProtection(1, 5, 1);
    public static final Enchantment field_40354_e = new EnchantmentProtection(2, 5, 2);
    public static final Enchantment field_40351_f = new EnchantmentProtection(3, 2, 3);
    public static final Enchantment field_40352_g = new EnchantmentProtection(4, 5, 4);
    public static final Enchantment field_40364_h = new EnchantmentOxygen(5, 2);
    public static final Enchantment field_40365_i = new EnchantmentWaterWorker(6, 2);
    public static final Enchantment field_40362_j = new EnchantmentDamage(16, 10, 0);
    public static final Enchantment field_40363_k = new EnchantmentDamage(17, 5, 1);
    public static final Enchantment field_40360_l = new EnchantmentDamage(18, 5, 2);
    public static final Enchantment field_40361_m = new EnchantmentKnockback(19, 5);
    public static final Enchantment field_40358_n = new EnchantmentFireAspect(20, 2);
    public static final Enchantment field_40359_o;
    public static final Enchantment field_40372_p = new EnchantmentDigging(32, 10);
    public static final Enchantment field_40371_q = new EnchantmentUntouching(33, 1);
    public static final Enchantment field_40370_r = new EnchantmentDurability(34, 5);
    public static final Enchantment field_40369_s;
    public static final Enchantment field_46057_t = new EnchantmentArrowDamage(48, 10);
    public static final Enchantment field_46056_u = new EnchantmentArrowKnockback(49, 2);
    public static final Enchantment field_46055_v = new EnchantmentArrowFire(50, 2);
    public static final Enchantment field_46054_w = new EnchantmentArrowInfinite(51, 1);
    public final int field_40368_t;
    private final int field_40357_a;
    public EnumEnchantmentType field_40367_u;
    protected String field_40366_v;

    protected Enchantment(int p_i314_1_, int p_i314_2_, EnumEnchantmentType p_i314_3_)
    {
        field_40368_t = p_i314_1_;
        field_40357_a = p_i314_2_;
        field_40367_u = p_i314_3_;
        if(field_40355_b[p_i314_1_] != null)
        {
            throw new IllegalArgumentException("Duplicate enchantment id!");
        } else
        {
            field_40355_b[p_i314_1_] = this;
            return;
        }
    }

    public int func_40348_b()
    {
        return field_40357_a;
    }

    public int func_40347_c()
    {
        return 1;
    }

    public int func_40344_a()
    {
        return 1;
    }

    public int func_40345_a(int p_40345_1_)
    {
        return 1 + p_40345_1_ * 10;
    }

    public int func_40342_b(int p_40342_1_)
    {
        return func_40345_a(p_40342_1_) + 5;
    }

    public int func_40350_a(int p_40350_1_, DamageSource p_40350_2_)
    {
        return 0;
    }

    public int func_40346_a(int p_40346_1_, EntityLiving p_40346_2_)
    {
        return 0;
    }

    public boolean func_40343_a(Enchantment p_40343_1_)
    {
        return this != p_40343_1_;
    }

    public Enchantment func_40349_a(String p_40349_1_)
    {
        field_40366_v = p_40349_1_;
        return this;
    }

    static 
    {
        field_40359_o = new EnchantmentLootBonus(21, 2, EnumEnchantmentType.weapon);
        field_40369_s = new EnchantmentLootBonus(35, 2, EnumEnchantmentType.digger);
    }
}
