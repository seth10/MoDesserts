// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockBreakable extends Block
{

    private boolean field_6084_a;

    protected BlockBreakable(int p_i234_1_, int p_i234_2_, Material p_i234_3_, boolean p_i234_4_)
    {
        super(p_i234_1_, p_i234_2_, p_i234_3_);
        field_6084_a = p_i234_4_;
    }

    public boolean func_240_b()
    {
        return false;
    }
}
