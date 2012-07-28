// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityDragonBase, EntityDragonPart, DataWatcher, World, 
//            MathHelper, Entity, AxisAlignedBB, Vec3D, 
//            EntityEnderCrystal, DamageSource, EntityLiving, Block, 
//            EntityPlayer, EntityXPOrb, BlockEndPortal

public class EntityDragon extends EntityDragonBase
{

    public double field_40148_a;
    public double field_40146_b;
    public double field_40147_c;
    public double field_40144_d[][];
    public int field_40145_e;
    public EntityDragonPart field_40142_f[];
    public EntityDragonPart field_40143_g;
    public EntityDragonPart field_40155_h;
    public EntityDragonPart field_40156_i;
    public EntityDragonPart field_40153_j;
    public EntityDragonPart field_40154_k;
    public EntityDragonPart field_40151_l;
    public EntityDragonPart field_40152_m;
    public float field_40149_n;
    public float field_40150_o;
    public boolean field_40160_p;
    public boolean field_40159_q;
    private Entity field_40157_t;
    public int field_40158_r;
    public EntityEnderCrystal field_41039_t;

    public EntityDragon(World p_i479_1_)
    {
        super(p_i479_1_);
        field_40144_d = new double[64][3];
        field_40145_e = -1;
        field_40149_n = 0.0F;
        field_40150_o = 0.0F;
        field_40160_p = false;
        field_40159_q = false;
        field_40158_r = 0;
        field_41039_t = null;
        field_40142_f = (new EntityDragonPart[] {
            field_40143_g = new EntityDragonPart(this, "head", 6F, 6F), field_40155_h = new EntityDragonPart(this, "body", 8F, 8F), field_40156_i = new EntityDragonPart(this, "tail", 4F, 4F), field_40153_j = new EntityDragonPart(this, "tail", 4F, 4F), field_40154_k = new EntityDragonPart(this, "tail", 4F, 4F), field_40151_l = new EntityDragonPart(this, "wing", 4F, 4F), field_40152_m = new EntityDragonPart(this, "wing", 4F, 4F)
        });
        field_40138_s = 200;
        func_40103_i(field_40138_s);
        field_9119_aG = "/mob/enderdragon/ender.png";
        func_113_a(16F, 8F);
        field_9066_T = true;
        field_9079_ae = true;
        field_40146_b = 100D;
        field_28008_bI = true;
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, new Integer(field_40138_s));
    }

    public double[] func_40139_a(int p_40139_1_, float p_40139_2_)
    {
        if(field_9109_aQ <= 0)
        {
            p_40139_2_ = 0.0F;
        }
        p_40139_2_ = 1.0F - p_40139_2_;
        int i = field_40145_e - p_40139_1_ * 1 & 0x3f;
        int j = field_40145_e - p_40139_1_ * 1 - 1 & 0x3f;
        double ad[] = new double[3];
        double d = field_40144_d[i][0];
        double d1;
        for(d1 = field_40144_d[j][0] - d; d1 < -180D; d1 += 360D) { }
        for(; d1 >= 180D; d1 -= 360D) { }
        ad[0] = d + d1 * (double)p_40139_2_;
        d = field_40144_d[i][1];
        d1 = field_40144_d[j][1] - d;
        ad[1] = d + d1 * (double)p_40139_2_;
        ad[2] = field_40144_d[i][2] + (field_40144_d[j][2] - field_40144_d[i][2]) * (double)p_40139_2_;
        return ad;
    }

    public void func_153_y()
    {
        field_40149_n = field_40150_o;
        if(!field_9093_l.field_792_x)
        {
            field_21045_af.func_21155_b(16, Integer.valueOf(field_9109_aQ));
        }
        if(field_9109_aQ <= 0)
        {
            float f = (field_9064_W.nextFloat() - 0.5F) * 8F;
            float f2 = (field_9064_W.nextFloat() - 0.5F) * 4F;
            float f4 = (field_9064_W.nextFloat() - 0.5F) * 8F;
            field_9093_l.func_514_a("largeexplode", field_322_l + (double)f, field_321_m + 2D + (double)f2, field_320_n + (double)f4, 0.0D, 0.0D, 0.0D);
            return;
        }
        func_41036_u();
        float f1 = 0.2F / (MathHelper.func_583_a(field_319_o * field_319_o + field_317_q * field_317_q) * 10F + 1.0F);
        f1 *= (float)Math.pow(2D, field_318_p);
        if(field_40159_q)
        {
            field_40150_o += f1 * 0.5F;
        } else
        {
            field_40150_o += f1;
        }
        for(; field_316_r >= 180F; field_316_r -= 360F) { }
        for(; field_316_r < -180F; field_316_r += 360F) { }
        if(field_40145_e < 0)
        {
            for(int i = 0; i < field_40144_d.length; i++)
            {
                field_40144_d[i][0] = field_316_r;
                field_40144_d[i][1] = field_321_m;
            }

        }
        if(++field_40145_e == field_40144_d.length)
        {
            field_40145_e = 0;
        }
        field_40144_d[field_40145_e][0] = field_316_r;
        field_40144_d[field_40145_e][1] = field_321_m;
        if(field_9093_l.field_792_x)
        {
            if(field_9140_bf > 0)
            {
                double d = field_322_l + (field_9139_bg - field_322_l) / (double)field_9140_bf;
                double d2 = field_321_m + (field_9138_bh - field_321_m) / (double)field_9140_bf;
                double d4 = field_320_n + (field_9137_bi - field_320_n) / (double)field_9140_bf;
                double d6;
                for(d6 = field_9136_bj - (double)field_316_r; d6 < -180D; d6 += 360D) { }
                for(; d6 >= 180D; d6 -= 360D) { }
                field_316_r += d6 / (double)field_9140_bf;
                field_315_s += (field_9135_bk - (double)field_315_s) / (double)field_9140_bf;
                field_9140_bf--;
                func_86_a(d, d2, d4);
                func_6096_b(field_316_r, field_315_s);
            }
        } else
        {
            double d1 = field_40148_a - field_322_l;
            double d3 = field_40146_b - field_321_m;
            double d5 = field_40147_c - field_320_n;
            double d7 = d1 * d1 + d3 * d3 + d5 * d5;
            if(field_40157_t != null)
            {
                field_40148_a = field_40157_t.field_322_l;
                field_40147_c = field_40157_t.field_320_n;
                double d8 = field_40148_a - field_322_l;
                double d10 = field_40147_c - field_320_n;
                double d12 = Math.sqrt(d8 * d8 + d10 * d10);
                double d13 = (0.40000000596046448D + d12 / 80D) - 1.0D;
                if(d13 > 10D)
                {
                    d13 = 10D;
                }
                field_40146_b = field_40157_t.field_312_v.field_963_b + d13;
            } else
            {
                field_40148_a += field_9064_W.nextGaussian() * 2D;
                field_40147_c += field_9064_W.nextGaussian() * 2D;
            }
            if(field_40160_p || d7 < 100D || d7 > 22500D || field_9084_B || field_9082_C)
            {
                func_41037_w();
            }
            d3 /= MathHelper.func_583_a(d1 * d1 + d5 * d5);
            float f10 = 0.6F;
            if(d3 < (double)(-f10))
            {
                d3 = -f10;
            }
            if(d3 > (double)f10)
            {
                d3 = f10;
            }
            field_318_p += d3 * 0.10000000149011612D;
            for(; field_316_r < -180F; field_316_r += 360F) { }
            for(; field_316_r >= 180F; field_316_r -= 360F) { }
            double d9 = 180D - (Math.atan2(d1, d5) * 180D) / 3.1415927410125732D;
            double d11;
            for(d11 = d9 - (double)field_316_r; d11 < -180D; d11 += 360D) { }
            for(; d11 >= 180D; d11 -= 360D) { }
            if(d11 > 50D)
            {
                d11 = 50D;
            }
            if(d11 < -50D)
            {
                d11 = -50D;
            }
            Vec3D vec3d = Vec3D.func_768_b(field_40148_a - field_322_l, field_40146_b - field_321_m, field_40147_c - field_320_n).func_758_b();
            Vec3D vec3d1 = Vec3D.func_768_b(MathHelper.func_585_a((field_316_r * 3.141593F) / 180F), field_318_p, -MathHelper.func_582_b((field_316_r * 3.141593F) / 180F)).func_758_b();
            float f18 = (float)(vec3d1.func_35570_a(vec3d) + 0.5D) / 1.5F;
            if(f18 < 0.0F)
            {
                f18 = 0.0F;
            }
            field_9129_bq *= 0.8F;
            float f19 = MathHelper.func_583_a(field_319_o * field_319_o + field_317_q * field_317_q) * 1.0F + 1.0F;
            double d14 = Math.sqrt(field_319_o * field_319_o + field_317_q * field_317_q) * 1.0D + 1.0D;
            if(d14 > 40D)
            {
                d14 = 40D;
            }
            field_9129_bq += d11 * (0.69999998807907104D / d14 / (double)f19);
            field_316_r += field_9129_bq * 0.1F;
            float f20 = (float)(2D / (d14 + 1.0D));
            float f21 = 0.06F;
            func_90_a(0.0F, -1F, f21 * (f18 * f20 + (1.0F - f20)));
            if(field_40159_q)
            {
                func_88_c(field_319_o * 0.80000001192092896D, field_318_p * 0.80000001192092896D, field_317_q * 0.80000001192092896D);
            } else
            {
                func_88_c(field_319_o, field_318_p, field_317_q);
            }
            Vec3D vec3d2 = Vec3D.func_768_b(field_319_o, field_318_p, field_317_q).func_758_b();
            float f22 = (float)(vec3d2.func_35570_a(vec3d1) + 1.0D) / 2.0F;
            f22 = 0.8F + 0.15F * f22;
            field_319_o *= f22;
            field_317_q *= f22;
            field_318_p *= 0.9100000262260437D;
        }
        field_9095_az = field_316_r;
        field_40143_g.field_300_D = field_40143_g.field_298_E = 3F;
        field_40156_i.field_300_D = field_40156_i.field_298_E = 2.0F;
        field_40153_j.field_300_D = field_40153_j.field_298_E = 2.0F;
        field_40154_k.field_300_D = field_40154_k.field_298_E = 2.0F;
        field_40155_h.field_298_E = 3F;
        field_40155_h.field_300_D = 5F;
        field_40151_l.field_298_E = 2.0F;
        field_40151_l.field_300_D = 4F;
        field_40152_m.field_298_E = 3F;
        field_40152_m.field_300_D = 4F;
        float f3 = (((float)(func_40139_a(5, 1.0F)[1] - func_40139_a(10, 1.0F)[1]) * 10F) / 180F) * 3.141593F;
        float f5 = MathHelper.func_582_b(f3);
        float f6 = -MathHelper.func_585_a(f3);
        float f7 = (field_316_r * 3.141593F) / 180F;
        float f8 = MathHelper.func_585_a(f7);
        float f9 = MathHelper.func_582_b(f7);
        field_40155_h.func_106_b_();
        field_40155_h.func_107_c(field_322_l + (double)(f8 * 0.5F), field_321_m, field_320_n - (double)(f9 * 0.5F), 0.0F, 0.0F);
        field_40151_l.func_106_b_();
        field_40151_l.func_107_c(field_322_l + (double)(f9 * 4.5F), field_321_m + 2D, field_320_n + (double)(f8 * 4.5F), 0.0F, 0.0F);
        field_40152_m.func_106_b_();
        field_40152_m.func_107_c(field_322_l - (double)(f9 * 4.5F), field_321_m + 2D, field_320_n - (double)(f8 * 4.5F), 0.0F, 0.0F);
        if(!field_9093_l.field_792_x)
        {
            func_41033_v();
        }
        if(!field_9093_l.field_792_x && field_9106_aT == 0)
        {
            func_41034_a(field_9093_l.func_450_b(this, field_40151_l.field_312_v.func_708_b(4D, 2D, 4D).func_702_d(0.0D, -2D, 0.0D)));
            func_41034_a(field_9093_l.func_450_b(this, field_40152_m.field_312_v.func_708_b(4D, 2D, 4D).func_702_d(0.0D, -2D, 0.0D)));
            func_41035_b(field_9093_l.func_450_b(this, field_40143_g.field_312_v.func_708_b(1.0D, 1.0D, 1.0D)));
        }
        double ad[] = func_40139_a(5, 1.0F);
        double ad1[] = func_40139_a(0, 1.0F);
        float f11 = MathHelper.func_585_a((field_316_r * 3.141593F) / 180F - field_9129_bq * 0.01F);
        float f12 = MathHelper.func_582_b((field_316_r * 3.141593F) / 180F - field_9129_bq * 0.01F);
        field_40143_g.func_106_b_();
        field_40143_g.func_107_c(field_322_l + (double)(f11 * 5.5F * f5), field_321_m + (ad1[1] - ad[1]) * 1.0D + (double)(f6 * 5.5F), field_320_n - (double)(f12 * 5.5F * f5), 0.0F, 0.0F);
        for(int j = 0; j < 3; j++)
        {
            EntityDragonPart entitydragonpart = null;
            if(j == 0)
            {
                entitydragonpart = field_40156_i;
            }
            if(j == 1)
            {
                entitydragonpart = field_40153_j;
            }
            if(j == 2)
            {
                entitydragonpart = field_40154_k;
            }
            double ad2[] = func_40139_a(12 + j * 2, 1.0F);
            float f13 = (field_316_r * 3.141593F) / 180F + ((func_40141_a(ad2[0] - ad[0]) * 3.141593F) / 180F) * 1.0F;
            float f14 = MathHelper.func_585_a(f13);
            float f15 = MathHelper.func_582_b(f13);
            float f16 = 1.5F;
            float f17 = (float)(j + 1) * 2.0F;
            entitydragonpart.func_106_b_();
            entitydragonpart.func_107_c(field_322_l - (double)((f8 * f16 + f14 * f17) * f5), ((field_321_m + (ad2[1] - ad[1]) * 1.0D) - (double)((f17 + f16) * f6)) + 1.5D, field_320_n + (double)((f9 * f16 + f15 * f17) * f5), 0.0F, 0.0F);
        }

        if(!field_9093_l.field_792_x)
        {
            field_40159_q = func_40140_a(field_40143_g.field_312_v) | func_40140_a(field_40155_h.field_312_v);
        }
    }

    private void func_41036_u()
    {
        if(field_41039_t != null)
        {
            if(field_41039_t.field_304_B)
            {
                if(!field_9093_l.field_792_x)
                {
                    func_40136_a(field_40143_g, DamageSource.field_35097_k, 10);
                }
                field_41039_t = null;
            } else
            if(field_9063_X % 10 == 0 && field_9109_aQ < field_40138_s)
            {
                field_9109_aQ++;
            }
        }
        if(field_9064_W.nextInt(10) == 0)
        {
            float f = 32F;
            List list = field_9093_l.func_457_a(net.minecraft.src.EntityEnderCrystal.class, field_312_v.func_708_b(f, f, f));
            EntityEnderCrystal entityendercrystal = null;
            double d = 1.7976931348623157E+308D;
            Iterator iterator = list.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                Entity entity = (Entity)iterator.next();
                double d1 = entity.func_102_b(this);
                if(d1 < d)
                {
                    d = d1;
                    entityendercrystal = (EntityEnderCrystal)entity;
                }
            } while(true);
            field_41039_t = entityendercrystal;
        }
    }

    private void func_41033_v()
    {
    }

    private void func_41034_a(List p_41034_1_)
    {
        double d = (field_40155_h.field_312_v.field_964_a + field_40155_h.field_312_v.field_969_d) / 2D;
        double d1 = (field_40155_h.field_312_v.field_970_c + field_40155_h.field_312_v.field_967_f) / 2D;
        Iterator iterator = p_41034_1_.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Entity entity = (Entity)iterator.next();
            if(entity instanceof EntityLiving)
            {
                double d2 = entity.field_322_l - d;
                double d3 = entity.field_320_n - d1;
                double d4 = d2 * d2 + d3 * d3;
                entity.func_87_f((d2 / d4) * 4D, 0.20000000298023224D, (d3 / d4) * 4D);
            }
        } while(true);
    }

    private void func_41035_b(List p_41035_1_)
    {
        for(int i = 0; i < p_41035_1_.size(); i++)
        {
            Entity entity = (Entity)p_41035_1_.get(i);
            if(entity instanceof EntityLiving)
            {
                entity.func_121_a(DamageSource.func_35072_a(this), 10);
            }
        }

    }

    private void func_41037_w()
    {
        field_40160_p = false;
        if(field_9064_W.nextInt(2) == 0 && field_9093_l.field_805_k.size() > 0)
        {
            field_40157_t = (Entity)field_9093_l.field_805_k.get(field_9064_W.nextInt(field_9093_l.field_805_k.size()));
        } else
        {
            boolean flag = false;
            do
            {
                field_40148_a = 0.0D;
                field_40146_b = 70F + field_9064_W.nextFloat() * 50F;
                field_40147_c = 0.0D;
                field_40148_a += field_9064_W.nextFloat() * 120F - 60F;
                field_40147_c += field_9064_W.nextFloat() * 120F - 60F;
                double d = field_322_l - field_40148_a;
                double d1 = field_321_m - field_40146_b;
                double d2 = field_320_n - field_40147_c;
                flag = d * d + d1 * d1 + d2 * d2 > 100D;
            } while(!flag);
            field_40157_t = null;
        }
    }

    private float func_40141_a(double p_40141_1_)
    {
        for(; p_40141_1_ >= 180D; p_40141_1_ -= 360D) { }
        for(; p_40141_1_ < -180D; p_40141_1_ += 360D) { }
        return (float)p_40141_1_;
    }

    private boolean func_40140_a(AxisAlignedBB p_40140_1_)
    {
        int i = MathHelper.func_584_b(p_40140_1_.field_964_a);
        int j = MathHelper.func_584_b(p_40140_1_.field_963_b);
        int k = MathHelper.func_584_b(p_40140_1_.field_970_c);
        int l = MathHelper.func_584_b(p_40140_1_.field_969_d);
        int i1 = MathHelper.func_584_b(p_40140_1_.field_968_e);
        int j1 = MathHelper.func_584_b(p_40140_1_.field_967_f);
        boolean flag = false;
        boolean flag1 = false;
        for(int k1 = i; k1 <= l; k1++)
        {
            for(int l1 = j; l1 <= i1; l1++)
            {
                for(int i2 = k; i2 <= j1; i2++)
                {
                    int j2 = field_9093_l.func_444_a(k1, l1, i2);
                    if(j2 == 0)
                    {
                        continue;
                    }
                    if(j2 == Block.field_602_aq.field_573_bc || j2 == Block.field_40168_bK.field_573_bc || j2 == Block.field_4064_A.field_573_bc)
                    {
                        flag = true;
                    } else
                    {
                        flag1 = true;
                        field_9093_l.func_508_d(k1, l1, i2, 0);
                    }
                }

            }

        }

        if(flag1)
        {
            double d = p_40140_1_.field_964_a + (p_40140_1_.field_969_d - p_40140_1_.field_964_a) * (double)field_9064_W.nextFloat();
            double d1 = p_40140_1_.field_963_b + (p_40140_1_.field_968_e - p_40140_1_.field_963_b) * (double)field_9064_W.nextFloat();
            double d2 = p_40140_1_.field_970_c + (p_40140_1_.field_967_f - p_40140_1_.field_970_c) * (double)field_9064_W.nextFloat();
            field_9093_l.func_514_a("largeexplode", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
        return flag;
    }

    public boolean func_40136_a(EntityDragonPart p_40136_1_, DamageSource p_40136_2_, int p_40136_3_)
    {
        if(p_40136_1_ != field_40143_g)
        {
            p_40136_3_ = p_40136_3_ / 4 + 1;
        }
        float f = (field_316_r * 3.141593F) / 180F;
        float f1 = MathHelper.func_585_a(f);
        float f2 = MathHelper.func_582_b(f);
        field_40148_a = field_322_l + (double)(f1 * 5F) + (double)((field_9064_W.nextFloat() - 0.5F) * 2.0F);
        field_40146_b = field_321_m + (double)(field_9064_W.nextFloat() * 3F) + 1.0D;
        field_40147_c = (field_320_n - (double)(f2 * 5F)) + (double)((field_9064_W.nextFloat() - 0.5F) * 2.0F);
        field_40157_t = null;
        if((p_40136_2_.func_35080_a() instanceof EntityPlayer) || p_40136_2_ == DamageSource.field_35097_k)
        {
            func_40137_e(p_40136_2_, p_40136_3_);
        }
        return true;
    }

    protected void func_40102_ag()
    {
        field_40158_r++;
        if(field_40158_r >= 180 && field_40158_r <= 200)
        {
            float f = (field_9064_W.nextFloat() - 0.5F) * 8F;
            float f1 = (field_9064_W.nextFloat() - 0.5F) * 4F;
            float f2 = (field_9064_W.nextFloat() - 0.5F) * 8F;
            field_9093_l.func_514_a("hugeexplosion", field_322_l + (double)f, field_321_m + 2D + (double)f1, field_320_n + (double)f2, 0.0D, 0.0D, 0.0D);
        }
        if(!field_9093_l.field_792_x && field_40158_r > 150 && field_40158_r % 5 == 0)
        {
            for(int i = 1000; i > 0;)
            {
                int k = EntityXPOrb.func_35152_b(i);
                i -= k;
                field_9093_l.func_526_a(new EntityXPOrb(field_9093_l, field_322_l, field_321_m, field_320_n, k));
            }

        }
        func_88_c(0.0D, 0.10000000149011612D, 0.0D);
        field_9095_az = field_316_r += 20F;
        if(field_40158_r == 200)
        {
            for(int j = 10000; j > 0;)
            {
                int l = EntityXPOrb.func_35152_b(j);
                j -= l;
                field_9093_l.func_526_a(new EntityXPOrb(field_9093_l, field_322_l, field_321_m, field_320_n, l));
            }

            func_41038_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_320_n));
            func_6101_K();
            func_118_j();
        }
    }

    private void func_41038_a(int p_41038_1_, int p_41038_2_)
    {
        byte byte0 = 64;
        BlockEndPortal.field_41003_a = true;
        int i = 4;
        for(int j = byte0 - 1; j <= byte0 + 32; j++)
        {
            for(int k = p_41038_1_ - i; k <= p_41038_1_ + i; k++)
            {
                for(int l = p_41038_2_ - i; l <= p_41038_2_ + i; l++)
                {
                    double d = k - p_41038_1_;
                    double d1 = l - p_41038_2_;
                    double d2 = MathHelper.func_583_a(d * d + d1 * d1);
                    if(d2 > (double)i - 0.5D)
                    {
                        continue;
                    }
                    if(j < byte0)
                    {
                        if(d2 <= (double)(i - 1) - 0.5D)
                        {
                            field_9093_l.func_508_d(k, j, l, Block.field_4064_A.field_573_bc);
                        }
                        continue;
                    }
                    if(j > byte0)
                    {
                        field_9093_l.func_508_d(k, j, l, 0);
                        continue;
                    }
                    if(d2 > (double)(i - 1) - 0.5D)
                    {
                        field_9093_l.func_508_d(k, j, l, Block.field_4064_A.field_573_bc);
                    } else
                    {
                        field_9093_l.func_508_d(k, j, l, Block.field_40174_bI.field_573_bc);
                    }
                }

            }

        }

        field_9093_l.func_508_d(p_41038_1_, byte0 + 0, p_41038_2_, Block.field_4064_A.field_573_bc);
        field_9093_l.func_508_d(p_41038_1_, byte0 + 1, p_41038_2_, Block.field_4064_A.field_573_bc);
        field_9093_l.func_508_d(p_41038_1_, byte0 + 2, p_41038_2_, Block.field_4064_A.field_573_bc);
        field_9093_l.func_508_d(p_41038_1_ - 1, byte0 + 2, p_41038_2_, Block.field_9046_aq.field_573_bc);
        field_9093_l.func_508_d(p_41038_1_ + 1, byte0 + 2, p_41038_2_, Block.field_9046_aq.field_573_bc);
        field_9093_l.func_508_d(p_41038_1_, byte0 + 2, p_41038_2_ - 1, Block.field_9046_aq.field_573_bc);
        field_9093_l.func_508_d(p_41038_1_, byte0 + 2, p_41038_2_ + 1, Block.field_9046_aq.field_573_bc);
        field_9093_l.func_508_d(p_41038_1_, byte0 + 3, p_41038_2_, Block.field_4064_A.field_573_bc);
        field_9093_l.func_508_d(p_41038_1_, byte0 + 4, p_41038_2_, Block.field_41002_bK.field_573_bc);
        BlockEndPortal.field_41003_a = false;
    }

    protected void func_27013_Q()
    {
    }

    public Entity[] func_40037_aF()
    {
        return field_40142_f;
    }

    public boolean func_129_c_()
    {
        return false;
    }
}
