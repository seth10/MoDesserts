// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet7UseEntity extends Packet
{

    public int field_9019_a;
    public int field_9018_b;
    public int field_9020_c;

    public Packet7UseEntity()
    {
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_9019_a = p_70_1_.readInt();
        field_9018_b = p_70_1_.readInt();
        field_9020_c = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_9019_a);
        p_68_1_.writeInt(field_9018_b);
        p_68_1_.writeByte(field_9020_c);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_6006_a(this);
    }

    public int func_71_a()
    {
        return 9;
    }
}
