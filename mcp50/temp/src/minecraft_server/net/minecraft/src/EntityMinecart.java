// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, IInventory, ItemStack, DataWatcher, 
//            World, Item, EntityItem, Block, 
//            NBTTagCompound, MathHelper, BlockRail, Vec3D, 
//            AxisAlignedBB, NBTTagList, EntityLiving, EntityPlayer, 
//            EntityIronGolem, InventoryPlayer, DamageSource

public class EntityMinecart extends Entity
    implements IInventory
{

    private ItemStack field_470_ai[];
    private int field_9165_e;
    private boolean field_469_aj;
    public int field_476_ae;
    public double field_9164_f;
    public double field_9166_aj;
    private static final int field_468_ak[][][] = {
        {
            {
                0, 0, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, -1, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, -1, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                0, -1, 1
            }
        }, {
            {
                0, -1, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                0, 0, 1
            }, {
                1, 0, 0
            }
        }, {
            {
                0, 0, 1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                1, 0, 0
            }
        }
    };
    private int field_9163_an;
    private double field_9162_ao;
    private double field_9161_ap;
    private double field_9160_aq;
    private double field_9159_ar;
    private double field_9158_as;

    public EntityMinecart(World p_i603_1_)
    {
        super(p_i603_1_);
        field_470_ai = new ItemStack[36];
        field_9165_e = 0;
        field_469_aj = false;
        field_329_e = true;
        func_113_a(0.98F, 0.7F);
        field_9076_H = field_298_E / 2.0F;
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    protected void func_21044_a()
    {
        field_21045_af.func_21153_a(16, new Byte((byte)0));
        field_21045_af.func_21153_a(17, new Integer(0));
        field_21045_af.func_21153_a(18, new Integer(1));
        field_21045_af.func_21153_a(19, new Integer(0));
    }

    public AxisAlignedBB func_89_d(Entity p_89_1_)
    {
        return p_89_1_.field_312_v;
    }

    public AxisAlignedBB func_93_n()
    {
        return null;
    }

    public boolean func_124_r()
    {
        return true;
    }

    public EntityMinecart(World p_i604_1_, double p_i604_2_, double p_i604_4_, double p_i604_6_, 
            int p_i604_8_)
    {
        this(p_i604_1_);
        func_86_a(p_i604_2_, p_i604_4_ + (double)field_9076_H, p_i604_6_);
        field_319_o = 0.0D;
        field_318_p = 0.0D;
        field_317_q = 0.0D;
        field_9092_m = p_i604_2_;
        field_9091_n = p_i604_4_;
        field_9090_o = p_i604_6_;
        field_476_ae = p_i604_8_;
    }

    public double func_130_h()
    {
        return (double)field_298_E * 0.0D - 0.30000001192092896D;
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        if(field_9093_l.field_792_x || field_304_B)
        {
            return true;
        }
        func_41016_d(-func_41021_q());
        func_41014_b(10);
        func_9060_u();
        func_41018_e_(func_41020_o() + p_121_2_ * 10);
        if(func_41020_o() > 40)
        {
            if(field_328_f != null)
            {
                field_328_f.func_6094_e(this);
            }
            func_118_j();
            func_123_a(Item.field_199_ax.field_234_aS, 1, 0.0F);
            if(field_476_ae == 1)
            {
                EntityMinecart entityminecart = this;
label0:
                for(int i = 0; i < entityminecart.func_83_a(); i++)
                {
                    ItemStack itemstack = entityminecart.func_82_a(i);
                    if(itemstack == null)
                    {
                        continue;
                    }
                    float f = field_9064_W.nextFloat() * 0.8F + 0.1F;
                    float f1 = field_9064_W.nextFloat() * 0.8F + 0.1F;
                    float f2 = field_9064_W.nextFloat() * 0.8F + 0.1F;
                    do
                    {
                        if(itemstack.field_853_a <= 0)
                        {
                            continue label0;
                        }
                        int j = field_9064_W.nextInt(21) + 10;
                        if(j > itemstack.field_853_a)
                        {
                            j = itemstack.field_853_a;
                        }
                        itemstack.field_853_a -= j;
                        EntityItem entityitem = new EntityItem(field_9093_l, field_322_l + (double)f, field_321_m + (double)f1, field_320_n + (double)f2, new ItemStack(itemstack.field_855_c, j, itemstack.func_21125_h()));
                        float f3 = 0.05F;
                        entityitem.field_319_o = (float)field_9064_W.nextGaussian() * f3;
                        entityitem.field_318_p = (float)field_9064_W.nextGaussian() * f3 + 0.2F;
                        entityitem.field_317_q = (float)field_9064_W.nextGaussian() * f3;
                        field_9093_l.func_526_a(entityitem);
                    } while(true);
                }

                func_123_a(Block.field_593_av.field_573_bc, 1, 0.0F);
            } else
            if(field_476_ae == 2)
            {
                func_123_a(Block.field_642_aC.field_573_bc, 1, 0.0F);
            }
        }
        return true;
    }

    public boolean func_129_c_()
    {
        return !field_304_B;
    }

    public void func_118_j()
    {
label0:
        for(int i = 0; i < func_83_a(); i++)
        {
            ItemStack itemstack = func_82_a(i);
            if(itemstack == null)
            {
                continue;
            }
            float f = field_9064_W.nextFloat() * 0.8F + 0.1F;
            float f1 = field_9064_W.nextFloat() * 0.8F + 0.1F;
            float f2 = field_9064_W.nextFloat() * 0.8F + 0.1F;
            do
            {
                if(itemstack.field_853_a <= 0)
                {
                    continue label0;
                }
                int j = field_9064_W.nextInt(21) + 10;
                if(j > itemstack.field_853_a)
                {
                    j = itemstack.field_853_a;
                }
                itemstack.field_853_a -= j;
                EntityItem entityitem = new EntityItem(field_9093_l, field_322_l + (double)f, field_321_m + (double)f1, field_320_n + (double)f2, new ItemStack(itemstack.field_855_c, j, itemstack.func_21125_h()));
                if(itemstack.func_40608_n())
                {
                    entityitem.field_429_a.func_40604_d((NBTTagCompound)itemstack.func_40607_o().func_40468_b());
                }
                float f3 = 0.05F;
                entityitem.field_319_o = (float)field_9064_W.nextGaussian() * f3;
                entityitem.field_318_p = (float)field_9064_W.nextGaussian() * f3 + 0.2F;
                entityitem.field_317_q = (float)field_9064_W.nextGaussian() * f3;
                field_9093_l.func_526_a(entityitem);
            } while(true);
        }

        super.func_118_j();
    }

    public void func_106_b_()
    {
        if(func_41019_p() > 0)
        {
            func_41014_b(func_41019_p() - 1);
        }
        if(func_41020_o() > 0)
        {
            func_41018_e_(func_41020_o() - 1);
        }
        if(field_321_m < -64D)
        {
            func_4043_o();
        }
        if(func_41015_m() && field_9064_W.nextInt(4) == 0)
        {
            field_9093_l.func_514_a("largesmoke", field_322_l, field_321_m + 0.80000000000000004D, field_320_n, 0.0D, 0.0D, 0.0D);
        }
        if(field_9093_l.field_792_x)
        {
            if(field_9163_an > 0)
            {
                double d = field_322_l + (field_9162_ao - field_322_l) / (double)field_9163_an;
                double d1 = field_321_m + (field_9161_ap - field_321_m) / (double)field_9163_an;
                double d3 = field_320_n + (field_9160_aq - field_320_n) / (double)field_9163_an;
                double d5;
                for(d5 = field_9159_ar - (double)field_316_r; d5 < -180D; d5 += 360D) { }
                for(; d5 >= 180D; d5 -= 360D) { }
                field_316_r += d5 / (double)field_9163_an;
                field_315_s += (field_9158_as - (double)field_315_s) / (double)field_9163_an;
                field_9163_an--;
                func_86_a(d, d1, d3);
                func_6096_b(field_316_r, field_315_s);
            } else
            {
                func_86_a(field_322_l, field_321_m, field_320_n);
                func_6096_b(field_316_r, field_315_s);
            }
            return;
        }
        field_9092_m = field_322_l;
        field_9091_n = field_321_m;
        field_9090_o = field_320_n;
        field_318_p -= 0.039999999105930328D;
        int i = MathHelper.func_584_b(field_322_l);
        int j = MathHelper.func_584_b(field_321_m);
        int k = MathHelper.func_584_b(field_320_n);
        if(BlockRail.func_27029_g(field_9093_l, i, j - 1, k))
        {
            j--;
        }
        double d2 = 0.40000000000000002D;
        double d4 = 0.0078125D;
        int l = field_9093_l.func_444_a(i, j, k);
        if(BlockRail.func_27030_c(l))
        {
            Vec3D vec3d = func_182_g(field_322_l, field_321_m, field_320_n);
            int i1 = field_9093_l.func_446_b(i, j, k);
            field_321_m = j;
            boolean flag = false;
            boolean flag1 = false;
            if(l == Block.field_9036_T.field_573_bc)
            {
                flag = (i1 & 8) != 0;
                flag1 = !flag;
            }
            if(((BlockRail)Block.field_542_n[l]).func_27028_d())
            {
                i1 &= 7;
            }
            if(i1 >= 2 && i1 <= 5)
            {
                field_321_m = j + 1;
            }
            if(i1 == 2)
            {
                field_319_o -= d4;
            }
            if(i1 == 3)
            {
                field_319_o += d4;
            }
            if(i1 == 4)
            {
                field_317_q += d4;
            }
            if(i1 == 5)
            {
                field_317_q -= d4;
            }
            int ai[][] = field_468_ak[i1];
            double d9 = ai[1][0] - ai[0][0];
            double d10 = ai[1][2] - ai[0][2];
            double d11 = Math.sqrt(d9 * d9 + d10 * d10);
            double d12 = field_319_o * d9 + field_317_q * d10;
            if(d12 < 0.0D)
            {
                d9 = -d9;
                d10 = -d10;
            }
            double d13 = Math.sqrt(field_319_o * field_319_o + field_317_q * field_317_q);
            field_319_o = (d13 * d9) / d11;
            field_317_q = (d13 * d10) / d11;
            if(flag1)
            {
                double d16 = Math.sqrt(field_319_o * field_319_o + field_317_q * field_317_q);
                if(d16 < 0.029999999999999999D)
                {
                    field_319_o *= 0.0D;
                    field_318_p *= 0.0D;
                    field_317_q *= 0.0D;
                } else
                {
                    field_319_o *= 0.5D;
                    field_318_p *= 0.0D;
                    field_317_q *= 0.5D;
                }
            }
            double d17 = 0.0D;
            double d18 = (double)i + 0.5D + (double)ai[0][0] * 0.5D;
            double d19 = (double)k + 0.5D + (double)ai[0][2] * 0.5D;
            double d20 = (double)i + 0.5D + (double)ai[1][0] * 0.5D;
            double d21 = (double)k + 0.5D + (double)ai[1][2] * 0.5D;
            d9 = d20 - d18;
            d10 = d21 - d19;
            if(d9 == 0.0D)
            {
                field_322_l = (double)i + 0.5D;
                d17 = field_320_n - (double)k;
            } else
            if(d10 == 0.0D)
            {
                field_320_n = (double)k + 0.5D;
                d17 = field_322_l - (double)i;
            } else
            {
                double d22 = field_322_l - d18;
                double d24 = field_320_n - d19;
                double d26 = (d22 * d9 + d24 * d10) * 2D;
                d17 = d26;
            }
            field_322_l = d18 + d9 * d17;
            field_320_n = d19 + d10 * d17;
            func_86_a(field_322_l, field_321_m + (double)field_9076_H, field_320_n);
            double d23 = field_319_o;
            double d25 = field_317_q;
            if(field_328_f != null)
            {
                d23 *= 0.75D;
                d25 *= 0.75D;
            }
            if(d23 < -d2)
            {
                d23 = -d2;
            }
            if(d23 > d2)
            {
                d23 = d2;
            }
            if(d25 < -d2)
            {
                d25 = -d2;
            }
            if(d25 > d2)
            {
                d25 = d2;
            }
            func_88_c(d23, 0.0D, d25);
            if(ai[0][1] != 0 && MathHelper.func_584_b(field_322_l) - i == ai[0][0] && MathHelper.func_584_b(field_320_n) - k == ai[0][2])
            {
                func_86_a(field_322_l, field_321_m + (double)ai[0][1], field_320_n);
            } else
            if(ai[1][1] != 0 && MathHelper.func_584_b(field_322_l) - i == ai[1][0] && MathHelper.func_584_b(field_320_n) - k == ai[1][2])
            {
                func_86_a(field_322_l, field_321_m + (double)ai[1][1], field_320_n);
            }
            if(field_328_f != null)
            {
                field_319_o *= 0.99699997901916504D;
                field_318_p *= 0.0D;
                field_317_q *= 0.99699997901916504D;
            } else
            {
                if(field_476_ae == 2)
                {
                    double d27 = MathHelper.func_583_a(field_9164_f * field_9164_f + field_9166_aj * field_9166_aj);
                    if(d27 > 0.01D)
                    {
                        field_9164_f /= d27;
                        field_9166_aj /= d27;
                        double d29 = 0.040000000000000001D;
                        field_319_o *= 0.80000001192092896D;
                        field_318_p *= 0.0D;
                        field_317_q *= 0.80000001192092896D;
                        field_319_o += field_9164_f * d29;
                        field_317_q += field_9166_aj * d29;
                    } else
                    {
                        field_319_o *= 0.89999997615814209D;
                        field_318_p *= 0.0D;
                        field_317_q *= 0.89999997615814209D;
                    }
                }
                field_319_o *= 0.95999997854232788D;
                field_318_p *= 0.0D;
                field_317_q *= 0.95999997854232788D;
            }
            Vec3D vec3d1 = func_182_g(field_322_l, field_321_m, field_320_n);
            if(vec3d1 != null && vec3d != null)
            {
                double d28 = (vec3d.field_1054_b - vec3d1.field_1054_b) * 0.050000000000000003D;
                double d14 = Math.sqrt(field_319_o * field_319_o + field_317_q * field_317_q);
                if(d14 > 0.0D)
                {
                    field_319_o = (field_319_o / d14) * (d14 + d28);
                    field_317_q = (field_317_q / d14) * (d14 + d28);
                }
                func_86_a(field_322_l, vec3d1.field_1054_b, field_320_n);
            }
            int k1 = MathHelper.func_584_b(field_322_l);
            int l1 = MathHelper.func_584_b(field_320_n);
            if(k1 != i || l1 != k)
            {
                double d15 = Math.sqrt(field_319_o * field_319_o + field_317_q * field_317_q);
                field_319_o = d15 * (double)(k1 - i);
                field_317_q = d15 * (double)(l1 - k);
            }
            if(field_476_ae == 2)
            {
                double d30 = MathHelper.func_583_a(field_9164_f * field_9164_f + field_9166_aj * field_9166_aj);
                if(d30 > 0.01D && field_319_o * field_319_o + field_317_q * field_317_q > 0.001D)
                {
                    field_9164_f /= d30;
                    field_9166_aj /= d30;
                    if(field_9164_f * field_319_o + field_9166_aj * field_317_q < 0.0D)
                    {
                        field_9164_f = 0.0D;
                        field_9166_aj = 0.0D;
                    } else
                    {
                        field_9164_f = field_319_o;
                        field_9166_aj = field_317_q;
                    }
                }
            }
            if(flag)
            {
                double d31 = Math.sqrt(field_319_o * field_319_o + field_317_q * field_317_q);
                if(d31 > 0.01D)
                {
                    double d32 = 0.059999999999999998D;
                    field_319_o += (field_319_o / d31) * d32;
                    field_317_q += (field_317_q / d31) * d32;
                } else
                if(i1 == 1)
                {
                    if(field_9093_l.func_445_d(i - 1, j, k))
                    {
                        field_319_o = 0.02D;
                    } else
                    if(field_9093_l.func_445_d(i + 1, j, k))
                    {
                        field_319_o = -0.02D;
                    }
                } else
                if(i1 == 0)
                {
                    if(field_9093_l.func_445_d(i, j, k - 1))
                    {
                        field_317_q = 0.02D;
                    } else
                    if(field_9093_l.func_445_d(i, j, k + 1))
                    {
                        field_317_q = -0.02D;
                    }
                }
            }
        } else
        {
            if(field_319_o < -d2)
            {
                field_319_o = -d2;
            }
            if(field_319_o > d2)
            {
                field_319_o = d2;
            }
            if(field_317_q < -d2)
            {
                field_317_q = -d2;
            }
            if(field_317_q > d2)
            {
                field_317_q = d2;
            }
            if(field_9086_A)
            {
                field_319_o *= 0.5D;
                field_318_p *= 0.5D;
                field_317_q *= 0.5D;
            }
            func_88_c(field_319_o, field_318_p, field_317_q);
            if(!field_9086_A)
            {
                field_319_o *= 0.94999998807907104D;
                field_318_p *= 0.94999998807907104D;
                field_317_q *= 0.94999998807907104D;
            }
        }
        field_315_s = 0.0F;
        double d6 = field_9092_m - field_322_l;
        double d7 = field_9090_o - field_320_n;
        if(d6 * d6 + d7 * d7 > 0.001D)
        {
            field_316_r = (float)((Math.atan2(d7, d6) * 180D) / 3.1415926535897931D);
            if(field_469_aj)
            {
                field_316_r += 180F;
            }
        }
        double d8;
        for(d8 = field_316_r - field_9089_x; d8 >= 180D; d8 -= 360D) { }
        for(; d8 < -180D; d8 += 360D) { }
        if(d8 < -170D || d8 >= 170D)
        {
            field_316_r += 180F;
            field_469_aj = !field_469_aj;
        }
        func_6096_b(field_316_r, field_315_s);
        List list = field_9093_l.func_450_b(this, field_312_v.func_708_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                Entity entity = (Entity)list.get(j1);
                if(entity != field_328_f && entity.func_124_r() && (entity instanceof EntityMinecart))
                {
                    entity.func_92_c(this);
                }
            }

        }
        if(field_328_f != null && field_328_f.field_304_B)
        {
            if(field_328_f.field_327_g == this)
            {
                field_328_f.field_327_g = null;
            }
            field_328_f = null;
        }
        if(field_9165_e > 0)
        {
            field_9165_e--;
        }
        if(field_9165_e <= 0)
        {
            field_9164_f = field_9166_aj = 0.0D;
        }
        func_41017_a(field_9165_e > 0);
    }

    public Vec3D func_182_g(double p_182_1_, double p_182_3_, double p_182_5_)
    {
        int i = MathHelper.func_584_b(p_182_1_);
        int j = MathHelper.func_584_b(p_182_3_);
        int k = MathHelper.func_584_b(p_182_5_);
        if(BlockRail.func_27029_g(field_9093_l, i, j - 1, k))
        {
            j--;
        }
        int l = field_9093_l.func_444_a(i, j, k);
        if(BlockRail.func_27030_c(l))
        {
            int i1 = field_9093_l.func_446_b(i, j, k);
            p_182_3_ = j;
            if(((BlockRail)Block.field_542_n[l]).func_27028_d())
            {
                i1 &= 7;
            }
            if(i1 >= 2 && i1 <= 5)
            {
                p_182_3_ = j + 1;
            }
            int ai[][] = field_468_ak[i1];
            double d = 0.0D;
            double d1 = (double)i + 0.5D + (double)ai[0][0] * 0.5D;
            double d2 = (double)j + 0.5D + (double)ai[0][1] * 0.5D;
            double d3 = (double)k + 0.5D + (double)ai[0][2] * 0.5D;
            double d4 = (double)i + 0.5D + (double)ai[1][0] * 0.5D;
            double d5 = (double)j + 0.5D + (double)ai[1][1] * 0.5D;
            double d6 = (double)k + 0.5D + (double)ai[1][2] * 0.5D;
            double d7 = d4 - d1;
            double d8 = (d5 - d2) * 2D;
            double d9 = d6 - d3;
            if(d7 == 0.0D)
            {
                p_182_1_ = (double)i + 0.5D;
                d = p_182_5_ - (double)k;
            } else
            if(d9 == 0.0D)
            {
                p_182_5_ = (double)k + 0.5D;
                d = p_182_1_ - (double)i;
            } else
            {
                double d10 = p_182_1_ - d1;
                double d11 = p_182_5_ - d3;
                double d12 = (d10 * d7 + d11 * d9) * 2D;
                d = d12;
            }
            p_182_1_ = d1 + d7 * d;
            p_182_3_ = d2 + d8 * d;
            p_182_5_ = d3 + d9 * d;
            if(d8 < 0.0D)
            {
                p_182_3_++;
            }
            if(d8 > 0.0D)
            {
                p_182_3_ += 0.5D;
            }
            return Vec3D.func_768_b(p_182_1_, p_182_3_, p_182_5_);
        } else
        {
            return null;
        }
    }

    protected void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_405_a("Type", field_476_ae);
        if(field_476_ae == 2)
        {
            p_97_1_.func_411_a("PushX", field_9164_f);
            p_97_1_.func_411_a("PushZ", field_9166_aj);
            p_97_1_.func_394_a("Fuel", (short)field_9165_e);
        } else
        if(field_476_ae == 1)
        {
            NBTTagList nbttaglist = new NBTTagList();
            for(int i = 0; i < field_470_ai.length; i++)
            {
                if(field_470_ai[i] != null)
                {
                    NBTTagCompound nbttagcompound = new NBTTagCompound();
                    nbttagcompound.func_409_a("Slot", (byte)i);
                    field_470_ai[i].func_570_a(nbttagcompound);
                    nbttaglist.func_386_a(nbttagcompound);
                }
            }

            p_97_1_.func_399_a("Items", nbttaglist);
        }
    }

    protected void func_99_b(NBTTagCompound p_99_1_)
    {
        field_476_ae = p_99_1_.func_395_d("Type");
        if(field_476_ae == 2)
        {
            field_9164_f = p_99_1_.func_398_g("PushX");
            field_9166_aj = p_99_1_.func_398_g("PushZ");
            field_9165_e = p_99_1_.func_406_c("Fuel");
        } else
        if(field_476_ae == 1)
        {
            NBTTagList nbttaglist = p_99_1_.func_407_k("Items");
            field_470_ai = new ItemStack[func_83_a()];
            for(int i = 0; i < nbttaglist.func_387_b(); i++)
            {
                NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_388_a(i);
                int j = nbttagcompound.func_408_b("Slot") & 0xff;
                if(j >= 0 && j < field_470_ai.length)
                {
                    field_470_ai[j] = ItemStack.func_35618_a(nbttagcompound);
                }
            }

        }
    }

    public void func_92_c(Entity p_92_1_)
    {
        if(field_9093_l.field_792_x)
        {
            return;
        }
        if(p_92_1_ == field_328_f)
        {
            return;
        }
        if((p_92_1_ instanceof EntityLiving) && !(p_92_1_ instanceof EntityPlayer) && !(p_92_1_ instanceof EntityIronGolem) && field_476_ae == 0 && field_319_o * field_319_o + field_317_q * field_317_q > 0.01D && field_328_f == null && p_92_1_.field_327_g == null)
        {
            p_92_1_.func_6094_e(this);
        }
        double d = p_92_1_.field_322_l - field_322_l;
        double d1 = p_92_1_.field_320_n - field_320_n;
        double d2 = d * d + d1 * d1;
        if(d2 >= 9.9999997473787516E-05D)
        {
            d2 = MathHelper.func_583_a(d2);
            d /= d2;
            d1 /= d2;
            double d3 = 1.0D / d2;
            if(d3 > 1.0D)
            {
                d3 = 1.0D;
            }
            d *= d3;
            d1 *= d3;
            d *= 0.10000000149011612D;
            d1 *= 0.10000000149011612D;
            d *= 1.0F - field_286_P;
            d1 *= 1.0F - field_286_P;
            d *= 0.5D;
            d1 *= 0.5D;
            if(p_92_1_ instanceof EntityMinecart)
            {
                double d4 = p_92_1_.field_322_l - field_322_l;
                double d5 = p_92_1_.field_320_n - field_320_n;
                Vec3D vec3d = Vec3D.func_768_b(d4, 0.0D, d5).func_758_b();
                Vec3D vec3d1 = Vec3D.func_768_b(MathHelper.func_582_b((field_316_r * 3.141593F) / 180F), 0.0D, MathHelper.func_585_a((field_316_r * 3.141593F) / 180F)).func_758_b();
                double d6 = Math.abs(vec3d.func_35570_a(vec3d1));
                if(d6 < 0.80000001192092896D)
                {
                    return;
                }
                double d7 = p_92_1_.field_319_o + field_319_o;
                double d8 = p_92_1_.field_317_q + field_317_q;
                if(((EntityMinecart)p_92_1_).field_476_ae == 2 && field_476_ae != 2)
                {
                    field_319_o *= 0.20000000298023224D;
                    field_317_q *= 0.20000000298023224D;
                    func_87_f(p_92_1_.field_319_o - d, 0.0D, p_92_1_.field_317_q - d1);
                    p_92_1_.field_319_o *= 0.94999998807907104D;
                    p_92_1_.field_317_q *= 0.94999998807907104D;
                } else
                if(((EntityMinecart)p_92_1_).field_476_ae != 2 && field_476_ae == 2)
                {
                    p_92_1_.field_319_o *= 0.20000000298023224D;
                    p_92_1_.field_317_q *= 0.20000000298023224D;
                    p_92_1_.func_87_f(field_319_o + d, 0.0D, field_317_q + d1);
                    field_319_o *= 0.94999998807907104D;
                    field_317_q *= 0.94999998807907104D;
                } else
                {
                    d7 /= 2D;
                    d8 /= 2D;
                    field_319_o *= 0.20000000298023224D;
                    field_317_q *= 0.20000000298023224D;
                    func_87_f(d7 - d, 0.0D, d8 - d1);
                    p_92_1_.field_319_o *= 0.20000000298023224D;
                    p_92_1_.field_317_q *= 0.20000000298023224D;
                    p_92_1_.func_87_f(d7 + d, 0.0D, d8 + d1);
                }
            } else
            {
                func_87_f(-d, 0.0D, -d1);
                p_92_1_.func_87_f(d / 4D, 0.0D, d1 / 4D);
            }
        }
    }

    public int func_83_a()
    {
        return 27;
    }

    public ItemStack func_82_a(int p_82_1_)
    {
        return field_470_ai[p_82_1_];
    }

    public ItemStack func_20069_a(int p_20069_1_, int p_20069_2_)
    {
        if(field_470_ai[p_20069_1_] != null)
        {
            if(field_470_ai[p_20069_1_].field_853_a <= p_20069_2_)
            {
                ItemStack itemstack = field_470_ai[p_20069_1_];
                field_470_ai[p_20069_1_] = null;
                return itemstack;
            }
            ItemStack itemstack1 = field_470_ai[p_20069_1_].func_20118_a(p_20069_2_);
            if(field_470_ai[p_20069_1_].field_853_a == 0)
            {
                field_470_ai[p_20069_1_] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48315_b(int p_48315_1_)
    {
        if(field_470_ai[p_48315_1_] != null)
        {
            ItemStack itemstack = field_470_ai[p_48315_1_];
            field_470_ai[p_48315_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_206_a(int p_206_1_, ItemStack p_206_2_)
    {
        field_470_ai[p_206_1_] = p_206_2_;
        if(p_206_2_ != null && p_206_2_.field_853_a > func_202_d())
        {
            p_206_2_.field_853_a = func_202_d();
        }
    }

    public String func_20068_b()
    {
        return "container.minecart";
    }

    public int func_202_d()
    {
        return 64;
    }

    public void func_183_c()
    {
    }

    public boolean func_6092_a(EntityPlayer p_6092_1_)
    {
        if(field_476_ae == 0)
        {
            if(field_328_f != null && (field_328_f instanceof EntityPlayer) && field_328_f != p_6092_1_)
            {
                return true;
            }
            if(!field_9093_l.field_792_x)
            {
                p_6092_1_.func_6094_e(this);
            }
        } else
        if(field_476_ae == 1)
        {
            if(!field_9093_l.field_792_x)
            {
                p_6092_1_.func_166_a(this);
            }
        } else
        if(field_476_ae == 2)
        {
            ItemStack itemstack = p_6092_1_.field_416_aj.func_213_b();
            if(itemstack != null && itemstack.field_855_c == Item.field_168_k.field_234_aS)
            {
                if(--itemstack.field_853_a == 0)
                {
                    p_6092_1_.field_416_aj.func_206_a(p_6092_1_.field_416_aj.field_499_d, null);
                }
                field_9165_e += 3600;
            }
            field_9164_f = field_322_l - p_6092_1_.field_322_l;
            field_9166_aj = field_320_n - p_6092_1_.field_320_n;
        }
        return true;
    }

    public boolean func_20067_a_(EntityPlayer p_20067_1_)
    {
        if(field_304_B)
        {
            return false;
        }
        return p_20067_1_.func_102_b(this) <= 64D;
    }

    protected boolean func_41015_m()
    {
        return (field_21045_af.func_21156_a(16) & 1) != 0;
    }

    protected void func_41017_a(boolean p_41017_1_)
    {
        if(p_41017_1_)
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(field_21045_af.func_21156_a(16) | 1)));
        } else
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(field_21045_af.func_21156_a(16) & -2)));
        }
    }

    public void func_35161_e()
    {
    }

    public void func_35162_t_()
    {
    }

    public void func_41018_e_(int p_41018_1_)
    {
        field_21045_af.func_21155_b(19, Integer.valueOf(p_41018_1_));
    }

    public int func_41020_o()
    {
        return field_21045_af.func_25075_b(19);
    }

    public void func_41014_b(int p_41014_1_)
    {
        field_21045_af.func_21155_b(17, Integer.valueOf(p_41014_1_));
    }

    public int func_41019_p()
    {
        return field_21045_af.func_25075_b(17);
    }

    public void func_41016_d(int p_41016_1_)
    {
        field_21045_af.func_21155_b(18, Integer.valueOf(p_41016_1_));
    }

    public int func_41021_q()
    {
        return field_21045_af.func_25075_b(18);
    }

}
