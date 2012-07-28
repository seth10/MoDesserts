// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, TileEntityEnchantmentTable, World, 
//            EntityPlayer, TileEntity

public class BlockEnchantmentTable extends BlockContainer
{

    protected BlockEnchantmentTable(int p_i163_1_)
    {
        super(p_i163_1_, 166, Material.field_523_d);
        func_229_a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
        func_258_c(0);
    }

    public boolean func_28025_b()
    {
        return false;
    }

    public boolean func_240_b()
    {
        return false;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        return func_241_a(p_22009_1_);
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 0)
        {
            return field_575_bb + 17;
        }
        if(p_241_1_ == 1)
        {
            return field_575_bb;
        } else
        {
            return field_575_bb + 16;
        }
    }

    public TileEntity func_294_a_()
    {
        return new TileEntityEnchantmentTable();
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_1_.field_792_x)
        {
            return true;
        } else
        {
            p_246_5_.func_40106_c(p_246_2_, p_246_3_, p_246_4_);
            return true;
        }
    }
}
