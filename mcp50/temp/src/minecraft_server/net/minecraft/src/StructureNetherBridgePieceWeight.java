// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


class StructureNetherBridgePieceWeight
{

    public Class field_40655_a;
    public final int field_40653_b;
    public int field_40654_c;
    public int field_40651_d;
    public boolean field_40652_e;

    public StructureNetherBridgePieceWeight(Class p_i448_1_, int p_i448_2_, int p_i448_3_, boolean p_i448_4_)
    {
        field_40655_a = p_i448_1_;
        field_40653_b = p_i448_2_;
        field_40651_d = p_i448_3_;
        field_40652_e = p_i448_4_;
    }

    public StructureNetherBridgePieceWeight(Class p_i449_1_, int p_i449_2_, int p_i449_3_)
    {
        this(p_i449_1_, p_i449_2_, p_i449_3_, false);
    }

    public boolean func_40649_a(int p_40649_1_)
    {
        return field_40651_d == 0 || field_40654_c < field_40651_d;
    }

    public boolean func_40650_a()
    {
        return field_40651_d == 0 || field_40654_c < field_40651_d;
    }
}
