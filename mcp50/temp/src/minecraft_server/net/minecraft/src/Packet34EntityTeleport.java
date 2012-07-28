// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, MathHelper, NetHandler

public class Packet34EntityTeleport extends Packet
{

    public int field_131_a;
    public int field_130_b;
    public int field_135_c;
    public int field_134_d;
    public byte field_133_e;
    public byte field_132_f;

    public Packet34EntityTeleport()
    {
    }

    public Packet34EntityTeleport(Entity p_i409_1_)
    {
        field_131_a = p_i409_1_.field_331_c;
        field_130_b = MathHelper.func_584_b(p_i409_1_.field_322_l * 32D);
        field_135_c = MathHelper.func_584_b(p_i409_1_.field_321_m * 32D);
        field_134_d = MathHelper.func_584_b(p_i409_1_.field_320_n * 32D);
        field_133_e = (byte)(int)((p_i409_1_.field_316_r * 256F) / 360F);
        field_132_f = (byte)(int)((p_i409_1_.field_315_s * 256F) / 360F);
    }

    public Packet34EntityTeleport(int p_i410_1_, int p_i410_2_, int p_i410_3_, int p_i410_4_, byte p_i410_5_, byte p_i410_6_)
    {
        field_131_a = p_i410_1_;
        field_130_b = p_i410_2_;
        field_135_c = p_i410_3_;
        field_134_d = p_i410_4_;
        field_133_e = p_i410_5_;
        field_132_f = p_i410_6_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_131_a = p_70_1_.readInt();
        field_130_b = p_70_1_.readInt();
        field_135_c = p_70_1_.readInt();
        field_134_d = p_70_1_.readInt();
        field_133_e = (byte)p_70_1_.read();
        field_132_f = (byte)p_70_1_.read();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_131_a);
        p_68_1_.writeInt(field_130_b);
        p_68_1_.writeInt(field_135_c);
        p_68_1_.writeInt(field_134_d);
        p_68_1_.write(field_133_e);
        p_68_1_.write(field_132_f);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_4007_a(this);
    }

    public int func_71_a()
    {
        return 34;
    }
}
