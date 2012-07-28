// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            PotionEffect, Potion

public class PotionHelper
{

    public static final String field_40562_a = null;
    public static final String field_40560_b = "-0+1-2-3&4-4+13";
    public static final String field_40561_c = "+0-1-2-3&4-4+13";
    public static final String field_40558_d = "-0-1+2-3&4-4+13";
    public static final String field_40559_e = "-0+3-4+13";
    public static final String field_40556_f = "+0-1+2-3&4-4+13";
    public static final String field_40557_g = "+0-1-2+3&4-4+13";
    public static final String field_40569_h = "+0+1-2-3&4-4+13";
    public static final String field_40570_i = "-5+6-7";
    public static final String field_40567_j = "+5-6-7";
    public static final String field_40568_k = "+14&13-13";
    private static final HashMap field_40565_l;
    private static final HashMap field_40566_m;
    private static final HashMap field_40563_n = new HashMap();
    private static final String field_40564_o[] = {
        "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", 
        "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", 
        "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", 
        "potion.prefix.gross", "potion.prefix.stinky"
    };

    public PotionHelper()
    {
    }

    public static boolean func_40547_a(int p_40547_0_, int p_40547_1_)
    {
        return (p_40547_0_ & 1 << p_40547_1_) != 0;
    }

    private static int func_40549_b(int p_40549_0_, int p_40549_1_)
    {
        return func_40547_a(p_40549_0_, p_40549_1_) ? 1 : 0;
    }

    private static int func_40552_c(int p_40552_0_, int p_40552_1_)
    {
        return func_40547_a(p_40552_0_, p_40552_1_) ? 0 : 1;
    }

    public static int func_40553_a(Collection p_40553_0_)
    {
        int i = 0x385dc6;
        if(p_40553_0_ == null || p_40553_0_.isEmpty())
        {
            return i;
        }
        float f = 0.0F;
        float f1 = 0.0F;
        float f2 = 0.0F;
        float f3 = 0.0F;
        for(Iterator iterator = p_40553_0_.iterator(); iterator.hasNext();)
        {
            PotionEffect potioneffect = (PotionEffect)iterator.next();
            int j = Potion.field_35455_a[potioneffect.func_35649_a()].func_40597_g();
            int k = 0;
            while(k <= potioneffect.func_35652_c()) 
            {
                f += (float)(j >> 16 & 0xff) / 255F;
                f1 += (float)(j >> 8 & 0xff) / 255F;
                f2 += (float)(j >> 0 & 0xff) / 255F;
                f3++;
                k++;
            }
        }

        f = (f / f3) * 255F;
        f1 = (f1 / f3) * 255F;
        f2 = (f2 / f3) * 255F;
        return (int)f << 16 | (int)f1 << 8 | (int)f2;
    }

    private static int func_40546_a(boolean p_40546_0_, boolean p_40546_1_, boolean p_40546_2_, int p_40546_3_, int p_40546_4_, int p_40546_5_, int p_40546_6_)
    {
        int i = 0;
        if(p_40546_0_)
        {
            i = func_40552_c(p_40546_6_, p_40546_4_);
        } else
        if(p_40546_3_ != -1)
        {
            if(p_40546_3_ == 0 && func_40551_a(p_40546_6_) == p_40546_4_)
            {
                i = 1;
            } else
            if(p_40546_3_ == 1 && func_40551_a(p_40546_6_) > p_40546_4_)
            {
                i = 1;
            } else
            if(p_40546_3_ == 2 && func_40551_a(p_40546_6_) < p_40546_4_)
            {
                i = 1;
            }
        } else
        {
            i = func_40549_b(p_40546_6_, p_40546_4_);
        }
        if(p_40546_1_)
        {
            i *= p_40546_5_;
        }
        if(p_40546_2_)
        {
            i *= -1;
        }
        return i;
    }

    private static int func_40551_a(int p_40551_0_)
    {
        int i;
        for(i = 0; p_40551_0_ > 0; i++)
        {
            p_40551_0_ &= p_40551_0_ - 1;
        }

        return i;
    }

