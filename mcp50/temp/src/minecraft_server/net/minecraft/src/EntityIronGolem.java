// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityGolem, PathNavigate, EntityAIAttackOnCollide, EntityAITasks, 
//            EntityAIMoveTowardsTarget, EntityAIMoveThroughVillage, EntityAIMoveTwardsRestriction, EntityAILookAtVillager, 
//            EntityAIWander, EntityAIWatchClosest, EntityPlayer, EntityAILookIdle, 
//            EntityAIDefendVillage, EntityAIHurtByTarget, EntityAINearestAttackableTarget, EntityMob, 
//            DataWatcher, World, MathHelper, VillageCollection, 
//            Village, ChunkCoordinates, AxisAlignedBB, NBTTagCompound, 
//            DamageSource, Entity, Block, BlockFlower, 
//            Item

public class EntityIronGolem extends EntityGolem
{

    private int field_48385_b;
    Village field_48387_a;
    private int field_48386_c;
    private int field_48384_g;

    public EntityIronGolem(World p_i1008_1_)
    {
        super(p_i1008_1_);
        field_48385_b = 0;
        field_48387_a = null;
        field_9119_aG = "/mob/villager_golem.png";
        func_113_a(1.4F, 2.9F);
        func_48333_ak().func_48656_a(true);
        field_46025_aM.func_46134_a(1, new EntityAIAttackOnCollide(this, 0.25F, true));
        field_46025_aM.func_46134_a(2, new EntityAIMoveTowardsTarget(this, 0.22F, 32F));
        field_46025_aM.func_46134_a(3, new EntityAIMoveThroughVillage(this, 0.16F, true));
        field_46025_aM.func_46134_a(4, new EntityAIMoveTwardsRestriction(this, 0.16F));
        field_46025_aM.func_46134_a(5, new EntityAILookAtVillager(this));
        field_46025_aM.func_46134_a(6, new EntityAIWander(this, 0.16F));
        field_46025_aM.func_46134_a(7, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46025_aM.func_46134_a(8, new EntityAILookIdle(this));
        field_48337_aM.func_46134_a(1, new EntityAIDefendVillage(this));
        field_48337_aM.func_46134_a(2, new EntityAIHurtByTarget(this, false));
        field_48337_aM.func_46134_a(3, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityMob.class, 16F, 0, false, true));
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, Byte.valueOf((byte)0));
    }

    public boolean func_46022_as()
    {
        return true;
    }

    protected void func_48326_g()
    {
        if(--field_48385_b <= 0)
        {
            field_48385_b = 70 + field_9064_W.nextInt(50);
            field_48387_a = field_9093_l.field_48096_A.func_48632_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_321_m), MathHelper.func_584_b(field_320_n), 32);
            if(field_48387_a == null)
            {
                func_48322_aw();
            } else
            {
                ChunkCoordinates chunkcoordinates = field_48387_a.func_48526_a();
                func_48317_b(chunkcoordinates.field_22216_a, chunkcoordinates.field_529_a, chunkcoordinates.field_528_b, field_48387_a.func_48527_b());
            }
        }
        super.func_48326_g();
    }

    public int func_40095_c()
    {
        return 100;
    }

    protected int func_40094_f(int p_40094_1_)
    {
        return p_40094_1_;
    }

    public void func_153_y()
    {
        super.func_153_y();
        if(field_48386_c > 0)
        {
            field_48386_c--;
        }
        if(field_48384_g > 0)
        {
            field_48384_g--;
        }
        if(field_319_o * field_319_o + field_317_q * field_317_q > 2.5000002779052011E-07D && field_9064_W.nextInt(5) == 0)
        {
            int i = MathHelper.func_584_b(field_322_l);
            int j = MathHelper.func_584_b(field_321_m - 0.20000000298023224D - (double)field_9076_H);
            int k = MathHelper.func_584_b(field_320_n);
            int l = field_9093_l.func_444_a(i, j, k);
            if(l > 0)
            {
                field_9093_l.func_514_a((new StringBuilder()).append("tilecrack_").append(l).toString(), field_322_l + ((double)field_9064_W.nextFloat() - 0.5D) * (double)field_300_D, field_312_v.field_963_b + 0.10000000000000001D, field_320_n + ((double)field_9064_W.nextFloat() - 0.5D) * (double)field_300_D, 4D * ((double)field_9064_W.nextFloat() - 0.5D), 0.5D, ((double)field_9064_W.nextFloat() - 0.5D) * 4D);
            }
        }
    }

    public boolean func_48336_a(Class p_48336_1_)
    {
        if(func_48379_n_() && (net.minecraft.src.EntityPlayer.class).isAssignableFrom(p_48336_1_))
        {
            return false;
        } else
        {
            return super.func_48336_a(p_48336_1_);
        }
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_393_a("PlayerCreated", func_48379_n_());
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        func_48381_b(p_99_1_.func_402_l("PlayerCreated"));
    }

    public boolean func_35224_c(Entity p_35224_1_)
    {
        field_48386_c = 10;
        field_9093_l.func_9206_a(this, (byte)4);
        boolean flag = p_35224_1_.func_121_a(DamageSource.func_35072_a(this), 7 + field_9064_W.nextInt(15));
        if(flag)
        {
            p_35224_1_.field_318_p += 0.40000000596046448D;
        }
        field_9093_l.func_506_a(this, "mob.irongolem.throw", 1.0F, 1.0F);
        return flag;
    }

    public Village func_48380_l_()
    {
        return field_48387_a;
    }

    public void func_48383_a(boolean p_48383_1_)
    {
        field_48384_g = p_48383_1_ ? 400 : 0;
        field_9093_l.func_9206_a(this, (byte)11);
    }

    protected String func_6097_d()
    {
        return "none";
    }

    protected String func_6100_e()
    {
        return "mob.irongolem.hit";
    }

    protected String func_6098_f()
    {
        return "mob.irongolem.death";
    }

    protected void func_41011_a(int p_41011_1_, int p_41011_2_, int p_41011_3_, int p_41011_4_)
    {
        field_9093_l.func_506_a(this, "mob.irongolem.walk", 1.0F, 1.0F);
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = field_9064_W.nextInt(3);
        for(int j = 0; j < i; j++)
        {
            func_128_a(Block.field_4071_af.field_573_bc, 1);
        }

        int k = 3 + field_9064_W.nextInt(3);
        for(int l = 0; l < k; l++)
        {
            func_128_a(Item.field_166_m.field_234_aS, 1);
        }

    }

    public int func_48382_m_()
    {
        return field_48384_g;
    }

    public boolean func_48379_n_()
    {
        return (field_21045_af.func_21156_a(16) & 1) != 0;
    }

    public void func_48381_b(boolean p_48381_1_)
    {
        byte byte0 = field_21045_af.func_21156_a(16);
        if(p_48381_1_)
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 | 1)));
        } else
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 & -2)));
        }
    }
}
