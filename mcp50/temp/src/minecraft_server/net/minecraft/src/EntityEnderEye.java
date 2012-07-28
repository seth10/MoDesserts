// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, World, EntityItem, 
//            ItemStack, Item, NBTTagCompound, EntityPlayer

public class EntityEnderEye extends Entity
{

    public int field_40062_a;
    private double field_40060_b;
    private double field_40061_c;
    private double field_40058_d;
    private int field_40059_e;
    private boolean field_40057_f;

    public EntityEnderEye(World p_i63_1_)
    {
        super(p_i63_1_);
        field_40062_a = 0;
        func_113_a(0.25F, 0.25F);
    }

    protected void func_21044_a()
    {
    }

    public EntityEnderEye(World p_i64_1_, double p_i64_2_, double p_i64_4_, double p_i64_6_)
    {
        super(p_i64_1_);
        field_40062_a = 0;
        field_40059_e = 0;
        func_113_a(0.25F, 0.25F);
        func_86_a(p_i64_2_, p_i64_4_, p_i64_6_);
        field_9076_H = 0.0F;
    }

    public void func_40056_a(double p_40056_1_, int p_40056_3_, double p_40056_4_)
    {
        double d = p_40056_1_ - field_322_l;
        double d1 = p_40056_4_ - field_320_n;
        float f = MathHelper.func_583_a(d * d + d1 * d1);
        if(f > 12F)
        {
            field_40060_b = field_322_l + (d / (double)f) * 12D;
            field_40058_d = field_320_n + (d1 / (double)f) * 12D;
            field_40061_c = field_321_m + 8D;
        } else
        {
            field_40060_b = p_40056_1_;
            field_40061_c = p_40056_3_;
            field_40058_d = p_40056_4_;
        }
        field_40059_e = 0;
        field_40057_f = field_9064_W.nextInt(5) > 0;
    }

    public void func_106_b_()
    {
        field_9071_O = field_322_l;
        field_9070_P = field_321_m;
        field_9069_Q = field_320_n;
        super.func_106_b_();
        field_322_l += field_319_o;
        field_321_m += field_318_p;
        field_320_n += field_317_q;
        float f = MathHelper.func_583_a(field_319_o * field_319_o + field_317_q * field_317_q);
        field_316_r = (float)((Math.atan2(field_319_o, field_317_q) * 180D) / 3.1415927410125732D);
        for(field_315_s = (float)((Math.atan2(field_318_p, f) * 180D) / 3.1415927410125732D); field_315_s - field_9088_y < -180F; field_9088_y -= 360F) { }
        for(; field_315_s - field_9088_y >= 180F; field_9088_y += 360F) { }
        for(; field_316_r - field_9089_x < -180F; field_9089_x -= 360F) { }
        for(; field_316_r - field_9089_x >= 180F; field_9089_x += 360F) { }
        field_315_s = field_9088_y + (field_315_s - field_9088_y) * 0.2F;
        field_316_r = field_9089_x + (field_316_r - field_9089_x) * 0.2F;
        if(!field_9093_l.field_792_x)
        {
            double d = field_40060_b - field_322_l;
            double d1 = field_40058_d - field_320_n;
            float f2 = (float)Math.sqrt(d * d + d1 * d1);
            float f3 = (float)Math.atan2(d1, d);
            double d2 = (double)f + (double)(f2 - f) * 0.0025000000000000001D;
            if(f2 < 1.0F)
            {
                d2 *= 0.80000000000000004D;
                field_318_p *= 0.80000000000000004D;
            }
            field_319_o = Math.cos(f3) * d2;
            field_317_q = Math.sin(f3) * d2;
            if(field_321_m < field_40061_c)
            {
                field_318_p = field_318_p + (1.0D - field_318_p) * 0.014999999664723873D;
            } else
            {
                field_318_p = field_318_p + (-1D - field_318_p) * 0.014999999664723873D;
            }
        }
        float f1 = 0.25F;
        if(func_27011_Z())
        {
            for(int i = 0; i < 4; i++)
            {
                field_9093_l.func_514_a("bubble", field_322_l - field_319_o * (double)f1, field_321_m - field_318_p * (double)f1, field_320_n - field_317_q * (double)f1, field_319_o, field_318_p, field_317_q);
            }

        } else
        {
            field_9093_l.func_514_a("portal", ((field_322_l - field_319_o * (double)f1) + field_9064_W.nextDouble() * 0.59999999999999998D) - 0.29999999999999999D, field_321_m - field_318_p * (double)f1 - 0.5D, ((field_320_n - field_317_q * (double)f1) + field_9064_W.nextDouble() * 0.59999999999999998D) - 0.29999999999999999D, field_319_o, field_318_p, field_317_q);
        }
        if(!field_9093_l.field_792_x)
        {
            func_86_a(field_322_l, field_321_m, field_320_n);
            field_40059_e++;
            if(field_40059_e > 80 && !field_9093_l.field_792_x)
            {
                func_118_j();
                if(field_40057_f)
                {
                    field_9093_l.func_526_a(new EntityItem(field_9093_l, field_322_l, field_321_m, field_320_n, new ItemStack(Item.field_40229_by)));
                } else
                {
                    field_9093_l.func_28097_e(2003, (int)Math.round(field_322_l), (int)Math.round(field_321_m), (int)Math.round(field_320_n), 0);
                }
            }
        }
    }

    public void func_97_a(NBTTagCompound nbttagcompound)
    {
    }

    public void func_99_b(NBTTagCompound nbttagcompound)
    {
    }

    public void func_6093_b(EntityPlayer entityplayer)
    {
    }

    public float func_108_b(float p_108_1_)
    {
        return 1.0F;
    }

    public boolean func_48313_k_()
    {
        return false;
    }
}
