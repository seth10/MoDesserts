// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, ItemStack

public class ItemCoal extends Item
{

    public ItemCoal(int p_i427_1_)
    {
        super(p_i427_1_);
        func_21091_a(true);
        func_21090_d(0);
    }

    public String func_35407_a(ItemStack p_35407_1_)
    {
        if(p_35407_1_.func_21125_h() == 1)
        {
            return "item.charcoal";
        } else
        {
            return "item.coal";
        }
    }
}
