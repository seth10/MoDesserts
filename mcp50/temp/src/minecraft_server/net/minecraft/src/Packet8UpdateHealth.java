// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet8UpdateHealth extends Packet
{

    public int field_9017_a;
    public int field_35103_b;
    public float field_35104_c;

    public Packet8UpdateHealth()
    {
    }

    public Packet8UpdateHealth(int p_i121_1_, int p_i121_2_, float p_i121_3_)
    {
        field_9017_a = p_i121_1_;
        field_35103_b = p_i121_2_;
        field_35104_c = p_i121_3_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_9017_a = p_70_1_.readShort();
        field_35103_b = p_70_1_.readShort();
        field_35104_c = p_70_1_.readFloat();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeShort(field_9017_a);
        p_68_1_.writeShort(field_35103_b);
        p_68_1_.writeFloat(field_35104_c);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_9003_a(this);
    }

    public int func_71_a()
    {
        return 8;
    }
}
