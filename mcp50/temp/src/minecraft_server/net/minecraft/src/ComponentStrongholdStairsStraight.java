// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, EnumDoor, Block, World

public class ComponentStrongholdStairsStraight extends ComponentStronghold
{

    private final EnumDoor field_35345_a;

    public ComponentStrongholdStairsStraight(int p_i335_1_, Random p_i335_2_, StructureBoundingBox p_i335_3_, int p_i335_4_)
    {
        super(p_i335_1_);
        field_35317_h = p_i335_4_;
        field_35345_a = func_35322_a(p_i335_2_);
        field_35316_g = p_i335_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_35324_a((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 1);
    }

    public static ComponentStrongholdStairsStraight func_35344_a(List p_35344_0_, Random p_35344_1_, int p_35344_2_, int p_35344_3_, int p_35344_4_, int p_35344_5_, int p_35344_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35344_2_, p_35344_3_, p_35344_4_, -1, -7, 0, 5, 11, 8, p_35344_5_);
        if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_35344_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdStairsStraight(p_35344_6_, p_35344_1_, structureboundingbox, p_35344_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 4, 10, 7, true, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, field_35345_a, 1, 7, 0);
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, EnumDoor.OPENING, 1, 1, 7);
        int i = func_35301_c(Block.field_9055_aH.field_573_bc, 2);
        for(int j = 0; j < 6; j++)
        {
            func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, i, 1, 6 - j, 1 + j, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, i, 2, 6 - j, 1 + j, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9055_aH.field_573_bc, i, 3, 6 - j, 1 + j, p_35310_3_);
            if(j < 5)
            {
                func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 1, 5 - j, 1 + j, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 2, 5 - j, 1 + j, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 3, 5 - j, 1 + j, p_35310_3_);
            }
        }

        return true;
    }
}
