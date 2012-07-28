// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenClay, WorldGenSand, Block, WorldGenMinable, 
//            WorldGenFlowers, BlockFlower, WorldGenBigMushroom, WorldGenReed, 
//            WorldGenCactus, WorldGenWaterlily, World, WorldGenerator, 
//            BiomeGenBase, WorldGenDeadBush, BlockDeadBush, WorldGenPumpkin, 
//            WorldGenLiquids

public class BiomeDecorator
{

    protected World field_35262_B;
    protected Random field_35263_C;
    protected int field_35258_D;
    protected int field_35259_E;
    protected BiomeGenBase field_35260_F;
    protected WorldGenerator field_35270_a;
    protected WorldGenerator field_35268_b;
    protected WorldGenerator field_35269_c;
    protected WorldGenerator field_35266_d;
    protected WorldGenerator field_35267_e;
    protected WorldGenerator field_35264_f;
    protected WorldGenerator field_35265_g;
    protected WorldGenerator field_35277_h;
    protected WorldGenerator field_35278_i;
    protected WorldGenerator field_35275_j;
    protected WorldGenerator field_35276_k;
    protected WorldGenerator field_35273_l;
    protected WorldGenerator field_35274_m;
    protected WorldGenerator field_35271_n;
    protected WorldGenerator field_35272_o;
    protected WorldGenerator field_40320_u;
    protected WorldGenerator field_35286_p;
    protected WorldGenerator field_35285_q;
    protected WorldGenerator field_40322_x;
    protected int field_40321_y;
    protected int field_35284_r;
    protected int field_35283_s;
    protected int field_35282_t;
    protected int field_35281_u;
    protected int field_35280_v;
    protected int field_35279_w;
    protected int field_35289_x;
    protected int field_35288_y;
    protected int field_35287_z;
    protected int field_35261_A;
    protected int field_40318_J;
    public boolean field_40319_K;

    public BiomeDecorator(BiomeGenBase p_i158_1_)
    {
        field_35270_a = new WorldGenClay(4);
        field_35268_b = new WorldGenSand(7, Block.field_590_F.field_573_bc);
        field_35269_c = new WorldGenSand(6, Block.field_4062_G.field_573_bc);
        field_35266_d = new WorldGenMinable(Block.field_533_w.field_573_bc, 32);
        field_35267_e = new WorldGenMinable(Block.field_4062_G.field_573_bc, 32);
        field_35264_f = new WorldGenMinable(Block.field_583_J.field_573_bc, 16);
        field_35265_g = new WorldGenMinable(Block.field_4059_I.field_573_bc, 8);
        field_35277_h = new WorldGenMinable(Block.field_4061_H.field_573_bc, 8);
        field_35278_i = new WorldGenMinable(Block.field_630_aO.field_573_bc, 7);
        field_35275_j = new WorldGenMinable(Block.field_588_ax.field_573_bc, 7);
        field_35276_k = new WorldGenMinable(Block.field_9042_N.field_573_bc, 6);
        field_35273_l = new WorldGenFlowers(Block.field_4072_ae.field_573_bc);
        field_35274_m = new WorldGenFlowers(Block.field_4071_af.field_573_bc);
        field_35271_n = new WorldGenFlowers(Block.field_4070_ag.field_573_bc);
        field_35272_o = new WorldGenFlowers(Block.field_4069_ah.field_573_bc);
        field_40320_u = new WorldGenBigMushroom();
        field_35286_p = new WorldGenReed();
        field_35285_q = new WorldGenCactus();
        field_40322_x = new WorldGenWaterlily();
        field_40321_y = 0;
        field_35284_r = 0;
        field_35283_s = 2;
        field_35282_t = 1;
        field_35281_u = 0;
        field_35280_v = 0;
        field_35279_w = 0;
        field_35289_x = 0;
        field_35288_y = 1;
        field_35287_z = 3;
        field_35261_A = 1;
        field_40318_J = 0;
        field_40319_K = true;
        field_35260_F = p_i158_1_;
    }

    public void func_35255_a(World p_35255_1_, Random p_35255_2_, int p_35255_3_, int p_35255_4_)
    {
        if(field_35262_B != null)
        {
            throw new RuntimeException("Already decorating!!");
        } else
        {
            field_35262_B = p_35255_1_;
            field_35263_C = p_35255_2_;
            field_35258_D = p_35255_3_;
            field_35259_E = p_35255_4_;
            func_35256_b();
            field_35262_B = null;
            field_35263_C = null;
            return;
        }
    }

