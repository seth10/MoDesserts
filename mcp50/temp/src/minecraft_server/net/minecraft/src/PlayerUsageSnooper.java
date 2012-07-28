// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            PlayerUsageSnooperThread

public class PlayerUsageSnooper
{

    private Map field_52016_a;
    private final URL field_52015_b;

    public PlayerUsageSnooper(String p_i1301_1_)
    {
        field_52016_a = new HashMap();
        try
        {
            field_52015_b = new URL((new StringBuilder()).append("http://snoop.minecraft.net/").append(p_i1301_1_).toString());
        }
        catch(MalformedURLException malformedurlexception)
        {
            throw new IllegalArgumentException();
        }
    }

    public void func_52014_a(String p_52014_1_, Object p_52014_2_)
    {
        field_52016_a.put(p_52014_1_, p_52014_2_);
    }

    public void func_52012_a()
    {
        PlayerUsageSnooperThread playerusagesnooperthread = new PlayerUsageSnooperThread(this, "reporter");
        playerusagesnooperthread.setDaemon(true);
        playerusagesnooperthread.start();
    }

    static URL func_52013_a(PlayerUsageSnooper p_52013_0_)
    {
        return p_52013_0_.field_52015_b;
    }

    static Map func_52011_b(PlayerUsageSnooper p_52011_0_)
    {
        return p_52011_0_.field_52016_a;
    }
}