    private static int func_40554_a(String p_40554_0_, int p_40554_1_, int p_40554_2_, int p_40554_3_)
    {
        if(p_40554_1_ >= p_40554_0_.length() || p_40554_2_ < 0 || p_40554_1_ >= p_40554_2_)
        {
            return 0;
        }
        int i = p_40554_0_.indexOf('|', p_40554_1_);
        if(i >= 0 && i < p_40554_2_)
        {
            int j = func_40554_a(p_40554_0_, p_40554_1_, i - 1, p_40554_3_);
            if(j > 0)
            {
                return j;
            }
            int l = func_40554_a(p_40554_0_, i + 1, p_40554_2_, p_40554_3_);
            if(l > 0)
            {
                return l;
            } else
            {
                return 0;
            }
        }
        int k = p_40554_0_.indexOf('&', p_40554_1_);
        if(k >= 0 && k < p_40554_2_)
        {
            int i1 = func_40554_a(p_40554_0_, p_40554_1_, k - 1, p_40554_3_);
            if(i1 <= 0)
            {
                return 0;
            }
            int j1 = func_40554_a(p_40554_0_, k + 1, p_40554_2_, p_40554_3_);
            if(j1 <= 0)
            {
                return 0;
            }
            if(i1 > j1)
            {
                return i1;
            } else
            {
                return j1;
            }
        }
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        byte byte0 = -1;
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        for(int j2 = p_40554_1_; j2 < p_40554_2_; j2++)
        {
            char c = p_40554_0_.charAt(j2);
            if(c >= '0' && c <= '9')
            {
                if(flag)
                {
                    l1 = c - 48;
                    flag1 = true;
                } else
                {
                    k1 *= 10;
                    k1 += c - 48;
                    flag2 = true;
                }
                continue;
            }
            if(c == '*')
            {
                flag = true;
                continue;
            }
            if(c == '!')
            {
                if(flag2)
                {
                    i2 += func_40546_a(flag3, flag1, flag4, byte0, k1, l1, p_40554_3_);
                    flag2 = flag1 = flag = flag4 = flag3 = false;
                    k1 = l1 = 0;
                    byte0 = -1;
                }
                flag3 = true;
                continue;
            }
            if(c == '-')
            {
                if(flag2)
                {
                    i2 += func_40546_a(flag3, flag1, flag4, byte0, k1, l1, p_40554_3_);
                    flag2 = flag1 = flag = flag4 = flag3 = false;
                    k1 = l1 = 0;
                    byte0 = -1;
                }
                flag4 = true;
                continue;
            }
            if(c == '=' || c == '<' || c == '>')
            {
                if(flag2)
                {
                    i2 += func_40546_a(flag3, flag1, flag4, byte0, k1, l1, p_40554_3_);
                    flag2 = flag1 = flag = flag4 = flag3 = false;
                    k1 = l1 = 0;
                    byte0 = -1;
                }
                if(c == '=')
                {
                    byte0 = 0;
                    continue;
                }
                if(c == '<')
                {
                    byte0 = 2;
                    continue;
                }
                if(c == '>')
                {
                    byte0 = 1;
                }
                continue;
            }
            if(c == '+' && flag2)
            {
                i2 += func_40546_a(flag3, flag1, flag4, byte0, k1, l1, p_40554_3_);
                flag2 = flag1 = flag = flag4 = flag3 = false;
                k1 = l1 = 0;
                byte0 = -1;
            }
        }

        if(flag2)
        {
            i2 += func_40546_a(flag3, flag1, flag4, byte0, k1, l1, p_40554_3_);
        }
        return i2;
    }

    public static List func_40550_a(int p_40550_0_, boolean p_40550_1_)
    {
        ArrayList arraylist = null;
        Potion apotion[] = Potion.field_35455_a;
        int i = apotion.length;
        for(int j = 0; j < i; j++)
        {
            Potion potion = apotion[j];
            if(potion == null || potion.func_40593_f() && !p_40550_1_)
            {
                continue;
            }
            String s = (String)field_40565_l.get(Integer.valueOf(potion.func_40594_a()));
            if(s == null)
            {
                continue;
            }
            int k = func_40554_a(s, 0, s.length(), p_40550_0_);
            if(k <= 0)
            {
                continue;
            }
            int l = 0;
            String s1 = (String)field_40566_m.get(Integer.valueOf(potion.func_40594_a()));
            if(s1 != null)
            {
                l = func_40554_a(s1, 0, s1.length(), p_40550_0_);
                if(l < 0)
                {
                    l = 0;
                }
            }
            if(potion.func_40595_b())
            {
                k = 1;
            } else
            {
                k = 1200 * (k * 3 + (k - 1) * 2);
                k >>= l;
                k = (int)Math.round((double)k * potion.func_40592_d());
                if((p_40550_0_ & 0x4000) != 0)
                {
                    k = (int)Math.round((double)k * 0.75D + 0.5D);
                }
            }
            if(arraylist == null)
            {
                arraylist = new ArrayList();
            }
            arraylist.add(new PotionEffect(potion.func_40594_a(), k, l));
        }

        return arraylist;
    }

