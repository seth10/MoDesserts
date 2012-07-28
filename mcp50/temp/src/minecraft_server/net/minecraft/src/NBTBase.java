// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTTagEnd, NBTTagByte, NBTTagShort, NBTTagInt, 
//            NBTTagLong, NBTTagFloat, NBTTagDouble, NBTTagByteArray, 
//            NBTTagIntArray, NBTTagString, NBTTagList, NBTTagCompound

public abstract class NBTBase
{

    private String field_731_a;

    abstract void func_381_a(DataOutput dataoutput)
        throws IOException;

    abstract void func_382_a(DataInput datainput)
        throws IOException;

    public abstract byte func_379_a();

    protected NBTBase(String p_i206_1_)
    {
        if(p_i206_1_ == null)
        {
            field_731_a = "";
        } else
        {
            field_731_a = p_i206_1_;
        }
    }

    public NBTBase func_385_m(String p_385_1_)
    {
        if(p_385_1_ == null)
        {
            field_731_a = "";
        } else
        {
            field_731_a = p_385_1_;
        }
        return this;
    }

    public String func_384_c()
    {
        if(field_731_a == null)
        {
            return "";
        } else
        {
            return field_731_a;
        }
    }

    public static NBTBase func_383_b(DataInput p_383_0_)
        throws IOException
    {
        byte byte0 = p_383_0_.readByte();
        if(byte0 == 0)
        {
            return new NBTTagEnd();
        } else
        {
            String s = p_383_0_.readUTF();
            NBTBase nbtbase = func_378_a(byte0, s);
            nbtbase.func_382_a(p_383_0_);
            return nbtbase;
        }
    }

    public static void func_380_a(NBTBase p_380_0_, DataOutput p_380_1_)
        throws IOException
    {
        p_380_1_.writeByte(p_380_0_.func_379_a());
        if(p_380_0_.func_379_a() == 0)
        {
            return;
        } else
        {
            p_380_1_.writeUTF(p_380_0_.func_384_c());
            p_380_0_.func_381_a(p_380_1_);
            return;
        }
    }

    public static NBTBase func_378_a(byte p_378_0_, String p_378_1_)
    {
        switch(p_378_0_)
        {
        case 0: // '\0'
            return new NBTTagEnd();

        case 1: // '\001'
            return new NBTTagByte(p_378_1_);

        case 2: // '\002'
            return new NBTTagShort(p_378_1_);

        case 3: // '\003'
            return new NBTTagInt(p_378_1_);

        case 4: // '\004'
            return new NBTTagLong(p_378_1_);

        case 5: // '\005'
            return new NBTTagFloat(p_378_1_);

        case 6: // '\006'
            return new NBTTagDouble(p_378_1_);

        case 7: // '\007'
            return new NBTTagByteArray(p_378_1_);

        case 11: // '\013'
            return new NBTTagIntArray(p_378_1_);

        case 8: // '\b'
            return new NBTTagString(p_378_1_);

        case 9: // '\t'
            return new NBTTagList(p_378_1_);

        case 10: // '\n'
            return new NBTTagCompound(p_378_1_);
        }
        return null;
    }

    public static String func_377_b(byte p_377_0_)
    {
        switch(p_377_0_)
        {
        case 0: // '\0'
            return "TAG_End";

        case 1: // '\001'
            return "TAG_Byte";

        case 2: // '\002'
            return "TAG_Short";

        case 3: // '\003'
            return "TAG_Int";

        case 4: // '\004'
            return "TAG_Long";

        case 5: // '\005'
            return "TAG_Float";

        case 6: // '\006'
            return "TAG_Double";

        case 7: // '\007'
            return "TAG_Byte_Array";

        case 11: // '\013'
            return "TAG_Int_Array";

        case 8: // '\b'
            return "TAG_String";

        case 9: // '\t'
            return "TAG_List";

        case 10: // '\n'
            return "TAG_Compound";
        }
        return "UNKNOWN";
    }

    public abstract NBTBase func_40468_b();

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ == null || !(p_equals_1_ instanceof NBTBase))
        {
            return false;
        }
        NBTBase nbtbase = (NBTBase)p_equals_1_;
        if(func_379_a() != nbtbase.func_379_a())
        {
            return false;
        }
        if(field_731_a == null && nbtbase.field_731_a != null || field_731_a != null && nbtbase.field_731_a == null)
        {
            return false;
        }
        return field_731_a == null || field_731_a.equals(nbtbase.field_731_a);
    }

    public int hashCode()
    {
        return field_731_a.hashCode() ^ func_379_a();
    }
}
