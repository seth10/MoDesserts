// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;

// Referenced classes of package net.minecraft.src:
//            Potion, EntityLiving

public class PotionEffect
{

    private int field_35656_a;
    private int field_35654_b;
    private int field_35655_c;

    public PotionEffect(int p_i581_1_, int p_i581_2_, int p_i581_3_)
    {
        field_35656_a = p_i581_1_;
        field_35654_b = p_i581_2_;
        field_35655_c = p_i581_3_;
    }

    public PotionEffect(PotionEffect p_i582_1_)
    {
        field_35656_a = p_i582_1_.field_35656_a;
        field_35654_b = p_i582_1_.field_35654_b;
        field_35655_c = p_i582_1_.field_35655_c;
    }

    public void func_35650_a(PotionEffect p_35650_1_)
    {
        if(field_35656_a != p_35650_1_.field_35656_a)
        {
            System.err.println("This method should only be called for matching effects!");
        }
        if(p_35650_1_.field_35655_c > field_35655_c)
        {
            field_35655_c = p_35650_1_.field_35655_c;
            field_35654_b = p_35650_1_.field_35654_b;
        } else
        if(p_35650_1_.field_35655_c == field_35655_c && field_35654_b < p_35650_1_.field_35654_b)
        {
            field_35654_b = p_35650_1_.field_35654_b;
        }
    }

    public int func_35649_a()
    {
        return field_35656_a;
    }

    public int func_35653_b()
    {
        return field_35654_b;
    }

    public int func_35652_c()
    {
        return field_35655_c;
    }

    public boolean func_35648_a(EntityLiving p_35648_1_)
    {
        if(field_35654_b > 0)
        {
            if(Potion.field_35455_a[field_35656_a].func_35437_a(field_35654_b, field_35655_c))
            {
                func_35651_b(p_35648_1_);
            }
            func_35647_d();
        }
        return field_35654_b > 0;
    }

    private int func_35647_d()
    {
        return --field_35654_b;
    }

    public void func_35651_b(EntityLiving p_35651_1_)
    {
        if(field_35654_b > 0)
        {
            Potion.field_35455_a[field_35656_a].func_35438_a(p_35651_1_, field_35655_c);
        }
    }

    public String func_40614_d()
    {
        return Potion.field_35455_a[field_35656_a].func_40596_c();
    }

    public int hashCode()
    {
        return field_35656_a;
    }

    public String toString()
    {
        String s = "";
        if(func_35652_c() > 0)
        {
            s = (new StringBuilder()).append(func_40614_d()).append(" x ").append(func_35652_c() + 1).append(", Duration: ").append(func_35653_b()).toString();
        } else
        {
            s = (new StringBuilder()).append(func_40614_d()).append(", Duration: ").append(func_35653_b()).toString();
        }
        if(Potion.field_35455_a[field_35656_a].func_40593_f())
        {
            return (new StringBuilder()).append("(").append(s).append(")").toString();
        } else
        {
            return s;
        }
    }

    public boolean equals(Object p_equals_1_)
    {
        if(!(p_equals_1_ instanceof PotionEffect))
        {
            return false;
        } else
        {
            PotionEffect potioneffect = (PotionEffect)p_equals_1_;
            return field_35656_a == potioneffect.field_35656_a && field_35655_c == potioneffect.field_35655_c && field_35654_b == potioneffect.field_35654_b;
        }
    }
}
