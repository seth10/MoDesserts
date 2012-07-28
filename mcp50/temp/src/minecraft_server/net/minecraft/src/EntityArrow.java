// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, EntityPlayer, EntityLiving, MathHelper, 
//            World, Block, Vec3D, AxisAlignedBB, 
//            MovingObjectPosition, DamageSource, NBTTagCompound, ItemStack, 
//            Item, InventoryPlayer

public class EntityArrow extends Entity
{

    private int field_9183_c;
    private int field_9182_d;
    private int field_9180_e;
    private int field_9179_f;
    private int field_28011_h;
    private boolean field_9181_aj;
    public boolean field_28012_a;
    public int field_9184_a;
    public Entity field_439_ah;
    private int field_438_ai;
    private int field_437_aj;
    private double field_46011_m;
    private int field_46010_n;
    public boolean field_35160_d;

    public EntityArrow(World p_i439_1_)
    {
        super(p_i439_1_);
        field_9183_c = -1;
        field_9182_d = -1;
        field_9180_e = -1;
        field_9179_f = 0;
        field_28011_h = 0;
        field_9181_aj = false;
        field_28012_a = false;
        field_9184_a = 0;
        field_437_aj = 0;
        field_46011_m = 2D;
        field_35160_d = false;
        func_113_a(0.5F, 0.5F);
    }

    public EntityArrow(World p_i440_1_, double p_i440_2_, double p_i440_4_, double p_i440_6_)
    {
        super(p_i440_1_);
        field_9183_c = -1;
        field_9182_d = -1;
        field_9180_e = -1;
        field_9179_f = 0;
        field_28011_h = 0;
        field_9181_aj = false;
        field_28012_a = false;
        field_9184_a = 0;
        field_437_aj = 0;
        field_46011_m = 2D;
        field_35160_d = false;
        func_113_a(0.5F, 0.5F);
        func_86_a(p_i440_2_, p_i440_4_, p_i440_6_);
        field_9076_H = 0.0F;
    }

    public EntityArrow(World p_i1074_1_, EntityLiving p_i1074_2_, EntityLiving p_i1074_3_, float p_i1074_4_, float p_i1074_5_)
    {
        super(p_i1074_1_);
        field_9183_c = -1;
        field_9182_d = -1;
        field_9180_e = -1;
        field_9179_f = 0;
        field_28011_h = 0;
        field_9181_aj = false;
        field_28012_a = false;
        field_9184_a = 0;
        field_437_aj = 0;
        field_46011_m = 2D;
        field_35160_d = false;
        field_439_ah = p_i1074_2_;
        field_28012_a = p_i1074_2_ instanceof EntityPlayer;
        field_321_m = (p_i1074_2_.field_321_m + (double)p_i1074_2_.func_104_p()) - 0.10000000149011612D;
        double d = p_i1074_3_.field_322_l - p_i1074_2_.field_322_l;
        double d1 = (p_i1074_3_.field_321_m + (double)p_i1074_3_.func_104_p()) - 0.69999998807907104D - field_321_m;
        double d2 = p_i1074_3_.field_320_n - p_i1074_2_.field_320_n;
        double d3 = MathHelper.func_583_a(d * d + d2 * d2);
        if(d3 < 9.9999999999999995E-08D)
        {
            return;
        } else
        {
            float f = (float)((Math.atan2(d2, d) * 180D) / 3.1415927410125732D) - 90F;
            float f1 = (float)(-((Math.atan2(d1, d3) * 180D) / 3.1415927410125732D));
            double d4 = d / d3;
            double d5 = d2 / d3;
            func_107_c(p_i1074_2_.field_322_l + d4, field_321_m, p_i1074_2_.field_320_n + d5, f, f1);
            field_9076_H = 0.0F;
            float f2 = (float)d3 * 0.2F;
            func_177_a(d, d1 + (double)f2, d2, p_i1074_4_, p_i1074_5_);
            return;
        }
    }

