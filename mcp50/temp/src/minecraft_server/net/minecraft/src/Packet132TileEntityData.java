// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet132TileEntityData extends Packet
{

    public int field_48122_a;
    public int field_48120_b;
    public int field_48121_c;
    public int field_48118_d;
    public int field_48119_e;
    public int field_48116_f;
    public int field_48117_g;

    public Packet132TileEntityData()
    {
        field_40_j = true;
    }

    public Packet132TileEntityData(int p_i1080_1_, int p_i1080_2_, int p_i1080_3_, int p_i1080_4_, int p_i1080_5_)
    {
        field_40_j = true;
        field_48122_a = p_i1080_1_;
        field_48120_b = p_i1080_2_;
        field_48121_c = p_i1080_3_;
        field_48118_d = p_i1080_4_;
        field_48119_e = p_i1080_5_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_48122_a = p_70_1_.readInt();
        field_48120_b = p_70_1_.readShort();
        field_48121_c = p_70_1_.readInt();
        field_48118_d = p_70_1_.readByte();
        field_48119_e = p_70_1_.readInt();
        field_48116_f = p_70_1_.readInt();
        field_48117_g = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_48122_a);
        p_68_1_.writeShort(field_48120_b);
        p_68_1_.writeInt(field_48121_c);
        p_68_1_.writeByte((byte)field_48118_d);
        p_68_1_.writeInt(field_48119_e);
        p_68_1_.writeInt(field_48116_f);
        p_68_1_.writeInt(field_48117_g);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_48071_a(this);
    }

    public int func_71_a()
    {
        return 25;
    }
}
