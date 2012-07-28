// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NetworkManager

class ThreadMonitorConnection extends Thread
{

    final NetworkManager field_828_a; /* synthetic field */

    ThreadMonitorConnection(NetworkManager p_i578_1_)
    {
        field_828_a = p_i578_1_;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(2000L);
            if(NetworkManager.func_743_a(field_828_a))
            {
                NetworkManager.func_748_f(field_828_a).interrupt();
                field_828_a.func_753_a("disconnect.closed", new Object[0]);
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
