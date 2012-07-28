// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Packet, ChunkPosition, NetHandler

public class Packet60Explosion extends Packet
{

    public double field_12003_a;
    public double field_12002_b;
    public double field_12006_c;
    public float field_12005_d;
    public Set field_12004_e;

    public Packet60Explosion()
    {
    }

    public Packet60Explosion(double p_i417_1_, double p_i417_3_, double p_i417_5_, float p_i417_7_, 
            Set p_i417_8_)
    {
        field_12003_a = p_i417_1_;
        field_12002_b = p_i417_3_;
        field_12006_c = p_i417_5_;
        field_12005_d = p_i417_7_;
        field_12004_e = new HashSet(p_i417_8_);
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_12003_a = p_70_1_.readDouble();
        field_12002_b = p_70_1_.readDouble();
        field_12006_c = p_70_1_.readDouble();
        field_12005_d = p_70_1_.readFloat();
        int i = p_70_1_.readInt();
        field_12004_e = new HashSet();
        int j = (int)field_12003_a;
        int k = (int)field_12002_b;
        int l = (int)field_12006_c;
        for(int i1 = 0; i1 < i; i1++)
        {
            int j1 = p_70_1_.readByte() + j;
            int k1 = p_70_1_.readByte() + k;
            int l1 = p_70_1_.readByte() + l;
            field_12004_e.add(new ChunkPosition(j1, k1, l1));
        }

    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeDouble(field_12003_a);
        p_68_1_.writeDouble(field_12002_b);
        p_68_1_.writeDouble(field_12006_c);
        p_68_1_.writeFloat(field_12005_d);
        p_68_1_.writeInt(field_12004_e.size());
        int i = (int)field_12003_a;
        int j = (int)field_12002_b;
        int k = (int)field_12006_c;
        int j1;
        for(Iterator iterator = field_12004_e.iterator(); iterator.hasNext(); p_68_1_.writeByte(j1))
        {
            ChunkPosition chunkposition = (ChunkPosition)iterator.next();
            int l = chunkposition.field_846_a - i;
            int i1 = chunkposition.field_845_b - j;
            j1 = chunkposition.field_847_c - k;
            p_68_1_.writeByte(l);
            p_68_1_.writeByte(i1);
        }

    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_12001_a(this);
    }

    public int func_71_a()
    {
        return 32 + field_12004_e.size() * 3;
    }
}
