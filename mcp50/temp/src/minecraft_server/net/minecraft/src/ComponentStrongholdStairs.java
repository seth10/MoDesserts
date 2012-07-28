// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, EnumDoor, StructureBoundingBox, ComponentStrongholdCrossing, 
//            StructureStrongholdPieces, ComponentStrongholdStairs2, StructureComponent, Block, 
//            World

public class ComponentStrongholdStairs extends ComponentStronghold
{

    private final boolean field_35327_a;
    private final EnumDoor field_35326_b;

    public ComponentStrongholdStairs(int p_i202_1_, Random p_i202_2_, int p_i202_3_, int p_i202_4_)
    {
        super(p_i202_1_);
        field_35327_a = true;
        field_35317_h = p_i202_2_.nextInt(4);
        field_35326_b = EnumDoor.OPENING;
        switch(field_35317_h)
        {
        case 0: // '\0'
        case 2: // '\002'
            field_35316_g = new StructureBoundingBox(p_i202_3_, 64, p_i202_4_, (p_i202_3_ + 5) - 1, 74, (p_i202_4_ + 5) - 1);
            break;

        default:
            field_35316_g = new StructureBoundingBox(p_i202_3_, 64, p_i202_4_, (p_i202_3_ + 5) - 1, 74, (p_i202_4_ + 5) - 1);
            break;
        }
    }

    public ComponentStrongholdStairs(int p_i203_1_, Random p_i203_2_, StructureBoundingBox p_i203_3_, int p_i203_4_)
    {
        super(p_i203_1_);
        field_35327_a = false;
        field_35317_h = p_i203_4_;
        field_35326_b = func_35322_a(p_i203_2_);
        field_35316_g = p_i203_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        if(field_35327_a)
        {
            StructureStrongholdPieces.func_40541_a(net.minecraft.src.ComponentStrongholdCrossing.class);
        }
        func_35324_a((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 1);
    }

    public static ComponentStrongholdStairs func_35325_a(List p_35325_0_, Random p_35325_1_, int p_35325_2_, int p_35325_3_, int p_35325_4_, int p_35325_5_, int p_35325_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35325_2_, p_35325_3_, p_35325_4_, -1, -7, 0, 5, 11, 5, p_35325_5_);
        if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_35325_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdStairs(p_35325_6_, p_35325_1_, structureboundingbox, p_35325_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        } else
        {
            if(!field_35327_a);
            func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 4, 10, 4, true, p_35310_2_, StructureStrongholdPieces.func_35622_b());
            func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, field_35326_b, 1, 7, 0);
            func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, EnumDoor.OPENING, 1, 1, 4);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 2, 6, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 1, 5, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 1, 6, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 1, 5, 2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 1, 4, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 1, 5, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 2, 4, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 3, 3, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 3, 4, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 3, 3, 2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 3, 2, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 3, 3, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 2, 2, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 1, 1, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 1, 2, 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 1, 1, 2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 1, 1, 3, p_35310_3_);
            return true;
        }
    }
}
