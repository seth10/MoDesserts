// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            MapGenBase, ChunkCoordIntPair, StructureStart, StructureBoundingBox, 
//            StructureComponent, World, ChunkPosition, IChunkProvider

public abstract class MapGenStructure extends MapGenBase
{

    protected HashMap field_35534_e;

    public MapGenStructure()
    {
        field_35534_e = new HashMap();
    }

    public void func_667_a(IChunkProvider p_667_1_, World p_667_2_, int p_667_3_, int p_667_4_, byte p_667_5_[])
    {
        super.func_667_a(p_667_1_, p_667_2_, p_667_3_, p_667_4_, p_667_5_);
    }

    protected void func_666_a(World p_666_1_, int p_666_2_, int p_666_3_, int p_666_4_, int p_666_5_, byte p_666_6_[])
    {
        if(field_35534_e.containsKey(Long.valueOf(ChunkCoordIntPair.func_22006_a(p_666_2_, p_666_3_))))
        {
            return;
        }
        field_946_b.nextInt();
        if(func_35531_a(p_666_2_, p_666_3_))
        {
            StructureStart structurestart = func_35533_b(p_666_2_, p_666_3_);
            field_35534_e.put(Long.valueOf(ChunkCoordIntPair.func_22006_a(p_666_2_, p_666_3_)), structurestart);
        }
    }

    public boolean func_35532_a(World p_35532_1_, Random p_35532_2_, int p_35532_3_, int p_35532_4_)
    {
        int i = (p_35532_3_ << 4) + 8;
        int j = (p_35532_4_ << 4) + 8;
        boolean flag = false;
        Iterator iterator = field_35534_e.values().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            StructureStart structurestart = (StructureStart)iterator.next();
            if(structurestart.func_35542_a() && structurestart.func_35543_b().func_35671_a(i, j, i + 15, j + 15))
            {
                structurestart.func_35541_a(p_35532_1_, p_35532_2_, new StructureBoundingBox(i, j, i + 15, j + 15));
                flag = true;
            }
        } while(true);
        return flag;
    }

    public boolean func_40204_a(int p_40204_1_, int p_40204_2_, int p_40204_3_)
    {
        Iterator iterator = field_35534_e.values().iterator();
label0:
        do
        {
            if(iterator.hasNext())
            {
                StructureStart structurestart = (StructureStart)iterator.next();
                if(!structurestart.func_35542_a() || !structurestart.func_35543_b().func_35671_a(p_40204_1_, p_40204_3_, p_40204_1_, p_40204_3_))
                {
                    continue;
                }
                Iterator iterator1 = structurestart.func_40208_c().iterator();
                StructureComponent structurecomponent;
                do
                {
                    if(!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    structurecomponent = (StructureComponent)iterator1.next();
                } while(!structurecomponent.func_35313_b().func_35667_b(p_40204_1_, p_40204_2_, p_40204_3_));
                break;
            } else
            {
                return false;
            }
        } while(true);
        return true;
    }

    public ChunkPosition func_40202_a(World p_40202_1_, int p_40202_2_, int p_40202_3_, int p_40202_4_)
    {
        field_35530_d = p_40202_1_;
        field_946_b.setSeed(p_40202_1_.func_22079_j());
        long l = field_946_b.nextLong();
        long l1 = field_946_b.nextLong();
        long l2 = (long)(p_40202_2_ >> 4) * l;
        long l3 = (long)(p_40202_4_ >> 4) * l1;
        field_946_b.setSeed(l2 ^ l3 ^ p_40202_1_.func_22079_j());
        func_666_a(p_40202_1_, p_40202_2_ >> 4, p_40202_4_ >> 4, 0, 0, null);
        double d = 1.7976931348623157E+308D;
        ChunkPosition chunkposition = null;
        Object obj = field_35534_e.values().iterator();
        do
        {
            if(!((Iterator) (obj)).hasNext())
            {
                break;
            }
            StructureStart structurestart = (StructureStart)((Iterator) (obj)).next();
            if(structurestart.func_35542_a())
            {
                StructureComponent structurecomponent = (StructureComponent)structurestart.func_40208_c().get(0);
                ChunkPosition chunkposition2 = structurecomponent.func_40281_b_();
                int i = chunkposition2.field_846_a - p_40202_2_;
                int k = chunkposition2.field_845_b - p_40202_3_;
                int j1 = chunkposition2.field_847_c - p_40202_4_;
                double d1 = i + i * k * k + j1 * j1;
                if(d1 < d)
                {
                    d = d1;
                    chunkposition = chunkposition2;
                }
            }
        } while(true);
        if(chunkposition != null)
        {
            return chunkposition;
        }
        obj = func_40203_a();
        if(obj != null)
        {
            ChunkPosition chunkposition1 = null;
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                ChunkPosition chunkposition3 = (ChunkPosition)iterator.next();
                int j = chunkposition3.field_846_a - p_40202_2_;
                int i1 = chunkposition3.field_845_b - p_40202_3_;
                int k1 = chunkposition3.field_847_c - p_40202_4_;
                double d2 = j + j * i1 * i1 + k1 * k1;
                if(d2 < d)
                {
                    d = d2;
                    chunkposition1 = chunkposition3;
                }
            } while(true);
            return chunkposition1;
        } else
        {
            return null;
        }
    }

    protected List func_40203_a()
    {
        return null;
    }

    protected abstract boolean func_35531_a(int i, int j);

    protected abstract StructureStart func_35533_b(int i, int j);
}
