// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Item, NBTTagCompound, StatList, 
//            EntityPlayer, EnchantmentHelper, EntityLiving, World, 
//            NBTTagList, Enchantment, Entity, EnumAction

public final class ItemStack
{

    public int field_853_a;
    public int field_852_b;
    public int field_855_c;
    public NBTTagCompound field_40611_d;
    private int field_854_d;

    public ItemStack(Block p_i219_1_)
    {
        this(p_i219_1_, 1);
    }

    public ItemStack(Block p_i220_1_, int p_i220_2_)
    {
        this(p_i220_1_.field_573_bc, p_i220_2_, 0);
    }

    public ItemStack(Block p_i221_1_, int p_i221_2_, int p_i221_3_)
    {
        this(p_i221_1_.field_573_bc, p_i221_2_, p_i221_3_);
    }

    public ItemStack(Item p_i222_1_)
    {
        this(p_i222_1_.field_234_aS, 1, 0);
    }

    public ItemStack(Item p_i223_1_, int p_i223_2_)
    {
        this(p_i223_1_.field_234_aS, p_i223_2_, 0);
    }

    public ItemStack(Item p_i224_1_, int p_i224_2_, int p_i224_3_)
    {
        this(p_i224_1_.field_234_aS, p_i224_2_, p_i224_3_);
    }

    public ItemStack(int p_i225_1_, int p_i225_2_, int p_i225_3_)
    {
        field_853_a = 0;
        field_855_c = p_i225_1_;
        field_853_a = p_i225_2_;
        field_854_d = p_i225_3_;
    }

    public static ItemStack func_35618_a(NBTTagCompound p_35618_0_)
    {
        ItemStack itemstack = new ItemStack();
        itemstack.func_575_b(p_35618_0_);
        return itemstack.func_569_a() == null ? null : itemstack;
    }

    private ItemStack()
    {
        field_853_a = 0;
    }

    public ItemStack func_20118_a(int p_20118_1_)
    {
        ItemStack itemstack = new ItemStack(field_855_c, p_20118_1_, field_854_d);
        if(field_40611_d != null)
        {
            itemstack.field_40611_d = (NBTTagCompound)field_40611_d.func_40468_b();
        }
        field_853_a -= p_20118_1_;
        return itemstack;
    }

    public Item func_569_a()
    {
        return Item.field_176_c[field_855_c];
    }

    public boolean func_572_a(EntityPlayer p_572_1_, World p_572_2_, int p_572_3_, int p_572_4_, int p_572_5_, int p_572_6_)
    {
        boolean flag = func_569_a().func_78_a(this, p_572_1_, p_572_2_, p_572_3_, p_572_4_, p_572_5_, p_572_6_);
        if(flag)
        {
            p_572_1_.func_25046_a(StatList.field_25107_A[field_855_c], 1);
        }
        return flag;
    }

    public float func_574_a(Block p_574_1_)
    {
        return func_569_a().func_79_a(this, p_574_1_);
    }

    public ItemStack func_6168_a(World p_6168_1_, EntityPlayer p_6168_2_)
    {
        return func_569_a().func_6152_a(this, p_6168_1_, p_6168_2_);
    }

    public ItemStack func_35617_b(World p_35617_1_, EntityPlayer p_35617_2_)
    {
        return func_569_a().func_35405_b(this, p_35617_1_, p_35617_2_);
    }

    public NBTTagCompound func_570_a(NBTTagCompound p_570_1_)
    {
        p_570_1_.func_394_a("id", (short)field_855_c);
        p_570_1_.func_409_a("Count", (byte)field_853_a);
        p_570_1_.func_394_a("Damage", (short)field_854_d);
        if(field_40611_d != null)
        {
            p_570_1_.func_399_a("tag", field_40611_d);
        }
        return p_570_1_;
    }

    public void func_575_b(NBTTagCompound p_575_1_)
    {
        field_855_c = p_575_1_.func_406_c("id");
        field_853_a = p_575_1_.func_408_b("Count");
        field_854_d = p_575_1_.func_406_c("Damage");
        if(p_575_1_.func_410_a("tag"))
        {
            field_40611_d = p_575_1_.func_397_j("tag");
        }
    }

    public int func_576_b()
    {
        return func_569_a().func_81_a();
    }

