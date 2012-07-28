// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            InventoryBasic, ContainerEnchantment

class SlotEnchantmentTable extends InventoryBasic
{

    final ContainerEnchantment field_40088_a; /* synthetic field */

    SlotEnchantmentTable(ContainerEnchantment p_i586_1_, String p_i586_2_, int p_i586_3_)
    {
        field_40088_a = p_i586_1_;
        super(p_i586_2_, p_i586_3_);
    }

    public int func_202_d()
    {
        return 1;
    }

    public void func_183_c()
    {
        super.func_183_c();
        field_40088_a.func_20121_a(this);
    }
}
