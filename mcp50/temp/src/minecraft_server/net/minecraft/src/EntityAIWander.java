// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, RandomPositionGenerator, Vec3D, 
//            PathNavigate

public class EntityAIWander extends EntityAIBase
{

    private EntityCreature field_46104_a;
    private double field_46102_b;
    private double field_46103_c;
    private double field_46101_d;
    private float field_48209_e;

    public EntityAIWander(EntityCreature p_i1056_1_, float p_i1056_2_)
    {
        field_46104_a = p_i1056_1_;
        field_48209_e = p_i1056_2_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        if(field_46104_a.func_46018_ak() >= 100)
        {
            return false;
        }
        if(field_46104_a.func_46019_ai().nextInt(120) != 0)
        {
            return false;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48396_a(field_46104_a, 10, 7);
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_46102_b = vec3d.field_1055_a;
            field_46103_c = vec3d.field_1054_b;
            field_46101_d = vec3d.field_1058_c;
            return true;
        }
    }

    public boolean func_46092_g()
    {
        return !field_46104_a.func_48333_ak().func_46034_b();
    }

    public void func_46088_e()
    {
        field_46104_a.func_48333_ak().func_48658_a(field_46102_b, field_46103_c, field_46101_d, field_48209_e);
    }
}
