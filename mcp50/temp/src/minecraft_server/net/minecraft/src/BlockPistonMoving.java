// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, World, TileEntityPiston, 
//            Block, Facing, AxisAlignedBB, IBlockAccess, 
//            TileEntity, EntityPlayer

public class BlockPistonMoving extends BlockContainer
{

    public BlockPistonMoving(int p_i491_1_)
    {
        super(p_i491_1_, Material.field_31062_B);
        func_237_c(-1F);
    }

    public TileEntity func_294_a_()
    {
        return null;
    }

    public void func_250_e(World world, int i, int j, int k)
    {
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        TileEntity tileentity = p_242_1_.func_451_k(p_242_2_, p_242_3_, p_242_4_);
        if(tileentity != null && (tileentity instanceof TileEntityPiston))
        {
            ((TileEntityPiston)tileentity).func_31011_k();
        } else
        {
            super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
        }
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int i)
    {
        return false;
    }

    public boolean func_28026_e(World p_28026_1_, int p_28026_2_, int p_28026_3_, int i, int j)
    {
        return false;
    }

    public int func_40161_b()
    {
        return -1;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(!p_246_1_.field_792_x && p_246_1_.func_451_k(p_246_2_, p_246_3_, p_246_4_) == null)
        {
            p_246_1_.func_508_d(p_246_2_, p_246_3_, p_246_4_, 0);
            return true;
        } else
        {
            return false;
        }
    }

    public int func_252_a(int p_252_1_, Random p_252_2_, int p_252_3_)
    {
        return 0;
    }

    public void func_227_a(World p_227_1_, int p_227_2_, int p_227_3_, int p_227_4_, int p_227_5_, float p_227_6_, int p_227_7_)
    {
        if(p_227_1_.field_792_x)
        {
            return;
        }
        TileEntityPiston tileentitypiston = func_31031_b(p_227_1_, p_227_2_, p_227_3_, p_227_4_);
        if(tileentitypiston == null)
        {
            return;
        } else
        {
            Block.field_542_n[tileentitypiston.func_31012_a()].func_247_a_(p_227_1_, p_227_2_, p_227_3_, p_227_4_, tileentitypiston.func_31005_e(), 0);
            return;
        }
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(!p_234_1_.field_792_x)
        {
            if(p_234_1_.func_451_k(p_234_2_, p_234_3_, p_234_4_) != null);
        }
    }

    public static TileEntity func_31030_a(int p_31030_0_, int p_31030_1_, int p_31030_2_, boolean p_31030_3_, boolean p_31030_4_)
    {
        return new TileEntityPiston(p_31030_0_, p_31030_1_, p_31030_2_, p_31030_3_, p_31030_4_);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        TileEntityPiston tileentitypiston = func_31031_b(p_248_1_, p_248_2_, p_248_3_, p_248_4_);
        if(tileentitypiston == null)
        {
            return null;
        }
        float f = tileentitypiston.func_31007_a(0.0F);
        if(tileentitypiston.func_31010_c())
        {
            f = 1.0F - f;
        }
        return func_31032_a(p_248_1_, p_248_2_, p_248_3_, p_248_4_, tileentitypiston.func_31012_a(), f, tileentitypiston.func_31008_d());
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        TileEntityPiston tileentitypiston = func_31031_b(p_233_1_, p_233_2_, p_233_3_, p_233_4_);
        if(tileentitypiston != null)
        {
            Block block = Block.field_542_n[tileentitypiston.func_31012_a()];
            if(block == null || block == this)
            {
                return;
            }
            block.func_233_a(p_233_1_, p_233_2_, p_233_3_, p_233_4_);
            float f = tileentitypiston.func_31007_a(0.0F);
            if(tileentitypiston.func_31010_c())
            {
                f = 1.0F - f;
            }
            int i = tileentitypiston.func_31008_d();
            field_567_bf = block.field_567_bf - (double)((float)Facing.field_31051_b[i] * f);
            field_565_bg = block.field_565_bg - (double)((float)Facing.field_31054_c[i] * f);
            field_563_bh = block.field_563_bh - (double)((float)Facing.field_31053_d[i] * f);
            field_561_bi = block.field_561_bi - (double)((float)Facing.field_31051_b[i] * f);
            field_559_bj = block.field_559_bj - (double)((float)Facing.field_31054_c[i] * f);
            field_557_bk = block.field_557_bk - (double)((float)Facing.field_31053_d[i] * f);
        }
    }

    public AxisAlignedBB func_31032_a(World p_31032_1_, int p_31032_2_, int p_31032_3_, int p_31032_4_, int p_31032_5_, float p_31032_6_, int p_31032_7_)
    {
        if(p_31032_5_ == 0 || p_31032_5_ == field_573_bc)
        {
            return null;
        }
        AxisAlignedBB axisalignedbb = Block.field_542_n[p_31032_5_].func_248_d(p_31032_1_, p_31032_2_, p_31032_3_, p_31032_4_);
        if(axisalignedbb == null)
        {
            return null;
        }
        if(Facing.field_31051_b[p_31032_7_] < 0)
        {
            axisalignedbb.field_964_a -= (float)Facing.field_31051_b[p_31032_7_] * p_31032_6_;
        } else
        {
            axisalignedbb.field_969_d -= (float)Facing.field_31051_b[p_31032_7_] * p_31032_6_;
        }
        if(Facing.field_31054_c[p_31032_7_] < 0)
        {
            axisalignedbb.field_963_b -= (float)Facing.field_31054_c[p_31032_7_] * p_31032_6_;
        } else
        {
            axisalignedbb.field_968_e -= (float)Facing.field_31054_c[p_31032_7_] * p_31032_6_;
        }
        if(Facing.field_31053_d[p_31032_7_] < 0)
        {
            axisalignedbb.field_970_c -= (float)Facing.field_31053_d[p_31032_7_] * p_31032_6_;
        } else
        {
            axisalignedbb.field_967_f -= (float)Facing.field_31053_d[p_31032_7_] * p_31032_6_;
        }
        return axisalignedbb;
    }

    private TileEntityPiston func_31031_b(IBlockAccess p_31031_1_, int p_31031_2_, int p_31031_3_, int p_31031_4_)
    {
        TileEntity tileentity = p_31031_1_.func_451_k(p_31031_2_, p_31031_3_, p_31031_4_);
        if(tileentity != null && (tileentity instanceof TileEntityPiston))
        {
            return (TileEntityPiston)tileentity;
        } else
        {
            return null;
        }
    }
}
