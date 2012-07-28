// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            StructurePieceTreasure, Item, World

public class ComponentVillageHouse2 extends ComponentVillage
{

    private static final StructurePieceTreasure field_46006_a[];
    private int field_35377_a;
    private boolean field_46005_c;

    public ComponentVillageHouse2(int p_i86_1_, Random p_i86_2_, StructureBoundingBox p_i86_3_, int p_i86_4_)
    {
        super(p_i86_1_);
        field_35377_a = -1;
        field_35317_h = p_i86_4_;
        field_35316_g = p_i86_3_;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageHouse2 func_35376_a(List p_35376_0_, Random p_35376_1_, int p_35376_2_, int p_35376_3_, int p_35376_4_, int p_35376_5_, int p_35376_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35376_2_, p_35376_3_, p_35376_4_, 0, 0, 0, 10, 6, 7, p_35376_5_);
        if(!func_35366_a(structureboundingbox) || StructureComponent.func_35312_a(p_35376_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageHouse2(p_35376_6_, p_35376_1_, structureboundingbox, p_35376_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35377_a < 0)
        {
            field_35377_a = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35377_a < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, ((field_35377_a - field_35316_g.field_35675_e) + 6) - 1, 0);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 0, 9, 4, 6, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 9, 0, 6, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 4, 0, 9, 4, 6, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 0, 9, 5, 6, Block.field_607_al.field_573_bc, Block.field_607_al.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 5, 1, 8, 5, 5, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 0, 2, 3, 0, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 0, 0, 4, 0, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 1, 0, 3, 4, 0, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 6, 0, 4, 6, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 3, 3, 1, p_35310_3_);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 1, 2, 3, 3, 2, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 3, 5, 3, 3, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 1, 0, 3, 5, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 6, 5, 3, 6, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 5, 1, 0, 5, 3, 0, Block.field_9050_aZ.field_573_bc, Block.field_9050_aZ.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 9, 1, 0, 9, 3, 0, Block.field_9050_aZ.field_573_bc, Block.field_9050_aZ.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 1, 4, 9, 4, 6, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_594_D.field_573_bc, 0, 7, 1, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_594_D.field_573_bc, 0, 8, 1, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35055_bq.field_573_bc, 0, 9, 2, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35055_bq.field_573_bc, 0, 9, 2, 4, p_35310_3_);
        func_35294_a(p_35310_1_, p_35310_3_, 7, 2, 4, 8, 2, 5, 0, 0, false);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 6, 1, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_642_aC.field_573_bc, 0, 6, 2, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_642_aC.field_573_bc, 0, 6, 3, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_608_ak.field_573_bc, 0, 8, 1, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 2, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 4, 2, 6, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 2, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9052_aM.field_573_bc, 0, 2, 2, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 1, 1, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, func_35301_c(Block.field_9045_at.field_573_bc, 3), 2, 1, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9045_at.field_573_bc, func_35301_c(Block.field_9045_at.field_573_bc, 1), 1, 1, 4, p_35310_3_);
        if(!field_46005_c)
        {
            int i = func_35300_a(1);
            int l = func_35306_a(5, 5);
            int j1 = func_35296_b(5, 5);
            if(p_35310_3_.func_35667_b(l, i, j1))
            {
                field_46005_c = true;
                func_35299_a(p_35310_1_, p_35310_3_, p_35310_2_, 5, 1, 5, field_46006_a, 3 + p_35310_2_.nextInt(6));
            }
        }
        for(int j = 6; j <= 8; j++)
        {
            if(func_35297_a(p_35310_1_, j, 0, -1, p_35310_3_) == 0 && func_35297_a(p_35310_1_, j, -1, -1, p_35310_3_) != 0)
            {
                func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), j, 0, -1, p_35310_3_);
            }
        }

        for(int k = 0; k < 7; k++)
        {
            for(int i1 = 0; i1 < 10; i1++)
            {
                func_35314_b(p_35310_1_, i1, 6, k, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_532_x.field_573_bc, 0, i1, -1, k, p_35310_3_);
            }

        }

        func_40309_a(p_35310_1_, p_35310_3_, 7, 1, 1, 1);
        return true;
    }

    protected int func_40310_a(int p_40310_1_)
    {
        return 3;
    }

    static 
    {
        field_46006_a = (new StructurePieceTreasure[] {
            new StructurePieceTreasure(Item.field_167_l.field_234_aS, 0, 1, 3, 3), new StructurePieceTreasure(Item.field_166_m.field_234_aS, 0, 1, 5, 10), new StructurePieceTreasure(Item.field_4147_n.field_234_aS, 0, 1, 3, 5), new StructurePieceTreasure(Item.field_185_S.field_234_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_171_h.field_234_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_4152_e.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_4146_o.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_4187_ac.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_4188_ab.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_4186_ad.field_234_aS, 0, 1, 1, 5), 
            new StructurePieceTreasure(Item.field_4185_ae.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Block.field_602_aq.field_573_bc, 0, 3, 7, 5), new StructurePieceTreasure(Block.field_6047_y.field_573_bc, 0, 3, 7, 5)
        });
    }
}
