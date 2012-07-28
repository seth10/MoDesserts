// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType

public class EnchantmentUntouching extends Enchantment
{

    protected EnchantmentUntouching(int p_i271_1_, int p_i271_2_)
    {
        super(p_i271_1_, p_i271_2_, EnumEnchantmentType.digger);
        func_40349_a("untouching");
    }

    public int func_40345_a(int p_40345_1_)
    {
        return 25;
    }

    public int func_40342_b(int p_40342_1_)
    {
        return super.func_40345_a(p_40342_1_) + 50;
    }

    public int func_40344_a()
    {
        return 1;
    }

    public boolean func_40343_a(Enchantment p_40343_1_)
    {
        return super.func_40343_a(p_40343_1_) && p_40343_1_.field_40368_t != field_40369_s.field_40368_t;
    }
}
