// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            IProgressUpdate

public class ConvertProgressUpdater
    implements IProgressUpdate
{

    private long field_22071_b;
    final MinecraftServer field_22072_a; /* synthetic field */

    public ConvertProgressUpdater(MinecraftServer p_i74_1_)
    {
        field_22072_a = p_i74_1_;
        super();
        field_22071_b = System.currentTimeMillis();
    }

    public void func_438_a(String s)
    {
    }

    public void func_437_a(int p_437_1_)
    {
        if(System.currentTimeMillis() - field_22071_b >= 1000L)
        {
            field_22071_b = System.currentTimeMillis();
            MinecraftServer.field_6038_a.info((new StringBuilder()).append("Converting... ").append(p_437_1_).append("%").toString());
        }
    }

    public void func_439_b(String s)
    {
    }
}
