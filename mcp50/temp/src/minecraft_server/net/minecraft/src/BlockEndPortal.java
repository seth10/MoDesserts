// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, TileEntityEndPortal, Entity, EntityPlayer, 
//            World, WorldProvider, Material, TileEntity, 
//            IBlockAccess, AxisAlignedBB

public class BlockEndPortal extends BlockContainer
{

    public static boolean field_41003_a = false;

    protected BlockEndPortal(int p_i489_1_, Material p_i489_2_)
    {
        super(p_i489_1_, 0, p_i489_2_);
        func_224_a(1.0F);
    }

    public TileEntity func_294_a_()
    {
        return new TileEntityEndPortal();
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        float f = 0.0625F;
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
    }

    public void func_264_a(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, ArrayList arraylist)
    {
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public int func_244_a(Random p_244_1_)
    {
        return 0;
    }

    public void func_263_a(World p_263_1_, int p_263_2_, int p_263_3_, int p_263_4_, Entity p_263_5_)
    {
        if(p_263_5_.field_327_g == null && p_263_5_.field_328_f == null && (p_263_5_ instanceof EntityPlayer) && !p_263_1_.field_792_x)
        {
            ((EntityPlayer)p_263_5_).func_40107_e(1);
        }
    }

    public int func_40161_b()
    {
        return -1;
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        if(field_41003_a)
        {
            return;
        }
        if(p_250_1_.field_4272_q.field_6165_g != 0)
        {
            p_250_1_.func_508_d(p_250_2_, p_250_3_, p_250_4_, 0);
            return;
        } else
        {
            return;
        }
    }

}
