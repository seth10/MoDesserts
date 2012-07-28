// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            RegionFile

public class RegionFileCache
{

    private static final Map field_22125_a = new HashMap();

    private RegionFileCache()
    {
    }

    public static synchronized RegionFile func_22123_a(File p_22123_0_, int p_22123_1_, int p_22123_2_)
    {
        File file = new File(p_22123_0_, "region");
        File file1 = new File(file, (new StringBuilder()).append("r.").append(p_22123_1_ >> 5).append(".").append(p_22123_2_ >> 5).append(".mca").toString());
        Reference reference = (Reference)field_22125_a.get(file1);
        if(reference != null)
        {
            RegionFile regionfile = (RegionFile)reference.get();
            if(regionfile != null)
            {
                return regionfile;
            }
        }
        if(!file.exists())
        {
            file.mkdirs();
        }
        if(field_22125_a.size() >= 256)
        {
            func_22122_a();
        }
        RegionFile regionfile1 = new RegionFile(file1);
        field_22125_a.put(file1, new SoftReference(regionfile1));
        return regionfile1;
    }

    public static synchronized void func_22122_a()
    {
        Iterator iterator = field_22125_a.values().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Reference reference = (Reference)iterator.next();
            try
            {
                RegionFile regionfile = (RegionFile)reference.get();
                if(regionfile != null)
                {
                    regionfile.func_22126_b();
                }
            }
            catch(IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        } while(true);
        field_22125_a.clear();
    }

    public static DataInputStream func_22124_c(File p_22124_0_, int p_22124_1_, int p_22124_2_)
    {
        RegionFile regionfile = func_22123_a(p_22124_0_, p_22124_1_, p_22124_2_);
        return regionfile.func_22140_a(p_22124_1_ & 0x1f, p_22124_2_ & 0x1f);
    }

    public static DataOutputStream func_22120_d(File p_22120_0_, int p_22120_1_, int p_22120_2_)
    {
        RegionFile regionfile = func_22123_a(p_22120_0_, p_22120_1_, p_22120_2_);
        return regionfile.func_22135_b(p_22120_1_ & 0x1f, p_22120_2_ & 0x1f);
    }

}
