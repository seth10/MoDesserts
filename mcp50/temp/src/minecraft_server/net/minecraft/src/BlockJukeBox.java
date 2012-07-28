// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, World, TileEntityRecordPlayer, 
//            EntityItem, ItemStack, EntityPlayer, TileEntity

public class BlockJukeBox extends BlockContainer
{

    protected BlockJukeBox(int p_i146_1_, int p_i146_2_)
    {
        super(p_i146_1_, p_i146_2_, Material.field_524_c);
    }

    public int func_241_a(int p_241_1_)
    {
        return field_575_bb + (p_241_1_ != 1 ? 0 : 1);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_1_.func_446_b(p_246_2_, p_246_3_, p_246_4_) == 0)
        {
            return false;
        } else
        {
            func_28035_b_(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
            return true;
        }
    }

    public void func_286_f(World p_286_1_, int p_286_2_, int p_286_3_, int p_286_4_, int p_286_5_)
    {
        if(p_286_1_.field_792_x)
        {
            return;
        }
        TileEntityRecordPlayer tileentityrecordplayer = (TileEntityRecordPlayer)p_286_1_.func_451_k(p_286_2_, p_286_3_, p_286_4_);
        if(tileentityrecordplayer == null)
        {
            return;
        } else
        {
            tileentityrecordplayer.field_28009_a = p_286_5_;
            tileentityrecordplayer.func_183_c();
            p_286_1_.func_511_b(p_286_2_, p_286_3_, p_286_4_, 1);
            return;
        }
    }

    public void func_28035_b_(World p_28035_1_, int p_28035_2_, int p_28035_3_, int p_28035_4_)
    {
        if(p_28035_1_.field_792_x)
        {
            return;
        }
        TileEntityRecordPlayer tileentityrecordplayer = (TileEntityRecordPlayer)p_28035_1_.func_451_k(p_28035_2_, p_28035_3_, p_28035_4_);
        if(tileentityrecordplayer == null)
        {
            return;
        }
        int i = tileentityrecordplayer.field_28009_a;
        if(i == 0)
        {
            return;
        } else
        {
            p_28035_1_.func_28097_e(1005, p_28035_2_, p_28035_3_, p_28035_4_, 0);
            p_28035_1_.func_491_a(null, p_28035_2_, p_28035_3_, p_28035_4_);
            tileentityrecordplayer.field_28009_a = 0;
            tileentityrecordplayer.func_183_c();
            p_28035_1_.func_511_b(p_28035_2_, p_28035_3_, p_28035_4_, 0);
            int j = i;
            float f = 0.7F;
            double d = (double)(p_28035_1_.field_803_m.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d1 = (double)(p_28035_1_.field_803_m.nextFloat() * f) + (double)(1.0F - f) * 0.20000000000000001D + 0.59999999999999998D;
            double d2 = (double)(p_28035_1_.field_803_m.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            EntityItem entityitem = new EntityItem(p_28035_1_, (double)p_28035_2_ + d, (double)p_28035_3_ + d1, (double)p_28035_4_ + d2, new ItemStack(j, 1, 0));
            entityitem.field_433_ad = 10;
            p_28035_1_.func_526_a(entityitem);
            return;
        }
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        func_28035_b_(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
    }

    public void func_227_a(World p_227_1_, int p_227_2_, int p_227_3_, int p_227_4_, int p_227_5_, float p_227_6_, int p_227_7_)
    {
        if(p_227_1_.field_792_x)
        {
            return;
        } else
        {
            super.func_227_a(p_227_1_, p_227_2_, p_227_3_, p_227_4_, p_227_5_, p_227_6_, 0);
            return;
        }
    }

    public TileEntity func_294_a_()
    {
        return new TileEntityRecordPlayer();
    }
}
