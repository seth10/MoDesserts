// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import net.minecraft.server.MinecraftServer;

public class ThreadCommandReader extends Thread
{

    final MinecraftServer field_1032_a; /* synthetic field */

    public ThreadCommandReader(MinecraftServer p_i77_1_)
    {
        field_1032_a = p_i77_1_;
        super();
    }

    public void run()
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try
        {
            while(!field_1032_a.field_6032_g && MinecraftServer.func_6015_a(field_1032_a) && (s = bufferedreader.readLine()) != null) 
            {
                field_1032_a.func_6010_a(s, field_1032_a);
            }
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }
}
