// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityTameable, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAILeapAtTarget, EntityAIAttackOnCollide, EntityAIFollowOwner, EntityAIMate, 
//            EntityAIWander, EntityAIBeg, EntityAIWatchClosest, EntityPlayer, 
//            EntityAILookIdle, EntityAIOwnerHurtByTarget, EntityAIOwnerHurtTarget, EntityAIHurtByTarget, 
//            EntityAITargetNonTamed, EntitySheep, DataWatcher, NBTTagCompound, 
//            World, AxisAlignedBB, MathHelper, DamageSource, 
//            EntityAISit, EntityArrow, Entity, InventoryPlayer, 
//            ItemStack, Item, PlayerCapabilities, ItemFood, 
//            EntityLiving, EntityAnimal

public class EntityWolf extends EntityTameable
{

    private boolean field_25039_a;
    private float field_25038_b;
    private float field_25044_c;
    private boolean field_25043_f;
    private boolean field_25042_g;
    private float field_25041_h;
    private float field_25040_i;

    public EntityWolf(World p_i164_1_)
    {
        super(p_i164_1_);
        field_25039_a = false;
        field_9119_aG = "/mob/wolf.png";
        func_113_a(0.6F, 0.8F);
        field_9126_bt = 0.3F;
        func_48333_ak().func_48656_a(true);
        field_46025_aM.func_46134_a(1, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(2, field_48374_a);
        field_46025_aM.func_46134_a(3, new EntityAILeapAtTarget(this, 0.4F));
        field_46025_aM.func_46134_a(4, new EntityAIAttackOnCollide(this, field_9126_bt, true));
        field_46025_aM.func_46134_a(5, new EntityAIFollowOwner(this, field_9126_bt, 10F, 2.0F));
        field_46025_aM.func_46134_a(6, new EntityAIMate(this, field_9126_bt));
        field_46025_aM.func_46134_a(7, new EntityAIWander(this, field_9126_bt));
        field_46025_aM.func_46134_a(8, new EntityAIBeg(this, 8F));
        field_46025_aM.func_46134_a(9, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
        field_46025_aM.func_46134_a(9, new EntityAILookIdle(this));
        field_48337_aM.func_46134_a(1, new EntityAIOwnerHurtByTarget(this));
        field_48337_aM.func_46134_a(2, new EntityAIOwnerHurtTarget(this));
        field_48337_aM.func_46134_a(3, new EntityAIHurtByTarget(this, true));
        field_48337_aM.func_46134_a(4, new EntityAITargetNonTamed(this, net.minecraft.src.EntitySheep.class, 16F, 200, false));
    }

    public boolean func_46022_as()
    {
        return true;
    }

    public void func_48327_b(EntityLiving p_48327_1_)
    {
        super.func_48327_b(p_48327_1_);
        if(p_48327_1_ instanceof EntityPlayer)
        {
            func_25037_c(true);
        }
    }

    protected void func_48326_g()
    {
        field_21045_af.func_21155_b(18, Integer.valueOf(func_40097_ai()));
    }

    public int func_40095_c()
    {
        return !func_48373_u_() ? 8 : 20;
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(18, new Integer(func_40097_ai()));
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_393_a("Angry", func_25028_x());
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        func_25037_c(p_99_1_.func_402_l("Angry"));
    }

    protected boolean func_25020_s()
    {
        return func_25028_x();
    }

    protected String func_6097_d()
    {
        if(func_25028_x())
        {
            return "mob.wolf.growl";
        }
        if(field_9064_W.nextInt(3) == 0)
        {
            if(func_48373_u_() && field_21045_af.func_25075_b(18) < 10)
            {
                return "mob.wolf.whine";
            } else
            {
                return "mob.wolf.panting";
            }
        } else
        {
            return "mob.wolf.bark";
        }
    }

    protected String func_6100_e()
    {
        return "mob.wolf.hurt";
    }

    protected String func_6098_f()
    {
        return "mob.wolf.death";
    }

    protected float func_6102_h()
    {
        return 0.4F;
    }

    protected int func_149_g()
    {
        return -1;
    }

    public void func_153_y()
    {
        super.func_153_y();
        if(!field_9093_l.field_792_x && field_25043_f && !field_25042_g && !func_25023_z() && field_9086_A)
        {
            field_25042_g = true;
            field_25041_h = 0.0F;
            field_25040_i = 0.0F;
            field_9093_l.func_9206_a(this, (byte)8);
        }
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        field_25044_c = field_25038_b;
        if(field_25039_a)
        {
            field_25038_b = field_25038_b + (1.0F - field_25038_b) * 0.4F;
        } else
        {
            field_25038_b = field_25038_b + (0.0F - field_25038_b) * 0.4F;
        }
        if(field_25039_a)
        {
            field_4104_c = 10;
        }
        if(func_27008_Y())
        {
            field_25043_f = true;
            field_25042_g = false;
            field_25041_h = 0.0F;
            field_25040_i = 0.0F;
        } else
        if((field_25043_f || field_25042_g) && field_25042_g)
        {
            if(field_25041_h == 0.0F)
            {
                field_9093_l.func_506_a(this, "mob.wolf.shake", func_6102_h(), (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F + 1.0F);
            }
            field_25040_i = field_25041_h;
            field_25041_h += 0.05F;
            if(field_25040_i >= 2.0F)
            {
                field_25043_f = false;
                field_25042_g = false;
                field_25040_i = 0.0F;
                field_25041_h = 0.0F;
            }
            if(field_25041_h > 0.4F)
            {
                float f = (float)field_312_v.field_963_b;
                int i = (int)(MathHelper.func_585_a((field_25041_h - 0.4F) * 3.141593F) * 7F);
                for(int j = 0; j < i; j++)
                {
                    float f1 = (field_9064_W.nextFloat() * 2.0F - 1.0F) * field_300_D * 0.5F;
                    float f2 = (field_9064_W.nextFloat() * 2.0F - 1.0F) * field_300_D * 0.5F;
                    field_9093_l.func_514_a("splash", field_322_l + (double)f1, f + 0.8F, field_320_n + (double)f2, field_319_o, field_318_p, field_317_q);
                }

            }
        }
    }

    public float func_104_p()
    {
        return field_298_E * 0.8F;
    }

    public int func_25018_n_()
    {
        if(func_48371_v_())
        {
            return 20;
        } else
        {
            return super.func_25018_n_();
        }
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        Entity entity = p_121_1_.func_35080_a();
        field_48374_a.func_48210_a(false);
        if(entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow))
        {
            p_121_2_ = (p_121_2_ + 1) / 2;
        }
        return super.func_121_a(p_121_1_, p_121_2_);
    }

    public boolean func_35224_c(Entity p_35224_1_)
    {
        byte byte0 = ((byte)(func_48373_u_() ? 4 : 2));
        return p_35224_1_.func_121_a(DamageSource.func_35072_a(this), byte0);
    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        ItemStack itemstack = p_6092_1_.field_416_aj.func_213_b();
        if(!func_48373_u_())
        {
            if(itemstack != null && itemstack.field_855_c == Item.field_21096_aV.field_234_aS && !func_25028_x())
            {
                if(!p_6092_1_.field_35214_K.field_35657_d)
                {
                    itemstack.field_853_a--;
                }
                if(itemstack.field_853_a <= 0)
                {
                    p_6092_1_.field_416_aj.func_206_a(p_6092_1_.field_416_aj.field_499_d, null);
                }
                if(!field_9093_l.field_792_x)
                {
                    if(field_9064_W.nextInt(3) == 0)
                    {
                        func_48366_b(true);
                        func_25022_a(null);
                        func_48327_b(null);
                        field_48374_a.func_48210_a(true);
                        func_40103_i(20);
                        func_48372_a(p_6092_1_.field_409_aq);
                        func_48370_a(true);
                        field_9093_l.func_9206_a(this, (byte)7);
                    } else
                    {
                        func_48370_a(false);
                        field_9093_l.func_9206_a(this, (byte)6);
                    }
                }
                return true;
            }
        } else
        {
            if(itemstack != null && (Item.field_176_c[itemstack.field_855_c] instanceof ItemFood))
            {
                ItemFood itemfood = (ItemFood)Item.field_176_c[itemstack.field_855_c];
                if(itemfood.func_25010_k() && field_21045_af.func_25075_b(18) < 20)
                {
                    if(!p_6092_1_.field_35214_K.field_35657_d)
                    {
                        itemstack.field_853_a--;
                    }
                    func_137_a(itemfood.func_25009_j());
                    if(itemstack.field_853_a <= 0)
                    {
                        p_6092_1_.field_416_aj.func_206_a(p_6092_1_.field_416_aj.field_499_d, null);
                    }
                    return true;
                }
            }
            if(p_6092_1_.field_409_aq.equalsIgnoreCase(func_48367_A()) && !field_9093_l.field_792_x && !func_40134_a(itemstack))
            {
                field_48374_a.func_48210_a(!func_48371_v_());
                field_9128_br = false;
                func_25022_a(null);
            }
        }
        return super.func_6092_a(p_6092_1_);
    }

    public boolean func_40134_a(ItemStack p_40134_1_)
    {
        if(p_40134_1_ == null)
        {
            return false;
        }
        if(!(Item.field_176_c[p_40134_1_.field_855_c] instanceof ItemFood))
        {
            return false;
        } else
        {
            return ((ItemFood)Item.field_176_c[p_40134_1_.field_855_c]).func_25010_k();
        }
    }

    public int func_4045_i()
    {
        return 8;
    }

    public boolean func_25028_x()
    {
        return (field_21045_af.func_21156_a(16) & 2) != 0;
    }

    public void func_25037_c(boolean p_25037_1_)
    {
        byte byte0 = field_21045_af.func_21156_a(16);
        if(p_25037_1_)
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 | 2)));
        } else
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 & -3)));
        }
    }

    public EntityAnimal func_40133_a(EntityAnimal p_40133_1_)
    {
        EntityWolf entitywolf = new EntityWolf(field_9093_l);
        entitywolf.func_48372_a(func_48367_A());
        entitywolf.func_48366_b(true);
        return entitywolf;
    }

    public void func_48378_e(boolean p_48378_1_)
    {
        field_25039_a = p_48378_1_;
    }

    public boolean func_48362_b(EntityAnimal p_48362_1_)
    {
        if(p_48362_1_ == this)
        {
            return false;
        }
        if(!func_48373_u_())
        {
            return false;
        }
        if(!(p_48362_1_ instanceof EntityWolf))
        {
            return false;
        }
        EntityWolf entitywolf = (EntityWolf)p_48362_1_;
        if(!entitywolf.func_48373_u_())
        {
            return false;
        }
        if(entitywolf.func_48371_v_())
        {
            return false;
        } else
        {
            return func_48363_r_() && entitywolf.func_48363_r_();
        }
    }
}
