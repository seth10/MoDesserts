// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, IBlockAccess, 
//            AxisAlignedBB, EntityPlayer

public class BlockLever extends Block
{

    protected BlockLever(int p_i585_1_, int p_i585_2_)
    {
        super(p_i585_1_, p_i585_2_, Material.field_513_n);
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
        return 12;
    }

    public boolean func_28026_e(World p_28026_1_, int p_28026_2_, int p_28026_3_, int p_28026_4_, int p_28026_5_)
    {
        if(p_28026_5_ == 1 && p_28026_1_.func_445_d(p_28026_2_, p_28026_3_ - 1, p_28026_4_))
        {
            return true;
        }
        if(p_28026_5_ == 2 && p_28026_1_.func_445_d(p_28026_2_, p_28026_3_, p_28026_4_ + 1))
        {
            return true;
        }
        if(p_28026_5_ == 3 && p_28026_1_.func_445_d(p_28026_2_, p_28026_3_, p_28026_4_ - 1))
        {
            return true;
        }
        if(p_28026_5_ == 4 && p_28026_1_.func_445_d(p_28026_2_ + 1, p_28026_3_, p_28026_4_))
        {
            return true;
        }
        return p_28026_5_ == 5 && p_28026_1_.func_445_d(p_28026_2_ - 1, p_28026_3_, p_28026_4_);
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        if(p_259_1_.func_445_d(p_259_2_ - 1, p_259_3_, p_259_4_))
        {
            return true;
        }
        if(p_259_1_.func_445_d(p_259_2_ + 1, p_259_3_, p_259_4_))
        {
            return true;
        }
        if(p_259_1_.func_445_d(p_259_2_, p_259_3_, p_259_4_ - 1))
        {
            return true;
        }
        if(p_259_1_.func_445_d(p_259_2_, p_259_3_, p_259_4_ + 1))
        {
            return true;
        }
        return p_259_1_.func_445_d(p_259_2_, p_259_3_ - 1, p_259_4_);
    }

