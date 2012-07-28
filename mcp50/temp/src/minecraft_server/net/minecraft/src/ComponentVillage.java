// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureVillagePieces, World, 
//            WorldProvider, EntityVillager, ComponentVillageStartPiece

abstract class ComponentVillage extends StructureComponent
{

    private int field_39005_a;

    protected ComponentVillage(int p_i473_1_)
    {
        super(p_i473_1_);
    }

    protected StructureComponent func_35368_a(ComponentVillageStartPiece p_35368_1_, List p_35368_2_, Random p_35368_3_, int p_35368_4_, int p_35368_5_)
    {
        switch(field_35317_h)
        {
        case 2: // '\002'
            return StructureVillagePieces.func_35640_a(p_35368_1_, p_35368_2_, p_35368_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + p_35368_4_, field_35316_g.field_35677_c + p_35368_5_, 1, func_35305_c());

        case 0: // '\0'
            return StructureVillagePieces.func_35640_a(p_35368_1_, p_35368_2_, p_35368_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + p_35368_4_, field_35316_g.field_35677_c + p_35368_5_, 1, func_35305_c());

        case 1: // '\001'
            return StructureVillagePieces.func_35640_a(p_35368_1_, p_35368_2_, p_35368_3_, field_35316_g.field_35678_a + p_35368_5_, field_35316_g.field_35676_b + p_35368_4_, field_35316_g.field_35677_c - 1, 2, func_35305_c());

        case 3: // '\003'
            return StructureVillagePieces.func_35640_a(p_35368_1_, p_35368_2_, p_35368_3_, field_35316_g.field_35678_a + p_35368_5_, field_35316_g.field_35676_b + p_35368_4_, field_35316_g.field_35677_c - 1, 2, func_35305_c());
        }
        return null;
    }

    protected StructureComponent func_35369_b(ComponentVillageStartPiece p_35369_1_, List p_35369_2_, Random p_35369_3_, int p_35369_4_, int p_35369_5_)
    {
        switch(field_35317_h)
        {
        case 2: // '\002'
            return StructureVillagePieces.func_35640_a(p_35369_1_, p_35369_2_, p_35369_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + p_35369_4_, field_35316_g.field_35677_c + p_35369_5_, 3, func_35305_c());

        case 0: // '\0'
            return StructureVillagePieces.func_35640_a(p_35369_1_, p_35369_2_, p_35369_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + p_35369_4_, field_35316_g.field_35677_c + p_35369_5_, 3, func_35305_c());

        case 1: // '\001'
            return StructureVillagePieces.func_35640_a(p_35369_1_, p_35369_2_, p_35369_3_, field_35316_g.field_35678_a + p_35369_5_, field_35316_g.field_35676_b + p_35369_4_, field_35316_g.field_35673_f + 1, 0, func_35305_c());

        case 3: // '\003'
            return StructureVillagePieces.func_35640_a(p_35369_1_, p_35369_2_, p_35369_3_, field_35316_g.field_35678_a + p_35369_5_, field_35316_g.field_35676_b + p_35369_4_, field_35316_g.field_35673_f + 1, 0, func_35305_c());
        }
        return null;
    }

    protected int func_35367_b(World p_35367_1_, StructureBoundingBox p_35367_2_)
    {
        int i = 0;
        int j = 0;
        for(int k = field_35316_g.field_35677_c; k <= field_35316_g.field_35673_f; k++)
        {
            for(int l = field_35316_g.field_35678_a; l <= field_35316_g.field_35674_d; l++)
            {
                if(p_35367_2_.func_35667_b(l, 64, k))
                {
                    i += Math.max(p_35367_1_.func_4075_e(l, k), p_35367_1_.field_4272_q.func_46119_e());
                    j++;
                }
            }

        }

        if(j == 0)
        {
            return -1;
        } else
        {
            return i / j;
        }
    }

    protected static boolean func_35366_a(StructureBoundingBox p_35366_0_)
    {
        return p_35366_0_ != null && p_35366_0_.field_35676_b > 10;
    }

    protected void func_40309_a(World p_40309_1_, StructureBoundingBox p_40309_2_, int p_40309_3_, int p_40309_4_, int p_40309_5_, int p_40309_6_)
    {
        if(field_39005_a >= p_40309_6_)
        {
            return;
        }
        int i = field_39005_a;
        do
        {
            if(i >= p_40309_6_)
            {
                break;
            }
            int j = func_35306_a(p_40309_3_ + i, p_40309_5_);
            int k = func_35300_a(p_40309_4_);
            int l = func_35296_b(p_40309_3_ + i, p_40309_5_);
            if(!p_40309_2_.func_35667_b(j, k, l))
            {
                break;
            }
            field_39005_a++;
            EntityVillager entityvillager = new EntityVillager(p_40309_1_, func_40310_a(i));
            entityvillager.func_107_c((double)j + 0.5D, k, (double)l + 0.5D, 0.0F, 0.0F);
            p_40309_1_.func_526_a(entityvillager);
            i++;
        } while(true);
    }

    protected int func_40310_a(int p_40310_1_)
    {
        return 0;
    }
}
