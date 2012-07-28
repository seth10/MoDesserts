// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCorridor extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCorridor(int p_i284_1_, Random p_i284_2_, StructureBoundingBox p_i284_3_, int p_i284_4_)
    {
        super(p_i284_1_);
        field_35317_h = p_i284_4_;
        field_35316_g = p_i284_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_40285_b((ComponentNetherBridgeStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 0, 1, true);
    }

    public static ComponentNetherBridgeCorridor func_40297_a(List p_40297_0_, Random p_40297_1_, int p_40297_2_, int p_40297_3_, int p_40297_4_, int p_40297_5_, int p_40297_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40297_2_, p_40297_3_, p_40297_4_, -1, 0, 0, 5, 7, 5, p_40297_5_);
        if(!func_40286_a(structureboundingbox) || StructureComponent.func_35312_a(p_40297_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCorridor(p_40297_6_, p_40297_1_, structureboundingbox, p_40297_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 4, 1, 4, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 4, 5, 4, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 2, 0, 4, 5, 4, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 3, 1, 4, 4, 1, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 3, 3, 4, 4, 3, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 0, 5, 0, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 4, 3, 5, 4, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 3, 4, 1, 4, 4, Block.field_40172_bC.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 3, 4, 3, 4, 4, Block.field_40172_bC.field_573_bc, Block.field_40171_bB.field_573_bc, false);
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
