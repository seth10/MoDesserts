// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, BiomeCache, WorldChunkManager

public class BiomeCacheBlock
{

    public float field_35707_a[];
    public float field_35705_b[];
    public BiomeGenBase field_35706_c[];
    public int field_35703_d;
    public int field_35704_e;
    public long field_35701_f;
    final BiomeCache field_35702_g; /* synthetic field */

    public BiomeCacheBlock(BiomeCache p_i482_1_, int p_i482_2_, int p_i482_3_)
    {
        field_35702_g = p_i482_1_;
        super();
        field_35707_a = new float[256];
        field_35705_b = new float[256];
        field_35706_c = new BiomeGenBase[256];
        field_35703_d = p_i482_2_;
        field_35704_e = p_i482_3_;
        BiomeCache.func_35679_a(p_i482_1_).func_4068_a(field_35707_a, p_i482_2_ << 4, p_i482_3_ << 4, 16, 16);
        BiomeCache.func_35679_a(p_i482_1_).func_4065_a(field_35705_b, p_i482_2_ << 4, p_i482_3_ << 4, 16, 16);
        BiomeCache.func_35679_a(p_i482_1_).func_35140_a(field_35706_c, p_i482_2_ << 4, p_i482_3_ << 4, 16, 16, false);
    }

    public BiomeGenBase func_35700_a(int p_35700_1_, int p_35700_2_)
    {
        return field_35706_c[p_35700_1_ & 0xf | (p_35700_2_ & 0xf) << 4];
    }
}
