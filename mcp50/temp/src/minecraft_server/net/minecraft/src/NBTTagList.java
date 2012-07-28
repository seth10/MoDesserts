// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagList extends NBTBase
{

    private List field_737_a;
    private byte field_736_b;

    public NBTTagList()
    {
        super("");
        field_737_a = new ArrayList();
    }

    public NBTTagList(String p_i447_1_)
    {
        super(p_i447_1_);
        field_737_a = new ArrayList();
    }

    void func_381_a(DataOutput p_381_1_)
        throws IOException
    {
        if(field_737_a.size() > 0)
        {
            field_736_b = ((NBTBase)field_737_a.get(0)).func_379_a();
        } else
        {
            field_736_b = 1;
        }
        p_381_1_.writeByte(field_736_b);
        p_381_1_.writeInt(field_737_a.size());
        for(int i = 0; i < field_737_a.size(); i++)
        {
            ((NBTBase)field_737_a.get(i)).func_381_a(p_381_1_);
        }

    }

    void func_382_a(DataInput p_382_1_)
        throws IOException
    {
        field_736_b = p_382_1_.readByte();
        int i = p_382_1_.readInt();
        field_737_a = new ArrayList();
        for(int j = 0; j < i; j++)
        {
            NBTBase nbtbase = NBTBase.func_378_a(field_736_b, null);
            nbtbase.func_382_a(p_382_1_);
            field_737_a.add(nbtbase);
        }

    }

    public byte func_379_a()
    {
        return 9;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_737_a.size()).append(" entries of type ").append(NBTBase.func_377_b(field_736_b)).toString();
    }

    public void func_386_a(NBTBase p_386_1_)
    {
        field_736_b = p_386_1_.func_379_a();
        field_737_a.add(p_386_1_);
    }

    public NBTBase func_388_a(int p_388_1_)
    {
        return (NBTBase)field_737_a.get(p_388_1_);
    }

    public int func_387_b()
    {
        return field_737_a.size();
    }

    public NBTBase func_40468_b()
    {
        NBTTagList nbttaglist = new NBTTagList(func_384_c());
        nbttaglist.field_736_b = field_736_b;
        NBTBase nbtbase1;
        for(Iterator iterator = field_737_a.iterator(); iterator.hasNext(); nbttaglist.field_737_a.add(nbtbase1))
        {
            NBTBase nbtbase = (NBTBase)iterator.next();
            nbtbase1 = nbtbase.func_40468_b();
        }

        return nbttaglist;
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagList nbttaglist = (NBTTagList)p_equals_1_;
            if(field_736_b == nbttaglist.field_736_b)
            {
                return field_737_a.equals(nbttaglist.field_737_a);
            }
        }
        return false;
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_737_a.hashCode();
    }
}
