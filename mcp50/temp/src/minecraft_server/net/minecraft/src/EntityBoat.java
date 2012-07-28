// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, DataWatcher, World, Block, 
//            Item, AxisAlignedBB, Material, MathHelper, 
//            EntityPlayer, DamageSource, NBTTagCompound

public class EntityBoat extends Entity
{

    private int field_9176_d;
    private double field_9174_e;
    private double field_9172_f;
    private double field_9175_aj;
    private double field_9173_ak;
    private double field_9171_al;

    public EntityBoat(World p_i152_1_)
    {
        super(p_i152_1_);
        field_329_e = true;
        func_113_a(1.5F, 0.6F);
        field_9076_H = field_298_E / 2.0F;
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    protected void func_21044_a()
    {
        field_21045_af.func_21153_a(17, new Integer(0));
        field_21045_af.func_21153_a(18, new Integer(1));
        field_21045_af.func_21153_a(19, new Integer(0));
    }

    public AxisAlignedBB func_89_d(Entity p_89_1_)
    {
        return p_89_1_.field_312_v;
    }

    public AxisAlignedBB func_93_n()
    {
        return field_312_v;
    }

    public boolean func_124_r()
    {
        return true;
    }

    public EntityBoat(World p_i153_1_, double p_i153_2_, double p_i153_4_, double p_i153_6_)
    {
        this(p_i153_1_);
        func_86_a(p_i153_2_, p_i153_4_ + (double)field_9076_H, p_i153_6_);
        field_319_o = 0.0D;
        field_318_p = 0.0D;
        field_317_q = 0.0D;
        field_9092_m = p_i153_2_;
        field_9091_n = p_i153_4_;
        field_9090_o = p_i153_6_;
    }

    public double func_130_h()
    {
        return (double)field_298_E * 0.0D - 0.30000001192092896D;
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        if(field_9093_l.field_792_x || field_304_B)
        {
            return true;
        }
        func_41026_d(-func_41029_m());
        func_41027_c(10);
        func_41024_b(func_41025_i() + p_121_2_ * 10);
        func_9060_u();
        if(func_41025_i() > 40)
        {
            if(field_328_f != null)
            {
                field_328_f.func_6094_e(this);
            }
            for(int i = 0; i < 3; i++)
            {
                func_123_a(Block.field_531_y.field_573_bc, 1, 0.0F);
            }

            for(int j = 0; j < 2; j++)
            {
                func_123_a(Item.field_209_B.field_234_aS, 1, 0.0F);
            }

            func_118_j();
        }
        return true;
    }

    public boolean func_129_c_()
    {
        return !field_304_B;
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        if(func_41028_k() > 0)
        {
            func_41027_c(func_41028_k() - 1);
        }
        if(func_41025_i() > 0)
        {
            func_41024_b(func_41025_i() - 1);
        }
        field_9092_m = field_322_l;
        field_9091_n = field_321_m;
        field_9090_o = field_320_n;
        int i = 5;
        double d = 0.0D;
        for(int j = 0; j < i; j++)
        {
            double d2 = (field_312_v.field_963_b + ((field_312_v.field_968_e - field_312_v.field_963_b) * (double)(j + 0)) / (double)i) - 0.125D;
            double d8 = (field_312_v.field_963_b + ((field_312_v.field_968_e - field_312_v.field_963_b) * (double)(j + 1)) / (double)i) - 0.125D;
            AxisAlignedBB axisalignedbb = AxisAlignedBB.func_693_b(field_312_v.field_964_a, d2, field_312_v.field_970_c, field_312_v.field_969_d, d8, field_312_v.field_967_f);
            if(field_9093_l.func_524_b(axisalignedbb, Material.field_521_f))
            {
                d += 1.0D / (double)i;
            }
        }

        double d1 = Math.sqrt(field_319_o * field_319_o + field_317_q * field_317_q);
        if(d1 > 0.14999999999999999D)
        {
            double d3 = Math.cos(((double)field_316_r * 3.1415926535897931D) / 180D);
            double d9 = Math.sin(((double)field_316_r * 3.1415926535897931D) / 180D);
            for(int i1 = 0; (double)i1 < 1.0D + d1 * 60D; i1++)
            {
                double d16 = field_9064_W.nextFloat() * 2.0F - 1.0F;
                double d19 = (double)(field_9064_W.nextInt(2) * 2 - 1) * 0.69999999999999996D;
                if(field_9064_W.nextBoolean())
                {
                    double d21 = (field_322_l - d3 * d16 * 0.80000000000000004D) + d9 * d19;
                    double d23 = field_320_n - d9 * d16 * 0.80000000000000004D - d3 * d19;
                    field_9093_l.func_514_a("splash", d21, field_321_m - 0.125D, d23, field_319_o, field_318_p, field_317_q);
                } else
                {
                    double d22 = field_322_l + d3 + d9 * d16 * 0.69999999999999996D;
                    double d24 = (field_320_n + d9) - d3 * d16 * 0.69999999999999996D;
                    field_9093_l.func_514_a("splash", d22, field_321_m - 0.125D, d24, field_319_o, field_318_p, field_317_q);
                }
            }

        }
        if(field_9093_l.field_792_x)
        {
            if(field_9176_d > 0)
            {
                double d4 = field_322_l + (field_9174_e - field_322_l) / (double)field_9176_d;
                double d10 = field_321_m + (field_9172_f - field_321_m) / (double)field_9176_d;
                double d13 = field_320_n + (field_9175_aj - field_320_n) / (double)field_9176_d;
                double d17;
                for(d17 = field_9173_ak - (double)field_316_r; d17 < -180D; d17 += 360D) { }
                for(; d17 >= 180D; d17 -= 360D) { }
                field_316_r += d17 / (double)field_9176_d;
                field_315_s += (field_9171_al - (double)field_315_s) / (double)field_9176_d;
                field_9176_d--;
                func_86_a(d4, d10, d13);
                func_6096_b(field_316_r, field_315_s);
            } else
            {
                double d5 = field_322_l + field_319_o;
                double d11 = field_321_m + field_318_p;
                double d14 = field_320_n + field_317_q;
                func_86_a(d5, d11, d14);
                if(field_9086_A)
                {
                    field_319_o *= 0.5D;
                    field_318_p *= 0.5D;
                    field_317_q *= 0.5D;
                }
                field_319_o *= 0.99000000953674316D;
                field_318_p *= 0.94999998807907104D;
                field_317_q *= 0.99000000953674316D;
            }
            return;
        }
        if(d < 1.0D)
        {
            double d6 = d * 2D - 1.0D;
            field_318_p += 0.039999999105930328D * d6;
        } else
        {
            if(field_318_p < 0.0D)
            {
                field_318_p /= 2D;
            }
            field_318_p += 0.0070000002160668373D;
        }
        if(field_328_f != null)
        {
            field_319_o += field_328_f.field_319_o * 0.20000000000000001D;
            field_317_q += field_328_f.field_317_q * 0.20000000000000001D;
        }
        double d7 = 0.40000000000000002D;
        if(field_319_o < -d7)
        {
            field_319_o = -d7;
        }
        if(field_319_o > d7)
        {
            field_319_o = d7;
        }
        if(field_317_q < -d7)
        {
            field_317_q = -d7;
        }
        if(field_317_q > d7)
        {
            field_317_q = d7;
        }
        if(field_9086_A)
        {
            field_319_o *= 0.5D;
            field_318_p *= 0.5D;
            field_317_q *= 0.5D;
        }
        func_88_c(field_319_o, field_318_p, field_317_q);
        if(field_9084_B && d1 > 0.20000000000000001D)
        {
            if(!field_9093_l.field_792_x)
            {
                func_118_j();
                for(int k = 0; k < 3; k++)
                {
                    func_123_a(Block.field_531_y.field_573_bc, 1, 0.0F);
                }

                for(int l = 0; l < 2; l++)
                {
                    func_123_a(Item.field_209_B.field_234_aS, 1, 0.0F);
                }

            }
        } else
        {
            field_319_o *= 0.99000000953674316D;
            field_318_p *= 0.94999998807907104D;
            field_317_q *= 0.99000000953674316D;
        }
        field_315_s = 0.0F;
        double d12 = field_316_r;
        double d15 = field_9092_m - field_322_l;
        double d18 = field_9090_o - field_320_n;
        if(d15 * d15 + d18 * d18 > 0.001D)
        {
            d12 = (float)((Math.atan2(d18, d15) * 180D) / 3.1415926535897931D);
        }
        double d20;
        for(d20 = d12 - (double)field_316_r; d20 >= 180D; d20 -= 360D) { }
        for(; d20 < -180D; d20 += 360D) { }
        if(d20 > 20D)
        {
            d20 = 20D;
        }
        if(d20 < -20D)
        {
            d20 = -20D;
        }
        field_316_r += d20;
        func_6096_b(field_316_r, field_315_s);
        List list = field_9093_l.func_450_b(this, field_312_v.func_708_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                Entity entity = (Entity)list.get(j1);
                if(entity != field_328_f && entity.func_124_r() && (entity instanceof EntityBoat))
                {
                    entity.func_92_c(this);
                }
            }

        }
        for(int k1 = 0; k1 < 4; k1++)
        {
            int l1 = MathHelper.func_584_b(field_322_l + ((double)(k1 % 2) - 0.5D) * 0.80000000000000004D);
            int i2 = MathHelper.func_584_b(field_321_m);
            int j2 = MathHelper.func_584_b(field_320_n + ((double)(k1 / 2) - 0.5D) * 0.80000000000000004D);
            if(field_9093_l.func_444_a(l1, i2, j2) == Block.field_625_aT.field_573_bc)
            {
                field_9093_l.func_508_d(l1, i2, j2, 0);
            }
        }

        if(field_328_f != null && field_328_f.field_304_B)
        {
            field_328_f = null;
        }
    }

