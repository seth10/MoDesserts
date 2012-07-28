// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class StepSound
{

    public final String field_1029_a;
    public final float field_1028_b;
    public final float field_1030_c;

    public StepSound(String p_i80_1_, float p_i80_2_, float p_i80_3_)
    {
        field_1029_a = p_i80_1_;
        field_1028_b = p_i80_2_;
        field_1030_c = p_i80_3_;
    }

    public float func_738_a()
    {
        return field_1028_b;
    }

    public float func_739_b()
    {
        return field_1030_c;
    }

    public String func_737_c()
    {
        return (new StringBuilder()).append("step.").append(field_1029_a).toString();
    }
}
