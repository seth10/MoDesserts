// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAIBreakDoor, EntityAIAttackOnCollide, EntityPlayer, EntityVillager, 
//            EntityAIMoveTwardsRestriction, EntityAIMoveThroughVillage, EntityAIWander, EntityAIWatchClosest, 
//            EntityAILookIdle, EntityAIHurtByTarget, EntityAINearestAttackableTarget, World, 
//            MathHelper, Item, EnumCreatureAttribute

public class EntityZombie extends EntityMob
{

    public EntityZombie(World p_i502_1_)
    {
        super(p_i502_1_);
        field_9119_aG = "/mob/zombie.png";
        field_9126_bt = 0.23F;
        field_404_af = 4;
        func_48333_ak().func_48663_b(true);
        field_46025_aM.func_46134_a(0, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(1, new EntityAIBreakDoor(this));
        field_46025_aM.func_46134_a(2, new EntityAIAttackOnCollide(this, net.minecraft.src.EntityPlayer.class, field_9126_bt, false));
        field_46025_aM.func_46134_a(3, new EntityAIAttackOnCollide(this, net.minecraft.src.EntityVillager.class, field_9126_bt, true));
        field_46025_aM.func_46134_a(4, new EntityAIMoveTwardsRestriction(this, field_9126_bt));
        field_46025_aM.func_46134_a(5, new EntityAIMoveThroughVillage(this, field_9126_bt, false));
        field_46025_aM.func_46134_a(6, new EntityAIWander(this, field_9126_bt));
        field_46025_aM.func_46134_a(7, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
        field_46025_aM.func_46134_a(7, new EntityAILookIdle(this));
        field_48337_aM.func_46134_a(1, new EntityAIHurtByTarget(this, false));
        field_48337_aM.func_46134_a(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));
        field_48337_aM.func_46134_a(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityVillager.class, 16F, 0, false));
    }

    public int func_40095_c()
    {
        return 20;
    }

    public int func_40092_O()
    {
        return 2;
    }

    protected boolean func_46022_as()
    {
        return true;
    }

    public void func_153_y()
    {
        if(field_9093_l.func_453_a() && !field_9093_l.field_792_x)
        {
            float f = func_108_b(1.0F);
            if(f > 0.5F && field_9093_l.func_497_g(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_321_m), MathHelper.func_584_b(field_320_n)) && field_9064_W.nextFloat() * 30F < (f - 0.4F) * 2.0F)
            {
                func_40034_j(8);
            }
        }
        super.func_153_y();
    }

    protected String func_6097_d()
    {
        return "mob.zombie";
    }

    protected String func_6100_e()
    {
        return "mob.zombiehurt";
    }

    protected String func_6098_f()
    {
        return "mob.zombiedeath";
    }

    protected int func_149_g()
    {
        return Item.field_35410_bk.field_234_aS;
    }

    public EnumCreatureAttribute func_40093_t()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    protected void func_48321_b(int p_48321_1_)
    {
        switch(field_9064_W.nextInt(4))
        {
        case 0: // '\0'
            func_128_a(Item.field_4146_o.field_234_aS, 1);
            break;

        case 1: // '\001'
            func_128_a(Item.field_4188_ab.field_234_aS, 1);
            break;

        case 2: // '\002'
            func_128_a(Item.field_166_m.field_234_aS, 1);
            break;

        case 3: // '\003'
            func_128_a(Item.field_4153_d.field_234_aS, 1);
            break;
        }
    }
}
