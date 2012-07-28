// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemStack, IInventory

public class Slot
{

    private final int field_20097_a;
    public final IInventory field_20096_b;
    public int field_20100_c;
    public int field_20099_d;
    public int field_20098_e;

    public Slot(IInventory p_i172_1_, int p_i172_2_, int p_i172_3_, int p_i172_4_)
    {
        field_20096_b = p_i172_1_;
        field_20097_a = p_i172_2_;
        field_20099_d = p_i172_3_;
        field_20098_e = p_i172_4_;
    }

    public void func_48417_a(ItemStack p_48417_1_, ItemStack p_48417_2_)
    {
        if(p_48417_1_ == null || p_48417_2_ == null)
        {
            return;
        }
        if(p_48417_1_.field_855_c != p_48417_2_.field_855_c)
        {
            return;
        }
        int i = p_48417_2_.field_853_a - p_48417_1_.field_853_a;
        if(i > 0)
        {
            func_48415_a(p_48417_1_, i);
        }
    }

    protected void func_48415_a(ItemStack itemstack, int i)
    {
    }

    protected void func_48416_b(ItemStack itemstack)
    {
    }

    public void func_20091_b(ItemStack p_20091_1_)
    {
        func_20094_d();
    }

    public boolean func_20095_a(ItemStack p_20095_1_)
    {
        return true;
    }

    public ItemStack func_20092_c()
    {
        return field_20096_b.func_82_a(field_20097_a);
    }

    public boolean func_27006_b()
    {
        return func_20092_c() != null;
    }

    public void func_20089_b(ItemStack p_20089_1_)
    {
        field_20096_b.func_206_a(field_20097_a, p_20089_1_);
        func_20094_d();
    }

    public void func_20094_d()
    {
        field_20096_b.func_183_c();
    }

    public int func_20093_a()
    {
        return field_20096_b.func_202_d();
    }

    public ItemStack func_20088_a(int p_20088_1_)
    {
        return field_20096_b.func_20069_a(field_20097_a, p_20088_1_);
    }

    public boolean func_20090_a(IInventory p_20090_1_, int p_20090_2_)
    {
        return p_20090_1_ == field_20096_b && p_20090_2_ == field_20097_a;
    }
}
