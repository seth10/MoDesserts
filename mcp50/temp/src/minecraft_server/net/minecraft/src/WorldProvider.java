// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            World, WorldInfo, WorldType, WorldChunkManagerHell, 
//            BiomeGenBase, WorldChunkManager, ChunkProviderFlat, ChunkProviderGenerate, 
//            Block, BlockGrass, WorldProviderHell, WorldProviderSurface, 
//            WorldProviderEnd, IChunkProvider, ChunkCoordinates

public abstract class WorldProvider
{

    public World field_4302_a;
    public WorldType field_46120_b;
    public WorldChunkManager field_4301_b;
    public boolean field_6166_d;
    public boolean field_4306_c;
    public float field_4305_d[];
    public int field_6165_g;
    private float field_6164_h[];

    public WorldProvider()
    {
        field_6166_d = false;
        field_4306_c = false;
        field_4305_d = new float[16];
        field_6165_g = 0;
        field_6164_h = new float[4];
    }

    public final void func_4093_a(World p_4093_1_)
    {
        field_4302_a = p_4093_1_;
        field_46120_b = p_4093_1_.func_22081_n().func_46069_q();
        func_4090_a();
        func_4088_b();
    }

    protected void func_4088_b()
    {
        float f = 0.0F;
        for(int i = 0; i <= 15; i++)
        {
            float f1 = 1.0F - (float)i / 15F;
            field_4305_d[i] = ((1.0F - f1) / (f1 * 3F + 1.0F)) * (1.0F - f) + f;
        }

    }

    protected void func_4090_a()
    {
        if(field_4302_a.func_22081_n().func_46069_q() == WorldType.field_48458_c)
        {
            field_4301_b = new WorldChunkManagerHell(BiomeGenBase.field_35520_c, 0.5F, 0.5F);
        } else
        {
            field_4301_b = new WorldChunkManager(field_4302_a);
        }
    }

    public IChunkProvider func_4087_c()
    {
        if(field_46120_b == WorldType.field_48458_c)
        {
            return new ChunkProviderFlat(field_4302_a, field_4302_a.func_22079_j(), field_4302_a.func_22081_n().func_35499_o());
        } else
        {
            return new ChunkProviderGenerate(field_4302_a, field_4302_a.func_22079_j(), field_4302_a.func_22081_n().func_35499_o());
        }
    }

    public boolean func_4092_a(int p_4092_1_, int p_4092_2_)
    {
        int i = field_4302_a.func_528_f(p_4092_1_, p_4092_2_);
        return i == Block.field_534_v.field_573_bc;
    }

    public float func_4089_a(long p_4089_1_, float p_4089_3_)
    {
        int i = (int)(p_4089_1_ % 24000L);
        float f = ((float)i + p_4089_3_) / 24000F - 0.25F;
        if(f < 0.0F)
        {
            f++;
        }
        if(f > 1.0F)
        {
            f--;
        }
        float f1 = f;
        f = 1.0F - (float)((Math.cos((double)f * 3.1415926535897931D) + 1.0D) / 2D);
        f = f1 + (f - f1) / 3F;
        return f;
    }

    public boolean func_48567_d()
    {
        return true;
    }

    public boolean func_28108_d()
    {
        return true;
    }

    public static WorldProvider func_4091_a(int p_4091_0_)
    {
        if(p_4091_0_ == -1)
        {
            return new WorldProviderHell();
        }
        if(p_4091_0_ == 0)
        {
            return new WorldProviderSurface();
        }
        if(p_4091_0_ == 1)
        {
            return new WorldProviderEnd();
        } else
        {
            return null;
        }
    }

    public ChunkCoordinates func_40545_d()
    {
        return null;
    }

    public int func_46119_e()
    {
        return field_46120_b != WorldType.field_48458_c ? 64 : 4;
    }
}
