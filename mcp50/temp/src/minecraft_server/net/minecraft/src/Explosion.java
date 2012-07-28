// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            World, MathHelper, Block, ChunkPosition, 
//            AxisAlignedBB, Vec3D, Entity, DamageSource, 
//            BlockFire

public class Explosion
{

    public boolean field_12031_a;
    private Random field_12024_h;
    private World field_4310_a;
    public double field_12030_b;
    public double field_12029_c;
    public double field_12028_d;
    public Entity field_12027_e;
    public float field_12026_f;
    public Set field_12025_g;

    public Explosion(World p_i401_1_, Entity p_i401_2_, double p_i401_3_, double p_i401_5_, double p_i401_7_, float p_i401_9_)
    {
        field_12031_a = false;
        field_12024_h = new Random();
        field_12025_g = new HashSet();
        field_4310_a = p_i401_1_;
        field_12027_e = p_i401_2_;
        field_12026_f = p_i401_9_;
        field_12030_b = p_i401_3_;
        field_12029_c = p_i401_5_;
        field_12028_d = p_i401_7_;
    }

    public void func_12023_a()
    {
        float f = field_12026_f;
        int i = 16;
        for(int j = 0; j < i; j++)
        {
            for(int l = 0; l < i; l++)
            {
label0:
                for(int j1 = 0; j1 < i; j1++)
                {
                    if(j != 0 && j != i - 1 && l != 0 && l != i - 1 && j1 != 0 && j1 != i - 1)
                    {
                        continue;
                    }
                    double d = ((float)j / ((float)i - 1.0F)) * 2.0F - 1.0F;
                    double d1 = ((float)l / ((float)i - 1.0F)) * 2.0F - 1.0F;
                    double d2 = ((float)j1 / ((float)i - 1.0F)) * 2.0F - 1.0F;
                    double d3 = Math.sqrt(d * d + d1 * d1 + d2 * d2);
                    d /= d3;
                    d1 /= d3;
                    d2 /= d3;
                    float f1 = field_12026_f * (0.7F + field_4310_a.field_803_m.nextFloat() * 0.6F);
                    double d5 = field_12030_b;
                    double d7 = field_12029_c;
                    double d9 = field_12028_d;
                    float f2 = 0.3F;
                    do
                    {
                        if(f1 <= 0.0F)
                        {
                            continue label0;
                        }
                        int l2 = MathHelper.func_584_b(d5);
                        int i3 = MathHelper.func_584_b(d7);
                        int j3 = MathHelper.func_584_b(d9);
                        int k3 = field_4310_a.func_444_a(l2, i3, j3);
                        if(k3 > 0)
                        {
                            f1 -= (Block.field_542_n[k3].func_226_a(field_12027_e) + 0.3F) * f2;
                        }
                        if(f1 > 0.0F)
                        {
                            field_12025_g.add(new ChunkPosition(l2, i3, j3));
                        }
                        d5 += d * (double)f2;
                        d7 += d1 * (double)f2;
                        d9 += d2 * (double)f2;
                        f1 -= f2 * 0.75F;
                    } while(true);
                }

            }

        }

        field_12026_f *= 2.0F;
        int k = MathHelper.func_584_b(field_12030_b - (double)field_12026_f - 1.0D);
        int i1 = MathHelper.func_584_b(field_12030_b + (double)field_12026_f + 1.0D);
        int k1 = MathHelper.func_584_b(field_12029_c - (double)field_12026_f - 1.0D);
        int l1 = MathHelper.func_584_b(field_12029_c + (double)field_12026_f + 1.0D);
        int i2 = MathHelper.func_584_b(field_12028_d - (double)field_12026_f - 1.0D);
        int j2 = MathHelper.func_584_b(field_12028_d + (double)field_12026_f + 1.0D);
        List list = field_4310_a.func_450_b(field_12027_e, AxisAlignedBB.func_693_b(k, k1, i2, i1, l1, j2));
        Vec3D vec3d = Vec3D.func_768_b(field_12030_b, field_12029_c, field_12028_d);
        for(int k2 = 0; k2 < list.size(); k2++)
        {
            Entity entity = (Entity)list.get(k2);
            double d4 = entity.func_103_e(field_12030_b, field_12029_c, field_12028_d) / (double)field_12026_f;
            if(d4 <= 1.0D)
            {
                double d6 = entity.field_322_l - field_12030_b;
                double d8 = entity.field_321_m - field_12029_c;
                double d10 = entity.field_320_n - field_12028_d;
                double d11 = MathHelper.func_583_a(d6 * d6 + d8 * d8 + d10 * d10);
                d6 /= d11;
                d8 /= d11;
                d10 /= d11;
                double d12 = field_4310_a.func_494_a(vec3d, entity.field_312_v);
                double d13 = (1.0D - d4) * d12;
                entity.func_121_a(DamageSource.field_35097_k, (int)(((d13 * d13 + d13) / 2D) * 8D * (double)field_12026_f + 1.0D));
                double d14 = d13;
                entity.field_319_o += d6 * d14;
                entity.field_318_p += d8 * d14;
                entity.field_317_q += d10 * d14;
            }
        }

        field_12026_f = f;
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(field_12025_g);
    }

