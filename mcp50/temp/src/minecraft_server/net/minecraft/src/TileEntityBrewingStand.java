// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, IInventory, ItemStack, World, 
//            Item, ItemPotion, PotionHelper, NBTTagCompound, 
//            NBTTagList, EntityPlayer

public class TileEntityBrewingStand extends TileEntity
    implements IInventory
{

    private ItemStack field_40083_a[];
    private int field_40081_b;
    private int field_40082_c;
    private int field_40080_d;

    public TileEntityBrewingStand()
    {
        field_40083_a = new ItemStack[4];
    }

    public String func_20068_b()
    {
        return "container.brewing";
    }

    public int func_83_a()
    {
        return field_40083_a.length;
    }

    public void func_184_b()
    {
        if(field_40081_b > 0)
        {
            field_40081_b--;
            if(field_40081_b == 0)
            {
                func_40076_p();
                func_183_c();
            } else
            if(!func_40075_o())
            {
                field_40081_b = 0;
                func_183_c();
            } else
            if(field_40080_d != field_40083_a[3].field_855_c)
            {
                field_40081_b = 0;
                func_183_c();
            }
        } else
        if(func_40075_o())
        {
            field_40081_b = 400;
            field_40080_d = field_40083_a[3].field_855_c;
        }
        int i = func_40079_n();
        if(i != field_40082_c)
        {
            field_40082_c = i;
            field_479_a.func_511_b(field_478_b, field_483_c, field_482_d, i);
        }
        super.func_184_b();
    }

    public int func_40077_h()
    {
        return field_40081_b;
    }

    private boolean func_40075_o()
    {
        if(field_40083_a[3] == null || field_40083_a[3].field_853_a <= 0)
        {
            return false;
        }
        ItemStack itemstack = field_40083_a[3];
        if(!Item.field_176_c[itemstack.field_855_c].func_40220_m())
        {
            return false;
        }
        boolean flag = false;
        for(int i = 0; i < 3; i++)
        {
            if(field_40083_a[i] == null || field_40083_a[i].field_855_c != Item.field_40238_bq.field_234_aS)
            {
                continue;
            }
            int j = field_40083_a[i].func_21125_h();
            int k = func_40078_b(j, itemstack);
            if(!ItemPotion.func_40254_c(j) && ItemPotion.func_40254_c(k))
            {
                flag = true;
                break;
            }
            java.util.List list = Item.field_40238_bq.func_40255_b(j);
            java.util.List list1 = Item.field_40238_bq.func_40255_b(k);
            if(j > 0 && list == list1 || list != null && (list.equals(list1) || list1 == null) || j == k)
            {
                continue;
            }
            flag = true;
            break;
        }

        return flag;
    }

    private void func_40076_p()
    {
        if(!func_40075_o())
        {
            return;
        }
        ItemStack itemstack = field_40083_a[3];
        for(int i = 0; i < 3; i++)
        {
            if(field_40083_a[i] == null || field_40083_a[i].field_855_c != Item.field_40238_bq.field_234_aS)
            {
                continue;
            }
            int j = field_40083_a[i].func_21125_h();
            int k = func_40078_b(j, itemstack);
            java.util.List list = Item.field_40238_bq.func_40255_b(j);
            java.util.List list1 = Item.field_40238_bq.func_40255_b(k);
            if(j > 0 && list == list1 || list != null && (list.equals(list1) || list1 == null))
            {
                if(!ItemPotion.func_40254_c(j) && ItemPotion.func_40254_c(k))
                {
                    field_40083_a[i].func_28145_b(k);
                }
                continue;
            }
            if(j != k)
            {
                field_40083_a[i].func_28145_b(k);
            }
        }

        if(Item.field_176_c[itemstack.field_855_c].func_21088_g())
        {
            field_40083_a[3] = new ItemStack(Item.field_176_c[itemstack.field_855_c].func_21087_f());
        } else
        {
            field_40083_a[3].field_853_a--;
            if(field_40083_a[3].field_853_a <= 0)
            {
                field_40083_a[3] = null;
            }
        }
    }

    private int func_40078_b(int p_40078_1_, ItemStack p_40078_2_)
    {
        if(p_40078_2_ == null)
        {
            return p_40078_1_;
        }
        if(Item.field_176_c[p_40078_2_.field_855_c].func_40220_m())
        {
            return PotionHelper.func_40555_a(p_40078_1_, Item.field_176_c[p_40078_2_.field_855_c].func_40221_l());
        } else
        {
            return p_40078_1_;
        }
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        super.func_186_a(p_186_1_);
        NBTTagList nbttaglist = p_186_1_.func_407_k("Items");
        field_40083_a = new ItemStack[func_83_a()];
        for(int i = 0; i < nbttaglist.func_387_b(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_388_a(i);
            byte byte0 = nbttagcompound.func_408_b("Slot");
            if(byte0 >= 0 && byte0 < field_40083_a.length)
            {
                field_40083_a[byte0] = ItemStack.func_35618_a(nbttagcompound);
            }
        }

        field_40081_b = p_186_1_.func_406_c("BrewTime");
    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        super.func_188_b(p_188_1_);
        p_188_1_.func_394_a("BrewTime", (short)field_40081_b);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < field_40083_a.length; i++)
        {
            if(field_40083_a[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_409_a("Slot", (byte)i);
                field_40083_a[i].func_570_a(nbttagcompound);
                nbttaglist.func_386_a(nbttagcompound);
            }
        }

        p_188_1_.func_399_a("Items", nbttaglist);
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        if(p_82_1_ >= 0 && p_82_1_ < field_40083_a.length)
        {
            return field_40083_a[p_82_1_];
        } else
        {
            return null;
        }
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        if(p_20069_1_ >= 0 && p_20069_1_ < field_40083_a.length)
        {
            ItemStack itemstack = field_40083_a[p_20069_1_];
            field_40083_a[p_20069_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48315_b(int p_48315_1_)
    {
        if(p_48315_1_ >= 0 && p_48315_1_ < field_40083_a.length)
        {
            ItemStack itemstack = field_40083_a[p_48315_1_];
            field_40083_a[p_48315_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        if(p_206_1_ >= 0 && p_206_1_ < field_40083_a.length)
        {
            field_40083_a[p_206_1_] = p_206_2_;
        }
    }

    public int func_202_d()
    {
        return 1;
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

    public int func_40079_n()
    {
        int i = 0;
        for(int j = 0; j < 3; j++)
        {
            if(field_40083_a[j] != null)
            {
                i |= 1 << j;
            }
        }

        return i;
    }
}
