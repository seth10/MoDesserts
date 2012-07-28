// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            BiomeCache, BiomeGenBase, GenLayer, World, 
//            WorldInfo, IntCache, ChunkPosition, WorldType

public class WorldChunkManager
{

    private GenLayer field_34907_a;
    private GenLayer field_34906_b;
    private BiomeCache field_35145_e;
    private List field_35143_f;

    protected WorldChunkManager()
    {
        field_35145_e = new BiomeCache(this);
        field_35143_f = new ArrayList();
        field_35143_f.add(BiomeGenBase.field_4297_d);
        field_35143_f.add(BiomeGenBase.field_35520_c);
        field_35143_f.add(BiomeGenBase.field_4294_g);
        field_35143_f.add(BiomeGenBase.field_46081_u);
        field_35143_f.add(BiomeGenBase.field_46082_t);
        field_35143_f.add(BiomeGenBase.field_48443_w);
        field_35143_f.add(BiomeGenBase.field_48444_x);
    }

    public WorldChunkManager(long p_i1000_1_, WorldType p_i1000_3_)
    {
        this();
        GenLayer agenlayer[] = GenLayer.func_48391_a(p_i1000_1_, p_i1000_3_);
        field_34907_a = agenlayer[0];
        field_34906_b = agenlayer[1];
    }

    public WorldChunkManager(World p_i589_1_)
    {
        this(p_i589_1_.func_22079_j(), p_i589_1_.func_22081_n().func_46069_q());
    }

    public List func_35137_a()
    {
        return field_35143_f;
    }

    public BiomeGenBase func_4067_a(int p_4067_1_, int p_4067_2_)
    {
        return field_35145_e.func_35683_a(p_4067_1_, p_4067_2_);
    }

    public float[] func_4065_a(float p_4065_1_[], int p_4065_2_, int p_4065_3_, int p_4065_4_, int p_4065_5_)
    {
        IntCache.func_35550_a();
        if(p_4065_1_ == null || p_4065_1_.length < p_4065_4_ * p_4065_5_)
        {
            p_4065_1_ = new float[p_4065_4_ * p_4065_5_];
        }
        int ai[] = field_34906_b.func_35018_a(p_4065_2_, p_4065_3_, p_4065_4_, p_4065_5_);
        for(int i = 0; i < p_4065_4_ * p_4065_5_; i++)
        {
            float f = (float)BiomeGenBase.field_35521_a[ai[i]].func_35510_e() / 65536F;
            if(f > 1.0F)
            {
                f = 1.0F;
            }
            p_4065_1_[i] = f;
        }

        return p_4065_1_;
    }

    public float[] func_4068_a(float p_4068_1_[], int p_4068_2_, int p_4068_3_, int p_4068_4_, int p_4068_5_)
    {
        IntCache.func_35550_a();
        if(p_4068_1_ == null || p_4068_1_.length < p_4068_4_ * p_4068_5_)
        {
            p_4068_1_ = new float[p_4068_4_ * p_4068_5_];
        }
        int ai[] = field_34906_b.func_35018_a(p_4068_2_, p_4068_3_, p_4068_4_, p_4068_5_);
        for(int i = 0; i < p_4068_4_ * p_4068_5_; i++)
        {
            float f = (float)BiomeGenBase.field_35521_a[ai[i]].func_35509_f() / 65536F;
            if(f > 1.0F)
            {
                f = 1.0F;
            }
            p_4068_1_[i] = f;
        }

        return p_4068_1_;
    }

    public BiomeGenBase[] func_35142_b(BiomeGenBase p_35142_1_[], int p_35142_2_, int p_35142_3_, int p_35142_4_, int p_35142_5_)
    {
        IntCache.func_35550_a();
        if(p_35142_1_ == null || p_35142_1_.length < p_35142_4_ * p_35142_5_)
        {
            p_35142_1_ = new BiomeGenBase[p_35142_4_ * p_35142_5_];
        }
        int ai[] = field_34907_a.func_35018_a(p_35142_2_, p_35142_3_, p_35142_4_, p_35142_5_);
        for(int i = 0; i < p_35142_4_ * p_35142_5_; i++)
        {
            p_35142_1_[i] = BiomeGenBase.field_35521_a[ai[i]];
        }

        return p_35142_1_;
    }

