// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material, AxisAlignedBB, IBlockAccess, 
//            World

public class BlockFence extends Block
{

    public BlockFence(int p_i241_1_, int p_i241_2_)
    {
        super(p_i241_1_, p_i241_2_, Material.field_524_c);
    }

    public BlockFence(int p_i242_1_, int p_i242_2_, Material p_i242_3_)
    {
        super(p_i242_1_, p_i242_2_, p_i242_3_);
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        return super.func_259_a(p_259_1_, p_259_2_, p_259_3_, p_259_4_);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        boolean flag = func_40177_b(p_248_1_, p_248_2_, p_248_3_, p_248_4_ - 1);
        boolean flag1 = func_40177_b(p_248_1_, p_248_2_, p_248_3_, p_248_4_ + 1);
        boolean flag2 = func_40177_b(p_248_1_, p_248_2_ - 1, p_248_3_, p_248_4_);
        boolean flag3 = func_40177_b(p_248_1_, p_248_2_ + 1, p_248_3_, p_248_4_);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;
        if(flag)
        {
            f2 = 0.0F;
        }
        if(flag1)
        {
            f3 = 1.0F;
        }
        if(flag2)
        {
            f = 0.0F;
        }
        if(flag3)
        {
            f1 = 1.0F;
        }
        return AxisAlignedBB.func_693_b((float)p_248_2_ + f, p_248_3_, (float)p_248_4_ + f2, (float)p_248_2_ + f1, (float)p_248_3_ + 1.5F, (float)p_248_4_ + f3);
    }

    public void func_233_a(IBlockAccess p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_)
    {
        boolean flag = func_40177_b(p_233_1_, p_233_2_, p_233_3_, p_233_4_ - 1);
        boolean flag1 = func_40177_b(p_233_1_, p_233_2_, p_233_3_, p_233_4_ + 1);
        boolean flag2 = func_40177_b(p_233_1_, p_233_2_ - 1, p_233_3_, p_233_4_);
        boolean flag3 = func_40177_b(p_233_1_, p_233_2_ + 1, p_233_3_, p_233_4_);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;
        if(flag)
        {
            f2 = 0.0F;
        }
        if(flag1)
        {
            f3 = 1.0F;
        }
        if(flag2)
        {
            f = 0.0F;
        }
        if(flag3)
        {
            f1 = 1.0F;
        }
        func_229_a(f, 0.0F, f2, f1, 1.0F, f3);
    }

    public boolean func_240_b()
    {
        return false;
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_48127_b(IBlockAccess p_48127_1_, int p_48127_2_, int p_48127_3_, int i)
    {
        return false;
    }

    public int func_40161_b()
    {
        return 11;
    }

    public boolean func_40177_b(IBlockAccess p_40177_1_, int p_40177_2_, int p_40177_3_, int p_40177_4_)
    {
        int i = p_40177_1_.func_444_a(p_40177_2_, p_40177_3_, p_40177_4_);
        if(i == field_573_bc || i == Block.field_35044_bw.field_573_bc)
        {
            return true;
        }
        Block block = Block.field_542_n[i];
        if(block != null && block.field_553_bn.func_28128_h() && block.func_28025_b())
        {
            return block.field_553_bn != Material.field_4213_w;
        } else
        {
            return false;
        }
    }
}
