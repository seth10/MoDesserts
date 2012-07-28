// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet0KeepAlive extends Packet
{

    public int field_35126_a;

    public Packet0KeepAlive()
    {
    }

    public Packet0KeepAlive(int p_i290_1_)
    {
        field_35126_a = p_i290_1_;
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_35005_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_35126_a = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_35126_a);
    }

    public int func_71_a()
    {
        return 4;
    }
}
