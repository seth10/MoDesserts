// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, Block, World, BlockGrass, 
//            IBlockAccess, Item, EntityItem, ItemStack

public class BlockStem extends BlockFlower
{

    private Block field_35068_a;

    protected BlockStem(int p_i340_1_, Block p_i340_2_)
    {
        super(p_i340_1_, 111);
        field_35068_a = p_i340_2_;
        func_231_a(true);
        float f = 0.125F;
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
            float f = func_35067_h(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
            if(p_221_5_.nextInt((int)(25F / f) + 1) == 0)
            {
                int i = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
                if(i < 7)
                {
                    i++;
                    p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, i);
                } else
                {
                    if(p_221_1_.func_444_a(p_221_2_ - 1, p_221_3_, p_221_4_) == field_35068_a.field_573_bc)
                    {
                        return;
                    }
                    if(p_221_1_.func_444_a(p_221_2_ + 1, p_221_3_, p_221_4_) == field_35068_a.field_573_bc)
                    {
                        return;
                    }
                    if(p_221_1_.func_444_a(p_221_2_, p_221_3_, p_221_4_ - 1) == field_35068_a.field_573_bc)
                    {
                        return;
                    }
                    if(p_221_1_.func_444_a(p_221_2_, p_221_3_, p_221_4_ + 1) == field_35068_a.field_573_bc)
                    {
                        return;
                    }
                    int j = p_221_5_.nextInt(4);
                    int k = p_221_2_;
                    int l = p_221_4_;
                    if(j == 0)
                    {
                        k--;
                    }
                    if(j == 1)
                    {
                        k++;
                    }
                    if(j == 2)
                    {
                        l--;
                    }
                    if(j == 3)
                    {
                        l++;
                    }
                    int i1 = p_221_1_.func_444_a(k, p_221_3_ - 1, l);
                    if(p_221_1_.func_444_a(k, p_221_3_, l) == 0 && (i1 == Block.field_643_aB.field_573_bc || i1 == Block.field_533_w.field_573_bc || i1 == Block.field_534_v.field_573_bc))
                    {
                        p_221_1_.func_508_d(k, p_221_3_, l, field_35068_a.field_573_bc);
                    }
                }
            }
        }
    }

    public void func_35066_f_(World p_35066_1_, int p_35066_2_, int p_35066_3_, int p_35066_4_)
    {
        p_35066_1_.func_511_b(p_35066_2_, p_35066_3_, p_35066_4_, 7);
    }

    private float func_35067_h(World p_35067_1_, int p_35067_2_, int p_35067_3_, int p_35067_4_)
    {
        float f = 1.0F;
        int i = p_35067_1_.func_444_a(p_35067_2_, p_35067_3_, p_35067_4_ - 1);
        int j = p_35067_1_.func_444_a(p_35067_2_, p_35067_3_, p_35067_4_ + 1);
        int k = p_35067_1_.func_444_a(p_35067_2_ - 1, p_35067_3_, p_35067_4_);
        int l = p_35067_1_.func_444_a(p_35067_2_ + 1, p_35067_3_, p_35067_4_);
        int i1 = p_35067_1_.func_444_a(p_35067_2_ - 1, p_35067_3_, p_35067_4_ - 1);
        int j1 = p_35067_1_.func_444_a(p_35067_2_ + 1, p_35067_3_, p_35067_4_ - 1);
        int k1 = p_35067_1_.func_444_a(p_35067_2_ + 1, p_35067_3_, p_35067_4_ + 1);
        int l1 = p_35067_1_.func_444_a(p_35067_2_ - 1, p_35067_3_, p_35067_4_ + 1);
        boolean flag = k == field_573_bc || l == field_573_bc;
        boolean flag1 = i == field_573_bc || j == field_573_bc;
        boolean flag2 = i1 == field_573_bc || j1 == field_573_bc || k1 == field_573_bc || l1 == field_573_bc;
        for(int i2 = p_35067_2_ - 1; i2 <= p_35067_2_ + 1; i2++)
        {
            for(int j2 = p_35067_4_ - 1; j2 <= p_35067_4_ + 1; j2++)
            {
                int k2 = p_35067_1_.func_444_a(i2, p_35067_3_ - 1, j2);
                float f1 = 0.0F;
                if(k2 == Block.field_643_aB.field_573_bc)
                {
                    f1 = 1.0F;
                    if(p_35067_1_.func_446_b(i2, p_35067_3_ - 1, j2) > 0)
                    {
                        f1 = 3F;
                    }
                }
                if(i2 != p_35067_2_ || j2 != p_35067_4_)
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
        return field_575_bb;
    }

    public void func_40163_f()
    {
        float f = 0.125F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        field_559_bj = (float)(p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_) * 2 + 2) / 16F;
        float f = 0.125F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, (float)field_559_bj, 0.5F + f);
    }

    public int func_40161_b()
    {
        return 19;
    }

    public void func_227_a(World p_227_1_, int p_227_2_, int p_227_3_, int p_227_4_, int p_227_5_, float p_227_6_, int p_227_7_)
    {
        super.func_227_a(p_227_1_, p_227_2_, p_227_3_, p_227_4_, p_227_5_, p_227_6_, p_227_7_);
        if(p_227_1_.field_792_x)
        {
            return;
        }
        Item item = null;
        if(field_35068_a == Block.field_4052_bb)
        {
            item = Item.field_35417_be;
        }
        if(field_35068_a == Block.field_35048_bs)
        {
            item = Item.field_35412_bf;
        }
        for(int i = 0; i < 3; i++)
        {
            if(p_227_1_.field_803_m.nextInt(15) <= p_227_5_)
            {
                float f = 0.7F;
                float f1 = p_227_1_.field_803_m.nextFloat() * f + (1.0F - f) * 0.5F;
                float f2 = p_227_1_.field_803_m.nextFloat() * f + (1.0F - f) * 0.5F;
                float f3 = p_227_1_.field_803_m.nextFloat() * f + (1.0F - f) * 0.5F;
                EntityItem entityitem = new EntityItem(p_227_1_, (float)p_227_2_ + f1, (float)p_227_3_ + f2, (float)p_227_4_ + f3, new ItemStack(item));
                entityitem.field_433_ad = 10;
                p_227_1_.func_526_a(entityitem);
            }
        }

    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        if(p_252_1_ != 7);
        return -1;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 1;
    }
}
