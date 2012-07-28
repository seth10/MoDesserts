// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityVillager, World, MathHelper, 
//            VillageCollection, AxisAlignedBB, EntityLookHelper, PathNavigate, 
//            Village, EntityLiving

public class EntityAIVillagerMate extends EntityAIBase
{

    private EntityVillager field_48310_b;
    private EntityVillager field_48311_c;
    private World field_48308_d;
    private int field_48309_e;
    Village field_48312_a;

    public EntityAIVillagerMate(EntityVillager p_i1029_1_)
    {
        field_48309_e = 0;
        field_48310_b = p_i1029_1_;
        field_48308_d = p_i1029_1_.field_9093_l;
        func_46087_a(3);
    }

    public boolean func_46090_a()
    {
        if(field_48310_b.func_48351_J() != 0)
        {
            return false;
        }
        if(field_48310_b.func_46019_ai().nextInt(500) != 0)
        {
            return false;
        }
        field_48312_a = field_48308_d.field_48096_A.func_48632_a(MathHelper.func_584_b(field_48310_b.field_322_l), MathHelper.func_584_b(field_48310_b.field_321_m), MathHelper.func_584_b(field_48310_b.field_320_n), 0);
        if(field_48312_a == null)
        {
            return false;
        }
        if(!func_48305_f())
        {
            return false;
        }
        Entity entity = field_48308_d.func_48085_a(net.minecraft.src.EntityVillager.class, field_48310_b.field_312_v.func_708_b(8D, 3D, 8D), field_48310_b);
        if(entity == null)
        {
            return false;
        }
        field_48311_c = (EntityVillager)entity;
        return field_48311_c.func_48351_J() == 0;
    }

    public void func_46088_e()
    {
        field_48309_e = 300;
        field_48310_b.func_48356_a(true);
    }

    public void func_46085_d()
    {
        field_48312_a = null;
        field_48311_c = null;
        field_48310_b.func_48356_a(false);
    }

    public boolean func_46092_g()
    {
        return field_48309_e >= 0 && func_48305_f() && field_48310_b.func_48351_J() == 0;
    }

    public void func_46089_b()
    {
        field_48309_e--;
        field_48310_b.func_46021_ae().func_46058_a(field_48311_c, 10F, 30F);
        if(field_48310_b.func_102_b(field_48311_c) > 2.25D)
        {
            field_48310_b.func_48333_ak().func_48652_a(field_48311_c, 0.25F);
        } else
        if(field_48309_e == 0 && field_48311_c.func_48355_A())
        {
            func_48306_i();
        }
        if(field_48310_b.func_46019_ai().nextInt(35) == 0)
        {
            func_48307_a(field_48310_b);
        }
    }

    private boolean func_48305_f()
    {
        int i = (int)((double)(float)field_48312_a.func_48525_c() * 0.34999999999999998D);
        return field_48312_a.func_48521_e() < i;
    }

    private void func_48306_i()
    {
        EntityVillager entityvillager = new EntityVillager(field_48308_d);
        field_48311_c.func_48350_c(6000);
        field_48310_b.func_48350_c(6000);
        entityvillager.func_48350_c(-24000);
        entityvillager.func_48357_f_(field_48310_b.func_46019_ai().nextInt(5));
        entityvillager.func_107_c(field_48310_b.field_322_l, field_48310_b.field_321_m, field_48310_b.field_320_n, 0.0F, 0.0F);
        field_48308_d.func_526_a(entityvillager);
        func_48307_a(entityvillager);
    }

    private void func_48307_a(EntityLiving p_48307_1_)
    {
        Random random = p_48307_1_.func_46019_ai();
        for(int i = 0; i < 5; i++)
        {
            double d = random.nextGaussian() * 0.02D;
            double d1 = random.nextGaussian() * 0.02D;
            double d2 = random.nextGaussian() * 0.02D;
            field_48308_d.func_514_a("heart", (p_48307_1_.field_322_l + (double)(random.nextFloat() * p_48307_1_.field_300_D * 2.0F)) - (double)p_48307_1_.field_300_D, p_48307_1_.field_321_m + 1.0D + (double)(random.nextFloat() * p_48307_1_.field_298_E), (p_48307_1_.field_320_n + (double)(random.nextFloat() * p_48307_1_.field_300_D * 2.0F)) - (double)p_48307_1_.field_300_D, d, d1, d2);
        }

    }
}