    public boolean func_21132_c()
    {
        return func_576_b() > 1 && (!func_21126_d() || !func_21130_f());
    }

    public boolean func_21126_d()
    {
        return Item.field_176_c[field_855_c].func_77_b() > 0;
    }

    public boolean func_21128_e()
    {
        return Item.field_176_c[field_855_c].func_21092_c();
    }

    public boolean func_21130_f()
    {
        return func_21126_d() && field_854_d > 0;
    }

    public int func_21131_g()
    {
        return field_854_d;
    }

    public int func_21125_h()
    {
        return field_854_d;
    }

    public void func_28145_b(int p_28145_1_)
    {
        field_854_d = p_28145_1_;
    }

    public int func_571_c()
    {
        return Item.field_176_c[field_855_c].func_77_b();
    }

    public void func_25125_a(int p_25125_1_, EntityLiving p_25125_2_)
    {
        if(!func_21126_d())
        {
            return;
        }
        if(p_25125_1_ > 0 && (p_25125_2_ instanceof EntityPlayer))
        {
            int i = EnchantmentHelper.func_40643_c(((EntityPlayer)p_25125_2_).field_416_aj);
            if(i > 0 && p_25125_2_.field_9093_l.field_803_m.nextInt(i + 1) > 0)
            {
                return;
            }
        }
        field_854_d += p_25125_1_;
        if(field_854_d > func_571_c())
        {
            p_25125_2_.func_41030_c(this);
            if(p_25125_2_ instanceof EntityPlayer)
            {
                ((EntityPlayer)p_25125_2_).func_25046_a(StatList.field_25105_B[field_855_c], 1);
            }
            field_853_a--;
            if(field_853_a < 0)
            {
                field_853_a = 0;
            }
            field_854_d = 0;
        }
    }

    public void func_9217_a(EntityLiving p_9217_1_, EntityPlayer p_9217_2_)
    {
        boolean flag = Item.field_176_c[field_855_c].func_9201_a(this, p_9217_1_, p_9217_2_);
        if(flag)
        {
            p_9217_2_.func_25046_a(StatList.field_25107_A[field_855_c], 1);
        }
    }

    public void func_25124_a(int p_25124_1_, int p_25124_2_, int p_25124_3_, int p_25124_4_, EntityPlayer p_25124_5_)
    {
        boolean flag = Item.field_176_c[field_855_c].func_25007_a(this, p_25124_1_, p_25124_2_, p_25124_3_, p_25124_4_, p_25124_5_);
        if(flag)
        {
            p_25124_5_.func_25046_a(StatList.field_25107_A[field_855_c], 1);
        }
    }

    public int func_9218_a(Entity p_9218_1_)
    {
        return Item.field_176_c[field_855_c].func_9203_a(p_9218_1_);
    }

    public boolean func_573_b(Block p_573_1_)
    {
        return Item.field_176_c[field_855_c].func_80_a(p_573_1_);
    }

    public void func_577_a(EntityPlayer entityplayer)
    {
    }

    public void func_21129_b(EntityLiving p_21129_1_)
    {
        Item.field_176_c[field_855_c].func_9202_b(this, p_21129_1_);
    }

    public ItemStack func_578_d()
    {
        ItemStack itemstack = new ItemStack(field_855_c, field_853_a, field_854_d);
        if(field_40611_d != null)
        {
            itemstack.field_40611_d = (NBTTagCompound)field_40611_d.func_40468_b();
            if(!itemstack.field_40611_d.equals(field_40611_d))
            {
                return itemstack;
            }
        }
        return itemstack;
    }

    public static boolean func_46124_a(ItemStack p_46124_0_, ItemStack p_46124_1_)
    {
        if(p_46124_0_ == null && p_46124_1_ == null)
        {
            return true;
        }
        if(p_46124_0_ == null || p_46124_1_ == null)
        {
            return false;
        }
        if(p_46124_0_.field_40611_d == null && p_46124_1_.field_40611_d != null)
        {
            return false;
        }
        return p_46124_0_.field_40611_d == null || p_46124_0_.field_40611_d.equals(p_46124_1_.field_40611_d);
    }

