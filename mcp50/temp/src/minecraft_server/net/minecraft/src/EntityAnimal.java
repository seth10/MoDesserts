// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAgeable, IAnimals, World, EntityPlayer, 
//            Entity, Block, BlockGrass, NBTTagCompound, 
//            AxisAlignedBB, MathHelper, ItemStack, Item, 
//            InventoryPlayer, PlayerCapabilities, DamageSource

public abstract class EntityAnimal extends EntityAgeable
    implements IAnimals
{

    private int field_39000_a;
    private int field_39001_b;

    public EntityAnimal(World p_i34_1_)
    {
        super(p_i34_1_);
        field_39001_b = 0;
    }

    protected void func_48326_g()
    {
        if(func_48351_J() != 0)
        {
            field_39000_a = 0;
        }
        super.func_48326_g();
    }

    public void func_153_y()
    {
        super.func_153_y();
        if(func_48351_J() != 0)
        {
            field_39000_a = 0;
        }
        if(field_39000_a > 0)
        {
            field_39000_a--;
            String s = "heart";
            if(field_39000_a % 10 == 0)
            {
                double d = field_9064_W.nextGaussian() * 0.02D;
                double d1 = field_9064_W.nextGaussian() * 0.02D;
                double d2 = field_9064_W.nextGaussian() * 0.02D;
                field_9093_l.func_514_a(s, (field_322_l + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, field_321_m + 0.5D + (double)(field_9064_W.nextFloat() * field_298_E), (field_320_n + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, d, d1, d2);
            }
        } else
        {
            field_39001_b = 0;
        }
    }

    protected void func_157_a(Entity p_157_1_, float p_157_2_)
    {
        if(p_157_1_ instanceof EntityPlayer)
        {
            if(p_157_2_ < 3F)
            {
                double d = p_157_1_.field_322_l - field_322_l;
                double d1 = p_157_1_.field_320_n - field_320_n;
                field_316_r = (float)((Math.atan2(d1, d) * 180D) / 3.1415927410125732D) - 90F;
                field_387_ah = true;
            }
            EntityPlayer entityplayer = (EntityPlayer)p_157_1_;
            if(entityplayer.func_172_B() == null || !func_40134_a(entityplayer.func_172_B()))
            {
                field_389_ag = null;
            }
        } else
        if(p_157_1_ instanceof EntityAnimal)
        {
            EntityAnimal entityanimal = (EntityAnimal)p_157_1_;
            if(func_48351_J() > 0 && entityanimal.func_48351_J() < 0)
            {
                if((double)p_157_2_ < 2.5D)
                {
                    field_387_ah = true;
                }
            } else
            if(field_39000_a > 0 && entityanimal.field_39000_a > 0)
            {
                if(entityanimal.field_389_ag == null)
                {
                    entityanimal.field_389_ag = this;
                }
                if(entityanimal.field_389_ag == this && (double)p_157_2_ < 3.5D)
                {
                    entityanimal.field_39000_a++;
                    field_39000_a++;
                    field_39001_b++;
                    if(field_39001_b % 4 == 0)
                    {
                        field_9093_l.func_514_a("heart", (field_322_l + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, field_321_m + 0.5D + (double)(field_9064_W.nextFloat() * field_298_E), (field_320_n + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, 0.0D, 0.0D, 0.0D);
                    }
                    if(field_39001_b == 60)
                    {
                        func_40131_b((EntityAnimal)p_157_1_);
                    }
                } else
                {
                    field_39001_b = 0;
                }
            } else
            {
                field_39001_b = 0;
                field_389_ag = null;
            }
        }
    }

    private void func_40131_b(EntityAnimal p_40131_1_)
    {
        EntityAnimal entityanimal = func_40133_a(p_40131_1_);
        if(entityanimal != null)
        {
            func_48350_c(6000);
            p_40131_1_.func_48350_c(6000);
            field_39000_a = 0;
            field_39001_b = 0;
            field_389_ag = null;
            p_40131_1_.field_389_ag = null;
            p_40131_1_.field_39001_b = 0;
            p_40131_1_.field_39000_a = 0;
            entityanimal.func_48350_c(-24000);
            entityanimal.func_107_c(field_322_l, field_321_m, field_320_n, field_316_r, field_315_s);
            for(int i = 0; i < 7; i++)
            {
                double d = field_9064_W.nextGaussian() * 0.02D;
                double d1 = field_9064_W.nextGaussian() * 0.02D;
                double d2 = field_9064_W.nextGaussian() * 0.02D;
                field_9093_l.func_514_a("heart", (field_322_l + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, field_321_m + 0.5D + (double)(field_9064_W.nextFloat() * field_298_E), (field_320_n + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, d, d1, d2);
            }

            field_9093_l.func_526_a(entityanimal);
        }
    }

    public abstract EntityAnimal func_40133_a(EntityAnimal entityanimal);

    protected void func_28013_b(Entity entity, float f)
    {
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        field_35223_f = 60;
        field_389_ag = null;
        field_39000_a = 0;
        return super.func_121_a(p_121_1_, p_121_2_);
    }

    public float func_159_a(int p_159_1_, int p_159_2_, int p_159_3_)
    {
        if(field_9093_l.func_444_a(p_159_1_, p_159_2_ - 1, p_159_3_) == Block.field_534_v.field_573_bc)
        {
            return 10F;
        } else
        {
            return field_9093_l.func_455_j(p_159_1_, p_159_2_, p_159_3_) - 0.5F;
        }
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_405_a("InLove", field_39000_a);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        field_39000_a = p_99_1_.func_395_d("InLove");
    }

    protected Entity func_158_i()
    {
        if(field_35223_f > 0)
        {
            return null;
        }
        float f = 8F;
        if(field_39000_a > 0)
        {
            List list = field_9093_l.func_457_a(getClass(), field_312_v.func_708_b(f, f, f));
            for(int i = 0; i < list.size(); i++)
            {
                EntityAnimal entityanimal = (EntityAnimal)list.get(i);
                if(entityanimal != this && entityanimal.field_39000_a > 0)
                {
                    return entityanimal;
                }
            }

        } else
        if(func_48351_J() == 0)
        {
            List list1 = field_9093_l.func_457_a(net.minecraft.src.EntityPlayer.class, field_312_v.func_708_b(f, f, f));
            for(int j = 0; j < list1.size(); j++)
            {
                EntityPlayer entityplayer = (EntityPlayer)list1.get(j);
                if(entityplayer.func_172_B() != null && func_40134_a(entityplayer.func_172_B()))
                {
                    return entityplayer;
                }
            }

        } else
        if(func_48351_J() > 0)
        {
            List list2 = field_9093_l.func_457_a(getClass(), field_312_v.func_708_b(f, f, f));
            for(int k = 0; k < list2.size(); k++)
            {
                EntityAnimal entityanimal1 = (EntityAnimal)list2.get(k);
                if(entityanimal1 != this && entityanimal1.func_48351_J() < 0)
                {
                    return entityanimal1;
                }
            }

        }
        return null;
    }

    public boolean func_155_a()
    {
        int i = MathHelper.func_584_b(field_322_l);
        int j = MathHelper.func_584_b(field_312_v.field_963_b);
        int k = MathHelper.func_584_b(field_320_n);
        return field_9093_l.func_444_a(i, j - 1, k) == Block.field_534_v.field_573_bc && field_9093_l.func_28098_j(i, j, k) > 8 && super.func_155_a();
    }

    public int func_146_b()
    {
        return 120;
    }

    protected boolean func_25020_s()
    {
        return false;
    }

    protected int func_36000_a(EntityPlayer p_36000_1_)
    {
        return 1 + field_9093_l.field_803_m.nextInt(3);
    }

    public boolean func_40134_a(ItemStack p_40134_1_)
    {
        return p_40134_1_.field_855_c == Item.field_186_R.field_234_aS;
    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        ItemStack itemstack = p_6092_1_.field_416_aj.func_213_b();
        if(itemstack != null && func_40134_a(itemstack) && func_48351_J() == 0)
        {
            if(!p_6092_1_.field_35214_K.field_35657_d)
            {
                itemstack.field_853_a--;
                if(itemstack.field_853_a <= 0)
                {
                    p_6092_1_.field_416_aj.func_206_a(p_6092_1_.field_416_aj.field_499_d, null);
                }
            }
            field_39000_a = 600;
            field_389_ag = null;
            for(int i = 0; i < 7; i++)
            {
                double d = field_9064_W.nextGaussian() * 0.02D;
                double d1 = field_9064_W.nextGaussian() * 0.02D;
                double d2 = field_9064_W.nextGaussian() * 0.02D;
                field_9093_l.func_514_a("heart", (field_322_l + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, field_321_m + 0.5D + (double)(field_9064_W.nextFloat() * field_298_E), (field_320_n + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, d, d1, d2);
            }

            return true;
        } else
        {
            return super.func_6092_a(p_6092_1_);
        }
    }

    public boolean func_48363_r_()
    {
        return field_39000_a > 0;
    }

    public void func_48364_s_()
    {
        field_39000_a = 0;
    }

    public boolean func_48362_b(EntityAnimal p_48362_1_)
    {
        if(p_48362_1_ == this)
        {
            return false;
        }
        if(p_48362_1_.getClass() != getClass())
        {
            return false;
        } else
        {
            return func_48363_r_() && p_48362_1_.func_48363_r_();
        }
    }
}
