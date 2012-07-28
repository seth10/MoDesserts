// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.net.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            RConThreadBase, IServer, RConThreadClient

public class RConThreadMain extends RConThreadBase
{

    private int field_40422_g;
    private int field_40426_h;
    private String field_40427_i;
    private ServerSocket field_40424_j;
    private String field_40425_k;
    private HashMap field_40423_l;

    public RConThreadMain(IServer p_i377_1_)
    {
        super(p_i377_1_);
        field_40424_j = null;
        field_40422_g = p_i377_1_.func_40011_a("rcon.port", 0);
        field_40425_k = p_i377_1_.func_40023_a("rcon.password", "");
        field_40427_i = p_i377_1_.func_40009_f();
        field_40426_h = p_i377_1_.func_40022_g();
        if(0 == field_40422_g)
        {
            field_40422_g = field_40426_h + 10;
            func_40408_b((new StringBuilder()).append("Setting default rcon port to ").append(field_40422_g).toString());
            p_i377_1_.func_40017_a("rcon.port", Integer.valueOf(field_40422_g));
            if(0 == field_40425_k.length())
            {
                p_i377_1_.func_40017_a("rcon.password", "");
            }
            p_i377_1_.func_40019_c();
        }
        if(0 == field_40427_i.length())
        {
            field_40427_i = "0.0.0.0";
        }
        func_40420_e();
        field_40424_j = null;
    }

    private void func_40420_e()
    {
        field_40423_l = new HashMap();
    }

    private void func_40421_f()
    {
        Iterator iterator = field_40423_l.entrySet().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if(!((RConThreadClient)entry.getValue()).func_40413_b())
            {
                iterator.remove();
            }
        } while(true);
    }

    public void run()
    {
        func_40408_b((new StringBuilder()).append("RCON running on ").append(field_40427_i).append(":").append(field_40422_g).toString());
        try
        {
            do
            {
                if(!field_40419_a)
                {
                    break;
                }
                try
                {
                    Socket socket = field_40424_j.accept();
                    socket.setSoTimeout(500);
                    RConThreadClient rconthreadclient = new RConThreadClient(field_40417_b, socket);
                    rconthreadclient.func_40402_a();
                    field_40423_l.put(socket.getRemoteSocketAddress(), rconthreadclient);
                    func_40421_f();
                }
                catch(SocketTimeoutException sockettimeoutexception)
                {
                    func_40421_f();
                }
                catch(IOException ioexception)
                {
                    if(field_40419_a)
                    {
                        func_40408_b((new StringBuilder()).append("IO: ").append(ioexception.getMessage()).toString());
                    }
                }
            } while(true);
        }
        finally
        {
            func_40411_a(field_40424_j);
        }
    }

    public void func_40402_a()
    {
        if(0 == field_40425_k.length())
        {
            func_40405_c((new StringBuilder()).append("No rcon password set in '").append(field_40417_b.func_40013_e()).append("', rcon disabled!").toString());
            return;
        }
        if(0 >= field_40422_g || 65535 < field_40422_g)
        {
            func_40405_c((new StringBuilder()).append("Invalid rcon port ").append(field_40422_g).append(" found in '").append(field_40417_b.func_40013_e()).append("', rcon disabled!").toString());
            return;
        }
        if(field_40419_a)
        {
            return;
        }
        try
        {
            field_40424_j = new ServerSocket(field_40422_g, 0, InetAddress.getByName(field_40427_i));
            field_40424_j.setSoTimeout(500);
            super.func_40402_a();
        }
        catch(IOException ioexception)
        {
            func_40405_c((new StringBuilder()).append("Unable to initialise rcon on ").append(field_40427_i).append(":").append(field_40422_g).append(" : ").append(ioexception.getMessage()).toString());
        }
    }
}
