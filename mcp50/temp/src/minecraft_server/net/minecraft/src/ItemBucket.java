// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, MovingObjectPosition, EnumMovingObjectType, 
//            World, Material, PlayerCapabilities, ItemStack, 
//            WorldProvider, Block, EntityCow

public class ItemBucket extends Item
{

    private int field_274_a;

    public ItemBucket(int p_i32_1_, int p_i32_2_)
    {
        super(p_i32_1_);
        field_233_aT = 1;
        field_274_a = p_i32_2_;
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        float f = 1.0F;
        double d = p_6152_3_.field_9092_m + (p_6152_3_.field_322_l - p_6152_3_.field_9092_m) * (double)f;
        double d1 = (p_6152_3_.field_9091_n + (p_6152_3_.field_321_m - p_6152_3_.field_9091_n) * (double)f + 1.6200000000000001D) - (double)p_6152_3_.field_9076_H;
        double d2 = p_6152_3_.field_9090_o + (p_6152_3_.field_320_n - p_6152_3_.field_9090_o) * (double)f;
        boolean flag = field_274_a == 0;
        MovingObjectPosition movingobjectposition = func_40225_a(p_6152_2_, p_6152_3_, flag);
        if(movingobjectposition == null)
        {
            return p_6152_1_;
        }
        if(movingobjectposition.field_927_a == EnumMovingObjectType.TILE)
        {
            int i = movingobjectposition.field_926_b;
            int j = movingobjectposition.field_932_c;
            int k = movingobjectposition.field_931_d;
            if(!p_6152_2_.func_6157_a(p_6152_3_, i, j, k))
            {
                return p_6152_1_;
            }
            if(field_274_a == 0)
            {
                if(!p_6152_3_.func_35200_c(i, j, k))
                {
                    return p_6152_1_;
                }
                if(p_6152_2_.func_443_c(i, j, k) == Material.field_521_f && p_6152_2_.func_446_b(i, j, k) == 0)
                {
                    p_6152_2_.func_508_d(i, j, k, 0);
                    if(p_6152_3_.field_35214_K.field_35657_d)
                    {
                        return p_6152_1_;
                    } else
                    {
                        return new ItemStack(Item.field_4170_av);
                    }
                }
                if(p_6152_2_.func_443_c(i, j, k) == Material.field_520_g && p_6152_2_.func_446_b(i, j, k) == 0)
                {
                    p_6152_2_.func_508_d(i, j, k, 0);
                    if(p_6152_3_.field_35214_K.field_35657_d)
                    {
                        return p_6152_1_;
                    } else
                    {
                        return new ItemStack(Item.field_201_aw);
                    }
                }
            } else
            {
                if(field_274_a < 0)
                {
                    return new ItemStack(Item.field_205_au);
                }
                if(movingobjectposition.field_930_e == 0)
                {
                    j--;
                }
                if(movingobjectposition.field_930_e == 1)
                {
                    j++;
                }
                if(movingobjectposition.field_930_e == 2)
                {
                    k--;
                }
                if(movingobjectposition.field_930_e == 3)
                {
                    k++;
                }
                if(movingobjectposition.field_930_e == 4)
                {
                    i--;
                }
                if(movingobjectposition.field_930_e == 5)
                {
                    i++;
                }
                if(!p_6152_3_.func_35200_c(i, j, k))
                {
                    return p_6152_1_;
                }
                if(p_6152_2_.func_20111_e(i, j, k) || !p_6152_2_.func_443_c(i, j, k).func_216_a())
                {
                    if(p_6152_2_.field_4272_q.field_6166_d && field_274_a == Block.field_598_B.field_573_bc)
                    {
                        p_6152_2_.func_502_a(d + 0.5D, d1 + 0.5D, d2 + 0.5D, "random.fizz", 0.5F, 2.6F + (p_6152_2_.field_803_m.nextFloat() - p_6152_2_.field_803_m.nextFloat()) * 0.8F);
                        for(int l = 0; l < 8; l++)
                        {
                            p_6152_2_.func_514_a("largesmoke", (double)i + Math.random(), (double)j + Math.random(), (double)k + Math.random(), 0.0D, 0.0D, 0.0D);
                        }

                    } else
                    {
                        p_6152_2_.func_507_b(i, j, k, field_274_a, 0);
                    }
                    if(p_6152_3_.field_35214_K.field_35657_d)
                    {
                        return p_6152_1_;
                    } else
                    {
                        return new ItemStack(Item.field_205_au);
                    }
                }
            }
        } else
        if(field_274_a == 0 && (movingobjectposition.field_928_g instanceof EntityCow))
        {
            return new ItemStack(Item.field_4204_aE);
        }
        return p_6152_1_;
    }
}
