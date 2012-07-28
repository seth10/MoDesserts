// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EnumArmorMaterial

public class ItemArmor extends Item
{

    private static final int field_258_bb[] = {
        11, 16, 15, 13
    };
    public final int field_257_aX;
    public final int field_256_aY;
    public final int field_40252_bR;
    private final EnumArmorMaterial field_40251_bT;

    public ItemArmor(int p_i547_1_, EnumArmorMaterial p_i547_2_, int p_i547_3_, int p_i547_4_)
    {
        super(p_i547_1_);
        field_40251_bT = p_i547_2_;
        field_257_aX = p_i547_4_;
        field_40252_bR = p_i547_3_;
        field_256_aY = p_i547_2_.func_40495_b(p_i547_4_);
        func_21090_d(p_i547_2_.func_40497_a(p_i547_4_));
        field_233_aT = 1;
    }

    public int func_40224_c()
    {
        return field_40251_bT.func_40496_a();
    }

    static int[] func_40250_n()
    {
        return field_258_bb;
    }

}
