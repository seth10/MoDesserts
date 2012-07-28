// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, Block, World, EntityItem, 
//            ItemStack, Item

public class BlockCrops extends BlockFlower
{

    protected BlockCrops(int p_i315_1_, int p_i315_2_)
    {
        super(p_i315_1_, p_i315_2_);
        field_575_bb = p_i315_2_;
        func_231_a(true);
        float f = 0.5F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    }

    protected boolean func_277_b(int p_277_1_)
    {
        return p_277_1_ == Block.field_643_aB.field_573_bc;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        super.func_221_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_5_);
        if(p_221_1_.func_495_h(p_221_2_, p_221_3_ + 1, p_221_4_) >= 9)
        {
            int i = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
            if(i < 7)
            {
                float f = func_278_h(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
                if(p_221_5_.nextInt((int)(25F / f) + 1) == 0)
                {
                    i++;
                    p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, i);
                }
            }
        }
    }

    public void func_21028_c(World p_21028_1_, int p_21028_2_, int p_21028_3_, int p_21028_4_)
    {
        p_21028_1_.func_511_b(p_21028_2_, p_21028_3_, p_21028_4_, 7);
    }

    private float func_278_h(World p_278_1_, int p_278_2_, int p_278_3_, int p_278_4_)
    {
        float f = 1.0F;
        int i = p_278_1_.func_444_a(p_278_2_, p_278_3_, p_278_4_ - 1);
        int j = p_278_1_.func_444_a(p_278_2_, p_278_3_, p_278_4_ + 1);
        int k = p_278_1_.func_444_a(p_278_2_ - 1, p_278_3_, p_278_4_);
        int l = p_278_1_.func_444_a(p_278_2_ + 1, p_278_3_, p_278_4_);
        int i1 = p_278_1_.func_444_a(p_278_2_ - 1, p_278_3_, p_278_4_ - 1);
        int j1 = p_278_1_.func_444_a(p_278_2_ + 1, p_278_3_, p_278_4_ - 1);
        int k1 = p_278_1_.func_444_a(p_278_2_ + 1, p_278_3_, p_278_4_ + 1);
        int l1 = p_278_1_.func_444_a(p_278_2_ - 1, p_278_3_, p_278_4_ + 1);
        boolean flag = k == field_573_bc || l == field_573_bc;
        boolean flag1 = i == field_573_bc || j == field_573_bc;
        boolean flag2 = i1 == field_573_bc || j1 == field_573_bc || k1 == field_573_bc || l1 == field_573_bc;
        for(int i2 = p_278_2_ - 1; i2 <= p_278_2_ + 1; i2++)
        {
            for(int j2 = p_278_4_ - 1; j2 <= p_278_4_ + 1; j2++)
            {
                int k2 = p_278_1_.func_444_a(i2, p_278_3_ - 1, j2);
                float f1 = 0.0F;
                if(k2 == Block.field_643_aB.field_573_bc)
                {
                    f1 = 1.0F;
                    if(p_278_1_.func_446_b(i2, p_278_3_ - 1, j2) > 0)
                    {
                        f1 = 3F;
                    }
                }
                if(i2 != p_278_2_ || j2 != p_278_4_)
                {
                    f1 /= 4F;
                }
                f += f1;
            }

        }

        if(flag2 || flag && flag1)
        {
            f /= 2.0F;
        }
        return f;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_2_ < 0)
        {
            p_22009_2_ = 7;
        }
        return field_575_bb + p_22009_2_;
    }

    public int func_40161_b()
    {
        return 6;
    }

    public void func_227_a(World p_227_1_, int p_227_2_, int p_227_3_, int p_227_4_, int p_227_5_, float p_227_6_, int p_227_7_)
    {
        super.func_227_a(p_227_1_, p_227_2_, p_227_3_, p_227_4_, p_227_5_, p_227_6_, 0);
        if(p_227_1_.field_792_x)
        {
            return;
        }
        int i = 3 + p_227_7_;
        for(int j = 0; j < i; j++)
        {
            if(p_227_1_.field_803_m.nextInt(15) <= p_227_5_)
            {
                float f = 0.7F;
                float f1 = p_227_1_.field_803_m.nextFloat() * f + (1.0F - f) * 0.5F;
                float f2 = p_227_1_.field_803_m.nextFloat() * f + (1.0F - f) * 0.5F;
                float f3 = p_227_1_.field_803_m.nextFloat() * f + (1.0F - f) * 0.5F;
                EntityItem entityitem = new EntityItem(p_227_1_, (float)p_227_2_ + f1, (float)p_227_3_ + f2, (float)p_227_4_ + f3, new ItemStack(Item.field_187_Q));
                entityitem.field_433_ad = 10;
                p_227_1_.func_526_a(entityitem);
            }
        }

    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        if(p_252_1_ == 7)
        {
            return Item.field_186_R.field_234_aS;
        } else
        {
            return -1;
        }
    }

    public int func_244_a(Random p_244_1_)
    {
        return 1;
    }
}
