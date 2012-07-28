// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World

public class BlockLockedChest extends Block
{

    protected BlockLockedChest(int p_i252_1_)
    {
        super(p_i252_1_, Material.field_524_c);
        field_575_bb = 26;
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 1)
        {
            return field_575_bb - 1;
        }
        if(p_241_1_ == 0)
        {
            return field_575_bb - 1;
        }
        if(p_241_1_ == 3)
        {
            return field_575_bb + 1;
        } else
        {
            return field_575_bb;
        }
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int i)
    {
        return true;
    }

    public void func_221_a(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_, Random p_221_5_)
    {
        p_221_1_.func_508_d(p_221_2_, p_221_3_, p_221_4_, 0);
    }
}
