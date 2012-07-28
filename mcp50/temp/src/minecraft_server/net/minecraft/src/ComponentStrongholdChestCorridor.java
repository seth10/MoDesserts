// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, EnumDoor, Block, StructurePieceTreasure, 
//            Item, World

public class ComponentStrongholdChestCorridor extends ComponentStronghold
{

    private static final StructurePieceTreasure field_40314_a[];
    private final EnumDoor field_40312_b;
    private boolean field_40313_c;

    public ComponentStrongholdChestCorridor(int p_i170_1_, Random p_i170_2_, StructureBoundingBox p_i170_3_, int p_i170_4_)
    {
        super(p_i170_1_);
        field_35317_h = p_i170_4_;
        field_40312_b = func_35322_a(p_i170_2_);
        field_35316_g = p_i170_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        func_35324_a((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 1);
    }

    public static ComponentStrongholdChestCorridor func_40311_a(List p_40311_0_, Random p_40311_1_, int p_40311_2_, int p_40311_3_, int p_40311_4_, int p_40311_5_, int p_40311_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40311_2_, p_40311_3_, p_40311_4_, -1, -1, 0, 5, 5, 7, p_40311_5_);
        if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_40311_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdChestCorridor(p_40311_6_, p_40311_1_, structureboundingbox, p_40311_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 4, 4, 6, true, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, field_40312_b, 1, 1, 0);
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, EnumDoor.OPENING, 1, 1, 6);
        func_35294_a(p_35310_1_, p_35310_3_, 3, 1, 2, 3, 1, 4, Block.field_35052_bn.field_573_bc, Block.field_35052_bn.field_573_bc, false);
        func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 5, 3, 1, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 5, 3, 1, 5, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 5, 3, 2, 2, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 5, 3, 2, 4, p_35310_3_);
        for(int i = 2; i <= 4; i++)
        {
            func_35309_a(p_35310_1_, Block.field_607_al.field_573_bc, 5, 2, 1, i, p_35310_3_);
        }

        if(!field_40313_c)
        {
            int j = func_35300_a(2);
            int k = func_35306_a(3, 3);
            int l = func_35296_b(3, 3);
            if(p_35310_3_.func_35667_b(k, j, l))
            {
                field_40313_c = true;
                func_35299_a(p_35310_1_, p_35310_3_, p_35310_2_, 3, 2, 3, field_40314_a, 2 + p_35310_2_.nextInt(2));
            }
        }
        return true;
    }

    static 
    {
        field_40314_a = (new StructurePieceTreasure[] {
            new StructurePieceTreasure(Item.field_35411_bl.field_234_aS, 0, 1, 1, 10), new StructurePieceTreasure(Item.field_167_l.field_234_aS, 0, 1, 3, 3), new StructurePieceTreasure(Item.field_166_m.field_234_aS, 0, 1, 5, 10), new StructurePieceTreasure(Item.field_4147_n.field_234_aS, 0, 1, 3, 5), new StructurePieceTreasure(Item.field_252_aA.field_234_aS, 0, 4, 9, 5), new StructurePieceTreasure(Item.field_185_S.field_234_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_171_h.field_234_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_4152_e.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_4146_o.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_4187_ac.field_234_aS, 0, 1, 1, 5), 
            new StructurePieceTreasure(Item.field_4188_ab.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_4186_ad.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_4185_ae.field_234_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_212_ar.field_234_aS, 0, 1, 1, 1)
        });
    }
}
