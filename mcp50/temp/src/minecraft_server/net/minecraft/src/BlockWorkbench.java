// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material, World, EntityPlayer

public class BlockWorkbench extends Block
{

    protected BlockWorkbench(int p_i137_1_)
    {
        super(p_i137_1_, Material.field_524_c);
        field_575_bb = 59;
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 1)
        {
            return field_575_bb - 16;
        }
        if(p_241_1_ == 0)
        {
            return Block.field_531_y.func_241_a(0);
        }
        if(p_241_1_ == 2 || p_241_1_ == 4)
        {
            return field_575_bb + 1;
        } else
        {
            return field_575_bb;
        }
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_1_.field_792_x)
        {
            return true;
        } else
        {
            p_246_5_.func_174_A(p_246_2_, p_246_3_, p_246_4_);
            return true;
        }
    }
}
