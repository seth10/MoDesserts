// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;

public class PacketCount
{

    public static boolean field_40619_a = true;
    private static final Map field_40617_b = new HashMap();
    private static final Map field_40618_c = new HashMap();
    private static final Object field_40616_d = new Object();

    public PacketCount()
    {
    }

    public static void func_40615_a(int p_40615_0_, long p_40615_1_)
    {
        if(!field_40619_a)
        {
            return;
        }
        synchronized(field_40616_d)
        {
            if(field_40617_b.containsKey(Integer.valueOf(p_40615_0_)))
            {
                field_40617_b.put(Integer.valueOf(p_40615_0_), Long.valueOf(((Long)field_40617_b.get(Integer.valueOf(p_40615_0_))).longValue() + 1L));
                field_40618_c.put(Integer.valueOf(p_40615_0_), Long.valueOf(((Long)field_40618_c.get(Integer.valueOf(p_40615_0_))).longValue() + p_40615_1_));
            } else
            {
                field_40617_b.put(Integer.valueOf(p_40615_0_), Long.valueOf(1L));
                field_40618_c.put(Integer.valueOf(p_40615_0_), Long.valueOf(p_40615_1_));
            }
        }
    }

}
