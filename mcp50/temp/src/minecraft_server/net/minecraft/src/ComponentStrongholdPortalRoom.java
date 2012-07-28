// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, EnumDoor, Block, World, 
//            TileEntityMobSpawner

public class ComponentStrongholdPortalRoom extends ComponentStronghold
{

    private boolean field_40316_a;

    public ComponentStrongholdPortalRoom(int p_i274_1_, Random p_i274_2_, StructureBoundingBox p_i274_3_, int p_i274_4_)
    {
        super(p_i274_1_);
        field_35317_h = p_i274_4_;
        field_35316_g = p_i274_3_;
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        if(p_35308_1_ != null)
        {
            ((ComponentStrongholdStairs2)p_35308_1_).field_40317_b = this;
        }
    }

    public static ComponentStrongholdPortalRoom func_40315_a(List p_40315_0_, Random p_40315_1_, int p_40315_2_, int p_40315_3_, int p_40315_4_, int p_40315_5_, int p_40315_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_40315_2_, p_40315_3_, p_40315_4_, -4, -1, 0, 11, 8, 16, p_40315_5_);
        if(!func_35319_a(structureboundingbox) || StructureComponent.func_35312_a(p_40315_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdPortalRoom(p_40315_6_, p_40315_1_, structureboundingbox, p_40315_5_);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 10, 7, 15, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, EnumDoor.GRATES, 4, 1, 0);
        byte byte0 = 6;
        func_35307_a(p_35310_1_, p_35310_3_, 1, byte0, 1, 1, byte0, 14, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 9, byte0, 1, 9, byte0, 14, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 2, byte0, 1, 8, byte0, 2, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 2, byte0, 14, 8, byte0, 14, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 1, 1, 1, 2, 1, 4, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 8, 1, 1, 9, 1, 4, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35294_a(p_35310_1_, p_35310_3_, 1, 1, 1, 1, 1, 3, Block.field_594_D.field_573_bc, Block.field_594_D.field_573_bc, false);
        func_35294_a(p_35310_1_, p_35310_3_, 9, 1, 1, 9, 1, 3, Block.field_594_D.field_573_bc, Block.field_594_D.field_573_bc, false);
        func_35307_a(p_35310_1_, p_35310_3_, 3, 1, 8, 7, 1, 12, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 9, 6, 1, 11, Block.field_594_D.field_573_bc, Block.field_594_D.field_573_bc, false);
        for(int j = 3; j < 14; j += 2)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 0, 3, j, 0, 4, j, Block.field_35055_bq.field_573_bc, Block.field_35055_bq.field_573_bc, false);
            func_35294_a(p_35310_1_, p_35310_3_, 10, 3, j, 10, 4, j, Block.field_35055_bq.field_573_bc, Block.field_35055_bq.field_573_bc, false);
        }

        for(int k = 2; k < 9; k += 2)
        {
            func_35294_a(p_35310_1_, p_35310_3_, k, 3, 15, k, 4, 15, Block.field_35055_bq.field_573_bc, Block.field_35055_bq.field_573_bc, false);
        }

        int l = func_35301_c(Block.field_35046_by.field_573_bc, 3);
        func_35307_a(p_35310_1_, p_35310_3_, 4, 1, 5, 6, 1, 7, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 4, 2, 6, 6, 2, 7, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35307_a(p_35310_1_, p_35310_3_, 4, 3, 7, 6, 3, 7, false, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        for(int i1 = 4; i1 <= 6; i1++)
        {
            func_35309_a(p_35310_1_, Block.field_35046_by.field_573_bc, l, i1, 1, 4, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35046_by.field_573_bc, l, i1, 2, 5, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35046_by.field_573_bc, l, i1, 3, 6, p_35310_3_);
        }

        byte byte1 = 2;
        byte byte2 = 0;
        byte byte3 = 3;
        byte byte4 = 1;
        switch(field_35317_h)
        {
        case 0: // '\0'
            byte1 = 0;
            byte2 = 2;
            break;

        case 3: // '\003'
            byte1 = 3;
            byte2 = 1;
            byte3 = 0;
            byte4 = 2;
            break;

        case 1: // '\001'
            byte1 = 1;
            byte2 = 3;
            byte3 = 0;
            byte4 = 2;
            break;
        }
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte1 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 4, 3, 8, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte1 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 5, 3, 8, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte1 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 6, 3, 8, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte2 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 4, 3, 12, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte2 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 5, 3, 12, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte2 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 6, 3, 12, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte3 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 3, 3, 9, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte3 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 3, 3, 10, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte3 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 3, 3, 11, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte4 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 7, 3, 9, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte4 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 7, 3, 10, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_40167_bJ.field_573_bc, byte4 + (p_35310_2_.nextFloat() <= 0.9F ? 0 : 4), 7, 3, 11, p_35310_3_);
        if(!field_40316_a)
        {
            int i = func_35300_a(3);
            int j1 = func_35306_a(5, 6);
            int k1 = func_35296_b(5, 6);
            if(p_35310_3_.func_35667_b(j1, i, k1))
            {
                field_40316_a = true;
                p_35310_1_.func_508_d(j1, i, k1, Block.field_597_at.field_573_bc);
                TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)p_35310_1_.func_451_k(j1, i, k1);
                if(tileentitymobspawner != null)
                {
                    tileentitymobspawner.func_21078_a("Silverfish");
                }
            }
        }
        return true;
    }
}
