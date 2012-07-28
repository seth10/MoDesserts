// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, World, NetHandler

public class Packet53BlockChange extends Packet
{

    public int field_90_a;
    public int field_89_b;
    public int field_93_c;
    public int field_92_d;
    public int field_91_e;

    public Packet53BlockChange()
    {
        field_40_j = true;
    }

    public Packet53BlockChange(int p_i474_1_, int p_i474_2_, int p_i474_3_, World p_i474_4_)
    {
        field_40_j = true;
        field_90_a = p_i474_1_;
        field_89_b = p_i474_2_;
        field_93_c = p_i474_3_;
        field_92_d = p_i474_4_.func_444_a(p_i474_1_, p_i474_2_, p_i474_3_);
        field_91_e = p_i474_4_.func_446_b(p_i474_1_, p_i474_2_, p_i474_3_);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_90_a = p_70_1_.readInt();
        field_89_b = p_70_1_.read();
        field_93_c = p_70_1_.readInt();
        field_92_d = p_70_1_.read();
        field_91_e = p_70_1_.read();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_90_a);
        p_68_1_.write(field_89_b);
        p_68_1_.writeInt(field_93_c);
        p_68_1_.write(field_92_d);
        p_68_1_.write(field_91_e);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_12_a(this);
    }

    public int func_71_a()
    {
        return 11;
    }
}
