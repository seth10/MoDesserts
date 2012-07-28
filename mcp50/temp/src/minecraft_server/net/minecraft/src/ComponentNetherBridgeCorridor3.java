// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCorridor3 extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCorridor3(int p_i612_1_, Random p_i612_2_, StructureBoundingBox p_i612_3_, int p_i612_4_)
    {
        super(p_i612_1_);
        field_35317_h = p_i612_4_;
        field_35316_g = p_i612_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_40287_a((ComponentNetherBridgeStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 1, 0, true);
    }

    public static ComponentNetherBridgeCorridor3 func_40308_a(List p_40308_0_, Random p_40308_1_, int p_40308_2_, int p_40308_3_, int p_40308_4_, int p_40308_5_, int p_40308_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40308_2_, p_40308_3_, p_40308_4_, -1, -7, 0, 5, 14, 10, p_40308_5_);
        if(!func_40286_a(structureboundingbox) || StructureComponent.func_35312_a(p_40308_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCorridor3(p_40308_6_, p_40308_1_, structureboundingbox, p_40308_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        int i = func_35301_c(Block.field_40169_bD.field_573_bc, 2);
        for(int j = 0; j <= 9; j++)
        {
            int k = Math.max(1, 7 - j);
            int l = Math.min(Math.max(k + 5, 14 - j), 13);
            int i1 = j;
            func_35294_a(p_35310_1_, p_35310_3_, 0, 0, i1, 4, k, i1, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 1, k + 1, i1, 3, l - 1, i1, 0, 0, false);
            if(j <= 6)
            {
                func_35309_a(p_35310_1_, Block.field_40169_bD.field_573_bc, i, 1, k + 1, i1, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_40169_bD.field_573_bc, i, 2, k + 1, i1, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_40169_bD.field_573_bc, i, 3, k + 1, i1, p_35310_3_);
            }
            func_35294_a(p_35310_1_, p_35310_3_, 0, l, i1, 4, l, i1, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 0, k + 1, i1, 0, l - 1, i1, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 4, k + 1, i1, 4, l - 1, i1, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
            if((j & 1) == 0)
            {
                func_35294_a(p_35310_1_, p_35310_3_, 0, k + 2, i1, 0, k + 3, i1, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
                func_35294_a(p_35310_1_, p_35310_3_, 4, k + 2, i1, 4, k + 3, i1, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
            }
            for(int j1 = 0; j1 <= 4; j1++)
            {
                func_35303_b(p_35310_1_, Block.field_40171_bB.field_573_bc, 0, j1, -1, i1, p_35310_3_);
            }

        }

        return true;
    }
}