    public static boolean func_20119_a(ItemStack p_20119_0_, ItemStack p_20119_1_)
    {
        if(p_20119_0_ == null && p_20119_1_ == null)
        {
            return true;
        }
        if(p_20119_0_ == null || p_20119_1_ == null)
        {
            return false;
        } else
        {
            return p_20119_0_.func_20116_b(p_20119_1_);
        }
    }

    private boolean func_20116_b(ItemStack p_20116_1_)
    {
        if(field_853_a != p_20116_1_.field_853_a)
        {
            return false;
        }
        if(field_855_c != p_20116_1_.field_855_c)
        {
            return false;
        }
        if(field_854_d != p_20116_1_.field_854_d)
        {
            return false;
        }
        if(field_40611_d == null && p_20116_1_.field_40611_d != null)
        {
            return false;
        }
        return field_40611_d == null || field_40611_d.equals(p_20116_1_.field_40611_d);
    }

    public boolean func_21127_a(ItemStack p_21127_1_)
    {
        return field_855_c == p_21127_1_.field_855_c && field_854_d == p_21127_1_.field_854_d;
    }

    public String func_35616_k()
    {
        return Item.field_176_c[field_855_c].func_35407_a(this);
    }

    public static ItemStack func_20117_a(ItemStack p_20117_0_)
    {
        return p_20117_0_ != null ? p_20117_0_.func_578_d() : null;
    }

    public String toString()
    {
        return (new StringBuilder()).append(field_853_a).append("x").append(Item.field_176_c[field_855_c].func_20106_a()).append("@").append(field_854_d).toString();
    }

    public void func_28143_a(World p_28143_1_, Entity p_28143_2_, int p_28143_3_, boolean p_28143_4_)
    {
        if(field_852_b > 0)
        {
            field_852_b--;
        }
        Item.field_176_c[field_855_c].func_28018_a(this, p_28143_1_, p_28143_2_, p_28143_3_, p_28143_4_);
    }

    public void func_48584_a(World p_48584_1_, EntityPlayer p_48584_2_, int p_48584_3_)
    {
        p_48584_2_.func_25046_a(StatList.field_25093_z[field_855_c], p_48584_3_);
        Item.field_176_c[field_855_c].func_28020_c(this, p_48584_1_, p_48584_2_);
    }

    public boolean func_28144_c(ItemStack p_28144_1_)
    {
        return field_855_c == p_28144_1_.field_855_c && field_853_a == p_28144_1_.field_853_a && field_854_d == p_28144_1_.field_854_d;
    }

    public int func_35614_l()
    {
        return func_569_a().func_35404_c(this);
    }

    public EnumAction func_35615_m()
    {
        return func_569_a().func_35406_b(this);
    }

    public void func_35613_a(World p_35613_1_, EntityPlayer p_35613_2_, int p_35613_3_)
    {
        func_569_a().func_35408_a(this, p_35613_1_, p_35613_2_, p_35613_3_);
    }

    public boolean func_40608_n()
    {
        return field_40611_d != null;
    }

    public NBTTagCompound func_40607_o()
    {
        return field_40611_d;
    }

    public NBTTagList func_40609_p()
    {
        if(field_40611_d == null)
        {
            return null;
        } else
        {
            return (NBTTagList)field_40611_d.func_40469_b("ench");
        }
    }

    public void func_40604_d(NBTTagCompound p_40604_1_)
    {
        field_40611_d = p_40604_1_;
    }

    public boolean func_40606_q()
    {
        if(!func_569_a().func_40222_e(this))
        {
            return false;
        }
        return !func_40610_r();
    }

    public void func_40605_a(Enchantment p_40605_1_, int p_40605_2_)
    {
        if(field_40611_d == null)
        {
            func_40604_d(new NBTTagCompound());
        }
        if(!field_40611_d.func_410_a("ench"))
        {
            field_40611_d.func_399_a("ench", new NBTTagList("ench"));
        }
        NBTTagList nbttaglist = (NBTTagList)field_40611_d.func_40469_b("ench");
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.func_394_a("id", (short)p_40605_1_.field_40368_t);
        nbttagcompound.func_394_a("lvl", (byte)p_40605_2_);
        nbttaglist.func_386_a(nbttagcompound);
    }

    public boolean func_40610_r()
    {
        return field_40611_d != null && field_40611_d.func_410_a("ench");
    }
}
