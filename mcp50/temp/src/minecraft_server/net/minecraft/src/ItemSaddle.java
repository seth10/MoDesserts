// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EntityPig, ItemStack, EntityLiving

public class ItemSaddle extends Item
{

    public ItemSaddle(int p_i431_1_)
    {
        super(p_i431_1_);
        field_233_aT = 1;
    }

    public void func_9202_b(ItemStack p_9202_1_, EntityLiving p_9202_2_)
    {
        if(p_9202_2_ instanceof EntityPig)
        {
            EntityPig entitypig = (EntityPig)p_9202_2_;
            if(!entitypig.func_21065_K() && !entitypig.func_40104_l())
            {
                entitypig.func_21064_a(true);
                p_9202_1_.field_853_a--;
            }
        }
    }

    public boolean func_9201_a(ItemStack p_9201_1_, EntityLiving p_9201_2_, EntityLiving p_9201_3_)
    {
        func_9202_b(p_9201_1_, p_9201_2_);
        return true;
    }
}
