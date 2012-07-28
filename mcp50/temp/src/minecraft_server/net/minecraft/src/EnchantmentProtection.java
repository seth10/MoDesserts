// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType, DamageSource

public class EnchantmentProtection extends Enchantment
{

    private static final String field_40378_w[] = {
        "all", "fire", "fall", "explosion", "projectile"
    };
    private static final int field_40382_x[] = {
        1, 10, 5, 5, 3
    };
    private static final int field_40381_y[] = {
        16, 8, 6, 8, 6
    };
    private static final int field_40380_z[] = {
        20, 12, 10, 12, 15
    };
    public final int field_40379_a;

    public EnchantmentProtection(int p_i408_1_, int p_i408_2_, int p_i408_3_)
    {
        super(p_i408_1_, p_i408_2_, EnumEnchantmentType.armor);
        field_40379_a = p_i408_3_;
        if(p_i408_3_ == 2)
        {
            field_40367_u = EnumEnchantmentType.armor_feet;
        }
    }

    public int func_40345_a(int p_40345_1_)
    {
        return field_40382_x[field_40379_a] + (p_40345_1_ - 1) * field_40381_y[field_40379_a];
    }

    public int func_40342_b(int p_40342_1_)
    {
        return func_40345_a(p_40342_1_) + field_40380_z[field_40379_a];
    }

    public int func_40344_a()
    {
        return 4;
    }

    public int func_40350_a(int p_40350_1_, DamageSource p_40350_2_)
    {
        if(p_40350_2_.func_35077_d())
        {
            return 0;
        }
        int i = (6 + p_40350_1_ * p_40350_1_) / 2;
        if(field_40379_a == 0)
        {
            return i;
        }
        if(field_40379_a == 1 && p_40350_2_.func_40272_k())
        {
            return i;
        }
        if(field_40379_a == 2 && p_40350_2_ == DamageSource.field_35098_h)
        {
            return i * 2;
        }
        if(field_40379_a == 3 && p_40350_2_ == DamageSource.field_35097_k)
        {
            return i;
        }
        if(field_40379_a == 4 && p_40350_2_.func_40275_b())
        {
            return i;
        } else
        {
            return 0;
        }
    }

    public boolean func_40343_a(Enchantment p_40343_1_)
    {
        if(p_40343_1_ instanceof EnchantmentProtection)
        {
            EnchantmentProtection enchantmentprotection = (EnchantmentProtection)p_40343_1_;
            if(enchantmentprotection.field_40379_a == field_40379_a)
            {
                return false;
            }
            return field_40379_a == 2 || enchantmentprotection.field_40379_a == 2;
        } else
        {
            return super.func_40343_a(p_40343_1_);
        }
    }

}
