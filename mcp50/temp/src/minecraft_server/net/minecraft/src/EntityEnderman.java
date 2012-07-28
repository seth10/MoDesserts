// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, DataWatcher, NBTTagCompound, World, 
//            EntityPlayer, InventoryPlayer, ItemStack, Block, 
//            Vec3D, AxisAlignedBB, DamageSource, MathHelper, 
//            Entity, Material, Item, EntityDamageSourceIndirect, 
//            BlockGrass, BlockFlower, BlockMycelium

public class EntityEnderman extends EntityMob
{

    private static boolean field_35234_b[];
    public boolean field_35235_a;
    private int field_35233_g;
    private int field_35236_h;

    public EntityEnderman(World p_i299_1_)
    {
        super(p_i299_1_);
        field_35235_a = false;
        field_35233_g = 0;
        field_35236_h = 0;
        field_9119_aG = "/mob/enderman.png";
        field_9126_bt = 0.2F;
        field_404_af = 7;
        func_113_a(0.6F, 2.9F);
        field_9067_S = 1.0F;
    }

    public int func_40095_c()
    {
        return 40;
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, new Byte((byte)0));
        field_21045_af.func_21153_a(17, new Byte((byte)0));
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_394_a("carried", (short)func_35225_x());
        p_97_1_.func_394_a("carriedData", (short)func_35231_y());
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        func_35226_b(p_99_1_.func_406_c("carried"));
        func_35229_d(p_99_1_.func_406_c("carriedData"));
    }

    protected Entity func_158_i()
    {
        EntityPlayer entityplayer = field_9093_l.func_40211_b(this, 64D);
        if(entityplayer != null)
        {
            if(func_35232_c(entityplayer))
            {
                if(field_35236_h++ == 5)
                {
                    field_35236_h = 0;
                    return entityplayer;
                }
            } else
            {
                field_35236_h = 0;
            }
        }
        return null;
    }

    public float func_108_b(float p_108_1_)
    {
        return super.func_108_b(p_108_1_);
    }

    private boolean func_35232_c(EntityPlayer p_35232_1_)
    {
        ItemStack itemstack = p_35232_1_.field_416_aj.field_495_b[3];
        if(itemstack != null && itemstack.field_855_c == Block.field_4052_bb.field_573_bc)
        {
            return false;
        }
        Vec3D vec3d = p_35232_1_.func_141_d(1.0F).func_758_b();
        Vec3D vec3d1 = Vec3D.func_768_b(field_322_l - p_35232_1_.field_322_l, (field_312_v.field_963_b + (double)(field_298_E / 2.0F)) - (p_35232_1_.field_321_m + (double)p_35232_1_.func_104_p()), field_320_n - p_35232_1_.field_320_n);
        double d = vec3d1.func_765_c();
        vec3d1 = vec3d1.func_758_b();
        double d1 = vec3d.func_35570_a(vec3d1);
        if(d1 > 1.0D - 0.025000000000000001D / d)
        {
            return p_35232_1_.func_145_g(this);
        } else
        {
            return false;
        }
    }

    public void func_153_y()
    {
        if(func_27008_Y())
        {
            func_121_a(DamageSource.field_35088_e, 1);
        }
        field_35235_a = field_389_ag != null;
        field_9126_bt = field_389_ag == null ? 0.3F : 6.5F;
        if(!field_9093_l.field_792_x)
        {
            if(func_35225_x() == 0)
            {
                if(field_9064_W.nextInt(20) == 0)
                {
                    int i = MathHelper.func_584_b((field_322_l - 2D) + field_9064_W.nextDouble() * 4D);
                    int l = MathHelper.func_584_b(field_321_m + field_9064_W.nextDouble() * 3D);
                    int j1 = MathHelper.func_584_b((field_320_n - 2D) + field_9064_W.nextDouble() * 4D);
                    int l1 = field_9093_l.func_444_a(i, l, j1);
                    if(field_35234_b[l1])
                    {
                        func_35226_b(field_9093_l.func_444_a(i, l, j1));
                        func_35229_d(field_9093_l.func_446_b(i, l, j1));
                        field_9093_l.func_508_d(i, l, j1, 0);
                    }
                }
            } else
            if(field_9064_W.nextInt(2000) == 0)
            {
                int j = MathHelper.func_584_b((field_322_l - 1.0D) + field_9064_W.nextDouble() * 2D);
                int i1 = MathHelper.func_584_b(field_321_m + field_9064_W.nextDouble() * 2D);
                int k1 = MathHelper.func_584_b((field_320_n - 1.0D) + field_9064_W.nextDouble() * 2D);
                int i2 = field_9093_l.func_444_a(j, i1, k1);
                int j2 = field_9093_l.func_444_a(j, i1 - 1, k1);
                if(i2 == 0 && j2 > 0 && Block.field_542_n[j2].func_28025_b())
                {
                    field_9093_l.func_507_b(j, i1, k1, func_35225_x(), func_35231_y());
                    func_35226_b(0);
                }
            }
        }
        for(int k = 0; k < 2; k++)
        {
            field_9093_l.func_514_a("portal", field_322_l + (field_9064_W.nextDouble() - 0.5D) * (double)field_300_D, (field_321_m + field_9064_W.nextDouble() * (double)field_298_E) - 0.25D, field_320_n + (field_9064_W.nextDouble() - 0.5D) * (double)field_300_D, (field_9064_W.nextDouble() - 0.5D) * 2D, -field_9064_W.nextDouble(), (field_9064_W.nextDouble() - 0.5D) * 2D);
        }

        if(field_9093_l.func_453_a() && !field_9093_l.field_792_x)
        {
            float f = func_108_b(1.0F);
            if(f > 0.5F && field_9093_l.func_497_g(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_321_m), MathHelper.func_584_b(field_320_n)) && field_9064_W.nextFloat() * 30F < (f - 0.4F) * 2.0F)
            {
                field_389_ag = null;
                func_35227_w();
            }
        }
        if(func_27008_Y())
        {
            field_389_ag = null;
            func_35227_w();
        }
        field_9128_br = false;
        if(field_389_ag != null)
        {
            func_147_b(field_389_ag, 100F, 100F);
        }
        if(!field_9093_l.field_792_x && func_120_t())
        {
            if(field_389_ag != null)
            {
                if((field_389_ag instanceof EntityPlayer) && func_35232_c((EntityPlayer)field_389_ag))
                {
                    field_9131_bo = field_9130_bp = 0.0F;
                    field_9126_bt = 0.0F;
                    if(field_389_ag.func_102_b(this) < 16D)
                    {
                        func_35227_w();
                    }
                    field_35233_g = 0;
                } else
                if(field_389_ag.func_102_b(this) > 256D && field_35233_g++ >= 30 && func_35230_e(field_389_ag))
                {
                    field_35233_g = 0;
                }
            } else
            {
                field_35233_g = 0;
            }
        }
        super.func_153_y();
    }

    protected boolean func_35227_w()
    {
        double d = field_322_l + (field_9064_W.nextDouble() - 0.5D) * 64D;
        double d1 = field_321_m + (double)(field_9064_W.nextInt(64) - 32);
        double d2 = field_320_n + (field_9064_W.nextDouble() - 0.5D) * 64D;
        return func_35228_a(d, d1, d2);
    }

    protected boolean func_35230_e(Entity p_35230_1_)
    {
        Vec3D vec3d = Vec3D.func_768_b(field_322_l - p_35230_1_.field_322_l, ((field_312_v.field_963_b + (double)(field_298_E / 2.0F)) - p_35230_1_.field_321_m) + (double)p_35230_1_.func_104_p(), field_320_n - p_35230_1_.field_320_n);
        vec3d = vec3d.func_758_b();
        double d = 16D;
        double d1 = (field_322_l + (field_9064_W.nextDouble() - 0.5D) * 8D) - vec3d.field_1055_a * d;
        double d2 = (field_321_m + (double)(field_9064_W.nextInt(16) - 8)) - vec3d.field_1054_b * d;
        double d3 = (field_320_n + (field_9064_W.nextDouble() - 0.5D) * 8D) - vec3d.field_1058_c * d;
        return func_35228_a(d1, d2, d3);
    }

    protected boolean func_35228_a(double p_35228_1_, double p_35228_3_, double p_35228_5_)
    {
        double d = field_322_l;
        double d1 = field_321_m;
        double d2 = field_320_n;
        field_322_l = p_35228_1_;
        field_321_m = p_35228_3_;
        field_320_n = p_35228_5_;
        boolean flag = false;
        int i = MathHelper.func_584_b(field_322_l);
        int j = MathHelper.func_584_b(field_321_m);
        int k = MathHelper.func_584_b(field_320_n);
        if(field_9093_l.func_530_e(i, j, k))
        {
            boolean flag1;
            for(flag1 = false; !flag1 && j > 0;)
            {
                int i1 = field_9093_l.func_444_a(i, j - 1, k);
                if(i1 == 0 || !Block.field_542_n[i1].field_553_bn.func_218_c())
                {
                    field_321_m--;
                    j--;
                } else
                {
                    flag1 = true;
                }
            }

            if(flag1)
            {
                func_86_a(field_322_l, field_321_m, field_320_n);
                if(field_9093_l.func_481_a(this, field_312_v).size() == 0 && !field_9093_l.func_469_b(field_312_v))
                {
                    flag = true;
                }
            }
        }
        if(!flag)
        {
            func_86_a(d, d1, d2);
            return false;
        }
        int l = 128;
        for(int j1 = 0; j1 < l; j1++)
        {
            double d3 = (double)j1 / ((double)l - 1.0D);
            float f = (field_9064_W.nextFloat() - 0.5F) * 0.2F;
            float f1 = (field_9064_W.nextFloat() - 0.5F) * 0.2F;
            float f2 = (field_9064_W.nextFloat() - 0.5F) * 0.2F;
            double d4 = d + (field_322_l - d) * d3 + (field_9064_W.nextDouble() - 0.5D) * (double)field_300_D * 2D;
            double d5 = d1 + (field_321_m - d1) * d3 + field_9064_W.nextDouble() * (double)field_298_E;
            double d6 = d2 + (field_320_n - d2) * d3 + (field_9064_W.nextDouble() - 0.5D) * (double)field_300_D * 2D;
            field_9093_l.func_514_a("portal", d4, d5, d6, f, f1, f2);
        }

        field_9093_l.func_502_a(d, d1, d2, "mob.endermen.portal", 1.0F, 1.0F);
        field_9093_l.func_506_a(this, "mob.endermen.portal", 1.0F, 1.0F);
        return true;
    }

    protected String func_6097_d()
    {
        return "mob.endermen.idle";
    }

    protected String func_6100_e()
    {
        return "mob.endermen.hit";
    }

    protected String func_6098_f()
    {
        return "mob.endermen.death";
    }

    protected int func_149_g()
    {
        return Item.field_35411_bl.field_234_aS;
    }

    protected void func_21047_g_(boolean p_21047_1_, int p_21047_2_)
    {
        int i = func_149_g();
        if(i > 0)
        {
            int j = field_9064_W.nextInt(2 + p_21047_2_);
            for(int k = 0; k < j; k++)
            {
                func_128_a(i, 1);
            }

        }
    }

    public void func_35226_b(int p_35226_1_)
    {
        field_21045_af.func_21155_b(16, Byte.valueOf((byte)(p_35226_1_ & 0xff)));
    }

    public int func_35225_x()
    {
        return field_21045_af.func_21156_a(16);
    }

    public void func_35229_d(int p_35229_1_)
    {
        field_21045_af.func_21155_b(17, Byte.valueOf((byte)(p_35229_1_ & 0xff)));
    }

    public int func_35231_y()
    {
        return field_21045_af.func_21156_a(17);
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        if(p_121_1_ instanceof EntityDamageSourceIndirect)
        {
            for(int i = 0; i < 64; i++)
            {
                if(func_35227_w())
                {
                    return true;
                }
            }

            return false;
        } else
        {
            return super.func_121_a(p_121_1_, p_121_2_);
        }
    }

    static 
    {
        field_35234_b = new boolean[256];
        field_35234_b[Block.field_534_v.field_573_bc] = true;
        field_35234_b[Block.field_533_w.field_573_bc] = true;
        field_35234_b[Block.field_590_F.field_573_bc] = true;
        field_35234_b[Block.field_4062_G.field_573_bc] = true;
        field_35234_b[Block.field_4072_ae.field_573_bc] = true;
        field_35234_b[Block.field_4071_af.field_573_bc] = true;
        field_35234_b[Block.field_4070_ag.field_573_bc] = true;
        field_35234_b[Block.field_4069_ah.field_573_bc] = true;
        field_35234_b[Block.field_605_an.field_573_bc] = true;
        field_35234_b[Block.field_622_aW.field_573_bc] = true;
        field_35234_b[Block.field_621_aX.field_573_bc] = true;
        field_35234_b[Block.field_4052_bb.field_573_bc] = true;
        field_35234_b[Block.field_35048_bs.field_573_bc] = true;
        field_35234_b[Block.field_40164_bz.field_573_bc] = true;
    }
}
