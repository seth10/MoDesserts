// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, WorldType, NetHandler

public class Packet1Login extends Packet
{

    public int field_4024_a;
    public String field_113_b;
    public WorldType field_46001_d;
    public int field_35131_d;
    public int field_48112_e;
    public byte field_35129_f;
    public byte field_35130_g;
    public byte field_35133_h;

    public Packet1Login()
    {
    }

    public Packet1Login(String p_i1064_1_, int p_i1064_2_, WorldType p_i1064_3_, int p_i1064_4_, int p_i1064_5_, byte p_i1064_6_, byte p_i1064_7_, 
            byte p_i1064_8_)
    {
        field_113_b = p_i1064_1_;
        field_4024_a = p_i1064_2_;
        field_46001_d = p_i1064_3_;
        field_48112_e = p_i1064_5_;
        field_35129_f = p_i1064_6_;
        field_35131_d = p_i1064_4_;
        field_35130_g = p_i1064_7_;
        field_35133_h = p_i1064_8_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_4024_a = p_70_1_.readInt();
        field_113_b = func_27037_a(p_70_1_, 16);
        String s = func_27037_a(p_70_1_, 16);
        field_46001_d = WorldType.func_46049_a(s);
        if(field_46001_d == null)
        {
            field_46001_d = WorldType.field_48457_b;
        }
        field_35131_d = p_70_1_.readInt();
        field_48112_e = p_70_1_.readInt();
        field_35129_f = p_70_1_.readByte();
        field_35130_g = p_70_1_.readByte();
        field_35133_h = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_4024_a);
        func_27038_a(field_113_b, p_68_1_);
        if(field_46001_d == null)
        {
            func_27038_a("", p_68_1_);
        } else
        {
            func_27038_a(field_46001_d.func_48449_a(), p_68_1_);
        }
        p_68_1_.writeInt(field_35131_d);
        p_68_1_.writeInt(field_48112_e);
        p_68_1_.writeByte(field_35129_f);
        p_68_1_.writeByte(field_35130_g);
        p_68_1_.writeByte(field_35133_h);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_4001_a(this);
    }

    public int func_71_a()
    {
        int i = 0;
        if(field_46001_d != null)
        {
            i = field_46001_d.func_48449_a().length();
        }
        return 4 + field_113_b.length() + 4 + 7 + 7 + i;
    }
}
