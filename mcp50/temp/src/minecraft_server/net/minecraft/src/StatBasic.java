// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            StatBase, StatList, IStatType

public class StatBasic extends StatBase
{

    public StatBasic(int p_i596_1_, String p_i596_2_, IStatType p_i596_3_)
    {
        super(p_i596_1_, p_i596_2_, p_i596_3_);
    }

    public StatBasic(int p_i597_1_, String p_i597_2_)
    {
        super(p_i597_1_, p_i597_2_);
    }

    public StatBase func_27053_d()
    {
        super.func_27053_d();
        StatList.field_25122_b.add(this);
        return this;
    }
}
