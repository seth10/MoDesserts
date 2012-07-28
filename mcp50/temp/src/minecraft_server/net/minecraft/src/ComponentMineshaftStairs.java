// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureMineshaftPieces, World

public class ComponentMineshaftStairs extends StructureComponent
{

    public ComponentMineshaftStairs(int p_i260_1_, Random p_i260_2_, StructureBoundingBox p_i260_3_, int p_i260_4_)
    {
        super(p_i260_1_);
        field_35317_h = p_i260_4_;
        field_35316_g = p_i260_3_;
    }

    public static StructureBoundingBox func_35365_a(List p_35365_0_, Random p_35365_1_, int p_35365_2_, int p_35365_3_, int p_35365_4_, int p_35365_5_)
    {
        StructureBoundingBox structureboundingbox = new StructureBoundingBox(p_35365_2_, p_35365_3_ - 5, p_35365_4_, p_35365_2_, p_35365_3_ + 2, p_35365_4_);
        switch(p_35365_5_)
        {
        case 2: // '\002'
            structureboundingbox.field_35674_d = p_35365_2_ + 2;
            structureboundingbox.field_35677_c = p_35365_4_ - 8;
            break;

        case 0: // '\0'
            structureboundingbox.field_35674_d = p_35365_2_ + 2;
            structureboundingbox.field_35673_f = p_35365_4_ + 8;
            break;

        case 1: // '\001'
            structureboundingbox.field_35678_a = p_35365_2_ - 8;
            structureboundingbox.field_35673_f = p_35365_4_ + 2;
            break;

        case 3: // '\003'
            structureboundingbox.field_35674_d = p_35365_2_ + 8;
            structureboundingbox.field_35673_f = p_35365_4_ + 2;
            break;
        }
        if(StructureComponent.func_35312_a(p_35365_0_, structureboundingbox) != null)
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
        switch(field_35317_h)
        {
        case 2: // '\002'
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a, field_35316_g.field_35676_b, field_35316_g.field_35677_c - 1, 2, i);
            break;

        case 0: // '\0'
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a, field_35316_g.field_35676_b, field_35316_g.field_35673_f + 1, 0, i);
            break;

        case 1: // '\001'
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c, 1, i);
            break;

        case 3: // '\003'
            StructureMineshaftPieces.func_35433_a(p_35308_1_, p_35308_2_, p_35308_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b, field_35316_g.field_35677_c, 3, i);
            break;
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        func_35294_a(p_35310_1_, p_35310_3_, 0, 5, 0, 2, 7, 1, 0, 0, false);
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 7, 2, 2, 8, 0, 0, false);
        for(int i = 0; i < 5; i++)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 0, 5 - i - (i >= 4 ? 0 : 1), 2 + i, 2, 7 - i, 2 + i, 0, 0, false);
        }

        return true;
    }
}
