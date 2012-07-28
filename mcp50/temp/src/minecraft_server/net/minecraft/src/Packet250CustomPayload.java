// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet250CustomPayload extends Packet
{

    public String field_44005_a;
    public int field_44003_b;
    public byte field_44004_c[];

    public Packet250CustomPayload()
    {
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_44005_a = func_27037_a(p_70_1_, 16);
        field_44003_b = p_70_1_.readShort();
        if(field_44003_b > 0 && field_44003_b < 32767)
        {
            field_44004_c = new byte[field_44003_b];
            p_70_1_.readFully(field_44004_c);
        }
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        func_27038_a(field_44005_a, p_68_1_);
        p_68_1_.writeShort((short)field_44003_b);
        if(field_44004_c != null)
        {
            p_68_1_.write(field_44004_c);
        }
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_44001_a(this);
    }

    public int func_71_a()
    {
        return 2 + field_44005_a.length() * 2 + 2 + field_44003_b;
    }
}
