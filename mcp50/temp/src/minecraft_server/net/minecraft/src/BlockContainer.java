// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, World, TileEntity, Material

public abstract class BlockContainer extends Block
{

    protected BlockContainer(int p_i425_1_, Material p_i425_2_)
    {
        super(p_i425_1_, p_i425_2_);
        field_48128_bU = true;
    }

    protected BlockContainer(int p_i426_1_, int p_i426_2_, Material p_i426_3_)
    {
        super(p_i426_1_, p_i426_2_, p_i426_3_);
        field_48128_bU = true;
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        super.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        p_250_1_.func_473_a(p_250_2_, p_250_3_, p_250_4_, func_294_a_());
    }

    public void func_242_b(World p_242_1_, int p_242_2_, int p_242_3_, int p_242_4_)
    {
        super.func_242_b(p_242_1_, p_242_2_, p_242_3_, p_242_4_);
        p_242_1_.func_513_l(p_242_2_, p_242_3_, p_242_4_);
    }

    public abstract TileEntity func_294_a_();

    public void func_21024_a(World p_21024_1_, int p_21024_2_, int p_21024_3_, int p_21024_4_, int p_21024_5_, int p_21024_6_)
    {
        super.func_21024_a(p_21024_1_, p_21024_2_, p_21024_3_, p_21024_4_, p_21024_5_, p_21024_6_);
        TileEntity tileentity = p_21024_1_.func_451_k(p_21024_2_, p_21024_3_, p_21024_4_);
        if(tileentity != null)
        {
            tileentity.func_35163_b(p_21024_5_, p_21024_6_);
        }
    }
}
