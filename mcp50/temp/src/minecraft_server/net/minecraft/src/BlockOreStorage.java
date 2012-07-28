// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockOreStorage extends Block
{

    public BlockOreStorage(int p_i337_1_, int p_i337_2_)
    {
        super(p_i337_1_, Material.field_522_e);
        field_575_bb = p_i337_2_;
    }

    public int func_241_a(int p_241_1_)
    {
        return field_575_bb;
    }
}
