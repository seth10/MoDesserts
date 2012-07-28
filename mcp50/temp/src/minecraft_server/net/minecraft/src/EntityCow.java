// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAnimal, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAIPanic, EntityAIMate, EntityAITempt, Item, 
//            EntityAIFollowParent, EntityAIWander, EntityAIWatchClosest, EntityPlayer, 
//            EntityAILookIdle, InventoryPlayer, ItemStack, World, 
//            NBTTagCompound

public class EntityCow extends EntityAnimal
{

    public EntityCow(World p_i53_1_)
    {
        super(p_i53_1_);
        field_9119_aG = "/mob/cow.png";
        func_113_a(0.9F, 1.3F);
        func_48333_ak().func_48656_a(true);
        field_46025_aM.func_46134_a(0, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(1, new EntityAIPanic(this, 0.38F));
        field_46025_aM.func_46134_a(2, new EntityAIMate(this, 0.2F));
        field_46025_aM.func_46134_a(3, new EntityAITempt(this, 0.25F, Item.field_186_R.field_234_aS, false));
        field_46025_aM.func_46134_a(4, new EntityAIFollowParent(this, 0.25F));
        field_46025_aM.func_46134_a(5, new EntityAIWander(this, 0.2F));
        field_46025_aM.func_46134_a(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46025_aM.func_46134_a(7, new EntityAILookIdle(this));
    }

    public boolean func_46022_as()
    {
        return true;
    }

    public int func_40095_c()
    {
        return 10;
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
    }

    protected String func_6097_d()
    {
        return "mob.cow";
    }

    protected String func_6100_e()
    {
        return "mob.cowhurt";
    }

    protected String func_6098_f()
    {
        return "mob.cowhurt";
    }

    protected float func_6102_h()
    {
        return 0.4F;
    }

    protected int func_149_g()
    {
        return Item.field_249_aD.field_234_aS;
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = field_9064_W.nextInt(3) + field_9064_W.nextInt(1 + p_21047_2_);
        for(int j = 0; j < i; j++)
        {
            func_128_a(Item.field_249_aD.field_234_aS, 1);
        }

        i = field_9064_W.nextInt(3) + 1 + field_9064_W.nextInt(1 + p_21047_2_);
        for(int k = 0; k < i; k++)
        {
            if(func_40035_z())
            {
                func_128_a(Item.field_35414_bh.field_234_aS, 1);
            } else
            {
                func_128_a(Item.field_35413_bg.field_234_aS, 1);
            }
        }

    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        ItemStack itemstack = p_6092_1_.field_416_aj.func_213_b();
        if(itemstack != null && itemstack.field_855_c == Item.field_205_au.field_234_aS)
        {
            p_6092_1_.field_416_aj.func_206_a(p_6092_1_.field_416_aj.field_499_d, new ItemStack(Item.field_4204_aE));
            return true;
        } else
        {
            return super.func_6092_a(p_6092_1_);
        }
    }

    public EntityAnimal func_40133_a(EntityAnimal p_40133_1_)
    {
        return new EntityCow(field_9093_l);
    }
}
