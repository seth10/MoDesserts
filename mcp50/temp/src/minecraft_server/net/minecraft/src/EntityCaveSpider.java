// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntitySpider, EntityLiving, World, PotionEffect, 
//            Potion, Entity

public class EntityCaveSpider extends EntitySpider
{

    public EntityCaveSpider(World p_i183_1_)
    {
        super(p_i183_1_);
        field_9119_aG = "/mob/cavespider.png";
        func_113_a(0.7F, 0.5F);
    }

    public int func_40095_c()
    {
        return 12;
    }

    public boolean func_35224_c(Entity p_35224_1_)
    {
        if(super.func_35224_c(p_35224_1_))
        {
            if(p_35224_1_ instanceof EntityLiving)
            {
                byte byte0 = 0;
                if(field_9093_l.field_804_l > 1)
                {
                    if(field_9093_l.field_804_l == 2)
                    {
                        byte0 = 7;
                    } else
                    if(field_9093_l.field_804_l == 3)
                    {
                        byte0 = 15;
                    }
                }
                if(byte0 > 0)
                {
                    ((EntityLiving)p_35224_1_).func_35182_d(new PotionEffect(Potion.field_35466_u.field_35447_H, byte0 * 20, 0));
                }
            }
            return true;
        } else
        {
            return false;
        }
    }
}
