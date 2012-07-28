// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, EntityAISwimming, EntityAITasks, EntityAICreeperSwell, 
//            EntityAIAvoidEntity, EntityOcelot, EntityAIAttackOnCollide, EntityAIWander, 
//            EntityAIWatchClosest, EntityPlayer, EntityAILookIdle, EntityAINearestAttackableTarget, 
//            EntityAIHurtByTarget, DataWatcher, NBTTagCompound, World, 
//            DamageSource, EntitySkeleton, Item, Entity, 
//            EntityLightningBolt

public class EntityCreeper extends EntityMob
{

    int field_406_a;
    int field_405_b;

    public EntityCreeper(World p_i155_1_)
    {
        super(p_i155_1_);
        field_9119_aG = "/mob/creeper.png";
        field_46025_aM.func_46134_a(1, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(2, new EntityAICreeperSwell(this));
        field_46025_aM.func_46134_a(3, new EntityAIAvoidEntity(this, net.minecraft.src.EntityOcelot.class, 6F, 0.25F, 0.3F));
        field_46025_aM.func_46134_a(4, new EntityAIAttackOnCollide(this, 0.25F, false));
        field_46025_aM.func_46134_a(5, new EntityAIWander(this, 0.2F));
        field_46025_aM.func_46134_a(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
        field_46025_aM.func_46134_a(6, new EntityAILookIdle(this));
        field_48337_aM.func_46134_a(1, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));
        field_48337_aM.func_46134_a(2, new EntityAIHurtByTarget(this, false));
    }

    public boolean func_46022_as()
    {
        return true;
    }

    public int func_40095_c()
    {
        return 20;
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, Byte.valueOf((byte)-1));
        field_21045_af.func_21153_a(17, Byte.valueOf((byte)0));
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        if(field_21045_af.func_21156_a(17) == 1)
        {
            p_97_1_.func_393_a("powered", true);
        }
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        field_21045_af.func_21155_b(17, Byte.valueOf((byte)(p_99_1_.func_402_l("powered") ? 1 : 0)));
    }

    public void func_106_b_()
    {
        if(func_120_t())
        {
            field_405_b = field_406_a;
            int i = func_21048_K();
            if(i > 0 && field_406_a == 0)
            {
                field_9093_l.func_506_a(this, "random.fuse", 1.0F, 0.5F);
            }
            field_406_a += i;
            if(field_406_a < 0)
            {
                field_406_a = 0;
            }
            if(field_406_a >= 30)
            {
                field_406_a = 30;
                if(!field_9093_l.field_792_x)
                {
                    if(func_27014_t())
                    {
                        field_9093_l.func_12013_a(this, field_322_l, field_321_m, field_320_n, 6F);
                    } else
                    {
                        field_9093_l.func_12013_a(this, field_322_l, field_321_m, field_320_n, 3F);
                    }
                    func_118_j();
                }
            }
        }
        super.func_106_b_();
    }

    protected String func_6100_e()
    {
        return "mob.creeper";
    }

    protected String func_6098_f()
    {
        return "mob.creeperdeath";
    }

    public void func_142_f(DamageSource p_142_1_)
    {
        super.func_142_f(p_142_1_);
        if(p_142_1_.func_35080_a() instanceof EntitySkeleton)
        {
            func_128_a(Item.field_236_aQ.field_234_aS + field_9064_W.nextInt(10), 1);
        }
    }

    public boolean func_35224_c(Entity p_35224_1_)
    {
        return true;
    }

    public boolean func_27014_t()
    {
        return field_21045_af.func_21156_a(17) == 1;
    }

    protected int func_149_g()
    {
        return Item.field_193_K.field_234_aS;
    }

    public int func_21048_K()
    {
        return field_21045_af.func_21156_a(16);
    }

    public void func_21049_a(int p_21049_1_)
    {
        field_21045_af.func_21155_b(16, Byte.valueOf((byte)p_21049_1_));
    }

    public void func_27009_a(EntityLightningBolt p_27009_1_)
    {
        super.func_27009_a(p_27009_1_);
        field_21045_af.func_21155_b(17, Byte.valueOf((byte)1));
    }
}
