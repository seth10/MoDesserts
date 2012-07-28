// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageChurch extends ComponentVillage
{

    private int field_35381_a;

    public ComponentVillageChurch(int p_i353_1_, Random p_i353_2_, StructureBoundingBox p_i353_3_, int p_i353_4_)
    {
        super(p_i353_1_);
        field_35381_a = -1;
        field_35317_h = p_i353_4_;
        field_35316_g = p_i353_3_;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageChurch func_35380_a(List p_35380_0_, Random p_35380_1_, int p_35380_2_, int p_35380_3_, int p_35380_4_, int p_35380_5_, int p_35380_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35380_2_, p_35380_3_, p_35380_4_, 0, 0, 0, 5, 12, 9, p_35380_5_);
        if(!func_35366_a(structureboundingbox) || StructureComponent.func_35312_a(p_35380_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageChurch(p_35380_6_, p_35380_1_, structureboundingbox, p_35380_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35381_a < 0)
        {
            field_35381_a = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35381_a < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, ((field_35381_a - field_35316_g.field_35675_e) + 12) - 1, 0);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 1, 3, 3, 7, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 5, 1, 3, 9, 3, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 0, 3, 0, 8, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 0, 3, 10, 0, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 1, 0, 10, 3, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 1, 4, 10, 3, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 4, 0, 4, 7, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 0, 4, 4, 4, 7, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 8, 3, 4, 8, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 5, 4, 3, 10, 4, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 5, 5, 3, 5, 7, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 9, 0, 4, 9, 4, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 4, 0, 4, 4, 4, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 0, 11, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, 11, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 2, 11, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 2, 11, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 1, 1, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 1, 1, 7, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 2, 1, 7, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 3, 1, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 3, 1, 7, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), 1, 1, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), 2, 1, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), 3, 1, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 1), 1, 2, 7, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 0), 3, 2, 7, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 3, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 4, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 4, 3, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 6, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 7, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 4, 6, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 4, 7, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 6, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 7, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 6, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 7, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 3, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 4, 3, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 3, 8, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 2, 4, 7, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 1, 4, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 3, 4, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 2, 4, 5, p_35310_3_);
        int i = func_35301_c(Block.field_638_aG.field_573_bc, 4);
        for(int j = 1; j <= 9; j++)
        {
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, i, 3, j, 3, p_35310_3_);
        }

        func_35309_a(p_35310_1_, 0, 0, 2, 1, 0, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 2, 2, 0, p_35310_3_);
        func_35298_a(p_35310_1_, p_35310_3_, p_35310_2_, 2, 1, 0, func_35301_c(Block.field_639_aF.field_573_bc, 1));
        if(func_35297_a(p_35310_1_, 2, 0, -1, p_35310_3_) == 0 && func_35297_a(p_35310_1_, 2, -1, -1, p_35310_3_) != 0)
        {
            func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), 2, 0, -1, p_35310_3_);
        }
        for(int k = 0; k < 9; k++)
        {
            for(int l = 0; l < 5; l++)
            {
                func_35314_b(p_35310_1_, l, 12, k, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_532_x.field_573_bc, 0, l, -1, k, p_35310_3_);
            }

        }

        func_40309_a(p_35310_1_, p_35310_3_, 2, 1, 2, 1);
        return true;
    }

    protected int func_40310_a(int p_40310_1_)
    {
        return 2;
    }
}
