// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            WeightedRandomChoice

public class WeightedRandom
{

    public WeightedRandom()
    {
    }

    public static int func_35692_a(Collection p_35692_0_)
    {
        int i = 0;
        for(Iterator iterator = p_35692_0_.iterator(); iterator.hasNext();)
        {
            WeightedRandomChoice weightedrandomchoice = (WeightedRandomChoice)iterator.next();
            i += weightedrandomchoice.field_35483_d;
        }

        return i;
    }

    public static WeightedRandomChoice func_35693_a(Random p_35693_0_, Collection p_35693_1_, int p_35693_2_)
    {
        if(p_35693_2_ <= 0)
        {
            throw new IllegalArgumentException();
        }
        int i = p_35693_0_.nextInt(p_35693_2_);
        for(Iterator iterator = p_35693_1_.iterator(); iterator.hasNext();)
        {
            WeightedRandomChoice weightedrandomchoice = (WeightedRandomChoice)iterator.next();
            i -= weightedrandomchoice.field_35483_d;
            if(i < 0)
            {
                return weightedrandomchoice;
            }
        }

        return null;
    }

    public static WeightedRandomChoice func_35689_a(Random p_35689_0_, Collection p_35689_1_)
    {
        return func_35693_a(p_35689_0_, p_35689_1_, func_35692_a(p_35689_1_));
    }

    public static int func_35690_a(WeightedRandomChoice p_35690_0_[])
    {
        int i = 0;
        WeightedRandomChoice aweightedrandomchoice[] = p_35690_0_;
        int j = aweightedrandomchoice.length;
        for(int k = 0; k < j; k++)
        {
            WeightedRandomChoice weightedrandomchoice = aweightedrandomchoice[k];
            i += weightedrandomchoice.field_35483_d;
        }

        return i;
    }

    public static WeightedRandomChoice func_35688_a(Random p_35688_0_, WeightedRandomChoice p_35688_1_[], int p_35688_2_)
    {
        if(p_35688_2_ <= 0)
        {
            throw new IllegalArgumentException();
        }
        int i = p_35688_0_.nextInt(p_35688_2_);
        WeightedRandomChoice aweightedrandomchoice[] = p_35688_1_;
        int j = aweightedrandomchoice.length;
        for(int k = 0; k < j; k++)
        {
            WeightedRandomChoice weightedrandomchoice = aweightedrandomchoice[k];
            i -= weightedrandomchoice.field_35483_d;
            if(i < 0)
            {
                return weightedrandomchoice;
            }
        }

        return null;
    }

    public static WeightedRandomChoice func_35691_a(Random p_35691_0_, WeightedRandomChoice p_35691_1_[])
    {
        return func_35688_a(p_35691_0_, p_35691_1_, func_35690_a(p_35691_1_));
    }
}
