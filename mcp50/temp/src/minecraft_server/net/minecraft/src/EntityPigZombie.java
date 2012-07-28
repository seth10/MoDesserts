// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityZombie, World, NBTTagCompound, DamageSource, 
//            EntityPlayer, AxisAlignedBB, Entity, Item, 
//            ItemStack, EnchantmentHelper

public class EntityPigZombie extends EntityZombie
{

    private int field_4106_a;
    private int field_4105_b;
    private static final ItemStack field_4107_c;

    public EntityPigZombie(World p_i593_1_)
    {
        super(p_i593_1_);
        field_4106_a = 0;
        field_4105_b = 0;
        field_9119_aG = "/mob/pigzombie.png";
        field_9126_bt = 0.5F;
        field_404_af = 5;
        field_9079_ae = true;
    }

    protected boolean func_46022_as()
    {
        return false;
    }

    public void func_106_b_()
    {
        field_9126_bt = field_389_ag == null ? 0.5F : 0.95F;
        if(field_4105_b > 0 && --field_4105_b == 0)
        {
            field_9093_l.func_506_a(this, "mob.zombiepig.zpigangry", func_6102_h() * 2.0F, ((field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F + 1.0F) * 1.8F);
        }
        super.func_106_b_();
    }

    public boolean func_155_a()
    {
        return field_9093_l.field_804_l > 0 && field_9093_l.func_522_a(field_312_v) && field_9093_l.func_481_a(this, field_312_v).size() == 0 && !field_9093_l.func_469_b(field_312_v);
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_394_a("Anger", (short)field_4106_a);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        field_4106_a = p_99_1_.func_406_c("Anger");
    }

    protected Entity func_158_i()
    {
        if(field_4106_a == 0)
        {
            return null;
        } else
        {
            return super.func_158_i();
        }
    }

    public void func_153_y()
    {
        super.func_153_y();
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        Entity entity = p_121_1_.func_35080_a();
        if(entity instanceof EntityPlayer)
        {
            List list = field_9093_l.func_450_b(this, field_312_v.func_708_b(32D, 32D, 32D));
            for(int i = 0; i < list.size(); i++)
            {
                Entity entity1 = (Entity)list.get(i);
                if(entity1 instanceof EntityPigZombie)
                {
                    EntityPigZombie entitypigzombie = (EntityPigZombie)entity1;
                    entitypigzombie.func_4047_h(entity);
                }
            }

            func_4047_h(entity);
        }
        return super.func_121_a(p_121_1_, p_121_2_);
    }

    private void func_4047_h(Entity p_4047_1_)
    {
        field_389_ag = p_4047_1_;
        field_4106_a = 400 + field_9064_W.nextInt(400);
        field_4105_b = field_9064_W.nextInt(40);
    }

    protected String func_6097_d()
    {
        return "mob.zombiepig.zpig";
    }

    protected String func_6100_e()
    {
        return "mob.zombiepig.zpighurt";
    }

    protected String func_6098_f()
    {
        return "mob.zombiepig.zpigdeath";
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = field_9064_W.nextInt(2 + p_21047_2_);
        for(int j = 0; j < i; j++)
        {
            func_128_a(Item.field_35410_bk.field_234_aS, 1);
        }

        i = field_9064_W.nextInt(2 + p_21047_2_);
        for(int k = 0; k < i; k++)
        {
            func_128_a(Item.field_40236_bo.field_234_aS, 1);
        }

    }

    protected void func_48321_b(int p_48321_1_)
    {
        if(p_48321_1_ > 0)
        {
            ItemStack itemstack = new ItemStack(Item.field_4171_E);
            EnchantmentHelper.func_48622_a(field_9064_W, itemstack, 5);
            func_21040_a(itemstack, 0.0F);
        } else
        {
            int i = field_9064_W.nextInt(3);
            if(i == 0)
            {
                func_128_a(Item.field_4147_n.field_234_aS, 1);
            } else
            if(i == 1)
            {
                func_128_a(Item.field_4171_E.field_234_aS, 1);
            } else
            if(i == 2)
            {
                func_128_a(Item.field_4180_aj.field_234_aS, 1);
            }
        }
    }

    protected int func_149_g()
    {
        return Item.field_35410_bk.field_234_aS;
    }

    static 
    {
        field_4107_c = new ItemStack(Item.field_4171_E, 1);
    }
}
