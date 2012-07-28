// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.net.*;
import java.util.HashMap;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            NetworkListenThread, NetLoginHandler

class NetworkAcceptThread extends Thread
{

    final MinecraftServer field_986_a; /* synthetic field */
    final NetworkListenThread field_985_b; /* synthetic field */

    NetworkAcceptThread(NetworkListenThread p_i428_1_, String p_i428_2_, MinecraftServer p_i428_3_)
    {
        field_985_b = p_i428_1_;
        field_986_a = p_i428_3_;
        super(p_i428_2_);
    }

    public void run()
    {
        do
        {
            if(!field_985_b.field_973_b)
            {
                break;
            }
            try
            {
                Socket socket = NetworkListenThread.func_713_a(field_985_b).accept();
                if(socket == null)
                {
                    continue;
                }
                synchronized(NetworkListenThread.func_35504_b(field_985_b))
                {
                    InetAddress inetaddress = socket.getInetAddress();
                    if(NetworkListenThread.func_35504_b(field_985_b).containsKey(inetaddress) && !"127.0.0.1".equals(inetaddress.getHostAddress()) && System.currentTimeMillis() - ((Long)NetworkListenThread.func_35504_b(field_985_b).get(inetaddress)).longValue() < 4000L)
                    {
                        NetworkListenThread.func_35504_b(field_985_b).put(inetaddress, Long.valueOf(System.currentTimeMillis()));
                        socket.close();
                        continue;
                    }
                    NetworkListenThread.func_35504_b(field_985_b).put(inetaddress, Long.valueOf(System.currentTimeMillis()));
                }
                NetLoginHandler netloginhandler = new NetLoginHandler(field_986_a, socket, (new StringBuilder()).append("Connection #").append(NetworkListenThread.func_712_b(field_985_b)).toString());
                NetworkListenThread.func_716_a(field_985_b, netloginhandler);
            }
            catch(IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        } while(true);
    }
}
