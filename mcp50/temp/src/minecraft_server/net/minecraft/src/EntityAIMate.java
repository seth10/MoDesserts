// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityAnimal, EntityLookHelper, PathNavigate, 
//            AxisAlignedBB, World, Entity

public class EntityAIMate extends EntityAIBase
{

    private EntityAnimal field_48199_d;
    World field_48203_a;
    private EntityAnimal field_48200_e;
    int field_48201_b;
    float field_48202_c;

    public EntityAIMate(EntityAnimal p_i1001_1_, float p_i1001_2_)
    {
        field_48201_b = 0;
        field_48199_d = p_i1001_1_;
        field_48203_a = p_i1001_1_.field_9093_l;
        field_48202_c = p_i1001_2_;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        if(!field_48199_d.func_48363_r_())
        {
            return false;
        } else
        {
            field_48200_e = func_48198_f();
            return field_48200_e != null;
        }
    }

    public boolean func_46092_g()
    {
        return field_48200_e.func_120_t() && field_48200_e.func_48363_r_() && field_48201_b < 60;
    }

    public void func_46085_d()
    {
        field_48200_e = null;
        field_48201_b = 0;
    }

    public void func_46089_b()
    {
        field_48199_d.func_46021_ae().func_46058_a(field_48200_e, 10F, field_48199_d.func_25018_n_());
        field_48199_d.func_48333_ak().func_48652_a(field_48200_e, field_48202_c);
        field_48201_b++;
        if(field_48201_b == 60)
        {
            func_48197_i();
        }
    }

    private EntityAnimal func_48198_f()
    {
        float f = 8F;
        List list = field_48203_a.func_457_a(field_48199_d.getClass(), field_48199_d.field_312_v.func_708_b(f, f, f));
        for(Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Entity entity = (Entity)iterator.next();
            EntityAnimal entityanimal = (EntityAnimal)entity;
            if(field_48199_d.func_48362_b(entityanimal))
            {
                return entityanimal;
            }
        }

        return null;
    }

    private void func_48197_i()
    {
        EntityAnimal entityanimal = field_48199_d.func_40133_a(field_48200_e);
        if(entityanimal == null)
        {
            return;
        }
        field_48199_d.func_48350_c(6000);
        field_48200_e.func_48350_c(6000);
        field_48199_d.func_48364_s_();
        field_48200_e.func_48364_s_();
        entityanimal.func_48350_c(-24000);
        entityanimal.func_107_c(field_48199_d.field_322_l, field_48199_d.field_321_m, field_48199_d.field_320_n, 0.0F, 0.0F);
        field_48203_a.func_526_a(entityanimal);
        Random random = field_48199_d.func_46019_ai();
        for(int i = 0; i < 7; i++)
        {
            double d = random.nextGaussian() * 0.02D;
            double d1 = random.nextGaussian() * 0.02D;
            double d2 = random.nextGaussian() * 0.02D;
            field_48203_a.func_514_a("heart", (field_48199_d.field_322_l + (double)(random.nextFloat() * field_48199_d.field_300_D * 2.0F)) - (double)field_48199_d.field_300_D, field_48199_d.field_321_m + 0.5D + (double)(random.nextFloat() * field_48199_d.field_298_E), (field_48199_d.field_320_n + (double)(random.nextFloat() * field_48199_d.field_300_D * 2.0F)) - (double)field_48199_d.field_300_D, d, d1, d2);
        }

    }
}
