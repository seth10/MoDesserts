// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NetworkManager

class NetworkReaderThread extends Thread
{

    final NetworkManager field_827_a; /* synthetic field */

    NetworkReaderThread(NetworkManager p_i579_1_, String p_i579_2_)
    {
        field_827_a = p_i579_1_;
        super(p_i579_2_);
    }

    public void run()
    {
        synchronized(NetworkManager.field_1053_a)
        {
            NetworkManager.field_1052_b++;
        }
        while(NetworkManager.func_743_a(field_827_a) && !NetworkManager.func_740_b(field_827_a)) 
        {
            while(NetworkManager.func_751_c(field_827_a)) ;
            try
            {
                sleep(2L);
            }
            catch(InterruptedException interruptedexception) { }
        }
        synchronized(NetworkManager.field_1053_a)
        {
            NetworkManager.field_1052_b--;
        }
        break MISSING_BLOCK_LABEL_131;
        Exception exception2;
        exception2;
        synchronized(NetworkManager.field_1053_a)
        {
            NetworkManager.field_1052_b--;
        }
        throw exception2;
    }
}
