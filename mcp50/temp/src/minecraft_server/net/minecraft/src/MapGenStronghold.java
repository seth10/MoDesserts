// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            MapGenStructure, BiomeGenBase, ChunkCoordIntPair, World, 
//            WorldChunkManager, ChunkPosition, StructureStrongholdStart, ComponentStrongholdStairs2, 
//            StructureStart

public class MapGenStronghold extends MapGenStructure
{

    private BiomeGenBase field_35537_a[];
    private boolean field_35535_f;
    private ChunkCoordIntPair field_35536_g[];

    public MapGenStronghold()
    {
        field_35537_a = (new BiomeGenBase[] {
            BiomeGenBase.field_4293_h, BiomeGenBase.field_4297_d, BiomeGenBase.field_35518_e, BiomeGenBase.field_4299_b, BiomeGenBase.field_4294_g, BiomeGenBase.field_40462_n, BiomeGenBase.field_40463_o, BiomeGenBase.field_46083_s, BiomeGenBase.field_46082_t, BiomeGenBase.field_46080_v, 
            BiomeGenBase.field_48443_w, BiomeGenBase.field_48444_x
        });
        field_35536_g = new ChunkCoordIntPair[3];
    }

    protected boolean func_35531_a(int p_35531_1_, int p_35531_2_)
    {
        if(!field_35535_f)
        {
            Random random = new Random();
            random.setSeed(field_35530_d.func_22079_j());
            double d = random.nextDouble() * 3.1415926535897931D * 2D;
            for(int k = 0; k < field_35536_g.length; k++)
            {
                double d1 = (1.25D + random.nextDouble()) * 32D;
                int l = (int)Math.round(Math.cos(d) * d1);
                int i1 = (int)Math.round(Math.sin(d) * d1);
                ArrayList arraylist = new ArrayList();
                BiomeGenBase abiomegenbase[] = field_35537_a;
                int j1 = abiomegenbase.length;
                for(int k1 = 0; k1 < j1; k1++)
                {
                    BiomeGenBase biomegenbase = abiomegenbase[k1];
                    arraylist.add(biomegenbase);
                }

                ChunkPosition chunkposition = field_35530_d.func_4077_a().func_35139_a((l << 4) + 8, (i1 << 4) + 8, 112, arraylist, random);
                if(chunkposition != null)
                {
                    l = chunkposition.field_846_a >> 4;
                    i1 = chunkposition.field_847_c >> 4;
                } else
                {
                    System.out.println((new StringBuilder()).append("Placed stronghold in INVALID biome at (").append(l).append(", ").append(i1).append(")").toString());
                }
                field_35536_g[k] = new ChunkCoordIntPair(l, i1);
                d += 6.2831853071795862D / (double)field_35536_g.length;
            }

            field_35535_f = true;
        }
        ChunkCoordIntPair achunkcoordintpair[] = field_35536_g;
        int i = achunkcoordintpair.length;
        for(int j = 0; j < i; j++)
        {
            ChunkCoordIntPair chunkcoordintpair = achunkcoordintpair[j];
            if(p_35531_1_ == chunkcoordintpair.field_152_a && p_35531_2_ == chunkcoordintpair.field_151_b)
            {
                System.out.println((new StringBuilder()).append(p_35531_1_).append(", ").append(p_35531_2_).toString());
                return true;
            }
        }

        return false;
    }

    protected List func_40203_a()
    {
        ArrayList arraylist = new ArrayList();
        ChunkCoordIntPair achunkcoordintpair[] = field_35536_g;
        int i = achunkcoordintpair.length;
        for(int j = 0; j < i; j++)
        {
            ChunkCoordIntPair chunkcoordintpair = achunkcoordintpair[j];
            if(chunkcoordintpair != null)
            {
                arraylist.add(chunkcoordintpair.func_40658_a(64));
            }
        }

        return arraylist;
    }

    protected StructureStart func_35533_b(int p_35533_1_, int p_35533_2_)
    {
        StructureStrongholdStart structurestrongholdstart;
        for(structurestrongholdstart = new StructureStrongholdStart(field_35530_d, field_946_b, p_35533_1_, p_35533_2_); structurestrongholdstart.func_40208_c().isEmpty() || ((ComponentStrongholdStairs2)structurestrongholdstart.func_40208_c().get(0)).field_40317_b == null; structurestrongholdstart = new StructureStrongholdStart(field_35530_d, field_946_b, p_35533_1_, p_35533_2_)) { }
        return structurestrongholdstart;
    }
}
