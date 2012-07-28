// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentStrongholdCorridor extends ComponentStronghold
{

    private final int field_35343_a;

    public ComponentStrongholdCorridor(int p_i338_1_, Random p_i338_2_, StructureBoundingBox p_i338_3_, int p_i338_4_)
    {
        super(p_i338_1_);
        field_35317_h = p_i338_4_;
        field_35316_g = p_i338_3_;
        field_35343_a = p_i338_4_ != 2 && p_i338_4_ != 0 ? p_i338_3_.func_35669_b() : p_i338_3_.func_35665_d();
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static StructureBoundingBox func_35342_a(List p_35342_0_, Random p_35342_1_, int p_35342_2_, int p_35342_3_, int p_35342_4_, int p_35342_5_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35342_2_, p_35342_3_, p_35342_4_, -1, -1, 0, 5, 5, 4, p_35342_5_);
        StructureComponent structurecomponent = StructureComponent.func_35312_a(p_35342_0_, structureboundingbox);
        if(structurecomponent == null)
        {
            return null;
        }
        if(structurecomponent.func_35313_b().field_35676_b == structureboundingbox.field_35676_b)
        {
            for(int i = 3; i >= 1; i--)
            {
                StructureBoundingBox structureboundingbox1 = StructureBoundingBox.func_35663_a(p_35342_2_, p_35342_3_, p_35342_4_, -1, -1, 0, 5, 5, i - 1, p_35342_5_);
                if(!structurecomponent.func_35313_b().func_35664_a(structureboundingbox1))
                {
                    return StructureBoundingBox.func_35663_a(p_35342_2_, p_35342_3_, p_35342_4_, -1, -1, 0, 5, 5, i, p_35342_5_);
                }
            }

        }
        return null;
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(func_35295_a(p_35310_1_, p_35310_3_))
        {
            return false;
        }
        for(int i = 0; i < field_35343_a; i++)
        {
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 0, 0, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 1, 0, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 2, 0, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 3, 0, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 4, 0, i, p_35310_3_);
            for(int j = 1; j <= 3; j++)
            {
                func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 0, j, i, p_35310_3_);
                func_35309_a(p_35310_1_, 0, 0, 1, j, i, p_35310_3_);
                func_35309_a(p_35310_1_, 0, 0, 2, j, i, p_35310_3_);
                func_35309_a(p_35310_1_, 0, 0, 3, j, i, p_35310_3_);
                func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 4, j, i, p_35310_3_);
            }

            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 0, 4, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 1, 4, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 2, 4, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 3, 4, i, p_35310_3_);
            func_35309_a(p_35310_1_, Block.field_35052_bn.field_573_bc, 0, 4, 4, i, p_35310_3_);
        }

        return true;
    }
}
