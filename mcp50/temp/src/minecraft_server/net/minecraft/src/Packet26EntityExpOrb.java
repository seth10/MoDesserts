// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, EntityXPOrb, MathHelper, NetHandler

public class Packet26EntityExpOrb extends Packet
{

    public int field_35125_a;
    public int field_35123_b;
    public int field_35124_c;
    public int field_35121_d;
    public int field_35122_e;

    public Packet26EntityExpOrb()
    {
    }

    public Packet26EntityExpOrb(EntityXPOrb p_i369_1_)
    {
        field_35125_a = p_i369_1_.field_331_c;
        field_35123_b = MathHelper.func_584_b(p_i369_1_.field_322_l * 32D);
        field_35124_c = MathHelper.func_584_b(p_i369_1_.field_321_m * 32D);
        field_35121_d = MathHelper.func_584_b(p_i369_1_.field_320_n * 32D);
        field_35122_e = p_i369_1_.func_35153_j_();
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_35125_a = p_70_1_.readInt();
        field_35123_b = p_70_1_.readInt();
        field_35124_c = p_70_1_.readInt();
        field_35121_d = p_70_1_.readInt();
        field_35122_e = p_70_1_.readShort();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_35125_a);
        p_68_1_.writeInt(field_35123_b);
        p_68_1_.writeInt(field_35124_c);
        p_68_1_.writeInt(field_35121_d);
        p_68_1_.writeShort(field_35122_e);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_35008_a(this);
    }

    public int func_71_a()
    {
        return 18;
    }
}