    public void func_732_a(boolean p_732_1_)
    {
        field_4310_a.func_502_a(field_12030_b, field_12029_c, field_12028_d, "random.explode", 4F, (1.0F + (field_4310_a.field_803_m.nextFloat() - field_4310_a.field_803_m.nextFloat()) * 0.2F) * 0.7F);
        field_4310_a.func_514_a("hugeexplosion", field_12030_b, field_12029_c, field_12028_d, 0.0D, 0.0D, 0.0D);
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(field_12025_g);
        for(int i = arraylist.size() - 1; i >= 0; i--)
        {
            ChunkPosition chunkposition = (ChunkPosition)arraylist.get(i);
            int k = chunkposition.field_846_a;
            int i1 = chunkposition.field_845_b;
            int k1 = chunkposition.field_847_c;
            int i2 = field_4310_a.func_444_a(k, i1, k1);
            if(p_732_1_)
            {
                double d = (float)k + field_4310_a.field_803_m.nextFloat();
                double d1 = (float)i1 + field_4310_a.field_803_m.nextFloat();
                double d2 = (float)k1 + field_4310_a.field_803_m.nextFloat();
                double d3 = d - field_12030_b;
                double d4 = d1 - field_12029_c;
                double d5 = d2 - field_12028_d;
                double d6 = MathHelper.func_583_a(d3 * d3 + d4 * d4 + d5 * d5);
                d3 /= d6;
                d4 /= d6;
                d5 /= d6;
                double d7 = 0.5D / (d6 / (double)field_12026_f + 0.10000000000000001D);
                d7 *= field_4310_a.field_803_m.nextFloat() * field_4310_a.field_803_m.nextFloat() + 0.3F;
                d3 *= d7;
                d4 *= d7;
                d5 *= d7;
                field_4310_a.func_514_a("explode", (d + field_12030_b * 1.0D) / 2D, (d1 + field_12029_c * 1.0D) / 2D, (d2 + field_12028_d * 1.0D) / 2D, d3, d4, d5);
                field_4310_a.func_514_a("smoke", d, d1, d2, d3, d4, d5);
            }
            if(i2 > 0)
            {
                Block.field_542_n[i2].func_227_a(field_4310_a, k, i1, k1, field_4310_a.func_446_b(k, i1, k1), 0.3F, 0);
                field_4310_a.func_508_d(k, i1, k1, 0);
                Block.field_542_n[i2].func_4029_c(field_4310_a, k, i1, k1);
            }
        }

        if(field_12031_a)
        {
            for(int j = arraylist.size() - 1; j >= 0; j--)
            {
                ChunkPosition chunkposition1 = (ChunkPosition)arraylist.get(j);
                int l = chunkposition1.field_846_a;
                int j1 = chunkposition1.field_845_b;
                int l1 = chunkposition1.field_847_c;
                int j2 = field_4310_a.func_444_a(l, j1, l1);
                int k2 = field_4310_a.func_444_a(l, j1 - 1, l1);
                if(j2 == 0 && Block.field_540_p[k2] && field_12024_h.nextInt(3) == 0)
                {
                    field_4310_a.func_508_d(l, j1, l1, Block.field_599_as.field_573_bc);
                }
            }

        }
    }
}
