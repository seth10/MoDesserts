// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving, DamageSource, EntityPlayer, PotionHealth

public class Potion
{

    public static final Potion field_35455_a[] = new Potion[32];
    public static final Potion field_35453_b = null;
    public static final Potion field_35454_c = (new Potion(1, false, 0x7cafc6)).func_35439_a("potion.moveSpeed").func_40589_a(0, 0);
    public static final Potion field_35451_d = (new Potion(2, true, 0x5a6c81)).func_35439_a("potion.moveSlowdown").func_40589_a(1, 0);
    public static final Potion field_35452_e = (new Potion(3, false, 0xd9c043)).func_35439_a("potion.digSpeed").func_40589_a(2, 0).func_40591_a(1.5D);
    public static final Potion field_35449_f = (new Potion(4, true, 0x4a4217)).func_35439_a("potion.digSlowDown").func_40589_a(3, 0);
    public static final Potion field_35450_g = (new Potion(5, false, 0x932423)).func_35439_a("potion.damageBoost").func_40589_a(4, 0);
    public static final Potion field_35462_h = (new PotionHealth(6, false, 0xf82423)).func_35439_a("potion.heal");
    public static final Potion field_35463_i = (new PotionHealth(7, true, 0x430a09)).func_35439_a("potion.harm");
    public static final Potion field_35460_j = (new Potion(8, false, 0x786297)).func_35439_a("potion.jump").func_40589_a(2, 1);
    public static final Potion field_35461_k = (new Potion(9, true, 0x551d4a)).func_35439_a("potion.confusion").func_40589_a(3, 1).func_40591_a(0.25D);
    public static final Potion field_35458_l = (new Potion(10, false, 0xcd5cab)).func_35439_a("potion.regeneration").func_40589_a(7, 0).func_40591_a(0.25D);
    public static final Potion field_35459_m = (new Potion(11, false, 0x99453a)).func_35439_a("potion.resistance").func_40589_a(6, 1);
    public static final Potion field_35456_n = (new Potion(12, false, 0xe49a3a)).func_35439_a("potion.fireResistance").func_40589_a(7, 1);
    public static final Potion field_35457_o = (new Potion(13, false, 0x2e5299)).func_35439_a("potion.waterBreathing").func_40589_a(0, 2);
    public static final Potion field_35471_p = (new Potion(14, false, 0x7f8392)).func_35439_a("potion.invisibility").func_40589_a(0, 1).func_40590_e();
    public static final Potion field_35470_q = (new Potion(15, true, 0x1f1f23)).func_35439_a("potion.blindness").func_40589_a(5, 1).func_40591_a(0.25D);
    public static final Potion field_35469_r = (new Potion(16, false, 0x1f1fa1)).func_35439_a("potion.nightVision").func_40589_a(4, 1).func_40590_e();
    public static final Potion field_35468_s = (new Potion(17, true, 0x587653)).func_35439_a("potion.hunger").func_40589_a(1, 1);
    public static final Potion field_35467_t = (new Potion(18, true, 0x484d48)).func_35439_a("potion.weakness").func_40589_a(5, 0);
    public static final Potion field_35466_u = (new Potion(19, true, 0x4e9331)).func_35439_a("potion.poison").func_40589_a(6, 0).func_40591_a(0.25D);
    public static final Potion field_35465_v = null;
    public static final Potion field_35464_w = null;
    public static final Potion field_35474_x = null;
    public static final Potion field_35473_y = null;
    public static final Potion field_35472_z = null;
    public static final Potion field_35444_A = null;
    public static final Potion field_35445_B = null;
    public static final Potion field_35446_C = null;
    public static final Potion field_35440_D = null;
    public static final Potion field_35441_E = null;
    public static final Potion field_35442_F = null;
    public static final Potion field_35443_G = null;
    public final int field_35447_H;
    private String field_35448_I;
    private int field_40601_J;
    private final boolean field_40602_K;
    private double field_40598_L;
    private boolean field_40599_M;
    private final int field_40600_N;