    public EntityArrow(World p_i441_1_, EntityLiving p_i441_2_, float p_i441_3_)
    {
        super(p_i441_1_);
        field_9183_c = -1;
        field_9182_d = -1;
        field_9180_e = -1;
        field_9179_f = 0;
        field_28011_h = 0;
        field_9181_aj = false;
        field_28012_a = false;
        field_9184_a = 0;
        field_437_aj = 0;
        field_46011_m = 2D;
        field_35160_d = false;
        field_439_ah = p_i441_2_;
        field_28012_a = p_i441_2_ instanceof EntityPlayer;
        func_113_a(0.5F, 0.5F);
        func_107_c(p_i441_2_.field_322_l, p_i441_2_.field_321_m + (double)p_i441_2_.func_104_p(), p_i441_2_.field_320_n, p_i441_2_.field_316_r, p_i441_2_.field_315_s);
        field_322_l -= MathHelper.func_582_b((field_316_r / 180F) * 3.141593F) * 0.16F;
        field_321_m -= 0.10000000149011612D;
        field_320_n -= MathHelper.func_585_a((field_316_r / 180F) * 3.141593F) * 0.16F;
        func_86_a(field_322_l, field_321_m, field_320_n);
        field_9076_H = 0.0F;
        field_319_o = -MathHelper.func_585_a((field_316_r / 180F) * 3.141593F) * MathHelper.func_582_b((field_315_s / 180F) * 3.141593F);
        field_317_q = MathHelper.func_582_b((field_316_r / 180F) * 3.141593F) * MathHelper.func_582_b((field_315_s / 180F) * 3.141593F);
        field_318_p = -MathHelper.func_585_a((field_315_s / 180F) * 3.141593F);
        func_177_a(field_319_o, field_318_p, field_317_q, p_i441_3_ * 1.5F, 1.0F);
    }

    protected void func_21044_a()
    {
    }