    protected void func_35256_b()
    {
        func_35253_a();
        for(int i = 0; i < field_35287_z; i++)
        {
            int i1 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int k5 = field_35259_E + field_35263_C.nextInt(16) + 8;
            field_35268_b.func_419_a(field_35262_B, field_35263_C, i1, field_35262_B.func_4075_e(i1, k5), k5);
        }

        for(int j = 0; j < field_35261_A; j++)
        {
            int j1 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int l5 = field_35259_E + field_35263_C.nextInt(16) + 8;
            field_35270_a.func_419_a(field_35262_B, field_35263_C, j1, field_35262_B.func_4075_e(j1, l5), l5);
        }

        for(int k = 0; k < field_35288_y; k++)
        {
            int k1 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int i6 = field_35259_E + field_35263_C.nextInt(16) + 8;
            field_35268_b.func_419_a(field_35262_B, field_35263_C, k1, field_35262_B.func_4075_e(k1, i6), i6);
        }

        int l = field_35284_r;
        if(field_35263_C.nextInt(10) == 0)
        {
            l++;
        }
        for(int l1 = 0; l1 < l; l1++)
        {
            int j6 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int k10 = field_35259_E + field_35263_C.nextInt(16) + 8;
            WorldGenerator worldgenerator = field_35260_F.func_21114_a(field_35263_C);
            worldgenerator.func_420_a(1.0D, 1.0D, 1.0D);
            worldgenerator.func_419_a(field_35262_B, field_35263_C, j6, field_35262_B.func_488_c(j6, k10), k10);
        }

        for(int i2 = 0; i2 < field_40318_J; i2++)
        {
            int k6 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int l10 = field_35259_E + field_35263_C.nextInt(16) + 8;
            field_40320_u.func_419_a(field_35262_B, field_35263_C, k6, field_35262_B.func_488_c(k6, l10), l10);
        }

        for(int j2 = 0; j2 < field_35283_s; j2++)
        {
            int l6 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int i11 = field_35263_C.nextInt(128);
            int l14 = field_35259_E + field_35263_C.nextInt(16) + 8;
            field_35273_l.func_419_a(field_35262_B, field_35263_C, l6, i11, l14);
            if(field_35263_C.nextInt(4) == 0)
            {
                int i7 = field_35258_D + field_35263_C.nextInt(16) + 8;
                int j11 = field_35263_C.nextInt(128);
                int i15 = field_35259_E + field_35263_C.nextInt(16) + 8;
                field_35274_m.func_419_a(field_35262_B, field_35263_C, i7, j11, i15);
            }
        }

        for(int k2 = 0; k2 < field_35282_t; k2++)
        {
            int j7 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int k11 = field_35263_C.nextInt(128);
            int j15 = field_35259_E + field_35263_C.nextInt(16) + 8;
            WorldGenerator worldgenerator1 = field_35260_F.func_48440_b(field_35263_C);
            worldgenerator1.func_419_a(field_35262_B, field_35263_C, j7, k11, j15);
        }

        for(int l2 = 0; l2 < field_35281_u; l2++)
        {
            int k7 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int l11 = field_35263_C.nextInt(128);
            int k15 = field_35259_E + field_35263_C.nextInt(16) + 8;
            (new WorldGenDeadBush(Block.field_9030_Y.field_573_bc)).func_419_a(field_35262_B, field_35263_C, k7, l11, k15);
        }

        for(int i3 = 0; i3 < field_40321_y; i3++)
        {
            int l7 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int i12 = field_35259_E + field_35263_C.nextInt(16) + 8;
            int l15;
            for(l15 = field_35263_C.nextInt(128); l15 > 0 && field_35262_B.func_444_a(l7, l15 - 1, i12) == 0; l15--) { }
            field_40322_x.func_419_a(field_35262_B, field_35263_C, l7, l15, i12);
        }

        for(int j3 = 0; j3 < field_35280_v; j3++)
        {
            if(field_35263_C.nextInt(4) == 0)
            {
                int i8 = field_35258_D + field_35263_C.nextInt(16) + 8;
                int j12 = field_35259_E + field_35263_C.nextInt(16) + 8;
                int i16 = field_35262_B.func_488_c(i8, j12);
                field_35271_n.func_419_a(field_35262_B, field_35263_C, i8, i16, j12);
            }
            if(field_35263_C.nextInt(8) == 0)
            {
                int j8 = field_35258_D + field_35263_C.nextInt(16) + 8;
                int k12 = field_35259_E + field_35263_C.nextInt(16) + 8;
                int j16 = field_35263_C.nextInt(128);
                field_35272_o.func_419_a(field_35262_B, field_35263_C, j8, j16, k12);
            }
        }

        if(field_35263_C.nextInt(4) == 0)
        {
            int k3 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int k8 = field_35263_C.nextInt(128);
            int l12 = field_35259_E + field_35263_C.nextInt(16) + 8;
            field_35271_n.func_419_a(field_35262_B, field_35263_C, k3, k8, l12);
        }
        if(field_35263_C.nextInt(8) == 0)
        {
            int l3 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int l8 = field_35263_C.nextInt(128);
            int i13 = field_35259_E + field_35263_C.nextInt(16) + 8;
            field_35272_o.func_419_a(field_35262_B, field_35263_C, l3, l8, i13);
        }
        for(int i4 = 0; i4 < field_35279_w; i4++)
        {
            int i9 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int j13 = field_35259_E + field_35263_C.nextInt(16) + 8;
            int k16 = field_35263_C.nextInt(128);
            field_35286_p.func_419_a(field_35262_B, field_35263_C, i9, k16, j13);
        }

        for(int j4 = 0; j4 < 10; j4++)
        {
            int j9 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int k13 = field_35263_C.nextInt(128);
            int l16 = field_35259_E + field_35263_C.nextInt(16) + 8;
            field_35286_p.func_419_a(field_35262_B, field_35263_C, j9, k13, l16);
        }

        if(field_35263_C.nextInt(32) == 0)
        {
            int k4 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int k9 = field_35263_C.nextInt(128);
            int l13 = field_35259_E + field_35263_C.nextInt(16) + 8;
            (new WorldGenPumpkin()).func_419_a(field_35262_B, field_35263_C, k4, k9, l13);
        }
        for(int l4 = 0; l4 < field_35289_x; l4++)
        {
            int l9 = field_35258_D + field_35263_C.nextInt(16) + 8;
            int i14 = field_35263_C.nextInt(128);
            int i17 = field_35259_E + field_35263_C.nextInt(16) + 8;
            field_35285_q.func_419_a(field_35262_B, field_35263_C, l9, i14, i17);
        }

        if(field_40319_K)
        {
            for(int i5 = 0; i5 < 50; i5++)
            {
                int i10 = field_35258_D + field_35263_C.nextInt(16) + 8;
                int j14 = field_35263_C.nextInt(field_35263_C.nextInt(120) + 8);
                int j17 = field_35259_E + field_35263_C.nextInt(16) + 8;
                (new WorldGenLiquids(Block.field_598_B.field_573_bc)).func_419_a(field_35262_B, field_35263_C, i10, j14, j17);
            }

            for(int j5 = 0; j5 < 20; j5++)
            {
                int j10 = field_35258_D + field_35263_C.nextInt(16) + 8;
                int k14 = field_35263_C.nextInt(field_35263_C.nextInt(field_35263_C.nextInt(112) + 8) + 8);
                int k17 = field_35259_E + field_35263_C.nextInt(16) + 8;
                (new WorldGenLiquids(Block.field_594_D.field_573_bc)).func_419_a(field_35262_B, field_35263_C, j10, k14, k17);
            }

        }
    }

