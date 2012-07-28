// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCorridor5 extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCorridor5(int p_i327_1_, Random p_i327_2_, StructureBoundingBox p_i327_3_, int p_i327_4_)
    {
        super(p_i327_1_);
        field_35317_h = p_i327_4_;
        field_35316_g = p_i327_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_40287_a((ComponentNetherBridgeStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 1, 0, true);
    }

    public static ComponentNetherBridgeCorridor5 func_40300_a(List p_40300_0_, Random p_40300_1_, int p_40300_2_, int p_40300_3_, int p_40300_4_, int p_40300_5_, int p_40300_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40300_2_, p_40300_3_, p_40300_4_, -1, 0, 0, 5, 7, 5, p_40300_5_);
        if(!func_40286_a(structureboundingbox) || StructureComponent.func_35312_a(p_40300_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCorridor5(p_40300_6_, p_40300_1_, structureboundingbox, p_40300_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 4, 1, 4, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 4, 5, 4, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 0, 5, 4, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 2, 0, 4, 5, 4, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 3, 1, 0, 4, 1, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 3, 3, 0, 4, 3, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 3, 1, 4, 4, 1, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 3, 3, 4, 4, 3, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 6, 0, 4, 6, 4, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        for(int i = 0; i <= 4; i++)
        {
            for(int j = 0; j <= 4; j++)
            {
                func_35303_b(p_35310_1_, Block.field_40171_bB.field_573_bc, 0, i, -1, j, p_35310_3_);
            }

        }

        return true;
    }
}
