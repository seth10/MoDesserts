// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet70Bed extends Packet
{

    public static final String field_25016_a[] = {
        "tile.bed.notValid", null, null, "gameMode.changed"
    };
    public int field_25015_b;
    public int field_35112_c;

    public Packet70Bed()
    {
    }

    public Packet70Bed(int p_i58_1_, int p_i58_2_)
    {
        field_25015_b = p_i58_1_;
        field_35112_c = p_i58_2_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_25015_b = p_70_1_.readByte();
        field_35112_c = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeByte(field_25015_b);
        p_68_1_.writeByte(field_35112_c);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_25001_a(this);
    }

    public int func_71_a()
    {
        return 2;
    }

}
