// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EnumMovingObjectType, Vec3D, Entity

public class MovingObjectPosition
{

    public EnumMovingObjectType field_927_a;
    public int field_926_b;
    public int field_932_c;
    public int field_931_d;
    public int field_930_e;
    public Vec3D field_929_f;
    public Entity field_928_g;

    public MovingObjectPosition(int p_i509_1_, int p_i509_2_, int p_i509_3_, int p_i509_4_, Vec3D p_i509_5_)
    {
        field_927_a = EnumMovingObjectType.TILE;
        field_926_b = p_i509_1_;
        field_932_c = p_i509_2_;
        field_931_d = p_i509_3_;
        field_930_e = p_i509_4_;
        field_929_f = Vec3D.func_768_b(p_i509_5_.field_1055_a, p_i509_5_.field_1054_b, p_i509_5_.field_1058_c);
    }

    public MovingObjectPosition(Entity p_i510_1_)
    {
        field_927_a = EnumMovingObjectType.ENTITY;
        field_928_g = p_i510_1_;
        field_929_f = Vec3D.func_768_b(p_i510_1_.field_322_l, p_i510_1_.field_321_m, p_i510_1_.field_320_n);
    }
}
