// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material, AxisAlignedBB, Entity, 
//            World

public class BlockSoulSand extends Block
{

    public BlockSoulSand(int p_i336_1_, int p_i336_2_)
    {
        super(p_i336_1_, p_i336_2_, Material.field_514_m);
    }

    public AxisAlignedBB func_248_d(World p_248_1_, int p_248_2_, int p_248_3_, int p_248_4_)
    {
        float f = 0.125F;
        return AxisAlignedBB.func_693_b(p_248_2_, p_248_3_, p_248_4_, p_248_2_ + 1, (float)(p_248_3_ + 1) - f, p_248_4_ + 1);
    }

    public void func_263_a(World p_263_1_, int p_263_2_, int p_263_3_, int p_263_4_, Entity p_263_5_)
    {
        p_263_5_.field_319_o *= 0.40000000000000002D;
        p_263_5_.field_317_q *= 0.40000000000000002D;
    }
}
