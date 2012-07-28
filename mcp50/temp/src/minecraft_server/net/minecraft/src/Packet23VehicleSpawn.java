// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, MathHelper, NetHandler

public class Packet23VehicleSpawn extends Packet
{

    public int field_98_a;
    public int field_97_b;
    public int field_101_c;
    public int field_100_d;
    public int field_28044_e;
    public int field_28043_f;
    public int field_28042_g;
    public int field_99_e;
    public int field_28041_i;

    public Packet23VehicleSpawn()
    {
    }

    public Packet23VehicleSpawn(Entity p_i445_1_, int p_i445_2_)
    {
        this(p_i445_1_, p_i445_2_, 0);
    }

    public Packet23VehicleSpawn(Entity p_i446_1_, int p_i446_2_, int p_i446_3_)
    {
        field_98_a = p_i446_1_.field_331_c;
        field_97_b = MathHelper.func_584_b(p_i446_1_.field_322_l * 32D);
        field_101_c = MathHelper.func_584_b(p_i446_1_.field_321_m * 32D);
        field_100_d = MathHelper.func_584_b(p_i446_1_.field_320_n * 32D);
        field_99_e = p_i446_2_;
        field_28041_i = p_i446_3_;
        if(p_i446_3_ > 0)
        {
            double d = p_i446_1_.field_319_o;
            double d1 = p_i446_1_.field_318_p;
            double d2 = p_i446_1_.field_317_q;
            double d3 = 3.8999999999999999D;
            if(d < -d3)
            {
                d = -d3;
            }
            if(d1 < -d3)
            {
                d1 = -d3;
            }
            if(d2 < -d3)
            {
                d2 = -d3;
            }
            if(d > d3)
            {
                d = d3;
            }
            if(d1 > d3)
            {
                d1 = d3;
            }
            if(d2 > d3)
            {
                d2 = d3;
            }
            field_28044_e = (int)(d * 8000D);
            field_28043_f = (int)(d1 * 8000D);
            field_28042_g = (int)(d2 * 8000D);
        }
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_98_a = p_70_1_.readInt();
        field_99_e = p_70_1_.readByte();
        field_97_b = p_70_1_.readInt();
        field_101_c = p_70_1_.readInt();
        field_100_d = p_70_1_.readInt();
        field_28041_i = p_70_1_.readInt();
        if(field_28041_i > 0)
        {
            field_28044_e = p_70_1_.readShort();
            field_28043_f = p_70_1_.readShort();
            field_28042_g = p_70_1_.readShort();
        }
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_98_a);
        p_68_1_.writeByte(field_99_e);
        p_68_1_.writeInt(field_97_b);
        p_68_1_.writeInt(field_101_c);
        p_68_1_.writeInt(field_100_d);
        p_68_1_.writeInt(field_28041_i);
        if(field_28041_i > 0)
        {
            p_68_1_.writeShort(field_28044_e);
            p_68_1_.writeShort(field_28043_f);
            p_68_1_.writeShort(field_28042_g);
        }
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_4003_a(this);
    }

    public int func_71_a()
    {
        return 21 + field_28041_i <= 0 ? 0 : 6;
    }
}
