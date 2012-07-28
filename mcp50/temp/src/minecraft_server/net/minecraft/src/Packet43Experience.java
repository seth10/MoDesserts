// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet43Experience extends Packet
{

    public float field_40266_a;
    public int field_35134_b;
    public int field_35135_c;

    public Packet43Experience()
    {
    }

    public Packet43Experience(float p_i266_1_, int p_i266_2_, int p_i266_3_)
    {
        field_40266_a = p_i266_1_;
        field_35134_b = p_i266_2_;
        field_35135_c = p_i266_3_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_40266_a = p_70_1_.readFloat();
        field_35135_c = p_70_1_.readShort();
        field_35134_b = p_70_1_.readShort();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeFloat(field_40266_a);
        p_68_1_.writeShort(field_35135_c);
        p_68_1_.writeShort(field_35134_b);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_35001_a(this);
    }

    public int func_71_a()
    {
        return 4;
    }
}
