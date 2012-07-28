// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, StructureBoundingBox, StructureComponent, StructureStrongholdPieces, 
//            Block, StructurePieceTreasure, Item, ItemMap, 
//            EnumDoor, World

public class ComponentStrongholdLibrary extends ComponentStronghold
{

    private static final StructurePieceTreasure field_35335_b[];
    protected final EnumDoor field_35337_a;
    private final boolean field_35336_c;

    public ComponentStrongholdLibrary(int p_i304_1_, Random p_i304_2_, StructureBoundingBox p_i304_3_, int p_i304_4_)
    {
        super(p_i304_1_);
        field_35317_h = p_i304_4_;
        field_35337_a = func_35322_a(p_i304_2_);
        field_35316_g = p_i304_3_;
        field_35336_c = p_i304_3_.func_35668_c() > 6;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentStrongholdLibrary func_35334_a(List p_35334_0_, Random p_35334_1_, int p_35334_2_, int p_35334_3_, int p_35334_4_, int p_35334_5_, int p_35334_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35334_2_, p_35334_3_, p_35334_4_, -4, -1, 0, 14, 11, 15, p_35334_5_);
        if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_35334_0_, structureboundingbox) != null)
        {
            structureboundingbox = StructureBoundingBox.func_35663_a(p_35334_2_, p_35334_3_, p_35334_4_, -4, -1, 0, 14, 6, 15, p_35334_5_);
            if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_35334_0_, structureboundingbox) != null)
            {
                return null;
            }
        }
        return new ComponentStrongholdLibrary(p_35334_6_, p_35334_1_, structureboundingbox, p_35334_5_);
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        byte byte0 = 11;
        if(!field_35336_c)
        {
            byte0 = 6;
        }
        func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 13, byte0 - 1, 14, true, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, field_35337_a, 4, 1, 0);
        func_35315_a(p_35310_1_, p_35310_3_, p_35310_2_, 0.07F, 2, 1, 1, 11, 4, 13, Block.field_9032_W.field_573_bc, Block.field_9032_W.field_573_bc, false);
        for(int i = 1; i <= 13; i++)
        {
            if((i - 1) % 4 == 0)
            {
                func_35294_a(p_35310_1_, p_35310_3_, 1, 1, i, 1, 4, i, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
                func_35294_a(p_35310_1_, p_35310_3_, 12, 1, i, 12, 4, i, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
                func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 2, 3, i, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, 11, 3, i, p_35310_3_);
                if(field_35336_c)
                {
                    func_35294_a(p_35310_1_, p_35310_3_, 1, 6, i, 1, 9, i, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
                    func_35294_a(p_35310_1_, p_35310_3_, 12, 6, i, 12, 9, i, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
                }
                continue;
            }
            func_35294_a(p_35310_1_, p_35310_3_, 1, 1, i, 1, 4, i, Block.field_604_ao.field_573_bc, Block.field_604_ao.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 12, 1, i, 12, 4, i, Block.field_604_ao.field_573_bc, Block.field_604_ao.field_573_bc, false);
            if(field_35336_c)
            {
                func_35294_a(p_35310_1_, p_35310_3_, 1, 6, i, 1, 9, i, Block.field_604_ao.field_573_bc, Block.field_604_ao.field_573_bc, false);
                func_35294_a(p_35310_1_, p_35310_3_, 12, 6, i, 12, 9, i, Block.field_604_ao.field_573_bc, Block.field_604_ao.field_573_bc, false);
            }
        }

        for(int j = 3; j < 12; j += 2)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 3, 1, j, 4, 3, j, Block.field_604_ao.field_573_bc, Block.field_604_ao.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 6, 1, j, 7, 3, j, Block.field_604_ao.field_573_bc, Block.field_604_ao.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 9, 1, j, 10, 3, j, Block.field_604_ao.field_573_bc, Block.field_604_ao.field_573_bc, false);
        }

        if(field_35336_c)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 1, 5, 1, 3, 5, 13, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 10, 5, 1, 12, 5, 13, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 4, 5, 1, 9, 5, 2, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 4, 5, 12, 9, 5, 13, Block.field_531_y.field_573_bc, Block.field_531_y.field_573_bc, false);
            func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 9, 5, 11, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 8, 5, 11, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, 9, 5, 10, p_35310_3_);
            func_35294_a(p_35310_1_, p_35310_3_, 3, 6, 2, 3, 6, 12, Block.field_9050_aZ.field_573_bc, Block.field_9050_aZ.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 10, 6, 2, 10, 6, 10, Block.field_9050_aZ.field_573_bc, Block.field_9050_aZ.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 4, 6, 2, 9, 6, 2, Block.field_9050_aZ.field_573_bc, Block.field_9050_aZ.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 4, 6, 12, 8, 6, 12, Block.field_9050_aZ.field_573_bc, Block.field_9050_aZ.field_573_bc, false);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 9, 6, 11, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 8, 6, 11, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 9, 6, 10, p_35310_3_);
            int k = func_35301_c(Block.field_638_aG.field_573_bc, 3);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, k, 10, 1, 13, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, k, 10, 2, 13, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, k, 10, 3, 13, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, k, 10, 4, 13, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, k, 10, 5, 13, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, k, 10, 6, 13, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_638_aG.field_573_bc, k, 10, 7, 13, p_35310_3_);
            byte byte1 = 7;
            byte byte2 = 7;
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1 - 1, 9, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1, 9, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1 - 1, 8, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1, 8, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1 - 1, 7, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1, 7, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1 - 2, 7, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1 + 1, 7, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1 - 1, 7, byte2 - 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1 - 1, 7, byte2 + 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1, 7, byte2 - 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, byte1, 7, byte2 + 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, byte1 - 2, 8, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, byte1 + 1, 8, byte2, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, byte1 - 1, 8, byte2 - 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, byte1 - 1, 8, byte2 + 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, byte1, 8, byte2 - 1, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 0, byte1, 8, byte2 + 1, p_35310_3_);
        }
        func_35299_a(p_35310_1_, p_35310_3_, p_35310_2_, 3, 3, 5, field_35335_b, 1 + p_35310_2_.nextInt(4));
        if(field_35336_c)
        {
            func_35309_a(p_35310_1_, 0, 0, 12, 9, 1, p_35310_3_);
            func_35299_a(p_35310_1_, p_35310_3_, p_35310_2_, 12, 8, 1, field_35335_b, 1 + p_35310_2_.nextInt(4));
        }
        return true;
    }

    static 
    {
        field_35335_b = (new StructurePieceTreasure[] {
            new StructurePieceTreasure(Item.field_4200_aJ.field_234_aS, 0, 1, 3, 20), new StructurePieceTreasure(Item.field_4201_aI.field_234_aS, 0, 2, 7, 20), new StructurePieceTreasure(Item.field_28021_bb.field_234_aS, 0, 1, 1, 1), new StructurePieceTreasure(Item.field_4197_aO.field_234_aS, 0, 1, 1, 1)
        });
    }
}
