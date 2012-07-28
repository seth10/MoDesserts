// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Packet, DataWatcher, NetHandler

public class Packet40EntityMetadata extends Packet
{

    public int field_21019_a;
    private List field_21018_b;

    public Packet40EntityMetadata()
    {
    }

    public Packet40EntityMetadata(int p_i497_1_, DataWatcher p_i497_2_)
    {
        field_21019_a = p_i497_1_;
        field_21018_b = p_i497_2_.func_21148_b();
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_21019_a = p_70_1_.readInt();
        field_21018_b = DataWatcher.func_21149_a(p_70_1_);
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_21019_a);
        DataWatcher.func_21151_a(field_21018_b, p_68_1_);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_21002_a(this);
    }

    public int func_71_a()
    {
        return 5;
    }
}
