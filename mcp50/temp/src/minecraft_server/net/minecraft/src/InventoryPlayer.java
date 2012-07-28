// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IInventory, ItemStack, NBTTagCompound, EntityPlayer, 
//            PlayerCapabilities, NBTTagList, Block, Material, 
//            ItemArmor, Entity

public class InventoryPlayer
    implements IInventory
{

    public ItemStack field_496_a[];
    public ItemStack field_495_b[];
    public int field_499_d;
    public EntityPlayer field_497_f;
    private ItemStack field_20074_f;
    public boolean field_498_e;

    public InventoryPlayer(EntityPlayer p_i218_1_)
    {
        field_496_a = new ItemStack[36];
        field_495_b = new ItemStack[4];
        field_499_d = 0;
        field_498_e = false;
        field_497_f = p_i218_1_;
    }

    public ItemStack func_213_b()
    {
        if(field_499_d < 9 && field_499_d >= 0)
        {
            return field_496_a[field_499_d];
        } else
        {
            return null;
        }
    }

    public static int func_25054_e()
    {
        return 9;
    }

    private int func_6126_d(int p_6126_1_)
    {
        for(int i = 0; i < field_496_a.length; i++)
        {
            if(field_496_a[i] != null && field_496_a[i].field_855_c == p_6126_1_)
            {
                return i;
            }
        }

        return -1;
    }

    private int func_21082_c(ItemStack p_21082_1_)
    {
        for(int i = 0; i < field_496_a.length; i++)
        {
            if(field_496_a[i] != null && field_496_a[i].field_855_c == p_21082_1_.field_855_c && field_496_a[i].func_21132_c() && field_496_a[i].field_853_a < field_496_a[i].func_576_b() && field_496_a[i].field_853_a < func_202_d() && (!field_496_a[i].func_21128_e() || field_496_a[i].func_21125_h() == p_21082_1_.func_21125_h()) && ItemStack.func_46124_a(field_496_a[i], p_21082_1_))
            {
                return i;
            }
        }

        return -1;
    }

    private int func_205_g()
    {
        for(int i = 0; i < field_496_a.length; i++)
        {
            if(field_496_a[i] == null)
            {
                return i;
            }
        }

        return -1;
    }

    private int func_21083_d(ItemStack p_21083_1_)
    {
        int i = p_21083_1_.field_855_c;
        int j = p_21083_1_.field_853_a;
        if(p_21083_1_.func_576_b() == 1)
        {
            int k = func_205_g();
            if(k < 0)
            {
                return j;
            }
            if(field_496_a[k] == null)
            {
                field_496_a[k] = ItemStack.func_20117_a(p_21083_1_);
            }
            return 0;
        }
        int l = func_21082_c(p_21083_1_);
        if(l < 0)
        {
            l = func_205_g();
        }
        if(l < 0)
        {
            return j;
        }
        if(field_496_a[l] == null)
        {
            field_496_a[l] = new ItemStack(i, 0, p_21083_1_.func_21125_h());
            if(p_21083_1_.func_40608_n())
            {
                field_496_a[l].func_40604_d((NBTTagCompound)p_21083_1_.func_40607_o().func_40468_b());
            }
        }
        int i1 = j;
        if(i1 > field_496_a[l].func_576_b() - field_496_a[l].field_853_a)
        {
            i1 = field_496_a[l].func_576_b() - field_496_a[l].field_853_a;
        }
        if(i1 > func_202_d() - field_496_a[l].field_853_a)
        {
            i1 = func_202_d() - field_496_a[l].field_853_a;
        }
        if(i1 == 0)
        {
            return j;
        } else
        {
            j -= i1;
            field_496_a[l].field_853_a += i1;
            field_496_a[l].field_852_b = 5;
            return j;
        }
    }

    public void func_210_c()
    {
        for(int i = 0; i < field_496_a.length; i++)
        {
            if(field_496_a[i] != null)
            {
                field_496_a[i].func_28143_a(field_497_f.field_9093_l, field_497_f, i, field_499_d == i);
            }
        }

    }

    public boolean func_6127_b(int p_6127_1_)
    {
        int i = func_6126_d(p_6127_1_);
        if(i < 0)
        {
            return false;
        }
        if(--field_496_a[i].field_853_a <= 0)
        {
            field_496_a[i] = null;
        }
        return true;
    }

    public boolean func_35177_c(int p_35177_1_)
    {
        int i = func_6126_d(p_35177_1_);
        return i >= 0;
    }

    public boolean func_201_a(ItemStack p_201_1_)
    {
        if(!p_201_1_.func_21130_f())
        {
            int i;
            do
            {
                i = p_201_1_.field_853_a;
                p_201_1_.field_853_a = func_21083_d(p_201_1_);
            } while(p_201_1_.field_853_a > 0 && p_201_1_.field_853_a < i);
            if(p_201_1_.field_853_a == i && field_497_f.field_35214_K.field_35657_d)
            {
                p_201_1_.field_853_a = 0;
                return true;
            } else
            {
                return p_201_1_.field_853_a < i;
            }
        }
        int j = func_205_g();
        if(j >= 0)
        {
            field_496_a[j] = ItemStack.func_20117_a(p_201_1_);
            field_496_a[j].field_852_b = 5;
            p_201_1_.field_853_a = 0;
            return true;
        }
        if(field_497_f.field_35214_K.field_35657_d)
        {
            p_201_1_.field_853_a = 0;
            return true;
        } else
        {
            return false;
        }
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        ItemStack aitemstack[] = field_496_a;
        if(p_20069_1_ >= field_496_a.length)
        {
            aitemstack = field_495_b;
            p_20069_1_ -= field_496_a.length;
        }
        if(aitemstack[p_20069_1_] != null)
        {
            if(aitemstack[p_20069_1_].field_853_a <= p_20069_2_)
            {
                ItemStack itemstack = aitemstack[p_20069_1_];
                aitemstack[p_20069_1_] = null;
                return itemstack;
            }
            ItemStack itemstack1 = aitemstack[p_20069_1_].func_20118_a(p_20069_2_);
            if(aitemstack[p_20069_1_].field_853_a == 0)
            {
                aitemstack[p_20069_1_] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48315_b(int p_48315_1_)
    {
        ItemStack aitemstack[] = field_496_a;
        if(p_48315_1_ >= field_496_a.length)
        {
            aitemstack = field_495_b;
            p_48315_1_ -= field_496_a.length;
        }
        if(aitemstack[p_48315_1_] != null)
        {
            ItemStack itemstack = aitemstack[p_48315_1_];
            aitemstack[p_48315_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        ItemStack aitemstack[] = field_496_a;
        if(p_206_1_ >= aitemstack.length)
        {
            p_206_1_ -= aitemstack.length;
            aitemstack = field_495_b;
        }
        aitemstack[p_206_1_] = p_206_2_;
    }

    public float func_208_a(Block p_208_1_)
    {
        float f = 1.0F;
        if(field_496_a[field_499_d] != null)
        {
            f *= field_496_a[field_499_d].func_574_a(p_208_1_);
        }
        return f;
    }

    public NBTTagList func_200_a(NBTTagList p_200_1_)
    {
        for(int i = 0; i < field_496_a.length; i++)
        {
            if(field_496_a[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_409_a("Slot", (byte)i);
                field_496_a[i].func_570_a(nbttagcompound);
                p_200_1_.func_386_a(nbttagcompound);
            }
        }

        for(int j = 0; j < field_495_b.length; j++)
        {
            if(field_495_b[j] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.func_409_a("Slot", (byte)(j + 100));
                field_495_b[j].func_570_a(nbttagcompound1);
                p_200_1_.func_386_a(nbttagcompound1);
            }
        }

        return p_200_1_;
    }

    public void func_203_b(NBTTagList p_203_1_)
    {
        field_496_a = new ItemStack[36];
        field_495_b = new ItemStack[4];
        for(int i = 0; i < p_203_1_.func_387_b(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)p_203_1_.func_388_a(i);
            int j = nbttagcompound.func_408_b("Slot") & 0xff;
            ItemStack itemstack = ItemStack.func_35618_a(nbttagcompound);
            if(itemstack == null)
            {
                continue;
            }
            if(j >= 0 && j < field_496_a.length)
            {
                field_496_a[j] = itemstack;
            }
            if(j >= 100 && j < field_495_b.length + 100)
            {
                field_495_b[j - 100] = itemstack;
            }
        }

    }

    public int func_83_a()
    {
        return field_496_a.length + 4;
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        ItemStack aitemstack[] = field_496_a;
        if(p_82_1_ >= aitemstack.length)
        {
            p_82_1_ -= aitemstack.length;
            aitemstack = field_495_b;
        }
        return aitemstack[p_82_1_];
    }

    public String func_20068_b()
    {
        return "container.inventory";
    }

    public int func_202_d()
    {
        return 64;
    }

    public int func_9157_a(Entity p_9157_1_)
    {
        ItemStack itemstack = func_82_a(field_499_d);
        if(itemstack != null)
        {
            return itemstack.func_9218_a(p_9157_1_);
        } else
        {
            return 1;
        }
    }

    public boolean func_207_b(Block p_207_1_)
    {
        if(p_207_1_.field_553_bn.func_31055_i())
        {
            return true;
        }
        ItemStack itemstack = func_82_a(field_499_d);
        if(itemstack != null)
        {
            return itemstack.func_573_b(p_207_1_);
        } else
        {
            return false;
        }
    }

    public int func_212_e()
    {
        int i = 0;
        for(int j = 0; j < field_495_b.length; j++)
        {
            if(field_495_b[j] != null && (field_495_b[j].func_569_a() instanceof ItemArmor))
            {
                int k = ((ItemArmor)field_495_b[j].func_569_a()).field_256_aY;
                i += k;
            }
        }

        return i;
    }

    public void func_211_b(int p_211_1_)
    {
        p_211_1_ /= 4;
        if(p_211_1_ < 1)
        {
            p_211_1_ = 1;
        }
        for(int i = 0; i < field_495_b.length; i++)
        {
            if(field_495_b[i] == null || !(field_495_b[i].func_569_a() instanceof ItemArmor))
            {
                continue;
            }
            field_495_b[i].func_25125_a(p_211_1_, field_497_f);
            if(field_495_b[i].field_853_a == 0)
            {
                field_495_b[i].func_577_a(field_497_f);
                field_495_b[i] = null;
            }
        }

    }

    public void func_199_f()
    {
        for(int i = 0; i < field_496_a.length; i++)
        {
            if(field_496_a[i] != null)
            {
                field_497_f.func_48349_a(field_496_a[i], true);
                field_496_a[i] = null;
            }
        }

        for(int j = 0; j < field_495_b.length; j++)
        {
            if(field_495_b[j] != null)
            {
                field_497_f.func_48349_a(field_495_b[j], true);
                field_495_b[j] = null;
            }
        }

    }

    public void func_183_c()
    {
        field_498_e = true;
    }

    public void func_20073_b(ItemStack p_20073_1_)
    {
        field_20074_f = p_20073_1_;
        field_497_f.func_20045_a(p_20073_1_);
    }

    public ItemStack func_20072_i()
    {
        return field_20074_f;
    }

    public boolean func_20067_a_(EntityPlayer p_20067_1_)
    {
        if(field_497_f.field_304_B)
        {
            return false;
        }
        return p_20067_1_.func_102_b(field_497_f) <= 64D;
    }

    public boolean func_28010_c(ItemStack p_28010_1_)
    {
        for(int i = 0; i < field_495_b.length; i++)
        {
            if(field_495_b[i] != null && field_495_b[i].func_28144_c(p_28010_1_))
            {
                return true;
            }
        }

        for(int j = 0; j < field_496_a.length; j++)
        {
            if(field_496_a[j] != null && field_496_a[j].func_28144_c(p_28010_1_))
            {
                return true;
            }
        }

        return false;
    }

    public void func_35161_e()
    {
    }

    public void func_35162_t_()
    {
    }

    public void func_41013_a(InventoryPlayer p_41013_1_)
    {
        for(int i = 0; i < field_496_a.length; i++)
        {
            field_496_a[i] = ItemStack.func_20117_a(p_41013_1_.field_496_a[i]);
        }

        for(int j = 0; j < field_495_b.length; j++)
        {
            field_495_b[j] = ItemStack.func_20117_a(p_41013_1_.field_495_b[j]);
        }

    }
}
