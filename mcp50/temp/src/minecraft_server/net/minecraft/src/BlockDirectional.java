// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public abstract class BlockDirectional extends Block
{

    protected BlockDirectional(int p_i1006_1_, int p_i1006_2_, Material p_i1006_3_)
    {
        super(p_i1006_1_, p_i1006_2_, p_i1006_3_);
    }

    protected BlockDirectional(int p_i1007_1_, Material p_i1007_2_)
    {
        super(p_i1007_1_, p_i1007_2_);
    }

    public static int func_48132_b(int p_48132_0_)
    {
        return p_48132_0_ & 3;
    }
}
