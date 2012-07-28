// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, World, Material, 
//            AxisAlignedBB, EntityPlayer, Block, DamageSource, 
//            NBTTagCompound

public class EntityXPOrb extends Entity
{

    public int field_35159_a;
    public int field_35157_b;
    public int field_35158_c;
    private int field_35156_e;
    private int field_35154_f;

    public EntityXPOrb(World p_i67_1_, double p_i67_2_, double p_i67_4_, double p_i67_6_, 
            int p_i67_8_)
    {
        super(p_i67_1_);
        field_35157_b = 0;
        field_35156_e = 5;
        func_113_a(0.5F, 0.5F);
        field_9076_H = field_298_E / 2.0F;
        func_86_a(p_i67_2_, p_i67_4_, p_i67_6_);
        field_316_r = (float)(Math.random() * 360D);
        field_319_o = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F;
        field_318_p = (float)(Math.random() * 0.20000000000000001D) * 2.0F;
        field_317_q = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F;
        field_35154_f = p_i67_8_;
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    public EntityXPOrb(World p_i68_1_)
    {
        super(p_i68_1_);
        field_35157_b = 0;
        field_35156_e = 5;
        func_113_a(0.25F, 0.25F);
        field_9076_H = field_298_E / 2.0F;
    }

    protected void func_21044_a()
    {
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        if(field_35158_c > 0)
        {
            field_35158_c--;
        }
        field_9092_m = field_322_l;
        field_9091_n = field_321_m;
        field_9090_o = field_320_n;
        field_318_p -= 0.029999999329447746D;
        if(field_9093_l.func_443_c(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_321_m), MathHelper.func_584_b(field_320_n)) == Material.field_520_g)
        {
            field_318_p = 0.20000000298023224D;
            field_319_o = (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F;
            field_317_q = (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F;
            field_9093_l.func_506_a(this, "random.fizz", 0.4F, 2.0F + field_9064_W.nextFloat() * 0.4F);
        }
        func_28005_g(field_322_l, (field_312_v.field_963_b + field_312_v.field_968_e) / 2D, field_320_n);
        double d = 8D;
        EntityPlayer entityplayer = field_9093_l.func_472_a(this, d);
        if(entityplayer != null)
        {
            double d1 = (entityplayer.field_322_l - field_322_l) / d;
            double d2 = ((entityplayer.field_321_m + (double)entityplayer.func_104_p()) - field_321_m) / d;
            double d3 = (entityplayer.field_320_n - field_320_n) / d;
            double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
            double d5 = 1.0D - d4;
            if(d5 > 0.0D)
            {
                d5 *= d5;
                field_319_o += (d1 / d4) * d5 * 0.10000000000000001D;
                field_318_p += (d2 / d4) * d5 * 0.10000000000000001D;
                field_317_q += (d3 / d4) * d5 * 0.10000000000000001D;
            }
        }
        func_88_c(field_319_o, field_318_p, field_317_q);
        float f = 0.98F;
        if(field_9086_A)
        {
            f = 0.5880001F;
            int i = field_9093_l.func_444_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_312_v.field_963_b) - 1, MathHelper.func_584_b(field_320_n));
            if(i > 0)
            {
                f = Block.field_542_n[i].field_552_bo * 0.98F;
            }
        }
        field_319_o *= f;
        field_318_p *= 0.98000001907348633D;
        field_317_q *= f;
        if(field_9086_A)
        {
            field_318_p *= -0.89999997615814209D;
        }
        field_35159_a++;
        field_35157_b++;
        if(field_35157_b >= 6000)
        {
            func_118_j();
        }
    }

    public boolean func_119_o()
    {
        return field_9093_l.func_490_a(field_312_v, Material.field_521_f, this);
    }

    protected void func_125_b(int p_125_1_)
    {
        func_121_a(DamageSource.field_35091_a, p_125_1_);
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        func_9060_u();
        field_35156_e -= p_121_2_;
        if(field_35156_e <= 0)
        {
            func_118_j();
        }
        return false;
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_394_a("Health", (byte)field_35156_e);
        p_97_1_.func_394_a("Age", (short)field_35157_b);
        p_97_1_.func_394_a("Value", (short)field_35154_f);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        field_35156_e = p_99_1_.func_406_c("Health") & 0xff;
        field_35157_b = p_99_1_.func_406_c("Age");
        field_35154_f = p_99_1_.func_406_c("Value");
    }

    public void func_6093_b(EntityPlayer p_6093_1_)
    {
        if(field_9093_l.field_792_x)
        {
            return;
        }
        if(field_35158_c == 0 && p_6093_1_.field_35218_w == 0)
        {
            p_6093_1_.field_35218_w = 2;
            field_9093_l.func_506_a(this, "random.orb", 0.1F, 0.5F * ((field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.7F + 1.8F));
            p_6093_1_.func_163_c(this, 1);
            p_6093_1_.func_35195_d(field_35154_f);
            func_118_j();
        }
    }

    public int func_35153_j_()
    {
        return field_35154_f;
    }

    public static int func_35152_b(int p_35152_0_)
    {
        if(p_35152_0_ >= 2477)
        {
            return 2477;
        }
        if(p_35152_0_ >= 1237)
        {
            return 1237;
        }
        if(p_35152_0_ >= 617)
        {
            return 617;
        }
        if(p_35152_0_ >= 307)
        {
            return 307;
        }
        if(p_35152_0_ >= 149)
        {
            return 149;
        }
        if(p_35152_0_ >= 73)
        {
            return 73;
        }
        if(p_35152_0_ >= 37)
        {
            return 37;
        }
        if(p_35152_0_ >= 17)
        {
            return 17;
        }
        if(p_35152_0_ >= 7)
        {
            return 7;
        }
        return p_35152_0_ < 3 ? 1 : 3;
    }

    public boolean func_48313_k_()
    {
        return false;
    }
}
