// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WorldProvider, WorldChunkManagerHell, BiomeGenBase, ChunkProviderEnd, 
//            World, Block, Material, ChunkCoordinates, 
//            IChunkProvider

public class WorldProviderEnd extends WorldProvider
{

    public WorldProviderEnd()
    {
    }

    public void func_4090_a()
    {
        field_4301_b = new WorldChunkManagerHell(BiomeGenBase.field_28054_m, 0.5F, 0.0F);
        field_6165_g = 1;
        field_4306_c = true;
    }

    public IChunkProvider func_4087_c()
    {
        return new ChunkProviderEnd(field_4302_a, field_4302_a.func_22079_j());
    }

    public float func_4089_a(long p_4089_1_, float p_4089_3_)
    {
        return 0.0F;
    }

    public boolean func_28108_d()
    {
        return false;
    }

    public boolean func_48567_d()
    {
        return false;
    }

    public boolean func_4092_a(int p_4092_1_, int p_4092_2_)
    {
        int i = field_4302_a.func_528_f(p_4092_1_, p_4092_2_);
        if(i == 0)
        {
            return false;
        } else
        {
            return Block.field_542_n[i].field_553_bn.func_218_c();
        }
    }

    public ChunkCoordinates func_40545_d()
    {
        return new ChunkCoordinates(100, 50, 0);
    }

    public int func_46119_e()
    {
        return 50;
    }
}
