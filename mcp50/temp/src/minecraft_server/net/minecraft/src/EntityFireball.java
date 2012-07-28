// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, EntityLiving, World, 
//            Vec3D, MovingObjectPosition, AxisAlignedBB, DamageSource, 
//            NBTTagCompound

public class EntityFireball extends Entity
{

    private int field_9195_e;
    private int field_9193_f;
    private int field_9197_aj;
    private int field_9194_ak;
    private boolean field_9192_al;
    public EntityLiving field_9191_am;
    private int field_9190_an;
    private int field_9189_ao;
    public double field_9199_b;
    public double field_9198_c;
    public double field_9196_d;

    public EntityFireball(World p_i61_1_)
    {
        super(p_i61_1_);
        field_9195_e = -1;
        field_9193_f = -1;
        field_9197_aj = -1;
        field_9194_ak = 0;
        field_9192_al = false;
        field_9189_ao = 0;
        func_113_a(1.0F, 1.0F);
    }

    protected void func_21044_a()
    {
    }

    public EntityFireball(World p_i1019_1_, double p_i1019_2_, double p_i1019_4_, double p_i1019_6_, 
            double p_i1019_8_, double p_i1019_10_, double p_i1019_12_)
    {
        super(p_i1019_1_);
        field_9195_e = -1;
        field_9193_f = -1;
        field_9197_aj = -1;
        field_9194_ak = 0;
        field_9192_al = false;
        field_9189_ao = 0;
        func_113_a(1.0F, 1.0F);
        func_107_c(p_i1019_2_, p_i1019_4_, p_i1019_6_, field_316_r, field_315_s);
        func_86_a(p_i1019_2_, p_i1019_4_, p_i1019_6_);
        double d = MathHelper.func_583_a(p_i1019_8_ * p_i1019_8_ + p_i1019_10_ * p_i1019_10_ + p_i1019_12_ * p_i1019_12_);
        field_9199_b = (p_i1019_8_ / d) * 0.10000000000000001D;
        field_9198_c = (p_i1019_10_ / d) * 0.10000000000000001D;
        field_9196_d = (p_i1019_12_ / d) * 0.10000000000000001D;
    }

    public EntityFireball(World p_i62_1_, EntityLiving p_i62_2_, double p_i62_3_, double p_i62_5_, double p_i62_7_)
    {
        super(p_i62_1_);
        field_9195_e = -1;
        field_9193_f = -1;
        field_9197_aj = -1;
        field_9194_ak = 0;
        field_9192_al = false;
        field_9189_ao = 0;
        field_9191_am = p_i62_2_;
        func_113_a(1.0F, 1.0F);
        func_107_c(p_i62_2_.field_322_l, p_i62_2_.field_321_m, p_i62_2_.field_320_n, p_i62_2_.field_316_r, p_i62_2_.field_315_s);
        func_86_a(field_322_l, field_321_m, field_320_n);
        field_9076_H = 0.0F;
        field_319_o = field_318_p = field_317_q = 0.0D;
        p_i62_3_ += field_9064_W.nextGaussian() * 0.40000000000000002D;
        p_i62_5_ += field_9064_W.nextGaussian() * 0.40000000000000002D;
        p_i62_7_ += field_9064_W.nextGaussian() * 0.40000000000000002D;
        double d = MathHelper.func_583_a(p_i62_3_ * p_i62_3_ + p_i62_5_ * p_i62_5_ + p_i62_7_ * p_i62_7_);
        field_9199_b = (p_i62_3_ / d) * 0.10000000000000001D;
        field_9198_c = (p_i62_5_ / d) * 0.10000000000000001D;
        field_9196_d = (p_i62_7_ / d) * 0.10000000000000001D;
    }

