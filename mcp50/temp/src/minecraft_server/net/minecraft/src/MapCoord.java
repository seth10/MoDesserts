// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            MapData

public class MapCoord
{

    public byte field_28202_a;
    public byte field_28201_b;
    public byte field_28205_c;
    public byte field_28204_d;
    final MapData field_28203_e; /* synthetic field */

    public MapCoord(MapData p_i26_1_, byte p_i26_2_, byte p_i26_3_, byte p_i26_4_, byte p_i26_5_)
    {
        field_28203_e = p_i26_1_;
        super();
        field_28202_a = p_i26_2_;
        field_28201_b = p_i26_3_;
        field_28205_c = p_i26_4_;
        field_28204_d = p_i26_5_;
    }
}
