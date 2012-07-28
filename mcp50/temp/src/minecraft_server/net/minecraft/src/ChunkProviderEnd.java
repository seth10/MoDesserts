// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, NoiseGeneratorOctaves, Block, World, 
//            WorldChunkManager, Chunk, BiomeGenBase, MathHelper, 
//            BlockSand, IProgressUpdate, EnumCreatureType, ChunkPosition

public class ChunkProviderEnd
    implements IChunkProvider
{

    private Random field_40201_i;
    private NoiseGeneratorOctaves field_40198_j;
    private NoiseGeneratorOctaves field_40199_k;
    private NoiseGeneratorOctaves field_40196_l;
    public NoiseGeneratorOctaves field_40193_a;
    public NoiseGeneratorOctaves field_40191_b;
    private World field_40197_m;
    private double field_40194_n[];
    private BiomeGenBase field_40195_o[];
    double field_40192_c[];
    double field_40189_d[];
    double field_40190_e[];
    double field_40187_f[];
    double field_40188_g[];
    int field_40200_h[][];

    public ChunkProviderEnd(World p_i147_1_, long p_i147_2_)
    {
        field_40200_h = new int[32][32];
        field_40197_m = p_i147_1_;
        field_40201_i = new Random(p_i147_2_);
        field_40198_j = new NoiseGeneratorOctaves(field_40201_i, 16);
        field_40199_k = new NoiseGeneratorOctaves(field_40201_i, 16);
        field_40196_l = new NoiseGeneratorOctaves(field_40201_i, 8);
        field_40193_a = new NoiseGeneratorOctaves(field_40201_i, 10);
        field_40191_b = new NoiseGeneratorOctaves(field_40201_i, 16);
    }

    public void func_40184_a(int p_40184_1_, int p_40184_2_, byte p_40184_3_[], BiomeGenBase p_40184_4_[])
    {
        byte byte0 = 2;
        int i = byte0 + 1;
        byte byte1 = 33;
        int j = byte0 + 1;
        field_40194_n = func_40186_a(field_40194_n, p_40184_1_ * byte0, 0, p_40184_2_ * byte0, i, byte1, j);
        for(int k = 0; k < byte0; k++)
        {
            for(int l = 0; l < byte0; l++)
            {
                for(int i1 = 0; i1 < 32; i1++)
                {
                    double d = 0.25D;
                    double d1 = field_40194_n[((k + 0) * j + (l + 0)) * byte1 + (i1 + 0)];
                    double d2 = field_40194_n[((k + 0) * j + (l + 1)) * byte1 + (i1 + 0)];
                    double d3 = field_40194_n[((k + 1) * j + (l + 0)) * byte1 + (i1 + 0)];
                    double d4 = field_40194_n[((k + 1) * j + (l + 1)) * byte1 + (i1 + 0)];
                    double d5 = (field_40194_n[((k + 0) * j + (l + 0)) * byte1 + (i1 + 1)] - d1) * d;
                    double d6 = (field_40194_n[((k + 0) * j + (l + 1)) * byte1 + (i1 + 1)] - d2) * d;
                    double d7 = (field_40194_n[((k + 1) * j + (l + 0)) * byte1 + (i1 + 1)] - d3) * d;
                    double d8 = (field_40194_n[((k + 1) * j + (l + 1)) * byte1 + (i1 + 1)] - d4) * d;
                    for(int j1 = 0; j1 < 4; j1++)
                    {
                        double d9 = 0.125D;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * d9;
                        double d13 = (d4 - d2) * d9;
                        for(int k1 = 0; k1 < 8; k1++)
                        {
                            int l1 = k1 + k * 8 << 11 | 0 + l * 8 << 7 | i1 * 4 + j1;
                            char c = '\200';
                            double d14 = 0.125D;
                            double d15 = d10;
                            double d16 = (d11 - d10) * d14;
                            for(int i2 = 0; i2 < 8; i2++)
                            {
                                int j2 = 0;
                                if(d15 > 0.0D)
                                {
                                    j2 = Block.field_40168_bK.field_573_bc;
                                }
                                p_40184_3_[l1] = (byte)j2;
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

    public void func_40185_b(int p_40185_1_, int p_40185_2_, byte p_40185_3_[], BiomeGenBase p_40185_4_[])
    {
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 16; j++)
            {
                int k = 1;
                int l = -1;
                byte byte0 = (byte)Block.field_40168_bK.field_573_bc;
                byte byte1 = (byte)Block.field_40168_bK.field_573_bc;
                for(int i1 = 127; i1 >= 0; i1--)
                {
                    int j1 = (j * 16 + i) * 128 + i1;
                    byte byte2 = p_40185_3_[j1];
                    if(byte2 == 0)
                    {
                        l = -1;
                        continue;
                    }
                    if(byte2 != Block.field_535_u.field_573_bc)
                    {
                        continue;
                    }
                    if(l == -1)
                    {
                        if(k <= 0)
                        {
                            byte0 = 0;
                            byte1 = (byte)Block.field_40168_bK.field_573_bc;
                        }
                        l = k;
                        if(i1 >= 0)
                        {
                            p_40185_3_[j1] = byte0;
                        } else
                        {
                            p_40185_3_[j1] = byte1;
                        }
                        continue;
                    }
                    if(l > 0)
                    {
                        l--;
                        p_40185_3_[j1] = byte1;
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
        field_40201_i.setSeed((long)p_363_1_ * 0x4f9939f508L + (long)p_363_2_ * 0x1ef1565bd5L);
        byte abyte0[] = new byte[32768];
        field_40195_o = field_40197_m.func_4077_a().func_4064_a(field_40195_o, p_363_1_ * 16, p_363_2_ * 16, 16, 16);
        func_40184_a(p_363_1_, p_363_2_, abyte0, field_40195_o);
        func_40185_b(p_363_1_, p_363_2_, abyte0, field_40195_o);
        Chunk chunk = new Chunk(field_40197_m, abyte0, p_363_1_, p_363_2_);
        byte abyte1[] = chunk.func_48552_l();
        for(int i = 0; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)field_40195_o[i].field_35529_y;
        }

        chunk.func_353_b();
        return chunk;
    }

    private double[] func_40186_a(double p_40186_1_[], int p_40186_2_, int p_40186_3_, int p_40186_4_, int p_40186_5_, int p_40186_6_, int p_40186_7_)
    {
        if(p_40186_1_ == null)
        {
            p_40186_1_ = new double[p_40186_5_ * p_40186_6_ * p_40186_7_];
        }
        double d = 684.41200000000003D;
        double d1 = 684.41200000000003D;
        field_40187_f = field_40193_a.func_4103_a(field_40187_f, p_40186_2_, p_40186_4_, p_40186_5_, p_40186_7_, 1.121D, 1.121D, 0.5D);
        field_40188_g = field_40191_b.func_4103_a(field_40188_g, p_40186_2_, p_40186_4_, p_40186_5_, p_40186_7_, 200D, 200D, 0.5D);
        d *= 2D;
        field_40192_c = field_40196_l.func_648_a(field_40192_c, p_40186_2_, p_40186_3_, p_40186_4_, p_40186_5_, p_40186_6_, p_40186_7_, d / 80D, d1 / 160D, d / 80D);
        field_40189_d = field_40198_j.func_648_a(field_40189_d, p_40186_2_, p_40186_3_, p_40186_4_, p_40186_5_, p_40186_6_, p_40186_7_, d, d1, d);
        field_40190_e = field_40199_k.func_648_a(field_40190_e, p_40186_2_, p_40186_3_, p_40186_4_, p_40186_5_, p_40186_6_, p_40186_7_, d, d1, d);
        int i = 0;
        int j = 0;
        for(int k = 0; k < p_40186_5_; k++)
        {
            for(int l = 0; l < p_40186_7_; l++)
            {
                double d2 = (field_40187_f[j] + 256D) / 512D;
                if(d2 > 1.0D)
                {
                    d2 = 1.0D;
                }
                double d3 = field_40188_g[j] / 8000D;
                if(d3 < 0.0D)
                {
                    d3 = -d3 * 0.29999999999999999D;
                }
                d3 = d3 * 3D - 2D;
                float f = (float)((k + p_40186_2_) - 0) / 1.0F;
                float f1 = (float)((l + p_40186_4_) - 0) / 1.0F;
                float f2 = 100F - MathHelper.func_586_c(f * f + f1 * f1) * 8F;
                if(f2 > 80F)
                {
                    f2 = 80F;
                }
                if(f2 < -100F)
                {
                    f2 = -100F;
                }
                if(d3 > 1.0D)
                {
                    d3 = 1.0D;
                }
                d3 /= 8D;
                d3 = 0.0D;
                if(d2 < 0.0D)
                {
                    d2 = 0.0D;
                }
                d2 += 0.5D;
                d3 = (d3 * (double)p_40186_6_) / 16D;
                j++;
                double d4 = (double)p_40186_6_ / 2D;
                for(int i1 = 0; i1 < p_40186_6_; i1++)
                {
                    double d5 = 0.0D;
                    double d6 = (((double)i1 - d4) * 8D) / d2;
                    if(d6 < 0.0D)
                    {
                        d6 *= -1D;
                    }
                    double d7 = field_40189_d[i] / 512D;
                    double d8 = field_40190_e[i] / 512D;
                    double d9 = (field_40192_c[i] / 10D + 1.0D) / 2D;
                    if(d9 < 0.0D)
                    {
                        d5 = d7;
                    } else
                    if(d9 > 1.0D)
                    {
                        d5 = d8;
                    } else
                    {
                        d5 = d7 + (d8 - d7) * d9;
                    }
                    d5 -= 8D;
                    d5 += f2;
                    int j1 = 2;
                    if(i1 > p_40186_6_ / 2 - j1)
                    {
                        double d10 = (float)(i1 - (p_40186_6_ / 2 - j1)) / 64F;
                        if(d10 < 0.0D)
                        {
                            d10 = 0.0D;
                        }
                        if(d10 > 1.0D)
                        {
                            d10 = 1.0D;
                        }
                        d5 = d5 * (1.0D - d10) + -3000D * d10;
                    }
                    j1 = 8;
                    if(i1 < j1)
                    {
                        double d11 = (float)(j1 - i1) / ((float)j1 - 1.0F);
                        d5 = d5 * (1.0D - d11) + -30D * d11;
                    }
                    p_40186_1_[i] = d5;
                    i++;
                }

            }

        }

        return p_40186_1_;
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
        BiomeGenBase biomegenbase = field_40197_m.func_48091_a(i + 16, j + 16);
        biomegenbase.func_35513_a(field_40197_m, field_40197_m.field_803_m, i, j);
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
        BiomeGenBase biomegenbase = field_40197_m.func_48091_a(p_40181_2_, p_40181_4_);
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
