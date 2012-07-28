// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.server.MinecraftServer;

public class ThreadServerSleep extends Thread
{

    final MinecraftServer field_1031_a; /* synthetic field */

    public ThreadServerSleep(MinecraftServer p_i78_1_)
    {
        field_1031_a = p_i78_1_;
        super();
        setDaemon(true);
        start();
    }

    public void run()
    {
        do
        {
            try
            {
                Thread.sleep(0x7fffffffL);
            }
            catch(InterruptedException interruptedexception) { }
        } while(true);
    }
}
