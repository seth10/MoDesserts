// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            MathHelper, World

public class ComponentVillageField2 extends ComponentVillage
{

    private int field_35400_a;

    public ComponentVillageField2(int p_i542_1_, Random p_i542_2_, StructureBoundingBox p_i542_3_, int p_i542_4_)
    {
        super(p_i542_1_);
        field_35400_a = -1;
        field_35317_h = p_i542_4_;
        field_35316_g = p_i542_3_;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageField2 func_35399_a(List p_35399_0_, Random p_35399_1_, int p_35399_2_, int p_35399_3_, int p_35399_4_, int p_35399_5_, int p_35399_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35399_2_, p_35399_3_, p_35399_4_, 0, 0, 0, 7, 4, 9, p_35399_5_);
        if(!func_35366_a(structureboundingbox) || StructureComponent.func_35312_a(p_35399_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageField2(p_35399_6_, p_35399_1_, structureboundingbox, p_35399_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35400_a < 0)
        {
            field_35400_a = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35400_a < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, ((field_35400_a - field_35316_g.field_35675_e) + 4) - 1, 0);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 0, 6, 4, 8, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 1, 2, 0, 7, Block.field_643_aB.field_573_bc, Block.field_643_aB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 0, 1, 5, 0, 7, Block.field_643_aB.field_573_bc, Block.field_643_aB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 0, 0, 8, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 0, 0, 6, 0, 8, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 0, 5, 0, 0, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 8, 5, 0, 8, Block.field_582_K.field_573_bc, Block.field_582_K.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 0, 1, 3, 0, 7, Block.field_598_B.field_573_bc, Block.field_598_B.field_573_bc, false);
        for(int i = 1; i <= 7; i++)
        {
            func_35309_a(p_35310_1_, Block.field_644_aA.field_573_bc, MathHelper.func_35476_a(p_35310_2_, 2, 7), 1, 1, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_644_aA.field_573_bc, MathHelper.func_35476_a(p_35310_2_, 2, 7), 2, 1, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_644_aA.field_573_bc, MathHelper.func_35476_a(p_35310_2_, 2, 7), 4, 1, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_644_aA.field_573_bc, MathHelper.func_35476_a(p_35310_2_, 2, 7), 5, 1, i, p_35310_3_);
        }

        for(int j = 0; j < 9; j++)
        {
            for(int k = 0; k < 7; k++)
            {
                func_35314_b(p_35310_1_, k, 4, j, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_533_w.field_573_bc, 0, k, -1, j, p_35310_3_);
            }

        }

        return true;
    }
}
