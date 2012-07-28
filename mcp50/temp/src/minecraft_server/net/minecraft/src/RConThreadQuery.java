// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.net.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            RConThreadBase, IServer, RConOutputStream, RConUtils, 
//            RConThreadQueryAuth

public class RConThreadQuery extends RConThreadBase
{

    private long field_40437_g;
    private int field_40444_h;
    private int field_40445_i;
    private int field_40442_j;
    private String field_40443_k;
    private String field_40440_l;
    private DatagramSocket field_40441_m;
    private byte field_40438_n[];
    private DatagramPacket field_40439_o;
    private HashMap field_40452_p;
    private String field_40451_q;
    private String field_40450_r;
    private HashMap field_40449_s;
    private long field_40448_t;
    private RConOutputStream field_40447_u;
    private long field_40446_v;

    public RConThreadQuery(IServer p_i476_1_)
    {
        super(p_i476_1_);
        field_40441_m = null;
        field_40438_n = new byte[1460];
        field_40439_o = null;
        field_40444_h = p_i476_1_.func_40011_a("query.port", 0);
        field_40450_r = p_i476_1_.func_40009_f();
        field_40445_i = p_i476_1_.func_40022_g();
        field_40443_k = p_i476_1_.func_40014_h();
        field_40442_j = p_i476_1_.func_40015_k();
        field_40440_l = p_i476_1_.func_40024_m();
        field_40446_v = 0L;
        field_40451_q = "0.0.0.0";
        if(0 == field_40450_r.length() || field_40451_q.equals(field_40450_r))
        {
            field_40450_r = "0.0.0.0";
            try
            {
                InetAddress inetaddress = InetAddress.getLocalHost();
                field_40451_q = inetaddress.getHostAddress();
            }
            catch(UnknownHostException unknownhostexception)
            {
                func_40405_c((new StringBuilder()).append("Unable to determine local host IP, please set server-ip in '").append(p_i476_1_.func_40013_e()).append("' : ").append(unknownhostexception.getMessage()).toString());
            }
        } else
        {
            field_40451_q = field_40450_r;
        }
        if(0 == field_40444_h)
        {
            field_40444_h = field_40445_i;
            func_40408_b((new StringBuilder()).append("Setting default query port to ").append(field_40444_h).toString());
            p_i476_1_.func_40017_a("query.port", Integer.valueOf(field_40444_h));
            p_i476_1_.func_40017_a("debug", Boolean.valueOf(false));
            p_i476_1_.func_40019_c();
        }
        field_40452_p = new HashMap();
        field_40447_u = new RConOutputStream(1460);
        field_40449_s = new HashMap();
        field_40448_t = (new Date()).getTime();
    }

    private void func_40428_a(byte p_40428_1_[], DatagramPacket p_40428_2_)
        throws SocketException, IOException
    {
        field_40441_m.send(new DatagramPacket(p_40428_1_, p_40428_1_.length, p_40428_2_.getSocketAddress()));
    }

    private boolean func_40430_a(DatagramPacket p_40430_1_)
        throws IOException
    {
        byte abyte0[] = p_40430_1_.getData();
        int i = p_40430_1_.getLength();
        SocketAddress socketaddress = p_40430_1_.getSocketAddress();
        func_40406_a((new StringBuilder()).append("Packet len ").append(i).append(" [").append(socketaddress).append("]").toString());
        if(3 > i || -2 != abyte0[0] || -3 != abyte0[1])
        {
            func_40406_a((new StringBuilder()).append("Invalid packet [").append(socketaddress).append("]").toString());
            return false;
        }
        func_40406_a((new StringBuilder()).append("Packet '").append(RConUtils.func_40584_a(abyte0[2])).append("' [").append(socketaddress).append("]").toString());
        switch(abyte0[2])
        {
        case 9: // '\t'
            func_40431_d(p_40430_1_);
            func_40406_a((new StringBuilder()).append("Challenge [").append(socketaddress).append("]").toString());
            return true;

        case 0: // '\0'
            if(!func_40436_c(p_40430_1_).booleanValue())
            {
                func_40406_a((new StringBuilder()).append("Invalid challenge [").append(socketaddress).append("]").toString());
                return false;
            }
            if(15 != i)
            {
                RConOutputStream rconoutputstream = new RConOutputStream(1460);
                rconoutputstream.func_40393_a(0);
                rconoutputstream.func_40396_a(func_40435_a(p_40430_1_.getSocketAddress()));
                rconoutputstream.func_40397_a(field_40443_k);
                rconoutputstream.func_40397_a("SMP");
                rconoutputstream.func_40397_a(field_40440_l);
                rconoutputstream.func_40397_a(Integer.toString(func_40407_c()));
                rconoutputstream.func_40397_a(Integer.toString(field_40442_j));
                rconoutputstream.func_40394_a((short)field_40445_i);
                rconoutputstream.func_40397_a(field_40451_q);
                func_40428_a(rconoutputstream.func_40398_a(), p_40430_1_);
                func_40406_a((new StringBuilder()).append("Status [").append(socketaddress).append("]").toString());
            } else
            {
                func_40428_a(func_40434_b(p_40430_1_), p_40430_1_);
                func_40406_a((new StringBuilder()).append("Rules [").append(socketaddress).append("]").toString());
            }
            break;
        }
        return true;
    }

