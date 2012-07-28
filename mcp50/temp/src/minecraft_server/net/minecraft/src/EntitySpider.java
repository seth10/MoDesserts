// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, DataWatcher, World, Entity, 
//            MathHelper, Item, EnumCreatureAttribute, PotionEffect, 
//            Potion, NBTTagCompound

public class EntitySpider extends EntityMob
{

    public EntitySpider(World p_i69_1_)
    {
        super(p_i69_1_);
        field_9119_aG = "/mob/spider.png";
        func_113_a(1.4F, 0.9F);
        field_9126_bt = 0.8F;
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, new Byte((byte)0));
    }

    public void func_153_y()
    {
        super.func_153_y();
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        if(!field_9093_l.field_792_x)
        {
            func_40125_a(field_9084_B);
        }
    }

    public int func_40095_c()
    {
        return 16;
    }

    public double func_130_h()
    {
        return (double)field_298_E * 0.75D - 0.5D;
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    protected Entity func_158_i()
    {
        float f = func_108_b(1.0F);
        if(f < 0.5F)
        {
            double d = 16D;
            return field_9093_l.func_40211_b(this, d);
        } else
        {
            return null;
        }
    }

    protected String func_6097_d()
    {
        return "mob.spider";
    }

    protected String func_6100_e()
    {
        return "mob.spider";
    }

    protected String func_6098_f()
    {
        return "mob.spiderdeath";
    }

    protected void func_157_a(Entity p_157_1_, float p_157_2_)
    {
        float f = func_108_b(1.0F);
        if(f > 0.5F && field_9064_W.nextInt(100) == 0)
        {
            field_389_ag = null;
            return;
        }
        if(p_157_2_ > 2.0F && p_157_2_ < 6F && field_9064_W.nextInt(10) == 0)
        {
            if(field_9086_A)
            {
                double d = p_157_1_.field_322_l - field_322_l;
                double d1 = p_157_1_.field_320_n - field_320_n;
                float f1 = MathHelper.func_583_a(d * d + d1 * d1);
                field_319_o = (d / (double)f1) * 0.5D * 0.80000001192092896D + field_319_o * 0.20000000298023224D;
                field_317_q = (d1 / (double)f1) * 0.5D * 0.80000001192092896D + field_317_q * 0.20000000298023224D;
                field_318_p = 0.40000000596046448D;
            }
        } else
        {
            super.func_157_a(p_157_1_, p_157_2_);
        }
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
    }

    protected int func_149_g()
    {
        return Item.field_196_I.field_234_aS;
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        super.func_21047_g_(p_21047_1_, p_21047_2_);
        if(p_21047_1_ && (field_9064_W.nextInt(3) == 0 || field_9064_W.nextInt(1 + p_21047_2_) > 0))
        {
            func_128_a(Item.field_40231_bs.field_234_aS, 1);
        }
    }

    public boolean func_144_E()
    {
        return func_40124_p_();
    }

    public void func_35147_q()
    {
    }

    public EnumCreatureAttribute func_40093_t()
    {
        return EnumCreatureAttribute.ARTHROPOD;
    }

    public boolean func_40096_a(PotionEffect p_40096_1_)
    {
        if(p_40096_1_.func_35649_a() == Potion.field_35466_u.field_35447_H)
        {
            return false;
        } else
        {
            return super.func_40096_a(p_40096_1_);
        }
    }

    public boolean func_40124_p_()
    {
        return (field_21045_af.func_21156_a(16) & 1) != 0;
    }

    public void func_40125_a(boolean p_40125_1_)
    {
        byte byte0 = field_21045_af.func_21156_a(16);
        if(p_40125_1_)
        {
            byte0 |= 1;
        } else
        {
            byte0 &= 0xfe;
        }
        field_21045_af.func_21155_b(16, Byte.valueOf(byte0));
    }
}
