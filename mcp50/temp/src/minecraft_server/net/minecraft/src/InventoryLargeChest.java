// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IInventory, ItemStack, EntityPlayer

public class InventoryLargeChest
    implements IInventory
{

    private String field_502_a;
    private IInventory field_501_b;
    private IInventory field_503_c;

    public InventoryLargeChest(String p_i343_1_, IInventory p_i343_2_, IInventory p_i343_3_)
    {
        field_502_a = p_i343_1_;
        if(p_i343_2_ == null)
        {
            p_i343_2_ = p_i343_3_;
        }
        if(p_i343_3_ == null)
        {
            p_i343_3_ = p_i343_2_;
        }
        field_501_b = p_i343_2_;
        field_503_c = p_i343_3_;
    }

    public int func_83_a()
    {
        return field_501_b.func_83_a() + field_503_c.func_83_a();
    }

    public String func_20068_b()
    {
        return field_502_a;
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        if(p_82_1_ >= field_501_b.func_83_a())
        {
            return field_503_c.func_82_a(p_82_1_ - field_501_b.func_83_a());
        } else
        {
            return field_501_b.func_82_a(p_82_1_);
        }
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        if(p_20069_1_ >= field_501_b.func_83_a())
        {
            return field_503_c.func_20069_a(p_20069_1_ - field_501_b.func_83_a(), p_20069_2_);
        } else
        {
            return field_501_b.func_20069_a(p_20069_1_, p_20069_2_);
        }
    }

    public ItemStack func_48315_b(int p_48315_1_)
    {
        if(p_48315_1_ >= field_501_b.func_83_a())
        {
            return field_503_c.func_48315_b(p_48315_1_ - field_501_b.func_83_a());
        } else
        {
            return field_501_b.func_48315_b(p_48315_1_);
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        if(p_206_1_ >= field_501_b.func_83_a())
        {
            field_503_c.func_206_a(p_206_1_ - field_501_b.func_83_a(), p_206_2_);
        } else
        {
            field_501_b.func_206_a(p_206_1_, p_206_2_);
        }
    }

    public int func_202_d()
    {
        return field_501_b.func_202_d();
    }

    public void func_183_c()
    {
        field_501_b.func_183_c();
        field_503_c.func_183_c();
    }

    public boolean func_20067_a_(EntityPlayer p_20067_1_)
    {
        return field_501_b.func_20067_a_(p_20067_1_) && field_503_c.func_20067_a_(p_20067_1_);
    }

    public void func_35161_e()
    {
        field_501_b.func_35161_e();
        field_503_c.func_35161_e();
    }

    public void func_35162_t_()
    {
        field_501_b.func_35162_t_();
        field_503_c.func_35162_t_();
    }
}
