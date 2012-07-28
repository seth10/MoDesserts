// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.DataOutputStream;
import java.io.IOException;

// Referenced classes of package net.minecraft.src:
//            NetworkManager

class NetworkWriterThread extends Thread
{

    final NetworkManager field_826_a; /* synthetic field */

    NetworkWriterThread(NetworkManager p_i580_1_, String p_i580_2_)
    {
        field_826_a = p_i580_1_;
        super(p_i580_2_);
    }

    public void run()
    {
        synchronized(NetworkManager.field_1053_a)
        {
            NetworkManager.field_1051_c++;
        }
        while(NetworkManager.func_743_a(field_826_a)) 
        {
            while(NetworkManager.func_749_d(field_826_a)) ;
            try
            {
                if(NetworkManager.func_28136_f(field_826_a) != null)
                {
                    NetworkManager.func_28136_f(field_826_a).flush();
                }
            }
            catch(IOException ioexception)
            {
                if(!NetworkManager.func_28135_e(field_826_a))
                {
                    NetworkManager.func_30007_a(field_826_a, ioexception);
                }
                ioexception.printStackTrace();
            }
            try
            {
                sleep(2L);
            }
            catch(InterruptedException interruptedexception) { }
        }
        synchronized(NetworkManager.field_1053_a)
        {
            NetworkManager.field_1051_c--;
        }
        break MISSING_BLOCK_LABEL_167;
        Exception exception2;
        exception2;
        synchronized(NetworkManager.field_1053_a)
        {
            NetworkManager.field_1051_c--;
        }
        throw exception2;
    }
}
