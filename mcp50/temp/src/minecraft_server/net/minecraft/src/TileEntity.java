// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            NBTTagCompound, World, TileEntityFurnace, TileEntityChest, 
//            TileEntityRecordPlayer, TileEntityDispenser, TileEntitySign, TileEntityMobSpawner, 
//            TileEntityNote, TileEntityPiston, TileEntityBrewingStand, TileEntityEnchantmentTable, 
//            TileEntityEndPortal, Block, Packet

public class TileEntity
{

    private static Map field_481_e = new HashMap();
    private static Map field_480_f = new HashMap();
    public World field_479_a;
    public int field_478_b;
    public int field_483_c;
    public int field_482_d;
    protected boolean field_31006_h;
    public int field_35165_n;
    public Block field_35166_o;

    public TileEntity()
    {
        field_35165_n = -1;
    }

    private static void func_187_a(Class p_187_0_, String p_187_1_)
    {
        if(field_480_f.containsKey(p_187_1_))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate id: ").append(p_187_1_).toString());
        } else
        {
            field_481_e.put(p_187_1_, p_187_0_);
            field_480_f.put(p_187_0_, p_187_1_);
            return;
        }
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        field_478_b = p_186_1_.func_395_d("x");
        field_483_c = p_186_1_.func_395_d("y");
        field_482_d = p_186_1_.func_395_d("z");
    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        String s = (String)field_480_f.get(getClass());
        if(s == null)
        {
            throw new RuntimeException((new StringBuilder()).append(getClass()).append(" is missing a mapping! This is a bug!").toString());
        } else
        {
            p_188_1_.func_403_a("id", s);
            p_188_1_.func_405_a("x", field_478_b);
            p_188_1_.func_405_a("y", field_483_c);
            p_188_1_.func_405_a("z", field_482_d);
            return;
        }
    }

    public void func_184_b()
    {
    }

    public static TileEntity func_185_c(NBTTagCompound p_185_0_)
    {
        TileEntity tileentity = null;
        try
        {
            Class class1 = (Class)field_481_e.get(p_185_0_.func_401_h("id"));
            if(class1 != null)
            {
                tileentity = (TileEntity)class1.newInstance();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(tileentity != null)
        {
            tileentity.func_186_a(p_185_0_);
        } else
        {
            System.out.println((new StringBuilder()).append("Skipping TileEntity with id ").append(p_185_0_.func_401_h("id")).toString());
        }
        return tileentity;
    }

    public int func_31005_e()
    {
        if(field_35165_n == -1)
        {
            field_35165_n = field_479_a.func_446_b(field_478_b, field_483_c, field_482_d);
        }
        return field_35165_n;
    }

    public void func_183_c()
    {
        if(field_479_a != null)
        {
            field_35165_n = field_479_a.func_446_b(field_478_b, field_483_c, field_482_d);
            field_479_a.func_515_b(field_478_b, field_483_c, field_482_d, this);
        }
    }

    public Packet func_20070_f()
    {
        return null;
    }

    public boolean func_31004_g()
    {
        return field_31006_h;
    }

    public void func_31003_h()
    {
        field_31006_h = true;
    }

    public void func_31002_j()
    {
        field_31006_h = false;
    }

    public void func_35163_b(int i, int j)
    {
    }

    public void func_35164_g()
    {
        field_35166_o = null;
        field_35165_n = -1;
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
        func_187_a(net.minecraft.src.TileEntityFurnace.class, "Furnace");
        func_187_a(net.minecraft.src.TileEntityChest.class, "Chest");
        func_187_a(net.minecraft.src.TileEntityRecordPlayer.class, "RecordPlayer");
        func_187_a(net.minecraft.src.TileEntityDispenser.class, "Trap");
        func_187_a(net.minecraft.src.TileEntitySign.class, "Sign");
        func_187_a(net.minecraft.src.TileEntityMobSpawner.class, "MobSpawner");
        func_187_a(net.minecraft.src.TileEntityNote.class, "Music");
        func_187_a(net.minecraft.src.TileEntityPiston.class, "Piston");
        func_187_a(net.minecraft.src.TileEntityBrewingStand.class, "Cauldron");
        func_187_a(net.minecraft.src.TileEntityEnchantmentTable.class, "EnchantTable");
        func_187_a(net.minecraft.src.TileEntityEndPortal.class, "Airportal");
    }
}
