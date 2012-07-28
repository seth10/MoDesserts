// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.zip.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Chunk, ExtendedBlockStorage, NibbleArray, 
//            NetHandler

public class Packet51MapChunk extends Packet
{

    public int field_48109_a;
    public int field_48107_b;
    public int field_48108_c;
    public int field_48105_d;
    public byte field_48106_e[];
    public boolean field_48103_f;
    private int field_48104_g;
    private int field_48110_h;
    private static byte field_48111_i[] = new byte[0];

    public Packet51MapChunk()
    {
        field_40_j = true;
    }

    public Packet51MapChunk(Chunk p_i1069_1_, boolean p_i1069_2_, int p_i1069_3_)
    {
        field_40_j = true;
        field_48109_a = p_i1069_1_.field_685_j;
        field_48107_b = p_i1069_1_.field_684_k;
        field_48103_f = p_i1069_2_;
        if(p_i1069_2_)
        {
            p_i1069_3_ = 65535;
            p_i1069_1_.field_50025_o = true;
        }
        ExtendedBlockStorage aextendedblockstorage[] = p_i1069_1_.func_48553_h();
        int i = 0;
        int j = 0;
        for(int k = 0; k < aextendedblockstorage.length; k++)
        {
            if(aextendedblockstorage[k] == null || p_i1069_2_ && aextendedblockstorage[k].func_48595_a() || (p_i1069_3_ & 1 << k) == 0)
            {
                continue;
            }
            field_48108_c |= 1 << k;
            i++;
            if(aextendedblockstorage[k].func_48601_h() != null)
            {
                field_48105_d |= 1 << k;
                j++;
            }
        }

        int l = 2048 * (5 * i + j);
        if(p_i1069_2_)
        {
            l += 256;
        }
        if(field_48111_i.length < l)
        {
            field_48111_i = new byte[l];
        }
        byte abyte0[] = field_48111_i;
        int i1 = 0;
        for(int j1 = 0; j1 < aextendedblockstorage.length; j1++)
        {
            if(aextendedblockstorage[j1] != null && (!p_i1069_2_ || !aextendedblockstorage[j1].func_48595_a()) && (p_i1069_3_ & 1 << j1) != 0)
            {
                byte abyte2[] = aextendedblockstorage[j1].func_48590_g();
                System.arraycopy(abyte2, 0, abyte0, i1, abyte2.length);
                i1 += abyte2.length;
            }
        }

        for(int k1 = 0; k1 < aextendedblockstorage.length; k1++)
        {
            if(aextendedblockstorage[k1] != null && (!p_i1069_2_ || !aextendedblockstorage[k1].func_48595_a()) && (p_i1069_3_ & 1 << k1) != 0)
            {
                NibbleArray nibblearray = aextendedblockstorage[k1].func_48594_i();
                System.arraycopy(nibblearray.field_844_a, 0, abyte0, i1, nibblearray.field_844_a.length);
                i1 += nibblearray.field_844_a.length;
            }
        }

        for(int l1 = 0; l1 < aextendedblockstorage.length; l1++)
        {
            if(aextendedblockstorage[l1] != null && (!p_i1069_2_ || !aextendedblockstorage[l1].func_48595_a()) && (p_i1069_3_ & 1 << l1) != 0)
            {
                NibbleArray nibblearray1 = aextendedblockstorage[l1].func_48600_j();
                System.arraycopy(nibblearray1.field_844_a, 0, abyte0, i1, nibblearray1.field_844_a.length);
                i1 += nibblearray1.field_844_a.length;
            }
        }

        for(int i2 = 0; i2 < aextendedblockstorage.length; i2++)
        {
            if(aextendedblockstorage[i2] != null && (!p_i1069_2_ || !aextendedblockstorage[i2].func_48595_a()) && (p_i1069_3_ & 1 << i2) != 0)
            {
                NibbleArray nibblearray2 = aextendedblockstorage[i2].func_48605_k();
                System.arraycopy(nibblearray2.field_844_a, 0, abyte0, i1, nibblearray2.field_844_a.length);
                i1 += nibblearray2.field_844_a.length;
            }
        }

        if(j > 0)
        {
            for(int j2 = 0; j2 < aextendedblockstorage.length; j2++)
            {
                if(aextendedblockstorage[j2] != null && (!p_i1069_2_ || !aextendedblockstorage[j2].func_48595_a()) && aextendedblockstorage[j2].func_48601_h() != null && (p_i1069_3_ & 1 << j2) != 0)
                {
                    NibbleArray nibblearray3 = aextendedblockstorage[j2].func_48601_h();
                    System.arraycopy(nibblearray3.field_844_a, 0, abyte0, i1, nibblearray3.field_844_a.length);
                    i1 += nibblearray3.field_844_a.length;
                }
            }

        }
        if(p_i1069_2_)
        {
            byte abyte1[] = p_i1069_1_.func_48552_l();
            System.arraycopy(abyte1, 0, abyte0, i1, abyte1.length);
            i1 += abyte1.length;
        }
        Deflater deflater = new Deflater(-1);
        try
        {
            deflater.setInput(abyte0, 0, i1);
            deflater.finish();
            field_48106_e = new byte[i1];
            field_48104_g = deflater.deflate(field_48106_e);
        }
        finally
        {
            deflater.end();
        }
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_48109_a = p_70_1_.readInt();
        field_48107_b = p_70_1_.readInt();
        field_48103_f = p_70_1_.readBoolean();
        field_48108_c = p_70_1_.readShort();
        field_48105_d = p_70_1_.readShort();
        field_48104_g = p_70_1_.readInt();
        field_48110_h = p_70_1_.readInt();
        if(field_48111_i.length < field_48104_g)
        {
            field_48111_i = new byte[field_48104_g];
        }
        p_70_1_.readFully(field_48111_i, 0, field_48104_g);
        int i = 0;
        for(int j = 0; j < 16; j++)
        {
            i += field_48108_c >> j & 1;
        }

        int k = 12288 * i;
        if(field_48103_f)
        {
            k += 256;
        }
        field_48106_e = new byte[k];
        Inflater inflater = new Inflater();
        inflater.setInput(field_48111_i, 0, field_48104_g);
        try
        {
            inflater.inflate(field_48106_e);
        }
        catch(DataFormatException dataformatexception)
        {
            throw new IOException("Bad compressed data format");
        }
        finally
        {
            inflater.end();
        }
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_48109_a);
        p_68_1_.writeInt(field_48107_b);
        p_68_1_.writeBoolean(field_48103_f);
        p_68_1_.writeShort((short)(field_48108_c & 0xffff));
        p_68_1_.writeShort((short)(field_48105_d & 0xffff));
        p_68_1_.writeInt(field_48104_g);
        p_68_1_.writeInt(field_48110_h);
        p_68_1_.write(field_48106_e, 0, field_48104_g);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_48070_a(this);
    }

    public int func_71_a()
    {
        return 17 + field_48104_g;
    }

}
