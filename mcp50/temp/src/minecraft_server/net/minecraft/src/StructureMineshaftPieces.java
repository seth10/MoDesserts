// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentMineshaftCross, ComponentMineshaftStairs, ComponentMineshaftCorridor, StructureComponent, 
//            StructureBoundingBox, StructurePieceTreasure, Item, Block

public class StructureMineshaftPieces
{

    private static final StructurePieceTreasure field_35436_a[];

    public StructureMineshaftPieces()
    {
    }

    private static StructureComponent func_35434_a(List p_35434_0_, Random p_35434_1_, int p_35434_2_, int p_35434_3_, int p_35434_4_, int p_35434_5_, int p_35434_6_)
    {
        int i = p_35434_1_.nextInt(100);
        if(i >= 80)
        {
            StructureBoundingBox structureboundingbox = ComponentMineshaftCross.func_35362_a(p_35434_0_, p_35434_1_, p_35434_2_, p_35434_3_, p_35434_4_, p_35434_5_);
            if(structureboundingbox != null)
            {
                return new ComponentMineshaftCross(p_35434_6_, p_35434_1_, structureboundingbox, p_35434_5_);
            }
        } else
        if(i >= 70)
        {
            StructureBoundingBox structureboundingbox1 = ComponentMineshaftStairs.func_35365_a(p_35434_0_, p_35434_1_, p_35434_2_, p_35434_3_, p_35434_4_, p_35434_5_);
            if(structureboundingbox1 != null)
            {
                return new ComponentMineshaftStairs(p_35434_6_, p_35434_1_, structureboundingbox1, p_35434_5_);
            }
        } else
        {
            StructureBoundingBox structureboundingbox2 = ComponentMineshaftCorridor.func_35357_a(p_35434_0_, p_35434_1_, p_35434_2_, p_35434_3_, p_35434_4_, p_35434_5_);
            if(structureboundingbox2 != null)
            {
                return new ComponentMineshaftCorridor(p_35434_6_, p_35434_1_, structureboundingbox2, p_35434_5_);
            }
        }
        return null;
    }

    private static StructureComponent func_35435_b(StructureComponent p_35435_0_, List p_35435_1_, Random p_35435_2_, int p_35435_3_, int p_35435_4_, int p_35435_5_, int p_35435_6_, int p_35435_7_)
    {
        if(p_35435_7_ > 8)
        {
            return null;
        }
        if(Math.abs(p_35435_3_ - p_35435_0_.func_35313_b().field_35678_a) > 80 || Math.abs(p_35435_5_ - p_35435_0_.func_35313_b().field_35677_c) > 80)
        {
            return null;
        }
        StructureComponent structurecomponent = func_35434_a(p_35435_1_, p_35435_2_, p_35435_3_, p_35435_4_, p_35435_5_, p_35435_6_, p_35435_7_ + 1);
        if(structurecomponent != null)
        {
            p_35435_1_.add(structurecomponent);
            structurecomponent.func_35308_a(p_35435_0_, p_35435_1_, p_35435_2_);
        }
        return structurecomponent;
    }

    static StructureComponent func_35433_a(StructureComponent p_35433_0_, List p_35433_1_, Random p_35433_2_, int p_35433_3_, int p_35433_4_, int p_35433_5_, int p_35433_6_, int p_35433_7_)
    {
        return func_35435_b(p_35433_0_, p_35433_1_, p_35433_2_, p_35433_3_, p_35433_4_, p_35433_5_, p_35433_6_, p_35433_7_);
    }

    static StructurePieceTreasure[] func_35432_a()
    {
        return field_35436_a;
    }

    static 
    {
        field_35436_a = (new StructurePieceTreasure[] {
            new StructurePieceTreasure(Item.field_166_m.field_234_aS, 0, 1, 5, 10), new StructurePieceTreasure(Item.field_4147_n.field_234_aS, 0, 1, 3, 5), new StructurePieceTreasure(Item.field_252_aA.field_234_aS, 0, 4, 9, 5), new StructurePieceTreasure(Item.field_21097_aU.field_234_aS, 4, 4, 9, 5), new StructurePieceTreasure(Item.field_167_l.field_234_aS, 0, 1, 2, 3), new StructurePieceTreasure(Item.field_168_k.field_234_aS, 0, 3, 8, 10), new StructurePieceTreasure(Item.field_185_S.field_234_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_4152_e.field_234_aS, 0, 1, 1, 1), new StructurePieceTreasure(Block.field_637_aH.field_573_bc, 0, 4, 8, 1), new StructurePieceTreasure(Item.field_35412_bf.field_234_aS, 0, 2, 4, 10), 
            new StructurePieceTreasure(Item.field_35417_be.field_234_aS, 0, 2, 4, 10)
        });
    }
}
