// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet4UpdateTime extends Packet
{

    public long field_76_a;

    public Packet4UpdateTime()
    {
    }

    public Packet4UpdateTime(long p_i184_1_)
    {
        field_76_a = p_i184_1_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_76_a = p_70_1_.readLong();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeLong(field_76_a);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_25_a(this);
    }

    public int func_71_a()
    {
        return 8;
    }
}
