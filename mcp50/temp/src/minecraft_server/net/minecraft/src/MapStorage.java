// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            WorldSavedData, ISaveHandler, CompressedStreamTools, NBTTagCompound, 
//            NBTBase, NBTTagShort

public class MapStorage
{

    private ISaveHandler field_28180_a;
    private Map field_28179_b;
    private List field_28182_c;
    private Map field_28181_d;

    public MapStorage(ISaveHandler p_i177_1_)
    {
        field_28179_b = new HashMap();
        field_28182_c = new ArrayList();
        field_28181_d = new HashMap();
        field_28180_a = p_i177_1_;
        func_28174_b();
    }

    public WorldSavedData func_28178_a(Class p_28178_1_, String p_28178_2_)
    {
        WorldSavedData worldsaveddata = (WorldSavedData)field_28179_b.get(p_28178_2_);
        if(worldsaveddata != null)
        {
            return worldsaveddata;
        }
        if(field_28180_a != null)
        {
            try
            {
                File file = field_28180_a.func_28111_b(p_28178_2_);
                if(file != null && file.exists())
                {
                    try
                    {
                        worldsaveddata = (WorldSavedData)p_28178_1_.getConstructor(new Class[] {
                            java.lang.String.class
                        }).newInstance(new Object[] {
                            p_28178_2_
                        });
                    }
                    catch(Exception exception1)
                    {
                        throw new RuntimeException((new StringBuilder()).append("Failed to instantiate ").append(p_28178_1_.toString()).toString(), exception1);
                    }
                    FileInputStream fileinputstream = new FileInputStream(file);
                    NBTTagCompound nbttagcompound = CompressedStreamTools.func_770_a(fileinputstream);
                    fileinputstream.close();
                    worldsaveddata.func_28148_a(nbttagcompound.func_397_j("data"));
                }
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if(worldsaveddata != null)
        {
            field_28179_b.put(p_28178_2_, worldsaveddata);
            field_28182_c.add(worldsaveddata);
        }
        return worldsaveddata;
    }

    public void func_28177_a(String p_28177_1_, WorldSavedData p_28177_2_)
    {
        if(p_28177_2_ == null)
        {
            throw new RuntimeException("Can't set null data");
        }
        if(field_28179_b.containsKey(p_28177_1_))
        {
            field_28182_c.remove(field_28179_b.remove(p_28177_1_));
        }
        field_28179_b.put(p_28177_1_, p_28177_2_);
        field_28182_c.add(p_28177_2_);
    }

    public void func_28176_a()
    {
        for(int i = 0; i < field_28182_c.size(); i++)
        {
            WorldSavedData worldsaveddata = (WorldSavedData)field_28182_c.get(i);
            if(worldsaveddata.func_28150_b())
            {
                func_28175_a(worldsaveddata);
                worldsaveddata.func_28149_a(false);
            }
        }

    }

    private void func_28175_a(WorldSavedData p_28175_1_)
    {
        if(field_28180_a == null)
        {
            return;
        }
        try
        {
            File file = field_28180_a.func_28111_b(p_28175_1_.field_28152_a);
            if(file != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                p_28175_1_.func_28147_b(nbttagcompound);
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.func_392_a("data", nbttagcompound);
                FileOutputStream fileoutputstream = new FileOutputStream(file);
                CompressedStreamTools.func_769_a(nbttagcompound1, fileoutputstream);
                fileoutputstream.close();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_28174_b()
    {
        try
        {
            field_28181_d.clear();
            if(field_28180_a == null)
            {
                return;
            }
            File file = field_28180_a.func_28111_b("idcounts");
            if(file != null && file.exists())
            {
                DataInputStream datainputstream = new DataInputStream(new FileInputStream(file));
                NBTTagCompound nbttagcompound = CompressedStreamTools.func_774_a(datainputstream);
                datainputstream.close();
                Iterator iterator = nbttagcompound.func_28107_c().iterator();
                do
                {
                    if(!iterator.hasNext())
                    {
                        break;
                    }
                    NBTBase nbtbase = (NBTBase)iterator.next();
                    if(nbtbase instanceof NBTTagShort)
                    {
                        NBTTagShort nbttagshort = (NBTTagShort)nbtbase;
                        String s = nbttagshort.func_384_c();
                        short word0 = nbttagshort.field_734_a;
                        field_28181_d.put(s, Short.valueOf(word0));
                    }
                } while(true);
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public int func_28173_a(String p_28173_1_)
    {
        Short short1 = (Short)field_28181_d.get(p_28173_1_);
        if(short1 == null)
        {
            short1 = Short.valueOf((short)0);
        } else
        {
            Short short2 = short1;
            Short short3 = short1 = Short.valueOf((short)(short1.shortValue() + 1));
            Short _tmp = short2;
        }
        field_28181_d.put(p_28173_1_, short1);
        if(field_28180_a == null)
        {
            return short1.shortValue();
        }
        try
        {
            File file = field_28180_a.func_28111_b("idcounts");
            if(file != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                String s;
                short word0;
                for(Iterator iterator = field_28181_d.keySet().iterator(); iterator.hasNext(); nbttagcompound.func_394_a(s, word0))
                {
                    s = (String)iterator.next();
                    word0 = ((Short)field_28181_d.get(s)).shortValue();
                }

                DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(file));
                CompressedStreamTools.func_771_a(nbttagcompound, dataoutputstream);
                dataoutputstream.close();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return short1.shortValue();
    }
}
