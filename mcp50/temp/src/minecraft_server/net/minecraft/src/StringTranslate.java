// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

public class StringTranslate
{

    private static StringTranslate field_25082_a = new StringTranslate();
    private Properties field_25081_b;
    private TreeMap field_44013_c;
    private String field_44012_d;
    private boolean field_46121_e;

    private StringTranslate()
    {
        field_25081_b = new Properties();
        func_44009_b();
        func_44010_a("en_US");
    }

    public static StringTranslate func_25079_a()
    {
        return field_25082_a;
    }

    private void func_44009_b()
    {
        TreeMap treemap = new TreeMap();
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((net.minecraft.src.StringTranslate.class).getResourceAsStream("/lang/languages.txt"), "UTF-8"));
            for(String s = bufferedreader.readLine(); s != null; s = bufferedreader.readLine())
            {
                String as[] = s.split("=");
                if(as != null && as.length == 2)
                {
                    treemap.put(as[0], as[1]);
                }
            }

        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
            return;
        }
        field_44013_c = treemap;
    }

    private void func_44011_a(Properties p_44011_1_, String p_44011_2_)
        throws IOException
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((net.minecraft.src.StringTranslate.class).getResourceAsStream((new StringBuilder()).append("/lang/").append(p_44011_2_).append(".lang").toString()), "UTF-8"));
        for(String s = bufferedreader.readLine(); s != null; s = bufferedreader.readLine())
        {
            s = s.trim();
            if(s.startsWith("#"))
            {
                continue;
            }
            String as[] = s.split("=");
            if(as != null && as.length == 2)
            {
                p_44011_1_.setProperty(as[0], as[1]);
            }
        }

    }

    public void func_44010_a(String p_44010_1_)
    {
        Properties properties;
        if(p_44010_1_.equals(field_44012_d))
        {
            return;
        }
        properties = new Properties();
        try
        {
            func_44011_a(properties, "en_US");
        }
        catch(IOException ioexception) { }
        field_46121_e = false;
        if("en_US".equals(p_44010_1_))
        {
            break MISSING_BLOCK_LABEL_152;
        }
        Enumeration enumeration;
        func_44011_a(properties, p_44010_1_);
        enumeration = properties.propertyNames();
_L2:
        String s;
        int i;
        Object obj1;
        do
        {
            if(!enumeration.hasMoreElements() || field_46121_e)
            {
                break MISSING_BLOCK_LABEL_152;
            }
            Object obj = enumeration.nextElement();
            obj1 = properties.get(obj);
        } while(obj1 == null);
        s = obj1.toString();
        i = 0;
_L5:
        if(i >= s.length()) goto _L2; else goto _L1
_L1:
        if(s.charAt(i) < '\u0100') goto _L4; else goto _L3
_L3:
        field_46121_e = true;
          goto _L2
_L4:
        i++;
          goto _L5
        IOException ioexception1;
        ioexception1;
        ioexception1.printStackTrace();
        return;
        field_44012_d = p_44010_1_;
        field_25081_b = properties;
        return;
          goto _L2
    }

    public String func_25080_a(String p_25080_1_)
    {
        return field_25081_b.getProperty(p_25080_1_, p_25080_1_);
    }

    public String func_25078_a(String p_25078_1_, Object p_25078_2_[])
    {
        String s = field_25081_b.getProperty(p_25078_1_, p_25078_1_);
        return String.format(s, p_25078_2_);
    }

}
