// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, Block, StructurePieceTreasure, Item, 
//            EnumDoor, World

public class ComponentStrongholdRoomCrossing extends ComponentStronghold
{

    private static final StructurePieceTreasure field_35348_c[];
    protected final EnumDoor field_35349_a;
    protected final int field_35347_b;

    public ComponentStrongholdRoomCrossing(int p_i254_1_, Random p_i254_2_, StructureBoundingBox p_i254_3_, int p_i254_4_)
    {
        super(p_i254_1_);
        field_35317_h = p_i254_4_;
        field_35349_a = func_35322_a(p_i254_2_);
        field_35316_g = p_i254_3_;
        field_35347_b = p_i254_2_.nextInt(5);
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_35324_a((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 4, 1);
        func_35321_b((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 4);
        func_35320_c((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 4);
    }

    public static ComponentStrongholdRoomCrossing func_35346_a(List p_35346_0_, Random p_35346_1_, int p_35346_2_, int p_35346_3_, int p_35346_4_, int p_35346_5_, int p_35346_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35346_2_, p_35346_3_, p_35346_4_, -4, -1, 0, 11, 7, 11, p_35346_5_);
        if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_35346_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdRoomCrossing(p_35346_6_, p_35346_1_, structureboundingbox, p_35346_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 10, 6, 10, true, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, field_35349_a, 4, 1, 0);
        func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 10, 6, 3, 10, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 4, 0, 3, 6, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 10, 1, 4, 10, 3, 6, 0, 0, false);
        switch(field_35347_b)
        {
        default:
            break;

        case 0: // '\0'
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 5, 1, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 5, 2, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 5, 3, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 4, 3, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 6, 3, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 5, 3, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 5, 3, 6, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 4, 1, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 4, 1, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 4, 1, 6, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 6, 1, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 6, 1, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 6, 1, 6, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 5, 1, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 0, 5, 1, 6, p_35310_3_);
            break;

        case 1: // '\001'
            for(int i = 0; i < 5; i++)
            {
                func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 3, 1, 3 + i, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 7, 1, 3 + i, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 3 + i, 1, 3, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 3 + i, 1, 7, p_35310_3_);
            }

            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 5, 1, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 5, 2, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 5, 3, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_598_B.field_573_bc, 0, 5, 4, 5, p_35310_3_);
            break;

        case 2: // '\002'
            for(int j = 1; j <= 9; j++)
            {
                func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 1, 3, j, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 9, 3, j, p_35310_3_);
            }

            for(int k = 1; k <= 9; k++)
            {
                func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, k, 3, 1, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, k, 3, 9, p_35310_3_);
            }

            func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 5, 1, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 5, 1, 6, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 5, 3, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 5, 3, 6, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, 1, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 6, 1, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, 3, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 6, 3, 5, p_35310_3_);
            for(int l = 1; l <= 3; l++)
            {
                func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, l, 4, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 6, l, 4, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 4, l, 6, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_532_x.field_573_bc, 0, 6, l, 6, p_35310_3_);
            }

            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 5, 3, 5, p_35310_3_);
            for(int i1 = 2; i1 <= 8; i1++)
            {
                func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 2, 3, i1, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 3, 3, i1, p_35310_3_);
                if(i1 <= 3 || i1 >= 7)
                {
                    func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 4, 3, i1, p_35310_3_);
                    func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 5, 3, i1, p_35310_3_);
                    func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 6, 3, i1, p_35310_3_);
                }
                func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 7, 3, i1, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 8, 3, i1, p_35310_3_);
            }

            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, func_35301_c(Block.field_638_aG.field_573_bc, 4), 9, 1, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, func_35301_c(Block.field_638_aG.field_573_bc, 4), 9, 2, 3, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, func_35301_c(Block.field_638_aG.field_573_bc, 4), 9, 3, 3, p_35310_3_);
            func_35299_a(p_35310_1_, p_35310_3_, p_35310_2_, 3, 4, 8, field_35348_c, 1 + p_35310_2_.nextInt(4));
            break;
        }
        return true;
    }

    static 
    {
        field_35348_c = (new StructurePieceTreasure[] {
            new StructurePieceTreasure(Item.field_166_m.field_234_aS, 0, 1, 5, 10), new StructurePieceTreasure(Item.field_4147_n.field_234_aS, 0, 1, 3, 5), new StructurePieceTreasure(Item.field_252_aA.field_234_aS, 0, 4, 9, 5), new StructurePieceTreasure(Item.field_168_k.field_234_aS, 0, 3, 8, 10), new StructurePieceTreasure(Item.field_185_S.field_234_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_171_h.field_234_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_4152_e.field_234_aS, 0, 1, 1, 1)
        });
    }
}
