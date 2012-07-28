// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, WorldType

public class Packet9Respawn extends Packet
{

    public int field_28045_a;
    public int field_35119_c;
    public int field_35117_d;
    public int field_35118_e;
    public WorldType field_46002_f;

    public Packet9Respawn()
    {
    }

    public Packet9Respawn(int p_i1066_1_, byte p_i1066_2_, WorldType p_i1066_3_, int p_i1066_4_, int p_i1066_5_)
    {
        field_28045_a = p_i1066_1_;
        field_35119_c = p_i1066_2_;
        field_35117_d = p_i1066_4_;
        field_35118_e = p_i1066_5_;
        field_46002_f = p_i1066_3_;
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_9002_a(this);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_28045_a = p_70_1_.readInt();
        field_35119_c = p_70_1_.readByte();
        field_35118_e = p_70_1_.readByte();
        field_35117_d = p_70_1_.readShort();
        String s = func_27037_a(p_70_1_, 16);
        field_46002_f = WorldType.func_46049_a(s);
        if(field_46002_f == null)
        {
            field_46002_f = WorldType.field_48457_b;
        }
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_28045_a);
        p_68_1_.writeByte(field_35119_c);
        p_68_1_.writeByte(field_35118_e);
        p_68_1_.writeShort(field_35117_d);
        func_27038_a(field_46002_f.func_48449_a(), p_68_1_);
    }

    public int func_71_a()
    {
        return 8 + field_46002_f.func_48449_a().length();
    }
}
