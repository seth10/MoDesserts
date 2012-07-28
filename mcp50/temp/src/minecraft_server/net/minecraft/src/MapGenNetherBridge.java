// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            MapGenStructure, SpawnListEntry, EntityBlaze, EntityPigZombie, 
//            EntityMagmaCube, World, StructureNetherBridgeStart, StructureStart

public class MapGenNetherBridge extends MapGenStructure
{

    private List field_40206_a;

    public MapGenNetherBridge()
    {
        field_40206_a = new ArrayList();
        field_40206_a.add(new SpawnListEntry(net.minecraft.src.EntityBlaze.class, 10, 2, 3));
        field_40206_a.add(new SpawnListEntry(net.minecraft.src.EntityPigZombie.class, 10, 4, 4));
        field_40206_a.add(new SpawnListEntry(net.minecraft.src.EntityMagmaCube.class, 3, 4, 4));
    }

    public List func_40205_b()
    {
        return field_40206_a;
    }

    protected boolean func_35531_a(int p_35531_1_, int p_35531_2_)
    {
        int i = p_35531_1_ >> 4;
        int j = p_35531_2_ >> 4;
        field_946_b.setSeed((long)(i ^ j << 4) ^ field_35530_d.func_22079_j());
        field_946_b.nextInt();
        if(field_946_b.nextInt(3) != 0)
        {
            return false;
        }
        if(p_35531_1_ != (i << 4) + 4 + field_946_b.nextInt(8))
        {
            return false;
        }
        return p_35531_2_ == (j << 4) + 4 + field_946_b.nextInt(8);
    }

    protected StructureStart func_35533_b(int p_35533_1_, int p_35533_2_)
    {
        return new StructureNetherBridgeStart(field_35530_d, field_946_b, p_35533_1_, p_35533_2_);
    }
}
