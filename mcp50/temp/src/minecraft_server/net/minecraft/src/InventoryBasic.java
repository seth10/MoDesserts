// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            IInventory, ItemStack, IInvBasic, EntityPlayer

public class InventoryBasic
    implements IInventory
{

    private String field_40087_a;
    private int field_40085_b;
    private ItemStack field_40086_c[];
    private List field_40084_d;

    public InventoryBasic(String p_i390_1_, int p_i390_2_)
    {
        field_40087_a = p_i390_1_;
        field_40085_b = p_i390_2_;
        field_40086_c = new ItemStack[p_i390_2_];
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        return field_40086_c[p_82_1_];
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        if(field_40086_c[p_20069_1_] != null)
        {
            if(field_40086_c[p_20069_1_].field_853_a <= p_20069_2_)
            {
                ItemStack itemstack = field_40086_c[p_20069_1_];
                field_40086_c[p_20069_1_] = null;
                func_183_c();
                return itemstack;
            }
            ItemStack itemstack1 = field_40086_c[p_20069_1_].func_20118_a(p_20069_2_);
            if(field_40086_c[p_20069_1_].field_853_a == 0)
            {
                field_40086_c[p_20069_1_] = null;
            }
            func_183_c();
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48315_b(int p_48315_1_)
    {
        if(field_40086_c[p_48315_1_] != null)
        {
            ItemStack itemstack = field_40086_c[p_48315_1_];
            field_40086_c[p_48315_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        field_40086_c[p_206_1_] = p_206_2_;
        if(p_206_2_ != null && p_206_2_.field_853_a > func_202_d())
        {
            p_206_2_.field_853_a = func_202_d();
        }
        func_183_c();
    }

    public int func_83_a()
    {
        return field_40085_b;
    }

    public String func_20068_b()
    {
        return field_40087_a;
    }

    public int func_202_d()
    {
        return 64;
    }

    public void func_183_c()
    {
        if(field_40084_d != null)
        {
            for(int i = 0; i < field_40084_d.size(); i++)
            {
                ((IInvBasic)field_40084_d.get(i)).func_40581_a(this);
            }

        }
    }

    public boolean func_20067_a_(EntityPlayer p_20067_1_)
    {
        return true;
    }

    public void func_35161_e()
    {
    }

    public void func_35162_t_()
    {
    }
}
