// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.net.Socket;
import java.net.SocketTimeoutException;

// Referenced classes of package net.minecraft.src:
//            RConThreadBase, IServer, RConUtils

public class RConThreadClient extends RConThreadBase
{

    private boolean field_40457_g;
    private Socket field_40459_h;
    private byte field_40460_i[];
    private String field_40458_j;

    RConThreadClient(IServer p_i362_1_, Socket p_i362_2_)
    {
        super(p_i362_1_);
        field_40457_g = false;
        field_40460_i = new byte[1460];
        field_40459_h = p_i362_2_;
        field_40458_j = p_i362_1_.func_40023_a("rcon.password", "");
        func_40408_b((new StringBuilder()).append("Rcon connection from: ").append(p_i362_2_.getInetAddress()).toString());
    }

    public void run()
    {
        try
        {
            while(true) 
            {
                if(!field_40419_a)
                {
                    break;
                }
                try
                {
                    BufferedInputStream bufferedinputstream = new BufferedInputStream(field_40459_h.getInputStream());
                    int i = bufferedinputstream.read(field_40460_i, 0, 1460);
                    if(10 > i)
                    {
                        return;
                    }
                    int j = 0;
                    int k = RConUtils.func_40586_b(field_40460_i, 0, i);
                    if(k != i - 4)
                    {
                        return;
                    }
                    j += 4;
                    int l = RConUtils.func_40586_b(field_40460_i, j, i);
                    j += 4;
                    int i1 = RConUtils.func_40582_a(field_40460_i, j);
                    j += 4;
                    switch(i1)
                    {
                    case 3: // '\003'
                        String s = RConUtils.func_40583_a(field_40460_i, j, i);
                        j += s.length();
                        if(0 != s.length() && s.equals(field_40458_j))
                        {
                            field_40457_g = true;
                            func_40453_a(l, 2, "");
                        } else
                        {
                            field_40457_g = false;
                            func_40454_e();
                        }
                        break;

                    case 2: // '\002'
                        if(field_40457_g)
                        {
                            String s1 = RConUtils.func_40583_a(field_40460_i, j, i);
                            try
                            {
                                func_40455_a(l, field_40417_b.func_40008_d(s1));
                            }
                            catch(Exception exception1)
                            {
                                func_40455_a(l, (new StringBuilder()).append("Error executing: ").append(s1).append(" (").append(exception1.getMessage()).append(")").toString());
                            }
                        } else
                        {
                            func_40454_e();
                        }
                        break;

                    default:
                        func_40455_a(l, String.format("Unknown request %s", new Object[] {
                            Integer.toHexString(i1)
                        }));
                        break;
                    }
                }
                catch(SocketTimeoutException sockettimeoutexception) { }
                catch(IOException ioexception)
                {
                    if(field_40419_a)
                    {
                        func_40408_b((new StringBuilder()).append("IO: ").append(ioexception.getMessage()).toString());
                    }
                }
            }
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
        finally
        {
            func_40456_f();
        }
    }

    private void func_40453_a(int p_40453_1_, int p_40453_2_, String p_40453_3_)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(1248);
        DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
        dataoutputstream.writeInt(Integer.reverseBytes(p_40453_3_.length() + 10));
        dataoutputstream.writeInt(Integer.reverseBytes(p_40453_1_));
        dataoutputstream.writeInt(Integer.reverseBytes(p_40453_2_));
        dataoutputstream.writeBytes(p_40453_3_);
        dataoutputstream.write(0);
        dataoutputstream.write(0);
        field_40459_h.getOutputStream().write(bytearrayoutputstream.toByteArray());
    }

    private void func_40454_e()
        throws IOException
    {
        func_40453_a(-1, 2, "");
    }

    private void func_40455_a(int p_40455_1_, String p_40455_2_)
        throws IOException
    {
        int i = p_40455_2_.length();
        do
        {
            int j = 4096 > i ? i : 4096;
            func_40453_a(p_40455_1_, 0, p_40455_2_.substring(0, j));
            p_40455_2_ = p_40455_2_.substring(j);
            i = p_40455_2_.length();
        } while(0 != i);
    }

    private void func_40456_f()
    {
        if(null == field_40459_h)
        {
            return;
        }
        try
        {
            field_40459_h.close();
        }
        catch(IOException ioexception)
        {
            func_40405_c((new StringBuilder()).append("IO: ").append(ioexception.getMessage()).toString());
        }
        field_40459_h = null;
    }
}
