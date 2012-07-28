// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, World, Chunk, NetHandler

public class Packet52MultiBlockChange extends Packet
{

    public int field_48_a;
    public int field_47_b;
    public byte field_50_e[];
    public int field_49_f;
    private static byte field_48123_e[] = new byte[0];

    public Packet52MultiBlockChange()
    {
        field_40_j = true;
    }

    public Packet52MultiBlockChange(int p_i570_1_, int p_i570_2_, short p_i570_3_[], int p_i570_4_, World p_i570_5_)
    {
        field_40_j = true;
        field_48_a = p_i570_1_;
        field_47_b = p_i570_2_;
        field_49_f = p_i570_4_;
        int i = 4 * p_i570_4_;
        Chunk chunk = p_i570_5_.func_525_b(p_i570_1_, p_i570_2_);
        try
        {
            if(p_i570_4_ >= 64)
            {
                System.out.println((new StringBuilder()).append("ChunkTilesUpdatePacket compress ").append(p_i570_4_).toString());
                if(field_48123_e.length < i)
                {
                    field_48123_e = new byte[i];
                }
            } else
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(i);
                DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
                for(int j = 0; j < p_i570_4_; j++)
                {
                    int k = p_i570_3_[j] >> 12 & 0xf;
                    int l = p_i570_3_[j] >> 8 & 0xf;
                    int i1 = p_i570_3_[j] & 0xff;
                    dataoutputstream.writeShort(p_i570_3_[j]);
                    dataoutputstream.writeShort((short)((chunk.func_344_a(k, i1, l) & 0xfff) << 4 | chunk.func_356_b(k, i1, l) & 0xf));
                }

                field_50_e = bytearrayoutputstream.toByteArray();
                if(field_50_e.length != i)
                {
                    throw new RuntimeException((new StringBuilder()).append("Expected length ").append(i).append(" doesn't match received length ").append(field_50_e.length).toString());
                }
            }
        }
        catch(IOException ioexception)
        {
            System.err.println(ioexception.getMessage());
            field_50_e = null;
        }
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_48_a = p_70_1_.readInt();
        field_47_b = p_70_1_.readInt();
        field_49_f = p_70_1_.readShort() & 0xffff;
        int i = p_70_1_.readInt();
        if(i > 0)
        {
            field_50_e = new byte[i];
            p_70_1_.readFully(field_50_e);
        }
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_48_a);
        p_68_1_.writeInt(field_47_b);
        p_68_1_.writeShort((short)field_49_f);
        if(field_50_e != null)
        {
            p_68_1_.writeInt(field_50_e.length);
            p_68_1_.write(field_50_e);
        } else
        {
            p_68_1_.writeInt(0);
        }
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_13_a(this);
    }

    public int func_71_a()
    {
        return 10 + field_49_f * 4;
    }

}
