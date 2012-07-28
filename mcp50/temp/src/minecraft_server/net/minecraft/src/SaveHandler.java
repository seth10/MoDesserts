// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package net.minecraft.src:
//            IPlayerFileData, ISaveHandler, MinecraftException, CompressedStreamTools, 
//            NBTTagCompound, WorldInfo, EntityPlayer, WorldProvider, 
//            IChunkLoader

public class SaveHandler
    implements IPlayerFileData, ISaveHandler
{

    private static final Logger field_1003_a = Logger.getLogger("Minecraft");
    private final File field_22099_b;
    private final File field_1002_b;
    private final File field_28112_d;
    private final long field_22100_d = System.currentTimeMillis();
    private final String field_40258_f;

    public SaveHandler(File p_i142_1_, String p_i142_2_, boolean p_i142_3_)
    {
        field_22099_b = new File(p_i142_1_, p_i142_2_);
        field_22099_b.mkdirs();
        field_1002_b = new File(field_22099_b, "players");
        field_28112_d = new File(field_22099_b, "data");
        field_28112_d.mkdirs();
        field_40258_f = p_i142_2_;
        if(p_i142_3_)
        {
            field_1002_b.mkdirs();
        }
        func_22098_f();
    }

    private void func_22098_f()
    {
        try
        {
            File file = new File(field_22099_b, "session.lock");
            DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(file));
            try
            {
                dataoutputstream.writeLong(field_22100_d);
            }
            finally
            {
                dataoutputstream.close();
            }
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }

    protected File func_22097_a()
    {
        return field_22099_b;
    }

    public void func_22091_b()
    {
        try
        {
            File file = new File(field_22099_b, "session.lock");
            DataInputStream datainputstream = new DataInputStream(new FileInputStream(file));
            try
            {
                if(datainputstream.readLong() != field_22100_d)
                {
                    throw new MinecraftException("The save is being accessed from another location, aborting");
                }
            }
            finally
            {
                datainputstream.close();
            }
        }
        catch(IOException ioexception)
        {
            throw new MinecraftException("Failed to check session lock, aborting");
        }
    }

    public IChunkLoader func_22092_a(WorldProvider p_22092_1_)
    {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }

    public WorldInfo func_22096_c()
    {
        File file = new File(field_22099_b, "level.dat");
        if(file.exists())
        {
            try
            {
                NBTTagCompound nbttagcompound = CompressedStreamTools.func_770_a(new FileInputStream(file));
                NBTTagCompound nbttagcompound2 = nbttagcompound.func_397_j("Data");
                return new WorldInfo(nbttagcompound2);
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        file = new File(field_22099_b, "level.dat_old");
        if(file.exists())
        {
            try
            {
                NBTTagCompound nbttagcompound1 = CompressedStreamTools.func_770_a(new FileInputStream(file));
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

    public void func_22095_a(WorldInfo p_22095_1_, List p_22095_2_)
    {
        NBTTagCompound nbttagcompound = p_22095_1_.func_22183_a(p_22095_2_);
        NBTTagCompound nbttagcompound1 = new NBTTagCompound();
        nbttagcompound1.func_399_a("Data", nbttagcompound);
        try
        {
            File file = new File(field_22099_b, "level.dat_new");
            File file1 = new File(field_22099_b, "level.dat_old");
            File file2 = new File(field_22099_b, "level.dat");
            CompressedStreamTools.func_769_a(nbttagcompound1, new FileOutputStream(file));
            if(file1.exists())
            {
                file1.delete();
            }
            file2.renameTo(file1);
            if(file2.exists())
            {
                file2.delete();
            }
            file.renameTo(file2);
            if(file.exists())
            {
                file.delete();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_22094_a(WorldInfo p_22094_1_)
    {
        NBTTagCompound nbttagcompound = p_22094_1_.func_22185_a();
        NBTTagCompound nbttagcompound1 = new NBTTagCompound();
        nbttagcompound1.func_399_a("Data", nbttagcompound);
        try
        {
            File file = new File(field_22099_b, "level.dat_new");
            File file1 = new File(field_22099_b, "level.dat_old");
            File file2 = new File(field_22099_b, "level.dat");
            CompressedStreamTools.func_769_a(nbttagcompound1, new FileOutputStream(file));
            if(file1.exists())
            {
                file1.delete();
            }
            file2.renameTo(file1);
            if(file2.exists())
            {
                file2.delete();
            }
            file.renameTo(file2);
            if(file.exists())
            {
                file.delete();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_726_a(EntityPlayer p_726_1_)
    {
        try
        {
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            p_726_1_.func_98_d(nbttagcompound);
            File file = new File(field_1002_b, "_tmp_.dat");
            File file1 = new File(field_1002_b, (new StringBuilder()).append(p_726_1_.field_409_aq).append(".dat").toString());
            CompressedStreamTools.func_769_a(nbttagcompound, new FileOutputStream(file));
            if(file1.exists())
            {
                file1.delete();
            }
            file.renameTo(file1);
        }
        catch(Exception exception)
        {
            field_1003_a.warning((new StringBuilder()).append("Failed to save player data for ").append(p_726_1_.field_409_aq).toString());
        }
    }

    public void func_725_b(EntityPlayer p_725_1_)
    {
        NBTTagCompound nbttagcompound = func_25074_a(p_725_1_.field_409_aq);
        if(nbttagcompound != null)
        {
            p_725_1_.func_100_e(nbttagcompound);
        }
    }

    public NBTTagCompound func_25074_a(String p_25074_1_)
    {
        try
        {
            File file = new File(field_1002_b, (new StringBuilder()).append(p_25074_1_).append(".dat").toString());
            if(file.exists())
            {
                return CompressedStreamTools.func_770_a(new FileInputStream(file));
            }
        }
        catch(Exception exception)
        {
            field_1003_a.warning((new StringBuilder()).append("Failed to load player data for ").append(p_25074_1_).toString());
        }
        return null;
    }

    public IPlayerFileData func_22090_d()
    {
        return this;
    }

    public String[] func_52007_g()
    {
        return field_1002_b.list();
    }

    public void func_22093_e()
    {
    }

    public File func_28111_b(String p_28111_1_)
    {
        return new File(field_28112_d, (new StringBuilder()).append(p_28111_1_).append(".dat").toString());
    }

}
