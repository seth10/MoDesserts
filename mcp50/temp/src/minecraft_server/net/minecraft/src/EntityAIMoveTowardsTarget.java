// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, EntityLiving, Vec3D, 
//            RandomPositionGenerator, PathNavigate

public class EntityAIMoveTowardsTarget extends EntityAIBase
{

    private EntityCreature field_48223_a;
    private EntityLiving field_48221_b;
    private double field_48222_c;
    private double field_48219_d;
    private double field_48220_e;
    private float field_48217_f;
    private float field_48218_g;

    public EntityAIMoveTowardsTarget(EntityCreature p_i1034_1_, float p_i1034_2_, float p_i1034_3_)
    {
        field_48223_a = p_i1034_1_;
        field_48217_f = p_i1034_2_;
        field_48218_g = p_i1034_3_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        field_48221_b = field_48223_a.func_48331_as();
        if(field_48221_b == null)
        {
            return false;
        }
        if(field_48221_b.func_102_b(field_48223_a) > (double)(field_48218_g * field_48218_g))
        {
            return false;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48395_a(field_48223_a, 16, 7, Vec3D.func_768_b(field_48221_b.field_322_l, field_48221_b.field_321_m, field_48221_b.field_320_n));
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48222_c = vec3d.field_1055_a;
            field_48219_d = vec3d.field_1054_b;
            field_48220_e = vec3d.field_1058_c;
            return true;
        }
    }

    public boolean func_46092_g()
    {
        return !field_48223_a.func_48333_ak().func_46034_b() && field_48221_b.func_120_t() && field_48221_b.func_102_b(field_48223_a) < (double)(field_48218_g * field_48218_g);
    }

    public void func_46085_d()
    {
        field_48221_b = null;
    }

    public void func_46088_e()
    {
        field_48223_a.func_48333_ak().func_48658_a(field_48222_c, field_48219_d, field_48220_e, field_48217_f);
    }
}
