// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, ComponentVillageStartPiece, StructureVillagePieces, 
//            Block, StructureComponent, World

public class ComponentVillageWell extends ComponentVillage
{

    private final boolean field_35385_a = true;
    private int field_35384_b;

    public ComponentVillageWell(int p_i370_1_, Random p_i370_2_, int p_i370_3_, int p_i370_4_)
    {
        super(p_i370_1_);
        field_35384_b = -1;
        field_35317_h = p_i370_2_.nextInt(4);
        switch(field_35317_h)
        {
        case 0: // '\0'
        case 2: // '\002'
            field_35316_g = new StructureBoundingBox(p_i370_3_, 64, p_i370_4_, (p_i370_3_ + 6) - 1, 78, (p_i370_4_ + 6) - 1);
            break;

        default:
            field_35316_g = new StructureBoundingBox(p_i370_3_, 64, p_i370_4_, (p_i370_3_ + 6) - 1, 78, (p_i370_4_ + 6) - 1);
            break;
        }
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35675_e - 4, field_35316_g.field_35677_c + 1, 1, func_35305_c());
        StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35675_e - 4, field_35316_g.field_35677_c + 1, 3, func_35305_c());
        StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35675_e - 4, field_35316_g.field_35677_c - 1, 2, func_35305_c());
        StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35675_e - 4, field_35316_g.field_35673_f + 1, 0, func_35305_c());
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35384_b < 0)
        {
            field_35384_b = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35384_b < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, (field_35384_b - field_35316_g.field_35675_e) + 3, 0);
        }
        if(!field_35385_a);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 0, 1, 4, 12, 4, Block.field_532_x.field_573_bc, Block.field_598_B.field_573_bc, false);
        func_35309_a(p_35310_1_, 0, 0, 2, 12, 2, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 3, 12, 2, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 2, 12, 3, p_35310_3_);
        func_35309_a(p_35310_1_, 0, 0, 3, 12, 3, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 1, 13, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 1, 14, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 13, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 14, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 1, 13, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 1, 14, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 13, 4, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 4, 14, 4, p_35310_3_);
        func_35294_a(p_35310_1_, p_35310_3_, 1, 15, 1, 4, 15, 4, Block.field_532_x.field_573_bc, Block.field_532_x.field_573_bc, false);
        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j <= 5; j++)
            {
                if(j == 0 || j == 5 || i == 0 || i == 5)
                {
                    func_35309_a(p_35310_1_, Block.field_4062_G.field_573_bc, 0, j, 11, i, p_35310_3_);
                    func_35314_b(p_35310_1_, j, 12, i, p_35310_3_);
                }
            }

        }

        return true;
    }
}
