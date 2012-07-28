// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            TileEntity, IInventory, ItemStack, NBTTagCompound, 
//            NBTTagList, World, EntityPlayer

public class TileEntityDispenser extends TileEntity
    implements IInventory
{

    private ItemStack field_21081_e[];
    private Random field_21080_f;

    public TileEntityDispenser()
    {
        field_21081_e = new ItemStack[9];
        field_21080_f = new Random();
    }

    public int func_83_a()
    {
        return 9;
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        return field_21081_e[p_82_1_];
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        if(field_21081_e[p_20069_1_] != null)
        {
            if(field_21081_e[p_20069_1_].field_853_a <= p_20069_2_)
            {
                ItemStack itemstack = field_21081_e[p_20069_1_];
                field_21081_e[p_20069_1_] = null;
                func_183_c();
                return itemstack;
            }
            ItemStack itemstack1 = field_21081_e[p_20069_1_].func_20118_a(p_20069_2_);
            if(field_21081_e[p_20069_1_].field_853_a == 0)
            {
                field_21081_e[p_20069_1_] = null;
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
        if(field_21081_e[p_48315_1_] != null)
        {
            ItemStack itemstack = field_21081_e[p_48315_1_];
            field_21081_e[p_48315_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public ItemStack func_21079_e()
    {
        int i = -1;
        int j = 1;
        for(int k = 0; k < field_21081_e.length; k++)
        {
            if(field_21081_e[k] != null && field_21080_f.nextInt(j++) == 0)
            {
                i = k;
            }
        }

        if(i >= 0)
        {
            return func_20069_a(i, 1);
        } else
        {
            return null;
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        field_21081_e[p_206_1_] = p_206_2_;
        if(p_206_2_ != null && p_206_2_.field_853_a > func_202_d())
        {
            p_206_2_.field_853_a = func_202_d();
        }
        func_183_c();
    }

    public String func_20068_b()
    {
        return "container.dispenser";
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        super.func_186_a(p_186_1_);
        NBTTagList nbttaglist = p_186_1_.func_407_k("Items");
        field_21081_e = new ItemStack[func_83_a()];
        for(int i = 0; i < nbttaglist.func_387_b(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_388_a(i);
            int j = nbttagcompound.func_408_b("Slot") & 0xff;
            if(j >= 0 && j < field_21081_e.length)
            {
                field_21081_e[j] = ItemStack.func_35618_a(nbttagcompound);
            }
        }

    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        super.func_188_b(p_188_1_);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < field_21081_e.length; i++)
        {
            if(field_21081_e[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_409_a("Slot", (byte)i);
                field_21081_e[i].func_570_a(nbttagcompound);
                nbttaglist.func_386_a(nbttagcompound);
            }
        }

        p_188_1_.func_399_a("Items", nbttaglist);
    }

    public int func_202_d()
    {
        return 64;
    }

    public boolean func_20067_a_(EntityPlayer p_20067_1_)
    {
        if(field_479_a.func_451_k(field_478_b, field_483_c, field_482_d) != this)
        {
            return false;
        }
        return p_20067_1_.func_101_d((double)field_478_b + 0.5D, (double)field_483_c + 0.5D, (double)field_482_d + 0.5D) <= 64D;
    }

    public void func_35161_e()
    {
    }

    public void func_35162_t_()
    {
    }
}
