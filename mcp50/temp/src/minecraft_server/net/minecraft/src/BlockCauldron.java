// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, EntityPlayer, 
//            InventoryPlayer, ItemStack, Item, PlayerCapabilities, 
//            EntityItem, AxisAlignedBB

public class BlockCauldron extends Block
{

    public BlockCauldron(int p_i145_1_)
    {
        super(p_i145_1_, Material.field_522_e);
        field_575_bb = 154;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 1)
        {
            return 138;
        }
        return p_22009_1_ != 0 ? 154 : 155;
    }

    public void func_264_a(World p_264_1_, int p_264_2_, int p_264_3_, int p_264_4_, AxisAlignedBB p_264_5_, ArrayList p_264_6_)
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        float f = 0.125F;
        func_229_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        func_229_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        func_229_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
        func_40163_f();
    }

    public void func_40163_f()
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public boolean func_240_b()
    {
        return false;
    }

    public int func_40161_b()
    {
        return 24;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_1_.field_792_x)
        {
            return true;
        }
        ItemStack itemstack = p_246_5_.field_416_aj.func_213_b();
        if(itemstack == null)
        {
            return true;
        }
        int i = p_246_1_.func_446_b(p_246_2_, p_246_3_, p_246_4_);
        if(itemstack.field_855_c == Item.field_4170_av.field_234_aS)
        {
            if(i < 3)
            {
                if(!p_246_5_.field_35214_K.field_35657_d)
                {
                    p_246_5_.field_416_aj.func_206_a(p_246_5_.field_416_aj.field_499_d, new ItemStack(Item.field_205_au));
                }
                p_246_1_.func_511_b(p_246_2_, p_246_3_, p_246_4_, 3);
            }
            return true;
        }
        if(itemstack.field_855_c == Item.field_40232_br.field_234_aS && i > 0)
        {
            ItemStack itemstack1 = new ItemStack(Item.field_40238_bq, 1, 0);
            if(!p_246_5_.field_416_aj.func_201_a(itemstack1))
            {
                p_246_1_.func_526_a(new EntityItem(p_246_1_, (double)p_246_2_ + 0.5D, (double)p_246_3_ + 1.5D, (double)p_246_4_ + 0.5D, itemstack1));
            }
            itemstack.field_853_a--;
            if(itemstack.field_853_a <= 0)
            {
                p_246_5_.field_416_aj.func_206_a(p_246_5_.field_416_aj.field_499_d, null);
            }
            p_246_1_.func_511_b(p_246_2_, p_246_3_, p_246_4_, i - 1);
        }
        return true;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_40230_bx.field_234_aS;
    }
}
