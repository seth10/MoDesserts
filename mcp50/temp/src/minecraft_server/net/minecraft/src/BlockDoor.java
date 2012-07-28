// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, Item, 
//            IBlockAccess, AxisAlignedBB, EntityPlayer, Vec3D, 
//            MovingObjectPosition

public class BlockDoor extends Block
{

    protected BlockDoor(int p_i264_1_, Material p_i264_2_)
    {
        super(p_i264_1_, p_i264_2_);
        field_575_bb = 97;
        if(p_i264_2_ == Material.field_522_e)
        {
            field_575_bb++;
        }
        float f = 0.5F;
        float f1 = 1.0F;
        func_229_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int p_48127_4_)
    {
        int i = func_48134_e(p_48127_1_, p_48127_2_, p_48127_3_, p_48127_4_);
        return (i & 4) != 0;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public int func_40161_b()
    {
        return 7;
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        func_233_a(p_248_1_, p_248_2_, p_248_3_, p_248_4_);
        return super.func_248_d(p_248_1_, p_248_2_, p_248_3_, p_248_4_);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        func_273_b(func_48134_e(p_233_1_, p_233_2_, p_233_3_, p_233_4_));
    }

    public int func_48136_c(IBlockAccess p_48136_1_, int p_48136_2_, int p_48136_3_, int p_48136_4_)
    {
        return func_48134_e(p_48136_1_, p_48136_2_, p_48136_3_, p_48136_4_) & 3;
    }

    public boolean func_48135_d(IBlockAccess p_48135_1_, int p_48135_2_, int p_48135_3_, int p_48135_4_)
    {
        return (func_48134_e(p_48135_1_, p_48135_2_, p_48135_3_, p_48135_4_) & 4) != 0;
    }

    private void func_273_b(int p_273_1_)
    {
        float f = 0.1875F;
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        int i = p_273_1_ & 3;
        boolean flag = (p_273_1_ & 4) != 0;
        boolean flag1 = (p_273_1_ & 0x10) != 0;
        if(i == 0)
        {
            if(!flag)
            {
                func_229_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
            } else
            if(!flag1)
            {
                func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            } else
            {
                func_229_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            }
        } else
        if(i == 1)
        {
            if(!flag)
            {
                func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            } else
            if(!flag1)
            {
                func_229_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            } else
            {
                func_229_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
            }
        } else
        if(i == 2)
        {
            if(!flag)
            {
                func_229_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            } else
            if(!flag1)
            {
                func_229_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            } else
            {
                func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            }
        } else
        if(i == 3)
        {
            if(!flag)
            {
                func_229_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            } else
            if(!flag1)
            {
                func_229_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
            } else
            {
                func_229_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    public void func_235_b(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_, EntityPlayer p_235_5_)
    {
        func_246_a(p_235_1_, p_235_2_, p_235_3_, p_235_4_, p_235_5_);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(field_553_bn == Material.field_522_e)
        {
            return true;
        }
        int i = func_48134_e(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
        int j = i & 7;
        j ^= 4;
        if((i & 8) != 0)
        {
            p_246_1_.func_511_b(p_246_2_, p_246_3_ - 1, p_246_4_, j);
            p_246_1_.func_519_b(p_246_2_, p_246_3_ - 1, p_246_4_, p_246_2_, p_246_3_, p_246_4_);
        } else
        {
            p_246_1_.func_511_b(p_246_2_, p_246_3_, p_246_4_, j);
            p_246_1_.func_519_b(p_246_2_, p_246_3_, p_246_4_, p_246_2_, p_246_3_, p_246_4_);
        }
        p_246_1_.func_28101_a(p_246_5_, 1003, p_246_2_, p_246_3_, p_246_4_, 0);
        return true;
    }

    public void func_272_a(World p_272_1_, int p_272_2_, int p_272_3_, int p_272_4_, boolean p_272_5_)
    {
        int i = func_48134_e(p_272_1_, p_272_2_, p_272_3_, p_272_4_);
        boolean flag = (i & 4) != 0;
        if(flag == p_272_5_)
        {
            return;
        }
        int j = i & 7;
        j ^= 4;
        if((i & 8) != 0)
        {
            p_272_1_.func_511_b(p_272_2_, p_272_3_ - 1, p_272_4_, j);
            p_272_1_.func_519_b(p_272_2_, p_272_3_ - 1, p_272_4_, p_272_2_, p_272_3_, p_272_4_);
        } else
        {
            p_272_1_.func_511_b(p_272_2_, p_272_3_, p_272_4_, j);
            p_272_1_.func_519_b(p_272_2_, p_272_3_, p_272_4_, p_272_2_, p_272_3_, p_272_4_);
        }
        p_272_1_.func_28101_a(null, 1003, p_272_2_, p_272_3_, p_272_4_, 0);
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
        if((i & 8) != 0)
        {
            if(p_234_1_.func_444_a(p_234_2_, p_234_3_ - 1, p_234_4_) != field_573_bc)
            {
                p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            }
            if(p_234_5_ > 0 && p_234_5_ != field_573_bc)
            {
                func_234_b(p_234_1_, p_234_2_, p_234_3_ - 1, p_234_4_, p_234_5_);
            }
        } else
        {
            boolean flag = false;
            if(p_234_1_.func_444_a(p_234_2_, p_234_3_ + 1, p_234_4_) != field_573_bc)
            {
                p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
                flag = true;
            }
            if(!p_234_1_.func_445_d(p_234_2_, p_234_3_ - 1, p_234_4_))
            {
                p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
                flag = true;
                if(p_234_1_.func_444_a(p_234_2_, p_234_3_ + 1, p_234_4_) == field_573_bc)
                {
                    p_234_1_.func_508_d(p_234_2_, p_234_3_ + 1, p_234_4_, 0);
                }
            }
            if(flag)
            {
                if(!p_234_1_.field_792_x)
                {
                    func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, i, 0);
                }
            } else
            {
                boolean flag1 = p_234_1_.func_474_n(p_234_2_, p_234_3_, p_234_4_) || p_234_1_.func_474_n(p_234_2_, p_234_3_ + 1, p_234_4_);
                if((flag1 || p_234_5_ > 0 && Block.field_542_n[p_234_5_].func_225_d() || p_234_5_ == 0) && p_234_5_ != field_573_bc)
                {
                    func_272_a(p_234_1_, p_234_2_, p_234_3_, p_234_4_, flag1);
                }
            }
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        if((p_252_1_ & 8) != 0)
        {
            return 0;
        }
        if(field_553_bn == Material.field_522_e)
        {
            return Item.field_195_az.field_234_aS;
        } else
        {
            return Item.field_208_at.field_234_aS;
        }
    }

    public MovingObjectPosition func_262_a(World p_262_1_, int p_262_2_, int p_262_3_, int p_262_4_, Vec3D p_262_5_, Vec3D p_262_6_)
    {
        func_233_a(p_262_1_, p_262_2_, p_262_3_, p_262_4_);
        return super.func_262_a(p_262_1_, p_262_2_, p_262_3_, p_262_4_, p_262_5_, p_262_6_);
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        if(p_259_3_ >= 255)
        {
            return false;
        } else
        {
            return p_259_1_.func_445_d(p_259_2_, p_259_3_ - 1, p_259_4_) && super.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_) && super.func_259_a(p_259_1_, p_259_2_, p_259_3_ + 1, p_259_4_);
        }
    }

    public int func_31025_e()
    {
        return 1;
    }

    public int func_48134_e(IBlockAccess p_48134_1_, int p_48134_2_, int p_48134_3_, int p_48134_4_)
    {
        int i = p_48134_1_.func_446_b(p_48134_2_, p_48134_3_, p_48134_4_);
        boolean flag = (i & 8) != 0;
        int j;
        int k;
        if(flag)
        {
            j = p_48134_1_.func_446_b(p_48134_2_, p_48134_3_ - 1, p_48134_4_);
            k = i;
        } else
        {
            j = i;
            k = p_48134_1_.func_446_b(p_48134_2_, p_48134_3_ + 1, p_48134_4_);
        }
        boolean flag1 = (k & 1) != 0;
        int l = j & 7 | (flag ? 8 : 0) | (flag1 ? 0x10 : 0);
        return l;
    }
}
