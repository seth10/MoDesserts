// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, Block, EnumDoor, World

public class ComponentStrongholdCrossing extends ComponentStronghold
{

    protected final EnumDoor field_35355_a;
    private boolean field_35353_b;
    private boolean field_35354_c;
    private boolean field_35351_d;
    private boolean field_35352_e;

    public ComponentStrongholdCrossing(int p_i523_1_, Random p_i523_2_, StructureBoundingBox p_i523_3_, int p_i523_4_)
    {
        super(p_i523_1_);
        field_35317_h = p_i523_4_;
        field_35355_a = func_35322_a(p_i523_2_);
        field_35316_g = p_i523_3_;
        field_35353_b = p_i523_2_.nextBoolean();
        field_35354_c = p_i523_2_.nextBoolean();
        field_35351_d = p_i523_2_.nextBoolean();
        field_35352_e = p_i523_2_.nextInt(3) > 0;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        int i = 3;
        int j = 5;
        if(field_35317_h == 1 || field_35317_h == 2)
        {
            i = 8 - i;
            j = 8 - j;
        }
        func_35324_a((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 5, 1);
        if(field_35353_b)
        {
            func_35321_b((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, i, 1);
        }
        if(field_35354_c)
        {
            func_35321_b((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, j, 7);
        }
        if(field_35351_d)
        {
            func_35320_c((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, i, 1);
        }
        if(field_35352_e)
        {
            func_35320_c((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, j, 7);
        }
    }

    public static ComponentStrongholdCrossing func_35350_a(List p_35350_0_, Random p_35350_1_, int p_35350_2_, int p_35350_3_, int p_35350_4_, int p_35350_5_, int p_35350_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35350_2_, p_35350_3_, p_35350_4_, -4, -3, 0, 10, 9, 11, p_35350_5_);
        if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_35350_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdCrossing(p_35350_6_, p_35350_1_, structureboundingbox, p_35350_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 9, 8, 10, true, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, field_35355_a, 4, 3, 0);
        if(field_35353_b)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 0, 3, 1, 0, 5, 3, 0, 0, false);
        }
        if(field_35351_d)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 9, 3, 1, 9, 5, 3, 0, 0, false);
        }
        if(field_35354_c)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 7, 0, 7, 9, 0, 0, false);
        }
        if(field_35352_e)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 9, 5, 7, 9, 7, 9, 0, 0, false);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 5, 1, 10, 7, 3, 10, 0, 0, false);
        func_35307_a(p_35310_1_, p_35310_3_, 1, 2, 1, 8, 2, 6, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 4, 1, 5, 4, 4, 9, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 8, 1, 5, 8, 4, 9, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 1, 4, 7, 3, 4, 9, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 1, 3, 5, 3, 3, 6, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35294_a(p_35310_1_, p_35310_3_, 1, 3, 4, 3, 3, 4, Block.field_607_al.field_573_bc, Block.field_607_al.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 4, 6, 3, 4, 6, Block.field_607_al.field_573_bc, Block.field_607_al.field_573_bc, false);
        func_35307_a(p_35310_1_, p_35310_3_, 5, 1, 7, 7, 1, 8, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35294_a(p_35310_1_, p_35310_3_, 5, 1, 9, 7, 1, 9, Block.field_607_al.field_573_bc, Block.field_607_al.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 5, 2, 7, 7, 2, 7, Block.field_607_al.field_573_bc, Block.field_607_al.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 5, 7, 4, 5, 9, Block.field_607_al.field_573_bc, Block.field_607_al.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 8, 5, 7, 8, 5, 9, Block.field_607_al.field_573_bc, Block.field_607_al.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 5, 5, 7, 7, 5, 9, Block.field_608_ak.field_573_bc, Block.field_608_ak.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 6, 5, 6, p_35310_3_);
        return true;
    }
}
