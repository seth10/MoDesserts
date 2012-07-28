// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving, MathHelper, AxisAlignedBB, World, 
//            Block

public abstract class EntityFlying extends EntityLiving
{

    public EntityFlying(World p_i563_1_)
    {
        super(p_i563_1_);
    }

    protected void func_114_a(float f)
    {
    }

    public void func_148_c(float p_148_1_, float p_148_2_)
    {
        if(func_27011_Z())
        {
            func_90_a(p_148_1_, p_148_2_, 0.02F);
            func_88_c(field_319_o, field_318_p, field_317_q);
            field_319_o *= 0.80000001192092896D;
            field_318_p *= 0.80000001192092896D;
            field_317_q *= 0.80000001192092896D;
        } else
        if(func_112_q())
        {
            func_90_a(p_148_1_, p_148_2_, 0.02F);
            func_88_c(field_319_o, field_318_p, field_317_q);
            field_319_o *= 0.5D;
            field_318_p *= 0.5D;
            field_317_q *= 0.5D;
        } else
        {
            float f = 0.91F;
            if(field_9086_A)
            {
                f = 0.5460001F;
                int i = field_9093_l.func_444_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_312_v.field_963_b) - 1, MathHelper.func_584_b(field_320_n));
                if(i > 0)
                {
                    f = Block.field_542_n[i].field_552_bo * 0.91F;
                }
            }
            float f1 = 0.1627714F / (f * f * f);
            func_90_a(p_148_1_, p_148_2_, field_9086_A ? 0.1F * f1 : 0.02F);
            f = 0.91F;
            if(field_9086_A)
            {
                f = 0.5460001F;
                int j = field_9093_l.func_444_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_312_v.field_963_b) - 1, MathHelper.func_584_b(field_320_n));
                if(j > 0)
                {
                    f = Block.field_542_n[j].field_552_bo * 0.91F;
                }
            }
            func_88_c(field_319_o, field_318_p, field_317_q);
            field_319_o *= f;
            field_318_p *= f;
            field_317_q *= f;
        }
        field_9142_bc = field_9141_bd;
        double d = field_322_l - field_9092_m;
        double d1 = field_320_n - field_9090_o;
        float f2 = MathHelper.func_583_a(d * d + d1 * d1) * 4F;
        if(f2 > 1.0F)
        {
            f2 = 1.0F;
        }
        field_9141_bd += (f2 - field_9141_bd) * 0.4F;
        field_386_ba += field_9141_bd;
    }

    public boolean func_144_E()
    {
        return false;
    }
}