    public void func_106_b_()
    {
        if(!field_9093_l.field_792_x && (field_9191_am != null && field_9191_am.field_304_B || !field_9093_l.func_530_e((int)field_322_l, (int)field_321_m, (int)field_320_n)))
        {
            func_118_j();
            return;
        }
        super.func_106_b_();
        func_40034_j(1);
        if(field_9192_al)
        {
            int i = field_9093_l.func_444_a(field_9195_e, field_9193_f, field_9197_aj);
            if(i != field_9194_ak)
            {
                field_9192_al = false;
                field_319_o *= field_9064_W.nextFloat() * 0.2F;
                field_318_p *= field_9064_W.nextFloat() * 0.2F;
                field_317_q *= field_9064_W.nextFloat() * 0.2F;
                field_9190_an = 0;
                field_9189_ao = 0;
            } else
            {
                field_9190_an++;
                if(field_9190_an == 600)
                {
                    func_118_j();
                }
                return;
            }
        } else
        {
            field_9189_ao++;
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
        Entity entity = null;
        List list = field_9093_l.func_450_b(this, field_312_v.func_700_a(field_319_o, field_318_p, field_317_q).func_708_b(1.0D, 1.0D, 1.0D));
        double d = 0.0D;
        for(int j = 0; j < list.size(); j++)
        {
            Entity entity1 = (Entity)list.get(j);
            if(!entity1.func_129_c_() || entity1.func_41012_c_(field_9191_am) && field_9189_ao < 25)
            {
                continue;
            }
            float f2 = 0.3F;
            AxisAlignedBB axisalignedbb = entity1.field_312_v.func_708_b(f2, f2, f2);
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
        if(movingobjectposition != null)
        {
            func_40063_a(movingobjectposition);
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
        float f1 = 0.95F;
        if(func_27011_Z())
        {
            for(int k = 0; k < 4; k++)
            {
                float f3 = 0.25F;
                field_9093_l.func_514_a("bubble", field_322_l - field_319_o * (double)f3, field_321_m - field_318_p * (double)f3, field_320_n - field_317_q * (double)f3, field_319_o, field_318_p, field_317_q);
            }

            f1 = 0.8F;
        }
        field_319_o += field_9199_b;
        field_318_p += field_9198_c;
        field_317_q += field_9196_d;
        field_319_o *= f1;
        field_318_p *= f1;
        field_317_q *= f1;
        field_9093_l.func_514_a("smoke", field_322_l, field_321_m + 0.5D, field_320_n, 0.0D, 0.0D, 0.0D);
        func_86_a(field_322_l, field_321_m, field_320_n);
    }

    protected void func_40063_a(MovingObjectPosition p_40063_1_)
    {
        if(!field_9093_l.field_792_x)
        {
            if(p_40063_1_.field_928_g != null)
            {
                if(!p_40063_1_.field_928_g.func_121_a(DamageSource.func_35082_a(this, field_9191_am), 4));
            }
            field_9093_l.func_12015_a(null, field_322_l, field_321_m, field_320_n, 1.0F, true);
            func_118_j();
        }
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_394_a("xTile", (short)field_9195_e);
        p_97_1_.func_394_a("yTile", (short)field_9193_f);
        p_97_1_.func_394_a("zTile", (short)field_9197_aj);
        p_97_1_.func_409_a("inTile", (byte)field_9194_ak);
        p_97_1_.func_409_a("inGround", (byte)(field_9192_al ? 1 : 0));
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        field_9195_e = p_99_1_.func_406_c("xTile");
        field_9193_f = p_99_1_.func_406_c("yTile");
        field_9197_aj = p_99_1_.func_406_c("zTile");
        field_9194_ak = p_99_1_.func_408_b("inTile") & 0xff;
        field_9192_al = p_99_1_.func_408_b("inGround") == 1;
    }

    public boolean func_129_c_()
    {
        return true;
    }

    public float func_41010_j_()
    {
        return 1.0F;
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        func_9060_u();
        if(p_121_1_.func_35080_a() != null)
        {
            Vec3D vec3d = p_121_1_.func_35080_a().func_4039_B();
            if(vec3d != null)
            {
                field_319_o = vec3d.field_1055_a;
                field_318_p = vec3d.field_1054_b;
                field_317_q = vec3d.field_1058_c;
                field_9199_b = field_319_o * 0.10000000000000001D;
                field_9198_c = field_318_p * 0.10000000000000001D;
                field_9196_d = field_317_q * 0.10000000000000001D;
            }
            if(p_121_1_.func_35080_a() instanceof EntityLiving)
            {
                field_9191_am = (EntityLiving)p_121_1_.func_35080_a();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public float func_108_b(float p_108_1_)
    {
        return 1.0F;
    }
}
