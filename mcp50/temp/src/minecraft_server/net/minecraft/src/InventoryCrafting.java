// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IInventory, ItemStack, Container, EntityPlayer

public class InventoryCrafting
    implements IInventory
{

    private ItemStack field_20076_a[];
    private int field_21085_b;
    private Container field_20077_c;

    public InventoryCrafting(Container p_i300_1_, int p_i300_2_, int p_i300_3_)
    {
        int i = p_i300_2_ * p_i300_3_;
        field_20076_a = new ItemStack[i];
        field_20077_c = p_i300_1_;
        field_21085_b = p_i300_2_;
    }

    public int func_83_a()
    {
        return field_20076_a.length;
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        if(p_82_1_ >= func_83_a())
        {
            return null;
        } else
        {
            return field_20076_a[p_82_1_];
        }
    }

    public ItemStack func_21084_a(int p_21084_1_, int p_21084_2_)
    {
        if(p_21084_1_ < 0 || p_21084_1_ >= field_21085_b)
        {
            return null;
        } else
        {
            int i = p_21084_1_ + p_21084_2_ * field_21085_b;
            return func_82_a(i);
        }
    }

    public String func_20068_b()
    {
        return "container.crafting";
    }

    public ItemStack func_48315_b(int p_48315_1_)
    {
        if(field_20076_a[p_48315_1_] != null)
        {
            ItemStack itemstack = field_20076_a[p_48315_1_];
            field_20076_a[p_48315_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        if(field_20076_a[p_20069_1_] != null)
        {
            if(field_20076_a[p_20069_1_].field_853_a <= p_20069_2_)
            {
                ItemStack itemstack = field_20076_a[p_20069_1_];
                field_20076_a[p_20069_1_] = null;
                field_20077_c.func_20121_a(this);
                return itemstack;
            }
            ItemStack itemstack1 = field_20076_a[p_20069_1_].func_20118_a(p_20069_2_);
            if(field_20076_a[p_20069_1_].field_853_a == 0)
            {
                field_20076_a[p_20069_1_] = null;
            }
            field_20077_c.func_20121_a(this);
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        field_20076_a[p_206_1_] = p_206_2_;
        field_20077_c.func_20121_a(this);
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
