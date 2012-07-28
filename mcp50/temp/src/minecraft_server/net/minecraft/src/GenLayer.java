// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayerIsland, GenLayerFuzzyZoom, GenLayerAddIsland, GenLayerZoom, 
//            GenLayerAddSnow, GenLayerAddMushroomIsland, GenLayerRiverInit, GenLayerRiver, 
//            GenLayerSmooth, GenLayerBiome, GenLayerHills, GenLayerShore, 
//            GenLayerSwampRivers, GenLayerRiverMix, GenLayerVoronoiZoom, WorldType

public abstract class GenLayer
{

    private long field_35021_b;
    protected GenLayer field_35023_a;
    private long field_35022_c;
    private long field_35020_d;

    public static GenLayer[] func_48391_a(long p_48391_0_, WorldType p_48391_2_)
    {
        Object obj = new GenLayerIsland(1L);
        obj = new GenLayerFuzzyZoom(2000L, ((GenLayer) (obj)));
        obj = new GenLayerAddIsland(1L, ((GenLayer) (obj)));
        obj = new GenLayerZoom(2001L, ((GenLayer) (obj)));
        obj = new GenLayerAddIsland(2L, ((GenLayer) (obj)));
        obj = new GenLayerAddSnow(2L, ((GenLayer) (obj)));
        obj = new GenLayerZoom(2002L, ((GenLayer) (obj)));
        obj = new GenLayerAddIsland(3L, ((GenLayer) (obj)));
        obj = new GenLayerZoom(2003L, ((GenLayer) (obj)));
        obj = new GenLayerAddIsland(4L, ((GenLayer) (obj)));
        obj = new GenLayerAddMushroomIsland(5L, ((GenLayer) (obj)));
        byte byte0 = 4;
        Object obj1 = obj;
        obj1 = GenLayerZoom.func_35025_a(1000L, ((GenLayer) (obj1)), 0);
        obj1 = new GenLayerRiverInit(100L, ((GenLayer) (obj1)));
        obj1 = GenLayerZoom.func_35025_a(1000L, ((GenLayer) (obj1)), byte0 + 2);
        obj1 = new GenLayerRiver(1L, ((GenLayer) (obj1)));
        obj1 = new GenLayerSmooth(1000L, ((GenLayer) (obj1)));
        Object obj2 = obj;
        obj2 = GenLayerZoom.func_35025_a(1000L, ((GenLayer) (obj2)), 0);
        obj2 = new GenLayerBiome(200L, ((GenLayer) (obj2)), p_48391_2_);
        obj2 = GenLayerZoom.func_35025_a(1000L, ((GenLayer) (obj2)), 2);
        obj2 = new GenLayerHills(1000L, ((GenLayer) (obj2)));
        for(int i = 0; i < byte0; i++)
        {
            obj2 = new GenLayerZoom(1000 + i, ((GenLayer) (obj2)));
            if(i == 0)
            {
                obj2 = new GenLayerAddIsland(3L, ((GenLayer) (obj2)));
            }
            if(i == 1)
            {
                obj2 = new GenLayerShore(1000L, ((GenLayer) (obj2)));
            }
            if(i == 1)
            {
                obj2 = new GenLayerSwampRivers(1000L, ((GenLayer) (obj2)));
            }
        }

        obj2 = new GenLayerSmooth(1000L, ((GenLayer) (obj2)));
        obj2 = new GenLayerRiverMix(100L, ((GenLayer) (obj2)), ((GenLayer) (obj1)));
        GenLayerRiverMix genlayerrivermix = ((GenLayerRiverMix) (obj2));
        GenLayerVoronoiZoom genlayervoronoizoom = new GenLayerVoronoiZoom(10L, ((GenLayer) (obj2)));
        ((GenLayer) (obj2)).func_35015_b(p_48391_0_);
        genlayervoronoizoom.func_35015_b(p_48391_0_);
        return (new GenLayer[] {
            obj2, genlayervoronoizoom, genlayerrivermix
        });
    }

    public GenLayer(long p_i110_1_)
    {
        field_35020_d = p_i110_1_;
        field_35020_d *= field_35020_d * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35020_d += p_i110_1_;
        field_35020_d *= field_35020_d * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35020_d += p_i110_1_;
        field_35020_d *= field_35020_d * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35020_d += p_i110_1_;
    }

    public void func_35015_b(long p_35015_1_)
    {
        field_35021_b = p_35015_1_;
        if(field_35023_a != null)
        {
            field_35023_a.func_35015_b(p_35015_1_);
        }
        field_35021_b *= field_35021_b * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35021_b += field_35020_d;
        field_35021_b *= field_35021_b * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35021_b += field_35020_d;
        field_35021_b *= field_35021_b * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35021_b += field_35020_d;
    }

    public void func_35017_a(long p_35017_1_, long p_35017_3_)
    {
        field_35022_c = field_35021_b;
        field_35022_c *= field_35022_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35022_c += p_35017_1_;
        field_35022_c *= field_35022_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35022_c += p_35017_3_;
        field_35022_c *= field_35022_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35022_c += p_35017_1_;
        field_35022_c *= field_35022_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35022_c += p_35017_3_;
    }

    protected int func_35016_a(int p_35016_1_)
    {
        int i = (int)((field_35022_c >> 24) % (long)p_35016_1_);
        if(i < 0)
        {
            i += p_35016_1_;
        }
        field_35022_c *= field_35022_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35022_c += field_35021_b;
        return i;
    }

    public abstract int[] func_35018_a(int i, int j, int k, int l);
}
