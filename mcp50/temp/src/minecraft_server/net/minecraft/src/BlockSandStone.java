// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockSandStone extends Block
{

    public BlockSandStone(int p_i407_1_)
    {
        super(p_i407_1_, 192, Material.field_523_d);
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 1 || p_22009_1_ == 0 && (p_22009_2_ == 1 || p_22009_2_ == 2))
        {
            return 176;
        }
        if(p_22009_1_ == 0)
        {
            return 208;
        }
        if(p_22009_2_ == 1)
        {
            return 229;
        }
        return p_22009_2_ != 2 ? 192 : 230;
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 1)
        {
            return field_575_bb - 16;
        }
        if(p_241_1_ == 0)
        {
            return field_575_bb + 16;
        } else
        {
            return field_575_bb;
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_;
    }
}
