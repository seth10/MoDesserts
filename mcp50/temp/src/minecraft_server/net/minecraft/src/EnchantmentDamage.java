// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType, EntityLiving, EnumCreatureAttribute

public class EnchantmentDamage extends Enchantment
{

    private static final String field_40373_w[] = {
        "all", "undead", "arthropods"
    };
    private static final int field_40377_x[] = {
        1, 5, 5
    };
    private static final int field_40376_y[] = {
        16, 8, 8
    };
    private static final int field_40375_z[] = {
        20, 20, 20
    };
    public final int field_40374_a;

    public EnchantmentDamage(int p_i255_1_, int p_i255_2_, int p_i255_3_)
    {
        super(p_i255_1_, p_i255_2_, EnumEnchantmentType.weapon);
        field_40374_a = p_i255_3_;
    }

    public int func_40345_a(int p_40345_1_)
    {
        return field_40377_x[field_40374_a] + (p_40345_1_ - 1) * field_40376_y[field_40374_a];
    }

    public int func_40342_b(int p_40342_1_)
    {
        return func_40345_a(p_40342_1_) + field_40375_z[field_40374_a];
    }

    public int func_40344_a()
    {
        return 5;
    }

    public int func_40346_a(int p_40346_1_, EntityLiving p_40346_2_)
    {
        if(field_40374_a == 0)
        {
            return p_40346_1_ * 3;
        }
        if(field_40374_a == 1 && p_40346_2_.func_40093_t() == EnumCreatureAttribute.UNDEAD)
        {
            return p_40346_1_ * 4;
        }
        if(field_40374_a == 2 && p_40346_2_.func_40093_t() == EnumCreatureAttribute.ARTHROPOD)
        {
            return p_40346_1_ * 4;
        } else
        {
            return 0;
        }
    }

    public boolean func_40343_a(Enchantment p_40343_1_)
    {
        return !(p_40343_1_ instanceof EnchantmentDamage);
    }

}
