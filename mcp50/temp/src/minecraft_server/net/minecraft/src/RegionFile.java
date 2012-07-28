// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.*;

// Referenced classes of package net.minecraft.src:
//            RegionFileChunkBuffer

public class RegionFile
{

    private static final byte field_22143_a[] = new byte[4096];
    private final File field_22142_b;
    private RandomAccessFile field_22149_c;
    private final int field_22148_d[] = new int[1024];
    private final int field_22147_e[] = new int[1024];
    private ArrayList field_22146_f;
    private int field_22145_g;
    private long field_22144_h;

    public RegionFile(File p_i382_1_)
    {
        field_22144_h = 0L;
        field_22142_b = p_i382_1_;
        func_22134_b((new StringBuilder()).append("REGION LOAD ").append(field_22142_b).toString());
        field_22145_g = 0;
        try
        {
            if(p_i382_1_.exists())
            {
                field_22144_h = p_i382_1_.lastModified();
            }
            field_22149_c = new RandomAccessFile(p_i382_1_, "rw");
            if(field_22149_c.length() < 4096L)
            {
                for(int i = 0; i < 1024; i++)
                {
                    field_22149_c.writeInt(0);
                }

                for(int j = 0; j < 1024; j++)
                {
                    field_22149_c.writeInt(0);
                }

                field_22145_g += 8192;
            }
            if((field_22149_c.length() & 4095L) != 0L)
            {
                for(int k = 0; (long)k < (field_22149_c.length() & 4095L); k++)
                {
                    field_22149_c.write(0);
                }

            }
            int l = (int)field_22149_c.length() / 4096;
            field_22146_f = new ArrayList(l);
            for(int i1 = 0; i1 < l; i1++)
            {
                field_22146_f.add(Boolean.valueOf(true));
            }

            field_22146_f.set(0, Boolean.valueOf(false));
            field_22146_f.set(1, Boolean.valueOf(false));
            field_22149_c.seek(0L);
            for(int j1 = 0; j1 < 1024; j1++)
            {
                int l1 = field_22149_c.readInt();
                field_22148_d[j1] = l1;
                if(l1 == 0 || (l1 >> 8) + (l1 & 0xff) > field_22146_f.size())
                {
                    continue;
                }
                for(int j2 = 0; j2 < (l1 & 0xff); j2++)
                {
                    field_22146_f.set((l1 >> 8) + j2, Boolean.valueOf(false));
                }

            }

            for(int k1 = 0; k1 < 1024; k1++)
            {
                int i2 = field_22149_c.readInt();
                field_22147_e[k1] = i2;
            }

        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    private void func_22141_a(String s)
    {
    }

    private void func_22134_b(String p_22134_1_)
    {
        func_22141_a((new StringBuilder()).append(p_22134_1_).append("\n").toString());
    }

    private void func_22129_a(String p_22129_1_, int p_22129_2_, int p_22129_3_, String p_22129_4_)
    {
        func_22141_a((new StringBuilder()).append("REGION ").append(p_22129_1_).append(" ").append(field_22142_b.getName()).append("[").append(p_22129_2_).append(",").append(p_22129_3_).append("] = ").append(p_22129_4_).toString());
    }

    private void func_22127_a(String p_22127_1_, int p_22127_2_, int p_22127_3_, int p_22127_4_, String p_22127_5_)
    {
        func_22141_a((new StringBuilder()).append("REGION ").append(p_22127_1_).append(" ").append(field_22142_b.getName()).append("[").append(p_22127_2_).append(",").append(p_22127_3_).append("] ").append(p_22127_4_).append("B = ").append(p_22127_5_).toString());
    }

    private void func_22131_b(String p_22131_1_, int p_22131_2_, int p_22131_3_, String p_22131_4_)
    {
        func_22129_a(p_22131_1_, p_22131_2_, p_22131_3_, (new StringBuilder()).append(p_22131_4_).append("\n").toString());
    }

    public synchronized DataInputStream func_22140_a(int p_22140_1_, int p_22140_2_)
    {
        if(func_22136_d(p_22140_1_, p_22140_2_))
        {
            func_22131_b("READ", p_22140_1_, p_22140_2_, "out of bounds");
            return null;
        }
        try
        {
            int i = func_22137_e(p_22140_1_, p_22140_2_);
            if(i == 0)
            {
                return null;
            }
            int j = i >> 8;
            int k = i & 0xff;
            if(j + k > field_22146_f.size())
            {
                func_22131_b("READ", p_22140_1_, p_22140_2_, "invalid sector");
                return null;
            }
            field_22149_c.seek(j * 4096);
            int l = field_22149_c.readInt();
            if(l > 4096 * k)
            {
                func_22131_b("READ", p_22140_1_, p_22140_2_, (new StringBuilder()).append("invalid length: ").append(l).append(" > 4096 * ").append(k).toString());
                return null;
            }
            if(l <= 0)
            {
                func_22131_b("READ", p_22140_1_, p_22140_2_, (new StringBuilder()).append("invalid length: ").append(l).append(" < 1").toString());
                return null;
            }
            byte byte0 = field_22149_c.readByte();
            if(byte0 == 1)
            {
                byte abyte0[] = new byte[l - 1];
                field_22149_c.read(abyte0);
                DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(abyte0))));
                return datainputstream;
            }
            if(byte0 == 2)
            {
                byte abyte1[] = new byte[l - 1];
                field_22149_c.read(abyte1);
                DataInputStream datainputstream1 = new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(abyte1))));
                return datainputstream1;
            } else
            {
                func_22131_b("READ", p_22140_1_, p_22140_2_, (new StringBuilder()).append("unknown version ").append(byte0).toString());
                return null;
            }
        }
        catch(IOException ioexception)
        {
            func_22131_b("READ", p_22140_1_, p_22140_2_, "exception");
        }
        return null;
    }

    public DataOutputStream func_22135_b(int p_22135_1_, int p_22135_2_)
    {
        if(func_22136_d(p_22135_1_, p_22135_2_))
        {
            return null;
        } else
        {
            return new DataOutputStream(new DeflaterOutputStream(new RegionFileChunkBuffer(this, p_22135_1_, p_22135_2_)));
        }
    }

    protected synchronized void func_22133_a(int p_22133_1_, int p_22133_2_, byte p_22133_3_[], int p_22133_4_)
    {
        try
        {
            int i = func_22137_e(p_22133_1_, p_22133_2_);
            int j = i >> 8;
            int i1 = i & 0xff;
            int j1 = (p_22133_4_ + 5) / 4096 + 1;
            if(j1 >= 256)
            {
                return;
            }
            if(j != 0 && i1 == j1)
            {
                func_22127_a("SAVE", p_22133_1_, p_22133_2_, p_22133_4_, "rewrite");
                func_22130_a(j, p_22133_3_, p_22133_4_);
            } else
            {
                for(int k1 = 0; k1 < i1; k1++)
                {
                    field_22146_f.set(j + k1, Boolean.valueOf(true));
                }

                int l1 = field_22146_f.indexOf(Boolean.valueOf(true));
                int i2 = 0;
                if(l1 != -1)
                {
                    int j2 = l1;
                    do
                    {
                        if(j2 >= field_22146_f.size())
                        {
                            break;
                        }
                        if(i2 != 0)
                        {
                            if(((Boolean)field_22146_f.get(j2)).booleanValue())
                            {
                                i2++;
                            } else
                            {
                                i2 = 0;
                            }
                        } else
                        if(((Boolean)field_22146_f.get(j2)).booleanValue())
                        {
                            l1 = j2;
                            i2 = 1;
                        }
                        if(i2 >= j1)
                        {
                            break;
                        }
                        j2++;
                    } while(true);
                }
                if(i2 >= j1)
                {
                    func_22127_a("SAVE", p_22133_1_, p_22133_2_, p_22133_4_, "reuse");
                    int k = l1;
                    func_22128_a(p_22133_1_, p_22133_2_, k << 8 | j1);
                    for(int k2 = 0; k2 < j1; k2++)
                    {
                        field_22146_f.set(k + k2, Boolean.valueOf(false));
                    }

                    func_22130_a(k, p_22133_3_, p_22133_4_);
                } else
                {
                    func_22127_a("SAVE", p_22133_1_, p_22133_2_, p_22133_4_, "grow");
                    field_22149_c.seek(field_22149_c.length());
                    int l = field_22146_f.size();
                    for(int l2 = 0; l2 < j1; l2++)
                    {
                        field_22149_c.write(field_22143_a);
                        field_22146_f.add(Boolean.valueOf(false));
                    }

                    field_22145_g += 4096 * j1;
                    func_22130_a(l, p_22133_3_, p_22133_4_);
                    func_22128_a(p_22133_1_, p_22133_2_, l << 8 | j1);
                }
            }
            func_22138_b(p_22133_1_, p_22133_2_, (int)(System.currentTimeMillis() / 1000L));
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    private void func_22130_a(int p_22130_1_, byte p_22130_2_[], int p_22130_3_)
        throws IOException
    {
        func_22134_b((new StringBuilder()).append(" ").append(p_22130_1_).toString());
        field_22149_c.seek(p_22130_1_ * 4096);
        field_22149_c.writeInt(p_22130_3_ + 1);
        field_22149_c.writeByte(2);
        field_22149_c.write(p_22130_2_, 0, p_22130_3_);
    }

    private boolean func_22136_d(int p_22136_1_, int p_22136_2_)
    {
        return p_22136_1_ < 0 || p_22136_1_ >= 32 || p_22136_2_ < 0 || p_22136_2_ >= 32;
    }

    private int func_22137_e(int p_22137_1_, int p_22137_2_)
    {
        return field_22148_d[p_22137_1_ + p_22137_2_ * 32];
    }

    public boolean func_22132_c(int p_22132_1_, int p_22132_2_)
    {
        return func_22137_e(p_22132_1_, p_22132_2_) != 0;
    }

    private void func_22128_a(int p_22128_1_, int p_22128_2_, int p_22128_3_)
        throws IOException
    {
        field_22148_d[p_22128_1_ + p_22128_2_ * 32] = p_22128_3_;
        field_22149_c.seek((p_22128_1_ + p_22128_2_ * 32) * 4);
        field_22149_c.writeInt(p_22128_3_);
    }

    private void func_22138_b(int p_22138_1_, int p_22138_2_, int p_22138_3_)
        throws IOException
    {
        field_22147_e[p_22138_1_ + p_22138_2_ * 32] = p_22138_3_;
        field_22149_c.seek(4096 + (p_22138_1_ + p_22138_2_ * 32) * 4);
        field_22149_c.writeInt(p_22138_3_);
    }

    public void func_22126_b()
        throws IOException
    {
        field_22149_c.close();
    }

}
