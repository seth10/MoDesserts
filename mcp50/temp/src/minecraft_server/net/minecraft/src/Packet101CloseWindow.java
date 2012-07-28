// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet101CloseWindow extends Packet
{

    public int field_20032_a;

    public Packet101CloseWindow()
    {
    }

    public Packet101CloseWindow(int p_i296_1_)
    {
        field_20032_a = p_i296_1_;
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_20006_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_20032_a = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeByte(field_20032_a);
    }

    public int func_71_a()
    {
        return 1;
    }
}
