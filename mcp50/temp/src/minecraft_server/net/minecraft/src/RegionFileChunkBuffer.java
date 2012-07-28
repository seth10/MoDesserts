// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.ByteArrayOutputStream;

// Referenced classes of package net.minecraft.src:
//            RegionFile

class RegionFileChunkBuffer extends ByteArrayOutputStream
{

    private int field_22156_b;
    private int field_22158_c;
    final RegionFile field_22157_a; /* synthetic field */

    public RegionFileChunkBuffer(RegionFile p_i199_1_, int p_i199_2_, int p_i199_3_)
    {
        field_22157_a = p_i199_1_;
        super(8096);
        field_22156_b = p_i199_2_;
        field_22158_c = p_i199_3_;
    }

    public void close()
    {
        field_22157_a.func_22133_a(field_22156_b, field_22158_c, buf, count);
    }
}
