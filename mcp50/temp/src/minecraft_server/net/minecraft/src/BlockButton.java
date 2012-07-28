// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, IBlockAccess, 
//            AxisAlignedBB, EntityPlayer

public class BlockButton extends Block
{

    protected BlockButton(int p_i344_1_, int p_i344_2_)
    {
        super(p_i344_1_, p_i344_2_, Material.field_513_n);
        func_231_a(true);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public int func_4028_b()
    {
        return 20;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_28026_e(World p_28026_1_, int p_28026_2_, int p_28026_3_, int p_28026_4_, int p_28026_5_)
    {
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
        return p_259_1_.func_445_d(p_259_2_, p_259_3_, p_259_4_ + 1);
    }

    public void func_255_c(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, int p_255_5_)
    {
        int i = p_255_1_.func_446_b(p_255_2_, p_255_3_, p_255_4_);
        int j = i & 8;
        i &= 7;
        if(p_255_5_ == 2 && p_255_1_.func_445_d(p_255_2_, p_255_3_, p_255_4_ + 1))
        {
            i = 4;
        } else
        if(p_255_5_ == 3 && p_255_1_.func_445_d(p_255_2_, p_255_3_, p_255_4_ - 1))
        {
            i = 3;
        } else
        if(p_255_5_ == 4 && p_255_1_.func_445_d(p_255_2_ + 1, p_255_3_, p_255_4_))
        {
            i = 2;
        } else
        if(p_255_5_ == 5 && p_255_1_.func_445_d(p_255_2_ - 1, p_255_3_, p_255_4_))
        {
            i = 1;
        } else
        {
            i = func_22026_g(p_255_1_, p_255_2_, p_255_3_, p_255_4_);
        }
        p_255_1_.func_511_b(p_255_2_, p_255_3_, p_255_4_, i + j);
    }

    private int func_22026_g(World p_22026_1_, int p_22026_2_, int p_22026_3_, int p_22026_4_)
    {
        if(p_22026_1_.func_445_d(p_22026_2_ - 1, p_22026_3_, p_22026_4_))
        {
            return 1;
        }
        if(p_22026_1_.func_445_d(p_22026_2_ + 1, p_22026_3_, p_22026_4_))
        {
            return 2;
        }
        if(p_22026_1_.func_445_d(p_22026_2_, p_22026_3_, p_22026_4_ - 1))
        {
            return 3;
        }
        return !p_22026_1_.func_445_d(p_22026_2_, p_22026_3_, p_22026_4_ + 1) ? 1 : 4;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(func_322_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_))
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
            if(flag)
            {
                func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_), 0);
                p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            }
        }
    }

    private boolean func_322_g(World p_322_1_, int p_322_2_, int p_322_3_, int p_322_4_)
    {
        if(!func_259_a(p_322_1_, p_322_2_, p_322_3_, p_322_4_))
        {
            func_247_a_(p_322_1_, p_322_2_, p_322_3_, p_322_4_, p_322_1_.func_446_b(p_322_2_, p_322_3_, p_322_4_), 0);
            p_322_1_.func_508_d(p_322_2_, p_322_3_, p_322_4_, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        int i = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_);
        int j = i & 7;
        boolean flag = (i & 8) > 0;
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.1875F;
        float f3 = 0.125F;
        if(flag)
        {
            f3 = 0.0625F;
        }
        if(j == 1)
        {
            func_229_a(0.0F, f, 0.5F - f2, f3, f1, 0.5F + f2);
        } else
        if(j == 2)
        {
            func_229_a(1.0F - f3, f, 0.5F - f2, 1.0F, f1, 0.5F + f2);
        } else
        if(j == 3)
        {
            func_229_a(0.5F - f2, f, 0.0F, 0.5F + f2, f1, f3);
        } else
        if(j == 4)
        {
            func_229_a(0.5F - f2, f, 1.0F - f3, 0.5F + f2, f1, 1.0F);
        }
    }

    public void func_235_b(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_, EntityPlayer p_235_5_)
    {
        func_246_a(p_235_1_, p_235_2_, p_235_3_, p_235_4_, p_235_5_);
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        int i = p_246_1_.func_446_b(p_246_2_, p_246_3_, p_246_4_);
        int j = i & 7;
        int k = 8 - (i & 8);
        if(k == 0)
        {
            return true;
        }
        p_246_1_.func_511_b(p_246_2_, p_246_3_, p_246_4_, j + k);
        p_246_1_.func_519_b(p_246_2_, p_246_3_, p_246_4_, p_246_2_, p_246_3_, p_246_4_);
        p_246_1_.func_502_a((double)p_246_2_ + 0.5D, (double)p_246_3_ + 0.5D, (double)p_246_4_ + 0.5D, "random.click", 0.3F, 0.6F);
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
        p_246_1_.func_22074_c(p_246_2_, p_246_3_, p_246_4_, field_573_bc, func_4028_b());
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
        }
        p_221_1_.func_511_b(p_221_2_, p_221_3_, p_221_4_, i & 7);
        p_221_1_.func_449_g(p_221_2_, p_221_3_, p_221_4_, field_573_bc);
        int j = i & 7;
        if(j == 1)
        {
            p_221_1_.func_449_g(p_221_2_ - 1, p_221_3_, p_221_4_, field_573_bc);
        } else
        if(j == 2)
        {
            p_221_1_.func_449_g(p_221_2_ + 1, p_221_3_, p_221_4_, field_573_bc);
        } else
        if(j == 3)
        {
            p_221_1_.func_449_g(p_221_2_, p_221_3_, p_221_4_ - 1, field_573_bc);
        } else
        if(j == 4)
        {
            p_221_1_.func_449_g(p_221_2_, p_221_3_, p_221_4_ + 1, field_573_bc);
        } else
        {
            p_221_1_.func_449_g(p_221_2_, p_221_3_ - 1, p_221_4_, field_573_bc);
        }
        p_221_1_.func_502_a((double)p_221_2_ + 0.5D, (double)p_221_3_ + 0.5D, (double)p_221_4_ + 0.5D, "random.click", 0.3F, 0.5F);
        p_221_1_.func_519_b(p_221_2_, p_221_3_, p_221_4_, p_221_2_, p_221_3_, p_221_4_);
    }

    public void func_40163_f()
    {
        float f = 0.1875F;
        float f1 = 0.125F;
        float f2 = 0.125F;
        func_229_a(0.5F - f, 0.5F - f1, 0.5F - f2, 0.5F + f, 0.5F + f1, 0.5F + f2);
    }
}
