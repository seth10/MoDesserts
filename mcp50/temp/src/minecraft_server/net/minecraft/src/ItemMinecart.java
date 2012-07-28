// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, World, BlockRail, EntityMinecart, 
//            ItemStack, EntityPlayer

public class ItemMinecart extends Item
{

    public int field_270_a;

    public ItemMinecart(int p_i416_1_, int p_i416_2_)
    {
        super(p_i416_1_);
        field_233_aT = 1;
        field_270_a = p_i416_2_;
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        int i = p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_);
        if(BlockRail.func_27030_c(i))
        {
            if(!p_78_3_.field_792_x)
            {
                p_78_3_.func_526_a(new EntityMinecart(p_78_3_, (float)p_78_4_ + 0.5F, (float)p_78_5_ + 0.5F, (float)p_78_6_ + 0.5F, field_270_a));
            }
            p_78_1_.field_853_a--;
            return true;
        } else
        {
            return false;
        }
    }
}
