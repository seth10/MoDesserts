// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            WatchableObject, Packet, ItemStack, Item, 
//            ChunkCoordinates

public class DataWatcher
{

    private static final HashMap field_21158_a;
    private final Map field_21157_b = new HashMap();
    private boolean field_21159_c;

    public DataWatcher()
    {
    }

    public void func_21153_a(int p_21153_1_, Object p_21153_2_)
    {
        Integer integer = (Integer)field_21158_a.get(p_21153_2_.getClass());
        if(integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown data type: ").append(p_21153_2_.getClass()).toString());
        }
        if(p_21153_1_ > 31)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Data value id is too big with ").append(p_21153_1_).append("! (Max is ").append(31).append(")").toString());
        }
        if(field_21157_b.containsKey(Integer.valueOf(p_21153_1_)))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate id value for ").append(p_21153_1_).append("!").toString());
        } else
        {
            WatchableObject watchableobject = new WatchableObject(integer.intValue(), p_21153_1_, p_21153_2_);
            field_21157_b.put(Integer.valueOf(p_21153_1_), watchableobject);
            return;
        }
    }

    public byte func_21156_a(int p_21156_1_)
    {
        return ((Byte)((WatchableObject)field_21157_b.get(Integer.valueOf(p_21156_1_))).func_21168_b()).byteValue();
    }

    public short func_41048_b(int p_41048_1_)
    {
        return ((Short)((WatchableObject)field_21157_b.get(Integer.valueOf(p_41048_1_))).func_21168_b()).shortValue();
    }

    public int func_25075_b(int p_25075_1_)
    {
        return ((Integer)((WatchableObject)field_21157_b.get(Integer.valueOf(p_25075_1_))).func_21168_b()).intValue();
    }

    public String func_25076_c(int p_25076_1_)
    {
        return (String)((WatchableObject)field_21157_b.get(Integer.valueOf(p_25076_1_))).func_21168_b();
    }

    public void func_21155_b(int p_21155_1_, Object p_21155_2_)
    {
        WatchableObject watchableobject = (WatchableObject)field_21157_b.get(Integer.valueOf(p_21155_1_));
        if(!p_21155_2_.equals(watchableobject.func_21168_b()))
        {
            watchableobject.func_21171_a(p_21155_2_);
            watchableobject.func_21173_a(true);
            field_21159_c = true;
        }
    }

    public boolean func_21150_a()
    {
        return field_21159_c;
    }

    public static void func_21151_a(List p_21151_0_, DataOutputStream p_21151_1_)
        throws IOException
    {
        if(p_21151_0_ != null)
        {
            WatchableObject watchableobject;
            for(Iterator iterator = p_21151_0_.iterator(); iterator.hasNext(); func_21154_a(p_21151_1_, watchableobject))
            {
                watchableobject = (WatchableObject)iterator.next();
            }

        }
        p_21151_1_.writeByte(127);
    }

    public ArrayList func_21148_b()
    {
        ArrayList arraylist = null;
        if(field_21159_c)
        {
            Iterator iterator = field_21157_b.values().iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                WatchableObject watchableobject = (WatchableObject)iterator.next();
                if(watchableobject.func_21170_d())
                {
                    watchableobject.func_21173_a(false);
                    if(arraylist == null)
                    {
                        arraylist = new ArrayList();
                    }
                    arraylist.add(watchableobject);
                }
            } while(true);
        }
        field_21159_c = false;
        return arraylist;
    }

    public void func_21152_a(DataOutputStream p_21152_1_)
        throws IOException
    {
        WatchableObject watchableobject;
        for(Iterator iterator = field_21157_b.values().iterator(); iterator.hasNext(); func_21154_a(p_21152_1_, watchableobject))
        {
            watchableobject = (WatchableObject)iterator.next();
        }

        p_21152_1_.writeByte(127);
    }

    private static void func_21154_a(DataOutputStream p_21154_0_, WatchableObject p_21154_1_)
        throws IOException
    {
        int i = (p_21154_1_.func_21169_c() << 5 | p_21154_1_.func_21172_a() & 0x1f) & 0xff;
        p_21154_0_.writeByte(i);
        switch(p_21154_1_.func_21169_c())
        {
        case 0: // '\0'
            p_21154_0_.writeByte(((Byte)p_21154_1_.func_21168_b()).byteValue());
            break;

        case 1: // '\001'
            p_21154_0_.writeShort(((Short)p_21154_1_.func_21168_b()).shortValue());
            break;

        case 2: // '\002'
            p_21154_0_.writeInt(((Integer)p_21154_1_.func_21168_b()).intValue());
            break;

        case 3: // '\003'
            p_21154_0_.writeFloat(((Float)p_21154_1_.func_21168_b()).floatValue());
            break;

        case 4: // '\004'
            Packet.func_27038_a((String)p_21154_1_.func_21168_b(), p_21154_0_);
            break;

        case 5: // '\005'
            ItemStack itemstack = (ItemStack)p_21154_1_.func_21168_b();
            p_21154_0_.writeShort(itemstack.func_569_a().field_234_aS);
            p_21154_0_.writeByte(itemstack.field_853_a);
            p_21154_0_.writeShort(itemstack.func_21125_h());
            break;

        case 6: // '\006'
            ChunkCoordinates chunkcoordinates = (ChunkCoordinates)p_21154_1_.func_21168_b();
            p_21154_0_.writeInt(chunkcoordinates.field_22216_a);
            p_21154_0_.writeInt(chunkcoordinates.field_529_a);
            p_21154_0_.writeInt(chunkcoordinates.field_528_b);
            break;
        }
    }

    public static List func_21149_a(DataInputStream p_21149_0_)
        throws IOException
    {
        ArrayList arraylist = null;
        for(byte byte0 = p_21149_0_.readByte(); byte0 != 127; byte0 = p_21149_0_.readByte())
        {
            if(arraylist == null)
            {
                arraylist = new ArrayList();
            }
            int i = (byte0 & 0xe0) >> 5;
            int j = byte0 & 0x1f;
            WatchableObject watchableobject = null;
            switch(i)
            {
            case 0: // '\0'
                watchableobject = new WatchableObject(i, j, Byte.valueOf(p_21149_0_.readByte()));
                break;

            case 1: // '\001'
                watchableobject = new WatchableObject(i, j, Short.valueOf(p_21149_0_.readShort()));
                break;

            case 2: // '\002'
                watchableobject = new WatchableObject(i, j, Integer.valueOf(p_21149_0_.readInt()));
                break;

            case 3: // '\003'
                watchableobject = new WatchableObject(i, j, Float.valueOf(p_21149_0_.readFloat()));
                break;

            case 4: // '\004'
                watchableobject = new WatchableObject(i, j, Packet.func_27037_a(p_21149_0_, 64));
                break;

            case 5: // '\005'
                short word0 = p_21149_0_.readShort();
                byte byte1 = p_21149_0_.readByte();
                short word1 = p_21149_0_.readShort();
                watchableobject = new WatchableObject(i, j, new ItemStack(word0, byte1, word1));
                break;

            case 6: // '\006'
                int k = p_21149_0_.readInt();
                int l = p_21149_0_.readInt();
                int i1 = p_21149_0_.readInt();
                watchableobject = new WatchableObject(i, j, new ChunkCoordinates(k, l, i1));
                break;
            }
            arraylist.add(watchableobject);
        }

        return arraylist;
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static 
    {
        field_21158_a = new HashMap();
        field_21158_a.put(java.lang.Byte.class, Integer.valueOf(0));
        field_21158_a.put(java.lang.Short.class, Integer.valueOf(1));
        field_21158_a.put(java.lang.Integer.class, Integer.valueOf(2));
        field_21158_a.put(java.lang.Float.class, Integer.valueOf(3));
        field_21158_a.put(java.lang.String.class, Integer.valueOf(4));
        field_21158_a.put(net.minecraft.src.ItemStack.class, Integer.valueOf(5));
        field_21158_a.put(net.minecraft.src.ChunkCoordinates.class, Integer.valueOf(6));
    }
}
