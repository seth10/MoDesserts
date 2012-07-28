// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, EntityPlayer, MathHelper, World, 
//            ItemStack, Item, AxisAlignedBB, Vec3D, 
//            MovingObjectPosition, DamageSource, Material, NBTTagCompound, 
//            EntityItem, StatList

public class EntityFishHook extends Entity
{

    private int field_20906_d;
    private int field_20905_e;
    private int field_4126_f;
    private int field_4132_ai;
    private boolean field_4129_aj;
    public int field_4134_a;
    public EntityPlayer field_20909_b;
    private int field_6150_ak;
    private int field_4125_al;
    private int field_4124_am;
    public Entity field_20907_c;
    private int field_6149_an;
    private double field_6148_ao;
    private double field_6147_ap;
    private double field_6146_aq;
    private double field_6145_ar;
    private double field_6144_as;

    public EntityFishHook(World p_i285_1_)
    {
        super(p_i285_1_);
        field_20906_d = -1;
        field_20905_e = -1;
        field_4126_f = -1;
        field_4132_ai = 0;
        field_4129_aj = false;
        field_4134_a = 0;
        field_4125_al = 0;
        field_4124_am = 0;
        field_20907_c = null;
        func_113_a(0.25F, 0.25F);
        field_28008_bI = true;
    }

    public EntityFishHook(World p_i286_1_, EntityPlayer p_i286_2_)
    {
        super(p_i286_1_);
        field_20906_d = -1;
        field_20905_e = -1;
        field_4126_f = -1;
        field_4132_ai = 0;
        field_4129_aj = false;
        field_4134_a = 0;
        field_4125_al = 0;
        field_4124_am = 0;
        field_20907_c = null;
        field_28008_bI = true;
        field_20909_b = p_i286_2_;
        field_20909_b.field_6124_at = this;
        func_113_a(0.25F, 0.25F);
        func_107_c(p_i286_2_.field_322_l, (p_i286_2_.field_321_m + 1.6200000000000001D) - (double)p_i286_2_.field_9076_H, p_i286_2_.field_320_n, p_i286_2_.field_316_r, p_i286_2_.field_315_s);
        field_322_l -= MathHelper.func_582_b((field_316_r / 180F) * 3.141593F) * 0.16F;
        field_321_m -= 0.10000000149011612D;
        field_320_n -= MathHelper.func_585_a((field_316_r / 180F) * 3.141593F) * 0.16F;
        func_86_a(field_322_l, field_321_m, field_320_n);
        field_9076_H = 0.0F;
        float f = 0.4F;
        field_319_o = -MathHelper.func_585_a((field_316_r / 180F) * 3.141593F) * MathHelper.func_582_b((field_315_s / 180F) * 3.141593F) * f;
        field_317_q = MathHelper.func_582_b((field_316_r / 180F) * 3.141593F) * MathHelper.func_582_b((field_315_s / 180F) * 3.141593F) * f;
        field_318_p = -MathHelper.func_585_a((field_315_s / 180F) * 3.141593F) * f;
        func_6142_a(field_319_o, field_318_p, field_317_q, 1.5F, 1.0F);
    }

    protected void func_21044_a()
    {
    }

