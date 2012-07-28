// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StatList, AchievementMap, StatCollector, StatTypeSimple, 
//            StatTypeTime, StatTypeDistance, IStatType

public class StatBase
{

    public final int field_25063_d;
    private final String field_25062_e;
    public boolean field_27058_g;
    public String field_27057_h;
    private final IStatType field_25065_a;
    private static NumberFormat field_25066_b;
    public static IStatType field_27056_i = new StatTypeSimple();
    private static DecimalFormat field_25068_c = new DecimalFormat("########0.00");
    public static IStatType field_27055_j = new StatTypeTime();
    public static IStatType field_27054_k = new StatTypeDistance();

    public StatBase(int p_i528_1_, String p_i528_2_, IStatType p_i528_3_)
    {
        field_27058_g = false;
        field_25063_d = p_i528_1_;
        field_25062_e = p_i528_2_;
        field_25065_a = p_i528_3_;
    }

    public StatBase(int p_i529_1_, String p_i529_2_)
    {
        this(p_i529_1_, p_i529_2_, field_27056_i);
    }

    public StatBase func_27052_e()
    {
        field_27058_g = true;
        return this;
    }

    public StatBase func_27053_d()
    {
        if(StatList.field_25104_C.containsKey(Integer.valueOf(field_25063_d)))
        {
            throw new RuntimeException((new StringBuilder()).append("Duplicate stat id: \"").append(((StatBase)StatList.field_25104_C.get(Integer.valueOf(field_25063_d))).field_25062_e).append("\" and \"").append(field_25062_e).append("\" at id ").append(field_25063_d).toString());
        } else
        {
            StatList.field_25123_a.add(this);
            StatList.field_25104_C.put(Integer.valueOf(field_25063_d), this);
            field_27057_h = AchievementMap.func_25132_a(field_25063_d);
            return this;
        }
    }

    public String toString()
    {
        return StatCollector.func_25136_a(field_25062_e);
    }

    static 
    {
        field_25066_b = NumberFormat.getIntegerInstance(Locale.US);
    }
}
