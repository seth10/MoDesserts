// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAgeable, INpc, PathNavigate, EntityAISwimming, 
//            EntityAITasks, EntityAIAvoidEntity, EntityZombie, EntityAIMoveIndoors, 
//            EntityAIRestrictOpenDoor, EntityAIOpenDoor, EntityAIMoveTwardsRestriction, EntityAIVillagerMate, 
//            EntityAIFollowGolem, EntityAIPlay, EntityAIWatchClosest2, EntityPlayer, 
//            EntityAIWander, EntityAIWatchClosest, EntityLiving, World, 
//            MathHelper, VillageCollection, Village, ChunkCoordinates, 
//            DataWatcher, NBTTagCompound

public class EntityVillager extends EntityAgeable
    implements INpc
{

    private int field_48359_b;
    private boolean field_48360_c;
    private boolean field_48358_g;
    Village field_48361_a;

    public EntityVillager(World p_i134_1_)
    {
        this(p_i134_1_, 0);
    }

    public EntityVillager(World p_i135_1_, int p_i135_2_)
    {
        super(p_i135_1_);
        field_48359_b = 0;
        field_48360_c = false;
        field_48358_g = false;
        field_48361_a = null;
        func_48357_f_(p_i135_2_);
        field_9119_aG = "/mob/villager/villager.png";
        field_9126_bt = 0.5F;
        func_48333_ak().func_48663_b(true);
        func_48333_ak().func_48656_a(true);
        field_46025_aM.func_46134_a(0, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(1, new EntityAIAvoidEntity(this, net.minecraft.src.EntityZombie.class, 8F, 0.3F, 0.35F));
        field_46025_aM.func_46134_a(2, new EntityAIMoveIndoors(this));
        field_46025_aM.func_46134_a(3, new EntityAIRestrictOpenDoor(this));
        field_46025_aM.func_46134_a(4, new EntityAIOpenDoor(this, true));
        field_46025_aM.func_46134_a(5, new EntityAIMoveTwardsRestriction(this, 0.3F));
        field_46025_aM.func_46134_a(6, new EntityAIVillagerMate(this));
        field_46025_aM.func_46134_a(7, new EntityAIFollowGolem(this));
        field_46025_aM.func_46134_a(8, new EntityAIPlay(this, 0.32F));
        field_46025_aM.func_46134_a(9, new EntityAIWatchClosest2(this, net.minecraft.src.EntityPlayer.class, 3F, 1.0F));
        field_46025_aM.func_46134_a(9, new EntityAIWatchClosest2(this, net.minecraft.src.EntityVillager.class, 5F, 0.02F));
        field_46025_aM.func_46134_a(9, new EntityAIWander(this, 0.3F));
        field_46025_aM.func_46134_a(10, new EntityAIWatchClosest(this, net.minecraft.src.EntityLiving.class, 8F));
    }

    public boolean func_46022_as()
    {
        return true;
    }

    protected void func_48326_g()
    {
        if(--field_48359_b <= 0)
        {
            field_9093_l.field_48096_A.func_48639_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_321_m), MathHelper.func_584_b(field_320_n));
            field_48359_b = 70 + field_9064_W.nextInt(50);
            field_48361_a = field_9093_l.field_48096_A.func_48632_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_321_m), MathHelper.func_584_b(field_320_n), 32);
            if(field_48361_a == null)
            {
                func_48322_aw();
            } else
            {
                ChunkCoordinates chunkcoordinates = field_48361_a.func_48526_a();
                func_48317_b(chunkcoordinates.field_22216_a, chunkcoordinates.field_529_a, chunkcoordinates.field_528_b, field_48361_a.func_48527_b());
            }
        }
        super.func_48326_g();
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, Integer.valueOf(0));
    }

    public int func_40095_c()
    {
        return 20;
    }

    public void func_153_y()
    {
        super.func_153_y();
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_405_a("Profession", func_48352_x());
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        func_48357_f_(p_99_1_.func_395_d("Profession"));
    }

    protected boolean func_25020_s()
    {
        return false;
    }

    protected String func_6097_d()
    {
        return "mob.villager.default";
    }

    protected String func_6100_e()
    {
        return "mob.villager.defaulthurt";
    }

    protected String func_6098_f()
    {
        return "mob.villager.defaultdeath";
    }

    public void func_48357_f_(int p_48357_1_)
    {
        field_21045_af.func_21155_b(16, Integer.valueOf(p_48357_1_));
    }

    public int func_48352_x()
    {
        return field_21045_af.func_25075_b(16);
    }

    public boolean func_48355_A()
    {
        return field_48360_c;
    }

    public void func_48356_a(boolean p_48356_1_)
    {
        field_48360_c = p_48356_1_;
    }

    public void func_48354_b(boolean p_48354_1_)
    {
        field_48358_g = p_48354_1_;
    }

    public boolean func_48353_E_()
    {
        return field_48358_g;
    }

    public void func_48334_a(EntityLiving p_48334_1_)
    {
        super.func_48334_a(p_48334_1_);
        if(field_48361_a != null && p_48334_1_ != null)
        {
            field_48361_a.func_48530_a(p_48334_1_);
        }
    }
}
