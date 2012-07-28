// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Facing, EntityPlayer, 
//            World, TileEntityPiston, BlockPistonMoving, IBlockAccess, 
//            MathHelper, BlockContainer, BlockPistonExtension, EntityLiving, 
//            AxisAlignedBB

public class BlockPistonBase extends Block
{

    private boolean field_31044_a;
    private static boolean field_31043_b;

    public BlockPistonBase(int p_i236_1_, int p_i236_2_, boolean p_i236_3_)
    {
        super(p_i236_1_, p_i236_2_, Material.field_31062_B);
        field_31044_a = p_i236_3_;
        func_4026_a(field_9025_h);
        func_237_c(0.5F);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        int i = func_31042_c(p_22009_2_);
        if(i > 5)
        {
            return field_575_bb;
        }
        if(p_22009_1_ == i)
        {
            if(func_31035_d(p_22009_2_) || field_567_bf > 0.0D || field_565_bg > 0.0D || field_563_bh > 0.0D || field_561_bi < 1.0D || field_559_bj < 1.0D || field_557_bk < 1.0D)
            {
                return 110;
            } else
            {
                return field_575_bb;
            }
        }
        return p_22009_1_ != Facing.field_31052_a[i] ? 108 : 109;
    }

    public int func_40161_b()
    {
        return 16;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int i, EntityPlayer entityplayer)
    {
        return false;
    }

