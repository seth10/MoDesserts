// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class ChunkCoordinates
    implements Comparable
{

    public int field_22216_a;
    public int field_529_a;
    public int field_528_b;

    public ChunkCoordinates()
    {
    }

    public ChunkCoordinates(int p_i45_1_, int p_i45_2_, int p_i45_3_)
    {
        field_22216_a = p_i45_1_;
        field_529_a = p_i45_2_;
        field_528_b = p_i45_3_;
    }

    public ChunkCoordinates(ChunkCoordinates p_i46_1_)
    {
        field_22216_a = p_i46_1_.field_22216_a;
        field_529_a = p_i46_1_.field_529_a;
        field_528_b = p_i46_1_.field_528_b;
    }

    public boolean equals(Object p_equals_1_)
    {
        if(!(p_equals_1_ instanceof ChunkCoordinates))
        {
            return false;
        } else
        {
            ChunkCoordinates chunkcoordinates = (ChunkCoordinates)p_equals_1_;
            return field_22216_a == chunkcoordinates.field_22216_a && field_529_a == chunkcoordinates.field_529_a && field_528_b == chunkcoordinates.field_528_b;
        }
    }

    public int hashCode()
    {
        return field_22216_a + field_528_b << 8 + field_529_a << 16;
    }

    public int func_22215_a(ChunkCoordinates p_22215_1_)
    {
        if(field_529_a == p_22215_1_.field_529_a)
        {
            if(field_528_b == p_22215_1_.field_528_b)
            {
                return field_22216_a - p_22215_1_.field_22216_a;
            } else
            {
                return field_528_b - p_22215_1_.field_528_b;
            }
        } else
        {
            return field_529_a - p_22215_1_.field_529_a;
        }
    }

    public void func_48474_a(int p_48474_1_, int p_48474_2_, int p_48474_3_)
    {
        field_22216_a = p_48474_1_;
        field_529_a = p_48474_2_;
        field_528_b = p_48474_3_;
    }

    public double func_27127_a(int p_27127_1_, int p_27127_2_, int p_27127_3_)
    {
        int i = field_22216_a - p_27127_1_;
        int j = field_529_a - p_27127_2_;
        int k = field_528_b - p_27127_3_;
        return Math.sqrt(i * i + j * j + k * k);
    }

    public float func_48473_c(int p_48473_1_, int p_48473_2_, int p_48473_3_)
    {
        int i = field_22216_a - p_48473_1_;
        int j = field_529_a - p_48473_2_;
        int k = field_528_b - p_48473_3_;
        return (float)(i * i + j * j + k * k);
    }

    public int compareTo(Object p_compareTo_1_)
    {
        return func_22215_a((ChunkCoordinates)p_compareTo_1_);
    }
}
