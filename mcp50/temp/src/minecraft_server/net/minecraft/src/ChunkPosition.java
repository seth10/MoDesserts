// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Vec3D, MathHelper

public class ChunkPosition
{

    public final int field_846_a;
    public final int field_845_b;
    public final int field_847_c;

    public ChunkPosition(int p_i553_1_, int p_i553_2_, int p_i553_3_)
    {
        field_846_a = p_i553_1_;
        field_845_b = p_i553_2_;
        field_847_c = p_i553_3_;
    }

    public ChunkPosition(Vec3D p_i554_1_)
    {
        this(MathHelper.func_584_b(p_i554_1_.field_1055_a), MathHelper.func_584_b(p_i554_1_.field_1054_b), MathHelper.func_584_b(p_i554_1_.field_1058_c));
    }

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ instanceof ChunkPosition)
        {
            ChunkPosition chunkposition = (ChunkPosition)p_equals_1_;
            return chunkposition.field_846_a == field_846_a && chunkposition.field_845_b == field_845_b && chunkposition.field_847_c == field_847_c;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return field_846_a * 0x88f9fa + field_845_b * 0xef88b + field_847_c;
    }
}
