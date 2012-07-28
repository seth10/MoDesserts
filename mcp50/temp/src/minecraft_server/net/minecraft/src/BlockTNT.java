// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, EntityTNTPrimed, 
//            ItemStack, EntityPlayer, Item

public class BlockTNT extends Block
{

    public BlockTNT(int p_i8_1_, int p_i8_2_)
    {
        super(p_i8_1_, p_i8_2_, Material.field_511_p);
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 0)
        {
            return field_575_bb + 2;
        }
        if(p_241_1_ == 1)
        {
            return field_575_bb + 1;
        } else
        {
            return field_575_bb;
        }
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        super.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        if(p_250_1_.func_474_n(p_250_2_, p_250_3_, p_250_4_))
        {
            func_251_a(p_250_1_, p_250_2_, p_250_3_, p_250_4_, 1);
            p_250_1_.func_508_d(p_250_2_, p_250_3_, p_250_4_, 0);
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(p_234_5_ > 0 && Block.field_542_n[p_234_5_].func_225_d() && p_234_1_.func_474_n(p_234_2_, p_234_3_, p_234_4_))
        {
            func_251_a(p_234_1_, p_234_2_, p_234_3_, p_234_4_, 1);
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
        }
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public void func_4029_c(World p_4029_1_, int p_4029_2_, int p_4029_3_, int p_4029_4_)
    {
        if(p_4029_1_.field_792_x)
        {
            return;
        } else
        {
            EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(p_4029_1_, (float)p_4029_2_ + 0.5F, (float)p_4029_3_ + 0.5F, (float)p_4029_4_ + 0.5F);
            entitytntprimed.field_446_a = p_4029_1_.field_803_m.nextInt(entitytntprimed.field_446_a / 4) + entitytntprimed.field_446_a / 8;
            p_4029_1_.func_526_a(entitytntprimed);
            return;
        }
    }

    public void func_251_a(World p_251_1_, int p_251_2_, int p_251_3_, int p_251_4_, int p_251_5_)
    {
        if(p_251_1_.field_792_x)
        {
            return;
        }
        if((p_251_5_ & 1) == 0)
        {
            func_31024_a(p_251_1_, p_251_2_, p_251_3_, p_251_4_, new ItemStack(Block.field_605_an.field_573_bc, 1, 0));
        } else
        {
            EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(p_251_1_, (float)p_251_2_ + 0.5F, (float)p_251_3_ + 0.5F, (float)p_251_4_ + 0.5F);
            p_251_1_.func_526_a(entitytntprimed);
            p_251_1_.func_506_a(entitytntprimed, "random.fuse", 1.0F, 1.0F);
        }
    }

    public void func_235_b(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_, EntityPlayer p_235_5_)
    {
        super.func_235_b(p_235_1_, p_235_2_, p_235_3_, p_235_4_, p_235_5_);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_5_.func_172_B() != null && p_246_5_.func_172_B().field_855_c == Item.field_4150_g.field_234_aS)
        {
            func_251_a(p_246_1_, p_246_2_, p_246_3_, p_246_4_, 1);
            p_246_1_.func_508_d(p_246_2_, p_246_3_, p_246_4_, 0);
            return true;
        } else
        {
            return super.func_246_a(p_246_1_, p_246_2_, p_246_3_, p_246_4_, p_246_5_);
        }
    }

    protected ItemStack func_41001_e(int p_41001_1_)
    {
        return null;
    }
}
