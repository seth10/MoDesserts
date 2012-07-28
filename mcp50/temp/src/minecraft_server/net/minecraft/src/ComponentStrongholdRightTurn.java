// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStrongholdLeftTurn, ComponentStrongholdStairs2, StructureStrongholdPieces, StructureBoundingBox, 
//            StructureComponent, World

public class ComponentStrongholdRightTurn extends ComponentStrongholdLeftTurn
{

    public ComponentStrongholdRightTurn(int p_i355_1_, Random p_i355_2_, StructureBoundingBox p_i355_3_, int p_i355_4_)
    {
        super(p_i355_1_, p_i355_2_, p_i355_3_, p_i355_4_);
    }

    public void func_35308_a(StructureComponent p_35308_1_, List p_35308_2_, Random p_35308_3_)
    {
        if(field_35317_h == 2 || field_35317_h == 3)
        {
            func_35320_c((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 1);
        } else
        {
            func_35321_b((ComponentStrongholdStairs2)p_35308_1_, p_35308_2_, p_35308_3_, 1, 1);
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        func_35307_a(p_35310_1_, p_35310_3_, 0, 0, 0, 4, 4, 4, true, p_35310_2_, StructureStrongholdPieces.func_35622_b());
        func_35323_a(p_35310_1_, p_35310_2_, p_35310_3_, field_35331_a, 1, 1, 0);
        if(field_35317_h == 2 || field_35317_h == 3)
        {
            func_35294_a(p_35310_1_, p_35310_3_, 4, 1, 1, 4, 3, 3, 0, 0, false);
        } else
        {
            func_35294_a(p_35310_1_, p_35310_3_, 0, 1, 1, 0, 3, 3, 0, 0, false);
        }
        return true;
    }
}
