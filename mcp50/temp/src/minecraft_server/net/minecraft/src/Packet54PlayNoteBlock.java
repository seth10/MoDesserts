// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet54PlayNoteBlock extends Packet
{

    public int field_21008_a;
    public int field_21007_b;
    public int field_21011_c;
    public int field_21010_d;
    public int field_21009_e;

    public Packet54PlayNoteBlock()
    {
    }

    public Packet54PlayNoteBlock(int p_i538_1_, int p_i538_2_, int p_i538_3_, int p_i538_4_, int p_i538_5_)
    {
        field_21008_a = p_i538_1_;
        field_21007_b = p_i538_2_;
        field_21011_c = p_i538_3_;
        field_21010_d = p_i538_4_;
        field_21009_e = p_i538_5_;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_21008_a = p_70_1_.readInt();
        field_21007_b = p_70_1_.readShort();
        field_21011_c = p_70_1_.readInt();
        field_21010_d = p_70_1_.read();
        field_21009_e = p_70_1_.read();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_21008_a);
        p_68_1_.writeShort(field_21007_b);
        p_68_1_.writeInt(field_21011_c);
        p_68_1_.write(field_21010_d);
        p_68_1_.write(field_21009_e);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_21004_a(this);
    }

    public int func_71_a()
    {
        return 12;
    }
}
