// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, World, 
//            AxisAlignedBB, EntityPlayer, Vec3D, MovingObjectPosition

public class BlockTrapDoor extends Block
{

    protected BlockTrapDoor(int p_i350_1_, Material p_i350_2_)
    {
        super(p_i350_1_, p_i350_2_);
        field_575_bb = 84;
        if(p_i350_2_ == Material.field_522_e)
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

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int p_48127_4_)
    {
        return !func_28038_d(p_48127_1_.func_446_b(p_48127_2_, p_48127_3_, p_48127_4_));
    }

    public int func_40161_b()
    {
        return 0;
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        func_233_a(p_248_1_, p_248_2_, p_248_3_, p_248_4_);
        return super.func_248_d(p_248_1_, p_248_2_, p_248_3_, p_248_4_);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        func_28039_c(p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_));
    }

    public void func_40163_f()
    {
        float f = 0.1875F;
        func_229_a(0.0F, 0.5F - f / 2.0F, 0.0F, 1.0F, 0.5F + f / 2.0F, 1.0F);
    }

    public void func_28039_c(int p_28039_1_)
    {
        float f = 0.1875F;
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
        if(func_28038_d(p_28039_1_))
        {
            if((p_28039_1_ & 3) == 0)
            {
                func_229_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            }
            if((p_28039_1_ & 3) == 1)
            {
                func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            }
            if((p_28039_1_ & 3) == 2)
            {
                func_229_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
            if((p_28039_1_ & 3) == 3)
            {
                func_229_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
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
        } else
        {
            int i = p_246_1_.func_446_b(p_246_2_, p_246_3_, p_246_4_);
            p_246_1_.func_511_b(p_246_2_, p_246_3_, p_246_4_, i ^ 4);
            p_246_1_.func_28101_a(p_246_5_, 1003, p_246_2_, p_246_3_, p_246_4_, 0);
            return true;
        }
    }

    public void func_28040_a(World p_28040_1_, int p_28040_2_, int p_28040_3_, int p_28040_4_, boolean p_28040_5_)
    {
        int i = p_28040_1_.func_446_b(p_28040_2_, p_28040_3_, p_28040_4_);
        boolean flag = (i & 4) > 0;
        if(flag == p_28040_5_)
        {
            return;
        } else
        {
            p_28040_1_.func_511_b(p_28040_2_, p_28040_3_, p_28040_4_, i ^ 4);
            p_28040_1_.func_28101_a(null, 1003, p_28040_2_, p_28040_3_, p_28040_4_, 0);
            return;
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(p_234_1_.field_792_x)
        {
            return;
        }
        int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
        int j = p_234_2_;
        int k = p_234_4_;
        if((i & 3) == 0)
        {
            k++;
        }
        if((i & 3) == 1)
        {
            k--;
        }
        if((i & 3) == 2)
        {
            j++;
        }
        if((i & 3) == 3)
        {
            j--;
        }
        if(!func_41006_g(p_234_1_.func_444_a(j, p_234_3_, k)))
        {
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
            func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, i, 0);
        }
        boolean flag = p_234_1_.func_474_n(p_234_2_, p_234_3_, p_234_4_);
        if(flag || p_234_5_ > 0 && Block.field_542_n[p_234_5_].func_225_d() || p_234_5_ == 0)
        {
            func_28040_a(p_234_1_, p_234_2_, p_234_3_, p_234_4_, flag);
        }
    }

    public MovingObjectPosition func_262_a(World p_262_1_, int p_262_2_, int p_262_3_, int p_262_4_, Vec3D p_262_5_, Vec3D p_262_6_)
    {
        func_233_a(p_262_1_, p_262_2_, p_262_3_, p_262_4_);
        return super.func_262_a(p_262_1_, p_262_2_, p_262_3_, p_262_4_, p_262_5_, p_262_6_);
    }

    public void func_255_c(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, int p_255_5_)
    {
        byte byte0 = 0;
        if(p_255_5_ == 2)
        {
            byte0 = 0;
        }
        if(p_255_5_ == 3)
        {
            byte0 = 1;
        }
        if(p_255_5_ == 4)
        {
            byte0 = 2;
        }
        if(p_255_5_ == 5)
        {
            byte0 = 3;
        }
        p_255_1_.func_511_b(p_255_2_, p_255_3_, p_255_4_, byte0);
    }

    public boolean func_28026_e(World p_28026_1_, int p_28026_2_, int p_28026_3_, int p_28026_4_, int p_28026_5_)
    {
        if(p_28026_5_ == 0)
        {
            return false;
        }
        if(p_28026_5_ == 1)
        {
            return false;
        }
        if(p_28026_5_ == 2)
        {
            p_28026_4_++;
        }
        if(p_28026_5_ == 3)
        {
            p_28026_4_--;
        }
        if(p_28026_5_ == 4)
        {
            p_28026_2_++;
        }
        if(p_28026_5_ == 5)
        {
            p_28026_2_--;
        }
        return func_41006_g(p_28026_1_.func_444_a(p_28026_2_, p_28026_3_, p_28026_4_));
    }

    public static boolean func_28038_d(int p_28038_0_)
    {
        return (p_28038_0_ & 4) != 0;
    }

    private static boolean func_41006_g(int p_41006_0_)
    {
        if(p_41006_0_ <= 0)
        {
            return false;
        } else
        {
            Block block = Block.field_542_n[p_41006_0_];
            return block != null && block.field_553_bn.func_28128_h() && block.func_28025_b() || block == Block.field_6065_bd;
        }
    }
}
