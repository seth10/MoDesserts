// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAnimal, EntityAISwimming, EntityAITasks, EntityAIPanic, 
//            EntityAIMate, EntityAITempt, Item, EntityAIFollowParent, 
//            EntityAIWander, EntityAIWatchClosest, EntityPlayer, EntityAILookIdle, 
//            World, NBTTagCompound

public class EntityChicken extends EntityAnimal
{

    public boolean field_392_a;
    public float field_391_b;
    public float field_395_ad;
    public float field_394_ae;
    public float field_393_af;
    public float field_390_ai;
    public int field_396_aj;

    public EntityChicken(World p_i571_1_)
    {
        super(p_i571_1_);
        field_392_a = false;
        field_391_b = 0.0F;
        field_395_ad = 0.0F;
        field_390_ai = 1.0F;
        field_9119_aG = "/mob/chicken.png";
        func_113_a(0.3F, 0.7F);
        field_396_aj = field_9064_W.nextInt(6000) + 6000;
        float f = 0.25F;
        field_46025_aM.func_46134_a(0, new EntityAISwimming(this));
        field_46025_aM.func_46134_a(1, new EntityAIPanic(this, 0.38F));
        field_46025_aM.func_46134_a(2, new EntityAIMate(this, f));
        field_46025_aM.func_46134_a(3, new EntityAITempt(this, 0.25F, Item.field_186_R.field_234_aS, false));
        field_46025_aM.func_46134_a(4, new EntityAIFollowParent(this, 0.28F));
        field_46025_aM.func_46134_a(5, new EntityAIWander(this, f));
        field_46025_aM.func_46134_a(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46025_aM.func_46134_a(7, new EntityAILookIdle(this));
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
        field_393_af = field_391_b;
        field_394_ae = field_395_ad;
        field_395_ad += (double)(field_9086_A ? -1 : 4) * 0.29999999999999999D;
        if(field_395_ad < 0.0F)
        {
            field_395_ad = 0.0F;
        }
        if(field_395_ad > 1.0F)
        {
            field_395_ad = 1.0F;
        }
        if(!field_9086_A && field_390_ai < 1.0F)
        {
            field_390_ai = 1.0F;
        }
        field_390_ai *= 0.90000000000000002D;
        if(!field_9086_A && field_318_p < 0.0D)
        {
            field_318_p *= 0.59999999999999998D;
        }
        field_391_b += field_390_ai * 2.0F;
        if(!func_40104_l() && !field_9093_l.field_792_x && --field_396_aj <= 0)
        {
            field_9093_l.func_506_a(this, "mob.chickenplop", 1.0F, (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F + 1.0F);
            func_128_a(Item.field_239_aN.field_234_aS, 1);
            field_396_aj = field_9064_W.nextInt(6000) + 6000;
        }
    }

    protected void func_114_a(float f)
    {
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
        return "mob.chicken";
    }

    protected String func_6100_e()
    {
        return "mob.chickenhurt";
    }

    protected String func_6098_f()
    {
        return "mob.chickenhurt";
    }

    protected int func_149_g()
    {
        return Item.field_194_J.field_234_aS;
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = field_9064_W.nextInt(3) + field_9064_W.nextInt(1 + p_21047_2_);
        for(int j = 0; j < i; j++)
        {
            func_128_a(Item.field_194_J.field_234_aS, 1);
        }

        if(func_40035_z())
        {
            func_128_a(Item.field_35409_bj.field_234_aS, 1);
        } else
        {
            func_128_a(Item.field_35415_bi.field_234_aS, 1);
        }
    }

    public EntityAnimal func_40133_a(EntityAnimal p_40133_1_)
    {
        return new EntityChicken(field_9093_l);
    }
}
