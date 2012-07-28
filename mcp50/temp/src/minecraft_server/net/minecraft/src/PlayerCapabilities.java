// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NBTTagCompound

public class PlayerCapabilities
{

    public boolean field_35660_a;
    public boolean field_35658_b;
    public boolean field_35659_c;
    public boolean field_35657_d;

    public PlayerCapabilities()
    {
        field_35660_a = false;
        field_35658_b = false;
        field_35659_c = false;
        field_35657_d = false;
    }

    public void func_40621_a(NBTTagCompound p_40621_1_)
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.func_393_a("invulnerable", field_35660_a);
        nbttagcompound.func_393_a("flying", field_35658_b);
        nbttagcompound.func_393_a("mayfly", field_35659_c);
        nbttagcompound.func_393_a("instabuild", field_35657_d);
        p_40621_1_.func_399_a("abilities", nbttagcompound);
    }

    public void func_40620_b(NBTTagCompound p_40620_1_)
    {
        if(p_40620_1_.func_410_a("abilities"))
        {
            NBTTagCompound nbttagcompound = p_40620_1_.func_397_j("abilities");
            field_35660_a = nbttagcompound.func_402_l("invulnerable");
            field_35658_b = nbttagcompound.func_402_l("flying");
            field_35659_c = nbttagcompound.func_402_l("mayfly");
            field_35657_d = nbttagcompound.func_402_l("instabuild");
        }
    }
}
