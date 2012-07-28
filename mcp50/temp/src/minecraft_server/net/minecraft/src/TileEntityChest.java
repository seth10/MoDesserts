// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            TileEntity, IInventory, ItemStack, NBTTagCompound, 
//            NBTTagList, World, EntityPlayer, Block

public class TileEntityChest extends TileEntity
    implements IInventory
{

    private ItemStack field_494_e[];
    public boolean field_35175_a;
    public TileEntityChest field_35172_b;
    public TileEntityChest field_35173_c;
    public TileEntityChest field_35170_d;
    public TileEntityChest field_35171_e;
    public float field_35168_f;
    public float field_35169_g;
    public int field_35176_h;
    private int field_35174_q;

    public TileEntityChest()
    {
        field_494_e = new ItemStack[36];
        field_35175_a = false;
    }

    public int func_83_a()
    {
        return 27;
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        return field_494_e[p_82_1_];
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        if(field_494_e[p_20069_1_] != null)
        {
            if(field_494_e[p_20069_1_].field_853_a <= p_20069_2_)
            {
                ItemStack itemstack = field_494_e[p_20069_1_];
                field_494_e[p_20069_1_] = null;
                func_183_c();
                return itemstack;
            }
            ItemStack itemstack1 = field_494_e[p_20069_1_].func_20118_a(p_20069_2_);
            if(field_494_e[p_20069_1_].field_853_a == 0)
            {
                field_494_e[p_20069_1_] = null;
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
        if(field_494_e[p_48315_1_] != null)
        {
            ItemStack itemstack = field_494_e[p_48315_1_];
            field_494_e[p_48315_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        field_494_e[p_206_1_] = p_206_2_;
        if(p_206_2_ != null && p_206_2_.field_853_a > func_202_d())
        {
            p_206_2_.field_853_a = func_202_d();
        }
        func_183_c();
    }

    public String func_20068_b()
    {
        return "container.chest";
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        super.func_186_a(p_186_1_);
        NBTTagList nbttaglist = p_186_1_.func_407_k("Items");
        field_494_e = new ItemStack[func_83_a()];
        for(int i = 0; i < nbttaglist.func_387_b(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_388_a(i);
            int j = nbttagcompound.func_408_b("Slot") & 0xff;
            if(j >= 0 && j < field_494_e.length)
            {
                field_494_e[j] = ItemStack.func_35618_a(nbttagcompound);
            }
        }

    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        super.func_188_b(p_188_1_);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < field_494_e.length; i++)
        {
            if(field_494_e[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_409_a("Slot", (byte)i);
                field_494_e[i].func_570_a(nbttagcompound);
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

    public void func_35164_g()
    {
        super.func_35164_g();
        field_35175_a = false;
    }

    public void func_35167_h()
    {
        if(field_35175_a)
        {
            return;
        }
        field_35175_a = true;
        field_35172_b = null;
        field_35173_c = null;
        field_35170_d = null;
        field_35171_e = null;
        if(field_479_a.func_444_a(field_478_b - 1, field_483_c, field_482_d) == Block.field_593_av.field_573_bc)
        {
            field_35170_d = (TileEntityChest)field_479_a.func_451_k(field_478_b - 1, field_483_c, field_482_d);
        }
        if(field_479_a.func_444_a(field_478_b + 1, field_483_c, field_482_d) == Block.field_593_av.field_573_bc)
        {
            field_35173_c = (TileEntityChest)field_479_a.func_451_k(field_478_b + 1, field_483_c, field_482_d);
        }
        if(field_479_a.func_444_a(field_478_b, field_483_c, field_482_d - 1) == Block.field_593_av.field_573_bc)
        {
            field_35172_b = (TileEntityChest)field_479_a.func_451_k(field_478_b, field_483_c, field_482_d - 1);
        }
        if(field_479_a.func_444_a(field_478_b, field_483_c, field_482_d + 1) == Block.field_593_av.field_573_bc)
        {
            field_35171_e = (TileEntityChest)field_479_a.func_451_k(field_478_b, field_483_c, field_482_d + 1);
        }
        if(field_35172_b != null)
        {
            field_35172_b.func_35164_g();
        }
        if(field_35171_e != null)
        {
            field_35171_e.func_35164_g();
        }
        if(field_35173_c != null)
        {
            field_35173_c.func_35164_g();
        }
        if(field_35170_d != null)
        {
            field_35170_d.func_35164_g();
        }
    }

    public void func_184_b()
    {
        super.func_184_b();
        func_35167_h();
        if((++field_35174_q % 20) * 4 == 0)
        {
            field_479_a.func_21117_c(field_478_b, field_483_c, field_482_d, 1, field_35176_h);
        }
        field_35169_g = field_35168_f;
        float f = 0.1F;
        if(field_35176_h > 0 && field_35168_f == 0.0F && field_35172_b == null && field_35170_d == null)
        {
            double d = (double)field_478_b + 0.5D;
            double d1 = (double)field_482_d + 0.5D;
            if(field_35171_e != null)
            {
                d1 += 0.5D;
            }
            if(field_35173_c != null)
            {
                d += 0.5D;
            }
            field_479_a.func_502_a(d, (double)field_483_c + 0.5D, d1, "random.chestopen", 0.5F, field_479_a.field_803_m.nextFloat() * 0.1F + 0.9F);
        }
        if(field_35176_h == 0 && field_35168_f > 0.0F || field_35176_h > 0 && field_35168_f < 1.0F)
        {
            float f1 = field_35168_f;
            if(field_35176_h > 0)
            {
                field_35168_f += f;
            } else
            {
                field_35168_f -= f;
            }
            if(field_35168_f > 1.0F)
            {
                field_35168_f = 1.0F;
            }
            float f2 = 0.5F;
            if(field_35168_f < f2 && f1 >= f2 && field_35172_b == null && field_35170_d == null)
            {
                double d2 = (double)field_478_b + 0.5D;
                double d3 = (double)field_482_d + 0.5D;
                if(field_35171_e != null)
                {
                    d3 += 0.5D;
                }
                if(field_35173_c != null)
                {
                    d2 += 0.5D;
                }
                field_479_a.func_502_a(d2, (double)field_483_c + 0.5D, d3, "random.chestclosed", 0.5F, field_479_a.field_803_m.nextFloat() * 0.1F + 0.9F);
            }
            if(field_35168_f < 0.0F)
            {
                field_35168_f = 0.0F;
            }
        }
    }

    public void func_35163_b(int p_35163_1_, int p_35163_2_)
    {
        if(p_35163_1_ == 1)
        {
            field_35176_h = p_35163_2_;
        }
    }

    public void func_35161_e()
    {
        field_35176_h++;
        field_479_a.func_21117_c(field_478_b, field_483_c, field_482_d, 1, field_35176_h);
    }

    public void func_35162_t_()
    {
        field_35176_h--;
        field_479_a.func_21117_c(field_478_b, field_483_c, field_482_d, 1, field_35176_h);
    }

    public void func_31003_h()
    {
        func_35164_g();
        func_35167_h();
        super.func_31003_h();
    }
}
