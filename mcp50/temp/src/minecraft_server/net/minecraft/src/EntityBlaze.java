// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, DataWatcher, World, DamageSource, 
//            Entity, AxisAlignedBB, MathHelper, EntitySmallFireball, 
//            Item, NBTTagCompound

public class EntityBlaze extends EntityMob
{

    private float field_40130_a;
    private int field_40129_b;
    private int field_40128_g;

    public EntityBlaze(World p_i305_1_)
    {
        super(p_i305_1_);
        field_40130_a = 0.5F;
        field_9119_aG = "/mob/fire.png";
        field_9079_ae = true;
        field_404_af = 6;
        field_35192_ax = 10;
    }

    public int func_40095_c()
    {
        return 20;
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, new Byte((byte)0));
    }

    protected String func_6097_d()
    {
        return "mob.blaze.breathe";
    }

    protected String func_6100_e()
    {
        return "mob.blaze.hit";
    }

    protected String func_6098_f()
    {
        return "mob.blaze.death";
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        return super.func_121_a(p_121_1_, p_121_2_);
    }

    public void func_142_f(DamageSource p_142_1_)
    {
        super.func_142_f(p_142_1_);
    }

    public float func_108_b(float p_108_1_)
    {
        return 1.0F;
    }

    public void func_153_y()
    {
        if(!field_9093_l.field_792_x)
        {
            if(func_27008_Y())
            {
                func_121_a(DamageSource.field_35088_e, 1);
            }
            field_40129_b--;
            if(field_40129_b <= 0)
            {
                field_40129_b = 100;
                field_40130_a = 0.5F + (float)field_9064_W.nextGaussian() * 3F;
            }
            if(func_25024_A() != null && func_25024_A().field_321_m + (double)func_25024_A().func_104_p() > field_321_m + (double)func_104_p() + (double)field_40130_a)
            {
                field_318_p = field_318_p + (0.30000001192092896D - field_318_p) * 0.30000001192092896D;
            }
        }
        if(field_9064_W.nextInt(24) == 0)
        {
            field_9093_l.func_502_a(field_322_l + 0.5D, field_321_m + 0.5D, field_320_n + 0.5D, "fire.fire", 1.0F + field_9064_W.nextFloat(), field_9064_W.nextFloat() * 0.7F + 0.3F);
        }
        if(!field_9086_A && field_318_p < 0.0D)
        {
            field_318_p *= 0.59999999999999998D;
        }
        for(int i = 0; i < 2; i++)
        {
            field_9093_l.func_514_a("largesmoke", field_322_l + (field_9064_W.nextDouble() - 0.5D) * (double)field_300_D, field_321_m + field_9064_W.nextDouble() * (double)field_298_E, field_320_n + (field_9064_W.nextDouble() - 0.5D) * (double)field_300_D, 0.0D, 0.0D, 0.0D);
        }

        super.func_153_y();
    }

    protected void func_157_a(Entity p_157_1_, float p_157_2_)
    {
        if(field_9103_aW <= 0 && p_157_2_ < 2.0F && p_157_1_.field_312_v.field_968_e > field_312_v.field_963_b && p_157_1_.field_312_v.field_963_b < field_312_v.field_968_e)
        {
            field_9103_aW = 20;
            func_35224_c(p_157_1_);
        } else
        if(p_157_2_ < 30F)
        {
            double d = p_157_1_.field_322_l - field_322_l;
            double d1 = (p_157_1_.field_312_v.field_963_b + (double)(p_157_1_.field_298_E / 2.0F)) - (field_321_m + (double)(field_298_E / 2.0F));
            double d2 = p_157_1_.field_320_n - field_320_n;
            if(field_9103_aW == 0)
            {
                field_40128_g++;
                if(field_40128_g == 1)
                {
                    field_9103_aW = 60;
                    func_40127_a(true);
                } else
                if(field_40128_g <= 4)
                {
                    field_9103_aW = 6;
                } else
                {
                    field_9103_aW = 100;
                    field_40128_g = 0;
                    func_40127_a(false);
                }
                if(field_40128_g > 1)
                {
                    float f = MathHelper.func_586_c(p_157_2_) * 0.5F;
                    field_9093_l.func_28101_a(null, 1009, (int)field_322_l, (int)field_321_m, (int)field_320_n, 0);
                    for(int i = 0; i < 1; i++)
                    {
                        EntitySmallFireball entitysmallfireball = new EntitySmallFireball(field_9093_l, this, d + field_9064_W.nextGaussian() * (double)f, d1, d2 + field_9064_W.nextGaussian() * (double)f);
                        entitysmallfireball.field_321_m = field_321_m + (double)(field_298_E / 2.0F) + 0.5D;
                        field_9093_l.func_526_a(entitysmallfireball);
                    }

                }
            }
            field_316_r = (float)((Math.atan2(d2, d) * 180D) / 3.1415927410125732D) - 90F;
            field_387_ah = true;
        }
    }

    protected void func_114_a(float f)
    {
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
        return Item.field_40239_bm.field_234_aS;
    }

    public boolean func_40035_z()
    {
        return func_40126_A();
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        if(p_21047_1_)
        {
            int i = field_9064_W.nextInt(2 + p_21047_2_);
            for(int j = 0; j < i; j++)
            {
                func_128_a(Item.field_40239_bm.field_234_aS, 1);
            }

        }
    }

    public boolean func_40126_A()
    {
        return (field_21045_af.func_21156_a(16) & 1) != 0;
    }

    public void func_40127_a(boolean p_40127_1_)
    {
        byte byte0 = field_21045_af.func_21156_a(16);
        if(p_40127_1_)
        {
            byte0 |= 1;
        } else
        {
            byte0 &= 0xfe;
        }
        field_21045_af.func_21155_b(16, Byte.valueOf(byte0));
    }

    protected boolean func_40123_y()
    {
        return true;
    }
}
