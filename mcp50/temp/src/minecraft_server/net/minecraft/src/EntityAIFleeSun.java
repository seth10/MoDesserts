// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, MathHelper, 
//            AxisAlignedBB, Vec3D, PathNavigate

public class EntityAIFleeSun extends EntityAIBase
{

    private EntityCreature field_48260_a;
    private double field_48258_b;
    private double field_48259_c;
    private double field_48256_d;
    private float field_48257_e;
    private World field_48255_f;

    public EntityAIFleeSun(EntityCreature p_i1071_1_, float p_i1071_2_)
    {
        field_48260_a = p_i1071_1_;
        field_48257_e = p_i1071_2_;
        field_48255_f = p_i1071_1_.field_9093_l;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        if(!field_48255_f.func_453_a())
        {
            return false;
        }
        if(!field_48260_a.func_40035_z())
        {
            return false;
        }
        if(!field_48255_f.func_497_g(MathHelper.func_584_b(field_48260_a.field_322_l), (int)field_48260_a.field_312_v.field_963_b, MathHelper.func_584_b(field_48260_a.field_320_n)))
        {
            return false;
        }
        Vec3D vec3d = func_48254_f();
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48258_b = vec3d.field_1055_a;
            field_48259_c = vec3d.field_1054_b;
            field_48256_d = vec3d.field_1058_c;
            return true;
        }
    }

    public boolean func_46092_g()
    {
        return !field_48260_a.func_48333_ak().func_46034_b();
    }

    public void func_46088_e()
    {
        field_48260_a.func_48333_ak().func_48658_a(field_48258_b, field_48259_c, field_48256_d, field_48257_e);
    }

    private Vec3D func_48254_f()
    {
        Random random = field_48260_a.func_46019_ai();
        for(int i = 0; i < 10; i++)
        {
            int j = MathHelper.func_584_b((field_48260_a.field_322_l + (double)random.nextInt(20)) - 10D);
            int k = MathHelper.func_584_b((field_48260_a.field_312_v.field_963_b + (double)random.nextInt(6)) - 3D);
            int l = MathHelper.func_584_b((field_48260_a.field_320_n + (double)random.nextInt(20)) - 10D);
            if(!field_48255_f.func_497_g(j, k, l) && field_48260_a.func_159_a(j, k, l) < 0.0F)
            {
                return Vec3D.func_768_b(j, k, l);
            }
        }

        return null;
    }
}
