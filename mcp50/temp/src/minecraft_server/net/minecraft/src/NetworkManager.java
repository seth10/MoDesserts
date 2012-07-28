// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.net.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            NetworkReaderThread, NetworkWriterThread, Packet, NetHandler, 
//            NetworkMasterThread, ThreadMonitorConnection

public class NetworkManager
{

    public static final Object field_1053_a = new Object();
    public static int field_1052_b;
    public static int field_1051_c;
    private Object field_1050_d;
    private Socket field_1049_e;
    private final SocketAddress field_12032_f;
    private DataInputStream field_1048_f;
    private DataOutputStream field_1047_g;
    private boolean field_1046_h;
    private List field_1045_i;
    private List field_1044_j;
    private List field_1043_k;
    private NetHandler field_1042_l;
    private boolean field_1041_m;
    private Thread field_1040_n;
    private Thread field_1039_o;
    private boolean field_1038_p;
    private String field_1037_q;
    private Object field_20176_t[];
    private int field_1036_r;
    private int field_1035_s;
    public static int field_28141_d[] = new int[256];
    public static int field_28140_e[] = new int[256];
    public int field_1034_t;
    private int field_20175_w;

    public NetworkManager(Socket p_i365_1_, String p_i365_2_, NetHandler p_i365_3_)
        throws IOException
    {
        field_1050_d = new Object();
        field_1046_h = true;
        field_1045_i = Collections.synchronizedList(new ArrayList());
        field_1044_j = Collections.synchronizedList(new ArrayList());
        field_1043_k = Collections.synchronizedList(new ArrayList());
        field_1041_m = false;
        field_1038_p = false;
        field_1037_q = "";
        field_1036_r = 0;
        field_1035_s = 0;
        field_1034_t = 0;
        field_20175_w = 50;
        field_1049_e = p_i365_1_;
        field_12032_f = p_i365_1_.getRemoteSocketAddress();
        field_1042_l = p_i365_3_;
        try
        {
            p_i365_1_.setSoTimeout(30000);
            p_i365_1_.setTrafficClass(24);
        }
        catch(SocketException socketexception)
        {
            System.err.println(socketexception.getMessage());
        }
        field_1048_f = new DataInputStream(p_i365_1_.getInputStream());
        field_1047_g = new DataOutputStream(new BufferedOutputStream(p_i365_1_.getOutputStream(), 5120));
        field_1039_o = new NetworkReaderThread(this, (new StringBuilder()).append(p_i365_2_).append(" read thread").toString());
        field_1040_n = new NetworkWriterThread(this, (new StringBuilder()).append(p_i365_2_).append(" write thread").toString());
        field_1039_o.start();
        field_1040_n.start();
    }

    public void func_754_a(NetHandler p_754_1_)
    {
        field_1042_l = p_754_1_;
    }

    public void func_745_a(Packet p_745_1_)
    {
        if(field_1041_m)
        {
            return;
        }
        synchronized(field_1050_d)
        {
            field_1035_s += p_745_1_.func_71_a() + 1;
            if(p_745_1_.field_40_j)
            {
                field_1043_k.add(p_745_1_);
            } else
            {
                field_1044_j.add(p_745_1_);
            }
        }
    }

    private boolean func_746_e()
    {
        boolean flag = false;
        try
        {
            if(!field_1044_j.isEmpty() && (field_1034_t == 0 || System.currentTimeMillis() - ((Packet)field_1044_j.get(0)).field_20009_j >= (long)field_1034_t))
            {
                Packet packet;
                synchronized(field_1050_d)
                {
                    packet = (Packet)field_1044_j.remove(0);
                    field_1035_s -= packet.func_71_a() + 1;
                }
                Packet.func_66_a(packet, field_1047_g);
                field_28140_e[packet.func_69_b()] += packet.func_71_a() + 1;
                flag = true;
            }
            if(field_20175_w-- <= 0 && !field_1043_k.isEmpty() && (field_1034_t == 0 || System.currentTimeMillis() - ((Packet)field_1043_k.get(0)).field_20009_j >= (long)field_1034_t))
            {
                Packet packet1;
                synchronized(field_1050_d)
                {
                    packet1 = (Packet)field_1043_k.remove(0);
                    field_1035_s -= packet1.func_71_a() + 1;
                }
                Packet.func_66_a(packet1, field_1047_g);
                field_28140_e[packet1.func_69_b()] += packet1.func_71_a() + 1;
                field_20175_w = 0;
                flag = true;
            }
        }
        catch(Exception exception)
        {
            if(!field_1038_p)
            {
                func_750_a(exception);
            }
            return false;
        }
        return flag;
    }

