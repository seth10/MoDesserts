// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, EnumDoor, Block, World

public class ComponentStrongholdStraight extends ComponentStronghold
{

    private final EnumDoor field_35341_a;
    private final boolean field_35339_b;
    private final boolean field_35340_c;

    public ComponentStrongholdStraight(int p_i347_1_, Random p_i347_2_, StructureBoundingBox p_i347_3_, int p_i347_4_)
    {
        super(p_i347_1_);
        field_35317_h = p_i347_4_;
        field_35341_a = func_35322_a(p_i347_2_);
        field_35316_g = p_i347_3_;
        field_35339_b = p_i347_2_.nextInt(2) == 0;
        field_35340_c = p_i347_2_.nextInt(2) == 0;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_35324_a((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 1);
        if(field_35339_b)
        {
            func_35321_b((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 2);
        }
        if(field_35340_c)
        {
            func_35320_c((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 2);
        }
    }

    public static ComponentStrongholdStraight func_35338_a(List p_35338_0_, Random p_35338_1_, int p_35338_2_, int p_35338_3_, int p_35338_4_, int p_35338_5_, int p_35338_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35338_2_, p_35338_3_, p_35338_4_, -1, -1, 0, 5, 5, 7, p_35338_5_);
        if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_35338_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdStraight(p_35338_6_, p_35338_1_, structureboundingbox, p_35338_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 4, 4, 6, true, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, field_35341_a, 1, 1, 0);
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, EnumDoor.OPENING, 1, 1, 6);
        func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.1F, 1, 2, 1, Block.field_9046_aq.field_573_bc, 0);
        func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.1F, 3, 2, 1, Block.field_9046_aq.field_573_bc, 0);
        func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.1F, 1, 2, 5, Block.field_9046_aq.field_573_bc, 0);
        func_35302_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.1F, 3, 2, 5, Block.field_9046_aq.field_573_bc, 0);
        if(field_35339_b)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 2, 0, 3, 4, 0, 0, false);
        }
        if(field_35340_c)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 2, 4, 3, 4, 0, 0, false);
        }
        return true;
    }
}
