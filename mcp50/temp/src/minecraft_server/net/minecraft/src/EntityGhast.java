// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFlying, IMob, DamageSource, EntityPlayer, 
//            AchievementList, DataWatcher, World, MathHelper, 
//            Entity, AxisAlignedBB, EntityFireball, Vec3D, 
//            Item

public class EntityGhast extends EntityFlying
    implements IMob
{

    public int field_20903_a;
    public double field_20902_b;
    public double field_20904_c;
    public double field_4102_d;
    private Entity field_4097_ai;
    private int field_4103_aj;
    public int field_4101_e;
    public int field_4100_f;

    public EntityGhast(World p_i48_1_)
    {
        super(p_i48_1_);
        field_20903_a = 0;
        field_4097_ai = null;
        field_4103_aj = 0;
        field_4101_e = 0;
        field_4100_f = 0;
        field_9119_aG = "/mob/ghast.png";
        func_113_a(4F, 4F);
        field_9079_ae = true;
        field_35192_ax = 5;
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        if("fireball".equals(p_121_1_.func_40274_l()) && (p_121_1_.func_35080_a() instanceof EntityPlayer))
        {
            super.func_121_a(p_121_1_, 1000);
            ((EntityPlayer)p_121_1_.func_35080_a()).func_27017_a(AchievementList.field_40480_y);
            return true;
        } else
        {
            return super.func_121_a(p_121_1_, p_121_2_);
        }
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, Byte.valueOf((byte)0));
    }

    public int func_40095_c()
    {
        return 10;
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        byte byte0 = field_21045_af.func_21156_a(16);
        field_9119_aG = byte0 != 1 ? "/mob/ghast.png" : "/mob/ghast_fire.png";
    }

    protected void func_152_d_()
    {
        if(!field_9093_l.field_792_x && field_9093_l.field_804_l == 0)
        {
            func_118_j();
        }
        func_27013_Q();
        field_4101_e = field_4100_f;
        double d = field_20902_b - field_322_l;
        double d1 = field_20904_c - field_321_m;
        double d2 = field_4102_d - field_320_n;
        double d3 = MathHelper.func_583_a(d * d + d1 * d1 + d2 * d2);
        if(d3 < 1.0D || d3 > 60D)
        {
            field_20902_b = field_322_l + (double)((field_9064_W.nextFloat() * 2.0F - 1.0F) * 16F);
            field_20904_c = field_321_m + (double)((field_9064_W.nextFloat() * 2.0F - 1.0F) * 16F);
            field_4102_d = field_320_n + (double)((field_9064_W.nextFloat() * 2.0F - 1.0F) * 16F);
        }
        if(field_20903_a-- <= 0)
        {
            field_20903_a += field_9064_W.nextInt(5) + 2;
            if(func_4046_a(field_20902_b, field_20904_c, field_4102_d, d3))
            {
                field_319_o += (d / d3) * 0.10000000000000001D;
                field_318_p += (d1 / d3) * 0.10000000000000001D;
                field_317_q += (d2 / d3) * 0.10000000000000001D;
            } else
            {
                field_20902_b = field_322_l;
                field_20904_c = field_321_m;
                field_4102_d = field_320_n;
            }
        }
        if(field_4097_ai != null && field_4097_ai.field_304_B)
        {
            field_4097_ai = null;
        }
        if(field_4097_ai == null || field_4103_aj-- <= 0)
        {
            field_4097_ai = field_9093_l.func_40211_b(this, 100D);
            if(field_4097_ai != null)
            {
                field_4103_aj = 20;
            }
        }
        double d4 = 64D;
        if(field_4097_ai != null && field_4097_ai.func_102_b(this) < d4 * d4)
        {
            double d5 = field_4097_ai.field_322_l - field_322_l;
            double d6 = (field_4097_ai.field_312_v.field_963_b + (double)(field_4097_ai.field_298_E / 2.0F)) - (field_321_m + (double)(field_298_E / 2.0F));
            double d7 = field_4097_ai.field_320_n - field_320_n;
            field_9095_az = field_316_r = (-(float)Math.atan2(d5, d7) * 180F) / 3.141593F;
            if(func_145_g(field_4097_ai))
            {
                if(field_4100_f == 10)
                {
                    field_9093_l.func_28101_a(null, 1007, (int)field_322_l, (int)field_321_m, (int)field_320_n, 0);
                }
                field_4100_f++;
                if(field_4100_f == 20)
                {
                    field_9093_l.func_28101_a(null, 1008, (int)field_322_l, (int)field_321_m, (int)field_320_n, 0);
                    EntityFireball entityfireball = new EntityFireball(field_9093_l, this, d5, d6, d7);
                    double d8 = 4D;
                    Vec3D vec3d = func_141_d(1.0F);
                    entityfireball.field_322_l = field_322_l + vec3d.field_1055_a * d8;
                    entityfireball.field_321_m = field_321_m + (double)(field_298_E / 2.0F) + 0.5D;
                    entityfireball.field_320_n = field_320_n + vec3d.field_1058_c * d8;
                    field_9093_l.func_526_a(entityfireball);
                    field_4100_f = -40;
                }
            } else
            if(field_4100_f > 0)
            {
                field_4100_f--;
            }
        } else
        {
            field_9095_az = field_316_r = (-(float)Math.atan2(field_319_o, field_317_q) * 180F) / 3.141593F;
            if(field_4100_f > 0)
            {
                field_4100_f--;
            }
        }
        if(!field_9093_l.field_792_x)
        {
            byte byte0 = field_21045_af.func_21156_a(16);
            byte byte1 = (byte)(field_4100_f <= 10 ? 0 : 1);
            if(byte0 != byte1)
            {
                field_21045_af.func_21155_b(16, Byte.valueOf(byte1));
            }
        }
    }

    private boolean func_4046_a(double p_4046_1_, double p_4046_3_, double p_4046_5_, double p_4046_7_)
    {
        double d = (field_20902_b - field_322_l) / p_4046_7_;
        double d1 = (field_20904_c - field_321_m) / p_4046_7_;
        double d2 = (field_4102_d - field_320_n) / p_4046_7_;
        AxisAlignedBB axisalignedbb = field_312_v.func_711_b();
        for(int i = 1; (double)i < p_4046_7_; i++)
        {
            axisalignedbb.func_702_d(d, d1, d2);
            if(field_9093_l.func_481_a(this, axisalignedbb).size() > 0)
            {
                return false;
            }
        }

        return true;
    }

    protected String func_6097_d()
    {
        return "mob.ghast.moan";
    }

    protected String func_6100_e()
    {
        return "mob.ghast.scream";
    }

    protected String func_6098_f()
    {
        return "mob.ghast.death";
    }

    protected int func_149_g()
    {
        return Item.field_193_K.field_234_aS;
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = field_9064_W.nextInt(2) + field_9064_W.nextInt(1 + p_21047_2_);
        for(int j = 0; j < i; j++)
        {
            func_128_a(Item.field_40235_bn.field_234_aS, 1);
        }

        i = field_9064_W.nextInt(3) + field_9064_W.nextInt(1 + p_21047_2_);
        for(int k = 0; k < i; k++)
        {
            func_128_a(Item.field_193_K.field_234_aS, 1);
        }

    }

    protected float func_6102_h()
    {
        return 10F;
    }

    public boolean func_155_a()
    {
        return field_9064_W.nextInt(20) == 0 && super.func_155_a() && field_9093_l.field_804_l > 0;
    }

    public int func_4045_i()
    {
        return 1;
    }
}
