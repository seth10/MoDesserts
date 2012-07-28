// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, RandomPositionGenerator, Vec3D, 
//            PathNavigate

public class EntityAIPanic extends EntityAIBase
{

    private EntityCreature field_48208_a;
    private float field_48206_b;
    private double field_48207_c;
    private double field_48204_d;
    private double field_48205_e;

    public EntityAIPanic(EntityCreature p_i1063_1_, float p_i1063_2_)
    {
        field_48208_a = p_i1063_1_;
        field_48206_b = p_i1063_2_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        if(field_48208_a.func_46020_aj() == null)
        {
            return false;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48396_a(field_48208_a, 5, 4);
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48207_c = vec3d.field_1055_a;
            field_48204_d = vec3d.field_1054_b;
            field_48205_e = vec3d.field_1058_c;
            return true;
        }
    }

    public void func_46088_e()
    {
        field_48208_a.func_48333_ak().func_48658_a(field_48207_c, field_48204_d, field_48205_e, field_48206_b);
    }

    public boolean func_46092_g()
    {
        return !field_48208_a.func_48333_ak().func_46034_b();
    }
}