    public void func_28138_a()
    {
        field_1039_o.interrupt();
        field_1040_n.interrupt();
    }

    private boolean func_741_f()
    {
        boolean flag = false;
        try
        {
            Packet packet = Packet.func_65_b(field_1048_f, field_1042_l.func_27003_c());
            if(packet != null)
            {
                field_28141_d[packet.func_69_b()] += packet.func_71_a() + 1;
                if(!field_1041_m)
                {
                    field_1045_i.add(packet);
                }
                flag = true;
            } else
            {
                func_753_a("disconnect.endOfStream", new Object[0]);
            }
        }
        catch(Exception exception)
        {
            if(!field_1038_p)
            {
                func_750_a(exception);
            }
            return false;
        }
        return flag;
    }

    private void func_750_a(Exception p_750_1_)
    {
        p_750_1_.printStackTrace();
        func_753_a("disconnect.genericReason", new Object[] {
            (new StringBuilder()).append("Internal exception: ").append(p_750_1_.toString()).toString()
        });
    }

    public void func_753_a(String p_753_1_, Object p_753_2_[])
    {
        if(!field_1046_h)
        {
            return;
        }
        field_1038_p = true;
        field_1037_q = p_753_1_;
        field_20176_t = p_753_2_;
        (new NetworkMasterThread(this)).start();
        field_1046_h = false;
        try
        {
            field_1048_f.close();
            field_1048_f = null;
        }
        catch(Throwable throwable) { }
        try
        {
            field_1047_g.close();
            field_1047_g = null;
        }
        catch(Throwable throwable1) { }
        try
        {
            field_1049_e.close();
            field_1049_e = null;
        }
        catch(Throwable throwable2) { }
    }

    public void func_747_a()
    {
        if(field_1035_s > 0x100000)
        {
            func_753_a("disconnect.overflow", new Object[0]);
        }
        if(field_1045_i.isEmpty())
        {
            if(field_1036_r++ == 1200)
            {
                func_753_a("disconnect.timeout", new Object[0]);
            }
        } else
        {
            field_1036_r = 0;
        }
        Packet packet;
        for(int i = 1000; !field_1045_i.isEmpty() && i-- >= 0; packet.func_72_a(field_1042_l))
        {
            packet = (Packet)field_1045_i.remove(0);
        }

        func_28138_a();
        if(field_1038_p && field_1045_i.isEmpty())
        {
            field_1042_l.func_6_a(field_1037_q, field_20176_t);
        }
    }

    public SocketAddress func_755_b()
    {
        return field_12032_f;
    }

    public void func_752_c()
    {
        if(field_1041_m)
        {
            return;
        } else
        {
            func_28138_a();
            field_1041_m = true;
            field_1039_o.interrupt();
            (new ThreadMonitorConnection(this)).start();
            return;
        }
    }

    public int func_744_d()
    {
        return field_1043_k.size();
    }

    public Socket func_35596_f()
    {
        return field_1049_e;
    }

    static boolean func_743_a(NetworkManager p_743_0_)
    {
        return p_743_0_.field_1046_h;
    }

    static boolean func_740_b(NetworkManager p_740_0_)
    {
        return p_740_0_.field_1041_m;
    }

    static boolean func_751_c(NetworkManager p_751_0_)
    {
        return p_751_0_.func_741_f();
    }

    static boolean func_749_d(NetworkManager p_749_0_)
    {
        return p_749_0_.func_746_e();
    }

    static DataOutputStream func_28136_f(NetworkManager p_28136_0_)
    {
        return p_28136_0_.field_1047_g;
    }

    static boolean func_28135_e(NetworkManager p_28135_0_)
    {
        return p_28135_0_.field_1038_p;
    }

    static void func_30007_a(NetworkManager p_30007_0_, Exception p_30007_1_)
    {
        p_30007_0_.func_750_a(p_30007_1_);
    }

    static Thread func_742_e(NetworkManager p_742_0_)
    {
        return p_742_0_.field_1039_o;
    }

    static Thread func_748_f(NetworkManager p_748_0_)
    {
        return p_748_0_.field_1040_n;
    }

}
