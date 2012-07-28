// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityGolem, PathNavigate, EntityAIArrowAttack, EntityAITasks, 
//            EntityAIWander, EntityAIWatchClosest, EntityPlayer, EntityAILookIdle, 
//            EntityAINearestAttackableTarget, EntityMob, DamageSource, MathHelper, 
//            World, BiomeGenBase, Block, Item, 
//            NBTTagCompound

public class EntitySnowman extends EntityGolem
{

    public EntitySnowman(World p_i515_1_)
    {
        super(p_i515_1_);
        field_9119_aG = "/mob/snowman.png";
        func_113_a(0.4F, 1.8F);
        func_48333_ak().func_48656_a(true);
        field_46025_aM.func_46134_a(1, new EntityAIArrowAttack(this, 0.25F, 2, 20));
        field_46025_aM.func_46134_a(2, new EntityAIWander(this, 0.2F));
        field_46025_aM.func_46134_a(3, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46025_aM.func_46134_a(4, new EntityAILookIdle(this));
        field_48337_aM.func_46134_a(1, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityMob.class, 16F, 0, true));
    }

    public boolean func_46022_as()
    {
        return true;
    }

    public int func_40095_c()
    {
        return 4;
    }

    public void func_153_y()
    {
        super.func_153_y();
        if(func_27008_Y())
        {
            func_121_a(DamageSource.field_35088_e, 1);
        }
        int i = MathHelper.func_584_b(field_322_l);
        int k = MathHelper.func_584_b(field_320_n);
        if(field_9093_l.func_48091_a(i, k).func_48442_h() > 1.0F)
        {
            func_121_a(DamageSource.field_35089_b, 1);
        }
        for(int j = 0; j < 4; j++)
        {
            int l = MathHelper.func_584_b(field_322_l + (double)((float)((j % 2) * 2 - 1) * 0.25F));
            int i1 = MathHelper.func_584_b(field_321_m);
            int j1 = MathHelper.func_584_b(field_320_n + (double)((float)(((j / 2) % 2) * 2 - 1) * 0.25F));
            if(field_9093_l.func_444_a(l, i1, j1) == 0 && field_9093_l.func_48091_a(l, j1).func_48442_h() < 0.8F && Block.field_625_aT.func_259_a(field_9093_l, l, i1, j1))
            {
                field_9093_l.func_508_d(l, i1, j1, Block.field_625_aT.field_573_bc);
            }
        }

    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
    }

    protected int func_149_g()
    {
        return Item.field_251_aB.field_234_aS;
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = field_9064_W.nextInt(16);
        for(int j = 0; j < i; j++)
        {
            func_128_a(Item.field_251_aB.field_234_aS, 1);
        }

    }
}
