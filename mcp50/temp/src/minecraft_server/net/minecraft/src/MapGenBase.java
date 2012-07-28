// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            World, IChunkProvider

public class MapGenBase
{

    protected int field_947_a;
    protected Random field_946_b;
    protected World field_35530_d;

    public MapGenBase()
    {
        field_947_a = 8;
        field_946_b = new Random();
    }

    public void func_667_a(IChunkProvider p_667_1_, World p_667_2_, int p_667_3_, int p_667_4_, byte p_667_5_[])
    {
        int i = field_947_a;
        field_35530_d = p_667_2_;
        field_946_b.setSeed(p_667_2_.func_22079_j());
        long l = field_946_b.nextLong();
        long l1 = field_946_b.nextLong();
        for(int j = p_667_3_ - i; j <= p_667_3_ + i; j++)
        {
            for(int k = p_667_4_ - i; k <= p_667_4_ + i; k++)
            {
                long l2 = (long)j * l;
                long l3 = (long)k * l1;
                field_946_b.setSeed(l2 ^ l3 ^ p_667_2_.func_22079_j());
                func_666_a(p_667_2_, j, k, p_667_3_, p_667_4_, p_667_5_);
            }

        }

    }

    protected void func_666_a(World world, int i, int j, int k, int l, byte abyte0[])
    {
    }
}