    private byte[] func_40434_b(DatagramPacket p_40434_1_)
        throws IOException
    {
        long l = System.currentTimeMillis();
        if(l < field_40446_v + 5000L)
        {
            byte abyte0[] = field_40447_u.func_40398_a();
            byte abyte1[] = func_40435_a(p_40434_1_.getSocketAddress());
            abyte0[1] = abyte1[0];
            abyte0[2] = abyte1[1];
            abyte0[3] = abyte1[2];
            abyte0[4] = abyte1[3];
            return abyte0;
        }
        field_40446_v = l;
        field_40447_u.func_40395_b();
        field_40447_u.func_40393_a(0);
        field_40447_u.func_40396_a(func_40435_a(p_40434_1_.getSocketAddress()));
        field_40447_u.func_40397_a("splitnum");
        field_40447_u.func_40393_a(128);
        field_40447_u.func_40393_a(0);
        field_40447_u.func_40397_a("hostname");
        field_40447_u.func_40397_a(field_40443_k);
        field_40447_u.func_40397_a("gametype");
        field_40447_u.func_40397_a("SMP");
        field_40447_u.func_40397_a("game_id");
        field_40447_u.func_40397_a("MINECRAFT");
        field_40447_u.func_40397_a("version");
        field_40447_u.func_40397_a(field_40417_b.func_40012_i());
        field_40447_u.func_40397_a("plugins");
        field_40447_u.func_40397_a(field_40417_b.func_40020_n());
        field_40447_u.func_40397_a("map");
        field_40447_u.func_40397_a(field_40440_l);
        field_40447_u.func_40397_a("numplayers");
        field_40447_u.func_40397_a((new StringBuilder()).append("").append(func_40407_c()).toString());
        field_40447_u.func_40397_a("maxplayers");
        field_40447_u.func_40397_a((new StringBuilder()).append("").append(field_40442_j).toString());
        field_40447_u.func_40397_a("hostport");
        field_40447_u.func_40397_a((new StringBuilder()).append("").append(field_40445_i).toString());
        field_40447_u.func_40397_a("hostip");
        field_40447_u.func_40397_a(field_40451_q);
        field_40447_u.func_40393_a(0);
        field_40447_u.func_40393_a(1);
        field_40447_u.func_40397_a("player_");
        field_40447_u.func_40393_a(0);
        String as[] = field_40417_b.func_40016_l();
        byte byte0 = (byte)as.length;
        for(byte byte1 = (byte)(byte0 - 1); byte1 >= 0; byte1--)
        {
            field_40447_u.func_40397_a(as[byte1]);
        }

        field_40447_u.func_40393_a(0);
        return field_40447_u.func_40398_a();
    }

    private byte[] func_40435_a(SocketAddress p_40435_1_)
    {
        return ((RConThreadQueryAuth)field_40449_s.get(p_40435_1_)).func_40383_c();
    }

