// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            MapGenStructure, StructureMineshaftStart, StructureStart

public class MapGenMineshaft extends MapGenStructure
{

    public MapGenMineshaft()
    {
    }

    protected boolean func_35531_a(int p_35531_1_, int p_35531_2_)
    {
        return field_946_b.nextInt(100) == 0 && field_946_b.nextInt(80) < Math.max(Math.abs(p_35531_1_), Math.abs(p_35531_2_));
    }

    protected StructureStart func_35533_b(int p_35533_1_, int p_35533_2_)
    {
        return new StructureMineshaftStart(field_35530_d, field_946_b, p_35533_1_, p_35533_2_);
    }
}
