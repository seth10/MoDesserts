// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageHall extends ComponentVillage
{

    private int field_35375_a;

    public ComponentVillageHall(int p_i466_1_, Random p_i466_2_, StructureBoundingBox p_i466_3_, int p_i466_4_)
    {
        super(p_i466_1_);
        field_35375_a = -1;
        field_35317_h = p_i466_4_;
        field_35316_g = p_i466_3_;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageHall func_35374_a(List p_35374_0_, Random p_35374_1_, int p_35374_2_, int p_35374_3_, int p_35374_4_, int p_35374_5_, int p_35374_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35374_2_, p_35374_3_, p_35374_4_, 0, 0, 0, 9, 7, 11, p_35374_5_);
        if(!func_35366_a(structureboundingbox) || StructureComponent.func_35312_a(p_35374_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageHall(p_35374_6_, p_35374_1_, structureboundingbox, p_35374_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35375_a < 0)
        {
            field_35375_a = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35375_a < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, ((field_35375_a - field_35316_g.field_35675_e) + 7) - 1, 0);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 1, 7, 4, 4, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 1, 6, 8, 4, 10, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 0, 6, 8, 0, 10, Block.field_533_w.field_573_bc, Block.field_533_w.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 6, 0, 6, p_35310_3_);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 1, 6, 2, 1, 10, Block.field_9050_aZ.field_573_bc, Block.field_9050_aZ.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 1, 6, 8, 1, 10, Block.field_9050_aZ.field_573_bc, Block.field_9050_aZ.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 1, 10, 7, 1, 10, Block.field_9050_aZ.field_573_bc, Block.field_9050_aZ.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 1, 7, 0, 4, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 0, 3, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 0, 0, 8, 3, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 0, 7, 1, 0, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 5, 7, 1, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 2, 0, 7, 3, 0, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 2, 5, 7, 3, 5, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 4, 1, 8, 4, 1, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 4, 4, 8, 4, 4, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 2, 8, 5, 3, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 0, 4, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 0, 4, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 8, 4, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 8, 4, 3, p_35310_3_);
        int i = func_35301_c(Block.field_9045_at.field_573_bc, 3);
        int j = func_35301_c(Block.field_9045_at.field_573_bc, 2);
        for(int k = -1; k <= 2; k++)
        {
            for(int i1 = 0; i1 <= 8; i1++)
            {
                func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, i, i1, 4 + k, k, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, j, i1, 4 + k, 5 - k, p_35310_3_);
            }

        }

        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 0, 2, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 0, 2, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 8, 2, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 8, 2, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 2, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 3, 2, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 5, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 6, 2, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 2, 1, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9052_aM.field_573_bc, 0, 2, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 1, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, func_35301_c(Block.field_9045_at.field_573_bc, 3), 2, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, func_35301_c(Block.field_9045_at.field_573_bc, 1), 1, 1, 3, p_35310_3_);
        func_35294_a(p_35310_1_, p_35310_3_, 5, 0, 1, 7, 0, 3, Block.field_608_ak.field_573_bc, Block.field_608_ak.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_608_ak.field_573_bc, 0, 6, 1, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_608_ak.field_573_bc, 0, 6, 1, 2, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 2, 1, 0, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 2, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 2, 3, 1, p_35310_3_);
        func_35298_a(p_35310_1_, p_35310_3_, p_35310_2_, 2, 1, 0, func_35301_c(Block.field_639_aF.field_573_bc, 1));
        if(func_35297_a(p_35310_1_, 2, 0, -1, p_35310_3_) == 0 && func_35297_a(p_35310_1_, 2, -1, -1, p_35310_3_) != 0)
        {
            func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), 2, 0, -1, p_35310_3_);
        }
        func_35309_a(p_35310_1_, 0, 0, 6, 1, 5, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 6, 2, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 6, 3, 4, p_35310_3_);
        func_35298_a(p_35310_1_, p_35310_3_, p_35310_2_, 6, 1, 5, func_35301_c(Block.field_639_aF.field_573_bc, 1));
        for(int l = 0; l < 5; l++)
        {
            for(int j1 = 0; j1 < 9; j1++)
            {
                func_35314_b(p_35310_1_, j1, 7, l, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_532_x.field_573_bc, 0, j1, -1, l, p_35310_3_);
            }

        }

        func_40309_a(p_35310_1_, p_35310_3_, 4, 1, 2, 2);
        return true;
    }

    protected int func_40310_a(int p_40310_1_)
    {
        return p_40310_1_ != 0 ? 0 : 4;
    }
}
