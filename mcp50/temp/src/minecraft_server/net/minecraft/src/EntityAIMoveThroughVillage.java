// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, MathHelper, 
//            VillageCollection, PathNavigate, VillageDoorInfo, Vec3D, 
//            RandomPositionGenerator, Village, PathEntity

public class EntityAIMoveThroughVillage extends EntityAIBase
{

    private EntityCreature field_48283_a;
    private float field_48281_b;
    private PathEntity field_48282_c;
    private VillageDoorInfo field_48279_d;
    private boolean field_48280_e;
    private List field_48278_f;

    public EntityAIMoveThroughVillage(EntityCreature p_i1090_1_, float p_i1090_2_, boolean p_i1090_3_)
    {
        field_48278_f = new ArrayList();
        field_48283_a = p_i1090_1_;
        field_48281_b = p_i1090_2_;
        field_48280_e = p_i1090_3_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        func_48277_f();
        if(field_48280_e && field_48283_a.field_9093_l.func_453_a())
        {
            return false;
        }
        Village village = field_48283_a.field_9093_l.field_48096_A.func_48632_a(MathHelper.func_584_b(field_48283_a.field_322_l), MathHelper.func_584_b(field_48283_a.field_321_m), MathHelper.func_584_b(field_48283_a.field_320_n), 0);
        if(village == null)
        {
            return false;
        }
        field_48279_d = func_48276_a(village);
        if(field_48279_d == null)
        {
            return false;
        }
        boolean flag = field_48283_a.func_48333_ak().func_48657_b();
        field_48283_a.func_48333_ak().func_48663_b(false);
        field_48282_c = field_48283_a.func_48333_ak().func_48650_a(field_48279_d.field_48493_a, field_48279_d.field_48491_b, field_48279_d.field_48492_c);
        field_48283_a.func_48333_ak().func_48663_b(flag);
        if(field_48282_c != null)
        {
            return true;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48395_a(field_48283_a, 10, 7, Vec3D.func_768_b(field_48279_d.field_48493_a, field_48279_d.field_48491_b, field_48279_d.field_48492_c));
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48283_a.func_48333_ak().func_48663_b(false);
            field_48282_c = field_48283_a.func_48333_ak().func_48650_a(vec3d.field_1055_a, vec3d.field_1054_b, vec3d.field_1058_c);
            field_48283_a.func_48333_ak().func_48663_b(flag);
            return field_48282_c != null;
        }
    }

    public boolean func_46092_g()
    {
        if(field_48283_a.func_48333_ak().func_46034_b())
        {
            return false;
        } else
        {
            float f = field_48283_a.field_300_D + 4F;
            return field_48283_a.func_101_d(field_48279_d.field_48493_a, field_48279_d.field_48491_b, field_48279_d.field_48492_c) > (double)(f * f);
        }
    }

    public void func_46088_e()
    {
        field_48283_a.func_48333_ak().func_48647_a(field_48282_c, field_48281_b);
    }

    public void func_46085_d()
    {
        if(field_48283_a.func_48333_ak().func_46034_b() || field_48283_a.func_101_d(field_48279_d.field_48493_a, field_48279_d.field_48491_b, field_48279_d.field_48492_c) < 16D)
        {
            field_48278_f.add(field_48279_d);
        }
    }

    private VillageDoorInfo func_48276_a(Village p_48276_1_)
    {
        VillageDoorInfo villagedoorinfo = null;
        int i = 0x7fffffff;
        List list = p_48276_1_.func_48517_f();
        Iterator iterator = list.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageDoorInfo villagedoorinfo1 = (VillageDoorInfo)iterator.next();
            int j = villagedoorinfo1.func_48481_a(MathHelper.func_584_b(field_48283_a.field_322_l), MathHelper.func_584_b(field_48283_a.field_321_m), MathHelper.func_584_b(field_48283_a.field_320_n));
            if(j < i && !func_48275_a(villagedoorinfo1))
            {
                villagedoorinfo = villagedoorinfo1;
                i = j;
            }
        } while(true);
        return villagedoorinfo;
    }

    private boolean func_48275_a(VillageDoorInfo p_48275_1_)
    {
        for(Iterator iterator = field_48278_f.iterator(); iterator.hasNext();)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            if(p_48275_1_.field_48493_a == villagedoorinfo.field_48493_a && p_48275_1_.field_48491_b == villagedoorinfo.field_48491_b && p_48275_1_.field_48492_c == villagedoorinfo.field_48492_c)
            {
                return true;
            }
        }

        return false;
    }

    private void func_48277_f()
    {
        if(field_48278_f.size() > 15)
        {
            field_48278_f.remove(0);
        }
    }
}