    protected void func_35257_a(int p_35257_1_, WorldGenerator p_35257_2_, int p_35257_3_, int p_35257_4_)
    {
        for(int i = 0; i < p_35257_1_; i++)
        {
            int j = field_35258_D + field_35263_C.nextInt(16);
            int k = field_35263_C.nextInt(p_35257_4_ - p_35257_3_) + p_35257_3_;
            int l = field_35259_E + field_35263_C.nextInt(16);
            p_35257_2_.func_419_a(field_35262_B, field_35263_C, j, k, l);
        }

    }

    protected void func_35254_b(int p_35254_1_, WorldGenerator p_35254_2_, int p_35254_3_, int p_35254_4_)
    {
        for(int i = 0; i < p_35254_1_; i++)
        {
            int j = field_35258_D + field_35263_C.nextInt(16);
            int k = field_35263_C.nextInt(p_35254_4_) + field_35263_C.nextInt(p_35254_4_) + (p_35254_3_ - p_35254_4_);
            int l = field_35259_E + field_35263_C.nextInt(16);
            p_35254_2_.func_419_a(field_35262_B, field_35263_C, j, k, l);
        }

    }

    protected void func_35253_a()
    {
        func_35257_a(20, field_35266_d, 0, 128);
        func_35257_a(10, field_35267_e, 0, 128);
        func_35257_a(20, field_35264_f, 0, 128);
        func_35257_a(20, field_35265_g, 0, 64);
        func_35257_a(2, field_35277_h, 0, 32);
        func_35257_a(8, field_35278_i, 0, 16);
        func_35257_a(1, field_35275_j, 0, 16);
        func_35254_b(1, field_35276_k, 16, 16);
    }
}
