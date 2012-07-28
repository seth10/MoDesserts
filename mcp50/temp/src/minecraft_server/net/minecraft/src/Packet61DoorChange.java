// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet61DoorChange extends Packet
{

    public int field_28047_a;
    public int field_28046_b;
    public int field_28050_c;
    public int field_28049_d;
    public int field_28048_e;

    public Packet61DoorChange()
    {
    }

    public Packet61DoorChange(int p_i144_1_, int p_i144_2_, int p_i144_3_, int p_i144_4_, int p_i144_5_)
    {
        field_28047_a = p_i144_1_;
        field_28050_c = p_i144_2_;
        field_28049_d = p_i144_3_;
        field_28048_e = p_i144_4_;
        field_28046_b = p_i144_5_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_28047_a = p_70_1_.readInt();
        field_28050_c = p_70_1_.readInt();
        field_28049_d = p_70_1_.readByte() & 0xff;
        field_28048_e = p_70_1_.readInt();
        field_28046_b = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_28047_a);
        p_68_1_.writeInt(field_28050_c);
        p_68_1_.writeByte(field_28049_d & 0xff);
        p_68_1_.writeInt(field_28048_e);
        p_68_1_.writeInt(field_28046_b);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_28002_a(this);
    }

    public int func_71_a()
    {
        return 20;
    }
}
