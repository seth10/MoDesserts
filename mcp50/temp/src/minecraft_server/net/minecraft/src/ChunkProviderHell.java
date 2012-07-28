// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, MapGenNetherBridge, MapGenCavesHell, NoiseGeneratorOctaves, 
//            Block, MapGenBase, Chunk, World, 
//            WorldChunkManager, BiomeGenBase, BlockSand, WorldGenHellLava, 
//            WorldGenFire, WorldGenGlowStone1, WorldGenGlowStone2, WorldGenFlowers, 
//            BlockFlower, EnumCreatureType, IProgressUpdate, ChunkPosition

public class ChunkProviderHell
    implements IChunkProvider
{

    private Random field_4241_h;
    private NoiseGeneratorOctaves field_4240_i;
    private NoiseGeneratorOctaves field_4239_j;
    private NoiseGeneratorOctaves field_4238_k;
    private NoiseGeneratorOctaves field_4237_l;
    private NoiseGeneratorOctaves field_4236_m;
    public NoiseGeneratorOctaves field_4248_a;
    public NoiseGeneratorOctaves field_4247_b;
    private World field_4235_n;
    private double field_4234_o[];
    public MapGenNetherBridge field_40183_c;
    private double field_4233_p[];
    private double field_4232_q[];
    private double field_4231_r[];
    private MapGenBase field_4230_s;
    double field_4246_c[];
    double field_4245_d[];
    double field_4244_e[];
    double field_4243_f[];
    double field_4242_g[];

    public ChunkProviderHell(World p_i389_1_, long p_i389_2_)
    {
        field_40183_c = new MapGenNetherBridge();
        field_4233_p = new double[256];
        field_4232_q = new double[256];
        field_4231_r = new double[256];
        field_4230_s = new MapGenCavesHell();
        field_4235_n = p_i389_1_;
        field_4241_h = new Random(p_i389_2_);
        field_4240_i = new NoiseGeneratorOctaves(field_4241_h, 16);
        field_4239_j = new NoiseGeneratorOctaves(field_4241_h, 16);
        field_4238_k = new NoiseGeneratorOctaves(field_4241_h, 8);
        field_4237_l = new NoiseGeneratorOctaves(field_4241_h, 4);
        field_4236_m = new NoiseGeneratorOctaves(field_4241_h, 4);
        field_4248_a = new NoiseGeneratorOctaves(field_4241_h, 10);
        field_4247_b = new NoiseGeneratorOctaves(field_4241_h, 16);
    }

    public void func_4062_a(int p_4062_1_, int p_4062_2_, byte p_4062_3_[])
    {
        byte byte0 = 4;
        byte byte1 = 32;
        int i = byte0 + 1;
        byte byte2 = 17;
        int j = byte0 + 1;
        field_4234_o = func_4060_a(field_4234_o, p_4062_1_ * byte0, 0, p_4062_2_ * byte0, i, byte2, j);
        for(int k = 0; k < byte0; k++)
        {
            for(int l = 0; l < byte0; l++)
            {
                for(int i1 = 0; i1 < 16; i1++)
                {
                    double d = 0.125D;
                    double d1 = field_4234_o[((k + 0) * j + (l + 0)) * byte2 + (i1 + 0)];
                    double d2 = field_4234_o[((k + 0) * j + (l + 1)) * byte2 + (i1 + 0)];
                    double d3 = field_4234_o[((k + 1) * j + (l + 0)) * byte2 + (i1 + 0)];
                    double d4 = field_4234_o[((k + 1) * j + (l + 1)) * byte2 + (i1 + 0)];
                    double d5 = (field_4234_o[((k + 0) * j + (l + 0)) * byte2 + (i1 + 1)] - d1) * d;
                    double d6 = (field_4234_o[((k + 0) * j + (l + 1)) * byte2 + (i1 + 1)] - d2) * d;
                    double d7 = (field_4234_o[((k + 1) * j + (l + 0)) * byte2 + (i1 + 1)] - d3) * d;
                    double d8 = (field_4234_o[((k + 1) * j + (l + 1)) * byte2 + (i1 + 1)] - d4) * d;
                    for(int j1 = 0; j1 < 8; j1++)
                    {
                        double d9 = 0.25D;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * d9;
                        double d13 = (d4 - d2) * d9;
                        for(int k1 = 0; k1 < 4; k1++)
                        {
                            int l1 = k1 + k * 4 << 11 | 0 + l * 4 << 7 | i1 * 8 + j1;
                            char c = '\200';
                            double d14 = 0.25D;
                            double d15 = d10;
                            double d16 = (d11 - d10) * d14;
                            for(int i2 = 0; i2 < 4; i2++)
                            {
                                int j2 = 0;
                                if(i1 * 8 + j1 < byte1)
                                {
                                    j2 = Block.field_592_E.field_573_bc;
                                }
                                if(d15 > 0.0D)
                                {
                                    j2 = Block.field_4050_bc.field_573_bc;
                                }
                                p_4062_3_[l1] = (byte)j2;
                                l1 += c;
                                d15 += d16;
                            }

                            d10 += d12;
                            d11 += d13;
                        }

                        d1 += d5;
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                    }

                }

            }

        }

    }

    public void func_4061_b(int p_4061_1_, int p_4061_2_, byte p_4061_3_[])
    {
        byte byte0 = 64;
        double d = 0.03125D;
        field_4233_p = field_4237_l.func_648_a(field_4233_p, p_4061_1_ * 16, p_4061_2_ * 16, 0, 16, 16, 1, d, d, 1.0D);
        field_4232_q = field_4237_l.func_648_a(field_4232_q, p_4061_1_ * 16, 109, p_4061_2_ * 16, 16, 1, 16, d, 1.0D, d);
        field_4231_r = field_4236_m.func_648_a(field_4231_r, p_4061_1_ * 16, p_4061_2_ * 16, 0, 16, 16, 1, d * 2D, d * 2D, d * 2D);
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 16; j++)
            {
                boolean flag = field_4233_p[i + j * 16] + field_4241_h.nextDouble() * 0.20000000000000001D > 0.0D;
                boolean flag1 = field_4232_q[i + j * 16] + field_4241_h.nextDouble() * 0.20000000000000001D > 0.0D;
                int k = (int)(field_4231_r[i + j * 16] / 3D + 3D + field_4241_h.nextDouble() * 0.25D);
                int l = -1;
                byte byte1 = (byte)Block.field_4050_bc.field_573_bc;
                byte byte2 = (byte)Block.field_4050_bc.field_573_bc;
                for(int i1 = 127; i1 >= 0; i1--)
                {
                    int j1 = (j * 16 + i) * 128 + i1;
                    if(i1 >= 127 - field_4241_h.nextInt(5))
                    {
                        p_4061_3_[j1] = (byte)Block.field_4064_A.field_573_bc;
                        continue;
                    }
                    if(i1 <= 0 + field_4241_h.nextInt(5))
                    {
                        p_4061_3_[j1] = (byte)Block.field_4064_A.field_573_bc;
                        continue;
                    }
                    byte byte3 = p_4061_3_[j1];
                    if(byte3 == 0)
                    {
                        l = -1;
                        continue;
                    }
                    if(byte3 != Block.field_4050_bc.field_573_bc)
                    {
                        continue;
                    }
                    if(l == -1)
                    {
                        if(k <= 0)
                        {
                            byte1 = 0;
                            byte2 = (byte)Block.field_4050_bc.field_573_bc;
                        } else
                        if(i1 >= byte0 - 4 && i1 <= byte0 + 1)
                        {
                            byte1 = (byte)Block.field_4050_bc.field_573_bc;
                            byte2 = (byte)Block.field_4050_bc.field_573_bc;
                            if(flag1)
                            {
                                byte1 = (byte)Block.field_4062_G.field_573_bc;
                            }
                            if(flag1)
                            {
                                byte2 = (byte)Block.field_4050_bc.field_573_bc;
                            }
                            if(flag)
                            {
                                byte1 = (byte)Block.field_4048_bd.field_573_bc;
                            }
                            if(flag)
                            {
                                byte2 = (byte)Block.field_4048_bd.field_573_bc;
                            }
                        }
                        if(i1 < byte0 && byte1 == 0)
                        {
                            byte1 = (byte)Block.field_592_E.field_573_bc;
                        }
                        l = k;
                        if(i1 >= byte0 - 1)
                        {
                            p_4061_3_[j1] = byte1;
                        } else
                        {
                            p_4061_3_[j1] = byte2;
                        }
                        continue;
                    }
                    if(l > 0)
                    {
                        l--;
                        p_4061_3_[j1] = byte2;
                    }
                }

            }

        }

    }

    public Chunk func_376_d(int p_376_1_, int p_376_2_)
    {
        return func_363_b(p_376_1_, p_376_2_);
    }

    public Chunk func_363_b(int p_363_1_, int p_363_2_)
    {
        field_4241_h.setSeed((long)p_363_1_ * 0x4f9939f508L + (long)p_363_2_ * 0x1ef1565bd5L);
        byte abyte0[] = new byte[32768];
        func_4062_a(p_363_1_, p_363_2_, abyte0);
        func_4061_b(p_363_1_, p_363_2_, abyte0);
        field_4230_s.func_667_a(this, field_4235_n, p_363_1_, p_363_2_, abyte0);
        field_40183_c.func_667_a(this, field_4235_n, p_363_1_, p_363_2_, abyte0);
        Chunk chunk = new Chunk(field_4235_n, abyte0, p_363_1_, p_363_2_);
        BiomeGenBase abiomegenbase[] = field_4235_n.func_4077_a().func_4064_a(null, p_363_1_ * 16, p_363_2_ * 16, 16, 16);
        byte abyte1[] = chunk.func_48552_l();
        for(int i = 0; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)abiomegenbase[i].field_35529_y;
        }

        chunk.func_48554_m();
        return chunk;
    }

    private double[] func_4060_a(double p_4060_1_[], int p_4060_2_, int p_4060_3_, int p_4060_4_, int p_4060_5_, int p_4060_6_, int p_4060_7_)
    {
        if(p_4060_1_ == null)
        {
            p_4060_1_ = new double[p_4060_5_ * p_4060_6_ * p_4060_7_];
        }
        double d = 684.41200000000003D;
        double d1 = 2053.2359999999999D;
        field_4243_f = field_4248_a.func_648_a(field_4243_f, p_4060_2_, p_4060_3_, p_4060_4_, p_4060_5_, 1, p_4060_7_, 1.0D, 0.0D, 1.0D);
        field_4242_g = field_4247_b.func_648_a(field_4242_g, p_4060_2_, p_4060_3_, p_4060_4_, p_4060_5_, 1, p_4060_7_, 100D, 0.0D, 100D);
        field_4246_c = field_4238_k.func_648_a(field_4246_c, p_4060_2_, p_4060_3_, p_4060_4_, p_4060_5_, p_4060_6_, p_4060_7_, d / 80D, d1 / 60D, d / 80D);
        field_4245_d = field_4240_i.func_648_a(field_4245_d, p_4060_2_, p_4060_3_, p_4060_4_, p_4060_5_, p_4060_6_, p_4060_7_, d, d1, d);
        field_4244_e = field_4239_j.func_648_a(field_4244_e, p_4060_2_, p_4060_3_, p_4060_4_, p_4060_5_, p_4060_6_, p_4060_7_, d, d1, d);
        int i = 0;
        int j = 0;
        double ad[] = new double[p_4060_6_];
        for(int k = 0; k < p_4060_6_; k++)
        {
            ad[k] = Math.cos(((double)k * 3.1415926535897931D * 6D) / (double)p_4060_6_) * 2D;
            double d2 = k;
            if(k > p_4060_6_ / 2)
            {
                d2 = p_4060_6_ - 1 - k;
            }
            if(d2 < 4D)
            {
                d2 = 4D - d2;
                ad[k] -= d2 * d2 * d2 * 10D;
            }
        }

        for(int l = 0; l < p_4060_5_; l++)
        {
            for(int i1 = 0; i1 < p_4060_7_; i1++)
            {
                double d3 = (field_4243_f[j] + 256D) / 512D;
                if(d3 > 1.0D)
                {
                    d3 = 1.0D;
                }
                double d4 = 0.0D;
                double d5 = field_4242_g[j] / 8000D;
                if(d5 < 0.0D)
                {
                    d5 = -d5;
                }
                d5 = d5 * 3D - 3D;
                if(d5 < 0.0D)
                {
                    d5 /= 2D;
                    if(d5 < -1D)
                    {
                        d5 = -1D;
                    }
                    d5 /= 1.3999999999999999D;
                    d5 /= 2D;
                    d3 = 0.0D;
                } else
                {
                    if(d5 > 1.0D)
                    {
                        d5 = 1.0D;
                    }
                    d5 /= 6D;
                }
                d3 += 0.5D;
                d5 = (d5 * (double)p_4060_6_) / 16D;
                j++;
                for(int j1 = 0; j1 < p_4060_6_; j1++)
                {
                    double d6 = 0.0D;
                    double d7 = ad[j1];
                    double d8 = field_4245_d[i] / 512D;
                    double d9 = field_4244_e[i] / 512D;
                    double d10 = (field_4246_c[i] / 10D + 1.0D) / 2D;
                    if(d10 < 0.0D)
                    {
                        d6 = d8;
                    } else
                    if(d10 > 1.0D)
                    {
                        d6 = d9;
                    } else
                    {
                        d6 = d8 + (d9 - d8) * d10;
                    }
                    d6 -= d7;
                    if(j1 > p_4060_6_ - 4)
                    {
                        double d11 = (float)(j1 - (p_4060_6_ - 4)) / 3F;
                        d6 = d6 * (1.0D - d11) + -10D * d11;
                    }
                    if((double)j1 < d4)
                    {
                        double d12 = (d4 - (double)j1) / 4D;
                        if(d12 < 0.0D)
                        {
                            d12 = 0.0D;
                        }
                        if(d12 > 1.0D)
                        {
                            d12 = 1.0D;
                        }
                        d6 = d6 * (1.0D - d12) + -10D * d12;
                    }
                    p_4060_1_[i] = d6;
                    i++;
                }

            }

        }

        return p_4060_1_;
    }

    public boolean func_365_a(int p_365_1_, int p_365_2_)
    {
        return true;
    }

    public void func_4055_a(IChunkProvider p_4055_1_, int p_4055_2_, int p_4055_3_)
    {
        BlockSand.field_650_a = true;
        int i = p_4055_2_ * 16;
        int j = p_4055_3_ * 16;
        field_40183_c.func_35532_a(field_4235_n, field_4241_h, p_4055_2_, p_4055_3_);
        for(int k = 0; k < 8; k++)
        {
            int i1 = i + field_4241_h.nextInt(16) + 8;
            int k2 = field_4241_h.nextInt(120) + 4;
            int i4 = j + field_4241_h.nextInt(16) + 8;
            (new WorldGenHellLava(Block.field_594_D.field_573_bc)).func_419_a(field_4235_n, field_4241_h, i1, k2, i4);
        }

        int l = field_4241_h.nextInt(field_4241_h.nextInt(10) + 1) + 1;
        for(int j1 = 0; j1 < l; j1++)
        {
            int l2 = i + field_4241_h.nextInt(16) + 8;
            int j4 = field_4241_h.nextInt(120) + 4;
            int k5 = j + field_4241_h.nextInt(16) + 8;
            (new WorldGenFire()).func_419_a(field_4235_n, field_4241_h, l2, j4, k5);
        }

        l = field_4241_h.nextInt(field_4241_h.nextInt(10) + 1);
        for(int k1 = 0; k1 < l; k1++)
        {
            int i3 = i + field_4241_h.nextInt(16) + 8;
            int k4 = field_4241_h.nextInt(120) + 4;
            int l5 = j + field_4241_h.nextInt(16) + 8;
            (new WorldGenGlowStone1()).func_419_a(field_4235_n, field_4241_h, i3, k4, l5);
        }

        for(int l1 = 0; l1 < 10; l1++)
        {
            int j3 = i + field_4241_h.nextInt(16) + 8;
            int l4 = field_4241_h.nextInt(128);
            int i6 = j + field_4241_h.nextInt(16) + 8;
            (new WorldGenGlowStone2()).func_419_a(field_4235_n, field_4241_h, j3, l4, i6);
        }

        if(field_4241_h.nextInt(1) == 0)
        {
            int i2 = i + field_4241_h.nextInt(16) + 8;
            int k3 = field_4241_h.nextInt(128);
            int i5 = j + field_4241_h.nextInt(16) + 8;
            (new WorldGenFlowers(Block.field_4070_ag.field_573_bc)).func_419_a(field_4235_n, field_4241_h, i2, k3, i5);
        }
        if(field_4241_h.nextInt(1) == 0)
        {
            int j2 = i + field_4241_h.nextInt(16) + 8;
            int l3 = field_4241_h.nextInt(128);
            int j5 = j + field_4241_h.nextInt(16) + 8;
            (new WorldGenFlowers(Block.field_4069_ah.field_573_bc)).func_419_a(field_4235_n, field_4241_h, j2, l3, j5);
        }
        BlockSand.field_650_a = false;
    }

    public boolean func_360_a(boolean p_360_1_, IProgressUpdate p_360_2_)
    {
        return true;
    }

    public boolean func_361_a()
    {
        return false;
    }

    public boolean func_364_b()
    {
        return true;
    }

    public List func_40181_a(EnumCreatureType p_40181_1_, int p_40181_2_, int p_40181_3_, int p_40181_4_)
    {
        if(p_40181_1_ == EnumCreatureType.monster && field_40183_c.func_40204_a(p_40181_2_, p_40181_3_, p_40181_4_))
        {
            return field_40183_c.func_40205_b();
        }
        BiomeGenBase biomegenbase = field_4235_n.func_48091_a(p_40181_2_, p_40181_4_);
        if(biomegenbase == null)
        {
            return null;
        } else
        {
            return biomegenbase.func_25055_a(p_40181_1_);
        }
    }

    public ChunkPosition func_40182_a(World p_40182_1_, String p_40182_2_, int p_40182_3_, int i, int j)
    {
        return null;
    }
}
