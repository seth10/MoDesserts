// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, EntityPainting, World, 
//            ItemStack

public class ItemPainting extends Item
{

    public ItemPainting(int p_i605_1_)
    {
        super(p_i605_1_);
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(p_78_7_ == 0)
        {
            return false;
        }
        if(p_78_7_ == 1)
        {
            return false;
        }
        byte byte0 = 0;
        if(p_78_7_ == 4)
        {
            byte0 = 1;
        }
        if(p_78_7_ == 3)
        {
            byte0 = 2;
        }
        if(p_78_7_ == 5)
        {
            byte0 = 3;
        }
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        }
        EntityPainting entitypainting = new EntityPainting(p_78_3_, p_78_4_, p_78_5_, p_78_6_, byte0);
        if(entitypainting.func_181_b())
        {
            if(!p_78_3_.field_792_x)
            {
                p_78_3_.func_526_a(entitypainting);
            }
            p_78_1_.field_853_a--;
        }
        return true;
    }
}
