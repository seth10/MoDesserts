// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, EnumDoorHelper, EnumDoor, Block, 
//            StructureBoundingBox, StructureStrongholdPieces, World, ComponentStrongholdStairs2

abstract class ComponentStronghold extends StructureComponent
{

    protected ComponentStronghold(int p_i175_1_)
    {
        super(p_i175_1_);
    }

    protected void func_35323_a(World p_35323_1_, Random p_35323_2_, StructureBoundingBox p_35323_3_, EnumDoor p_35323_4_, int p_35323_5_, int p_35323_6_, int p_35323_7_)
    {
        switch(EnumDoorHelper.field_35581_a[p_35323_4_.ordinal()])
        {
        case 1: // '\001'
        default:
            func_35294_a(p_35323_1_, p_35323_3_, p_35323_5_, p_35323_6_, p_35323_7_, (p_35323_5_ + 3) - 1, (p_35323_6_ + 3) - 1, p_35323_7_, 0, 0, false);
            break;

        case 2: // '\002'
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_, p_35323_6_, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_, p_35323_6_ + 1, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_, p_35323_6_ + 2, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_ + 1, p_35323_6_ + 2, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_ + 2, p_35323_6_ + 2, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_ + 2, p_35323_6_ + 1, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_ + 2, p_35323_6_, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_639_aF.field_573_bc, 0, p_35323_5_ + 1, p_35323_6_, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_639_aF.field_573_bc, 8, p_35323_5_ + 1, p_35323_6_ + 1, p_35323_7_, p_35323_3_);
            break;

        case 3: // '\003'
            func_35309_a(p_35323_1_, 0, 0, p_35323_5_ + 1, p_35323_6_, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, 0, 0, p_35323_5_ + 1, p_35323_6_ + 1, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35055_bq.field_573_bc, 0, p_35323_5_, p_35323_6_, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35055_bq.field_573_bc, 0, p_35323_5_, p_35323_6_ + 1, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35055_bq.field_573_bc, 0, p_35323_5_, p_35323_6_ + 2, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35055_bq.field_573_bc, 0, p_35323_5_ + 1, p_35323_6_ + 2, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35055_bq.field_573_bc, 0, p_35323_5_ + 2, p_35323_6_ + 2, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35055_bq.field_573_bc, 0, p_35323_5_ + 2, p_35323_6_ + 1, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35055_bq.field_573_bc, 0, p_35323_5_ + 2, p_35323_6_, p_35323_7_, p_35323_3_);
            break;

        case 4: // '\004'
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_, p_35323_6_, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_, p_35323_6_ + 1, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_, p_35323_6_ + 2, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_ + 1, p_35323_6_ + 2, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_ + 2, p_35323_6_ + 2, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_ + 2, p_35323_6_ + 1, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_35052_bn.field_573_bc, 0, p_35323_5_ + 2, p_35323_6_, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_632_aM.field_573_bc, 0, p_35323_5_ + 1, p_35323_6_, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_632_aM.field_573_bc, 8, p_35323_5_ + 1, p_35323_6_ + 1, p_35323_7_, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_9051_aR.field_573_bc, func_35301_c(Block.field_9051_aR.field_573_bc, 4), p_35323_5_ + 2, p_35323_6_ + 1, p_35323_7_ + 1, p_35323_3_);
            func_35309_a(p_35323_1_, Block.field_9051_aR.field_573_bc, func_35301_c(Block.field_9051_aR.field_573_bc, 3), p_35323_5_ + 2, p_35323_6_ + 1, p_35323_7_ - 1, p_35323_3_);
            break;
        }
    }

    protected EnumDoor func_35322_a(Random p_35322_1_)
    {
        int i = p_35322_1_.nextInt(5);
        switch(i)
        {
        case 0: // '\0'
        case 1: // '\001'
        default:
            return EnumDoor.OPENING;

        case 2: // '\002'
            return EnumDoor.WOOD_DOOR;

        case 3: // '\003'
            return EnumDoor.GRATES;

        case 4: // '\004'
            return EnumDoor.IRON_DOOR;
        }
    }

    protected StructureComponent func_35324_a(ComponentStrongholdStairs2 p_35324_1_, List p_35324_2_, Random p_35324_3_, int p_35324_4_, int p_35324_5_)
    {
        switch(field_35317_h)
        {
        case 2: // '\002'
            return StructureStrongholdPieces.func_35624_a(p_35324_1_, p_35324_2_, p_35324_3_, field_35316_g.field_35678_a + p_35324_4_, field_35316_g.field_35676_b + p_35324_5_, field_35316_g.field_35677_c - 1, field_35317_h, func_35305_c());

        case 0: // '\0'
            return StructureStrongholdPieces.func_35624_a(p_35324_1_, p_35324_2_, p_35324_3_, field_35316_g.field_35678_a + p_35324_4_, field_35316_g.field_35676_b + p_35324_5_, field_35316_g.field_35673_f + 1, field_35317_h, func_35305_c());

        case 1: // '\001'
            return StructureStrongholdPieces.func_35624_a(p_35324_1_, p_35324_2_, p_35324_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + p_35324_5_, field_35316_g.field_35677_c + p_35324_4_, field_35317_h, func_35305_c());

        case 3: // '\003'
            return StructureStrongholdPieces.func_35624_a(p_35324_1_, p_35324_2_, p_35324_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + p_35324_5_, field_35316_g.field_35677_c + p_35324_4_, field_35317_h, func_35305_c());
        }
        return null;
    }

    protected StructureComponent func_35321_b(ComponentStrongholdStairs2 p_35321_1_, List p_35321_2_, Random p_35321_3_, int p_35321_4_, int p_35321_5_)
    {
        switch(field_35317_h)
        {
        case 2: // '\002'
            return StructureStrongholdPieces.func_35624_a(p_35321_1_, p_35321_2_, p_35321_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + p_35321_4_, field_35316_g.field_35677_c + p_35321_5_, 1, func_35305_c());

        case 0: // '\0'
            return StructureStrongholdPieces.func_35624_a(p_35321_1_, p_35321_2_, p_35321_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + p_35321_4_, field_35316_g.field_35677_c + p_35321_5_, 1, func_35305_c());

        case 1: // '\001'
            return StructureStrongholdPieces.func_35624_a(p_35321_1_, p_35321_2_, p_35321_3_, field_35316_g.field_35678_a + p_35321_5_, field_35316_g.field_35676_b + p_35321_4_, field_35316_g.field_35677_c - 1, 2, func_35305_c());

        case 3: // '\003'
            return StructureStrongholdPieces.func_35624_a(p_35321_1_, p_35321_2_, p_35321_3_, field_35316_g.field_35678_a + p_35321_5_, field_35316_g.field_35676_b + p_35321_4_, field_35316_g.field_35677_c - 1, 2, func_35305_c());
        }
        return null;
    }

    protected StructureComponent func_35320_c(ComponentStrongholdStairs2 p_35320_1_, List p_35320_2_, Random p_35320_3_, int p_35320_4_, int p_35320_5_)
    {
        switch(field_35317_h)
        {
        case 2: // '\002'
            return StructureStrongholdPieces.func_35624_a(p_35320_1_, p_35320_2_, p_35320_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + p_35320_4_, field_35316_g.field_35677_c + p_35320_5_, 3, func_35305_c());

        case 0: // '\0'
            return StructureStrongholdPieces.func_35624_a(p_35320_1_, p_35320_2_, p_35320_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + p_35320_4_, field_35316_g.field_35677_c + p_35320_5_, 3, func_35305_c());

        case 1: // '\001'
            return StructureStrongholdPieces.func_35624_a(p_35320_1_, p_35320_2_, p_35320_3_, field_35316_g.field_35678_a + p_35320_5_, field_35316_g.field_35676_b + p_35320_4_, field_35316_g.field_35673_f + 1, 0, func_35305_c());

        case 3: // '\003'
            return StructureStrongholdPieces.func_35624_a(p_35320_1_, p_35320_2_, p_35320_3_, field_35316_g.field_35678_a + p_35320_5_, field_35316_g.field_35676_b + p_35320_4_, field_35316_g.field_35673_f + 1, 0, func_35305_c());
        }
        return null;
    }

    protected static boolean func_35319_a(StructureBoundingBox p_35319_0_)
    {
        return p_35319_0_ != null && p_35319_0_.field_35676_b > 10;
    }
}
