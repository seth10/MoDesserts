// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase, NBTTagByte, NBTTagShort, NBTTagInt, 
//            NBTTagLong, NBTTagFloat, NBTTagDouble, NBTTagString, 
//            NBTTagByteArray, NBTTagIntArray, NBTTagList

public class NBTTagCompound extends NBTBase
{

    private Map field_738_a;

    public NBTTagCompound()
    {
        super("");
        field_738_a = new HashMap();
    }

    public NBTTagCompound(String p_i329_1_)
    {
        super(p_i329_1_);
        field_738_a = new HashMap();
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        NBTBase nbtbase;
        for(Iterator iterator = field_738_a.values().iterator(); iterator.hasNext(); NBTBase.func_380_a(nbtbase, p_381_1_))
        {
            nbtbase = (NBTBase)iterator.next();
        }

        p_381_1_.writeByte(0);
    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        field_738_a.clear();
        NBTBase nbtbase;
        for(; (nbtbase = NBTBase.func_383_b(p_382_1_)).func_379_a() != 0; field_738_a.put(nbtbase.func_384_c(), nbtbase)) { }
    }

    public Collection func_28107_c()
    {
        return field_738_a.values();
    }

    public byte func_379_a()
    {
        return 10;
    }

    public void func_399_a(String p_399_1_, NBTBase p_399_2_)
    {
        field_738_a.put(p_399_1_, p_399_2_.func_385_m(p_399_1_));
    }

    public void func_409_a(String p_409_1_, byte p_409_2_)
    {
        field_738_a.put(p_409_1_, new NBTTagByte(p_409_1_, p_409_2_));
    }

    public void func_394_a(String p_394_1_, short p_394_2_)
    {
        field_738_a.put(p_394_1_, new NBTTagShort(p_394_1_, p_394_2_));
    }

    public void func_405_a(String p_405_1_, int p_405_2_)
    {
        field_738_a.put(p_405_1_, new NBTTagInt(p_405_1_, p_405_2_));
    }

    public void func_396_a(String p_396_1_, long p_396_2_)
    {
        field_738_a.put(p_396_1_, new NBTTagLong(p_396_1_, p_396_2_));
    }

    public void func_390_a(String p_390_1_, float p_390_2_)
    {
        field_738_a.put(p_390_1_, new NBTTagFloat(p_390_1_, p_390_2_));
    }

    public void func_411_a(String p_411_1_, double p_411_2_)
    {
        field_738_a.put(p_411_1_, new NBTTagDouble(p_411_1_, p_411_2_));
    }

    public void func_403_a(String p_403_1_, String p_403_2_)
    {
        field_738_a.put(p_403_1_, new NBTTagString(p_403_1_, p_403_2_));
    }

    public void func_391_a(String p_391_1_, byte p_391_2_[])
    {
        field_738_a.put(p_391_1_, new NBTTagByteArray(p_391_1_, p_391_2_));
    }

    public void func_48446_a(String p_48446_1_, int p_48446_2_[])
    {
        field_738_a.put(p_48446_1_, new NBTTagIntArray(p_48446_1_, p_48446_2_));
    }

    public void func_392_a(String p_392_1_, NBTTagCompound p_392_2_)
    {
        field_738_a.put(p_392_1_, p_392_2_.func_385_m(p_392_1_));
    }

    public void func_393_a(String p_393_1_, boolean p_393_2_)
    {
        func_409_a(p_393_1_, ((byte)(p_393_2_ ? 1 : 0)));
    }

    public NBTBase func_40469_b(String p_40469_1_)
    {
        return (NBTBase)field_738_a.get(p_40469_1_);
    }

    public boolean func_410_a(String p_410_1_)
    {
        return field_738_a.containsKey(p_410_1_);
    }

    public byte func_408_b(String p_408_1_)
    {
        if(!field_738_a.containsKey(p_408_1_))
        {
            return 0;
        } else
        {
            return ((NBTTagByte)field_738_a.get(p_408_1_)).field_741_a;
        }
    }

    public short func_406_c(String p_406_1_)
    {
        if(!field_738_a.containsKey(p_406_1_))
        {
            return 0;
        } else
        {
            return ((NBTTagShort)field_738_a.get(p_406_1_)).field_734_a;
        }
    }

    public int func_395_d(String p_395_1_)
    {
        if(!field_738_a.containsKey(p_395_1_))
        {
            return 0;
        } else
        {
            return ((NBTTagInt)field_738_a.get(p_395_1_)).field_742_a;
        }
    }

    public long func_404_e(String p_404_1_)
    {
        if(!field_738_a.containsKey(p_404_1_))
        {
            return 0L;
        } else
        {
            return ((NBTTagLong)field_738_a.get(p_404_1_)).field_740_a;
        }
    }

    public float func_389_f(String p_389_1_)
    {
        if(!field_738_a.containsKey(p_389_1_))
        {
            return 0.0F;
        } else
        {
            return ((NBTTagFloat)field_738_a.get(p_389_1_)).field_739_a;
        }
    }

    public double func_398_g(String p_398_1_)
    {
        if(!field_738_a.containsKey(p_398_1_))
        {
            return 0.0D;
        } else
        {
            return ((NBTTagDouble)field_738_a.get(p_398_1_)).field_735_a;
        }
    }

    public String func_401_h(String p_401_1_)
    {
        if(!field_738_a.containsKey(p_401_1_))
        {
            return "";
        } else
        {
            return ((NBTTagString)field_738_a.get(p_401_1_)).field_732_a;
        }
    }

    public byte[] func_400_i(String p_400_1_)
    {
        if(!field_738_a.containsKey(p_400_1_))
        {
            return new byte[0];
        } else
        {
            return ((NBTTagByteArray)field_738_a.get(p_400_1_)).field_733_a;
        }
    }

    public int[] func_48445_l(String p_48445_1_)
    {
        if(!field_738_a.containsKey(p_48445_1_))
        {
            return new int[0];
        } else
        {
            return ((NBTTagIntArray)field_738_a.get(p_48445_1_)).field_48447_a;
        }
    }

    public NBTTagCompound func_397_j(String p_397_1_)
    {
        if(!field_738_a.containsKey(p_397_1_))
        {
            return new NBTTagCompound(p_397_1_);
        } else
        {
            return (NBTTagCompound)field_738_a.get(p_397_1_);
        }
    }

    public NBTTagList func_407_k(String p_407_1_)
    {
        if(!field_738_a.containsKey(p_407_1_))
        {
            return new NBTTagList(p_407_1_);
        } else
        {
            return (NBTTagList)field_738_a.get(p_407_1_);
        }
    }

    public boolean func_402_l(String p_402_1_)
    {
        return func_408_b(p_402_1_) != 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_738_a.size()).append(" entries").toString();
    }

    public NBTBase func_40468_b()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound(func_384_c());
        String s;
        for(Iterator iterator = field_738_a.keySet().iterator(); iterator.hasNext(); nbttagcompound.func_399_a(s, ((NBTBase)field_738_a.get(s)).func_40468_b()))
        {
            s = (String)iterator.next();
        }

        return nbttagcompound;
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)p_equals_1_;
            return field_738_a.entrySet().equals(nbttagcompound.field_738_a.entrySet());
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_738_a.hashCode();
    }
}
