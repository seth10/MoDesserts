// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, EntityAISwimming, EntityAITasks, EntityAIRestrictSun, 
//            EntityAIFleeSun, EntityAIArrowAttack, EntityAIWander, EntityAIWatchClosest, 
//            EntityPlayer, EntityAILookIdle, EntityAIHurtByTarget, EntityAINearestAttackableTarget, 
//            EnumCreatureAttribute, World, MathHelper, DamageSource, 
//            EntityArrow, AchievementList, Item, ItemStack, 
//            EnchantmentHelper

public class EntitySkeleton extends EntityMob
{

    private static final ItemStack field_4108_a;

    public EntitySkeleton(World p_i148_1_)
    {
        super(p_i148_1_);
        field_9119_aG = "/mob/skeleton.png";
        field_9126_bt = 0.25F;
        field_46025_aM.func_46134_a(1, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(2, new EntityAIRestrictSun(this));
        field_46025_aM.func_46134_a(3, new EntityAIFleeSun(this, field_9126_bt));
        field_46025_aM.func_46134_a(4, new EntityAIArrowAttack(this, field_9126_bt, 1, 60));
        field_46025_aM.func_46134_a(5, new EntityAIWander(this, field_9126_bt));
        field_46025_aM.func_46134_a(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
        field_46025_aM.func_46134_a(6, new EntityAILookIdle(this));
        field_48337_aM.func_46134_a(1, new EntityAIHurtByTarget(this, false));
        field_48337_aM.func_46134_a(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));
    }

    public boolean func_46022_as()
    {
        return true;
    }

    public int func_40095_c()
    {
        return 20;
    }

    protected String func_6097_d()
    {
        return "mob.skeleton";
    }

    protected String func_6100_e()
    {
        return "mob.skeletonhurt";
    }

    protected String func_6098_f()
    {
        return "mob.skeletonhurt";
    }

    public EnumCreatureAttribute func_40093_t()
    {
        return EnumCreatureAttribute.UNDEAD;
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

    public void func_142_f(DamageSource p_142_1_)
    {
        super.func_142_f(p_142_1_);
        if((p_142_1_.func_35079_e() instanceof EntityArrow) && (p_142_1_.func_35080_a() instanceof EntityPlayer))
        {
            EntityPlayer entityplayer = (EntityPlayer)p_142_1_.func_35080_a();
            double d = entityplayer.field_322_l - field_322_l;
            double d1 = entityplayer.field_320_n - field_320_n;
            if(d * d + d1 * d1 >= 2500D)
            {
                entityplayer.func_27017_a(AchievementList.field_35490_v);
            }
        }
    }

    protected int func_149_g()
    {
        return Item.field_4148_j.field_234_aS;
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = field_9064_W.nextInt(3 + p_21047_2_);
        for(int j = 0; j < i; j++)
        {
            func_128_a(Item.field_4148_j.field_234_aS, 1);
        }

        i = field_9064_W.nextInt(3 + p_21047_2_);
        for(int k = 0; k < i; k++)
        {
            func_128_a(Item.field_21096_aV.field_234_aS, 1);
        }

    }

    protected void func_48321_b(int p_48321_1_)
    {
        if(p_48321_1_ > 0)
        {
            ItemStack itemstack = new ItemStack(Item.field_4149_i);
            EnchantmentHelper.func_48622_a(field_9064_W, itemstack, 5);
            func_21040_a(itemstack, 0.0F);
        } else
        {
            func_128_a(Item.field_4149_i.field_234_aS, 1);
        }
    }

    static 
    {
        field_4108_a = new ItemStack(Item.field_4149_i, 1);
    }
}
