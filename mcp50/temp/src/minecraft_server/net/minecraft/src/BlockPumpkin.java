// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockDirectional, Material, World, Block, 
//            EntitySnowman, EntityIronGolem, EntityLiving, MathHelper

public class BlockPumpkin extends BlockDirectional
{

    private boolean field_4086_a;

    protected BlockPumpkin(int p_i129_1_, int p_i129_2_, boolean p_i129_3_)
    {
        super(p_i129_1_, Material.field_4213_w);
        field_575_bb = p_i129_2_;
        func_231_a(true);
        field_4086_a = p_i129_3_;
    }

    public int func_22009_a(int p_22009_1_, int p_22009_2_)
    {
        if(p_22009_1_ == 1)
        {
            return field_575_bb;
        }
        if(p_22009_1_ == 0)
        {
            return field_575_bb;
        }
        int i = field_575_bb + 1 + 16;
        if(field_4086_a)
        {
            i++;
        }
        if(p_22009_2_ == 2 && p_22009_1_ == 2)
        {
            return i;
        }
        if(p_22009_2_ == 3 && p_22009_1_ == 5)
        {
            return i;
        }
        if(p_22009_2_ == 0 && p_22009_1_ == 3)
        {
            return i;
        }
        if(p_22009_2_ == 1 && p_22009_1_ == 4)
        {
            return i;
        } else
        {
            return field_575_bb + 16;
        }
    }

    public int func_241_a(int p_241_1_)
    {
        if(p_241_1_ == 1)
        {
            return field_575_bb;
        }
        if(p_241_1_ == 0)
        {
            return field_575_bb;
        }
        if(p_241_1_ == 3)
        {
            return field_575_bb + 1 + 16;
        } else
        {
            return field_575_bb + 16;
        }
    }

