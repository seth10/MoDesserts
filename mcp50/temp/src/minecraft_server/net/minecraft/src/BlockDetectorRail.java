// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockRail, World, IBlockAccess, EntityMinecart, 
//            AxisAlignedBB, Entity

public class BlockDetectorRail extends BlockRail
{

    public BlockDetectorRail(int p_i368_1_, int p_i368_2_)
    {
        super(p_i368_1_, p_i368_2_, true);
        func_231_a(true);
    }

    public int func_4028_b()
    {
        return 20;
    }

    public boolean func_225_d()
    {
        return true;
    }

    public void func_263_a(World p_263_1_, int p_263_2_, int p_263_3_, int p_263_4_, Entity p_263_5_)
    {
        if(p_263_1_.field_792_x)
        {
            return;
        }
        int i = p_263_1_.func_446_b(p_263_2_, p_263_3_, p_263_4_);
        if((i & 8) != 0)
        {
            return;
        } else
        {
            func_27035_f(p_263_1_, p_263_2_, p_263_3_, p_263_4_, i);
            return;
        }
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_1_.field_792_x)
        {
            return;
        }
        int i = p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_);
        if((i & 8) == 0)
        {
            return;
        } else
        {
            func_27035_f(p_221_1_, p_221_2_, p_221_3_, p_221_4_, i);
            return;
        }
    }

    public boolean func_239_b(IBlockAccess p_239_1_, int p_239_2_, int p_239_3_, int p_239_4_, int p_239_5_)
    {
        return (p_239_1_.func_446_b(p_239_2_, p_239_3_, p_239_4_) & 8) != 0;
    }

    public boolean func_238_d(World p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_, int p_238_5_)
    {
        if((p_238_1_.func_446_b(p_238_2_, p_238_3_, p_238_4_) & 8) == 0)
        {
            return false;
        } else
        {
            return p_238_5_ == 1;
        }
    }

    private void func_27035_f(World p_27035_1_, int p_27035_2_, int p_27035_3_, int p_27035_4_, int p_27035_5_)
    {
        boolean flag = (p_27035_5_ & 8) != 0;
        boolean flag1 = false;
        float f = 0.125F;
        List list = p_27035_1_.func_457_a(net.minecraft.src.EntityMinecart.class, AxisAlignedBB.func_693_b((float)p_27035_2_ + f, p_27035_3_, (float)p_27035_4_ + f, (float)(p_27035_2_ + 1) - f, (float)(p_27035_3_ + 1) - f, (float)(p_27035_4_ + 1) - f));
        if(list.size() > 0)
        {
            flag1 = true;
        }
        if(flag1 && !flag)
        {
            p_27035_1_.func_511_b(p_27035_2_, p_27035_3_, p_27035_4_, p_27035_5_ | 8);
            p_27035_1_.func_449_g(p_27035_2_, p_27035_3_, p_27035_4_, field_573_bc);
            p_27035_1_.func_449_g(p_27035_2_, p_27035_3_ - 1, p_27035_4_, field_573_bc);
            p_27035_1_.func_519_b(p_27035_2_, p_27035_3_, p_27035_4_, p_27035_2_, p_27035_3_, p_27035_4_);
        }
        if(!flag1 && flag)
        {
            p_27035_1_.func_511_b(p_27035_2_, p_27035_3_, p_27035_4_, p_27035_5_ & 7);
            p_27035_1_.func_449_g(p_27035_2_, p_27035_3_, p_27035_4_, field_573_bc);
            p_27035_1_.func_449_g(p_27035_2_, p_27035_3_ - 1, p_27035_4_, field_573_bc);
            p_27035_1_.func_519_b(p_27035_2_, p_27035_3_, p_27035_4_, p_27035_2_, p_27035_3_, p_27035_4_);
        }
        if(flag1)
        {
            p_27035_1_.func_22074_c(p_27035_2_, p_27035_3_, p_27035_4_, field_573_bc, func_4028_b());
        }
    }
}
