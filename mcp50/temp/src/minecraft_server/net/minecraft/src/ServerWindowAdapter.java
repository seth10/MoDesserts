// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.server.MinecraftServer;

final class ServerWindowAdapter extends WindowAdapter
{

    final MinecraftServer field_997_a; /* synthetic field */

    ServerWindowAdapter(MinecraftServer p_i4_1_)
    {
        field_997_a = p_i4_1_;
        super();
    }

    public void windowClosing(WindowEvent p_windowClosing_1_)
    {
        field_997_a.func_6016_a();
        while(!field_997_a.field_6032_g) 
        {
            try
            {
                Thread.sleep(100L);
            }
            catch(InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
        }
        System.exit(0);
    }
}
