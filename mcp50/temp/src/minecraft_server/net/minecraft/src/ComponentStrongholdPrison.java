// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, Block, EnumDoor, World

public class ComponentStrongholdPrison extends ComponentStronghold
{

    protected final EnumDoor field_35333_a;

    public ComponentStrongholdPrison(int p_i358_1_, Random p_i358_2_, StructureBoundingBox p_i358_3_, int p_i358_4_)
    {
        super(p_i358_1_);
        field_35317_h = p_i358_4_;
        field_35333_a = func_35322_a(p_i358_2_);
        field_35316_g = p_i358_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_35324_a((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 1);
    }

    public static ComponentStrongholdPrison func_35332_a(List p_35332_0_, Random p_35332_1_, int p_35332_2_, int p_35332_3_, int p_35332_4_, int p_35332_5_, int p_35332_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35332_2_, p_35332_3_, p_35332_4_, -1, -1, 0, 9, 5, 11, p_35332_5_);
        if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_35332_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdPrison(p_35332_6_, p_35332_1_, structureboundingbox, p_35332_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        } else
        {
            func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 8, 4, 10, true, p_35310_2_, StructureStrongholdPieces.func_35622_b());
            func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, field_35333_a, 1, 1, 0);
            func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 10, 3, 3, 10, 0, 0, false);
            func_35307_a(p_35310_1_, p_35310_3_, 4, 1, 1, 4, 3, 1, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
            func_35307_a(p_35310_1_, p_35310_3_, 4, 1, 3, 4, 3, 3, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
            func_35307_a(p_35310_1_, p_35310_3_, 4, 1, 7, 4, 3, 7, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
            func_35307_a(p_35310_1_, p_35310_3_, 4, 1, 9, 4, 3, 9, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
            func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 4, 4, 3, 6, Block.field_35055_bq.field_573_bc, Block.field_35055_bq.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 5, 1, 5, 7, 3, 5, Block.field_35055_bq.field_573_bc, Block.field_35055_bq.field_573_bc, false);
            func_35309_a(p_35310_1_, Block.field_35055_bq.field_573_bc, 0, 4, 3, 2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35055_bq.field_573_bc, 0, 4, 3, 8, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_632_aM.field_573_bc, func_35301_c(Block.field_632_aM.field_573_bc, 3), 4, 1, 2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_632_aM.field_573_bc, func_35301_c(Block.field_632_aM.field_573_bc, 3) + 8, 4, 2, 2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_632_aM.field_573_bc, func_35301_c(Block.field_632_aM.field_573_bc, 3), 4, 1, 8, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_632_aM.field_573_bc, func_35301_c(Block.field_632_aM.field_573_bc, 3) + 8, 4, 2, 8, p_35310_3_);
            return true;
        }
    }
}