    public void func_250_e(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_)
    {
        super.func_250_e(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        if(p_250_1_.func_444_a(p_250_2_, p_250_3_ - 1, p_250_4_) == Block.field_4076_aV.field_573_bc && p_250_1_.func_444_a(p_250_2_, p_250_3_ - 2, p_250_4_) == Block.field_4076_aV.field_573_bc)
        {
            if(!p_250_1_.field_792_x)
            {
                p_250_1_.func_462_a(p_250_2_, p_250_3_, p_250_4_, 0);
                p_250_1_.func_462_a(p_250_2_, p_250_3_ - 1, p_250_4_, 0);
                p_250_1_.func_462_a(p_250_2_, p_250_3_ - 2, p_250_4_, 0);
                EntitySnowman entitysnowman = new EntitySnowman(p_250_1_);
                entitysnowman.func_107_c((double)p_250_2_ + 0.5D, (double)p_250_3_ - 1.95D, (double)p_250_4_ + 0.5D, 0.0F, 0.0F);
                p_250_1_.func_526_a(entitysnowman);
                p_250_1_.func_454_e(p_250_2_, p_250_3_, p_250_4_, 0);
                p_250_1_.func_454_e(p_250_2_, p_250_3_ - 1, p_250_4_, 0);
                p_250_1_.func_454_e(p_250_2_, p_250_3_ - 2, p_250_4_, 0);
            }
            for(int i = 0; i < 120; i++)
            {
                p_250_1_.func_514_a("snowshovel", (double)p_250_2_ + p_250_1_.field_803_m.nextDouble(), (double)(p_250_3_ - 2) + p_250_1_.field_803_m.nextDouble() * 2.5D, (double)p_250_4_ + p_250_1_.field_803_m.nextDouble(), 0.0D, 0.0D, 0.0D);
            }

        } else
        if(p_250_1_.func_444_a(p_250_2_, p_250_3_ - 1, p_250_4_) == Block.field_4067_aj.field_573_bc && p_250_1_.func_444_a(p_250_2_, p_250_3_ - 2, p_250_4_) == Block.field_4067_aj.field_573_bc)
        {
            boolean flag = p_250_1_.func_444_a(p_250_2_ - 1, p_250_3_ - 1, p_250_4_) == Block.field_4067_aj.field_573_bc && p_250_1_.func_444_a(p_250_2_ + 1, p_250_3_ - 1, p_250_4_) == Block.field_4067_aj.field_573_bc;
            boolean flag1 = p_250_1_.func_444_a(p_250_2_, p_250_3_ - 1, p_250_4_ - 1) == Block.field_4067_aj.field_573_bc && p_250_1_.func_444_a(p_250_2_, p_250_3_ - 1, p_250_4_ + 1) == Block.field_4067_aj.field_573_bc;
            if(flag || flag1)
            {
                p_250_1_.func_462_a(p_250_2_, p_250_3_, p_250_4_, 0);
                p_250_1_.func_462_a(p_250_2_, p_250_3_ - 1, p_250_4_, 0);
                p_250_1_.func_462_a(p_250_2_, p_250_3_ - 2, p_250_4_, 0);
                if(flag)
                {
                    p_250_1_.func_462_a(p_250_2_ - 1, p_250_3_ - 1, p_250_4_, 0);
                    p_250_1_.func_462_a(p_250_2_ + 1, p_250_3_ - 1, p_250_4_, 0);
                } else
                {
                    p_250_1_.func_462_a(p_250_2_, p_250_3_ - 1, p_250_4_ - 1, 0);
                    p_250_1_.func_462_a(p_250_2_, p_250_3_ - 1, p_250_4_ + 1, 0);
                }
                EntityIronGolem entityirongolem = new EntityIronGolem(p_250_1_);
                entityirongolem.func_48381_b(true);
                entityirongolem.func_107_c((double)p_250_2_ + 0.5D, (double)p_250_3_ - 1.95D, (double)p_250_4_ + 0.5D, 0.0F, 0.0F);
                p_250_1_.func_526_a(entityirongolem);
                for(int j = 0; j < 120; j++)
                {
                    p_250_1_.func_514_a("snowballpoof", (double)p_250_2_ + p_250_1_.field_803_m.nextDouble(), (double)(p_250_3_ - 2) + p_250_1_.field_803_m.nextDouble() * 3.8999999999999999D, (double)p_250_4_ + p_250_1_.field_803_m.nextDouble(), 0.0D, 0.0D, 0.0D);
                }

                p_250_1_.func_454_e(p_250_2_, p_250_3_, p_250_4_, 0);
                p_250_1_.func_454_e(p_250_2_, p_250_3_ - 1, p_250_4_, 0);
                p_250_1_.func_454_e(p_250_2_, p_250_3_ - 2, p_250_4_, 0);
                if(flag)
                {
                    p_250_1_.func_454_e(p_250_2_ - 1, p_250_3_ - 1, p_250_4_, 0);
                    p_250_1_.func_454_e(p_250_2_ + 1, p_250_3_ - 1, p_250_4_, 0);
                } else
                {
                    p_250_1_.func_454_e(p_250_2_, p_250_3_ - 1, p_250_4_ - 1, 0);
                    p_250_1_.func_454_e(p_250_2_, p_250_3_ - 1, p_250_4_ + 1, 0);
                }
            }
        }
    }

    public boolean func_259_a(World p_259_1_, int p_259_2_, int p_259_3_, int p_259_4_)
    {
        int i = p_259_1_.func_444_a(p_259_2_, p_259_3_, p_259_4_);
        return (i == 0 || Block.field_542_n[i].field_553_bn.func_27090_g()) && p_259_1_.func_445_d(p_259_2_, p_259_3_ - 1, p_259_4_);
    }

    public void func_4027_a(World p_4027_1_, int p_4027_2_, int p_4027_3_, int p_4027_4_, EntityLiving p_4027_5_)
    {
        int i = MathHelper.func_584_b((double)((p_4027_5_.field_316_r * 4F) / 360F) + 2.5D) & 3;
        p_4027_1_.func_511_b(p_4027_2_, p_4027_3_, p_4027_4_, i);
    }
}
