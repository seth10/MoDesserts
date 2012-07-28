// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityTameable, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAITempt, Item, EntityAIAvoidEntity, EntityPlayer, 
//            EntityAIFollowOwner, EntityAIOcelotSit, EntityAILeapAtTarget, EntityAIOcelotAttack, 
//            EntityAIMate, EntityAIWander, EntityAIWatchClosest, EntityAITargetNonTamed, 
//            EntityChicken, DataWatcher, EntityMoveHelper, NBTTagCompound, 
//            DamageSource, Entity, EntityAISit, InventoryPlayer, 
//            ItemStack, World, MathHelper, AxisAlignedBB, 
//            Block, BlockGrass, BlockLeaves, EntityAnimal

public class EntityOcelot extends EntityTameable
{

    private EntityAITempt field_48377_b;

    public EntityOcelot(World p_i1015_1_)
    {
        super(p_i1015_1_);
        field_9119_aG = "/mob/ozelot.png";
        func_113_a(0.6F, 0.8F);
        func_48333_ak().func_48656_a(true);
        field_46025_aM.func_46134_a(1, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(2, field_48374_a);
        field_46025_aM.func_46134_a(3, field_48377_b = new EntityAITempt(this, 0.18F, Item.field_4193_aS.field_234_aS, true));
        field_46025_aM.func_46134_a(4, new EntityAIAvoidEntity(this, net.minecraft.src.EntityPlayer.class, 16F, 0.23F, 0.4F));
        field_46025_aM.func_46134_a(5, new EntityAIFollowOwner(this, 0.3F, 10F, 5F));
        field_46025_aM.func_46134_a(6, new EntityAIOcelotSit(this, 0.4F));
        field_46025_aM.func_46134_a(7, new EntityAILeapAtTarget(this, 0.3F));
        field_46025_aM.func_46134_a(8, new EntityAIOcelotAttack(this));
        field_46025_aM.func_46134_a(9, new EntityAIMate(this, 0.23F));
        field_46025_aM.func_46134_a(10, new EntityAIWander(this, 0.23F));
        field_46025_aM.func_46134_a(11, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 10F));
        field_48337_aM.func_46134_a(1, new EntityAITargetNonTamed(this, net.minecraft.src.EntityChicken.class, 14F, 750, false));
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(18, Byte.valueOf((byte)0));
    }

    public void func_48326_g()
    {
        if(!func_46012_af().func_48438_a())
        {
            func_21043_b(false);
            func_35146_g(false);
        } else
        {
            float f = func_46012_af().func_48436_b();
            if(f == 0.18F)
            {
                func_21043_b(true);
                func_35146_g(false);
            } else
            if(f == 0.4F)
            {
                func_21043_b(false);
                func_35146_g(true);
            } else
            {
                func_21043_b(false);
                func_35146_g(false);
            }
        }
    }

    protected boolean func_25020_s()
    {
        return !func_48373_u_();
    }

    public boolean func_46022_as()
    {
        return true;
    }

    public int func_40095_c()
    {
        return 10;
    }

    protected void func_114_a(float f)
    {
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_405_a("CatType", func_48375_r());
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        func_48376_c_(p_99_1_.func_395_d("CatType"));
    }

    protected String func_6097_d()
    {
        if(func_48373_u_())
        {
            if(func_48363_r_())
            {
                return "mob.cat.purr";
            }
            if(field_9064_W.nextInt(4) == 0)
            {
                return "mob.cat.purreow";
            } else
            {
                return "mob.cat.meow";
            }
        } else
        {
            return "";
        }
    }

    protected String func_6100_e()
    {
        return "mob.cat.hitt";
    }

    protected String func_6098_f()
    {
        return "mob.cat.hitt";
    }

    protected float func_6102_h()
    {
        return 0.4F;
    }

    protected int func_149_g()
    {
        return Item.field_249_aD.field_234_aS;
    }

