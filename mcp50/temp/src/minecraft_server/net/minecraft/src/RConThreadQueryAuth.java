// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.net.DatagramPacket;
import java.util.Date;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            RConThreadQuery

class RConThreadQueryAuth
{

    private long field_40390_b;
    private int field_40391_c;
    private byte field_40388_d[];
    private byte field_40389_e[];
    private String field_40387_f;
    final RConThreadQuery field_40392_a; /* synthetic field */

    public RConThreadQueryAuth(RConThreadQuery p_i140_1_, DatagramPacket p_i140_2_)
    {
        field_40392_a = p_i140_1_;
        super();
        field_40390_b = (new Date()).getTime();
        byte abyte0[] = p_i140_2_.getData();
        field_40388_d = new byte[4];
        field_40388_d[0] = abyte0[3];
        field_40388_d[1] = abyte0[4];
        field_40388_d[2] = abyte0[5];
        field_40388_d[3] = abyte0[6];
        field_40387_f = new String(field_40388_d);
        field_40391_c = (new Random()).nextInt(0x1000000);
        field_40389_e = String.format("\t%s%d\0", new Object[] {
            field_40387_f, Integer.valueOf(field_40391_c)
        }).getBytes();
    }

    public Boolean func_40385_a(long p_40385_1_)
    {
        return Boolean.valueOf(field_40390_b < p_40385_1_);
    }

    public int func_40384_a()
    {
        return field_40391_c;
    }

    public byte[] func_40386_b()
    {
        return field_40389_e;
    }

    public byte[] func_40383_c()
    {
        return field_40388_d;
    }
}
