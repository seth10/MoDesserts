// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, EntityPainting, EnumArt, NetHandler

public class Packet25EntityPainting extends Packet
{

    public int field_21013_a;
    public int field_21012_b;
    public int field_21017_c;
    public int field_21016_d;
    public int field_21015_e;
    public String field_21014_f;

    public Packet25EntityPainting()
    {
    }

    public Packet25EntityPainting(EntityPainting p_i534_1_)
    {
        field_21013_a = p_i534_1_.field_331_c;
        field_21012_b = p_i534_1_.field_9188_d;
        field_21017_c = p_i534_1_.field_9187_e;
        field_21016_d = p_i534_1_.field_9186_f;
        field_21015_e = p_i534_1_.field_448_a;
        field_21014_f = p_i534_1_.field_9185_b.field_857_y;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_21013_a = p_70_1_.readInt();
        field_21014_f = func_27037_a(p_70_1_, EnumArt.field_27096_z);
        field_21012_b = p_70_1_.readInt();
        field_21017_c = p_70_1_.readInt();
        field_21016_d = p_70_1_.readInt();
        field_21015_e = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_21013_a);
        func_27038_a(field_21014_f, p_68_1_);
        p_68_1_.writeInt(field_21012_b);
        p_68_1_.writeInt(field_21017_c);
        p_68_1_.writeInt(field_21016_d);
        p_68_1_.writeInt(field_21015_e);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_21003_a(this);
    }

    public int func_71_a()
    {
        return 24;
    }
}
