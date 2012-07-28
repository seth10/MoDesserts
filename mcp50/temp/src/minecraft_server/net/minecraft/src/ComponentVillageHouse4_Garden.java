// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageHouse4_Garden extends ComponentVillage
{

    private int field_35403_a;
    private final boolean field_35402_b;

    public ComponentVillageHouse4_Garden(int p_i159_1_, Random p_i159_2_, StructureBoundingBox p_i159_3_, int p_i159_4_)
    {
        super(p_i159_1_);
        field_35403_a = -1;
        field_35317_h = p_i159_4_;
        field_35316_g = p_i159_3_;
        field_35402_b = p_i159_2_.nextBoolean();
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageHouse4_Garden func_35401_a(List p_35401_0_, Random p_35401_1_, int p_35401_2_, int p_35401_3_, int p_35401_4_, int p_35401_5_, int p_35401_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35401_2_, p_35401_3_, p_35401_4_, 0, 0, 0, 5, 6, 5, p_35401_5_);
        if(StructureComponent.func_35312_a(p_35401_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageHouse4_Garden(p_35401_6_, p_35401_1_, structureboundingbox, p_35401_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35403_a < 0)
        {
            field_35403_a = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35403_a < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, ((field_35403_a - field_35316_g.field_35675_e) + 6) - 1, 0);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 4, 0, 4, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 4, 0, 4, 4, 4, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 4, 1, 3, 4, 3, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 0, 1, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 0, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 0, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, 1, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 0, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 0, 2, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 0, 3, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, 1, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, 2, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, 3, 4, p_35310_3_);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 1, 0, 3, 3, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 1, 4, 3, 3, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 4, 3, 3, 4, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 2, 2, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 4, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 1, 1, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 1, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 1, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 2, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 3, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 3, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 3, 1, 0, p_35310_3_);
        if(func_35297_a(p_35310_1_, 2, 0, -1, p_35310_3_) == 0 && func_35297_a(p_35310_1_, 2, -1, -1, p_35310_3_) != 0)
        {
            func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), 2, 0, -1, p_35310_3_);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 1, 3, 3, 3, 0, 0, false);
        if(field_35402_b)
        {
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 0, 5, 0, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 1, 5, 0, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 2, 5, 0, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 3, 5, 0, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 5, 0, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 0, 5, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 1, 5, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 2, 5, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 3, 5, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 5, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 5, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 5, 2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 5, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 0, 5, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 0, 5, 2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 0, 5, 3, p_35310_3_);
        }
        if(field_35402_b)
        {
            int i = func_35301_c(Block.field_638_aG.field_573_bc, 3);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, i, 3, 1, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, i, 3, 2, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, i, 3, 3, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, i, 3, 4, 3, p_35310_3_);
        }
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 2, 3, 1, p_35310_3_);
        for(int j = 0; j < 5; j++)
        {
            for(int k = 0; k < 5; k++)
            {
                func_35314_b(p_35310_1_, k, 6, j, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_532_x.field_573_bc, 0, k, -1, j, p_35310_3_);
            }

        }

        func_40309_a(p_35310_1_, p_35310_3_, 1, 1, 2, 1);
        return true;
    }
}
