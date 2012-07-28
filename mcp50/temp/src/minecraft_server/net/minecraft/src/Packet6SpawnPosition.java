// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet6SpawnPosition extends Packet
{

    public int field_139_a;
    public int field_138_b;
    public int field_140_c;

    public Packet6SpawnPosition()
    {
    }

    public Packet6SpawnPosition(int p_i406_1_, int p_i406_2_, int p_i406_3_)
    {
        field_139_a = p_i406_1_;
        field_138_b = p_i406_2_;
        field_140_c = p_i406_3_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_139_a = p_70_1_.readInt();
        field_138_b = p_70_1_.readInt();
        field_140_c = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_139_a);
        p_68_1_.writeInt(field_138_b);
        p_68_1_.writeInt(field_140_c);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_15_a(this);
    }

    public int func_71_a()
    {
        return 12;
    }
}
