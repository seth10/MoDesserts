// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAnimal, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAIPanic, EntityAIMate, EntityAITempt, Item, 
//            EntityAIFollowParent, EntityAIWander, EntityAIWatchClosest, EntityPlayer, 
//            EntityAILookIdle, DataWatcher, NBTTagCompound, World, 
//            EntityPigZombie, AchievementList, EntityLightningBolt

public class EntityPig extends EntityAnimal
{

    public EntityPig(World p_i557_1_)
    {
        super(p_i557_1_);
        field_9119_aG = "/mob/pig.png";
        func_113_a(0.9F, 0.9F);
        func_48333_ak().func_48656_a(true);
        float f = 0.25F;
        field_46025_aM.func_46134_a(0, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(1, new EntityAIPanic(this, 0.38F));
        field_46025_aM.func_46134_a(2, new EntityAIMate(this, f));
        field_46025_aM.func_46134_a(3, new EntityAITempt(this, 0.25F, Item.field_186_R.field_234_aS, false));
        field_46025_aM.func_46134_a(4, new EntityAIFollowParent(this, 0.28F));
        field_46025_aM.func_46134_a(5, new EntityAIWander(this, f));
        field_46025_aM.func_46134_a(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46025_aM.func_46134_a(7, new EntityAILookIdle(this));
    }

    public boolean func_46022_as()
    {
        return true;
    }

    public int func_40095_c()
    {
        return 10;
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, Byte.valueOf((byte)0));
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_393_a("Saddle", func_21065_K());
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        func_21064_a(p_99_1_.func_402_l("Saddle"));
    }

    protected String func_6097_d()
    {
        return "mob.pig";
    }

    protected String func_6100_e()
    {
        return "mob.pig";
    }

    protected String func_6098_f()
    {
        return "mob.pigdeath";
    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        if(!super.func_6092_a(p_6092_1_))
        {
            if(func_21065_K() && !field_9093_l.field_792_x && (field_328_f == null || field_328_f == p_6092_1_))
            {
                p_6092_1_.func_6094_e(this);
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return true;
        }
    }

    protected int func_149_g()
    {
        if(func_40035_z())
        {
            return Item.field_4176_ap.field_234_aS;
        } else
        {
            return Item.field_215_ao.field_234_aS;
        }
    }

    public boolean func_21065_K()
    {
        return (field_21045_af.func_21156_a(16) & 1) != 0;
    }

    public void func_21064_a(boolean p_21064_1_)
    {
        if(p_21064_1_)
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)1));
        } else
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)0));
        }
    }

    public void func_27009_a(EntityLightningBolt p_27009_1_)
    {
        if(field_9093_l.field_792_x)
        {
            return;
        } else
        {
            EntityPigZombie entitypigzombie = new EntityPigZombie(field_9093_l);
            entitypigzombie.func_107_c(field_322_l, field_321_m, field_320_n, field_316_r, field_315_s);
            field_9093_l.func_526_a(entitypigzombie);
            func_118_j();
            return;
        }
    }

    protected void func_114_a(float p_114_1_)
    {
        super.func_114_a(p_114_1_);
        if(p_114_1_ > 5F && (field_328_f instanceof EntityPlayer))
        {
            ((EntityPlayer)field_328_f).func_27017_a(AchievementList.field_27098_u);
        }
    }

    public EntityAnimal func_40133_a(EntityAnimal p_40133_1_)
    {
        return new EntityPig(field_9093_l);
    }
}