    public void func_127_w()
    {
        if(field_328_f == null)
        {
            return;
        } else
        {
            double d = Math.cos(((double)field_316_r * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
            double d1 = Math.sin(((double)field_316_r * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
            field_328_f.func_86_a(field_322_l + d, field_321_m + func_130_h() + field_328_f.func_117_x(), field_320_n + d1);
            return;
        }
    }

    protected void func_97_a(NBTTagCompound nbttagcompound)
    {
    }

    protected void func_99_b(NBTTagCompound nbttagcompound)
    {
    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        if(field_328_f != null && (field_328_f instanceof EntityPlayer) && field_328_f != p_6092_1_)
        {
            return true;
        }
        if(!field_9093_l.field_792_x)
        {
            p_6092_1_.func_6094_e(this);
        }
        return true;
    }

    public void func_41024_b(int p_41024_1_)
    {
        field_21045_af.func_21155_b(19, Integer.valueOf(p_41024_1_));
    }

    public int func_41025_i()
    {
        return field_21045_af.func_25075_b(19);
    }

    public void func_41027_c(int p_41027_1_)
    {
        field_21045_af.func_21155_b(17, Integer.valueOf(p_41027_1_));
    }

    public int func_41028_k()
    {
        return field_21045_af.func_25075_b(17);
    }

    public void func_41026_d(int p_41026_1_)
    {
        field_21045_af.func_21155_b(18, Integer.valueOf(p_41026_1_));
    }

    public int func_41029_m()
    {
        return field_21045_af.func_25075_b(18);
    }
}