    public void func_177_a(double p_177_1_, double p_177_3_, double p_177_5_, float p_177_7_, 
            float p_177_8_)
    {
        float f = MathHelper.func_583_a(p_177_1_ * p_177_1_ + p_177_3_ * p_177_3_ + p_177_5_ * p_177_5_);
        p_177_1_ /= f;
        p_177_3_ /= f;
        p_177_5_ /= f;
        p_177_1_ += field_9064_W.nextGaussian() * 0.0074999998323619366D * (double)p_177_8_;
        p_177_3_ += field_9064_W.nextGaussian() * 0.0074999998323619366D * (double)p_177_8_;
        p_177_5_ += field_9064_W.nextGaussian() * 0.0074999998323619366D * (double)p_177_8_;
        p_177_1_ *= p_177_7_;
        p_177_3_ *= p_177_7_;
        p_177_5_ *= p_177_7_;
        field_319_o = p_177_1_;
        field_318_p = p_177_3_;
        field_317_q = p_177_5_;
        float f1 = MathHelper.func_583_a(p_177_1_ * p_177_1_ + p_177_5_ * p_177_5_);
        field_9089_x = field_316_r = (float)((Math.atan2(p_177_1_, p_177_5_) * 180D) / 3.1415927410125732D);
        field_9088_y = field_315_s = (float)((Math.atan2(p_177_3_, f1) * 180D) / 3.1415927410125732D);
        field_438_ai = 0;
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        if(field_9088_y == 0.0F && field_9089_x == 0.0F)
        {
            float f = MathHelper.func_583_a(field_319_o * field_319_o + field_317_q * field_317_q);
            field_9089_x = field_316_r = (float)((Math.atan2(field_319_o, field_317_q) * 180D) / 3.1415927410125732D);
            field_9088_y = field_315_s = (float)((Math.atan2(field_318_p, f) * 180D) / 3.1415927410125732D);
        }
        int i = field_9093_l.func_444_a(field_9183_c, field_9182_d, field_9180_e);
        if(i > 0)
        {
            Block.field_542_n[i].func_233_a(field_9093_l, field_9183_c, field_9182_d, field_9180_e);
            AxisAlignedBB axisalignedbb = Block.field_542_n[i].func_248_d(field_9093_l, field_9183_c, field_9182_d, field_9180_e);
            if(axisalignedbb != null && axisalignedbb.func_28183_a(Vec3D.func_768_b(field_322_l, field_321_m, field_320_n)))
            {
                field_9181_aj = true;
            }
        }
        if(field_9184_a > 0)
        {
            field_9184_a--;
        }
        if(field_9181_aj)
        {
            int j = field_9093_l.func_444_a(field_9183_c, field_9182_d, field_9180_e);
            int k = field_9093_l.func_446_b(field_9183_c, field_9182_d, field_9180_e);
            if(j != field_9179_f || k != field_28011_h)
            {
                field_9181_aj = false;
                field_319_o *= field_9064_W.nextFloat() * 0.2F;
                field_318_p *= field_9064_W.nextFloat() * 0.2F;
                field_317_q *= field_9064_W.nextFloat() * 0.2F;
                field_438_ai = 0;
                field_437_aj = 0;
                return;
            }
            field_438_ai++;
            if(field_438_ai == 1200)
            {
                func_118_j();
            }
            return;
        }
        field_437_aj++;
        Vec3D vec3d = Vec3D.func_768_b(field_322_l, field_321_m, field_320_n);
        Vec3D vec3d1 = Vec3D.func_768_b(field_322_l + field_319_o, field_321_m + field_318_p, field_320_n + field_317_q);
        MovingObjectPosition movingobjectposition = field_9093_l.func_28099_a(vec3d, vec3d1, false, true);
        vec3d = Vec3D.func_768_b(field_322_l, field_321_m, field_320_n);
        vec3d1 = Vec3D.func_768_b(field_322_l + field_319_o, field_321_m + field_318_p, field_320_n + field_317_q);
        if(movingobjectposition != null)
        {
            vec3d1 = Vec3D.func_768_b(movingobjectposition.field_929_f.field_1055_a, movingobjectposition.field_929_f.field_1054_b, movingobjectposition.field_929_f.field_1058_c);
        }
        Entity entity = null;
        List list = field_9093_l.func_450_b(this, field_312_v.func_700_a(field_319_o, field_318_p, field_317_q).func_708_b(1.0D, 1.0D, 1.0D));
        double d = 0.0D;
        for(int l = 0; l < list.size(); l++)
        {
            Entity entity1 = (Entity)list.get(l);
            if(!entity1.func_129_c_() || entity1 == field_439_ah && field_437_aj < 5)
            {
                continue;
            }
            float f5 = 0.3F;
            AxisAlignedBB axisalignedbb1 = entity1.field_312_v.func_708_b(f5, f5, f5);
            MovingObjectPosition movingobjectposition1 = axisalignedbb1.func_706_a(vec3d, vec3d1);
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
            if(movingobjectposition.field_928_g != null)
            {
                float f1 = MathHelper.func_583_a(field_319_o * field_319_o + field_318_p * field_318_p + field_317_q * field_317_q);
                int j1 = (int)Math.ceil((double)f1 * field_46011_m);
                if(field_35160_d)
                {
                    j1 += field_9064_W.nextInt(j1 / 2 + 2);
                }
                DamageSource damagesource = null;
                if(field_439_ah == null)
                {
                    damagesource = DamageSource.func_35073_a(this, this);
                } else
                {
                    damagesource = DamageSource.func_35073_a(this, field_439_ah);
                }
                if(func_40035_z())
                {
                    movingobjectposition.field_928_g.func_40034_j(5);
                }
                if(movingobjectposition.field_928_g.func_121_a(damagesource, j1))
                {
                    if(movingobjectposition.field_928_g instanceof EntityLiving)
                    {
                        ((EntityLiving)movingobjectposition.field_928_g).field_35189_aD++;
                        if(field_46010_n > 0)
                        {
                            float f7 = MathHelper.func_583_a(field_319_o * field_319_o + field_317_q * field_317_q);
                            if(f7 > 0.0F)
                            {
                                movingobjectposition.field_928_g.func_87_f((field_319_o * (double)field_46010_n * 0.60000002384185791D) / (double)f7, 0.10000000000000001D, (field_317_q * (double)field_46010_n * 0.60000002384185791D) / (double)f7);
                            }
                        }
                    }
                    field_9093_l.func_506_a(this, "random.bowhit", 1.0F, 1.2F / (field_9064_W.nextFloat() * 0.2F + 0.9F));
                    func_118_j();
                } else
                {
                    field_319_o *= -0.10000000149011612D;
                    field_318_p *= -0.10000000149011612D;
                    field_317_q *= -0.10000000149011612D;
                    field_316_r += 180F;
                    field_9089_x += 180F;
                    field_437_aj = 0;
                }
            } else
            {
                field_9183_c = movingobjectposition.field_926_b;
                field_9182_d = movingobjectposition.field_932_c;
                field_9180_e = movingobjectposition.field_931_d;
                field_9179_f = field_9093_l.func_444_a(field_9183_c, field_9182_d, field_9180_e);
                field_28011_h = field_9093_l.func_446_b(field_9183_c, field_9182_d, field_9180_e);
                field_319_o = (float)(movingobjectposition.field_929_f.field_1055_a - field_322_l);
                field_318_p = (float)(movingobjectposition.field_929_f.field_1054_b - field_321_m);
                field_317_q = (float)(movingobjectposition.field_929_f.field_1058_c - field_320_n);
                float f2 = MathHelper.func_583_a(field_319_o * field_319_o + field_318_p * field_318_p + field_317_q * field_317_q);
                field_322_l -= (field_319_o / (double)f2) * 0.05000000074505806D;
                field_321_m -= (field_318_p / (double)f2) * 0.05000000074505806D;
                field_320_n -= (field_317_q / (double)f2) * 0.05000000074505806D;
                field_9093_l.func_506_a(this, "random.bowhit", 1.0F, 1.2F / (field_9064_W.nextFloat() * 0.2F + 0.9F));
                field_9181_aj = true;
                field_9184_a = 7;
                field_35160_d = false;
            }
        }
        if(field_35160_d)
        {
            for(int i1 = 0; i1 < 4; i1++)
            {
                field_9093_l.func_514_a("crit", field_322_l + (field_319_o * (double)i1) / 4D, field_321_m + (field_318_p * (double)i1) / 4D, field_320_n + (field_317_q * (double)i1) / 4D, -field_319_o, -field_318_p + 0.20000000000000001D, -field_317_q);
            }

        }
        field_322_l += field_319_o;
        field_321_m += field_318_p;
        field_320_n += field_317_q;
        float f3 = MathHelper.func_583_a(field_319_o * field_319_o + field_317_q * field_317_q);
        field_316_r = (float)((Math.atan2(field_319_o, field_317_q) * 180D) / 3.1415927410125732D);
        for(field_315_s = (float)((Math.atan2(field_318_p, f3) * 180D) / 3.1415927410125732D); field_315_s - field_9088_y < -180F; field_9088_y -= 360F) { }
        for(; field_315_s - field_9088_y >= 180F; field_9088_y += 360F) { }
        for(; field_316_r - field_9089_x < -180F; field_9089_x -= 360F) { }
        for(; field_316_r - field_9089_x >= 180F; field_9089_x += 360F) { }
        field_315_s = field_9088_y + (field_315_s - field_9088_y) * 0.2F;
        field_316_r = field_9089_x + (field_316_r - field_9089_x) * 0.2F;
        float f4 = 0.99F;
        float f6 = 0.05F;
        if(func_27011_Z())
        {
            for(int k1 = 0; k1 < 4; k1++)
            {
                float f8 = 0.25F;
                field_9093_l.func_514_a("bubble", field_322_l - field_319_o * (double)f8, field_321_m - field_318_p * (double)f8, field_320_n - field_317_q * (double)f8, field_319_o, field_318_p, field_317_q);
            }

            f4 = 0.8F;
        }
        field_319_o *= f4;
        field_318_p *= f4;
        field_317_q *= f4;
        field_318_p -= f6;
        func_86_a(field_322_l, field_321_m, field_320_n);
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_394_a("xTile", (short)field_9183_c);
        p_97_1_.func_394_a("yTile", (short)field_9182_d);
        p_97_1_.func_394_a("zTile", (short)field_9180_e);
        p_97_1_.func_409_a("inTile", (byte)field_9179_f);
        p_97_1_.func_409_a("inData", (byte)field_28011_h);
        p_97_1_.func_409_a("shake", (byte)field_9184_a);
        p_97_1_.func_409_a("inGround", (byte)(field_9181_aj ? 1 : 0));
        p_97_1_.func_393_a("player", field_28012_a);
        p_97_1_.func_411_a("damage", field_46011_m);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        field_9183_c = p_99_1_.func_406_c("xTile");
        field_9182_d = p_99_1_.func_406_c("yTile");
        field_9180_e = p_99_1_.func_406_c("zTile");
        field_9179_f = p_99_1_.func_408_b("inTile") & 0xff;
        field_28011_h = p_99_1_.func_408_b("inData") & 0xff;
        field_9184_a = p_99_1_.func_408_b("shake") & 0xff;
        field_9181_aj = p_99_1_.func_408_b("inGround") == 1;
        field_28012_a = p_99_1_.func_402_l("player");
        if(p_99_1_.func_410_a("damage"))
        {
            field_46011_m = p_99_1_.func_398_g("damage");
        }
    }

    public void func_6093_b(EntityPlayer p_6093_1_)
    {
        if(field_9093_l.field_792_x)
        {
            return;
        }
        if(field_9181_aj && field_28012_a && field_9184_a <= 0 && p_6093_1_.field_416_aj.func_201_a(new ItemStack(Item.field_4148_j, 1)))
        {
            field_9093_l.func_506_a(this, "random.pop", 0.2F, ((field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            p_6093_1_.func_163_c(this, 1);
            func_118_j();
        }
    }

    public void func_46008_a(double p_46008_1_)
    {
        field_46011_m = p_46008_1_;
    }

    public double func_46009_j()
    {
        return field_46011_m;
    }

    public void func_46007_b(int p_46007_1_)
    {
        field_46010_n = p_46007_1_;
    }

    public boolean func_48313_k_()
    {
        return false;
    }
}
