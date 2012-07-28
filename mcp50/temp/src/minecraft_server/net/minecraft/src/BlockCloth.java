// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockCloth extends Block
{

    public BlockCloth()
    {
        super(35, 64, Material.field_4217_k);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_2_ == 0)
        {
            return field_575_bb;
        } else
        {
            p_22009_2_ = ~(p_22009_2_ & 0xf);
            return 113 + ((p_22009_2_ & 8) >> 3) + (p_22009_2_ & 7) * 16;
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_;
    }

    public static int func_21033_c(int p_21033_0_)
    {
        return ~p_21033_0_ & 0xf;
    }

    public static int func_21034_d(int p_21034_0_)
    {
        return ~p_21034_0_ & 0xf;
    }
}
