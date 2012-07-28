// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Packet, EntityLiving, EntityList, MathHelper, 
//            DataWatcher, NetHandler

public class Packet24MobSpawn extends Packet
{

    public int field_59_a;
    public int field_58_b;
    public int field_64_c;
    public int field_63_d;
    public int field_62_e;
    public byte field_61_f;
    public byte field_60_g;
    public byte field_48113_h;
    private DataWatcher field_21006_h;
    private List field_21005_i;

    public Packet24MobSpawn()
    {
    }

    public Packet24MobSpawn(EntityLiving p_i232_1_)
    {
        field_59_a = p_i232_1_.field_331_c;
        field_58_b = (byte)EntityList.func_565_a(p_i232_1_);
        field_64_c = MathHelper.func_584_b(p_i232_1_.field_322_l * 32D);
        field_63_d = MathHelper.func_584_b(p_i232_1_.field_321_m * 32D);
        field_62_e = MathHelper.func_584_b(p_i232_1_.field_320_n * 32D);
        field_61_f = (byte)(int)((p_i232_1_.field_316_r * 256F) / 360F);
        field_60_g = (byte)(int)((p_i232_1_.field_315_s * 256F) / 360F);
        field_48113_h = (byte)(int)((p_i232_1_.field_46027_X * 256F) / 360F);
        field_21006_h = p_i232_1_.func_21039_p();
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_59_a = p_70_1_.readInt();
        field_58_b = p_70_1_.readByte() & 0xff;
        field_64_c = p_70_1_.readInt();
        field_63_d = p_70_1_.readInt();
        field_62_e = p_70_1_.readInt();
        field_61_f = p_70_1_.readByte();
        field_60_g = p_70_1_.readByte();
        field_48113_h = p_70_1_.readByte();
        field_21005_i = DataWatcher.func_21149_a(p_70_1_);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_59_a);
        p_68_1_.writeByte(field_58_b & 0xff);
        p_68_1_.writeInt(field_64_c);
        p_68_1_.writeInt(field_63_d);
        p_68_1_.writeInt(field_62_e);
        p_68_1_.writeByte(field_61_f);
        p_68_1_.writeByte(field_60_g);
        p_68_1_.writeByte(field_48113_h);
        field_21006_h.func_21152_a(p_68_1_);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_4006_a(this);
    }

    public int func_71_a()
    {
        return 20;
    }
}
