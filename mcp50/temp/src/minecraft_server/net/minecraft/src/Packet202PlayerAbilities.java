// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, PlayerCapabilities, NetHandler

public class Packet202PlayerAbilities extends Packet
{

    public boolean field_50007_a;
    public boolean field_50005_b;
    public boolean field_50006_c;
    public boolean field_50004_d;

    public Packet202PlayerAbilities()
    {
        field_50007_a = false;
        field_50005_b = false;
        field_50006_c = false;
        field_50004_d = false;
    }

    public Packet202PlayerAbilities(PlayerCapabilities p_i1201_1_)
    {
        field_50007_a = false;
        field_50005_b = false;
        field_50006_c = false;
        field_50004_d = false;
        field_50007_a = p_i1201_1_.field_35660_a;
        field_50005_b = p_i1201_1_.field_35658_b;
        field_50006_c = p_i1201_1_.field_35659_c;
        field_50004_d = p_i1201_1_.field_35657_d;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_50007_a = p_70_1_.readBoolean();
        field_50005_b = p_70_1_.readBoolean();
        field_50006_c = p_70_1_.readBoolean();
        field_50004_d = p_70_1_.readBoolean();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeBoolean(field_50007_a);
        p_68_1_.writeBoolean(field_50005_b);
        p_68_1_.writeBoolean(field_50006_c);
        p_68_1_.writeBoolean(field_50004_d);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_50003_a(this);
    }

    public int func_71_a()
    {
        return 1;
    }
}
