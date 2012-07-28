// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, World, Material, IBlockAccess, 
//            RailLogic, AxisAlignedBB, Vec3D, MovingObjectPosition

public class BlockRail extends Block
{

    private final boolean field_27034_a;

    public static final boolean func_27029_g(World p_27029_0_, int p_27029_1_, int p_27029_2_, int p_27029_3_)
    {
        int i = p_27029_0_.func_444_a(p_27029_1_, p_27029_2_, p_27029_3_);
        return i == Block.field_637_aH.field_573_bc || i == Block.field_9036_T.field_573_bc || i == Block.field_9034_U.field_573_bc;
    }

    public static final boolean func_27030_c(int p_27030_0_)
    {
        return p_27030_0_ == Block.field_637_aH.field_573_bc || p_27030_0_ == Block.field_9036_T.field_573_bc || p_27030_0_ == Block.field_9034_U.field_573_bc;
    }

    protected BlockRail(int p_i361_1_, int p_i361_2_, boolean p_i361_3_)
    {
        super(p_i361_1_, p_i361_2_, Material.field_513_n);
        field_27034_a = p_i361_3_;
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public boolean func_27028_d()
    {
        return field_27034_a;
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int i)
    {
        return null;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public MovingObjectPosition func_262_a(World p_262_1_, int p_262_2_, int p_262_3_, int p_262_4_, Vec3D p_262_5_, Vec3D p_262_6_)
    {
        func_233_a(p_262_1_, p_262_2_, p_262_3_, p_262_4_);
        return super.func_262_a(p_262_1_, p_262_2_, p_262_3_, p_262_4_, p_262_5_, p_262_6_);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        int i = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_);
        if(i >= 2 && i <= 5)
        {
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
        } else
        {
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        }
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(field_27034_a)
        {
            if(field_573_bc == Block.field_9036_T.field_573_bc && (p_22009_2_ & 8) == 0)
            {
                return field_575_bb - 16;
            }
        } else
        if(p_22009_2_ >= 6)
        {
            return field_575_bb - 16;
        }
        return field_575_bb;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public int func_40161_b()
    {
        return 9;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 1;
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return p_259_1_.func_445_d(p_259_2_, p_259_3_ - 1, p_259_4_);
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        if(!p_250_1_.field_792_x)
        {
            func_4038_g(p_250_1_, p_250_2_, p_250_3_, p_250_4_, true);
            if(field_573_bc == Block.field_9036_T.field_573_bc)
            {
                func_234_b(p_250_1_, p_250_2_, p_250_3_, p_250_4_, field_573_bc);
            }
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(p_234_1_.field_792_x)
        {
            return;
        }
        int i = p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_);
        int j = i;
        if(field_27034_a)
        {
            j &= 7;
        }
        boolean flag = false;
        if(!p_234_1_.func_445_d(p_234_2_, p_234_3_ - 1, p_234_4_))
        {
            flag = true;
        }
        if(j == 2 && !p_234_1_.func_445_d(p_234_2_ + 1, p_234_3_, p_234_4_))
        {
            flag = true;
        }
        if(j == 3 && !p_234_1_.func_445_d(p_234_2_ - 1, p_234_3_, p_234_4_))
        {
            flag = true;
        }
        if(j == 4 && !p_234_1_.func_445_d(p_234_2_, p_234_3_, p_234_4_ - 1))
        {
            flag = true;
        }
        if(j == 5 && !p_234_1_.func_445_d(p_234_2_, p_234_3_, p_234_4_ + 1))
        {
            flag = true;
        }
        if(flag)
        {
            func_247_a_(p_234_1_, p_234_2_, p_234_3_, p_234_4_, p_234_1_.func_446_b(p_234_2_, p_234_3_, p_234_4_), 0);
            p_234_1_.func_508_d(p_234_2_, p_234_3_, p_234_4_, 0);
        } else
        if(field_573_bc == Block.field_9036_T.field_573_bc)
        {
            boolean flag1 = p_234_1_.func_474_n(p_234_2_, p_234_3_, p_234_4_);
            flag1 = flag1 || func_27032_a(p_234_1_, p_234_2_, p_234_3_, p_234_4_, i, true, 0) || func_27032_a(p_234_1_, p_234_2_, p_234_3_, p_234_4_, i, false, 0);
            boolean flag2 = false;
            if(flag1 && (i & 8) == 0)
            {
                p_234_1_.func_511_b(p_234_2_, p_234_3_, p_234_4_, j | 8);
                flag2 = true;
            } else
            if(!flag1 && (i & 8) != 0)
            {
                p_234_1_.func_511_b(p_234_2_, p_234_3_, p_234_4_, j);
                flag2 = true;
            }
            if(flag2)
            {
                p_234_1_.func_449_g(p_234_2_, p_234_3_ - 1, p_234_4_, field_573_bc);
                if(j == 2 || j == 3 || j == 4 || j == 5)
                {
                    p_234_1_.func_449_g(p_234_2_, p_234_3_ + 1, p_234_4_, field_573_bc);
                }
            }
        } else
        if(p_234_5_ > 0 && Block.field_542_n[p_234_5_].func_225_d() && !field_27034_a && RailLogic.func_600_a(new RailLogic(this, p_234_1_, p_234_2_, p_234_3_, p_234_4_)) == 3)
        {
            func_4038_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_, false);
        }
    }

    private void func_4038_g(World p_4038_1_, int p_4038_2_, int p_4038_3_, int p_4038_4_, boolean p_4038_5_)
    {
        if(p_4038_1_.field_792_x)
        {
            return;
        } else
        {
            (new RailLogic(this, p_4038_1_, p_4038_2_, p_4038_3_, p_4038_4_)).func_596_a(p_4038_1_.func_474_n(p_4038_2_, p_4038_3_, p_4038_4_), p_4038_5_);
            return;
        }
    }

    private boolean func_27032_a(World p_27032_1_, int p_27032_2_, int p_27032_3_, int p_27032_4_, int p_27032_5_, boolean p_27032_6_, int p_27032_7_)
    {
        if(p_27032_7_ >= 8)
        {
            return false;
        }
        int i = p_27032_5_ & 7;
        boolean flag = true;
        switch(i)
        {
        case 0: // '\0'
            if(p_27032_6_)
            {
                p_27032_4_++;
            } else
            {
                p_27032_4_--;
            }
            break;

        case 1: // '\001'
            if(p_27032_6_)
            {
                p_27032_2_--;
            } else
            {
                p_27032_2_++;
            }
            break;

        case 2: // '\002'
            if(p_27032_6_)
            {
                p_27032_2_--;
            } else
            {
                p_27032_2_++;
                p_27032_3_++;
                flag = false;
            }
            i = 1;
            break;

        case 3: // '\003'
            if(p_27032_6_)
            {
                p_27032_2_--;
                p_27032_3_++;
                flag = false;
            } else
            {
                p_27032_2_++;
            }
            i = 1;
            break;

        case 4: // '\004'
            if(p_27032_6_)
            {
                p_27032_4_++;
            } else
            {
                p_27032_4_--;
                p_27032_3_++;
                flag = false;
            }
            i = 0;
            break;

        case 5: // '\005'
            if(p_27032_6_)
            {
                p_27032_4_++;
                p_27032_3_++;
                flag = false;
            } else
            {
                p_27032_4_--;
            }
            i = 0;
            break;
        }
        if(func_27031_a(p_27032_1_, p_27032_2_, p_27032_3_, p_27032_4_, p_27032_6_, p_27032_7_, i))
        {
            return true;
        }
        return flag && func_27031_a(p_27032_1_, p_27032_2_, p_27032_3_ - 1, p_27032_4_, p_27032_6_, p_27032_7_, i);
    }

    private boolean func_27031_a(World p_27031_1_, int p_27031_2_, int p_27031_3_, int p_27031_4_, boolean p_27031_5_, int p_27031_6_, int p_27031_7_)
    {
        int i = p_27031_1_.func_444_a(p_27031_2_, p_27031_3_, p_27031_4_);
        if(i == Block.field_9036_T.field_573_bc)
        {
            int j = p_27031_1_.func_446_b(p_27031_2_, p_27031_3_, p_27031_4_);
            int k = j & 7;
            if(p_27031_7_ == 1 && (k == 0 || k == 4 || k == 5))
            {
                return false;
            }
            if(p_27031_7_ == 0 && (k == 1 || k == 2 || k == 3))
            {
                return false;
            }
            if((j & 8) != 0)
            {
                if(p_27031_1_.func_474_n(p_27031_2_, p_27031_3_, p_27031_4_))
                {
                    return true;
                } else
                {
                    return func_27032_a(p_27031_1_, p_27031_2_, p_27031_3_, p_27031_4_, j, p_27031_5_, p_27031_6_ + 1);
                }
            }
        }
        return false;
    }

    public int func_31025_e()
    {
        return 0;
    }

    static boolean func_27033_a(BlockRail p_27033_0_)
    {
        return p_27033_0_.field_27034_a;
    }
}
