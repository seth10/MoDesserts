// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, MathHelper, EntityLightningBolt, 
//            NetHandler

public class Packet71Weather extends Packet
{

    public int field_27043_a;
    public int field_27042_b;
    public int field_27046_c;
    public int field_27045_d;
    public int field_27044_e;

    public Packet71Weather()
    {
    }

    public Packet71Weather(Entity p_i127_1_)
    {
        field_27043_a = p_i127_1_.field_331_c;
        field_27042_b = MathHelper.func_584_b(p_i127_1_.field_322_l * 32D);
        field_27046_c = MathHelper.func_584_b(p_i127_1_.field_321_m * 32D);
        field_27045_d = MathHelper.func_584_b(p_i127_1_.field_320_n * 32D);
        if(p_i127_1_ instanceof EntityLightningBolt)
        {
            field_27044_e = 1;
        }
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_27043_a = p_70_1_.readInt();
        field_27044_e = p_70_1_.readByte();
        field_27042_b = p_70_1_.readInt();
        field_27046_c = p_70_1_.readInt();
        field_27045_d = p_70_1_.readInt();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_27043_a);
        p_68_1_.writeByte(field_27044_e);
        p_68_1_.writeInt(field_27042_b);
        p_68_1_.writeInt(field_27046_c);
        p_68_1_.writeInt(field_27045_d);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_27002_a(this);
    }

    public int func_71_a()
    {
        return 17;
    }
}
