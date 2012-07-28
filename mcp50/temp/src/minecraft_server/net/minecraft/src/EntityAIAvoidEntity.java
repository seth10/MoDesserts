// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, EntityPlayer, EntityTameable, 
//            World, AxisAlignedBB, Entity, EntitySenses, 
//            Vec3D, RandomPositionGenerator, PathNavigate, PathEntity

public class EntityAIAvoidEntity extends EntityAIBase
{

    private EntityCreature field_48237_a;
    private float field_48235_b;
    private float field_48236_c;
    private Entity field_48233_d;
    private float field_48234_e;
    private PathEntity field_48231_f;
    private PathNavigate field_48232_g;
    private Class field_48238_h;

    public EntityAIAvoidEntity(EntityCreature p_i1038_1_, Class p_i1038_2_, float p_i1038_3_, float p_i1038_4_, float p_i1038_5_)
    {
        field_48237_a = p_i1038_1_;
        field_48238_h = p_i1038_2_;
        field_48234_e = p_i1038_3_;
        field_48235_b = p_i1038_4_;
        field_48236_c = p_i1038_5_;
        field_48232_g = p_i1038_1_.func_48333_ak();
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        if(field_48238_h == (net.minecraft.src.EntityPlayer.class))
        {
            if((field_48237_a instanceof EntityTameable) && ((EntityTameable)field_48237_a).func_48373_u_())
            {
                return false;
            }
            field_48233_d = field_48237_a.field_9093_l.func_472_a(field_48237_a, field_48234_e);
            if(field_48233_d == null)
            {
                return false;
            }
        } else
        {
            List list = field_48237_a.field_9093_l.func_457_a(field_48238_h, field_48237_a.field_312_v.func_708_b(field_48234_e, 3D, field_48234_e));
            if(list.size() == 0)
            {
                return false;
            }
            field_48233_d = (Entity)list.get(0);
        }
        if(!field_48237_a.func_48318_al().func_48546_a(field_48233_d))
        {
            return false;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48394_b(field_48237_a, 16, 7, Vec3D.func_768_b(field_48233_d.field_322_l, field_48233_d.field_321_m, field_48233_d.field_320_n));
        if(vec3d == null)
        {
            return false;
        }
        if(field_48233_d.func_101_d(vec3d.field_1055_a, vec3d.field_1054_b, vec3d.field_1058_c) < field_48233_d.func_102_b(field_48237_a))
        {
            return false;
        }
        field_48231_f = field_48232_g.func_48650_a(vec3d.field_1055_a, vec3d.field_1054_b, vec3d.field_1058_c);
        if(field_48231_f == null)
        {
            return false;
        }
        return field_48231_f.func_48426_a(vec3d);
    }

    public boolean func_46092_g()
    {
        return !field_48232_g.func_46034_b();
    }

    public void func_46088_e()
    {
        field_48232_g.func_48647_a(field_48231_f, field_48235_b);
    }

    public void func_46085_d()
    {
        field_48233_d = null;
    }

    public void func_46089_b()
    {
        if(field_48237_a.func_102_b(field_48233_d) < 49D)
        {
            field_48237_a.func_48333_ak().func_48654_a(field_48236_c);
        } else
        {
            field_48237_a.func_48333_ak().func_48654_a(field_48235_b);
        }
    }
}