    public void func_255_c(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, int p_255_5_)
    {
        int i = p_255_1_.func_446_b(p_255_2_, p_255_3_, p_255_4_);
        int j = i & 8;
        i &= 7;
        i = -1;
        if(p_255_5_ == 1 && p_255_1_.func_445_d(p_255_2_, p_255_3_ - 1, p_255_4_))
        {
            i = 5 + p_255_1_.field_803_m.nextInt(2);
        }
        if(p_255_5_ == 2 && p_255_1_.func_445_d(p_255_2_, p_255_3_, p_255_4_ + 1))
        {
            i = 4;
        }
        if(p_255_5_ == 3 && p_255_1_.func_445_d(p_255_2_, p_255_3_, p_255_4_ - 1))
        {
            i = 3;
        }
        if(p_255_5_ == 4 && p_255_1_.func_445_d(p_255_2_ + 1, p_255_3_, p_255_4_))
        {
            i = 2;
        }
        if(p_255_5_ == 5 && p_255_1_.func_445_d(p_255_2_ - 1, p_255_3_, p_255_4_))
        {
            i = 1;
        }
        if(i == -1)
        {
            func_247_a_(p_255_1_, p_255_2_, p_255_3_, p_255_4_, p_255_1_.func_446_b(p_255_2_, p_255_3_, p_255_4_), 0);
            p_255_1_.func_508_d(p_255_2_, p_255_3_, p_255_4_, 0);
            return;
        } else
        {
            p_255_1_.func_511_b(p_255_2_, p_255_3_, p_255_4_, i + j);
            return;
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(func_274_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_))
        {
            int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_) & 7;
            boolean flag = false;
            if(!p_234_1_.func_445_d(p_234_2_ - 1, p_234_3_, p_234_4_) && i == 1)
            {
                flag = true;
            }
            if(!p_234_1_.func_445_d(p_234_2_ + 1, p_234_3_, p_234_4_) && i == 2)
            {
                flag = true;
            }
            if(!p_234_1_.func_445_d(p_234_2_, p_234_3_, p_234_4_ - 1) && i == 3)
            {
                flag = true;
            }
            if(!p_234_1_.func_445_d(p_234_2_, p_234_3_, p_234_4_ + 1) && i == 4)
            {
                flag = true;
            }
            if(!p_234_1_.func_445_d(p_234_2_, p_234_3_ - 1, p_234_4_) && i == 5)
            {
                flag = true;
            }
            if(!p_234_1_.func_445_d(p_234_2_, p_234_3_ - 1, p_234_4_) && i == 6)
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

    private boolean func_274_g(World p_274_1_, int p_274_2_, int p_274_3_, int p_274_4_)
    {
        if(!func_259_a(p_274_1_, p_274_2_, p_274_3_, p_274_4_))
        {
            func_247_a_(p_274_1_, p_274_2_, p_274_3_, p_274_4_, p_274_1_.func_446_b(p_274_2_, p_274_3_, p_274_4_), 0);
            p_274_1_.func_508_d(p_274_2_, p_274_3_, p_274_4_, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        int i = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_) & 7;
        float f = 0.1875F;
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
            float f1 = 0.25F;
            func_229_a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
    }

    public void func_235_b(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_, EntityPlayer p_235_5_)
    {
        func_246_a(p_235_1_, p_235_2_, p_235_3_, p_235_4_, p_235_5_);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_1_.field_792_x)
        {
            return true;
        }
        int i = p_246_1_.func_446_b(p_246_2_, p_246_3_, p_246_4_);
        int j = i & 7;
        int k = 8 - (i & 8);
        p_246_1_.func_511_b(p_246_2_, p_246_3_, p_246_4_, j + k);
        p_246_1_.func_519_b(p_246_2_, p_246_3_, p_246_4_, p_246_2_, p_246_3_, p_246_4_);
        p_246_1_.func_502_a((double)p_246_2_ + 0.5D, (double)p_246_3_ + 0.5D, (double)p_246_4_ + 0.5D, "random.click", 0.3F, k <= 0 ? 0.5F : 0.6F);
        p_246_1_.func_449_g(p_246_2_, p_246_3_, p_246_4_, field_573_bc);
        if(j == 1)
        {
            p_246_1_.func_449_g(p_246_2_ - 1, p_246_3_, p_246_4_, field_573_bc);
        } else
        if(j == 2)
        {
            p_246_1_.func_449_g(p_246_2_ + 1, p_246_3_, p_246_4_, field_573_bc);
        } else
        if(j == 3)
        {
            p_246_1_.func_449_g(p_246_2_, p_246_3_, p_246_4_ - 1, field_573_bc);
        } else
        if(j == 4)
        {
            p_246_1_.func_449_g(p_246_2_, p_246_3_, p_246_4_ + 1, field_573_bc);
        } else
        {
            p_246_1_.func_449_g(p_246_2_, p_246_3_ - 1, p_246_4_, field_573_bc);
        }
        return true;
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        int i = p_242_1_.func_446_b(p_242_2_, p_242_3_, p_242_4_);
        if((i & 8) > 0)
        {
            p_242_1_.func_449_g(p_242_2_, p_242_3_, p_242_4_, field_573_bc);
            int j = i & 7;
            if(j == 1)
            {
                p_242_1_.func_449_g(p_242_2_ - 1, p_242_3_, p_242_4_, field_573_bc);
            } else
            if(j == 2)
            {
                p_242_1_.func_449_g(p_242_2_ + 1, p_242_3_, p_242_4_, field_573_bc);
            } else
            if(j == 3)
            {
                p_242_1_.func_449_g(p_242_2_, p_242_3_, p_242_4_ - 1, field_573_bc);
            } else
            if(j == 4)
            {
                p_242_1_.func_449_g(p_242_2_, p_242_3_, p_242_4_ + 1, field_573_bc);
            } else
            {
                p_242_1_.func_449_g(p_242_2_, p_242_3_ - 1, p_242_4_, field_573_bc);
            }
        }
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
    }

    public boolean func_239_b(IBlockAccess p_239_1_, int p_239_2_, int p_239_3_, int p_239_4_, int p_239_5_)
    {
        return (p_239_1_.func_446_b(p_239_2_, p_239_3_, p_239_4_) & 8) > 0;
    }

    public boolean func_238_d(World p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_, int p_238_5_)
    {
        int i = p_238_1_.func_446_b(p_238_2_, p_238_3_, p_238_4_);
        if((i & 8) == 0)
        {
            return false;
        }
        int j = i & 7;
        if(j == 6 && p_238_5_ == 1)
        {
            return true;
        }
        if(j == 5 && p_238_5_ == 1)
        {
            return true;
        }
        if(j == 4 && p_238_5_ == 2)
        {
            return true;
        }
        if(j == 3 && p_238_5_ == 3)
        {
            return true;
        }
        if(j == 2 && p_238_5_ == 4)
        {
            return true;
        }
        return j == 1 && p_238_5_ == 5;
    }

    public boolean func_225_d()
    {
        return true;
    }
}
