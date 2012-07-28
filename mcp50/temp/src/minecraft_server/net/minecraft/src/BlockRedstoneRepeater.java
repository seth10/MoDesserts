// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockDirectional, Material, World, Block, 
//            IBlockAccess, EntityLiving, MathHelper, Item, 
//            EntityPlayer

public class BlockRedstoneRepeater extends BlockDirectional
{

    public static final double field_22014_a[] = {
        -0.0625D, 0.0625D, 0.1875D, 0.3125D
    };
    private static final int field_22013_b[] = {
        1, 2, 3, 4
    };
    private final boolean field_22015_c;

    protected BlockRedstoneRepeater(int p_i561_1_, boolean p_i561_2_)
    {
        super(p_i561_1_, 6, Material.field_513_n);
        field_22015_c = p_i561_2_;
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        if(!p_259_1_.func_445_d(p_259_2_, p_259_3_ - 1, p_259_4_))
        {
            return false;
        } else
        {
            return super.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_);
        }
    }

    public boolean func_220_f(World p_220_1_, int p_220_2_, int p_220_3_, int p_220_4_)
    {
        if(!p_220_1_.func_445_d(p_220_2_, p_220_3_ - 1, p_220_4_))
        {
            return false;
        } else
        {
            return super.func_220_f(p_220_1_, p_220_2_, p_220_3_, p_220_4_);
        }
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        int i = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
        boolean flag = func_22012_g(p_221_1_, p_221_2_, p_221_3_, p_221_4_, i);
        if(field_22015_c && !flag)
        {
            p_221_1_.func_507_b(p_221_2_, p_221_3_, p_221_4_, Block.field_22011_bh.field_573_bc, i);
        } else
        if(!field_22015_c)
        {
            p_221_1_.func_507_b(p_221_2_, p_221_3_, p_221_4_, Block.field_22010_bi.field_573_bc, i);
            if(!flag)
            {
                int j = (i & 0xc) >> 2;
                p_221_1_.func_22074_c(p_221_2_, p_221_3_, p_221_4_, Block.field_22010_bi.field_573_bc, field_22013_b[j] * 2);
            }
        }
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 0)
        {
            return !field_22015_c ? 115 : 99;
        }
        if(p_22009_1_ == 1)
        {
            return !field_22015_c ? 131 : 147;
        } else
        {
            return 5;
        }
    }

    public int func_40161_b()
    {
        return 15;
    }

    public int func_241_a(int p_241_1_)
    {
        return func_22009_a(p_241_1_, 0);
    }

    public boolean func_238_d(World p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_, int p_238_5_)
    {
        return func_239_b(p_238_1_, p_238_2_, p_238_3_, p_238_4_, p_238_5_);
    }

    public boolean func_239_b(IBlockAccess p_239_1_, int p_239_2_, int p_239_3_, int p_239_4_, int p_239_5_)
    {
        if(!field_22015_c)
        {
            return false;
        }
        int i = func_48132_b(p_239_1_.func_446_b(p_239_2_, p_239_3_, p_239_4_));
        if(i == 0 && p_239_5_ == 3)
        {
            return true;
        }
        if(i == 1 && p_239_5_ == 4)
        {
            return true;
        }
        if(i == 2 && p_239_5_ == 2)
        {
            return true;
        }
        return i == 3 && p_239_5_ == 5;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(!func_220_f(p_234_1_, p_234_2_, p_234_3_, p_234_4_))
        {
            func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_), 0);
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            p_234_1_.func_449_g(p_234_2_ + 1, p_234_3_, p_234_4_, field_573_bc);
            p_234_1_.func_449_g(p_234_2_ - 1, p_234_3_, p_234_4_, field_573_bc);
            p_234_1_.func_449_g(p_234_2_, p_234_3_, p_234_4_ + 1, field_573_bc);
            p_234_1_.func_449_g(p_234_2_, p_234_3_, p_234_4_ - 1, field_573_bc);
            p_234_1_.func_449_g(p_234_2_, p_234_3_ - 1, p_234_4_, field_573_bc);
            p_234_1_.func_449_g(p_234_2_, p_234_3_ + 1, p_234_4_, field_573_bc);
            return;
        }
        int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
        boolean flag = func_22012_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_, i);
        int j = (i & 0xc) >> 2;
        if(field_22015_c && !flag)
        {
            p_234_1_.func_22074_c(p_234_2_, p_234_3_, p_234_4_, field_573_bc, field_22013_b[j] * 2);
        } else
        if(!field_22015_c && flag)
        {
            p_234_1_.func_22074_c(p_234_2_, p_234_3_, p_234_4_, field_573_bc, field_22013_b[j] * 2);
        }
    }

    private boolean func_22012_g(World p_22012_1_, int p_22012_2_, int p_22012_3_, int p_22012_4_, int p_22012_5_)
    {
        int i = func_48132_b(p_22012_5_);
        switch(i)
        {
        case 0: // '\0'
            return p_22012_1_.func_489_j(p_22012_2_, p_22012_3_, p_22012_4_ + 1, 3) || p_22012_1_.func_444_a(p_22012_2_, p_22012_3_, p_22012_4_ + 1) == Block.field_591_aw.field_573_bc && p_22012_1_.func_446_b(p_22012_2_, p_22012_3_, p_22012_4_ + 1) > 0;

        case 2: // '\002'
            return p_22012_1_.func_489_j(p_22012_2_, p_22012_3_, p_22012_4_ - 1, 2) || p_22012_1_.func_444_a(p_22012_2_, p_22012_3_, p_22012_4_ - 1) == Block.field_591_aw.field_573_bc && p_22012_1_.func_446_b(p_22012_2_, p_22012_3_, p_22012_4_ - 1) > 0;

        case 3: // '\003'
            return p_22012_1_.func_489_j(p_22012_2_ + 1, p_22012_3_, p_22012_4_, 5) || p_22012_1_.func_444_a(p_22012_2_ + 1, p_22012_3_, p_22012_4_) == Block.field_591_aw.field_573_bc && p_22012_1_.func_446_b(p_22012_2_ + 1, p_22012_3_, p_22012_4_) > 0;

        case 1: // '\001'
            return p_22012_1_.func_489_j(p_22012_2_ - 1, p_22012_3_, p_22012_4_, 4) || p_22012_1_.func_444_a(p_22012_2_ - 1, p_22012_3_, p_22012_4_) == Block.field_591_aw.field_573_bc && p_22012_1_.func_446_b(p_22012_2_ - 1, p_22012_3_, p_22012_4_) > 0;
        }
        return false;
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        int i = p_246_1_.func_446_b(p_246_2_, p_246_3_, p_246_4_);
        int j = (i & 0xc) >> 2;
        j = j + 1 << 2 & 0xc;
        p_246_1_.func_511_b(p_246_2_, p_246_3_, p_246_4_, j | i & 3);
        return true;
    }

    public boolean func_225_d()
    {
        return true;
    }

    public void func_4027_a(World p_4027_1_, int p_4027_2_, int p_4027_3_, int p_4027_4_, EntityLiving p_4027_5_)
    {
        int i = ((MathHelper.func_584_b((double)((p_4027_5_.field_316_r * 4F) / 360F) + 0.5D) & 3) + 2) % 4;
        p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, i);
        boolean flag = func_22012_g(p_4027_1_, p_4027_2_, p_4027_3_, p_4027_4_, i);
        if(flag)
        {
            p_4027_1_.func_22074_c(p_4027_2_, p_4027_3_, p_4027_4_, field_573_bc, 1);
        }
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        p_250_1_.func_449_g(p_250_2_ + 1, p_250_3_, p_250_4_, field_573_bc);
        p_250_1_.func_449_g(p_250_2_ - 1, p_250_3_, p_250_4_, field_573_bc);
        p_250_1_.func_449_g(p_250_2_, p_250_3_, p_250_4_ + 1, field_573_bc);
        p_250_1_.func_449_g(p_250_2_, p_250_3_, p_250_4_ - 1, field_573_bc);
        p_250_1_.func_449_g(p_250_2_, p_250_3_ - 1, p_250_4_, field_573_bc);
        p_250_1_.func_449_g(p_250_2_, p_250_3_ + 1, p_250_4_, field_573_bc);
    }

    public void func_251_a(World p_251_1_, int p_251_2_, int p_251_3_, int p_251_4_, int p_251_5_)
    {
        if(field_22015_c)
        {
            p_251_1_.func_449_g(p_251_2_ + 1, p_251_3_, p_251_4_, field_573_bc);
            p_251_1_.func_449_g(p_251_2_ - 1, p_251_3_, p_251_4_, field_573_bc);
            p_251_1_.func_449_g(p_251_2_, p_251_3_, p_251_4_ + 1, field_573_bc);
            p_251_1_.func_449_g(p_251_2_, p_251_3_, p_251_4_ - 1, field_573_bc);
            p_251_1_.func_449_g(p_251_2_, p_251_3_ - 1, p_251_4_, field_573_bc);
            p_251_1_.func_449_g(p_251_2_, p_251_3_ + 1, p_251_4_, field_573_bc);
        }
        super.func_251_a(p_251_1_, p_251_2_, p_251_3_, p_251_4_, p_251_5_);
    }

    public boolean func_240_b()
    {
        return false;
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return Item.field_22007_aZ.field_234_aS;
    }

}
