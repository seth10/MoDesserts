// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCrossing extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCrossing(int p_i531_1_, Random p_i531_2_, StructureBoundingBox p_i531_3_, int p_i531_4_)
    {
        super(p_i531_1_);
        field_35317_h = p_i531_4_;
        field_35316_g = p_i531_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_40287_a((ComponentNetherBridgeStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 2, 0, false);
        func_40285_b((ComponentNetherBridgeStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 0, 2, false);
        func_40288_c((ComponentNetherBridgeStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 0, 2, false);
    }

    public static ComponentNetherBridgeCrossing func_40306_a(List p_40306_0_, Random p_40306_1_, int p_40306_2_, int p_40306_3_, int p_40306_4_, int p_40306_5_, int p_40306_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40306_2_, p_40306_3_, p_40306_4_, -2, 0, 0, 7, 9, 7, p_40306_5_);
        if(!func_40286_a(structureboundingbox) || StructureComponent.func_35312_a(p_40306_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCrossing(p_40306_6_, p_40306_1_, structureboundingbox, p_40306_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 6, 1, 6, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 6, 7, 6, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 1, 6, 0, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 6, 1, 6, 6, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 5, 2, 0, 6, 6, 0, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 5, 2, 6, 6, 6, 6, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 0, 6, 1, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 5, 0, 6, 6, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 2, 0, 6, 6, 1, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 2, 5, 6, 6, 6, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 6, 0, 4, 6, 0, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 5, 0, 4, 5, 0, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 6, 6, 4, 6, 6, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 5, 6, 4, 5, 6, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 6, 2, 0, 6, 4, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 2, 0, 5, 4, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 6, 2, 6, 6, 4, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 5, 2, 6, 5, 4, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        for(int i = 0; i <= 6; i++)
        {
            for(int j = 0; j <= 6; j++)
            {
                func_35303_b(p_35310_1_, Block.field_40171_bB.field_573_bc, 0, i, -1, j, p_35310_3_);
            }

        }

        return true;
    }
}
