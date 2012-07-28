// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IInventory, ItemStack, EntityPlayer

public class InventoryCraftResult
    implements IInventory
{

    private ItemStack field_20071_a[];

    public InventoryCraftResult()
    {
        field_20071_a = new ItemStack[1];
    }

    public int func_83_a()
    {
        return 1;
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        return field_20071_a[p_82_1_];
    }

    public String func_20068_b()
    {
        return "Result";
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        if(field_20071_a[p_20069_1_] != null)
        {
            ItemStack itemstack = field_20071_a[p_20069_1_];
            field_20071_a[p_20069_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48315_b(int p_48315_1_)
    {
        if(field_20071_a[p_48315_1_] != null)
        {
            ItemStack itemstack = field_20071_a[p_48315_1_];
            field_20071_a[p_48315_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        field_20071_a[p_206_1_] = p_206_2_;
    }

    public int func_202_d()
    {
        return 64;
    }

    public void func_183_c()
    {
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