    public boolean func_35224_c(Entity p_35224_1_)
    {
        return p_35224_1_.func_121_a(DamageSource.func_35072_a(this), 3);
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        field_48374_a.func_48210_a(false);
        return super.func_121_a(p_121_1_, p_121_2_);
    }

    protected void func_21047_g_(boolean flag, int i)
    {
    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        ItemStack itemstack = p_6092_1_.field_416_aj.func_213_b();
        if(!func_48373_u_())
        {
            if(field_48377_b.func_48261_f() && itemstack != null && itemstack.field_855_c == Item.field_4193_aS.field_234_aS && p_6092_1_.func_102_b(this) < 9D)
            {
                itemstack.field_853_a--;
                if(itemstack.field_853_a <= 0)
                {
                    p_6092_1_.field_416_aj.func_206_a(p_6092_1_.field_416_aj.field_499_d, null);
                }
                if(!field_9093_l.field_792_x)
                {
                    if(field_9064_W.nextInt(3) == 0)
                    {
                        func_48366_b(true);
                        func_48376_c_(1 + field_9093_l.field_803_m.nextInt(3));
                        func_48372_a(p_6092_1_.field_409_aq);
                        func_48370_a(true);
                        field_48374_a.func_48210_a(true);
                        field_9093_l.func_9206_a(this, (byte)7);
                    } else
                    {
                        func_48370_a(false);
                        field_9093_l.func_9206_a(this, (byte)6);
                    }
                }
            }
            return true;
        }
        if(p_6092_1_.field_409_aq.equalsIgnoreCase(func_48367_A()) && !field_9093_l.field_792_x && !func_40134_a(itemstack))
        {
            field_48374_a.func_48210_a(!func_48371_v_());
        }
        return super.func_6092_a(p_6092_1_);
    }

    public EntityAnimal func_40133_a(EntityAnimal p_40133_1_)
    {
        EntityOcelot entityocelot = new EntityOcelot(field_9093_l);
        if(func_48373_u_())
        {
            entityocelot.func_48372_a(func_48367_A());
            entityocelot.func_48366_b(true);
            entityocelot.func_48376_c_(func_48375_r());
        }
        return entityocelot;
    }

    public boolean func_40134_a(ItemStack p_40134_1_)
    {
        return p_40134_1_ != null && p_40134_1_.field_855_c == Item.field_4193_aS.field_234_aS;
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
        if(!(p_48362_1_ instanceof EntityOcelot))
        {
            return false;
        }
        EntityOcelot entityocelot = (EntityOcelot)p_48362_1_;
        if(!entityocelot.func_48373_u_())
        {
            return false;
        } else
        {
            return func_48363_r_() && entityocelot.func_48363_r_();
        }
    }

    public int func_48375_r()
    {
        return field_21045_af.func_21156_a(18);
    }

    public void func_48376_c_(int p_48376_1_)
    {
        field_21045_af.func_21155_b(18, Byte.valueOf((byte)p_48376_1_));
    }

    public boolean func_155_a()
    {
        if(field_9093_l.field_803_m.nextInt(3) == 0)
        {
            return false;
        }
        if(field_9093_l.func_522_a(field_312_v) && field_9093_l.func_481_a(this, field_312_v).size() == 0 && !field_9093_l.func_469_b(field_312_v))
        {
            int i = MathHelper.func_584_b(field_322_l);
            int j = MathHelper.func_584_b(field_312_v.field_963_b);
            int k = MathHelper.func_584_b(field_320_n);
            if(j < 63)
            {
                return false;
            }
            int l = field_9093_l.func_444_a(i, j - 1, k);
            if(l == Block.field_534_v.field_573_bc || l == Block.field_581_L.field_573_bc)
            {
                return true;
            }
        }
        return false;
    }

    public String func_35150_Y()
    {
        if(func_48373_u_())
        {
            return "entity.Cat.name";
        } else
        {
            return super.func_35150_Y();
        }
    }
}