    public void func_4027_a(World p_4027_1_, int p_4027_2_, int p_4027_3_, int p_4027_4_, EntityLiving p_4027_5_)
    {
        int i = func_31037_c(p_4027_1_, p_4027_2_, p_4027_3_, p_4027_4_, (EntityPlayer)p_4027_5_);
        p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, i);
        if(!p_4027_1_.field_792_x && !field_31043_b)
        {
            func_31041_g(p_4027_1_, p_4027_2_, p_4027_3_, p_4027_4_);
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(!p_234_1_.field_792_x && !field_31043_b)
        {
            func_31041_g(p_234_1_, p_234_2_, p_234_3_, p_234_4_);
        }
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        if(!p_250_1_.field_792_x && p_250_1_.func_451_k(p_250_2_, p_250_3_, p_250_4_) == null && !field_31043_b)
        {
            func_31041_g(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        }
    }

    private void func_31041_g(World p_31041_1_, int p_31041_2_, int p_31041_3_, int p_31041_4_)
    {
        int i = p_31041_1_.func_446_b(p_31041_2_, p_31041_3_, p_31041_4_);
        int j = func_31042_c(i);
        boolean flag = func_31039_f(p_31041_1_, p_31041_2_, p_31041_3_, p_31041_4_, j);
        if(i == 7)
        {
            return;
        }
        if(flag && !func_31035_d(i))
        {
            if(func_31036_h(p_31041_1_, p_31041_2_, p_31041_3_, p_31041_4_, j))
            {
                p_31041_1_.func_463_c(p_31041_2_, p_31041_3_, p_31041_4_, j | 8);
                p_31041_1_.func_21117_c(p_31041_2_, p_31041_3_, p_31041_4_, 0, j);
            }
        } else
        if(!flag && func_31035_d(i))
        {
            p_31041_1_.func_463_c(p_31041_2_, p_31041_3_, p_31041_4_, j);
            p_31041_1_.func_21117_c(p_31041_2_, p_31041_3_, p_31041_4_, 1, j);
        }
    }

    private boolean func_31039_f(World p_31039_1_, int p_31039_2_, int p_31039_3_, int p_31039_4_, int p_31039_5_)
    {
        if(p_31039_5_ != 0 && p_31039_1_.func_489_j(p_31039_2_, p_31039_3_ - 1, p_31039_4_, 0))
        {
            return true;
        }
        if(p_31039_5_ != 1 && p_31039_1_.func_489_j(p_31039_2_, p_31039_3_ + 1, p_31039_4_, 1))
        {
            return true;
        }
        if(p_31039_5_ != 2 && p_31039_1_.func_489_j(p_31039_2_, p_31039_3_, p_31039_4_ - 1, 2))
        {
            return true;
        }
        if(p_31039_5_ != 3 && p_31039_1_.func_489_j(p_31039_2_, p_31039_3_, p_31039_4_ + 1, 3))
        {
            return true;
        }
        if(p_31039_5_ != 5 && p_31039_1_.func_489_j(p_31039_2_ + 1, p_31039_3_, p_31039_4_, 5))
        {
            return true;
        }
        if(p_31039_5_ != 4 && p_31039_1_.func_489_j(p_31039_2_ - 1, p_31039_3_, p_31039_4_, 4))
        {
            return true;
        }
        if(p_31039_1_.func_489_j(p_31039_2_, p_31039_3_, p_31039_4_, 0))
        {
            return true;
        }
        if(p_31039_1_.func_489_j(p_31039_2_, p_31039_3_ + 2, p_31039_4_, 1))
        {
            return true;
        }
        if(p_31039_1_.func_489_j(p_31039_2_, p_31039_3_ + 1, p_31039_4_ - 1, 2))
        {
            return true;
        }
        if(p_31039_1_.func_489_j(p_31039_2_, p_31039_3_ + 1, p_31039_4_ + 1, 3))
        {
            return true;
        }
        if(p_31039_1_.func_489_j(p_31039_2_ - 1, p_31039_3_ + 1, p_31039_4_, 4))
        {
            return true;
        }
        return p_31039_1_.func_489_j(p_31039_2_ + 1, p_31039_3_ + 1, p_31039_4_, 5);
    }

    public void func_21024_a(World p_21024_1_, int p_21024_2_, int p_21024_3_, int p_21024_4_, int p_21024_5_, int p_21024_6_)
    {
        field_31043_b = true;
        int i = p_21024_6_;
        if(p_21024_5_ == 0)
        {
            if(func_31038_i(p_21024_1_, p_21024_2_, p_21024_3_, p_21024_4_, i))
            {
                p_21024_1_.func_511_b(p_21024_2_, p_21024_3_, p_21024_4_, i | 8);
                p_21024_1_.func_502_a((double)p_21024_2_ + 0.5D, (double)p_21024_3_ + 0.5D, (double)p_21024_4_ + 0.5D, "tile.piston.out", 0.5F, p_21024_1_.field_803_m.nextFloat() * 0.25F + 0.6F);
            } else
            {
                p_21024_1_.func_463_c(p_21024_2_, p_21024_3_, p_21024_4_, i);
            }
        } else
        if(p_21024_5_ == 1)
        {
            TileEntity tileentity = p_21024_1_.func_451_k(p_21024_2_ + Facing.field_31051_b[i], p_21024_3_ + Facing.field_31054_c[i], p_21024_4_ + Facing.field_31053_d[i]);
            if(tileentity != null && (tileentity instanceof TileEntityPiston))
            {
                ((TileEntityPiston)tileentity).func_31011_k();
            }
            p_21024_1_.func_470_a(p_21024_2_, p_21024_3_, p_21024_4_, Block.field_9048_ac.field_573_bc, i);
            p_21024_1_.func_473_a(p_21024_2_, p_21024_3_, p_21024_4_, BlockPistonMoving.func_31030_a(field_573_bc, i, i, false, true));
            if(field_31044_a)
            {
                int j = p_21024_2_ + Facing.field_31051_b[i] * 2;
                int k = p_21024_3_ + Facing.field_31054_c[i] * 2;
                int l = p_21024_4_ + Facing.field_31053_d[i] * 2;
                int i1 = p_21024_1_.func_444_a(j, k, l);
                int j1 = p_21024_1_.func_446_b(j, k, l);
                boolean flag = false;
                if(i1 == Block.field_9048_ac.field_573_bc)
                {
                    TileEntity tileentity1 = p_21024_1_.func_451_k(j, k, l);
                    if(tileentity1 != null && (tileentity1 instanceof TileEntityPiston))
                    {
                        TileEntityPiston tileentitypiston = (TileEntityPiston)tileentity1;
                        if(tileentitypiston.func_31008_d() == i && tileentitypiston.func_31010_c())
                        {
                            tileentitypiston.func_31011_k();
                            i1 = tileentitypiston.func_31012_a();
                            j1 = tileentitypiston.func_31005_e();
                            flag = true;
                        }
                    }
                }
                if(!flag && i1 > 0 && func_31040_a(i1, p_21024_1_, j, k, l, false) && (Block.field_542_n[i1].func_31025_e() == 0 || i1 == Block.field_9029_Z.field_573_bc || i1 == Block.field_9033_V.field_573_bc))
                {
                    p_21024_2_ += Facing.field_31051_b[i];
                    p_21024_3_ += Facing.field_31054_c[i];
                    p_21024_4_ += Facing.field_31053_d[i];
                    p_21024_1_.func_470_a(p_21024_2_, p_21024_3_, p_21024_4_, Block.field_9048_ac.field_573_bc, j1);
                    p_21024_1_.func_473_a(p_21024_2_, p_21024_3_, p_21024_4_, BlockPistonMoving.func_31030_a(i1, j1, i, false, false));
                    field_31043_b = false;
                    p_21024_1_.func_508_d(j, k, l, 0);
                    field_31043_b = true;
                } else
                if(!flag)
                {
                    field_31043_b = false;
                    p_21024_1_.func_508_d(p_21024_2_ + Facing.field_31051_b[i], p_21024_3_ + Facing.field_31054_c[i], p_21024_4_ + Facing.field_31053_d[i], 0);
                    field_31043_b = true;
                }
            } else
            {
                field_31043_b = false;
                p_21024_1_.func_508_d(p_21024_2_ + Facing.field_31051_b[i], p_21024_3_ + Facing.field_31054_c[i], p_21024_4_ + Facing.field_31053_d[i], 0);
                field_31043_b = true;
            }
            p_21024_1_.func_502_a((double)p_21024_2_ + 0.5D, (double)p_21024_3_ + 0.5D, (double)p_21024_4_ + 0.5D, "tile.piston.in", 0.5F, p_21024_1_.field_803_m.nextFloat() * 0.15F + 0.6F);
        }
        field_31043_b = false;
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        int i = p_233_1_.func_446_b(p_233_2_, p_233_3_, p_233_4_);
        if(func_31035_d(i))
        {
            switch(func_31042_c(i))
            {
            case 0: // '\0'
                func_229_a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
                break;

            case 1: // '\001'
                func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
                break;

            case 2: // '\002'
                func_229_a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
                break;

            case 3: // '\003'
                func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
                break;

            case 4: // '\004'
                func_229_a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                break;

            case 5: // '\005'
                func_229_a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
                break;
            }
        } else
        {
            func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public void func_40163_f()
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_264_a(World p_264_1_, int p_264_2_, int p_264_3_, int p_264_4_, AxisAlignedBB p_264_5_, ArrayList p_264_6_)
    {
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        super.func_264_a(p_264_1_, p_264_2_, p_264_3_, p_264_4_, p_264_5_, p_264_6_);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        func_233_a(p_248_1_, p_248_2_, p_248_3_, p_248_4_);
        return super.func_248_d(p_248_1_, p_248_2_, p_248_3_, p_248_4_);
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public static int func_31042_c(int p_31042_0_)
    {
        return p_31042_0_ & 7;
    }

    public static boolean func_31035_d(int p_31035_0_)
    {
        return (p_31035_0_ & 8) != 0;
    }

    private static int func_31037_c(World p_31037_0_, int p_31037_1_, int p_31037_2_, int p_31037_3_, EntityPlayer p_31037_4_)
    {
        if(MathHelper.func_587_e((float)p_31037_4_.field_322_l - (float)p_31037_1_) < 2.0F && MathHelper.func_587_e((float)p_31037_4_.field_320_n - (float)p_31037_3_) < 2.0F)
        {
            double d = (p_31037_4_.field_321_m + 1.8200000000000001D) - (double)p_31037_4_.field_9076_H;
            if(d - (double)p_31037_2_ > 2D)
            {
                return 1;
            }
            if((double)p_31037_2_ - d > 0.0D)
            {
                return 0;
            }
        }
        int i = MathHelper.func_584_b((double)((p_31037_4_.field_316_r * 4F) / 360F) + 0.5D) & 3;
        if(i == 0)
        {
            return 2;
        }
        if(i == 1)
        {
            return 5;
        }
        if(i == 2)
        {
            return 3;
        }
        return i != 3 ? 0 : 4;
    }

    private static boolean func_31040_a(int p_31040_0_, World p_31040_1_, int p_31040_2_, int p_31040_3_, int p_31040_4_, boolean p_31040_5_)
    {
        if(p_31040_0_ == Block.field_602_aq.field_573_bc)
        {
            return false;
        }
        if(p_31040_0_ == Block.field_9029_Z.field_573_bc || p_31040_0_ == Block.field_9033_V.field_573_bc)
        {
            if(func_31035_d(p_31040_1_.func_446_b(p_31040_2_, p_31040_3_, p_31040_4_)))
            {
                return false;
            }
        } else
        {
            if(Block.field_542_n[p_31040_0_].func_31026_j() == -1F)
            {
                return false;
            }
            if(Block.field_542_n[p_31040_0_].func_31025_e() == 2)
            {
                return false;
            }
            if(!p_31040_5_ && Block.field_542_n[p_31040_0_].func_31025_e() == 1)
            {
                return false;
            }
        }
        return !(Block.field_542_n[p_31040_0_] instanceof BlockContainer);
    }

    private static boolean func_31036_h(World p_31036_0_, int p_31036_1_, int p_31036_2_, int p_31036_3_, int p_31036_4_)
    {
        int i = p_31036_1_ + Facing.field_31051_b[p_31036_4_];
        int j = p_31036_2_ + Facing.field_31054_c[p_31036_4_];
        int k = p_31036_3_ + Facing.field_31053_d[p_31036_4_];
        int l = 0;
        do
        {
            if(l >= 13)
            {
                break;
            }
            if(j <= 0 || j >= 255)
            {
                return false;
            }
            int i1 = p_31036_0_.func_444_a(i, j, k);
            if(i1 == 0)
            {
                break;
            }
            if(!func_31040_a(i1, p_31036_0_, i, j, k, true))
            {
                return false;
            }
            if(Block.field_542_n[i1].func_31025_e() == 1)
            {
                break;
            }
            if(l == 12)
            {
                return false;
            }
            i += Facing.field_31051_b[p_31036_4_];
            j += Facing.field_31054_c[p_31036_4_];
            k += Facing.field_31053_d[p_31036_4_];
            l++;
        } while(true);
        return true;
    }

    private boolean func_31038_i(World p_31038_1_, int p_31038_2_, int p_31038_3_, int p_31038_4_, int p_31038_5_)
    {
        int i = p_31038_2_ + Facing.field_31051_b[p_31038_5_];
        int j = p_31038_3_ + Facing.field_31054_c[p_31038_5_];
        int k = p_31038_4_ + Facing.field_31053_d[p_31038_5_];
        int l = 0;
        do
        {
            if(l >= 13)
            {
                break;
            }
            if(j <= 0 || j >= 255)
            {
                return false;
            }
            int j1 = p_31038_1_.func_444_a(i, j, k);
            if(j1 == 0)
            {
                break;
            }
            if(!func_31040_a(j1, p_31038_1_, i, j, k, true))
            {
                return false;
            }
            if(Block.field_542_n[j1].func_31025_e() == 1)
            {
                Block.field_542_n[j1].func_247_a_(p_31038_1_, i, j, k, p_31038_1_.func_446_b(i, j, k), 0);
                p_31038_1_.func_508_d(i, j, k, 0);
                break;
            }
            if(l == 12)
            {
                return false;
            }
            i += Facing.field_31051_b[p_31038_5_];
            j += Facing.field_31054_c[p_31038_5_];
            k += Facing.field_31053_d[p_31038_5_];
            l++;
        } while(true);
        int l1;
        for(; i != p_31038_2_ || j != p_31038_3_ || k != p_31038_4_; k = l1)
        {
            int i1 = i - Facing.field_31051_b[p_31038_5_];
            int k1 = j - Facing.field_31054_c[p_31038_5_];
            l1 = k - Facing.field_31053_d[p_31038_5_];
            int i2 = p_31038_1_.func_444_a(i1, k1, l1);
            int j2 = p_31038_1_.func_446_b(i1, k1, l1);
            if(i2 == field_573_bc && i1 == p_31038_2_ && k1 == p_31038_3_ && l1 == p_31038_4_)
            {
                p_31038_1_.func_470_a(i, j, k, Block.field_9048_ac.field_573_bc, p_31038_5_ | (field_31044_a ? 8 : 0));
                p_31038_1_.func_473_a(i, j, k, BlockPistonMoving.func_31030_a(Block.field_9049_aa.field_573_bc, p_31038_5_ | (field_31044_a ? 8 : 0), p_31038_5_, true, false));
            } else
            {
                p_31038_1_.func_470_a(i, j, k, Block.field_9048_ac.field_573_bc, j2);
                p_31038_1_.func_473_a(i, j, k, BlockPistonMoving.func_31030_a(i2, j2, p_31038_5_, true, false));
            }
            i = i1;
            j = k1;
        }

        return true;
    }
}
