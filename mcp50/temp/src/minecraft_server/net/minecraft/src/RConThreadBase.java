// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IServer

public abstract class RConThreadBase
    implements Runnable
{

    protected boolean field_40419_a;
    protected IServer field_40417_b;
    protected Thread field_40418_c;
    protected int field_40415_d;
    protected List field_40416_e;
    protected List field_40414_f;

    RConThreadBase(IServer p_i527_1_)
    {
        field_40419_a = false;
        field_40415_d = 5;
        field_40416_e = new ArrayList();
        field_40414_f = new ArrayList();
        field_40417_b = p_i527_1_;
        if(field_40417_b.func_40021_p())
        {
            func_40405_c("Debugging is enabled, performance maybe reduced!");
        }
    }

    public synchronized void func_40402_a()
    {
        field_40418_c = new Thread(this);
        field_40418_c.start();
        field_40419_a = true;
    }

    public boolean func_40413_b()
    {
        return field_40419_a;
    }

    protected void func_40406_a(String p_40406_1_)
    {
        field_40417_b.func_40006_f(p_40406_1_);
    }

    protected void func_40408_b(String p_40408_1_)
    {
        field_40417_b.func_2_b(p_40408_1_);
    }

    protected void func_40405_c(String p_40405_1_)
    {
        field_40417_b.func_25002_c(p_40405_1_);
    }

    protected void func_40409_d(String p_40409_1_)
    {
        field_40417_b.func_40007_e(p_40409_1_);
    }

    protected int func_40407_c()
    {
        return field_40417_b.func_40018_j();
    }

    protected void func_40401_a(DatagramSocket p_40401_1_)
    {
        func_40406_a((new StringBuilder()).append("registerSocket: ").append(p_40401_1_).toString());
        field_40416_e.add(p_40401_1_);
    }

    protected boolean func_40403_a(DatagramSocket p_40403_1_, boolean p_40403_2_)
    {
        func_40406_a((new StringBuilder()).append("closeSocket: ").append(p_40403_1_).toString());
        if(null == p_40403_1_)
        {
            return false;
        }
        boolean flag = false;
        if(!p_40403_1_.isClosed())
        {
            p_40403_1_.close();
            flag = true;
        }
        if(p_40403_2_)
        {
            field_40416_e.remove(p_40403_1_);
        }
        return flag;
    }

    protected boolean func_40411_a(ServerSocket p_40411_1_)
    {
        return func_40404_a(p_40411_1_, true);
    }

    protected boolean func_40404_a(ServerSocket p_40404_1_, boolean p_40404_2_)
    {
        func_40406_a((new StringBuilder()).append("closeSocket: ").append(p_40404_1_).toString());
        if(null == p_40404_1_)
        {
            return false;
        }
        boolean flag = false;
        try
        {
            if(!p_40404_1_.isClosed())
            {
                p_40404_1_.close();
                flag = true;
            }
        }
        catch(IOException ioexception)
        {
            func_40405_c((new StringBuilder()).append("IO: ").append(ioexception.getMessage()).toString());
        }
        if(p_40404_2_)
        {
            field_40414_f.remove(p_40404_1_);
        }
        return flag;
    }

    protected void func_40410_d()
    {
        func_40412_a(false);
    }

    protected void func_40412_a(boolean p_40412_1_)
    {
        int i = 0;
        Iterator iterator = field_40416_e.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            DatagramSocket datagramsocket = (DatagramSocket)iterator.next();
            if(func_40403_a(datagramsocket, false))
            {
                i++;
            }
        } while(true);
        field_40416_e.clear();
        iterator = field_40414_f.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            ServerSocket serversocket = (ServerSocket)iterator.next();
            if(func_40404_a(serversocket, false))
            {
                i++;
            }
        } while(true);
        field_40414_f.clear();
        if(p_40412_1_ && 0 < i)
        {
            func_40405_c((new StringBuilder()).append("Force closed ").append(i).append(" sockets").toString());
        }
    }
}
