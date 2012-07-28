// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeStraight extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeStraight(int p_i99_1_, Random p_i99_2_, StructureBoundingBox p_i99_3_, int p_i99_4_)
    {
        super(p_i99_1_);
        field_35317_h = p_i99_4_;
        field_35316_g = p_i99_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_40287_a((ComponentNetherBridgeStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 1, 3, false);
    }

    public static ComponentNetherBridgeStraight func_40289_a(List p_40289_0_, Random p_40289_1_, int p_40289_2_, int p_40289_3_, int p_40289_4_, int p_40289_5_, int p_40289_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40289_2_, p_40289_3_, p_40289_4_, -1, -3, 0, 5, 10, 19, p_40289_5_);
        if(!func_40286_a(structureboundingbox) || StructureComponent.func_35312_a(p_40289_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeStraight(p_40289_6_, p_40289_1_, structureboundingbox, p_40289_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        func_35294_a(p_35310_1_, p_35310_3_, 0, 3, 0, 4, 4, 18, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 5, 0, 3, 7, 18, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 0, 0, 5, 18, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 5, 0, 4, 5, 18, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 4, 2, 5, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 13, 4, 2, 18, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 4, 1, 3, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 15, 4, 1, 18, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        for(int i = 0; i <= 4; i++)
        {
            for(int j = 0; j <= 2; j++)
            {
                func_35303_b(p_35310_1_, Block.field_40171_bB.field_573_bc, 0, i, -1, j, p_35310_3_);
                func_35303_b(p_35310_1_, Block.field_40171_bB.field_573_bc, 0, i, -1, 18 - j, p_35310_3_);
            }

        }

        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 1, 0, 4, 1, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 3, 4, 0, 4, 4, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 3, 14, 0, 4, 14, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 17, 0, 4, 17, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 1, 4, 4, 1, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 3, 4, 4, 4, 4, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 3, 14, 4, 4, 14, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 17, 4, 4, 17, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        return true;
    }
}
