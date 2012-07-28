// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.server.MinecraftServer;

public final class ThreadServerApplication extends Thread
{

    final MinecraftServer field_1033_a; /* synthetic field */

    public ThreadServerApplication(String p_i72_1_, MinecraftServer p_i72_2_)
    {
        field_1033_a = p_i72_2_;
        super(p_i72_1_);
    }

    public void run()
    {
        field_1033_a.run();
    }
}
