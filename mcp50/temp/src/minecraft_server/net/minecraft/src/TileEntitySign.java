// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, NBTTagCompound, Packet130UpdateSign, Packet

public class TileEntitySign extends TileEntity
{

    public String field_485_e[] = {
        "", "", "", ""
    };
    public int field_484_f;
    private boolean field_25053_c;

    public TileEntitySign()
    {
        field_484_f = -1;
        field_25053_c = true;
    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        super.func_188_b(p_188_1_);
        p_188_1_.func_403_a("Text1", field_485_e[0]);
        p_188_1_.func_403_a("Text2", field_485_e[1]);
        p_188_1_.func_403_a("Text3", field_485_e[2]);
        p_188_1_.func_403_a("Text4", field_485_e[3]);
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        field_25053_c = false;
        super.func_186_a(p_186_1_);
        for(int i = 0; i < 4; i++)
        {
            field_485_e[i] = p_186_1_.func_401_h((new StringBuilder()).append("Text").append(i + 1).toString());
            if(field_485_e[i].length() > 15)
            {
                field_485_e[i] = field_485_e[i].substring(0, 15);
            }
        }

    }

    public Packet func_20070_f()
    {
        String as[] = new String[4];
        for(int i = 0; i < 4; i++)
        {
            as[i] = field_485_e[i];
        }

        return new Packet130UpdateSign(field_478_b, field_483_c, field_482_d, as);
    }

    public boolean func_25052_a()
    {
        return field_25053_c;
    }
}
