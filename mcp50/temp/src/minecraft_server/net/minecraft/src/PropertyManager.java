// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertyManager
{

    public static Logger field_995_a = Logger.getLogger("Minecraft");
    private Properties field_994_b;
    private File field_996_c;

    public PropertyManager(File p_i421_1_)
    {
        field_994_b = new Properties();
        field_996_c = p_i421_1_;
        if(p_i421_1_.exists())
        {
            try
            {
                field_994_b.load(new FileInputStream(p_i421_1_));
            }
            catch(Exception exception)
            {
                field_995_a.log(Level.WARNING, (new StringBuilder()).append("Failed to load ").append(p_i421_1_).toString(), exception);
                func_723_a();
            }
        } else
        {
            field_995_a.log(Level.WARNING, (new StringBuilder()).append(p_i421_1_).append(" does not exist").toString());
            func_723_a();
        }
    }

    public void func_723_a()
    {
        field_995_a.log(Level.INFO, "Generating new properties file");
        func_721_b();
    }

    public void func_721_b()
    {
        try
        {
            field_994_b.store(new FileOutputStream(field_996_c), "Minecraft server properties");
        }
        catch(Exception exception)
        {
            field_995_a.log(Level.WARNING, (new StringBuilder()).append("Failed to save ").append(field_996_c).toString(), exception);
            func_723_a();
        }
    }

    public File func_40656_c()
    {
        return field_996_c;
    }

    public String func_720_a(String p_720_1_, String p_720_2_)
    {
        if(!field_994_b.containsKey(p_720_1_))
        {
            field_994_b.setProperty(p_720_1_, p_720_2_);
            func_721_b();
        }
        return field_994_b.getProperty(p_720_1_, p_720_2_);
    }

    public int func_722_a(String p_722_1_, int p_722_2_)
    {
        try
        {
            return Integer.parseInt(func_720_a(p_722_1_, (new StringBuilder()).append("").append(p_722_2_).toString()));
        }
        catch(Exception exception)
        {
            field_994_b.setProperty(p_722_1_, (new StringBuilder()).append("").append(p_722_2_).toString());
        }
        return p_722_2_;
    }

    public boolean func_724_a(String p_724_1_, boolean p_724_2_)
    {
        try
        {
            return Boolean.parseBoolean(func_720_a(p_724_1_, (new StringBuilder()).append("").append(p_724_2_).toString()));
        }
        catch(Exception exception)
        {
            field_994_b.setProperty(p_724_1_, (new StringBuilder()).append("").append(p_724_2_).toString());
        }
        return p_724_2_;
    }

    public void func_40657_a(String p_40657_1_, Object p_40657_2_)
    {
        field_994_b.setProperty(p_40657_1_, (new StringBuilder()).append("").append(p_40657_2_).toString());
    }

    public void func_22118_b(String p_22118_1_, boolean p_22118_2_)
    {
        field_994_b.setProperty(p_22118_1_, (new StringBuilder()).append("").append(p_22118_2_).toString());
        func_721_b();
    }

}
