// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;

public class Profiler
{

    public static boolean field_40524_a = false;
    private static List field_40522_b = new ArrayList();
    private static List field_40523_c = new ArrayList();
    private static String field_40520_d = "";
    private static Map field_40521_e = new HashMap();

    public Profiler()
    {
    }

    public static void func_40518_a(String p_40518_0_)
    {
        if(!field_40524_a)
        {
            return;
        }
        if(field_40520_d.length() > 0)
        {
            field_40520_d = (new StringBuilder()).append(field_40520_d).append(".").toString();
        }
        field_40520_d = (new StringBuilder()).append(field_40520_d).append(p_40518_0_).toString();
        field_40522_b.add(field_40520_d);
        field_40523_c.add(Long.valueOf(System.nanoTime()));
    }

    public static void func_40517_a()
    {
        if(!field_40524_a)
        {
            return;
        }
        long l = System.nanoTime();
        long l1 = ((Long)field_40523_c.remove(field_40523_c.size() - 1)).longValue();
        field_40522_b.remove(field_40522_b.size() - 1);
        long l2 = l - l1;
        if(field_40521_e.containsKey(field_40520_d))
        {
            field_40521_e.put(field_40520_d, Long.valueOf(((Long)field_40521_e.get(field_40520_d)).longValue() + l2));
        } else
        {
            field_40521_e.put(field_40520_d, Long.valueOf(l2));
        }
        field_40520_d = field_40522_b.size() <= 0 ? "" : (String)field_40522_b.get(field_40522_b.size() - 1);
        if(l2 > 0x5f5e100L)
        {
            System.out.println((new StringBuilder()).append(field_40520_d).append(" ").append(l2).toString());
        }
    }

    public static void func_40519_b(String p_40519_0_)
    {
        func_40517_a();
        func_40518_a(p_40519_0_);
    }

}
