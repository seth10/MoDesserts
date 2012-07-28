// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            WorldChunkManager, BiomeGenBase, ChunkPosition

public class WorldChunkManagerHell extends WorldChunkManager
{

    private BiomeGenBase field_4262_e;
    private float field_4261_f;
    private float field_4260_g;

    public WorldChunkManagerHell(BiomeGenBase p_i181_1_, float p_i181_2_, float p_i181_3_)
    {
        field_4262_e = p_i181_1_;
        field_4261_f = p_i181_2_;
        field_4260_g = p_i181_3_;
    }

    public BiomeGenBase func_4067_a(int p_4067_1_, int p_4067_2_)
    {
        return field_4262_e;
    }

    public BiomeGenBase[] func_35142_b(BiomeGenBase p_35142_1_[], int p_35142_2_, int p_35142_3_, int p_35142_4_, int p_35142_5_)
    {
        if(p_35142_1_ == null || p_35142_1_.length < p_35142_4_ * p_35142_5_)
        {
            p_35142_1_ = new BiomeGenBase[p_35142_4_ * p_35142_5_];
        }
        Arrays.fill(p_35142_1_, 0, p_35142_4_ * p_35142_5_, field_4262_e);
        return p_35142_1_;
    }

    public float[] func_4068_a(float p_4068_1_[], int p_4068_2_, int p_4068_3_, int p_4068_4_, int p_4068_5_)
    {
        if(p_4068_1_ == null || p_4068_1_.length < p_4068_4_ * p_4068_5_)
        {
            p_4068_1_ = new float[p_4068_4_ * p_4068_5_];
        }
        Arrays.fill(p_4068_1_, 0, p_4068_4_ * p_4068_5_, field_4261_f);
        return p_4068_1_;
    }

    public float[] func_4065_a(float p_4065_1_[], int p_4065_2_, int p_4065_3_, int p_4065_4_, int p_4065_5_)
    {
        if(p_4065_1_ == null || p_4065_1_.length < p_4065_4_ * p_4065_5_)
        {
            p_4065_1_ = new float[p_4065_4_ * p_4065_5_];
        }
        Arrays.fill(p_4065_1_, 0, p_4065_4_ * p_4065_5_, field_4260_g);
        return p_4065_1_;
    }

    public BiomeGenBase[] func_4064_a(BiomeGenBase p_4064_1_[], int p_4064_2_, int p_4064_3_, int p_4064_4_, int p_4064_5_)
    {
        if(p_4064_1_ == null || p_4064_1_.length < p_4064_4_ * p_4064_5_)
        {
            p_4064_1_ = new BiomeGenBase[p_4064_4_ * p_4064_5_];
        }
        Arrays.fill(p_4064_1_, 0, p_4064_4_ * p_4064_5_, field_4262_e);
        return p_4064_1_;
    }

    public BiomeGenBase[] func_35140_a(BiomeGenBase p_35140_1_[], int p_35140_2_, int p_35140_3_, int p_35140_4_, int p_35140_5_, boolean p_35140_6_)
    {
        return func_4064_a(p_35140_1_, p_35140_2_, p_35140_3_, p_35140_4_, p_35140_5_);
    }

    public ChunkPosition func_35139_a(int p_35139_1_, int p_35139_2_, int p_35139_3_, List p_35139_4_, Random p_35139_5_)
    {
        if(p_35139_4_.contains(field_4262_e))
        {
            return new ChunkPosition((p_35139_1_ - p_35139_3_) + p_35139_5_.nextInt(p_35139_3_ * 2 + 1), 0, (p_35139_2_ - p_35139_3_) + p_35139_5_.nextInt(p_35139_3_ * 2 + 1));
        } else
        {
            return null;
        }
    }

    public boolean func_35141_a(int p_35141_1_, int p_35141_2_, int p_35141_3_, List p_35141_4_)
    {
        return p_35141_4_.contains(field_4262_e);
    }
}
