// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, EntityLiving, MathHelper, World, 
//            Vec3D, MovingObjectPosition, AxisAlignedBB, NBTTagCompound, 
//            EntityPlayer

public abstract class EntityThrowable extends Entity
{

    private int field_40047_d;
    private int field_40048_e;
    private int field_40045_f;
    private int field_40046_g;
    protected boolean field_40051_a;
    public int field_40049_b;
    protected EntityLiving field_40050_c;
    private int field_40052_h;
    private int field_40053_i;

    public EntityThrowable(World p_i27_1_)
    {
        super(p_i27_1_);
        field_40047_d = -1;
        field_40048_e = -1;
        field_40045_f = -1;
        field_40046_g = 0;
        field_40051_a = false;
        field_40049_b = 0;
        field_40053_i = 0;
        func_113_a(0.25F, 0.25F);
    }

    protected void func_21044_a()
    {
    }

    public EntityThrowable(World p_i28_1_, EntityLiving p_i28_2_)
    {
        super(p_i28_1_);
        field_40047_d = -1;
        field_40048_e = -1;
        field_40045_f = -1;
        field_40046_g = 0;
        field_40051_a = false;
        field_40049_b = 0;
        field_40053_i = 0;
        field_40050_c = p_i28_2_;
        func_113_a(0.25F, 0.25F);
        func_107_c(p_i28_2_.field_322_l, p_i28_2_.field_321_m + (double)p_i28_2_.func_104_p(), p_i28_2_.field_320_n, p_i28_2_.field_316_r, p_i28_2_.field_315_s);
        field_322_l -= MathHelper.func_582_b((field_316_r / 180F) * 3.141593F) * 0.16F;
        field_321_m -= 0.10000000149011612D;
        field_320_n -= MathHelper.func_585_a((field_316_r / 180F) * 3.141593F) * 0.16F;
        func_86_a(field_322_l, field_321_m, field_320_n);
        field_9076_H = 0.0F;
        float f = 0.4F;
        field_319_o = -MathHelper.func_585_a((field_316_r / 180F) * 3.141593F) * MathHelper.func_582_b((field_315_s / 180F) * 3.141593F) * f;
        field_317_q = MathHelper.func_582_b((field_316_r / 180F) * 3.141593F) * MathHelper.func_582_b((field_315_s / 180F) * 3.141593F) * f;
        field_318_p = -MathHelper.func_585_a(((field_315_s + func_40040_d()) / 180F) * 3.141593F) * f;
        func_40043_a(field_319_o, field_318_p, field_317_q, func_40044_c(), 1.0F);
    }

    public EntityThrowable(World p_i29_1_, double p_i29_2_, double p_i29_4_, double p_i29_6_)
    {
        super(p_i29_1_);
        field_40047_d = -1;
        field_40048_e = -1;
        field_40045_f = -1;
        field_40046_g = 0;
        field_40051_a = false;
        field_40049_b = 0;
        field_40053_i = 0;
        field_40052_h = 0;
        func_113_a(0.25F, 0.25F);
        func_86_a(p_i29_2_, p_i29_4_, p_i29_6_);
        field_9076_H = 0.0F;
    }

    protected float func_40044_c()
    {
        return 1.5F;
    }

    protected float func_40040_d()
    {
        return 0.0F;
    }

    public void func_40043_a(double p_40043_1_, double p_40043_3_, double p_40043_5_, float p_40043_7_, 
            float p_40043_8_)
    {
        float f = MathHelper.func_583_a(p_40043_1_ * p_40043_1_ + p_40043_3_ * p_40043_3_ + p_40043_5_ * p_40043_5_);
        p_40043_1_ /= f;
        p_40043_3_ /= f;
        p_40043_5_ /= f;
        p_40043_1_ += field_9064_W.nextGaussian() * 0.0074999998323619366D * (double)p_40043_8_;
        p_40043_3_ += field_9064_W.nextGaussian() * 0.0074999998323619366D * (double)p_40043_8_;
        p_40043_5_ += field_9064_W.nextGaussian() * 0.0074999998323619366D * (double)p_40043_8_;
        p_40043_1_ *= p_40043_7_;
        p_40043_3_ *= p_40043_7_;
        p_40043_5_ *= p_40043_7_;
        field_319_o = p_40043_1_;
        field_318_p = p_40043_3_;
        field_317_q = p_40043_5_;
        float f1 = MathHelper.func_583_a(p_40043_1_ * p_40043_1_ + p_40043_5_ * p_40043_5_);
        field_9089_x = field_316_r = (float)((Math.atan2(p_40043_1_, p_40043_5_) * 180D) / 3.1415927410125732D);
        field_9088_y = field_315_s = (float)((Math.atan2(p_40043_3_, f1) * 180D) / 3.1415927410125732D);
        field_40052_h = 0;
    }

