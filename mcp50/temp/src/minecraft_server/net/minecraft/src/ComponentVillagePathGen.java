// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillageRoadPiece, StructureBoundingBox, ComponentVillageStartPiece, StructureComponent, 
//            StructureVillagePieces, MathHelper, World, Block

public class ComponentVillagePathGen extends ComponentVillageRoadPiece
{

    private int field_35379_a;

    public ComponentVillagePathGen(int p_i471_1_, Random p_i471_2_, StructureBoundingBox p_i471_3_, int p_i471_4_)
    {
        super(p_i471_1_);
        field_35317_h = p_i471_4_;
        field_35316_g = p_i471_3_;
        field_35379_a = Math.max(p_i471_3_.func_35669_b(), p_i471_3_.func_35665_d());
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        boolean flag = false;
        for(int i = p_35308_3_.nextInt(5); i < field_35379_a - 8; i += 2 + p_35308_3_.nextInt(5))
        {
            StructureComponent structurecomponent = func_35368_a((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 0, i);
            if(structurecomponent != null)
            {
                i += Math.max(structurecomponent.field_35316_g.func_35669_b(), structurecomponent.field_35316_g.func_35665_d());
                flag = true;
            }
        }

        for(int j = p_35308_3_.nextInt(5); j < field_35379_a - 8; j += 2 + p_35308_3_.nextInt(5))
        {
            StructureComponent structurecomponent1 = func_35369_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, 0, j);
            if(structurecomponent1 != null)
            {
                j += Math.max(structurecomponent1.field_35316_g.func_35669_b(), structurecomponent1.field_35316_g.func_35665_d());
                flag = true;
            }
        }

        if(flag && p_35308_3_.nextInt(3) > 0)
        {
            switch(field_35317_h)
            {
            case 2: // '\002'
                StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c, 1, func_35305_c());
                break;

            case 0: // '\0'
                StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b, field_35316_g.field_35673_f - 2, 1, func_35305_c());
                break;

            case 3: // '\003'
                StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d - 2, field_35316_g.field_35676_b, field_35316_g.field_35677_c - 1, 2, func_35305_c());
                break;

            case 1: // '\001'
                StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a, field_35316_g.field_35676_b, field_35316_g.field_35677_c - 1, 2, func_35305_c());
                break;
            }
        }
        if(flag && p_35308_3_.nextInt(3) > 0)
        {
            switch(field_35317_h)
            {
            case 2: // '\002'
                StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c, 3, func_35305_c());
                break;

            case 0: // '\0'
                StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b, field_35316_g.field_35673_f - 2, 3, func_35305_c());
                break;

            case 3: // '\003'
                StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d - 2, field_35316_g.field_35676_b, field_35316_g.field_35673_f + 1, 0, func_35305_c());
                break;

            case 1: // '\001'
                StructureVillagePieces.func_35642_b((ComponentVillageStartPiece)p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a, field_35316_g.field_35676_b, field_35316_g.field_35673_f + 1, 0, func_35305_c());
                break;
            }
        }
    }

    public static StructureBoundingBox func_35378_a(ComponentVillageStartPiece p_35378_0_, List p_35378_1_, Random p_35378_2_, int p_35378_3_, int p_35378_4_, int p_35378_5_, int p_35378_6_)
    {
        for(int i = 7 * MathHelper.func_35476_a(p_35378_2_, 3, 5); i >= 7; i -= 7)
        {
            StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35378_3_, p_35378_4_, p_35378_5_, 0, 0, 0, 3, 3, i, p_35378_6_);
            if(StructureComponent.func_35312_a(p_35378_1_, structureboundingbox) == null)
            {
                return structureboundingbox;
            }
        }

        return null;
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        for(int i = field_35316_g.field_35678_a; i <= field_35316_g.field_35674_d; i++)
        {
            for(int j = field_35316_g.field_35677_c; j <= field_35316_g.field_35673_f; j++)
            {
                if(p_35310_3_.func_35667_b(i, 64, j))
                {
                    int k = p_35310_1_.func_4075_e(i, j) - 1;
                    p_35310_1_.func_462_a(i, k, j, Block.field_4062_G.field_573_bc);
                }
            }

        }

        return true;
    }
}
