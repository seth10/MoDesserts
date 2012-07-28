// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, Block, World, 
//            TileEntityFurnace, EntityPlayer, TileEntity, EntityLiving, 
//            MathHelper, IInventory, ItemStack, EntityItem, 
//            NBTTagCompound

public class BlockFurnace extends BlockContainer
{

    private Random field_28033_a;
    private final boolean field_655_a;
    private static boolean field_28034_c = false;

    protected BlockFurnace(int p_i456_1_, boolean p_i456_2_)
    {
        super(p_i456_1_, Material.field_523_d);
        field_28033_a = new Random();
        field_655_a = p_i456_2_;
        field_575_bb = 45;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Block.field_642_aC.field_573_bc;
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        super.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        func_296_g(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
    }

    private void func_296_g(World p_296_1_, int p_296_2_, int p_296_3_, int p_296_4_)
    {
        if(p_296_1_.field_792_x)
        {
            return;
        }
        int i = p_296_1_.func_444_a(p_296_2_, p_296_3_, p_296_4_ - 1);
        int j = p_296_1_.func_444_a(p_296_2_, p_296_3_, p_296_4_ + 1);
        int k = p_296_1_.func_444_a(p_296_2_ - 1, p_296_3_, p_296_4_);
        int l = p_296_1_.func_444_a(p_296_2_ + 1, p_296_3_, p_296_4_);
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
        p_296_1_.func_511_b(p_296_2_, p_296_3_, p_296_4_, byte0);
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
            return field_575_bb - 1;
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
        TileEntityFurnace tileentityfurnace = (TileEntityFurnace)p_246_1_.func_451_k(p_246_2_, p_246_3_, p_246_4_);
        if(tileentityfurnace != null)
        {
            p_246_5_.func_170_a(tileentityfurnace);
        }
        return true;
    }

    public static void func_295_a(boolean p_295_0_, World p_295_1_, int p_295_2_, int p_295_3_, int p_295_4_)
    {
        int i = p_295_1_.func_446_b(p_295_2_, p_295_3_, p_295_4_);
        TileEntity tileentity = p_295_1_.func_451_k(p_295_2_, p_295_3_, p_295_4_);
        field_28034_c = true;
        if(p_295_0_)
        {
            p_295_1_.func_508_d(p_295_2_, p_295_3_, p_295_4_, Block.field_641_aD.field_573_bc);
        } else
        {
            p_295_1_.func_508_d(p_295_2_, p_295_3_, p_295_4_, Block.field_642_aC.field_573_bc);
        }
        field_28034_c = false;
        p_295_1_.func_511_b(p_295_2_, p_295_3_, p_295_4_, i);
        if(tileentity != null)
        {
            tileentity.func_31002_j();
            p_295_1_.func_473_a(p_295_2_, p_295_3_, p_295_4_, tileentity);
        }
    }

    public TileEntity func_294_a_()
    {
        return new TileEntityFurnace();
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
        if(!field_28034_c)
        {
            TileEntityFurnace tileentityfurnace = (TileEntityFurnace)p_242_1_.func_451_k(p_242_2_, p_242_3_, p_242_4_);
            if(tileentityfurnace != null)
            {
label0:
                for(int i = 0; i < tileentityfurnace.func_83_a(); i++)
                {
                    ItemStack itemstack = tileentityfurnace.func_82_a(i);
                    if(itemstack == null)
                    {
                        continue;
                    }
                    float f = field_28033_a.nextFloat() * 0.8F + 0.1F;
                    float f1 = field_28033_a.nextFloat() * 0.8F + 0.1F;
                    float f2 = field_28033_a.nextFloat() * 0.8F + 0.1F;
                    do
                    {
                        if(itemstack.field_853_a <= 0)
                        {
                            continue label0;
                        }
                        int j = field_28033_a.nextInt(21) + 10;
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
                        entityitem.field_319_o = (float)field_28033_a.nextGaussian() * f3;
                        entityitem.field_318_p = (float)field_28033_a.nextGaussian() * f3 + 0.2F;
                        entityitem.field_317_q = (float)field_28033_a.nextGaussian() * f3;
                        p_242_1_.func_526_a(entityitem);
                    } while(true);
                }

            }
        }
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
    }

}