    private Boolean func_40436_c(DatagramPacket p_40436_1_)
    {
        SocketAddress socketaddress = p_40436_1_.getSocketAddress();
        if(!field_40449_s.containsKey(socketaddress))
        {
            return Boolean.valueOf(false);
        }
        byte abyte0[] = p_40436_1_.getData();
        if(((RConThreadQueryAuth)field_40449_s.get(socketaddress)).func_40384_a() != RConUtils.func_40585_c(abyte0, 7, p_40436_1_.getLength()))
        {
            return Boolean.valueOf(false);
        } else
        {
            return Boolean.valueOf(true);
        }
    }

    private void func_40431_d(DatagramPacket p_40431_1_)
        throws SocketException, IOException
    {
        RConThreadQueryAuth rconthreadqueryauth = new RConThreadQueryAuth(this, p_40431_1_);
        field_40449_s.put(p_40431_1_.getSocketAddress(), rconthreadqueryauth);
        func_40428_a(rconthreadqueryauth.func_40386_b(), p_40431_1_);
    }

    private void func_40432_e()
    {
        if(!field_40419_a)
        {
            return;
        }
        long l = System.currentTimeMillis();
        if(l < field_40437_g + 30000L)
        {
            return;
        }
        field_40437_g = l;
        Iterator iterator = field_40449_s.entrySet().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if(((RConThreadQueryAuth)entry.getValue()).func_40385_a(l).booleanValue())
            {
                iterator.remove();
            }
        } while(true);
    }

    public void run()
    {
        func_40408_b((new StringBuilder()).append("Query running on ").append(field_40450_r).append(":").append(field_40444_h).toString());
        field_40437_g = System.currentTimeMillis();
        field_40439_o = new DatagramPacket(field_40438_n, field_40438_n.length);
        try
        {
            while(field_40419_a) 
            {
                try
                {
                    field_40441_m.receive(field_40439_o);
                    func_40432_e();
                    func_40430_a(field_40439_o);
                }
                catch(SocketTimeoutException sockettimeoutexception)
                {
                    func_40432_e();
                }
                catch(PortUnreachableException portunreachableexception) { }
                catch(IOException ioexception)
                {
                    func_40433_a(ioexception);
                }
            }
        }
        finally
        {
            func_40410_d();
        }
    }

    public void func_40402_a()
    {
        if(field_40419_a)
        {
            return;
        }
        if(0 >= field_40444_h || 65535 < field_40444_h)
        {
            func_40405_c((new StringBuilder()).append("Invalid query port ").append(field_40444_h).append(" found in '").append(field_40417_b.func_40013_e()).append("' (queries disabled)").toString());
            return;
        }
        if(func_40429_f())
        {
            super.func_40402_a();
        }
    }

    private void func_40433_a(Exception p_40433_1_)
    {
        if(!field_40419_a)
        {
            return;
        }
        func_40405_c((new StringBuilder()).append("Unexpected exception, buggy JRE? (").append(p_40433_1_.toString()).append(")").toString());
        if(!func_40429_f())
        {
            func_40409_d("Failed to recover from buggy JRE, shutting down!");
            field_40419_a = false;
            field_40417_b.func_40010_o();
        }
    }

    private boolean func_40429_f()
    {
        try
        {
            field_40441_m = new DatagramSocket(field_40444_h, InetAddress.getByName(field_40450_r));
            func_40401_a(field_40441_m);
            field_40441_m.setSoTimeout(500);
            return true;
        }
        catch(SocketException socketexception)
        {
            func_40405_c((new StringBuilder()).append("Unable to initialise query system on ").append(field_40450_r).append(":").append(field_40444_h).append(" (Socket): ").append(socketexception.getMessage()).toString());
        }
        catch(UnknownHostException unknownhostexception)
        {
            func_40405_c((new StringBuilder()).append("Unable to initialise query system on ").append(field_40450_r).append(":").append(field_40444_h).append(" (Unknown Host): ").append(unknownhostexception.getMessage()).toString());
        }
        catch(Exception exception)
        {
            func_40405_c((new StringBuilder()).append("Unable to initialise query system on ").append(field_40450_r).append(":").append(field_40444_h).append(" (E): ").append(exception.getMessage()).toString());
        }
        return false;
    }
}
