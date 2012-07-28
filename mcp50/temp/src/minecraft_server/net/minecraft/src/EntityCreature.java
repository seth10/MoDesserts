// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityLiving, Profiler, World, Entity, 
//            AxisAlignedBB, MathHelper, PathEntity, Vec3D

public abstract class EntityCreature extends EntityLiving
{

    private PathEntity field_388_a;
    protected Entity field_389_ag;
    protected boolean field_387_ah;
    protected int field_35223_f;

    public EntityCreature(World p_i207_1_)
    {
        super(p_i207_1_);
        field_387_ah = false;
        field_35223_f = 0;
    }

    protected boolean func_25026_u()
    {
        return false;
    }

    protected void func_152_d_()
    {
        Profiler.func_40518_a("ai");
        if(field_35223_f > 0)
        {
            field_35223_f--;
        }
        field_387_ah = func_25026_u();
        float f = 16F;
        if(field_389_ag == null)
        {
            field_389_ag = func_158_i();
            if(field_389_ag != null)
            {
                field_388_a = field_9093_l.func_48083_a(this, field_389_ag, f, true, false, false, true);
            }
        } else
        if(!field_389_ag.func_120_t())
        {
            field_389_ag = null;
        } else
        {
            float f1 = field_389_ag.func_94_a(this);
            if(func_145_g(field_389_ag))
            {
                func_157_a(field_389_ag, f1);
            } else
            {
                func_28013_b(field_389_ag, f1);
            }
        }
        Profiler.func_40517_a();
        if(!field_387_ah && field_389_ag != null && (field_388_a == null || field_9064_W.nextInt(20) == 0))
        {
            field_388_a = field_9093_l.func_48083_a(this, field_389_ag, f, true, false, false, true);
        } else
        if(!field_387_ah && (field_388_a == null && field_9064_W.nextInt(180) == 0 || field_9064_W.nextInt(120) == 0 || field_35223_f > 0) && field_9132_bn < 100)
        {
            func_31021_B();
        }
        int i = MathHelper.func_584_b(field_312_v.field_963_b + 0.5D);
        boolean flag = func_27011_Z();
        boolean flag1 = func_112_q();
        field_315_s = 0.0F;
        if(field_388_a == null || field_9064_W.nextInt(100) == 0)
        {
            super.func_152_d_();
            field_388_a = null;
            return;
        }
        Profiler.func_40518_a("followpath");
        Vec3D vec3d = field_388_a.func_48420_a(this);
        for(double d = field_300_D * 2.0F; vec3d != null && vec3d.func_759_d(field_322_l, vec3d.field_1054_b, field_320_n) < d * d;)
        {
            field_388_a.func_728_a();
            if(field_388_a.func_729_b())
            {
                vec3d = null;
                field_388_a = null;
            } else
            {
                vec3d = field_388_a.func_48420_a(this);
            }
        }

        field_9128_br = false;
        if(vec3d != null)
        {
            double d1 = vec3d.field_1055_a - field_322_l;
            double d2 = vec3d.field_1058_c - field_320_n;
            double d3 = vec3d.field_1054_b - (double)i;
            float f2 = (float)((Math.atan2(d2, d1) * 180D) / 3.1415927410125732D) - 90F;
            float f3 = f2 - field_316_r;
            field_9130_bp = field_9126_bt;
            for(; f3 < -180F; f3 += 360F) { }
            for(; f3 >= 180F; f3 -= 360F) { }
            if(f3 > 30F)
            {
                f3 = 30F;
            }
            if(f3 < -30F)
            {
                f3 = -30F;
            }
            field_316_r += f3;
            if(field_387_ah && field_389_ag != null)
            {
                double d4 = field_389_ag.field_322_l - field_322_l;
                double d5 = field_389_ag.field_320_n - field_320_n;
                float f5 = field_316_r;
                field_316_r = (float)((Math.atan2(d5, d4) * 180D) / 3.1415927410125732D) - 90F;
                float f4 = (((f5 - field_316_r) + 90F) * 3.141593F) / 180F;
                field_9131_bo = -MathHelper.func_585_a(f4) * field_9130_bp * 1.0F;
                field_9130_bp = MathHelper.func_582_b(f4) * field_9130_bp * 1.0F;
            }
            if(d3 > 0.0D)
            {
                field_9128_br = true;
            }
        }
        if(field_389_ag != null)
        {
            func_147_b(field_389_ag, 30F, 30F);
        }
        if(field_9084_B && !func_25023_z())
        {
            field_9128_br = true;
        }
        if(field_9064_W.nextFloat() < 0.8F && (flag || flag1))
        {
            field_9128_br = true;
        }
        Profiler.func_40517_a();
    }

    protected void func_31021_B()
    {
        Profiler.func_40518_a("stroll");
        boolean flag = false;
        int i = -1;
        int j = -1;
        int k = -1;
        float f = -99999F;
        for(int l = 0; l < 10; l++)
        {
            int i1 = MathHelper.func_584_b((field_322_l + (double)field_9064_W.nextInt(13)) - 6D);
            int j1 = MathHelper.func_584_b((field_321_m + (double)field_9064_W.nextInt(7)) - 3D);
            int k1 = MathHelper.func_584_b((field_320_n + (double)field_9064_W.nextInt(13)) - 6D);
            float f1 = func_159_a(i1, j1, k1);
            if(f1 > f)
            {
                f = f1;
                i = i1;
                j = j1;
                k = k1;
                flag = true;
            }
        }

        if(flag)
        {
            field_388_a = field_9093_l.func_48088_a(this, i, j, k, 10F, true, false, false, true);
        }
        Profiler.func_40517_a();
    }

    protected void func_157_a(Entity entity, float f)
    {
    }

    protected void func_28013_b(Entity entity, float f)
    {
    }

    public float func_159_a(int p_159_1_, int p_159_2_, int p_159_3_)
    {
        return 0.0F;
    }

    protected Entity func_158_i()
    {
        return null;
    }

    public boolean func_155_a()
    {
        int i = MathHelper.func_584_b(field_322_l);
        int j = MathHelper.func_584_b(field_312_v.field_963_b);
        int k = MathHelper.func_584_b(field_320_n);
        return super.func_155_a() && func_159_a(i, j, k) >= 0.0F;
    }

    public boolean func_25023_z()
    {
        return field_388_a != null;
    }

    public void func_25022_a(PathEntity p_25022_1_)
    {
        field_388_a = p_25022_1_;
    }

    public Entity func_25024_A()
    {
        return field_389_ag;
    }

    public void func_25025_c(Entity p_25025_1_)
    {
        field_389_ag = p_25025_1_;
    }

    protected float func_35178_D()
    {
        if(func_46022_as())
        {
            return 1.0F;
        }
        float f = super.func_35178_D();
        if(field_35223_f > 0)
        {
            f *= 2.0F;
        }
        return f;
    }
}
