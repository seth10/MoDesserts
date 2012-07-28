// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageHouse1 extends ComponentVillage
{

    private int field_35398_a;

    public ComponentVillageHouse1(int p_i546_1_, Random p_i546_2_, StructureBoundingBox p_i546_3_, int p_i546_4_)
    {
        super(p_i546_1_);
        field_35398_a = -1;
        field_35317_h = p_i546_4_;
        field_35316_g = p_i546_3_;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageHouse1 func_35397_a(List p_35397_0_, Random p_35397_1_, int p_35397_2_, int p_35397_3_, int p_35397_4_, int p_35397_5_, int p_35397_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35397_2_, p_35397_3_, p_35397_4_, 0, 0, 0, 9, 9, 6, p_35397_5_);
        if(!func_35366_a(structureboundingbox) || StructureComponent.func_35312_a(p_35397_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageHouse1(p_35397_6_, p_35397_1_, structureboundingbox, p_35397_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35398_a < 0)
        {
            field_35398_a = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35398_a < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, ((field_35398_a - field_35316_g.field_35675_e) + 9) - 1, 0);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 1, 7, 5, 4, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 8, 0, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 0, 8, 5, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 6, 1, 8, 6, 4, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 7, 2, 8, 7, 3, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        int i = func_35301_c(Block.field_9045_at.field_573_bc, 3);
        int j = func_35301_c(Block.field_9045_at.field_573_bc, 2);
        for(int k = -1; k <= 2; k++)
        {
            for(int i1 = 0; i1 <= 8; i1++)
            {
                func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, i, i1, 6 + k, k, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, j, i1, 6 + k, 5 - k, p_35310_3_);
            }

        }

        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 0, 0, 1, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 5, 8, 1, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 1, 0, 8, 1, 4, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 1, 0, 7, 1, 0, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 0, 4, 0, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 5, 0, 4, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 2, 5, 8, 4, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 2, 0, 8, 4, 0, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 1, 0, 4, 4, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 2, 5, 7, 4, 5, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 2, 1, 8, 4, 4, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 2, 0, 7, 4, 0, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 4, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 5, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 6, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 4, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 5, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 6, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 3, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 3, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 3, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 3, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 2, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 3, 2, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 5, 2, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 6, 2, 5, p_35310_3_);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 4, 1, 7, 4, 1, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 4, 4, 7, 4, 4, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 3, 4, 7, 3, 4, Block.field_604_ao.field_573_bc, Block.field_604_ao.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 7, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, func_35301_c(Block.field_9045_at.field_573_bc, 0), 7, 1, 3, p_35310_3_);
        int l = func_35301_c(Block.field_9045_at.field_573_bc, 3);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, l, 6, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, l, 5, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, l, 4, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, l, 3, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 6, 1, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9052_aM.field_573_bc, 0, 6, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 1, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9052_aM.field_573_bc, 0, 4, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9044_ay.field_573_bc, 0, 7, 1, 1, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 1, 1, 0, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 1, 2, 0, p_35310_3_);
        func_35298_a(p_35310_1_, p_35310_3_, p_35310_2_, 1, 1, 0, func_35301_c(Block.field_639_aF.field_573_bc, 1));
        if(func_35297_a(p_35310_1_, 1, 0, -1, p_35310_3_) == 0 && func_35297_a(p_35310_1_, 1, -1, -1, p_35310_3_) != 0)
        {
            func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), 1, 0, -1, p_35310_3_);
        }
        for(int j1 = 0; j1 < 6; j1++)
        {
            for(int k1 = 0; k1 < 9; k1++)
            {
                func_35314_b(p_35310_1_, k1, 9, j1, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_532_x.field_573_bc, 0, k1, -1, j1, p_35310_3_);
            }

        }

        func_40309_a(p_35310_1_, p_35310_3_, 2, 1, 2, 1);
        return true;
    }

    protected int func_40310_a(int p_40310_1_)
    {
        return 1;
    }
}
