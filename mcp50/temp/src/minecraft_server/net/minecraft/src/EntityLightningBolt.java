// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityWeatherEffect, World, MathHelper, Block, 
//            BlockFire, AxisAlignedBB, Entity, NBTTagCompound

public class EntityLightningBolt extends EntityWeatherEffect
{

    private int field_27018_b;
    public long field_27019_a;
    private int field_27020_c;

    public EntityLightningBolt(World p_i73_1_, double p_i73_2_, double p_i73_4_, double p_i73_6_)
    {
        super(p_i73_1_);
        field_27019_a = 0L;
        func_107_c(p_i73_2_, p_i73_4_, p_i73_6_, 0.0F, 0.0F);
        field_27018_b = 2;
        field_27019_a = field_9064_W.nextLong();
        field_27020_c = field_9064_W.nextInt(3) + 1;
        if(p_i73_1_.field_804_l >= 2 && p_i73_1_.func_21118_a(MathHelper.func_584_b(p_i73_2_), MathHelper.func_584_b(p_i73_4_), MathHelper.func_584_b(p_i73_6_), 10))
        {
            int i = MathHelper.func_584_b(p_i73_2_);
            int k = MathHelper.func_584_b(p_i73_4_);
            int i1 = MathHelper.func_584_b(p_i73_6_);
            if(p_i73_1_.func_444_a(i, k, i1) == 0 && Block.field_599_as.func_259_a(p_i73_1_, i, k, i1))
            {
                p_i73_1_.func_508_d(i, k, i1, Block.field_599_as.field_573_bc);
            }
            for(int j = 0; j < 4; j++)
            {
                int l = (MathHelper.func_584_b(p_i73_2_) + field_9064_W.nextInt(3)) - 1;
                int j1 = (MathHelper.func_584_b(p_i73_4_) + field_9064_W.nextInt(3)) - 1;
                int k1 = (MathHelper.func_584_b(p_i73_6_) + field_9064_W.nextInt(3)) - 1;
                if(p_i73_1_.func_444_a(l, j1, k1) == 0 && Block.field_599_as.func_259_a(p_i73_1_, l, j1, k1))
                {
                    p_i73_1_.func_508_d(l, j1, k1, Block.field_599_as.field_573_bc);
                }
            }

        }
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        if(field_27018_b == 2)
        {
            field_9093_l.func_502_a(field_322_l, field_321_m, field_320_n, "ambient.weather.thunder", 10000F, 0.8F + field_9064_W.nextFloat() * 0.2F);
            field_9093_l.func_502_a(field_322_l, field_321_m, field_320_n, "random.explode", 2.0F, 0.5F + field_9064_W.nextFloat() * 0.2F);
        }
        field_27018_b--;
        if(field_27018_b < 0)
        {
            if(field_27020_c == 0)
            {
                func_118_j();
            } else
            if(field_27018_b < -field_9064_W.nextInt(10))
            {
                field_27020_c--;
                field_27018_b = 1;
                field_27019_a = field_9064_W.nextLong();
                if(field_9093_l.func_21118_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_321_m), MathHelper.func_584_b(field_320_n), 10))
                {
                    int i = MathHelper.func_584_b(field_322_l);
                    int j = MathHelper.func_584_b(field_321_m);
                    int k = MathHelper.func_584_b(field_320_n);
                    if(field_9093_l.func_444_a(i, j, k) == 0 && Block.field_599_as.func_259_a(field_9093_l, i, j, k))
                    {
                        field_9093_l.func_508_d(i, j, k, Block.field_599_as.field_573_bc);
                    }
                }
            }
        }
        if(field_27018_b >= 0)
        {
            double d = 3D;
            List list = field_9093_l.func_450_b(this, AxisAlignedBB.func_693_b(field_322_l - d, field_321_m - d, field_320_n - d, field_322_l + d, field_321_m + 6D + d, field_320_n + d));
            for(int l = 0; l < list.size(); l++)
            {
                Entity entity = (Entity)list.get(l);
                entity.func_27009_a(this);
            }

            field_9093_l.field_27080_i = 2;
        }
    }

    protected void func_21044_a()
    {
    }

    protected void func_99_b(NBTTagCompound nbttagcompound)
    {
    }

    protected void func_97_a(NBTTagCompound nbttagcompound)
    {
    }
}
