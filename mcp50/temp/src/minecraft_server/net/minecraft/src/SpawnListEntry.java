// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WeightedRandomChoice

public class SpawnListEntry extends WeightedRandomChoice
{

    public Class field_25145_a;
    public int field_35484_b;
    public int field_35485_c;

    public SpawnListEntry(Class p_i37_1_, int p_i37_2_, int p_i37_3_, int p_i37_4_)
    {
        super(p_i37_2_);
        field_25145_a = p_i37_1_;
        field_35484_b = p_i37_3_;
        field_35485_c = p_i37_4_;
    }
}
