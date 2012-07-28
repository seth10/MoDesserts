// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemBlock, ItemDye, ItemStack, BlockCloth

public class ItemCloth extends ItemBlock
{

    public ItemCloth(int p_i36_1_)
    {
        super(p_i36_1_);
        func_21090_d(0);
        func_21091_a(true);
    }

    public int func_21089_a(int p_21089_1_)
    {
        return p_21089_1_;
    }

    public String func_35407_a(ItemStack p_35407_1_)
    {
        return (new StringBuilder()).append(super.func_20106_a()).append(".").append(ItemDye.field_21099_a[BlockCloth.func_21033_c(p_35407_1_.func_21125_h())]).toString();
    }
}
