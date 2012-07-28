// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentNetherBridgeEnd extends ComponentNetherBridgePiece
{

    private int field_40302_a;

    public ComponentNetherBridgeEnd(int p_i258_1_, Random p_i258_2_, StructureBoundingBox p_i258_3_, int p_i258_4_)
    {
        super(p_i258_1_);
        field_35317_h = p_i258_4_;
        field_35316_g = p_i258_3_;
        field_40302_a = p_i258_2_.nextInt();
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentNetherBridgeEnd func_40301_a(List p_40301_0_, Random p_40301_1_, int p_40301_2_, int p_40301_3_, int p_40301_4_, int p_40301_5_, int p_40301_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40301_2_, p_40301_3_, p_40301_4_, -1, -3, 0, 5, 10, 8, p_40301_5_);
        if(!func_40286_a(structureboundingbox) || StructureComponent.func_35312_a(p_40301_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeEnd(p_40301_6_, p_40301_1_, structureboundingbox, p_40301_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        Random random = new Random(field_40302_a);
        for(int i = 0; i <= 4; i++)
        {
            for(int i1 = 3; i1 <= 4; i1++)
            {
                int l1 = random.nextInt(8);
                func_35294_a(p_35310_1_, p_35310_3_, i, i1, 0, i, i1, l1, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
            }

        }

        int j = random.nextInt(8);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 0, 0, 5, j, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        j = random.nextInt(8);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 5, 0, 4, 5, j, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        for(int k = 0; k <= 4; k++)
        {
            int j1 = random.nextInt(5);
            func_35294_a(p_35310_1_, p_35310_3_, k, 2, 0, k, 2, j1, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
        }

        for(int l = 0; l <= 4; l++)
        {
            for(int k1 = 0; k1 <= 1; k1++)
            {
                int i2 = random.nextInt(3);
                func_35294_a(p_35310_1_, p_35310_3_, l, k1, 0, l, k1, i2, Block.field_40171_bB.field_573_bc, Block.field_40171_bB.field_573_bc, false);
            }

        }

        return true;
    }
}
