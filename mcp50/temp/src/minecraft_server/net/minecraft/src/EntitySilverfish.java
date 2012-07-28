// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, World, EntityDamageSource, Entity, 
//            AxisAlignedBB, DamageSource, MathHelper, Block, 
//            Facing, BlockSilverfish, EnumCreatureAttribute, NBTTagCompound

public class EntitySilverfish extends EntityMob
{

    private int field_35237_a;

    public EntitySilverfish(World p_i551_1_)
    {
        super(p_i551_1_);
        field_9119_aG = "/mob/silverfish.png";
        func_113_a(0.3F, 0.7F);
        field_9126_bt = 0.6F;
        field_404_af = 1;
    }

    public int func_40095_c()
    {
        return 8;
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    protected Entity func_158_i()
    {
        double d = 8D;
        return field_9093_l.func_40211_b(this, d);
    }

    protected String func_6097_d()
    {
        return "mob.silverfish.say";
    }

    protected String func_6100_e()
    {
        return "mob.silverfish.hit";
    }

    protected String func_6098_f()
    {
        return "mob.silverfish.kill";
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        if(field_35237_a <= 0 && (p_121_1_ instanceof EntityDamageSource))
        {
            field_35237_a = 20;
        }
        return super.func_121_a(p_121_1_, p_121_2_);
    }

    protected void func_157_a(Entity p_157_1_, float p_157_2_)
    {
        if(field_9103_aW <= 0 && p_157_2_ < 1.2F && p_157_1_.field_312_v.field_968_e > field_312_v.field_963_b && p_157_1_.field_312_v.field_963_b < field_312_v.field_968_e)
        {
            field_9103_aW = 20;
            p_157_1_.func_121_a(DamageSource.func_35072_a(this), field_404_af);
        }
    }

    protected void func_41011_a(int p_41011_1_, int p_41011_2_, int p_41011_3_, int p_41011_4_)
    {
        field_9093_l.func_506_a(this, "mob.silverfish.step", 1.0F, 1.0F);
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
    }

    protected int func_149_g()
    {
        return 0;
    }

    public void func_106_b_()
    {
        field_9095_az = field_316_r;
        super.func_106_b_();
    }

    protected void func_152_d_()
    {
        super.func_152_d_();
        if(field_9093_l.field_792_x)
        {
            return;
        }
        if(field_35237_a > 0)
        {
            field_35237_a--;
            if(field_35237_a == 0)
            {
                int i = MathHelper.func_584_b(field_322_l);
                int k = MathHelper.func_584_b(field_321_m);
                int i1 = MathHelper.func_584_b(field_320_n);
                boolean flag = false;
                for(int l1 = 0; !flag && l1 <= 5 && l1 >= -5; l1 = l1 > 0 ? 0 - l1 : 1 - l1)
                {
                    for(int j2 = 0; !flag && j2 <= 10 && j2 >= -10; j2 = j2 > 0 ? 0 - j2 : 1 - j2)
                    {
                        for(int k2 = 0; !flag && k2 <= 10 && k2 >= -10; k2 = k2 > 0 ? 0 - k2 : 1 - k2)
                        {
                            int l2 = field_9093_l.func_444_a(i + j2, k + l1, i1 + k2);
                            if(l2 != Block.field_35056_bm.field_573_bc)
                            {
                                continue;
                            }
                            field_9093_l.func_28097_e(2001, i + j2, k + l1, i1 + k2, Block.field_35056_bm.field_573_bc + (field_9093_l.func_446_b(i + j2, k + l1, i1 + k2) << 12));
                            field_9093_l.func_508_d(i + j2, k + l1, i1 + k2, 0);
                            Block.field_35056_bm.func_251_a(field_9093_l, i + j2, k + l1, i1 + k2, 0);
                            if(!field_9064_W.nextBoolean())
                            {
                                continue;
                            }
                            flag = true;
                            break;
                        }

                    }

                }

            }
        }
        if(field_389_ag == null && !func_25023_z())
        {
            int j = MathHelper.func_584_b(field_322_l);
            int l = MathHelper.func_584_b(field_321_m + 0.5D);
            int j1 = MathHelper.func_584_b(field_320_n);
            int k1 = field_9064_W.nextInt(6);
            int i2 = field_9093_l.func_444_a(j + Facing.field_31051_b[k1], l + Facing.field_31054_c[k1], j1 + Facing.field_31053_d[k1]);
            if(BlockSilverfish.func_35060_c(i2))
            {
                field_9093_l.func_507_b(j + Facing.field_31051_b[k1], l + Facing.field_31054_c[k1], j1 + Facing.field_31053_d[k1], Block.field_35056_bm.field_573_bc, BlockSilverfish.func_35061_d(i2));
                func_156_D();
                func_118_j();
            } else
            {
                func_31021_B();
            }
        } else
        if(field_389_ag != null && !func_25023_z())
        {
            field_389_ag = null;
        }
    }

    public float func_159_a(int p_159_1_, int p_159_2_, int p_159_3_)
    {
        if(field_9093_l.func_444_a(p_159_1_, p_159_2_ - 1, p_159_3_) == Block.field_535_u.field_573_bc)
        {
            return 10F;
        } else
        {
            return super.func_159_a(p_159_1_, p_159_2_, p_159_3_);
        }
    }

    protected boolean func_40123_y()
    {
        return true;
    }

    public boolean func_155_a()
    {
        if(super.func_155_a())
        {
            EntityPlayer entityplayer = field_9093_l.func_472_a(this, 5D);
            return entityplayer == null;
        } else
        {
            return false;
        }
    }

    public EnumCreatureAttribute func_40093_t()
    {
        return EnumCreatureAttribute.ARTHROPOD;
    }
}
