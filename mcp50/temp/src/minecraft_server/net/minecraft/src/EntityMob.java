// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityCreature, IMob, World, DamageSource, 
//            Potion, PotionEffect, Entity, AxisAlignedBB, 
//            MathHelper, EnumSkyBlock, NBTTagCompound

public abstract class EntityMob extends EntityCreature
    implements IMob
{

    protected int field_404_af;

    public EntityMob(World p_i174_1_)
    {
        super(p_i174_1_);
        field_404_af = 2;
        field_35192_ax = 5;
    }

    public void func_153_y()
    {
        float f = func_108_b(1.0F);
        if(f > 0.5F)
        {
            field_9132_bn += 2;
        }
        super.func_153_y();
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        if(!field_9093_l.field_792_x && field_9093_l.field_804_l == 0)
        {
            func_118_j();
        }
    }

    protected Entity func_158_i()
    {
        EntityPlayer entityplayer = field_9093_l.func_40211_b(this, 16D);
        if(entityplayer != null && func_145_g(entityplayer))
        {
            return entityplayer;
        } else
        {
            return null;
        }
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        if(super.func_121_a(p_121_1_, p_121_2_))
        {
            Entity entity = p_121_1_.func_35080_a();
            if(field_328_f == entity || field_327_g == entity)
            {
                return true;
            }
            if(entity != this)
            {
                field_389_ag = entity;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_35224_c(Entity p_35224_1_)
    {
        int i = field_404_af;
        if(func_35184_a(Potion.field_35450_g))
        {
            i += 3 << func_35187_b(Potion.field_35450_g).func_35652_c();
        }
        if(func_35184_a(Potion.field_35467_t))
        {
            i -= 2 << func_35187_b(Potion.field_35467_t).func_35652_c();
        }
        return p_35224_1_.func_121_a(DamageSource.func_35072_a(this), i);
    }

    protected void func_157_a(Entity p_157_1_, float p_157_2_)
    {
        if(field_9103_aW <= 0 && p_157_2_ < 2.0F && p_157_1_.field_312_v.field_968_e > field_312_v.field_963_b && p_157_1_.field_312_v.field_963_b < field_312_v.field_968_e)
        {
            field_9103_aW = 20;
            func_35224_c(p_157_1_);
        }
    }

    public float func_159_a(int p_159_1_, int p_159_2_, int p_159_3_)
    {
        return 0.5F - field_9093_l.func_455_j(p_159_1_, p_159_2_, p_159_3_);
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
    }

    protected boolean func_40123_y()
    {
        int i = MathHelper.func_584_b(field_322_l);
        int j = MathHelper.func_584_b(field_312_v.field_963_b);
        int k = MathHelper.func_584_b(field_320_n);
        if(field_9093_l.func_512_a(EnumSkyBlock.Sky, i, j, k) > field_9064_W.nextInt(32))
        {
            return false;
        }
        int l = field_9093_l.func_495_h(i, j, k);
        if(field_9093_l.func_27067_u())
        {
            int i1 = field_9093_l.field_811_e;
            field_9093_l.field_811_e = 10;
            l = field_9093_l.func_495_h(i, j, k);
            field_9093_l.field_811_e = i1;
        }
        return l <= field_9064_W.nextInt(8);
    }

    public boolean func_155_a()
    {
        return func_40123_y() && super.func_155_a();
    }
}