    protected Potion(int p_i211_1_, boolean p_i211_2_, int p_i211_3_)
    {
        field_35448_I = "";
        field_40601_J = -1;
        field_35447_H = p_i211_1_;
        field_35455_a[p_i211_1_] = this;
        field_40602_K = p_i211_2_;
        if(p_i211_2_)
        {
            field_40598_L = 0.5D;
        } else
        {
            field_40598_L = 1.0D;
        }
        field_40600_N = p_i211_3_;
    }

    protected Potion func_40589_a(int p_40589_1_, int p_40589_2_)
    {
        field_40601_J = p_40589_1_ + p_40589_2_ * 8;
        return this;
    }

    public int func_40594_a()
    {
        return field_35447_H;
    }

    public void func_35438_a(EntityLiving p_35438_1_, int p_35438_2_)
    {
        if(field_35447_H == field_35458_l.field_35447_H)
        {
            if(p_35438_1_.func_40097_ai() < p_35438_1_.func_40095_c())
            {
                p_35438_1_.func_137_a(1);
            }
        } else
        if(field_35447_H == field_35466_u.field_35447_H)
        {
            if(p_35438_1_.func_40097_ai() > 1)
            {
                p_35438_1_.func_121_a(DamageSource.field_35094_l, 1);
            }
        } else
        if(field_35447_H == field_35468_s.field_35447_H && (p_35438_1_ instanceof EntityPlayer))
        {
            ((EntityPlayer)p_35438_1_).func_35198_b(0.025F * (float)(p_35438_2_ + 1));
        } else
        if(field_35447_H == field_35462_h.field_35447_H && !p_35438_1_.func_40100_at() || field_35447_H == field_35463_i.field_35447_H && p_35438_1_.func_40100_at())
        {
            p_35438_1_.func_137_a(6 << p_35438_2_);
        } else
        if(field_35447_H == field_35463_i.field_35447_H && !p_35438_1_.func_40100_at() || field_35447_H == field_35462_h.field_35447_H && p_35438_1_.func_40100_at())
        {
            p_35438_1_.func_121_a(DamageSource.field_35094_l, 6 << p_35438_2_);
        }
    }

    public void func_40588_a(EntityLiving p_40588_1_, EntityLiving p_40588_2_, int p_40588_3_, double p_40588_4_)
    {
        if(field_35447_H == field_35462_h.field_35447_H && !p_40588_2_.func_40100_at() || field_35447_H == field_35463_i.field_35447_H && p_40588_2_.func_40100_at())
        {
            int i = (int)(p_40588_4_ * (double)(6 << p_40588_3_) + 0.5D);
            p_40588_2_.func_137_a(i);
        } else
        if(field_35447_H == field_35463_i.field_35447_H && !p_40588_2_.func_40100_at() || field_35447_H == field_35462_h.field_35447_H && p_40588_2_.func_40100_at())
        {
            int j = (int)(p_40588_4_ * (double)(6 << p_40588_3_) + 0.5D);
            if(p_40588_1_ == null)
            {
                p_40588_2_.func_121_a(DamageSource.field_35094_l, j);
            } else
            {
                p_40588_2_.func_121_a(DamageSource.func_40271_b(p_40588_2_, p_40588_1_), j);
            }
        }
    }

    public boolean func_40595_b()
    {
        return false;
    }

    public boolean func_35437_a(int p_35437_1_, int p_35437_2_)
    {
        if(field_35447_H == field_35458_l.field_35447_H || field_35447_H == field_35466_u.field_35447_H)
        {
            int i = 25 >> p_35437_2_;
            if(i > 0)
            {
                return p_35437_1_ % i == 0;
            } else
            {
                return true;
            }
        }
        return field_35447_H == field_35468_s.field_35447_H;
    }

    public Potion func_35439_a(String p_35439_1_)
    {
        field_35448_I = p_35439_1_;
        return this;
    }

    public String func_40596_c()
    {
        return field_35448_I;
    }

    protected Potion func_40591_a(double p_40591_1_)
    {
        field_40598_L = p_40591_1_;
        return this;
    }

    public double func_40592_d()
    {
        return field_40598_L;
    }

    public Potion func_40590_e()
    {
        field_40599_M = true;
        return this;
    }

    public boolean func_40593_f()
    {
        return field_40599_M;
    }

    public int func_40597_g()
    {
        return field_40600_N;
    }

}
