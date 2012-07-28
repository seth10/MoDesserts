// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageHouse3 extends ComponentVillage
{

    private int field_35373_a;

    public ComponentVillageHouse3(int p_i154_1_, Random p_i154_2_, StructureBoundingBox p_i154_3_, int p_i154_4_)
    {
        super(p_i154_1_);
        field_35373_a = -1;
        field_35317_h = p_i154_4_;
        field_35316_g = p_i154_3_;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageHouse3 func_35372_a(List p_35372_0_, Random p_35372_1_, int p_35372_2_, int p_35372_3_, int p_35372_4_, int p_35372_5_, int p_35372_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35372_2_, p_35372_3_, p_35372_4_, 0, 0, 0, 9, 7, 12, p_35372_5_);
        if(!func_35366_a(structureboundingbox) || StructureComponent.func_35312_a(p_35372_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageHouse3(p_35372_6_, p_35372_1_, structureboundingbox, p_35372_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35373_a < 0)
        {
            field_35373_a = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35373_a < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, ((field_35373_a - field_35316_g.field_35675_e) + 7) - 1, 0);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 1, 7, 4, 4, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 1, 6, 8, 4, 10, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 0, 5, 8, 0, 10, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 1, 7, 0, 4, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 0, 3, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 0, 0, 8, 3, 10, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 0, 7, 2, 0, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 5, 2, 1, 5, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 0, 6, 2, 3, 10, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 0, 10, 7, 3, 10, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 2, 0, 7, 3, 0, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 2, 5, 2, 3, 5, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 4, 1, 8, 4, 1, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 4, 4, 3, 4, 4, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 2, 8, 5, 3, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 0, 4, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 0, 4, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 8, 4, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 8, 4, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 8, 4, 4, p_35310_3_);
        int i = func_35301_c(Block.field_9045_at.field_573_bc, 3);
        int j = func_35301_c(Block.field_9045_at.field_573_bc, 2);
        for(int k = -1; k <= 2; k++)
        {
            for(int i1 = 0; i1 <= 8; i1++)
            {
                func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, i, i1, 4 + k, k, p_35310_3_);
                if((k > -1 || i1 <= 1) && (k > 0 || i1 <= 3) && (k > 1 || i1 <= 4 || i1 >= 6))
                {
                    func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, j, i1, 4 + k, 5 - k, p_35310_3_);
                }
            }

        }

        func_35294_a(p_35310_1_, p_35310_3_, 3, 4, 5, 3, 4, 10, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 7, 4, 2, 7, 4, 10, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 5, 4, 4, 5, 10, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 5, 4, 6, 5, 10, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 5, 6, 3, 5, 6, 10, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        int l = func_35301_c(Block.field_9045_at.field_573_bc, 0);
        for(int j1 = 4; j1 >= 1; j1--)
        {
            func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, j1, 2 + j1, 7 - j1, p_35310_3_);
            for(int l1 = 8 - j1; l1 <= 10; l1++)
            {
                func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, l, j1, 2 + j1, l1, p_35310_3_);
            }

        }

        int k1 = func_35301_c(Block.field_9045_at.field_573_bc, 1);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 6, 6, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 7, 5, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, k1, 6, 6, 4, p_35310_3_);
        for(int i2 = 6; i2 <= 8; i2++)
        {
            for(int l2 = 5; l2 <= 10; l2++)
            {
                func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, k1, i2, 12 - i2, l2, p_35310_3_);
            }

        }

        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 0, 2, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 0, 2, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 4, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 5, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 6, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 8, 2, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 8, 2, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 8, 2, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 8, 2, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 2, 7, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 8, 2, 8, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 8, 2, 9, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 2, 2, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 2, 7, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 2, 8, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 2, 2, 9, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 4, 4, 10, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 5, 4, 10, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 6, 4, 10, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 5, 5, 10, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 2, 1, 0, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 2, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 2, 3, 1, p_35310_3_);
        func_35298_a(p_35310_1_, p_35310_3_, p_35310_2_, 2, 1, 0, func_35301_c(Block.field_639_aF.field_573_bc, 1));
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, -1, 3, 2, -1, 0, 0, false);
        if(func_35297_a(p_35310_1_, 2, 0, -1, p_35310_3_) == 0 && func_35297_a(p_35310_1_, 2, -1, -1, p_35310_3_) != 0)
        {
            func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), 2, 0, -1, p_35310_3_);
        }
        for(int j2 = 0; j2 < 5; j2++)
        {
            for(int i3 = 0; i3 < 9; i3++)
            {
                func_35314_b(p_35310_1_, i3, 7, j2, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_532_x.field_573_bc, 0, i3, -1, j2, p_35310_3_);
            }

        }

        for(int k2 = 5; k2 < 11; k2++)
        {
            for(int j3 = 2; j3 < 9; j3++)
            {
                func_35314_b(p_35310_1_, j3, 7, k2, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_532_x.field_573_bc, 0, j3, -1, k2, p_35310_3_);
            }

        }

        func_40309_a(p_35310_1_, p_35310_3_, 4, 1, 2, 2);
        return true;
    }
}
