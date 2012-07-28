// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NetworkManager

class NetworkMasterThread extends Thread
{

    final NetworkManager field_829_a; /* synthetic field */

    NetworkMasterThread(NetworkManager p_i577_1_)
    {
        field_829_a = p_i577_1_;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(5000L);
            if(NetworkManager.func_742_e(field_829_a).isAlive())
            {
                try
                {
                    NetworkManager.func_742_e(field_829_a).stop();
                }
                catch(Throwable throwable) { }
            }
            if(NetworkManager.func_748_f(field_829_a).isAlive())
            {
                try
                {
                    NetworkManager.func_748_f(field_829_a).stop();
                }
                catch(Throwable throwable1) { }
            }
        }
        catch(InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }
}
