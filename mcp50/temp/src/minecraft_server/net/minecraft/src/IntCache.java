// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

public class IntCache
{

    private static int field_35555_a = 256;
    private static List field_35553_b = new ArrayList();
    private static List field_35554_c = new ArrayList();
    private static List field_35551_d = new ArrayList();
    private static List field_35552_e = new ArrayList();

    public IntCache()
    {
    }

    public static int[] func_35549_a(int p_35549_0_)
    {
        if(p_35549_0_ <= 256)
        {
            if(field_35553_b.size() == 0)
            {
                int ai[] = new int[256];
                field_35554_c.add(ai);
                return ai;
            } else
            {
                int ai1[] = (int[])field_35553_b.remove(field_35553_b.size() - 1);
                field_35554_c.add(ai1);
                return ai1;
            }
        }
        if(p_35549_0_ > field_35555_a)
        {
            field_35555_a = p_35549_0_;
            field_35551_d.clear();
            field_35552_e.clear();
            int ai2[] = new int[field_35555_a];
            field_35552_e.add(ai2);
            return ai2;
        }
        if(field_35551_d.size() == 0)
        {
            int ai3[] = new int[field_35555_a];
            field_35552_e.add(ai3);
            return ai3;
        } else
        {
            int ai4[] = (int[])field_35551_d.remove(field_35551_d.size() - 1);
            field_35552_e.add(ai4);
            return ai4;
        }
    }

    public static void func_35550_a()
    {
        if(field_35551_d.size() > 0)
        {
            field_35551_d.remove(field_35551_d.size() - 1);
        }
        if(field_35553_b.size() > 0)
        {
            field_35553_b.remove(field_35553_b.size() - 1);
        }
        field_35551_d.addAll(field_35552_e);
        field_35553_b.addAll(field_35554_c);
        field_35552_e.clear();
        field_35554_c.clear();
    }

}
