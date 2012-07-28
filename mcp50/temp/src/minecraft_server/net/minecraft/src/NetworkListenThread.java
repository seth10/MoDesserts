// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            NetworkAcceptThread, NetLoginHandler, NetworkManager, NetServerHandler

public class NetworkListenThread
{

    public static Logger field_974_a = Logger.getLogger("Minecraft");
    private ServerSocket field_979_d;
    private Thread field_978_e;
    public volatile boolean field_973_b;
    private int field_977_f;
    private ArrayList field_976_g;
    private ArrayList field_975_h;
    public MinecraftServer field_980_c;
    private HashMap field_35506_i;

    public NetworkListenThread(MinecraftServer p_i115_1_, InetAddress p_i115_2_, int p_i115_3_)
        throws IOException
    {
        field_973_b = false;
        field_977_f = 0;
        field_976_g = new ArrayList();
        field_975_h = new ArrayList();
        field_35506_i = new HashMap();
        field_980_c = p_i115_1_;
        field_979_d = new ServerSocket(p_i115_3_, 0, p_i115_2_);
        field_979_d.setPerformancePreferences(0, 2, 1);
        field_973_b = true;
        field_978_e = new NetworkAcceptThread(this, "Listen thread", p_i115_1_);
        field_978_e.start();
    }

    public void func_35505_a(Socket p_35505_1_)
    {
        InetAddress inetaddress = p_35505_1_.getInetAddress();
        synchronized(field_35506_i)
        {
            field_35506_i.remove(inetaddress);
        }
    }

    public void func_4108_a(NetServerHandler p_4108_1_)
    {
        field_975_h.add(p_4108_1_);
    }

    private void func_717_a(NetLoginHandler p_717_1_)
    {
        if(p_717_1_ == null)
        {
            throw new IllegalArgumentException("Got null pendingconnection!");
        } else
        {
            field_976_g.add(p_717_1_);
            return;
        }
    }

    public void func_715_a()
    {
        for(int i = 0; i < field_976_g.size(); i++)
        {
            NetLoginHandler netloginhandler = (NetLoginHandler)field_976_g.get(i);
            try
            {
                netloginhandler.func_33_a();
            }
            catch(Exception exception)
            {
                netloginhandler.func_34_b("Internal server error");
                field_974_a.log(Level.WARNING, (new StringBuilder()).append("Failed to handle packet: ").append(exception).toString(), exception);
            }
            if(netloginhandler.field_7_c)
            {
                field_976_g.remove(i--);
            }
            netloginhandler.field_8_b.func_28138_a();
        }

        for(int j = 0; j < field_975_h.size(); j++)
        {
            NetServerHandler netserverhandler = (NetServerHandler)field_975_h.get(j);
            try
            {
                netserverhandler.func_42_a();
            }
            catch(Exception exception1)
            {
                field_974_a.log(Level.WARNING, (new StringBuilder()).append("Failed to handle packet: ").append(exception1).toString(), exception1);
                netserverhandler.func_43_c("Internal server error");
            }
            if(netserverhandler.field_18_c)
            {
                field_975_h.remove(j--);
            }
            netserverhandler.field_19_b.func_28138_a();
        }

    }

    static ServerSocket func_713_a(NetworkListenThread p_713_0_)
    {
        return p_713_0_.field_979_d;
    }

    static HashMap func_35504_b(NetworkListenThread p_35504_0_)
    {
        return p_35504_0_.field_35506_i;
    }

    static int func_712_b(NetworkListenThread p_712_0_)
    {
        return p_712_0_.field_977_f++;
    }

    static void func_716_a(NetworkListenThread p_716_0_, NetLoginHandler p_716_1_)
    {
        p_716_0_.func_717_a(p_716_1_);
    }

}
