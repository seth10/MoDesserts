// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, StructureBoundingBox, StructureComponent, Block, 
//            World, TileEntityMobSpawner

public class ComponentNetherBridgeThrone extends ComponentNetherBridgePiece
{

    private boolean field_40305_a;

    public ComponentNetherBridgeThrone(int p_i544_1_, Random p_i544_2_, StructureBoundingBox p_i544_3_, int p_i544_4_)
    {
        super(p_i544_1_);
        field_35317_h = p_i544_4_;
        field_35316_g = p_i544_3_;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentNetherBridgeThrone func_40304_a(List p_40304_0_, Random p_40304_1_, int p_40304_2_, int p_40304_3_, int p_40304_4_, int p_40304_5_, int p_40304_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40304_2_, p_40304_3_, p_40304_4_, -2, 0, 0, 7, 8, 9, p_40304_5_);
        if(!func_40286_a(structureboundingbox) || StructureComponent.func_35312_a(p_40304_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeThrone(p_40304_6_, p_40304_1_, structureboundingbox, p_40304_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        func_35294_a(p_35310_1_, p_35310_3_, 0, 2, 0, 6, 7, 7, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 0, 5, 1, 7, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 2, 1, 5, 2, 7, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 3, 2, 5, 3, 7, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 4, 3, 5, 4, 7, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 2, 0, 1, 4, 2, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 5, 2, 0, 5, 4, 2, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 5, 2, 1, 5, 3, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 5, 5, 2, 5, 5, 3, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 3, 0, 5, 8, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 5, 3, 6, 5, 8, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 5, 8, 5, 5, 8, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_40172_bC.field_573_bc, 0, 1, 6, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40172_bC.field_573_bc, 0, 5, 6, 3, p_35310_3_);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 6, 3, 0, 6, 8, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 6, 6, 3, 6, 6, 8, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 6, 8, 5, 7, 8, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 2, 8, 8, 4, 8, 8, Block.field_40172_bC.field_573_bc, Block.field_40172_bC.field_573_bc, false);
        if(!field_40305_a)
        {
            int i = func_35300_a(5);
            int k = func_35306_a(3, 5);
            int i1 = func_35296_b(3, 5);
            if(p_35310_3_.func_35667_b(k, i, i1))
            {
                field_40305_a = true;
                p_35310_1_.func_508_d(k, i, i1, Block.field_597_at.field_573_bc);
                TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)p_35310_1_.func_451_k(k, i, i1);
                if(tileentitymobspawner != null)
                {
                    tileentitymobspawner.func_21078_a("Blaze");
                }
            }
        }
        for(int j = 0; j <= 6; j++)
        {
            for(int l = 0; l <= 6; l++)
            {
                func_35303_b(p_35310_1_, Block.field_40171_bB.field_573_bc, 0, j, -1, l, p_35310_3_);
            }

        }

        return true;
    }
}