    public void func_6142_a(double p_6142_1_, double p_6142_3_, double p_6142_5_, float p_6142_7_, 
            float p_6142_8_)
    {
        float f = MathHelper.func_583_a(p_6142_1_ * p_6142_1_ + p_6142_3_ * p_6142_3_ + p_6142_5_ * p_6142_5_);
        p_6142_1_ /= f;
        p_6142_3_ /= f;
        p_6142_5_ /= f;
        p_6142_1_ += field_9064_W.nextGaussian() * 0.0074999998323619366D * (double)p_6142_8_;
        p_6142_3_ += field_9064_W.nextGaussian() * 0.0074999998323619366D * (double)p_6142_8_;
        p_6142_5_ += field_9064_W.nextGaussian() * 0.0074999998323619366D * (double)p_6142_8_;
        p_6142_1_ *= p_6142_7_;
        p_6142_3_ *= p_6142_7_;
        p_6142_5_ *= p_6142_7_;
        field_319_o = p_6142_1_;
        field_318_p = p_6142_3_;
        field_317_q = p_6142_5_;
        float f1 = MathHelper.func_583_a(p_6142_1_ * p_6142_1_ + p_6142_5_ * p_6142_5_);
        field_9089_x = field_316_r = (float)((Math.atan2(p_6142_1_, p_6142_5_) * 180D) / 3.1415927410125732D);
        field_9088_y = field_315_s = (float)((Math.atan2(p_6142_3_, f1) * 180D) / 3.1415927410125732D);
        field_6150_ak = 0;
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        if(field_6149_an > 0)
        {
            double d = field_322_l + (field_6148_ao - field_322_l) / (double)field_6149_an;
            double d1 = field_321_m + (field_6147_ap - field_321_m) / (double)field_6149_an;
            double d2 = field_320_n + (field_6146_aq - field_320_n) / (double)field_6149_an;
            double d4;
            for(d4 = field_6145_ar - (double)field_316_r; d4 < -180D; d4 += 360D) { }
            for(; d4 >= 180D; d4 -= 360D) { }
            field_316_r += d4 / (double)field_6149_an;
            field_315_s += (field_6144_as - (double)field_315_s) / (double)field_6149_an;
            field_6149_an--;
            func_86_a(d, d1, d2);
            func_6096_b(field_316_r, field_315_s);
            return;
        }
        if(!field_9093_l.field_792_x)
        {
            ItemStack itemstack = field_20909_b.func_172_B();
            if(field_20909_b.field_304_B || !field_20909_b.func_120_t() || itemstack == null || itemstack.func_569_a() != Item.field_4196_aP || func_102_b(field_20909_b) > 1024D)
            {
                func_118_j();
                field_20909_b.field_6124_at = null;
                return;
            }
            if(field_20907_c != null)
            {
                if(field_20907_c.field_304_B)
                {
                    field_20907_c = null;
                } else
                {
                    field_322_l = field_20907_c.field_322_l;
                    field_321_m = field_20907_c.field_312_v.field_963_b + (double)field_20907_c.field_298_E * 0.80000000000000004D;
                    field_320_n = field_20907_c.field_320_n;
                    return;
                }
            }
        }
        if(field_4134_a > 0)
        {
            field_4134_a--;
        }
        if(field_4129_aj)
        {
            int i = field_9093_l.func_444_a(field_20906_d, field_20905_e, field_4126_f);
            if(i != field_4132_ai)
            {
                field_4129_aj = false;
                field_319_o *= field_9064_W.nextFloat() * 0.2F;
                field_318_p *= field_9064_W.nextFloat() * 0.2F;
                field_317_q *= field_9064_W.nextFloat() * 0.2F;
                field_6150_ak = 0;
                field_4125_al = 0;
            } else
            {
                field_6150_ak++;
                if(field_6150_ak == 1200)
                {
                    func_118_j();
                }
                return;
            }
        } else
        {
            field_4125_al++;
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
        double d3 = 0.0D;
        for(int j = 0; j < list.size(); j++)
        {
            Entity entity1 = (Entity)list.get(j);
            if(!entity1.func_129_c_() || entity1 == field_20909_b && field_4125_al < 5)
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
            double d6 = vec3d.func_767_a(movingobjectposition1.field_929_f);
            if(d6 < d3 || d3 == 0.0D)
            {
                entity = entity1;
                d3 = d6;
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
                if(movingobjectposition.field_928_g.func_121_a(DamageSource.func_35081_a(this, field_20909_b), 0))
                {
                    field_20907_c = movingobjectposition.field_928_g;
                }
            } else
            {
                field_4129_aj = true;
            }
        }
        if(field_4129_aj)
        {
            return;
        }
        func_88_c(field_319_o, field_318_p, field_317_q);
        float f = MathHelper.func_583_a(field_319_o * field_319_o + field_317_q * field_317_q);
        field_316_r = (float)((Math.atan2(field_319_o, field_317_q) * 180D) / 3.1415927410125732D);
        for(field_315_s = (float)((Math.atan2(field_318_p, f) * 180D) / 3.1415927410125732D); field_315_s - field_9088_y < -180F; field_9088_y -= 360F) { }
        for(; field_315_s - field_9088_y >= 180F; field_9088_y += 360F) { }
        for(; field_316_r - field_9089_x < -180F; field_9089_x -= 360F) { }
        for(; field_316_r - field_9089_x >= 180F; field_9089_x += 360F) { }
        field_315_s = field_9088_y + (field_315_s - field_9088_y) * 0.2F;
        field_316_r = field_9089_x + (field_316_r - field_9089_x) * 0.2F;
        float f1 = 0.92F;
        if(field_9086_A || field_9084_B)
        {
            f1 = 0.5F;
        }
        int k = 5;
        double d5 = 0.0D;
        for(int l = 0; l < k; l++)
        {
            double d8 = ((field_312_v.field_963_b + ((field_312_v.field_968_e - field_312_v.field_963_b) * (double)(l + 0)) / (double)k) - 0.125D) + 0.125D;
            double d9 = ((field_312_v.field_963_b + ((field_312_v.field_968_e - field_312_v.field_963_b) * (double)(l + 1)) / (double)k) - 0.125D) + 0.125D;
            AxisAlignedBB axisalignedbb1 = AxisAlignedBB.func_693_b(field_312_v.field_964_a, d8, field_312_v.field_970_c, field_312_v.field_969_d, d9, field_312_v.field_967_f);
            if(field_9093_l.func_524_b(axisalignedbb1, Material.field_521_f))
            {
                d5 += 1.0D / (double)k;
            }
        }

        if(d5 > 0.0D)
        {
            if(field_4124_am > 0)
            {
                field_4124_am--;
            } else
            {
                char c = '\u01F4';
                if(field_9093_l.func_27072_q(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_321_m) + 1, MathHelper.func_584_b(field_320_n)))
                {
                    c = '\u012C';
                }
                if(field_9064_W.nextInt(c) == 0)
                {
                    field_4124_am = field_9064_W.nextInt(30) + 10;
                    field_318_p -= 0.20000000298023224D;
                    field_9093_l.func_506_a(this, "random.splash", 0.25F, 1.0F + (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.4F);
                    float f3 = MathHelper.func_584_b(field_312_v.field_963_b);
                    for(int i1 = 0; (float)i1 < 1.0F + field_300_D * 20F; i1++)
                    {
                        float f4 = (field_9064_W.nextFloat() * 2.0F - 1.0F) * field_300_D;
                        float f6 = (field_9064_W.nextFloat() * 2.0F - 1.0F) * field_300_D;
                        field_9093_l.func_514_a("bubble", field_322_l + (double)f4, f3 + 1.0F, field_320_n + (double)f6, field_319_o, field_318_p - (double)(field_9064_W.nextFloat() * 0.2F), field_317_q);
                    }

                    for(int j1 = 0; (float)j1 < 1.0F + field_300_D * 20F; j1++)
                    {
                        float f5 = (field_9064_W.nextFloat() * 2.0F - 1.0F) * field_300_D;
                        float f7 = (field_9064_W.nextFloat() * 2.0F - 1.0F) * field_300_D;
                        field_9093_l.func_514_a("splash", field_322_l + (double)f5, f3 + 1.0F, field_320_n + (double)f7, field_319_o, field_318_p, field_317_q);
                    }

                }
            }
        }
        if(field_4124_am > 0)
        {
            field_318_p -= (double)(field_9064_W.nextFloat() * field_9064_W.nextFloat() * field_9064_W.nextFloat()) * 0.20000000000000001D;
        }
        double d7 = d5 * 2D - 1.0D;
        field_318_p += 0.039999999105930328D * d7;
        if(d5 > 0.0D)
        {
            f1 = (float)((double)f1 * 0.90000000000000002D);
            field_318_p *= 0.80000000000000004D;
        }
        field_319_o *= f1;
        field_318_p *= f1;
        field_317_q *= f1;
        func_86_a(field_322_l, field_321_m, field_320_n);
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_394_a("xTile", (short)field_20906_d);
        p_97_1_.func_394_a("yTile", (short)field_20905_e);
        p_97_1_.func_394_a("zTile", (short)field_4126_f);
        p_97_1_.func_409_a("inTile", (byte)field_4132_ai);
        p_97_1_.func_409_a("shake", (byte)field_4134_a);
        p_97_1_.func_409_a("inGround", (byte)(field_4129_aj ? 1 : 0));
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        field_20906_d = p_99_1_.func_406_c("xTile");
        field_20905_e = p_99_1_.func_406_c("yTile");
        field_4126_f = p_99_1_.func_406_c("zTile");
        field_4132_ai = p_99_1_.func_408_b("inTile") & 0xff;
        field_4134_a = p_99_1_.func_408_b("shake") & 0xff;
        field_4129_aj = p_99_1_.func_408_b("inGround") == 1;
    }

    public int func_6143_c()
    {
        byte byte0 = 0;
        if(field_20907_c != null)
        {
            double d = field_20909_b.field_322_l - field_322_l;
            double d2 = field_20909_b.field_321_m - field_321_m;
            double d4 = field_20909_b.field_320_n - field_320_n;
            double d6 = MathHelper.func_583_a(d * d + d2 * d2 + d4 * d4);
            double d8 = 0.10000000000000001D;
            field_20907_c.field_319_o += d * d8;
            field_20907_c.field_318_p += d2 * d8 + (double)MathHelper.func_583_a(d6) * 0.080000000000000002D;
            field_20907_c.field_317_q += d4 * d8;
            byte0 = 3;
        } else
        if(field_4124_am > 0)
        {
            EntityItem entityitem = new EntityItem(field_9093_l, field_322_l, field_321_m, field_320_n, new ItemStack(Item.field_4193_aS));
            double d1 = field_20909_b.field_322_l - field_322_l;
            double d3 = field_20909_b.field_321_m - field_321_m;
            double d5 = field_20909_b.field_320_n - field_320_n;
            double d7 = MathHelper.func_583_a(d1 * d1 + d3 * d3 + d5 * d5);
            double d9 = 0.10000000000000001D;
            entityitem.field_319_o = d1 * d9;
            entityitem.field_318_p = d3 * d9 + (double)MathHelper.func_583_a(d7) * 0.080000000000000002D;
            entityitem.field_317_q = d5 * d9;
            field_9093_l.func_526_a(entityitem);
            field_20909_b.func_25046_a(StatList.field_25095_x, 1);
            byte0 = 1;
        }
        if(field_4129_aj)
        {
            byte0 = 2;
        }
        func_118_j();
        field_20909_b.field_6124_at = null;
        return byte0;
    }
}
