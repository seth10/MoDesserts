// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, TileEntityBrewingStand, World, 
//            EntityPlayer, ItemStack, EntityItem, Item, 
//            TileEntity, AxisAlignedBB

public class BlockBrewingStand extends BlockContainer
{

    private Random field_40180_a;

    public BlockBrewingStand(int p_i130_1_)
    {
        super(p_i130_1_, Material.field_522_e);
        field_40180_a = new Random();
        field_575_bb = 157;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public int func_40161_b()
    {
        return 25;
    }

    public TileEntity func_294_a_()
    {
        return new TileEntityBrewingStand();
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public void func_264_a(World p_264_1_, int p_264_2_, int p_264_3_, int p_264_4_, AxisAlignedBB p_264_5_, ArrayList p_264_6_)
    {
        func_229_a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        func_40163_f();
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
    }

    public void func_40163_f()
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_1_.field_792_x)
        {
            return true;
        }
        TileEntityBrewingStand tileentitybrewingstand = (TileEntityBrewingStand)p_246_1_.func_451_k(p_246_2_, p_246_3_, p_246_4_);
        if(tileentitybrewingstand != null)
        {
            p_246_5_.func_40110_a(tileentitybrewingstand);
        }
        return true;
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        TileEntity tileentity = p_242_1_.func_451_k(p_242_2_, p_242_3_, p_242_4_);
        if(tileentity != null && (tileentity instanceof TileEntityBrewingStand))
        {
            TileEntityBrewingStand tileentitybrewingstand = (TileEntityBrewingStand)tileentity;
label0:
            for(int i = 0; i < tileentitybrewingstand.func_83_a(); i++)
            {
                ItemStack itemstack = tileentitybrewingstand.func_82_a(i);
                if(itemstack == null)
                {
                    continue;
                }
                float f = field_40180_a.nextFloat() * 0.8F + 0.1F;
                float f1 = field_40180_a.nextFloat() * 0.8F + 0.1F;
                float f2 = field_40180_a.nextFloat() * 0.8F + 0.1F;
                do
                {
                    if(itemstack.field_853_a <= 0)
                    {
                        continue label0;
                    }
                    int j = field_40180_a.nextInt(21) + 10;
                    if(j > itemstack.field_853_a)
                    {
                        j = itemstack.field_853_a;
                    }
                    itemstack.field_853_a -= j;
                    EntityItem entityitem = new EntityItem(p_242_1_, (float)p_242_2_ + f, (float)p_242_3_ + f1, (float)p_242_4_ + f2, new ItemStack(itemstack.field_855_c, j, itemstack.func_21125_h()));
                    float f3 = 0.05F;
                    entityitem.field_319_o = (float)field_40180_a.nextGaussian() * f3;
                    entityitem.field_318_p = (float)field_40180_a.nextGaussian() * f3 + 0.2F;
                    entityitem.field_317_q = (float)field_40180_a.nextGaussian() * f3;
                    p_242_1_.func_526_a(entityitem);
                } while(true);
            }

        }
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_40227_bw.field_234_aS;
    }
}
