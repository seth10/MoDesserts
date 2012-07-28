// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Potion

public class PotionHealth extends Potion
{

    public PotionHealth(int p_i499_1_, boolean p_i499_2_, int p_i499_3_)
    {
        super(p_i499_1_, p_i499_2_, p_i499_3_);
    }

    public boolean func_40595_b()
    {
        return true;
    }

    public boolean func_35437_a(int p_35437_1_, int p_35437_2_)
    {
        return p_35437_1_ >= 1;
    }
}
