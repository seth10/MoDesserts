// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package net.minecraft.src:
//            SaveFormatOld, AnvilSaveHandler, WorldInfo, IProgressUpdate, 
//            WorldType, WorldChunkManagerHell, BiomeGenBase, WorldChunkManager, 
//            ISaveHandler, RegionFile, CompressedStreamTools, NBTTagCompound, 
//            ChunkLoader, AnvilSaveConverterFileFilter

public class AnvilSaveConverter extends SaveFormatOld
{

    public AnvilSaveConverter(File p_i1042_1_)
    {
        super(p_i1042_1_);
    }

    protected int func_48495_a()
    {
        return 19133;
    }

    public ISaveHandler func_22105_a(String p_22105_1_, boolean p_22105_2_)
    {
        return new AnvilSaveHandler(field_22106_a, p_22105_1_, p_22105_2_);
    }

    public boolean func_22102_a(String p_22102_1_)
    {
        WorldInfo worldinfo = func_22103_b(p_22102_1_);
        return worldinfo != null && worldinfo.func_22188_i() != func_48495_a();
    }

    public boolean func_22101_a(String p_22101_1_, IProgressUpdate p_22101_2_)
    {
        p_22101_2_.func_437_a(0);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        File file = new File(field_22106_a, p_22101_1_);
        File file1 = new File(file, "DIM-1");
        File file2 = new File(file, "DIM1");
        System.out.println("Scanning folders...");
        func_48499_a(file, arraylist);
        if(file1.exists())
        {
            func_48499_a(file1, arraylist1);
        }
        if(file2.exists())
        {
            func_48499_a(file2, arraylist2);
        }
        int i = arraylist.size() + arraylist1.size() + arraylist2.size();
        System.out.println((new StringBuilder()).append("Total conversion count is ").append(i).toString());
        WorldInfo worldinfo = func_22103_b(p_22101_1_);
        Object obj = null;
        if(worldinfo.func_46069_q() == WorldType.field_48458_c)
        {
            obj = new WorldChunkManagerHell(BiomeGenBase.field_35520_c, 0.5F, 0.5F);
        } else
        {
            obj = new WorldChunkManager(worldinfo.func_22187_b(), worldinfo.func_46069_q());
        }
        func_48497_a(new File(file, "region"), arraylist, ((WorldChunkManager) (obj)), 0, i, p_22101_2_);
        func_48497_a(new File(file1, "region"), arraylist1, new WorldChunkManagerHell(BiomeGenBase.field_4289_l, 1.0F, 0.0F), arraylist.size(), i, p_22101_2_);
        func_48497_a(new File(file2, "region"), arraylist2, new WorldChunkManagerHell(BiomeGenBase.field_28054_m, 0.5F, 0.0F), arraylist.size() + arraylist1.size(), i, p_22101_2_);
        worldinfo.func_22191_a(19133);
        if(worldinfo.func_46069_q() == WorldType.field_48456_d)
        {
            worldinfo.func_48392_a(WorldType.field_48457_b);
        }
        func_48498_c(p_22101_1_);
        ISaveHandler isavehandler = func_22105_a(p_22101_1_, false);
        isavehandler.func_22094_a(worldinfo);
        return true;
    }

    private void func_48498_c(String p_48498_1_)
    {
        File file = new File(field_22106_a, p_48498_1_);
        if(!file.exists())
        {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
            return;
        }
        File file1 = new File(file, "level.dat");
        if(!file1.exists())
        {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
            return;
        }
        File file2 = new File(file, "level.dat_mcr");
        if(!file1.renameTo(file2))
        {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
        }
    }

    private void func_48497_a(File p_48497_1_, ArrayList p_48497_2_, WorldChunkManager p_48497_3_, int p_48497_4_, int p_48497_5_, IProgressUpdate p_48497_6_)
    {
        int i;
        for(Iterator iterator = p_48497_2_.iterator(); iterator.hasNext(); p_48497_6_.func_437_a(i))
        {
            File file = (File)iterator.next();
            func_48496_a(p_48497_1_, file, p_48497_3_, p_48497_4_, p_48497_5_, p_48497_6_);
            p_48497_4_++;
            i = (int)Math.round((100D * (double)p_48497_4_) / (double)p_48497_5_);
        }

    }

    private void func_48496_a(File p_48496_1_, File p_48496_2_, WorldChunkManager p_48496_3_, int p_48496_4_, int p_48496_5_, IProgressUpdate p_48496_6_)
    {
        try
        {
            String s = p_48496_2_.getName();
            RegionFile regionfile = new RegionFile(p_48496_2_);
            RegionFile regionfile1 = new RegionFile(new File(p_48496_1_, (new StringBuilder()).append(s.substring(0, s.length() - ".mcr".length())).append(".mca").toString()));
            for(int i = 0; i < 32; i++)
            {
                for(int j = 0; j < 32; j++)
                {
                    if(!regionfile.func_22132_c(i, j) || regionfile1.func_22132_c(i, j))
                    {
                        continue;
                    }
                    DataInputStream datainputstream = regionfile.func_22140_a(i, j);
                    if(datainputstream == null)
                    {
                        System.out.println("Failed to fetch input stream");
                    } else
                    {
                        NBTTagCompound nbttagcompound = CompressedStreamTools.func_774_a(datainputstream);
                        datainputstream.close();
                        NBTTagCompound nbttagcompound1 = nbttagcompound.func_397_j("Level");
                        AnvilConverterData anvilconverterdata = ChunkLoader.func_48624_a(nbttagcompound1);
                        NBTTagCompound nbttagcompound2 = new NBTTagCompound();
                        NBTTagCompound nbttagcompound3 = new NBTTagCompound();
                        nbttagcompound2.func_399_a("Level", nbttagcompound3);
                        ChunkLoader.func_48623_a(anvilconverterdata, nbttagcompound3, p_48496_3_);
                        DataOutputStream dataoutputstream = regionfile1.func_22135_b(i, j);
                        CompressedStreamTools.func_771_a(nbttagcompound2, dataoutputstream);
                        dataoutputstream.close();
                    }
                }

                int k = (int)Math.round((100D * (double)(p_48496_4_ * 1024)) / (double)(p_48496_5_ * 1024));
                int l = (int)Math.round((100D * (double)((i + 1) * 32 + p_48496_4_ * 1024)) / (double)(p_48496_5_ * 1024));
                if(l > k)
                {
                    p_48496_6_.func_437_a(l);
                }
            }

            regionfile.func_22126_b();
            regionfile1.func_22126_b();
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    private void func_48499_a(File p_48499_1_, ArrayList p_48499_2_)
    {
        File file = new File(p_48499_1_, "region");
        File afile[] = file.listFiles(new AnvilSaveConverterFileFilter(this));
        if(afile != null)
        {
            File afile1[] = afile;
            int i = afile1.length;
            for(int j = 0; j < i; j++)
            {
                File file1 = afile1[j];
                p_48499_2_.add(file1);
            }

        }
    }
}
