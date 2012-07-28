// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureMineshaftPieces, Block, 
//            World

public class ComponentMineshaftCross extends StructureComponent
{

    private final int field_35364_a;
    private final boolean field_35363_b;

    public ComponentMineshaftCross(int p_i320_1_, Random p_i320_2_, StructureBoundingBox p_i320_3_, int p_i320_4_)
    {
        super(p_i320_1_);
        field_35364_a = p_i320_4_;
        field_35316_g = p_i320_3_;
        field_35363_b = p_i320_3_.func_35668_c() > 3;
    }

    public static StructureBoundingBox func_35362_a(List p_35362_0_, Random p_35362_1_, int p_35362_2_, int p_35362_3_, int p_35362_4_, int p_35362_5_)
    {
        StructureBoundingBox structureboundingbox = new StructureBoundingBox(p_35362_2_, p_35362_3_, p_35362_4_, p_35362_2_, p_35362_3_ + 2, p_35362_4_);
        if(p_35362_1_.nextInt(4) == 0)
        {
            structureboundingbox.field_35675_e += 4;
        }
        switch(p_35362_5_)
        {
        case 2: // '\002'
            structureboundingbox.field_35678_a = p_35362_2_ - 1;
            structureboundingbox.field_35674_d = p_35362_2_ + 3;
            structureboundingbox.field_35677_c = p_35362_4_ - 4;
            break;

        case 0: // '\0'
            structureboundingbox.field_35678_a = p_35362_2_ - 1;
            structureboundingbox.field_35674_d = p_35362_2_ + 3;
            structureboundingbox.field_35673_f = p_35362_4_ + 4;
            break;

        case 1: // '\001'
            structureboundingbox.field_35678_a = p_35362_2_ - 4;
            structureboundingbox.field_35677_c = p_35362_4_ - 1;
            structureboundingbox.field_35673_f = p_35362_4_ + 3;
            break;

        case 3: // '\003'
            structureboundingbox.field_35674_d = p_35362_2_ + 4;
            structureboundingbox.field_35677_c = p_35362_4_ - 1;
            structureboundingbox.field_35673_f = p_35362_4_ + 3;
            break;
        }
        if(StructureComponent.func_35312_a(p_35362_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return structureboundingbox;
        }
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        int i = func_35305_c();
        switch(field_35364_a)
        {
        case 2: // '\002'
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c - 1, 2, i);
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, 1, i);
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, 3, i);
            break;

        case 0: // '\0'
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35673_f + 1, 0, i);
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, 1, i);
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, 3, i);
            break;

        case 1: // '\001'
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c - 1, 2, i);
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35673_f + 1, 0, i);
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, 1, i);
            break;

        case 3: // '\003'
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c - 1, 2, i);
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35673_f + 1, 0, i);
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, 3, i);
            break;
        }
        if(field_35363_b)
        {
            if(p_35308_3_.nextBoolean())
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b + 3 + 1, field_35316_g.field_35677_c - 1, 2, i);
            }
            if(p_35308_3_.nextBoolean())
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + 3 + 1, field_35316_g.field_35677_c + 1, 1, i);
            }
            if(p_35308_3_.nextBoolean())
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + 3 + 1, field_35316_g.field_35677_c + 1, 3, i);
            }
            if(p_35308_3_.nextBoolean())
            {
                StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b + 3 + 1, field_35316_g.field_35673_f + 1, 0, i);
            }
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        if(field_35363_b)
        {
            func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c, field_35316_g.field_35674_d - 1, (field_35316_g.field_35676_b + 3) - 1, field_35316_g.field_35673_f, 0, 0, false);
            func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, field_35316_g.field_35674_d, (field_35316_g.field_35676_b + 3) - 1, field_35316_g.field_35673_f - 1, 0, 0, false);
            func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35675_e - 2, field_35316_g.field_35677_c, field_35316_g.field_35674_d - 1, field_35316_g.field_35675_e, field_35316_g.field_35673_f, 0, 0, false);
            func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a, field_35316_g.field_35675_e - 2, field_35316_g.field_35677_c + 1, field_35316_g.field_35674_d, field_35316_g.field_35675_e, field_35316_g.field_35673_f - 1, 0, 0, false);
            func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b + 3, field_35316_g.field_35677_c + 1, field_35316_g.field_35674_d - 1, field_35316_g.field_35676_b + 3, field_35316_g.field_35673_f - 1, 0, 0, false);
        } else
        {
            func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c, field_35316_g.field_35674_d - 1, field_35316_g.field_35675_e, field_35316_g.field_35673_f, 0, 0, false);
            func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, field_35316_g.field_35674_d, field_35316_g.field_35675_e, field_35316_g.field_35673_f - 1, 0, 0, false);
        }
        func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, field_35316_g.field_35678_a + 1, field_35316_g.field_35675_e, field_35316_g.field_35677_c + 1, Block.field_531_y.field_573_bc, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35678_a + 1, field_35316_g.field_35676_b, field_35316_g.field_35673_f - 1, field_35316_g.field_35678_a + 1, field_35316_g.field_35675_e, field_35316_g.field_35673_f - 1, Block.field_531_y.field_573_bc, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35674_d - 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c + 1, field_35316_g.field_35674_d - 1, field_35316_g.field_35675_e, field_35316_g.field_35677_c + 1, Block.field_531_y.field_573_bc, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, field_35316_g.field_35674_d - 1, field_35316_g.field_35676_b, field_35316_g.field_35673_f - 1, field_35316_g.field_35674_d - 1, field_35316_g.field_35675_e, field_35316_g.field_35673_f - 1, Block.field_531_y.field_573_bc, 0, false);
        for(int i = field_35316_g.field_35678_a; i <= field_35316_g.field_35674_d; i++)
        {
            for(int j = field_35316_g.field_35677_c; j <= field_35316_g.field_35673_f; j++)
            {
                int k = func_35297_a(p_35310_1_, i, field_35316_g.field_35676_b - 1, j, p_35310_3_);
                if(k == 0)
                {
                    func_35309_a(p_35310_1_, Block.field_531_y.field_573_bc, 0, i, field_35316_g.field_35676_b - 1, j, p_35310_3_);
                }
            }

        }

        return true;
    }
}
