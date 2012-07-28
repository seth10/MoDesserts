// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class VillageDoorInfo
{

    public final int field_48493_a;
    public final int field_48491_b;
    public final int field_48492_c;
    public final int field_48489_d;
    public final int field_48490_e;
    public int field_48487_f;
    public boolean field_48488_g;
    private int field_48494_h;

    public VillageDoorInfo(int p_i1060_1_, int p_i1060_2_, int p_i1060_3_, int p_i1060_4_, int p_i1060_5_, int p_i1060_6_)
    {
        field_48488_g = false;
        field_48494_h = 0;
        field_48493_a = p_i1060_1_;
        field_48491_b = p_i1060_2_;
        field_48492_c = p_i1060_3_;
        field_48489_d = p_i1060_4_;
        field_48490_e = p_i1060_5_;
        field_48487_f = p_i1060_6_;
    }

    public int func_48481_a(int p_48481_1_, int p_48481_2_, int p_48481_3_)
    {
        int i = p_48481_1_ - field_48493_a;
        int j = p_48481_2_ - field_48491_b;
        int k = p_48481_3_ - field_48492_c;
        return i * i + j * j + k * k;
    }

    public int func_48486_b(int p_48486_1_, int p_48486_2_, int p_48486_3_)
    {
        int i = p_48486_1_ - field_48493_a - field_48489_d;
        int j = p_48486_2_ - field_48491_b;
        int k = p_48486_3_ - field_48492_c - field_48490_e;
        return i * i + j * j + k * k;
    }

    public int func_48483_a()
    {
        return field_48493_a + field_48489_d;
    }

    public int func_48485_b()
    {
        return field_48491_b;
    }

    public int func_48484_c()
    {
        return field_48492_c + field_48490_e;
    }

    public boolean func_48479_a(int p_48479_1_, int p_48479_2_)
    {
        int i = p_48479_1_ - field_48493_a;
        int j = p_48479_2_ - field_48492_c;
        return i * field_48489_d + j * field_48490_e >= 0;
    }

    public void func_48478_d()
    {
        field_48494_h = 0;
    }

    public void func_48482_e()
    {
        field_48494_h++;
    }

    public int func_48480_f()
    {
        return field_48494_h;
    }
}
