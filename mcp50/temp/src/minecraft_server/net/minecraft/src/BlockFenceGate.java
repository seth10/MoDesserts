// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BlockDirectional, Material, World, AxisAlignedBB, 
//            IBlockAccess, EntityLiving, MathHelper, EntityPlayer, 
//            Block

public class BlockFenceGate extends BlockDirectional
{

    public BlockFenceGate(int p_i501_1_, int p_i501_2_)
    {
        super(p_i501_1_, p_i501_2_, Material.field_524_c);
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        if(!p_259_1_.func_443_c(p_259_2_, p_259_3_ - 1, p_259_4_).func_216_a())
        {
            return false;
        } else
        {
            return super.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_);
        }
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        int i = p_248_1_.func_446_b(p_248_2_, p_248_3_, p_248_4_);
        if(func_35070_c(i))
        {
            return null;
        }
        if(i == 2 || i == 0)
        {
            return AxisAlignedBB.func_693_b(p_248_2_, p_248_3_, (float)p_248_4_ + 0.375F, p_248_2_ + 1, (float)p_248_3_ + 1.5F, (float)p_248_4_ + 0.625F);
        } else
        {
            return AxisAlignedBB.func_693_b((float)p_248_2_ + 0.375F, p_248_3_, p_248_4_, (float)p_248_2_ + 0.625F, (float)p_248_3_ + 1.5F, p_248_4_ + 1);
        }
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        int i = func_48132_b(p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_));
        if(i == 2 || i == 0)
        {
            func_229_a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
        } else
        {
            func_229_a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
        }
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int p_48127_4_)
    {
        return func_35070_c(p_48127_1_.func_446_b(p_48127_2_, p_48127_3_, p_48127_4_));
    }

    public int func_40161_b()
    {
        return 21;
    }

    public void func_4027_a(World p_4027_1_, int p_4027_2_, int p_4027_3_, int p_4027_4_, EntityLiving p_4027_5_)
    {
        int i = (MathHelper.func_584_b((double)((p_4027_5_.field_316_r * 4F) / 360F) + 0.5D) & 3) % 4;
        p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, i);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        int i = p_246_1_.func_446_b(p_246_2_, p_246_3_, p_246_4_);
        if(func_35070_c(i))
        {
            p_246_1_.func_511_b(p_246_2_, p_246_3_, p_246_4_, i & -5);
        } else
        {
            int j = (MathHelper.func_584_b((double)((p_246_5_.field_316_r * 4F) / 360F) + 0.5D) & 3) % 4;
            int k = func_48132_b(i);
            if(k == (j + 2) % 4)
            {
                i = j;
            }
            p_246_1_.func_511_b(p_246_2_, p_246_3_, p_246_4_, i | 4);
        }
        p_246_1_.func_28101_a(p_246_5_, 1003, p_246_2_, p_246_3_, p_246_4_, 0);
        return true;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(p_234_1_.field_792_x)
        {
            return;
        }
        int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
        boolean flag = p_234_1_.func_474_n(p_234_2_, p_234_3_, p_234_4_);
        if(flag || p_234_5_ > 0 && Block.field_542_n[p_234_5_].func_225_d() || p_234_5_ == 0)
        {
            if(flag && !func_35070_c(i))
            {
                p_234_1_.func_511_b(p_234_2_, p_234_3_, p_234_4_, i | 4);
                p_234_1_.func_28101_a(null, 1003, p_234_2_, p_234_3_, p_234_4_, 0);
            } else
            if(!flag && func_35070_c(i))
            {
                p_234_1_.func_511_b(p_234_2_, p_234_3_, p_234_4_, i & -5);
                p_234_1_.func_28101_a(null, 1003, p_234_2_, p_234_3_, p_234_4_, 0);
            }
        }
    }

    public static boolean func_35070_c(int p_35070_0_)
    {
        return (p_35070_0_ & 4) != 0;
    }
}
