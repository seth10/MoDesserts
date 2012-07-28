// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, NetHandler

public class Packet28EntityVelocity extends Packet
{

    public int field_6040_a;
    public int field_6039_b;
    public int field_6042_c;
    public int field_6041_d;

    public Packet28EntityVelocity()
    {
    }

    public Packet28EntityVelocity(Entity p_i166_1_)
    {
        this(p_i166_1_.field_331_c, p_i166_1_.field_319_o, p_i166_1_.field_318_p, p_i166_1_.field_317_q);
    }

    public Packet28EntityVelocity(int p_i167_1_, double p_i167_2_, double p_i167_4_, double p_i167_6_)
    {
        field_6040_a = p_i167_1_;
        double d = 3.8999999999999999D;
        if(p_i167_2_ < -d)
        {
            p_i167_2_ = -d;
        }
        if(p_i167_4_ < -d)
        {
            p_i167_4_ = -d;
        }
        if(p_i167_6_ < -d)
        {
            p_i167_6_ = -d;
        }
        if(p_i167_2_ > d)
        {
            p_i167_2_ = d;
        }
        if(p_i167_4_ > d)
        {
            p_i167_4_ = d;
        }
        if(p_i167_6_ > d)
        {
            p_i167_6_ = d;
        }
        field_6039_b = (int)(p_i167_2_ * 8000D);
        field_6042_c = (int)(p_i167_4_ * 8000D);
        field_6041_d = (int)(p_i167_6_ * 8000D);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_6040_a = p_70_1_.readInt();
        field_6039_b = p_70_1_.readShort();
        field_6042_c = p_70_1_.readShort();
        field_6041_d = p_70_1_.readShort();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_6040_a);
        p_68_1_.writeShort(field_6039_b);
        p_68_1_.writeShort(field_6042_c);
        p_68_1_.writeShort(field_6041_d);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_6002_a(this);
    }

    public int func_71_a()
    {
        return 10;
    }
}
