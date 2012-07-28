// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityWaterMob, ItemStack, Item, AxisAlignedBB, 
//            Material, World, MathHelper, NBTTagCompound, 
//            EntityPlayer

public class EntitySquid extends EntityWaterMob
{

    public float field_21063_a;
    public float field_21062_b;
    public float field_21061_c;
    public float field_21059_f;
    public float field_21060_ak;
    public float field_21058_al;
    public float field_21057_am;
    public float field_21056_an;
    private float field_21055_ao;
    private float field_21054_ap;
    private float field_21053_aq;
    private float field_21052_ar;
    private float field_21051_as;
    private float field_21050_at;

    public EntitySquid(World p_i587_1_)
    {
        super(p_i587_1_);
        field_21063_a = 0.0F;
        field_21062_b = 0.0F;
        field_21061_c = 0.0F;
        field_21059_f = 0.0F;
        field_21060_ak = 0.0F;
        field_21058_al = 0.0F;
        field_21057_am = 0.0F;
        field_21056_an = 0.0F;
        field_21055_ao = 0.0F;
        field_21054_ap = 0.0F;
        field_21053_aq = 0.0F;
        field_21052_ar = 0.0F;
        field_21051_as = 0.0F;
        field_21050_at = 0.0F;
        field_9119_aG = "/mob/squid.png";
        func_113_a(0.95F, 0.95F);
        field_21054_ap = (1.0F / (field_9064_W.nextFloat() + 1.0F)) * 0.2F;
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
        return null;
    }

    protected String func_6100_e()
    {
        return null;
    }

    protected String func_6098_f()
    {
        return null;
    }

    protected float func_6102_h()
    {
        return 0.4F;
    }

    protected int func_149_g()
    {
        return 0;
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = field_9064_W.nextInt(3 + p_21047_2_) + 1;
        for(int j = 0; j < i; j++)
        {
            func_21040_a(new ItemStack(Item.field_21097_aU, 1, 0), 0.0F);
        }

    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        return super.func_6092_a(p_6092_1_);
    }

    public boolean func_27011_Z()
    {
        return field_9093_l.func_490_a(field_312_v.func_708_b(0.0D, -0.60000002384185791D, 0.0D), Material.field_521_f, this);
    }

    public void func_153_y()
    {
        super.func_153_y();
        field_21062_b = field_21063_a;
        field_21059_f = field_21061_c;
        field_21058_al = field_21060_ak;
        field_21056_an = field_21057_am;
        field_21060_ak += field_21054_ap;
        if(field_21060_ak > 6.283185F)
        {
            field_21060_ak -= 6.283185F;
            if(field_9064_W.nextInt(10) == 0)
            {
                field_21054_ap = (1.0F / (field_9064_W.nextFloat() + 1.0F)) * 0.2F;
            }
        }
        if(func_27011_Z())
        {
            if(field_21060_ak < 3.141593F)
            {
                float f = field_21060_ak / 3.141593F;
                field_21057_am = MathHelper.func_585_a(f * f * 3.141593F) * 3.141593F * 0.25F;
                if((double)f > 0.75D)
                {
                    field_21055_ao = 1.0F;
                    field_21053_aq = 1.0F;
                } else
                {
                    field_21053_aq = field_21053_aq * 0.8F;
                }
            } else
            {
                field_21057_am = 0.0F;
                field_21055_ao = field_21055_ao * 0.9F;
                field_21053_aq = field_21053_aq * 0.99F;
            }
            if(!field_9093_l.field_792_x)
            {
                field_319_o = field_21052_ar * field_21055_ao;
                field_318_p = field_21051_as * field_21055_ao;
                field_317_q = field_21050_at * field_21055_ao;
            }
            float f1 = MathHelper.func_583_a(field_319_o * field_319_o + field_317_q * field_317_q);
            field_9095_az += ((-(float)Math.atan2(field_319_o, field_317_q) * 180F) / 3.141593F - field_9095_az) * 0.1F;
            field_316_r = field_9095_az;
            field_21061_c = field_21061_c + 3.141593F * field_21053_aq * 1.5F;
            field_21063_a += ((-(float)Math.atan2(f1, field_318_p) * 180F) / 3.141593F - field_21063_a) * 0.1F;
        } else
        {
            field_21057_am = MathHelper.func_587_e(MathHelper.func_585_a(field_21060_ak)) * 3.141593F * 0.25F;
            if(!field_9093_l.field_792_x)
            {
                field_319_o = 0.0D;
                field_318_p -= 0.080000000000000002D;
                field_318_p *= 0.98000001907348633D;
                field_317_q = 0.0D;
            }
            field_21063_a += (double)(-90F - field_21063_a) * 0.02D;
        }
    }

    public void func_148_c(float p_148_1_, float p_148_2_)
    {
        func_88_c(field_319_o, field_318_p, field_317_q);
    }

    protected void func_152_d_()
    {
        field_9132_bn++;
        if(field_9132_bn > 100)
        {
            field_21052_ar = field_21051_as = field_21050_at = 0.0F;
        } else
        if(field_9064_W.nextInt(50) == 0 || !field_9085_ab || field_21052_ar == 0.0F && field_21051_as == 0.0F && field_21050_at == 0.0F)
        {
            float f = field_9064_W.nextFloat() * 3.141593F * 2.0F;
            field_21052_ar = MathHelper.func_582_b(f) * 0.2F;
            field_21051_as = -0.1F + field_9064_W.nextFloat() * 0.2F;
            field_21050_at = MathHelper.func_585_a(f) * 0.2F;
        }
        func_27013_Q();
    }

    public boolean func_155_a()
    {
        return field_321_m > 45D && field_321_m < 63D && super.func_155_a();
    }
}
