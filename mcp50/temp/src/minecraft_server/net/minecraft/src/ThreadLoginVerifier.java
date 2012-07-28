// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

// Referenced classes of package net.minecraft.src:
//            NetLoginHandler, Packet1Login

class ThreadLoginVerifier extends Thread
{

    final Packet1Login field_972_a; /* synthetic field */
    final NetLoginHandler field_971_b; /* synthetic field */

    ThreadLoginVerifier(NetLoginHandler p_i116_1_, Packet1Login p_i116_2_)
    {
        field_971_b = p_i116_1_;
        field_972_a = p_i116_2_;
        super();
    }

    public void run()
    {
        try
        {
            String s = NetLoginHandler.func_32_a(field_971_b);
            URL url = new URL((new StringBuilder()).append("http://session.minecraft.net/game/checkserver.jsp?user=").append(URLEncoder.encode(field_972_a.field_113_b, "UTF-8")).append("&serverId=").append(URLEncoder.encode(s, "UTF-8")).toString());
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(url.openStream()));
            String s1 = bufferedreader.readLine();
            bufferedreader.close();
            if(s1.equals("YES"))
            {
                NetLoginHandler.func_31_a(field_971_b, field_972_a);
            } else
            {
                field_971_b.func_34_b("Failed to verify username!");
            }
        }
        catch(Exception exception)
        {
            field_971_b.func_34_b((new StringBuilder()).append("Failed to verify username! [internal error ").append(exception).append("]").toString());
            exception.printStackTrace();
        }
    }
}
