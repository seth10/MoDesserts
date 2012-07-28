// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.File;
import java.io.FileInputStream;

// Referenced classes of package net.minecraft.src:
//            ISaveFormat, CompressedStreamTools, NBTTagCompound, WorldInfo, 
//            SaveHandler, ISaveHandler, IProgressUpdate

public class SaveFormatOld
    implements ISaveFormat
{

    protected final File field_22106_a;

    public SaveFormatOld(File p_i468_1_)
    {
        if(!p_i468_1_.exists())
        {
            p_i468_1_.mkdirs();
        }
        field_22106_a = p_i468_1_;
    }

    public WorldInfo func_22103_b(String p_22103_1_)
    {
        File file = new File(field_22106_a, p_22103_1_);
        if(!file.exists())
        {
            return null;
        }
        File file1 = new File(file, "level.dat");
        if(file1.exists())
        {
            try
            {
                NBTTagCompound nbttagcompound = CompressedStreamTools.func_770_a(new FileInputStream(file1));
                NBTTagCompound nbttagcompound2 = nbttagcompound.func_397_j("Data");
                return new WorldInfo(nbttagcompound2);
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        file1 = new File(file, "level.dat_old");
        if(file1.exists())
        {
            try
            {
                NBTTagCompound nbttagcompound1 = CompressedStreamTools.func_770_a(new FileInputStream(file1));
                NBTTagCompound nbttagcompound3 = nbttagcompound1.func_397_j("Data");
                return new WorldInfo(nbttagcompound3);
            }
            catch(Exception exception1)
            {
                exception1.printStackTrace();
            }
        }
        return null;
    }

    public ISaveHandler func_22105_a(String p_22105_1_, boolean p_22105_2_)
    {
        return new SaveHandler(field_22106_a, p_22105_1_, p_22105_2_);
    }

    public boolean func_22102_a(String p_22102_1_)
    {
        return false;
    }

    public boolean func_22101_a(String p_22101_1_, IProgressUpdate p_22101_2_)
    {
        return false;
    }
}
