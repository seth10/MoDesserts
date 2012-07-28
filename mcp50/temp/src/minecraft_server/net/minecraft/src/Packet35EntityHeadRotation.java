// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet35EntityHeadRotation extends Packet
{

    public int field_48115_a;
    public byte field_48114_b;

    public Packet35EntityHeadRotation()
    {
    }

    public Packet35EntityHeadRotation(int p_i1084_1_, byte p_i1084_2_)
    {
        field_48115_a = p_i1084_1_;
        field_48114_b = p_i1084_2_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_48115_a = p_70_1_.readInt();
        field_48114_b = p_70_1_.readByte();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_48115_a);
        p_68_1_.writeByte(field_48114_b);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_48072_a(this);
    }

    public int func_71_a()
    {
        return 5;
    }
}
