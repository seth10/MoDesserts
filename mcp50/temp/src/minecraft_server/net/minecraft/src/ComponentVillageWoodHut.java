// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageWoodHut extends ComponentVillage
{

    private int field_35396_a;
    private final boolean field_35394_b;
    private final int field_35395_c;

    public ComponentVillageWoodHut(int p_i611_1_, Random p_i611_2_, StructureBoundingBox p_i611_3_, int p_i611_4_)
    {
        super(p_i611_1_);
        field_35396_a = -1;
        field_35317_h = p_i611_4_;
        field_35316_g = p_i611_3_;
        field_35394_b = p_i611_2_.nextBoolean();
        field_35395_c = p_i611_2_.nextInt(3);
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageWoodHut func_35393_a(List p_35393_0_, Random p_35393_1_, int p_35393_2_, int p_35393_3_, int p_35393_4_, int p_35393_5_, int p_35393_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35393_2_, p_35393_3_, p_35393_4_, 0, 0, 0, 4, 6, 5, p_35393_5_);
        if(!func_35366_a(structureboundingbox) || StructureComponent.func_35312_a(p_35393_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageWoodHut(p_35393_6_, p_35393_1_, structureboundingbox, p_35393_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35396_a < 0)
        {
            field_35396_a = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35396_a < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, ((field_35396_a - field_35316_g.field_35675_e) + 6) - 1, 0);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 1, 3, 5, 4, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 3, 0, 4, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 1, 2, 0, 3, Block.field_533_w.field_573_bc, Block.field_533_w.field_573_bc, false);
        if(field_35394_b)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 1, 4, 1, 2, 4, 3, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        } else
        {
            func_35294_a(p_35310_1_, p_35310_3_, 1, 5, 1, 2, 5, 3, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        }
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 1, 4, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 2, 4, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 1, 4, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 2, 4, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 0, 4, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 0, 4, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 0, 4, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 3, 4, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 3, 4, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_582_K.field_573_bc, 0, 3, 4, 3, p_35310_3_);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 0, 0, 3, 0, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 1, 0, 3, 3, 0, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 4, 0, 3, 4, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 1, 4, 3, 3, 4, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 1, 0, 3, 3, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 1, 1, 3, 3, 3, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 0, 2, 3, 0, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 4, 2, 3, 4, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 0, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_35049_br.field_573_bc, 0, 3, 2, 2, p_35310_3_);
        if(field_35395_c > 0)
        {
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, field_35395_c, 1, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9052_aM.field_573_bc, 0, field_35395_c, 2, 3, p_35310_3_);
        }
        func_35309_a(p_35310_1_, 0, 0, 1, 1, 0, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 1, 2, 0, p_35310_3_);
        func_35298_a(p_35310_1_, p_35310_3_, p_35310_2_, 1, 1, 0, func_35301_c(Block.field_639_aF.field_573_bc, 1));
        if(func_35297_a(p_35310_1_, 1, 0, -1, p_35310_3_) == 0 && func_35297_a(p_35310_1_, 1, -1, -1, p_35310_3_) != 0)
        {
            func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, func_35301_c(Block.field_9055_aH.field_573_bc, 3), 1, 0, -1, p_35310_3_);
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                func_35314_b(p_35310_1_, j, 6, i, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_532_x.field_573_bc, 0, j, -1, i, p_35310_3_);
            }

        }

        func_40309_a(p_35310_1_, p_35310_3_, 1, 1, 2, 1);
        return true;
    }
}
