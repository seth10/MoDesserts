// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet130UpdateSign extends Packet
{

    public int field_20020_a;
    public int field_20019_b;
    public int field_20022_c;
    public String field_20021_d[];

    public Packet130UpdateSign()
    {
        field_40_j = true;
    }

    public Packet130UpdateSign(int p_i483_1_, int p_i483_2_, int p_i483_3_, String p_i483_4_[])
    {
        field_40_j = true;
        field_20020_a = p_i483_1_;
        field_20019_b = p_i483_2_;
        field_20022_c = p_i483_3_;
        field_20021_d = p_i483_4_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_20020_a = p_70_1_.readInt();
        field_20019_b = p_70_1_.readShort();
        field_20022_c = p_70_1_.readInt();
        field_20021_d = new String[4];
        for(int i = 0; i < 4; i++)
        {
            field_20021_d[i] = func_27037_a(p_70_1_, 15);
        }

    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_20020_a);
        p_68_1_.writeShort(field_20019_b);
        p_68_1_.writeInt(field_20022_c);
        for(int i = 0; i < 4; i++)
        {
            func_27038_a(field_20021_d[i], p_68_1_);
        }

    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_20005_a(this);
    }

    public int func_71_a()
    {
        int i = 0;
        for(int j = 0; j < 4; j++)
        {
            i += field_20021_d[j].length();
        }

        return i;
    }
}
