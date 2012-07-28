// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            MapGenStructure, World, WorldChunkManager, StructureVillageStart, 
//            BiomeGenBase, StructureStart

public class MapGenVillage extends MapGenStructure
{

    public static List field_35538_a;
    private final int field_46047_f;

    public MapGenVillage(int p_i14_1_)
    {
        field_46047_f = p_i14_1_;
    }

    protected boolean func_35531_a(int p_35531_1_, int p_35531_2_)
    {
        byte byte0 = 32;
        byte byte1 = 8;
        int i = p_35531_1_;
        int j = p_35531_2_;
        if(p_35531_1_ < 0)
        {
            p_35531_1_ -= byte0 - 1;
        }
        if(p_35531_2_ < 0)
        {
            p_35531_2_ -= byte0 - 1;
        }
        int k = p_35531_1_ / byte0;
        int l = p_35531_2_ / byte0;
        Random random = field_35530_d.func_35238_t(k, l, 0x9e7f70);
        k *= byte0;
        l *= byte0;
        k += random.nextInt(byte0 - byte1);
        l += random.nextInt(byte0 - byte1);
        p_35531_1_ = i;
        p_35531_2_ = j;
        if(p_35531_1_ == k && p_35531_2_ == l)
        {
            boolean flag = field_35530_d.func_4077_a().func_35141_a(p_35531_1_ * 16 + 8, p_35531_2_ * 16 + 8, 0, field_35538_a);
            if(flag)
            {
                return true;
            }
        }
        return false;
    }

    protected StructureStart func_35533_b(int p_35533_1_, int p_35533_2_)
    {
        return new StructureVillageStart(field_35530_d, field_946_b, p_35533_1_, p_35533_2_, field_46047_f);
    }

    static 
    {
        field_35538_a = Arrays.asList(new BiomeGenBase[] {
            BiomeGenBase.field_35520_c, BiomeGenBase.field_4293_h
        });
    }
}
