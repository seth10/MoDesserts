// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, BlockStairs, 
//            AxisAlignedBB, Vec3D, MovingObjectPosition

public class BlockTorch extends Block
{

    protected BlockTorch(int p_i521_1_, int p_i521_2_)
    {
        super(p_i521_1_, p_i521_2_, Material.field_513_n);
        func_231_a(true);
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

    public int func_40161_b()
    {
        return 2;
    }

    private boolean func_31028_g(World p_31028_1_, int p_31028_2_, int p_31028_3_, int p_31028_4_)
    {
        if(p_31028_1_.func_41047_b(p_31028_2_, p_31028_3_, p_31028_4_, true))
        {
            return true;
        }
        int i = p_31028_1_.func_444_a(p_31028_2_, p_31028_3_, p_31028_4_);
        if(i == Block.field_9050_aZ.field_573_bc || i == Block.field_40172_bC.field_573_bc || i == Block.field_4056_N.field_573_bc)
        {
            return true;
        }
        if(Block.field_542_n[i] != null && (Block.field_542_n[i] instanceof BlockStairs))
        {
            int j = p_31028_1_.func_446_b(p_31028_2_, p_31028_3_, p_31028_4_);
            if((4 & j) != 0)
            {
                return true;
            }
        }
        return false;
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        if(p_259_1_.func_41047_b(p_259_2_ - 1, p_259_3_, p_259_4_, true))
        {
            return true;
        }
        if(p_259_1_.func_41047_b(p_259_2_ + 1, p_259_3_, p_259_4_, true))
        {
            return true;
        }
        if(p_259_1_.func_41047_b(p_259_2_, p_259_3_, p_259_4_ - 1, true))
        {
            return true;
        }
        if(p_259_1_.func_41047_b(p_259_2_, p_259_3_, p_259_4_ + 1, true))
        {
            return true;
        }
        return func_31028_g(p_259_1_, p_259_2_, p_259_3_ - 1, p_259_4_);
    }

    public void func_255_c(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, int p_255_5_)
    {
        int i = p_255_1_.func_446_b(p_255_2_, p_255_3_, p_255_4_);
        if(p_255_5_ == 1 && func_31028_g(p_255_1_, p_255_2_, p_255_3_ - 1, p_255_4_))
        {
            i = 5;
        }
        if(p_255_5_ == 2 && p_255_1_.func_41047_b(p_255_2_, p_255_3_, p_255_4_ + 1, true))
        {
            i = 4;
        }
        if(p_255_5_ == 3 && p_255_1_.func_41047_b(p_255_2_, p_255_3_, p_255_4_ - 1, true))
        {
            i = 3;
        }
        if(p_255_5_ == 4 && p_255_1_.func_41047_b(p_255_2_ + 1, p_255_3_, p_255_4_, true))
        {
            i = 2;
        }
        if(p_255_5_ == 5 && p_255_1_.func_41047_b(p_255_2_ - 1, p_255_3_, p_255_4_, true))
        {
            i = 1;
        }
        p_255_1_.func_511_b(p_255_2_, p_255_3_, p_255_4_, i);
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        super.func_221_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_, p_221_5_);
        if(p_221_1_.func_446_b(p_221_2_, p_221_3_, p_221_4_) == 0)
        {
            func_250_e(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
        }
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        if(p_250_1_.func_41047_b(p_250_2_ - 1, p_250_3_, p_250_4_, true))
        {
            p_250_1_.func_511_b(p_250_2_, p_250_3_, p_250_4_, 1);
        } else
        if(p_250_1_.func_41047_b(p_250_2_ + 1, p_250_3_, p_250_4_, true))
        {
            p_250_1_.func_511_b(p_250_2_, p_250_3_, p_250_4_, 2);
        } else
        if(p_250_1_.func_41047_b(p_250_2_, p_250_3_, p_250_4_ - 1, true))
        {
            p_250_1_.func_511_b(p_250_2_, p_250_3_, p_250_4_, 3);
        } else
        if(p_250_1_.func_41047_b(p_250_2_, p_250_3_, p_250_4_ + 1, true))
        {
            p_250_1_.func_511_b(p_250_2_, p_250_3_, p_250_4_, 4);
        } else
        if(func_31028_g(p_250_1_, p_250_2_, p_250_3_ - 1, p_250_4_))
        {
            p_250_1_.func_511_b(p_250_2_, p_250_3_, p_250_4_, 5);
        }
        func_279_g(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(func_279_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_))
        {
            int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
            boolean flag = false;
            if(!p_234_1_.func_41047_b(p_234_2_ - 1, p_234_3_, p_234_4_, true) && i == 1)
            {
                flag = true;
            }
            if(!p_234_1_.func_41047_b(p_234_2_ + 1, p_234_3_, p_234_4_, true) && i == 2)
            {
                flag = true;
            }
            if(!p_234_1_.func_41047_b(p_234_2_, p_234_3_, p_234_4_ - 1, true) && i == 3)
            {
                flag = true;
            }
            if(!p_234_1_.func_41047_b(p_234_2_, p_234_3_, p_234_4_ + 1, true) && i == 4)
            {
                flag = true;
            }
            if(!func_31028_g(p_234_1_, p_234_2_, p_234_3_ - 1, p_234_4_) && i == 5)
            {
                flag = true;
            }
            if(flag)
            {
                func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_), 0);
                p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            }
        }
    }

    private boolean func_279_g(World p_279_1_, int p_279_2_, int p_279_3_, int p_279_4_)
    {
        if(!func_259_a(p_279_1_, p_279_2_, p_279_3_, p_279_4_))
        {
            if(p_279_1_.func_444_a(p_279_2_, p_279_3_, p_279_4_) == field_573_bc)
            {
                func_247_a_(p_279_1_, p_279_2_, p_279_3_, p_279_4_, p_279_1_.func_446_b(p_279_2_, p_279_3_, p_279_4_), 0);
                p_279_1_.func_508_d(p_279_2_, p_279_3_, p_279_4_, 0);
            }
            return false;
        } else
        {
            return true;
        }
    }

    public MovingObjectPosition func_262_a(World p_262_1_, int p_262_2_, int p_262_3_, int p_262_4_, Vec3D p_262_5_, Vec3D p_262_6_)
    {
        int i = p_262_1_.func_446_b(p_262_2_, p_262_3_, p_262_4_) & 7;
        float f = 0.15F;
        if(i == 1)
        {
            func_229_a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
        } else
        if(i == 2)
        {
            func_229_a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
        } else
        if(i == 3)
        {
            func_229_a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
        } else
        if(i == 4)
        {
            func_229_a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
        } else
        {
            float f1 = 0.1F;
            func_229_a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
        return super.func_262_a(p_262_1_, p_262_2_, p_262_3_, p_262_4_, p_262_5_, p_262_6_);
    }
}
