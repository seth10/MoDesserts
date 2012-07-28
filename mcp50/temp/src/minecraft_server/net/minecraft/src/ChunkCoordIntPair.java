// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, ChunkPosition

public class ChunkCoordIntPair
{

    public final int field_152_a;
    public final int field_151_b;

    public ChunkCoordIntPair(int p_i617_1_, int p_i617_2_)
    {
        field_152_a = p_i617_1_;
        field_151_b = p_i617_2_;
    }

    public static long func_22006_a(int p_22006_0_, int p_22006_1_)
    {
        long l = p_22006_0_;
        long l1 = p_22006_1_;
        return l & 0xffffffffL | (l1 & 0xffffffffL) << 32;
    }

    public int hashCode()
    {
        long l = func_22006_a(field_152_a, field_151_b);
        int i = (int)l;
        int j = (int)(l >> 32);
        return i ^ j;
    }

    public boolean equals(Object p_equals_1_)
    {
        ChunkCoordIntPair chunkcoordintpair = (ChunkCoordIntPair)p_equals_1_;
        return chunkcoordintpair.field_152_a == field_152_a && chunkcoordintpair.field_151_b == field_151_b;
    }

    public double func_48477_a(Entity p_48477_1_)
    {
        double d = field_152_a * 16 + 8;
        double d1 = field_151_b * 16 + 8;
        double d2 = d - p_48477_1_.field_322_l;
        double d3 = d1 - p_48477_1_.field_320_n;
        return d2 * d2 + d3 * d3;
    }

    public int func_40659_a()
    {
        return (field_152_a << 4) + 8;
    }

    public int func_40660_b()
    {
        return (field_151_b << 4) + 8;
    }

    public ChunkPosition func_40658_a(int p_40658_1_)
    {
        return new ChunkPosition(func_40659_a(), p_40658_1_, func_40660_b());
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(field_152_a).append(", ").append(field_151_b).append("]").toString();
    }
}
