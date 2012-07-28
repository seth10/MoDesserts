// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class StructureVillagePieceWeight
{

    public Class field_35496_a;
    public final int field_35494_b;
    public int field_35495_c;
    public int field_35493_d;

    public StructureVillagePieceWeight(Class p_i122_1_, int p_i122_2_, int p_i122_3_)
    {
        field_35496_a = p_i122_1_;
        field_35494_b = p_i122_2_;
        field_35493_d = p_i122_3_;
    }

    public boolean func_35491_a(int p_35491_1_)
    {
        return field_35493_d == 0 || field_35495_c < field_35493_d;
    }

    public boolean func_35492_a()
    {
        return field_35493_d == 0 || field_35495_c < field_35493_d;
    }
}
