// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, MapGenCaves, MapGenStronghold, MapGenVillage, 
//            MapGenMineshaft, MapGenRavine, NoiseGeneratorOctaves, World, 
//            WorldChunkManager, Block, BiomeGenBase, MapGenBase, 
//            Chunk, MathHelper, BlockSand, WorldGenLakes, 
//            WorldGenDungeons, SpawnerAnimals, IProgressUpdate, EnumCreatureType, 
//            ChunkPosition

public class ChunkProviderGenerate
    implements IChunkProvider
{

    private Random field_706_j;
    private NoiseGeneratorOctaves field_705_k;
    private NoiseGeneratorOctaves field_704_l;
    private NoiseGeneratorOctaves field_703_m;
    private NoiseGeneratorOctaves field_702_n;
    public NoiseGeneratorOctaves field_715_a;
    public NoiseGeneratorOctaves field_714_b;
    public NoiseGeneratorOctaves field_713_c;
    private World field_700_p;
    private final boolean field_35563_t;
    private double field_4224_q[];
    private double field_35562_v[];
    private MapGenBase field_695_u;
    private MapGenStronghold field_35559_d;
    private MapGenVillage field_35560_e;
    private MapGenMineshaft field_35558_f;
    private MapGenBase field_35564_x;
    private BiomeGenBase field_4223_v[];
    double field_4229_d[];
    double field_4228_e[];
    double field_4227_f[];
    double field_4226_g[];
    double field_4225_h[];
    float field_35561_l[];
    int field_707_i[][];

    public ChunkProviderGenerate(World p_i598_1_, long p_i598_2_, boolean p_i598_4_)
    {
        field_35562_v = new double[256];
        field_695_u = new MapGenCaves();
        field_35559_d = new MapGenStronghold();
        field_35560_e = new MapGenVillage(0);
        field_35558_f = new MapGenMineshaft();
        field_35564_x = new MapGenRavine();
        field_707_i = new int[32][32];
        field_700_p = p_i598_1_;
        field_35563_t = p_i598_4_;
        field_706_j = new Random(p_i598_2_);
        field_705_k = new NoiseGeneratorOctaves(field_706_j, 16);
        field_704_l = new NoiseGeneratorOctaves(field_706_j, 16);
        field_703_m = new NoiseGeneratorOctaves(field_706_j, 8);
        field_702_n = new NoiseGeneratorOctaves(field_706_j, 4);
        field_715_a = new NoiseGeneratorOctaves(field_706_j, 10);
        field_714_b = new NoiseGeneratorOctaves(field_706_j, 16);
        field_713_c = new NoiseGeneratorOctaves(field_706_j, 8);
    }

    public void func_4057_a(int p_4057_1_, int p_4057_2_, byte p_4057_3_[])
    {
        byte byte0 = 4;
        byte byte1 = 16;
        byte byte2 = 63;
        int i = byte0 + 1;
        byte byte3 = 17;
        int j = byte0 + 1;
        field_4223_v = field_700_p.func_4077_a().func_35142_b(field_4223_v, p_4057_1_ * 4 - 2, p_4057_2_ * 4 - 2, i + 5, j + 5);
        field_4224_q = func_4058_a(field_4224_q, p_4057_1_ * byte0, 0, p_4057_2_ * byte0, i, byte3, j);
        for(int k = 0; k < byte0; k++)
        {
            for(int l = 0; l < byte0; l++)
            {
                for(int i1 = 0; i1 < byte1; i1++)
                {
                    double d = 0.125D;
                    double d1 = field_4224_q[((k + 0) * j + (l + 0)) * byte3 + (i1 + 0)];
                    double d2 = field_4224_q[((k + 0) * j + (l + 1)) * byte3 + (i1 + 0)];
                    double d3 = field_4224_q[((k + 1) * j + (l + 0)) * byte3 + (i1 + 0)];
                    double d4 = field_4224_q[((k + 1) * j + (l + 1)) * byte3 + (i1 + 0)];
                    double d5 = (field_4224_q[((k + 0) * j + (l + 0)) * byte3 + (i1 + 1)] - d1) * d;
                    double d6 = (field_4224_q[((k + 0) * j + (l + 1)) * byte3 + (i1 + 1)] - d2) * d;
                    double d7 = (field_4224_q[((k + 1) * j + (l + 0)) * byte3 + (i1 + 1)] - d3) * d;
                    double d8 = (field_4224_q[((k + 1) * j + (l + 1)) * byte3 + (i1 + 1)] - d4) * d;
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
                            l1 -= c;
                            double d14 = 0.25D;
                            double d15 = d10;
                            double d16 = (d11 - d10) * d14;
                            d15 -= d16;
                            for(int i2 = 0; i2 < 4; i2++)
                            {
                                if((d15 += d16) > 0.0D)
                                {
                                    p_4057_3_[l1 += c] = (byte)Block.field_535_u.field_573_bc;
                                    continue;
                                }
                                if(i1 * 8 + j1 < byte2)
                                {
                                    p_4057_3_[l1 += c] = (byte)Block.field_596_C.field_573_bc;
                                } else
                                {
                                    p_4057_3_[l1 += c] = 0;
                                }
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

    public void func_4056_a(int p_4056_1_, int p_4056_2_, byte p_4056_3_[], BiomeGenBase p_4056_4_[])
    {
        byte byte0 = 63;
        double d = 0.03125D;
        field_35562_v = field_702_n.func_648_a(field_35562_v, p_4056_1_ * 16, p_4056_2_ * 16, 0, 16, 16, 1, d * 2D, d * 2D, d * 2D);
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 16; j++)
            {
                BiomeGenBase biomegenbase = p_4056_4_[j + i * 16];
                float f = biomegenbase.func_48442_h();
                int k = (int)(field_35562_v[i + j * 16] / 3D + 3D + field_706_j.nextDouble() * 0.25D);
                int l = -1;
                byte byte1 = biomegenbase.field_4286_o;
                byte byte2 = biomegenbase.field_4285_p;
                for(int i1 = 127; i1 >= 0; i1--)
                {
                    int j1 = (j * 16 + i) * 128 + i1;
                    if(i1 <= 0 + field_706_j.nextInt(5))
                    {
                        p_4056_3_[j1] = (byte)Block.field_4064_A.field_573_bc;
                        continue;
                    }
                    byte byte3 = p_4056_3_[j1];
                    if(byte3 == 0)
                    {
                        l = -1;
                        continue;
                    }
                    if(byte3 != Block.field_535_u.field_573_bc)
                    {
                        continue;
                    }
                    if(l == -1)
                    {
                        if(k <= 0)
                        {
                            byte1 = 0;
                            byte2 = (byte)Block.field_535_u.field_573_bc;
                        } else
                        if(i1 >= byte0 - 4 && i1 <= byte0 + 1)
                        {
                            byte1 = biomegenbase.field_4286_o;
                            byte2 = biomegenbase.field_4285_p;
                        }
                        if(i1 < byte0 && byte1 == 0)
                        {
                            if(f < 0.15F)
                            {
                                byte1 = (byte)Block.field_4077_aU.field_573_bc;
                            } else
                            {
                                byte1 = (byte)Block.field_596_C.field_573_bc;
                            }
                        }
                        l = k;
                        if(i1 >= byte0 - 1)
                        {
                            p_4056_3_[j1] = byte1;
                        } else
                        {
                            p_4056_3_[j1] = byte2;
                        }
                        continue;
                    }
                    if(l <= 0)
                    {
                        continue;
                    }
                    l--;
                    p_4056_3_[j1] = byte2;
                    if(l == 0 && byte2 == Block.field_590_F.field_573_bc)
                    {
                        l = field_706_j.nextInt(4);
                        byte2 = (byte)Block.field_9039_Q.field_573_bc;
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
        field_706_j.setSeed((long)p_363_1_ * 0x4f9939f508L + (long)p_363_2_ * 0x1ef1565bd5L);
        byte abyte0[] = new byte[32768];
        func_4057_a(p_363_1_, p_363_2_, abyte0);
        field_4223_v = field_700_p.func_4077_a().func_4064_a(field_4223_v, p_363_1_ * 16, p_363_2_ * 16, 16, 16);
        func_4056_a(p_363_1_, p_363_2_, abyte0, field_4223_v);
        field_695_u.func_667_a(this, field_700_p, p_363_1_, p_363_2_, abyte0);
        field_35564_x.func_667_a(this, field_700_p, p_363_1_, p_363_2_, abyte0);
        if(field_35563_t)
        {
            field_35558_f.func_667_a(this, field_700_p, p_363_1_, p_363_2_, abyte0);
            field_35560_e.func_667_a(this, field_700_p, p_363_1_, p_363_2_, abyte0);
            field_35559_d.func_667_a(this, field_700_p, p_363_1_, p_363_2_, abyte0);
        }
        Chunk chunk = new Chunk(field_700_p, abyte0, p_363_1_, p_363_2_);
        byte abyte1[] = chunk.func_48552_l();
        for(int i = 0; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)field_4223_v[i].field_35529_y;
        }

        chunk.func_353_b();
        return chunk;
    }

    private double[] func_4058_a(double p_4058_1_[], int p_4058_2_, int p_4058_3_, int p_4058_4_, int p_4058_5_, int p_4058_6_, int p_4058_7_)
    {
        if(p_4058_1_ == null)
        {
            p_4058_1_ = new double[p_4058_5_ * p_4058_6_ * p_4058_7_];
        }
        if(field_35561_l == null)
        {
            field_35561_l = new float[25];
            for(int i = -2; i <= 2; i++)
            {
                for(int j = -2; j <= 2; j++)
                {
                    float f = 10F / MathHelper.func_586_c((float)(i * i + j * j) + 0.2F);
                    field_35561_l[i + 2 + (j + 2) * 5] = f;
                }

            }

        }
        double d = 684.41200000000003D;
        double d1 = 684.41200000000003D;
        field_4226_g = field_715_a.func_4103_a(field_4226_g, p_4058_2_, p_4058_4_, p_4058_5_, p_4058_7_, 1.121D, 1.121D, 0.5D);
        field_4225_h = field_714_b.func_4103_a(field_4225_h, p_4058_2_, p_4058_4_, p_4058_5_, p_4058_7_, 200D, 200D, 0.5D);
        field_4229_d = field_703_m.func_648_a(field_4229_d, p_4058_2_, p_4058_3_, p_4058_4_, p_4058_5_, p_4058_6_, p_4058_7_, d / 80D, d1 / 160D, d / 80D);
        field_4228_e = field_705_k.func_648_a(field_4228_e, p_4058_2_, p_4058_3_, p_4058_4_, p_4058_5_, p_4058_6_, p_4058_7_, d, d1, d);
        field_4227_f = field_704_l.func_648_a(field_4227_f, p_4058_2_, p_4058_3_, p_4058_4_, p_4058_5_, p_4058_6_, p_4058_7_, d, d1, d);
        p_4058_2_ = p_4058_4_ = 0;
        int k = 0;
        int l = 0;
        for(int i1 = 0; i1 < p_4058_5_; i1++)
        {
            for(int j1 = 0; j1 < p_4058_7_; j1++)
            {
                float f1 = 0.0F;
                float f2 = 0.0F;
                float f3 = 0.0F;
                byte byte0 = 2;
                BiomeGenBase biomegenbase = field_4223_v[i1 + 2 + (j1 + 2) * (p_4058_5_ + 5)];
                for(int k1 = -byte0; k1 <= byte0; k1++)
                {
                    for(int l1 = -byte0; l1 <= byte0; l1++)
                    {
                        BiomeGenBase biomegenbase1 = field_4223_v[i1 + k1 + 2 + (j1 + l1 + 2) * (p_4058_5_ + 5)];
                        float f4 = field_35561_l[k1 + 2 + (l1 + 2) * 5] / (biomegenbase1.field_35527_q + 2.0F);
                        if(biomegenbase1.field_35527_q > biomegenbase.field_35527_q)
                        {
                            f4 /= 2.0F;
                        }
                        f1 += biomegenbase1.field_35526_r * f4;
                        f2 += biomegenbase1.field_35527_q * f4;
                        f3 += f4;
                    }

                }

                f1 /= f3;
                f2 /= f3;
                f1 = f1 * 0.9F + 0.1F;
                f2 = (f2 * 4F - 1.0F) / 8F;
                double d2 = field_4225_h[l] / 8000D;
                if(d2 < 0.0D)
                {
                    d2 = -d2 * 0.29999999999999999D;
                }
                d2 = d2 * 3D - 2D;
                if(d2 < 0.0D)
                {
                    d2 /= 2D;
                    if(d2 < -1D)
                    {
                        d2 = -1D;
                    }
                    d2 /= 1.3999999999999999D;
                    d2 /= 2D;
                } else
                {
                    if(d2 > 1.0D)
                    {
                        d2 = 1.0D;
                    }
                    d2 /= 8D;
                }
                l++;
                for(int i2 = 0; i2 < p_4058_6_; i2++)
                {
                    double d3 = f2;
                    double d4 = f1;
                    d3 += d2 * 0.20000000000000001D;
                    d3 = (d3 * (double)p_4058_6_) / 16D;
                    double d5 = (double)p_4058_6_ / 2D + d3 * 4D;
                    double d6 = 0.0D;
                    double d7 = (((double)i2 - d5) * 12D * 128D) / 128D / d4;
                    if(d7 < 0.0D)
                    {
                        d7 *= 4D;
                    }
                    double d8 = field_4228_e[k] / 512D;
                    double d9 = field_4227_f[k] / 512D;
                    double d10 = (field_4229_d[k] / 10D + 1.0D) / 2D;
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
                    if(i2 > p_4058_6_ - 4)
                    {
                        double d11 = (float)(i2 - (p_4058_6_ - 4)) / 3F;
                        d6 = d6 * (1.0D - d11) + -10D * d11;
                    }
                    p_4058_1_[k] = d6;
                    k++;
                }

            }

        }

        return p_4058_1_;
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
        BiomeGenBase biomegenbase = field_700_p.func_48091_a(i + 16, j + 16);
        field_706_j.setSeed(field_700_p.func_22079_j());
        long l = (field_706_j.nextLong() / 2L) * 2L + 1L;
        long l1 = (field_706_j.nextLong() / 2L) * 2L + 1L;
        field_706_j.setSeed((long)p_4055_2_ * l + (long)p_4055_3_ * l1 ^ field_700_p.func_22079_j());
        boolean flag = false;
        if(field_35563_t)
        {
            field_35558_f.func_35532_a(field_700_p, field_706_j, p_4055_2_, p_4055_3_);
            flag = field_35560_e.func_35532_a(field_700_p, field_706_j, p_4055_2_, p_4055_3_);
            field_35559_d.func_35532_a(field_700_p, field_706_j, p_4055_2_, p_4055_3_);
        }
        if(!flag && field_706_j.nextInt(4) == 0)
        {
            int k = i + field_706_j.nextInt(16) + 8;
            int i2 = field_706_j.nextInt(128);
            int i3 = j + field_706_j.nextInt(16) + 8;
            (new WorldGenLakes(Block.field_596_C.field_573_bc)).func_419_a(field_700_p, field_706_j, k, i2, i3);
        }
        if(!flag && field_706_j.nextInt(8) == 0)
        {
            int i1 = i + field_706_j.nextInt(16) + 8;
            int j2 = field_706_j.nextInt(field_706_j.nextInt(120) + 8);
            int j3 = j + field_706_j.nextInt(16) + 8;
            if(j2 < 63 || field_706_j.nextInt(10) == 0)
            {
                (new WorldGenLakes(Block.field_592_E.field_573_bc)).func_419_a(field_700_p, field_706_j, i1, j2, j3);
            }
        }
        for(int j1 = 0; j1 < 8; j1++)
        {
            int k2 = i + field_706_j.nextInt(16) + 8;
            int k3 = field_706_j.nextInt(128);
            int i4 = j + field_706_j.nextInt(16) + 8;
            if(!(new WorldGenDungeons()).func_419_a(field_700_p, field_706_j, k2, k3, i4));
        }

        biomegenbase.func_35513_a(field_700_p, field_706_j, i, j);
        SpawnerAnimals.func_35573_a(field_700_p, biomegenbase, i + 8, j + 8, 16, 16, field_706_j);
        i += 8;
        j += 8;
        for(int k1 = 0; k1 < 16; k1++)
        {
            for(int l2 = 0; l2 < 16; l2++)
            {
                int l3 = field_700_p.func_28100_e(i + k1, j + l2);
                if(field_700_p.func_40210_p(k1 + i, l3 - 1, l2 + j))
                {
                    field_700_p.func_508_d(k1 + i, l3 - 1, l2 + j, Block.field_4077_aU.field_573_bc);
                }
                if(field_700_p.func_40215_r(k1 + i, l3, l2 + j))
                {
                    field_700_p.func_508_d(k1 + i, l3, l2 + j, Block.field_625_aT.field_573_bc);
                }
            }

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
        BiomeGenBase biomegenbase = field_700_p.func_48091_a(p_40181_2_, p_40181_4_);
        if(biomegenbase == null)
        {
            return null;
        } else
        {
            return biomegenbase.func_25055_a(p_40181_1_);
        }
    }

    public ChunkPosition func_40182_a(World p_40182_1_, String p_40182_2_, int p_40182_3_, int p_40182_4_, int p_40182_5_)
    {
        if("Stronghold".equals(p_40182_2_) && field_35559_d != null)
        {
            return field_35559_d.func_40202_a(p_40182_1_, p_40182_3_, p_40182_4_, p_40182_5_);
        } else
        {
            return null;
        }
    }
}
