// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, NetHandler

public class Packet39AttachEntity extends Packet
{

    public int field_6044_a;
    public int field_6043_b;

    public Packet39AttachEntity()
    {
    }

    public Packet39AttachEntity(Entity p_i323_1_, Entity p_i323_2_)
    {
        field_6044_a = p_i323_1_.field_331_c;
        field_6043_b = p_i323_2_ == null ? -1 : p_i323_2_.field_331_c;
    }

    public int func_71_a()
    {
        return 8;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_6044_a = p_70_1_.readInt();
        field_6043_b = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_6044_a);
        p_68_1_.writeInt(field_6043_b);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_6003_a(this);
    }
}
