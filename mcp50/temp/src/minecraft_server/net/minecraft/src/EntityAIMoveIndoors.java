// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, WorldProvider, 
//            MathHelper, VillageCollection, Village, PathNavigate, 
//            VillageDoorInfo, Vec3D, RandomPositionGenerator

public class EntityAIMoveIndoors extends EntityAIBase
{

    private EntityCreature field_48175_a;
    private VillageDoorInfo field_48173_b;
    private int field_48174_c;
    private int field_48172_d;

    public EntityAIMoveIndoors(EntityCreature p_i1014_1_)
    {
        field_48174_c = -1;
        field_48172_d = -1;
        field_48175_a = p_i1014_1_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        if(field_48175_a.field_9093_l.func_453_a() && !field_48175_a.field_9093_l.func_27068_v() || field_48175_a.field_9093_l.field_4272_q.field_4306_c)
        {
            return false;
        }
        if(field_48175_a.func_46019_ai().nextInt(50) != 0)
        {
            return false;
        }
        if(field_48174_c != -1 && field_48175_a.func_101_d(field_48174_c, field_48175_a.field_321_m, field_48172_d) < 4D)
        {
            return false;
        }
        Village village = field_48175_a.field_9093_l.field_48096_A.func_48632_a(MathHelper.func_584_b(field_48175_a.field_322_l), MathHelper.func_584_b(field_48175_a.field_321_m), MathHelper.func_584_b(field_48175_a.field_320_n), 14);
        if(village == null)
        {
            return false;
        } else
        {
            field_48173_b = village.func_48513_c(MathHelper.func_584_b(field_48175_a.field_322_l), MathHelper.func_584_b(field_48175_a.field_321_m), MathHelper.func_584_b(field_48175_a.field_320_n));
            return field_48173_b != null;
        }
    }

    public boolean func_46092_g()
    {
        return !field_48175_a.func_48333_ak().func_46034_b();
    }

    public void func_46088_e()
    {
        field_48174_c = -1;
        if(field_48175_a.func_101_d(field_48173_b.func_48483_a(), field_48173_b.field_48491_b, field_48173_b.func_48484_c()) > 256D)
        {
            Vec3D vec3d = RandomPositionGenerator.func_48395_a(field_48175_a, 14, 3, Vec3D.func_768_b((double)field_48173_b.func_48483_a() + 0.5D, field_48173_b.func_48485_b(), (double)field_48173_b.func_48484_c() + 0.5D));
            if(vec3d != null)
            {
                field_48175_a.func_48333_ak().func_48658_a(vec3d.field_1055_a, vec3d.field_1054_b, vec3d.field_1058_c, 0.3F);
            }
        } else
        {
            field_48175_a.func_48333_ak().func_48658_a((double)field_48173_b.func_48483_a() + 0.5D, field_48173_b.func_48485_b(), (double)field_48173_b.func_48484_c() + 0.5D, 0.3F);
        }
    }

    public void func_46085_d()
    {
        field_48174_c = field_48173_b.func_48483_a();
        field_48172_d = field_48173_b.func_48484_c();
        field_48173_b = null;
    }
}