    public void func_106_b_()
    {
        field_9071_O = field_322_l;
        field_9070_P = field_321_m;
        field_9069_Q = field_320_n;
        super.func_106_b_();
        if(field_40049_b > 0)
        {
            field_40049_b--;
        }
        if(field_40051_a)
        {
            int i = field_9093_l.func_444_a(field_40047_d, field_40048_e, field_40045_f);
            if(i != field_40046_g)
            {
                field_40051_a = false;
                field_319_o *= field_9064_W.nextFloat() * 0.2F;
                field_318_p *= field_9064_W.nextFloat() * 0.2F;
                field_317_q *= field_9064_W.nextFloat() * 0.2F;
                field_40052_h = 0;
                field_40053_i = 0;
            } else
            {
                field_40052_h++;
                if(field_40052_h == 1200)
                {
                    func_118_j();
                }
                return;
            }
        } else
        {
            field_40053_i++;
        }
        Vec3D vec3d = Vec3D.func_768_b(field_322_l, field_321_m, field_320_n);
        Vec3D vec3d1 = Vec3D.func_768_b(field_322_l + field_319_o, field_321_m + field_318_p, field_320_n + field_317_q);
        MovingObjectPosition movingobjectposition = field_9093_l.func_486_a(vec3d, vec3d1);
        vec3d = Vec3D.func_768_b(field_322_l, field_321_m, field_320_n);
        vec3d1 = Vec3D.func_768_b(field_322_l + field_319_o, field_321_m + field_318_p, field_320_n + field_317_q);
        if(movingobjectposition != null)
        {
            vec3d1 = Vec3D.func_768_b(movingobjectposition.field_929_f.field_1055_a, movingobjectposition.field_929_f.field_1054_b, movingobjectposition.field_929_f.field_1058_c);
        }
        if(!field_9093_l.field_792_x)
        {
            Entity entity = null;
            List list = field_9093_l.func_450_b(this, field_312_v.func_700_a(field_319_o, field_318_p, field_317_q).func_708_b(1.0D, 1.0D, 1.0D));
            double d = 0.0D;
            for(int k = 0; k < list.size(); k++)
            {
                Entity entity1 = (Entity)list.get(k);
                if(!entity1.func_129_c_() || entity1 == field_40050_c && field_40053_i < 5)
                {
                    continue;
                }
                float f4 = 0.3F;
                AxisAlignedBB axisalignedbb = entity1.field_312_v.func_708_b(f4, f4, f4);
                MovingObjectPosition movingobjectposition1 = axisalignedbb.func_706_a(vec3d, vec3d1);
                if(movingobjectposition1 == null)
                {
                    continue;
                }
                double d1 = vec3d.func_767_a(movingobjectposition1.field_929_f);
                if(d1 < d || d == 0.0D)
                {
                    entity = entity1;
                    d = d1;
                }
            }

            if(entity != null)
            {
                movingobjectposition = new MovingObjectPosition(entity);
            }
        }
        if(movingobjectposition != null)
        {
            func_40041_a(movingobjectposition);
        }
        field_322_l += field_319_o;
        field_321_m += field_318_p;
        field_320_n += field_317_q;
        float f = MathHelper.func_583_a(field_319_o * field_319_o + field_317_q * field_317_q);
        field_316_r = (float)((Math.atan2(field_319_o, field_317_q) * 180D) / 3.1415927410125732D);
        for(field_315_s = (float)((Math.atan2(field_318_p, f) * 180D) / 3.1415927410125732D); field_315_s - field_9088_y < -180F; field_9088_y -= 360F) { }
        for(; field_315_s - field_9088_y >= 180F; field_9088_y += 360F) { }
        for(; field_316_r - field_9089_x < -180F; field_9089_x -= 360F) { }
        for(; field_316_r - field_9089_x >= 180F; field_9089_x += 360F) { }
        field_315_s = field_9088_y + (field_315_s - field_9088_y) * 0.2F;
        field_316_r = field_9089_x + (field_316_r - field_9089_x) * 0.2F;
        float f1 = 0.99F;
        float f2 = func_40042_e();
        if(func_27011_Z())
        {
            for(int j = 0; j < 4; j++)
            {
                float f3 = 0.25F;
                field_9093_l.func_514_a("bubble", field_322_l - field_319_o * (double)f3, field_321_m - field_318_p * (double)f3, field_320_n - field_317_q * (double)f3, field_319_o, field_318_p, field_317_q);
            }

            f1 = 0.8F;
        }
        field_319_o *= f1;
        field_318_p *= f1;
        field_317_q *= f1;
        field_318_p -= f2;
        func_86_a(field_322_l, field_321_m, field_320_n);
    }

    protected float func_40042_e()
    {
        return 0.03F;
    }

    protected abstract void func_40041_a(MovingObjectPosition movingobjectposition);

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_394_a("xTile", (short)field_40047_d);
        p_97_1_.func_394_a("yTile", (short)field_40048_e);
        p_97_1_.func_394_a("zTile", (short)field_40045_f);
        p_97_1_.func_409_a("inTile", (byte)field_40046_g);
        p_97_1_.func_409_a("shake", (byte)field_40049_b);
        p_97_1_.func_409_a("inGround", (byte)(field_40051_a ? 1 : 0));
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        field_40047_d = p_99_1_.func_406_c("xTile");
        field_40048_e = p_99_1_.func_406_c("yTile");
        field_40045_f = p_99_1_.func_406_c("zTile");
        field_40046_g = p_99_1_.func_408_b("inTile") & 0xff;
        field_40049_b = p_99_1_.func_408_b("shake") & 0xff;
        field_40051_a = p_99_1_.func_408_b("inGround") == 1;
    }

    public void func_6093_b(EntityPlayer entityplayer)
    {
    }
}