    public BiomeGenBase[] func_4064_a(BiomeGenBase p_4064_1_[], int p_4064_2_, int p_4064_3_, int p_4064_4_, int p_4064_5_)
    {
        return func_35140_a(p_4064_1_, p_4064_2_, p_4064_3_, p_4064_4_, p_4064_5_, true);
    }

    public BiomeGenBase[] func_35140_a(BiomeGenBase p_35140_1_[], int p_35140_2_, int p_35140_3_, int p_35140_4_, int p_35140_5_, boolean p_35140_6_)
    {
        IntCache.func_35550_a();
        if(p_35140_1_ == null || p_35140_1_.length < p_35140_4_ * p_35140_5_)
        {
            p_35140_1_ = new BiomeGenBase[p_35140_4_ * p_35140_5_];
        }
        if(p_35140_6_ && p_35140_4_ == 16 && p_35140_5_ == 16 && (p_35140_2_ & 0xf) == 0 && (p_35140_3_ & 0xf) == 0)
        {
            BiomeGenBase abiomegenbase[] = field_35145_e.func_35682_b(p_35140_2_, p_35140_3_);
            System.arraycopy(abiomegenbase, 0, p_35140_1_, 0, p_35140_4_ * p_35140_5_);
            return p_35140_1_;
        }
        int ai[] = field_34906_b.func_35018_a(p_35140_2_, p_35140_3_, p_35140_4_, p_35140_5_);
        for(int i = 0; i < p_35140_4_ * p_35140_5_; i++)
        {
            p_35140_1_[i] = BiomeGenBase.field_35521_a[ai[i]];
        }

        return p_35140_1_;
    }

    public boolean func_35141_a(int p_35141_1_, int p_35141_2_, int p_35141_3_, List p_35141_4_)
    {
        int i = p_35141_1_ - p_35141_3_ >> 2;
        int j = p_35141_2_ - p_35141_3_ >> 2;
        int k = p_35141_1_ + p_35141_3_ >> 2;
        int l = p_35141_2_ + p_35141_3_ >> 2;
        int i1 = (k - i) + 1;
        int j1 = (l - j) + 1;
        int ai[] = field_34907_a.func_35018_a(i, j, i1, j1);
        for(int k1 = 0; k1 < i1 * j1; k1++)
        {
            BiomeGenBase biomegenbase = BiomeGenBase.field_35521_a[ai[k1]];
            if(!p_35141_4_.contains(biomegenbase))
            {
                return false;
            }
        }

        return true;
    }

    public ChunkPosition func_35139_a(int p_35139_1_, int p_35139_2_, int p_35139_3_, List p_35139_4_, Random p_35139_5_)
    {
        int i = p_35139_1_ - p_35139_3_ >> 2;
        int j = p_35139_2_ - p_35139_3_ >> 2;
        int k = p_35139_1_ + p_35139_3_ >> 2;
        int l = p_35139_2_ + p_35139_3_ >> 2;
        int i1 = (k - i) + 1;
        int j1 = (l - j) + 1;
        int ai[] = field_34907_a.func_35018_a(i, j, i1, j1);
        ChunkPosition chunkposition = null;
        int k1 = 0;
        for(int l1 = 0; l1 < ai.length; l1++)
        {
            int i2 = i + l1 % i1 << 2;
            int j2 = j + l1 / i1 << 2;
            BiomeGenBase biomegenbase = BiomeGenBase.field_35521_a[ai[l1]];
            if(p_35139_4_.contains(biomegenbase) && (chunkposition == null || p_35139_5_.nextInt(k1 + 1) == 0))
            {
                chunkposition = new ChunkPosition(i2, 0, j2);
                k1++;
            }
        }

        return chunkposition;
    }

    public void func_35138_b()
    {
        field_35145_e.func_35681_a();
    }
}