    private static int func_40548_a(int p_40548_0_, int p_40548_1_, boolean p_40548_2_, boolean p_40548_3_, boolean p_40548_4_)
    {
        if(p_40548_4_)
        {
            if(!func_40547_a(p_40548_0_, p_40548_1_))
            {
                return 0;
            }
        } else
        if(p_40548_2_)
        {
            p_40548_0_ &= ~(1 << p_40548_1_);
        } else
        if(p_40548_3_)
        {
            if((p_40548_0_ & 1 << p_40548_1_) != 0)
            {
                p_40548_0_ &= ~(1 << p_40548_1_);
            } else
            {
                p_40548_0_ |= 1 << p_40548_1_;
            }
        } else
        {
            p_40548_0_ |= 1 << p_40548_1_;
        }
        return p_40548_0_;
    }

    public static int func_40555_a(int p_40555_0_, String p_40555_1_)
    {
        boolean flag = false;
        int i = p_40555_1_.length();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        int j = 0;
        for(int k = ((flag) ? 1 : 0); k < i; k++)
        {
            char c = p_40555_1_.charAt(k);
            if(c >= '0' && c <= '9')
            {
                j *= 10;
                j += c - 48;
                flag1 = true;
                continue;
            }
            if(c == '!')
            {
                if(flag1)
                {
                    p_40555_0_ = func_40548_a(p_40555_0_, j, flag3, flag2, flag4);
                    flag1 = flag3 = flag2 = flag4 = false;
                    j = 0;
                }
                flag2 = true;
                continue;
            }
            if(c == '-')
            {
                if(flag1)
                {
                    p_40555_0_ = func_40548_a(p_40555_0_, j, flag3, flag2, flag4);
                    flag1 = flag3 = flag2 = flag4 = false;
                    j = 0;
                }
                flag3 = true;
                continue;
            }
            if(c == '+')
            {
                if(flag1)
                {
                    p_40555_0_ = func_40548_a(p_40555_0_, j, flag3, flag2, flag4);
                    flag1 = flag3 = flag2 = flag4 = false;
                    j = 0;
                }
                continue;
            }
            if(c != '&')
            {
                continue;
            }
            if(flag1)
            {
                p_40555_0_ = func_40548_a(p_40555_0_, j, flag3, flag2, flag4);
                flag1 = flag3 = flag2 = flag4 = false;
                j = 0;
            }
            flag4 = true;
        }

        if(flag1)
        {
            p_40555_0_ = func_40548_a(p_40555_0_, j, flag3, flag2, flag4);
        }
        return p_40555_0_ & 0x7fff;
    }

    static 
    {
        field_40565_l = new HashMap();
        field_40566_m = new HashMap();
        field_40565_l.put(Integer.valueOf(Potion.field_35458_l.func_40594_a()), "0 & !1 & !2 & !3 & 0+6");
        field_40565_l.put(Integer.valueOf(Potion.field_35454_c.func_40594_a()), "!0 & 1 & !2 & !3 & 1+6");
        field_40565_l.put(Integer.valueOf(Potion.field_35456_n.func_40594_a()), "0 & 1 & !2 & !3 & 0+6");
        field_40565_l.put(Integer.valueOf(Potion.field_35462_h.func_40594_a()), "0 & !1 & 2 & !3");
        field_40565_l.put(Integer.valueOf(Potion.field_35466_u.func_40594_a()), "!0 & !1 & 2 & !3 & 2+6");
        field_40565_l.put(Integer.valueOf(Potion.field_35467_t.func_40594_a()), "!0 & !1 & !2 & 3 & 3+6");
        field_40565_l.put(Integer.valueOf(Potion.field_35463_i.func_40594_a()), "!0 & !1 & 2 & 3");
        field_40565_l.put(Integer.valueOf(Potion.field_35451_d.func_40594_a()), "!0 & 1 & !2 & 3 & 3+6");
        field_40565_l.put(Integer.valueOf(Potion.field_35450_g.func_40594_a()), "0 & !1 & !2 & 3 & 3+6");
        field_40566_m.put(Integer.valueOf(Potion.field_35454_c.func_40594_a()), "5");
        field_40566_m.put(Integer.valueOf(Potion.field_35452_e.func_40594_a()), "5");
        field_40566_m.put(Integer.valueOf(Potion.field_35450_g.func_40594_a()), "5");
        field_40566_m.put(Integer.valueOf(Potion.field_35458_l.func_40594_a()), "5");
        field_40566_m.put(Integer.valueOf(Potion.field_35463_i.func_40594_a()), "5");
        field_40566_m.put(Integer.valueOf(Potion.field_35462_h.func_40594_a()), "5");
        field_40566_m.put(Integer.valueOf(Potion.field_35459_m.func_40594_a()), "5");
        field_40566_m.put(Integer.valueOf(Potion.field_35466_u.func_40594_a()), "5");
    }
}
