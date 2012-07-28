// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


class StructureStrongholdPieceWeight
{

    public Class field_35580_a;
    public final int field_35578_b;
    public int field_35579_c;
    public int field_35577_d;

    public StructureStrongholdPieceWeight(Class p_i442_1_, int p_i442_2_, int p_i442_3_)
    {
        field_35580_a = p_i442_1_;
        field_35578_b = p_i442_2_;
        field_35577_d = p_i442_3_;
    }

    public boolean func_35575_a(int p_35575_1_)
    {
        return field_35577_d == 0 || field_35579_c < field_35577_d;
    }

    public boolean func_35576_a()
    {
        return field_35577_d == 0 || field_35579_c < field_35577_d;
    }
}
