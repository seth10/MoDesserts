// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCorridor4 extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCorridor4(int p_i308_1_, Random p_i308_2_, StructureBoundingBox p_i308_3_, int p_i308_4_)
    {
        super(p_i308_1_);
        field_35317_h = p_i308_4_;
        field_35316_g = p_i308_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        byte byte0 = 1;
        if(field_35317_h == 1 || field_35317_h == 2)
        {
            byte0 = 5;
        }
        func_40285_b((ComponentNetherBridgeStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 0, byte0, p_35308_3_.nextInt(8) > 0);
        func_40288_c((ComponentNetherBridgeStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 0, byte0, p_35308_3_.nextInt(8) > 0);
    }

    public static ComponentNetherBridgeCorridor4 func_40298_a(List p_40298_0_, Random p_40298_1_, int p_40298_2_, int p_40298_3_, int p_40298_4_, int p_40298_5_, int p_40298_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40298_2_, p_40298_3_, p_40298_4_, -3, 0, 0, 9, 7, 9, p_40298_5_);
        if(!func_40286_a(structureboundingbox) || StructureComponent.func_35312_a(p_40298_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCorridor4(p_40298_6_, p_40298_1_, structureboundingbox, p_40298_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 8, 1, 8, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 8, 5, 8, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 6, 0, 8, 6, 5, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 2, 5, 0, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 2, 0, 8, 5, 0, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 3, 0, 1, 4, 0, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 7, 3, 0, 7, 4, 0, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 4, 8, 2, 8, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 4, 2, 2, 4, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 1, 4, 7, 2, 4, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 3, 8, 8, 3, 8, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 3, 6, 0, 3, 7, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 3, 6, 8, 3, 7, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 3, 4, 0, 5, 5, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 3, 4, 8, 5, 5, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 3, 5, 2, 5, 5, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 3, 5, 7, 5, 5, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 4, 5, 1, 5, 5, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 7, 4, 5, 7, 5, 5, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j <= 8; j++)
            {
                func_35303_b(p_35310_1_, Block.field_40171_bB.field_573_bc, 0, j, -1, i, p_35310_3_);
            }

        }

        return true;
    }
}
