// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, Block, World, 
//            TileEntityDispenser, EntityPlayer, ItemStack, Item, 
//            EntityArrow, EntityEgg, EntitySnowball, ItemPotion, 
//            EntityPotion, EntityExpBottle, ItemMonsterPlacer, EntitySmallFireball, 
//            EntityItem, EntityLiving, MathHelper, IInventory, 
//            NBTTagCompound, TileEntity

public class BlockDispenser extends BlockContainer
{

    private Random field_28032_a;

    protected BlockDispenser(int p_i584_1_)
    {
        super(p_i584_1_, Material.field_523_d);
        field_28032_a = new Random();
        field_575_bb = 45;
    }

    public int func_4028_b()
    {
        return 4;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_9040_P.field_573_bc;
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        super.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        func_21035_g(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
    }

    private void func_21035_g(World p_21035_1_, int p_21035_2_, int p_21035_3_, int p_21035_4_)
    {
        if(p_21035_1_.field_792_x)
        {
            return;
        }
        int i = p_21035_1_.func_444_a(p_21035_2_, p_21035_3_, p_21035_4_ - 1);
        int j = p_21035_1_.func_444_a(p_21035_2_, p_21035_3_, p_21035_4_ + 1);
        int k = p_21035_1_.func_444_a(p_21035_2_ - 1, p_21035_3_, p_21035_4_);
        int l = p_21035_1_.func_444_a(p_21035_2_ + 1, p_21035_3_, p_21035_4_);
        byte byte0 = 3;
        if(Block.field_540_p[i] && !Block.field_540_p[j])
        {
            byte0 = 3;
        }
        if(Block.field_540_p[j] && !Block.field_540_p[i])
        {
            byte0 = 2;
        }
        if(Block.field_540_p[k] && !Block.field_540_p[l])
        {
            byte0 = 5;
        }
        if(Block.field_540_p[l] && !Block.field_540_p[k])
        {
            byte0 = 4;
        }
        p_21035_1_.func_511_b(p_21035_2_, p_21035_3_, p_21035_4_, byte0);
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 1)
        {
            return field_575_bb + 17;
        }
        if(p_241_1_ == 0)
        {
            return field_575_bb + 17;
        }
        if(p_241_1_ == 3)
        {
            return field_575_bb + 1;
        } else
        {
            return field_575_bb;
        }
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_1_.field_792_x)
        {
            return true;
        }
        TileEntityDispenser tileentitydispenser = (TileEntityDispenser)p_246_1_.func_451_k(p_246_2_, p_246_3_, p_246_4_);
        if(tileentitydispenser != null)
        {
            p_246_5_.func_21072_a(tileentitydispenser);
        }
        return true;
    }

    private void func_21036_b(World p_21036_1_, int p_21036_2_, int p_21036_3_, int p_21036_4_, Random p_21036_5_)
    {
        int i = p_21036_1_.func_446_b(p_21036_2_, p_21036_3_, p_21036_4_);
        int j = 0;
        int k = 0;
        if(i == 3)
        {
            k = 1;
        } else
        if(i == 2)
        {
            k = -1;
        } else
        if(i == 5)
        {
            j = 1;
        } else
        {
            j = -1;
        }
        TileEntityDispenser tileentitydispenser = (TileEntityDispenser)p_21036_1_.func_451_k(p_21036_2_, p_21036_3_, p_21036_4_);
        if(tileentitydispenser != null)
        {
            ItemStack itemstack = tileentitydispenser.func_21079_e();
            double d = (double)p_21036_2_ + (double)j * 0.59999999999999998D + 0.5D;
            double d1 = (double)p_21036_3_ + 0.5D;
            double d2 = (double)p_21036_4_ + (double)k * 0.59999999999999998D + 0.5D;
            if(itemstack == null)
            {
                p_21036_1_.func_28097_e(1001, p_21036_2_, p_21036_3_, p_21036_4_, 0);
            } else
            {
                if(itemstack.field_855_c == Item.field_4148_j.field_234_aS)
                {
                    EntityArrow entityarrow = new EntityArrow(p_21036_1_, d, d1, d2);
                    entityarrow.func_177_a(j, 0.10000000149011612D, k, 1.1F, 6F);
                    entityarrow.field_28012_a = true;
                    p_21036_1_.func_526_a(entityarrow);
                    p_21036_1_.func_28097_e(1002, p_21036_2_, p_21036_3_, p_21036_4_, 0);
                } else
                if(itemstack.field_855_c == Item.field_239_aN.field_234_aS)
                {
                    EntityEgg entityegg = new EntityEgg(p_21036_1_, d, d1, d2);
                    entityegg.func_40043_a(j, 0.10000000149011612D, k, 1.1F, 6F);
                    p_21036_1_.func_526_a(entityegg);
                    p_21036_1_.func_28097_e(1002, p_21036_2_, p_21036_3_, p_21036_4_, 0);
                } else
                if(itemstack.field_855_c == Item.field_251_aB.field_234_aS)
                {
                    EntitySnowball entitysnowball = new EntitySnowball(p_21036_1_, d, d1, d2);
                    entitysnowball.func_40043_a(j, 0.10000000149011612D, k, 1.1F, 6F);
                    p_21036_1_.func_526_a(entitysnowball);
                    p_21036_1_.func_28097_e(1002, p_21036_2_, p_21036_3_, p_21036_4_, 0);
                } else
                if(itemstack.field_855_c == Item.field_40238_bq.field_234_aS && ItemPotion.func_40254_c(itemstack.func_21125_h()))
                {
                    EntityPotion entitypotion = new EntityPotion(p_21036_1_, d, d1, d2, itemstack.func_21125_h());
                    entitypotion.func_40043_a(j, 0.10000000149011612D, k, 1.375F, 3F);
                    p_21036_1_.func_526_a(entitypotion);
                    p_21036_1_.func_28097_e(1002, p_21036_2_, p_21036_3_, p_21036_4_, 0);
                } else
                if(itemstack.field_855_c == Item.field_48389_bC.field_234_aS)
                {
                    EntityExpBottle entityexpbottle = new EntityExpBottle(p_21036_1_, d, d1, d2);
                    entityexpbottle.func_40043_a(j, 0.10000000149011612D, k, 1.375F, 3F);
                    p_21036_1_.func_526_a(entityexpbottle);
                    p_21036_1_.func_28097_e(1002, p_21036_2_, p_21036_3_, p_21036_4_, 0);
                } else
                if(itemstack.field_855_c == Item.field_44008_bB.field_234_aS)
                {
                    ItemMonsterPlacer.func_48390_a(p_21036_1_, itemstack.func_21125_h(), d + (double)j * 0.29999999999999999D, d1 - 0.29999999999999999D, d2 + (double)k * 0.29999999999999999D);
                    p_21036_1_.func_28097_e(1002, p_21036_2_, p_21036_3_, p_21036_4_, 0);
                } else
                if(itemstack.field_855_c == Item.field_48388_bD.field_234_aS)
                {
                    EntitySmallFireball entitysmallfireball = new EntitySmallFireball(p_21036_1_, d + (double)j * 0.29999999999999999D, d1, d2 + (double)k * 0.29999999999999999D, (double)j + p_21036_5_.nextGaussian() * 0.050000000000000003D, p_21036_5_.nextGaussian() * 0.050000000000000003D, (double)k + p_21036_5_.nextGaussian() * 0.050000000000000003D);
                    p_21036_1_.func_526_a(entitysmallfireball);
                    p_21036_1_.func_28097_e(1009, p_21036_2_, p_21036_3_, p_21036_4_, 0);
                } else
                {
                    EntityItem entityitem = new EntityItem(p_21036_1_, d, d1 - 0.29999999999999999D, d2, itemstack);
                    double d3 = p_21036_5_.nextDouble() * 0.10000000000000001D + 0.20000000000000001D;
                    entityitem.field_319_o = (double)j * d3;
                    entityitem.field_318_p = 0.20000000298023224D;
                    entityitem.field_317_q = (double)k * d3;
                    entityitem.field_319_o += p_21036_5_.nextGaussian() * 0.0074999998323619366D * 6D;
                    entityitem.field_318_p += p_21036_5_.nextGaussian() * 0.0074999998323619366D * 6D;
                    entityitem.field_317_q += p_21036_5_.nextGaussian() * 0.0074999998323619366D * 6D;
                    p_21036_1_.func_526_a(entityitem);
                    p_21036_1_.func_28097_e(1000, p_21036_2_, p_21036_3_, p_21036_4_, 0);
                }
                p_21036_1_.func_28097_e(2000, p_21036_2_, p_21036_3_, p_21036_4_, j + 1 + (k + 1) * 3);
            }
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(p_234_5_ > 0 && Block.field_542_n[p_234_5_].func_225_d())
        {
            boolean flag = p_234_1_.func_474_n(p_234_2_, p_234_3_, p_234_4_) || p_234_1_.func_474_n(p_234_2_, p_234_3_ + 1, p_234_4_);
            if(flag)
            {
                p_234_1_.func_22074_c(p_234_2_, p_234_3_, p_234_4_, field_573_bc, func_4028_b());
            }
        }
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(!p_221_1_.field_792_x && (p_221_1_.func_474_n(p_221_2_, p_221_3_, p_221_4_) || p_221_1_.func_474_n(p_221_2_, p_221_3_ + 1, p_221_4_)))
        {
            func_21036_b(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_5_);
        }
    }

    public TileEntity func_294_a_()
    {
        return new TileEntityDispenser();
    }

    public void func_4027_a(World p_4027_1_, int p_4027_2_, int p_4027_3_, int p_4027_4_, EntityLiving p_4027_5_)
    {
        int i = MathHelper.func_584_b((double)((p_4027_5_.field_316_r * 4F) / 360F) + 0.5D) & 3;
        if(i == 0)
        {
            p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, 2);
        }
        if(i == 1)
        {
            p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, 5);
        }
        if(i == 2)
        {
            p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, 3);
        }
        if(i == 3)
        {
            p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, 4);
        }
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        TileEntityDispenser tileentitydispenser = (TileEntityDispenser)p_242_1_.func_451_k(p_242_2_, p_242_3_, p_242_4_);
        if(tileentitydispenser != null)
        {
label0:
            for(int i = 0; i < tileentitydispenser.func_83_a(); i++)
            {
                ItemStack itemstack = tileentitydispenser.func_82_a(i);
                if(itemstack == null)
                {
                    continue;
                }
                float f = field_28032_a.nextFloat() * 0.8F + 0.1F;
                float f1 = field_28032_a.nextFloat() * 0.8F + 0.1F;
                float f2 = field_28032_a.nextFloat() * 0.8F + 0.1F;
                do
                {
                    if(itemstack.field_853_a <= 0)
                    {
                        continue label0;
                    }
                    int j = field_28032_a.nextInt(21) + 10;
                    if(j > itemstack.field_853_a)
                    {
                        j = itemstack.field_853_a;
                    }
                    itemstack.field_853_a -= j;
                    EntityItem entityitem = new EntityItem(p_242_1_, (float)p_242_2_ + f, (float)p_242_3_ + f1, (float)p_242_4_ + f2, new ItemStack(itemstack.field_855_c, j, itemstack.func_21125_h()));
                    if(itemstack.func_40608_n())
                    {
                        entityitem.field_429_a.func_40604_d((NBTTagCompound)itemstack.func_40607_o().func_40468_b());
                    }
                    float f3 = 0.05F;
                    entityitem.field_319_o = (float)field_28032_a.nextGaussian() * f3;
                    entityitem.field_318_p = (float)field_28032_a.nextGaussian() * f3 + 0.2F;
                    entityitem.field_317_q = (float)field_28032_a.nextGaussian() * f3;
                    p_242_1_.func_526_a(entityitem);
                } while(true);
            }

        }
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
    }
}
