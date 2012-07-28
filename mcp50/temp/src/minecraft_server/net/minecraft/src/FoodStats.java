// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemFood, EntityPlayer, World, DamageSource, 
//            NBTTagCompound

public class FoodStats
{

    private int field_35595_a;
    private float field_35593_b;
    private float field_35594_c;
    private int field_35591_d;
    private int field_35592_e;

    public FoodStats()
    {
        field_35591_d = 0;
        field_35595_a = 20;
        field_35592_e = 20;
        field_35593_b = 5F;
    }

    public void func_35590_a(int p_35590_1_, float p_35590_2_)
    {
        field_35595_a = Math.min(p_35590_1_ + field_35595_a, 20);
        field_35593_b = Math.min(field_35593_b + (float)p_35590_1_ * p_35590_2_ * 2.0F, field_35595_a);
    }

    public void func_35582_a(ItemFood p_35582_1_)
    {
        func_35590_a(p_35582_1_.func_25009_j(), p_35582_1_.func_35424_l());
    }

    public void func_35584_a(EntityPlayer p_35584_1_)
    {
        int i = p_35584_1_.field_9093_l.field_804_l;
        field_35592_e = field_35595_a;
        if(field_35594_c > 4F)
        {
            field_35594_c -= 4F;
            if(field_35593_b > 0.0F)
            {
                field_35593_b = Math.max(field_35593_b - 1.0F, 0.0F);
            } else
            if(i > 0)
            {
                field_35595_a = Math.max(field_35595_a - 1, 0);
            }
        }
        if(field_35595_a >= 18 && p_35584_1_.func_35206_W())
        {
            field_35591_d++;
            if(field_35591_d >= 80)
            {
                p_35584_1_.func_137_a(1);
                field_35591_d = 0;
            }
        } else
        if(field_35595_a <= 0)
        {
            field_35591_d++;
            if(field_35591_d >= 80)
            {
                if(p_35584_1_.func_40097_ai() > 10 || i >= 3 || p_35584_1_.func_40097_ai() > 1 && i >= 2)
                {
                    p_35584_1_.func_121_a(DamageSource.field_35085_f, 1);
                }
                field_35591_d = 0;
            }
        } else
        {
            field_35591_d = 0;
        }
    }

    public void func_35589_a(NBTTagCompound p_35589_1_)
    {
        if(p_35589_1_.func_410_a("foodLevel"))
        {
            field_35595_a = p_35589_1_.func_395_d("foodLevel");
            field_35591_d = p_35589_1_.func_395_d("foodTickTimer");
            field_35593_b = p_35589_1_.func_389_f("foodSaturationLevel");
            field_35594_c = p_35589_1_.func_389_f("foodExhaustionLevel");
        }
    }

    public void func_35588_b(NBTTagCompound p_35588_1_)
    {
        p_35588_1_.func_405_a("foodLevel", field_35595_a);
        p_35588_1_.func_405_a("foodTickTimer", field_35591_d);
        p_35588_1_.func_390_a("foodSaturationLevel", field_35593_b);
        p_35588_1_.func_390_a("foodExhaustionLevel", field_35594_c);
    }

    public int func_35585_a()
    {
        return field_35595_a;
    }

    public boolean func_35587_b()
    {
        return field_35595_a < 20;
    }

    public void func_35583_a(float p_35583_1_)
    {
        field_35594_c = Math.min(field_35594_c + p_35583_1_, 40F);
    }

    public float func_35586_c()
    {
        return field_35593_b;
    }
}
