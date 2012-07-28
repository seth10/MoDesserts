// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAnimal, EntityAIEatGrass, PathNavigate, EntityAISwimming, 
//            EntityAITasks, EntityAIPanic, EntityAIMate, EntityAITempt, 
//            Item, EntityAIFollowParent, EntityAIWander, EntityAIWatchClosest, 
//            EntityPlayer, EntityAILookIdle, World, DataWatcher, 
//            ItemStack, Block, InventoryPlayer, ItemShears, 
//            EntityItem, NBTTagCompound

public class EntitySheep extends EntityAnimal
{

    public static final float field_21071_a[][] = {
        {
            1.0F, 1.0F, 1.0F
        }, {
            0.95F, 0.7F, 0.2F
        }, {
            0.9F, 0.5F, 0.85F
        }, {
            0.6F, 0.7F, 0.95F
        }, {
            0.9F, 0.9F, 0.2F
        }, {
            0.5F, 0.8F, 0.1F
        }, {
            0.95F, 0.7F, 0.8F
        }, {
            0.3F, 0.3F, 0.3F
        }, {
            0.6F, 0.6F, 0.6F
        }, {
            0.3F, 0.6F, 0.7F
        }, {
            0.7F, 0.4F, 0.9F
        }, {
            0.2F, 0.4F, 0.8F
        }, {
            0.5F, 0.4F, 0.3F
        }, {
            0.4F, 0.5F, 0.2F
        }, {
            0.8F, 0.3F, 0.3F
        }, {
            0.1F, 0.1F, 0.1F
        }
    };
    private int field_44007_b;
    private EntityAIEatGrass field_48365_c;

    public EntitySheep(World p_i91_1_)
    {
        super(p_i91_1_);
        field_48365_c = new EntityAIEatGrass(this);
        field_9119_aG = "/mob/sheep.png";
        func_113_a(0.9F, 1.3F);
        float f = 0.23F;
        func_48333_ak().func_48656_a(true);
        field_46025_aM.func_46134_a(0, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(1, new EntityAIPanic(this, 0.38F));
        field_46025_aM.func_46134_a(2, new EntityAIMate(this, f));
        field_46025_aM.func_46134_a(3, new EntityAITempt(this, 0.25F, Item.field_186_R.field_234_aS, false));
        field_46025_aM.func_46134_a(4, new EntityAIFollowParent(this, 0.25F));
        field_46025_aM.func_46134_a(5, field_48365_c);
        field_46025_aM.func_46134_a(6, new EntityAIWander(this, f));
        field_46025_aM.func_46134_a(7, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46025_aM.func_46134_a(8, new EntityAILookIdle(this));
    }

    protected boolean func_46022_as()
    {
        return true;
    }

    protected void func_46015_av()
    {
        field_44007_b = field_48365_c.func_48227_f();
        super.func_46015_av();
    }

    public void func_153_y()
    {
        if(field_9093_l.field_792_x)
        {
            field_44007_b = Math.max(0, field_44007_b - 1);
        }
        super.func_153_y();
    }

    public int func_40095_c()
    {
        return 8;
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, new Byte((byte)0));
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        if(!func_21069_f_())
        {
            func_21040_a(new ItemStack(Block.field_616_ac.field_573_bc, 1, func_21068_e_()), 0.0F);
        }
    }

    protected int func_149_g()
    {
        return Block.field_616_ac.field_573_bc;
    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        ItemStack itemstack = p_6092_1_.field_416_aj.func_213_b();
        if(itemstack != null && itemstack.field_855_c == Item.field_31022_bc.field_234_aS && !func_21069_f_() && !func_40104_l())
        {
            if(!field_9093_l.field_792_x)
            {
                func_21067_a(true);
                int i = 1 + field_9064_W.nextInt(3);
                for(int j = 0; j < i; j++)
                {
                    EntityItem entityitem = func_21040_a(new ItemStack(Block.field_616_ac.field_573_bc, 1, func_21068_e_()), 1.0F);
                    entityitem.field_318_p += field_9064_W.nextFloat() * 0.05F;
                    entityitem.field_319_o += (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.1F;
                    entityitem.field_317_q += (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.1F;
                }

            }
            itemstack.func_25125_a(1, p_6092_1_);
        }
        return super.func_6092_a(p_6092_1_);
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_393_a("Sheared", func_21069_f_());
        p_97_1_.func_409_a("Color", (byte)func_21068_e_());
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        func_21067_a(p_99_1_.func_402_l("Sheared"));
        func_21070_a(p_99_1_.func_408_b("Color"));
    }

    protected String func_6097_d()
    {
        return "mob.sheep";
    }

    protected String func_6100_e()
    {
        return "mob.sheep";
    }

    protected String func_6098_f()
    {
        return "mob.sheep";
    }

    public int func_21068_e_()
    {
        return field_21045_af.func_21156_a(16) & 0xf;
    }

    public void func_21070_a(int p_21070_1_)
    {
        byte byte0 = field_21045_af.func_21156_a(16);
        field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 & 0xf0 | p_21070_1_ & 0xf)));
    }

    public boolean func_21069_f_()
    {
        return (field_21045_af.func_21156_a(16) & 0x10) != 0;
    }

    public void func_21067_a(boolean p_21067_1_)
    {
        byte byte0 = field_21045_af.func_21156_a(16);
        if(p_21067_1_)
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 | 0x10)));
        } else
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 & 0xffffffef)));
        }
    }

    public static int func_21066_a(Random p_21066_0_)
    {
        int i = p_21066_0_.nextInt(100);
        if(i < 5)
        {
            return 15;
        }
        if(i < 10)
        {
            return 7;
        }
        if(i < 15)
        {
            return 8;
        }
        if(i < 18)
        {
            return 12;
        }
        return p_21066_0_.nextInt(500) != 0 ? 0 : 6;
    }

    public EntityAnimal func_40133_a(EntityAnimal p_40133_1_)
    {
        EntitySheep entitysheep = (EntitySheep)p_40133_1_;
        EntitySheep entitysheep1 = new EntitySheep(field_9093_l);
        if(field_9064_W.nextBoolean())
        {
            entitysheep1.func_21070_a(func_21068_e_());
        } else
        {
            entitysheep1.func_21070_a(entitysheep.func_21068_e_());
        }
        return entitysheep1;
    }

    public void func_48319_z()
    {
        func_21067_a(false);
        if(func_40104_l())
        {
            int i = func_48351_J() + 1200;
            if(i > 0)
            {
                i = 0;
            }
            func_48350_c(i);
        }
    }

}
