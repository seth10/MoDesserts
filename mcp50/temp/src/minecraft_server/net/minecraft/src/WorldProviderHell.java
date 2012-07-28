// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WorldProvider, WorldChunkManagerHell, BiomeGenBase, ChunkProviderHell, 
//            World, IChunkProvider

public class WorldProviderHell extends WorldProvider
{

    public WorldProviderHell()
    {
    }

    public void func_4090_a()
    {
        field_4301_b = new WorldChunkManagerHell(BiomeGenBase.field_4289_l, 1.0F, 0.0F);
        field_6166_d = true;
        field_4306_c = true;
        field_6165_g = -1;
    }

    protected void func_4088_b()
    {
        float f = 0.1F;
        for(int i = 0; i <= 15; i++)
        {
            float f1 = 1.0F - (float)i / 15F;
            field_4305_d[i] = ((1.0F - f1) / (f1 * 3F + 1.0F)) * (1.0F - f) + f;
        }

    }

    public IChunkProvider func_4087_c()
    {
        return new ChunkProviderHell(field_4302_a, field_4302_a.func_22079_j());
    }

    public boolean func_48567_d()
    {
        return false;
    }

    public boolean func_4092_a(int p_4092_1_, int p_4092_2_)
    {
        return false;
    }

    public float func_4089_a(long p_4089_1_, float p_4089_3_)
    {
        return 0.5F;
    }

    public boolean func_28108_d()
    {
        return false;
    }
}
