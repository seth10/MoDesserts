// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, EntityItem, ItemStack, MathHelper, 
//            NetHandler

public class Packet21PickupSpawn extends Packet
{

    public int field_129_a;
    public int field_128_b;
    public int field_127_c;
    public int field_126_d;
    public byte field_125_e;
    public byte field_124_f;
    public byte field_123_g;
    public int field_122_h;
    public int field_121_i;
    public int field_21023_j;

    public Packet21PickupSpawn()
    {
    }

    public Packet21PickupSpawn(EntityItem p_i312_1_)
    {
        field_129_a = p_i312_1_.field_331_c;
        field_122_h = p_i312_1_.field_429_a.field_855_c;
        field_121_i = p_i312_1_.field_429_a.field_853_a;
        field_21023_j = p_i312_1_.field_429_a.func_21125_h();
        field_128_b = MathHelper.func_584_b(p_i312_1_.field_322_l * 32D);
        field_127_c = MathHelper.func_584_b(p_i312_1_.field_321_m * 32D);
        field_126_d = MathHelper.func_584_b(p_i312_1_.field_320_n * 32D);
        field_125_e = (byte)(int)(p_i312_1_.field_319_o * 128D);
        field_124_f = (byte)(int)(p_i312_1_.field_318_p * 128D);
        field_123_g = (byte)(int)(p_i312_1_.field_317_q * 128D);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_129_a = p_70_1_.readInt();
        field_122_h = p_70_1_.readShort();
        field_121_i = p_70_1_.readByte();
        field_21023_j = p_70_1_.readShort();
        field_128_b = p_70_1_.readInt();
        field_127_c = p_70_1_.readInt();
        field_126_d = p_70_1_.readInt();
        field_125_e = p_70_1_.readByte();
        field_124_f = p_70_1_.readByte();
        field_123_g = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_129_a);
        p_68_1_.writeShort(field_122_h);
        p_68_1_.writeByte(field_121_i);
        p_68_1_.writeShort(field_21023_j);
        p_68_1_.writeInt(field_128_b);
        p_68_1_.writeInt(field_127_c);
        p_68_1_.writeInt(field_126_d);
        p_68_1_.writeByte(field_125_e);
        p_68_1_.writeByte(field_124_f);
        p_68_1_.writeByte(field_123_g);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_4004_a(this);
    }

    public int func_71_a()
    {
        return 24;
    }
}
