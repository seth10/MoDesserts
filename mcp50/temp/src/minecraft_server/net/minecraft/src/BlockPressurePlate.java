// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, World, EnumMobType, AxisAlignedBB, 
//            EntityLiving, EntityPlayer, IBlockAccess, Material, 
//            Entity

public class BlockPressurePlate extends Block
{

    private EnumMobType field_664_a;

    protected BlockPressurePlate(int p_i52_1_, int p_i52_2_, EnumMobType p_i52_3_, Material p_i52_4_)
    {
        super(p_i52_1_, p_i52_2_, p_i52_4_);
        field_664_a = p_i52_3_;
        func_231_a(true);
        float f = 0.0625F;
        func_229_a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
    }

    public int func_4028_b()
    {
        return 20;
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int i)
    {
        return true;
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return p_259_1_.func_445_d(p_259_2_, p_259_3_ - 1, p_259_4_) || p_259_1_.func_444_a(p_259_2_, p_259_3_ - 1, p_259_4_) == Block.field_9050_aZ.field_573_bc;
    }

    public void func_250_e(World world, int i, int j, int k)
    {
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        boolean flag = false;
        if(!p_234_1_.func_445_d(p_234_2_, p_234_3_ - 1, p_234_4_) && p_234_1_.func_444_a(p_234_2_, p_234_3_ - 1, p_234_4_) != Block.field_9050_aZ.field_573_bc)
        {
            flag = true;
        }
        if(flag)
        {
            func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_), 0);
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
        }
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        if(p_221_1_.field_792_x)
        {
            return;
        }
        if(p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_) == 0)
        {
            return;
        } else
        {
            func_318_g(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
            return;
        }
    }

    public void func_263_a(World p_263_1_, int p_263_2_, int p_263_3_, int p_263_4_, Entity p_263_5_)
    {
        if(p_263_1_.field_792_x)
        {
            return;
        }
        if(p_263_1_.func_446_b(p_263_2_, p_263_3_, p_263_4_) == 1)
        {
            return;
        } else
        {
            func_318_g(p_263_1_, p_263_2_, p_263_3_, p_263_4_);
            return;
        }
    }

    private void func_318_g(World p_318_1_, int p_318_2_, int p_318_3_, int p_318_4_)
    {
        boolean flag = p_318_1_.func_446_b(p_318_2_, p_318_3_, p_318_4_) == 1;
        boolean flag1 = false;
        float f = 0.125F;
        List list = null;
        if(field_664_a == EnumMobType.everything)
        {
            list = p_318_1_.func_450_b(null, AxisAlignedBB.func_693_b((float)p_318_2_ + f, p_318_3_, (float)p_318_4_ + f, (float)(p_318_2_ + 1) - f, (double)p_318_3_ + 0.25D, (float)(p_318_4_ + 1) - f));
        }
        if(field_664_a == EnumMobType.mobs)
        {
            list = p_318_1_.func_457_a(net.minecraft.src.EntityLiving.class, AxisAlignedBB.func_693_b((float)p_318_2_ + f, p_318_3_, (float)p_318_4_ + f, (float)(p_318_2_ + 1) - f, (double)p_318_3_ + 0.25D, (float)(p_318_4_ + 1) - f));
        }
        if(field_664_a == EnumMobType.players)
        {
            list = p_318_1_.func_457_a(net.minecraft.src.EntityPlayer.class, AxisAlignedBB.func_693_b((float)p_318_2_ + f, p_318_3_, (float)p_318_4_ + f, (float)(p_318_2_ + 1) - f, (double)p_318_3_ + 0.25D, (float)(p_318_4_ + 1) - f));
        }
        if(list.size() > 0)
        {
            flag1 = true;
        }
        if(flag1 && !flag)
        {
            p_318_1_.func_511_b(p_318_2_, p_318_3_, p_318_4_, 1);
            p_318_1_.func_449_g(p_318_2_, p_318_3_, p_318_4_, field_573_bc);
            p_318_1_.func_449_g(p_318_2_, p_318_3_ - 1, p_318_4_, field_573_bc);
            p_318_1_.func_519_b(p_318_2_, p_318_3_, p_318_4_, p_318_2_, p_318_3_, p_318_4_);
            p_318_1_.func_502_a((double)p_318_2_ + 0.5D, (double)p_318_3_ + 0.10000000000000001D, (double)p_318_4_ + 0.5D, "random.click", 0.3F, 0.6F);
        }
        if(!flag1 && flag)
        {
            p_318_1_.func_511_b(p_318_2_, p_318_3_, p_318_4_, 0);
            p_318_1_.func_449_g(p_318_2_, p_318_3_, p_318_4_, field_573_bc);
            p_318_1_.func_449_g(p_318_2_, p_318_3_ - 1, p_318_4_, field_573_bc);
            p_318_1_.func_519_b(p_318_2_, p_318_3_, p_318_4_, p_318_2_, p_318_3_, p_318_4_);
            p_318_1_.func_502_a((double)p_318_2_ + 0.5D, (double)p_318_3_ + 0.10000000000000001D, (double)p_318_4_ + 0.5D, "random.click", 0.3F, 0.5F);
        }
        if(flag1)
        {
            p_318_1_.func_22074_c(p_318_2_, p_318_3_, p_318_4_, field_573_bc, func_4028_b());
        }
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        int i = p_242_1_.func_446_b(p_242_2_, p_242_3_, p_242_4_);
        if(i > 0)
        {
            p_242_1_.func_449_g(p_242_2_, p_242_3_, p_242_4_, field_573_bc);
            p_242_1_.func_449_g(p_242_2_, p_242_3_ - 1, p_242_4_, field_573_bc);
        }
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        boolean flag = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_) == 1;
        float f = 0.0625F;
        if(flag)
        {
            func_229_a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
        } else
        {
            func_229_a(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
        }
    }

    public boolean func_239_b(IBlockAccess p_239_1_, int p_239_2_, int p_239_3_, int p_239_4_, int p_239_5_)
    {
        return p_239_1_.func_446_b(p_239_2_, p_239_3_, p_239_4_) > 0;
    }

    public boolean func_238_d(World p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_, int p_238_5_)
    {
        if(p_238_1_.func_446_b(p_238_2_, p_238_3_, p_238_4_) == 0)
        {
            return false;
        } else
        {
            return p_238_5_ == 1;
        }
    }

    public boolean func_225_d()
    {
        return true;
    }

    public void func_40163_f()
    {
        float f = 0.5F;
        float f1 = 0.125F;
        float f2 = 0.5F;
        func_229_a(0.5F - f, 0.5F - f1, 0.5F - f2, 0.5F + f, 0.5F + f1, 0.5F + f2);
    }

    public int func_31025_e()
    {
        return 1;
    }
}
