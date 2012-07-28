// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, NetHandler

public class Packet17Sleep extends Packet
{

    public int field_22041_a;
    public int field_22040_b;
    public int field_22044_c;
    public int field_22043_d;
    public int field_22042_e;

    public Packet17Sleep()
    {
    }

    public Packet17Sleep(Entity p_i244_1_, int p_i244_2_, int p_i244_3_, int p_i244_4_, int p_i244_5_)
    {
        field_22042_e = p_i244_2_;
        field_22040_b = p_i244_3_;
        field_22044_c = p_i244_4_;
        field_22043_d = p_i244_5_;
        field_22041_a = p_i244_1_.field_331_c;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_22041_a = p_70_1_.readInt();
        field_22042_e = p_70_1_.readByte();
        field_22040_b = p_70_1_.readInt();
        field_22044_c = p_70_1_.readByte();
        field_22043_d = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_22041_a);
        p_68_1_.writeByte(field_22042_e);
        p_68_1_.writeInt(field_22040_b);
        p_68_1_.writeByte(field_22044_c);
        p_68_1_.writeInt(field_22043_d);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_22002_a(this);
    }

    public int func_71_a()
    {
        return 14;
    }
}
