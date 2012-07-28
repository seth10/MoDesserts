// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageTorch extends ComponentVillage
{

    private int field_35383_a;

    public ComponentVillageTorch(int p_i356_1_, Random p_i356_2_, StructureBoundingBox p_i356_3_, int p_i356_4_)
    {
        super(p_i356_1_);
        field_35383_a = -1;
        field_35317_h = p_i356_4_;
        field_35316_g = p_i356_3_;
    }

    public void func_35308_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static StructureBoundingBox func_35382_a(List p_35382_0_, Random p_35382_1_, int p_35382_2_, int p_35382_3_, int p_35382_4_, int p_35382_5_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35663_a(p_35382_2_, p_35382_3_, p_35382_4_, 0, 0, 0, 3, 4, 2, p_35382_5_);
        if(StructureComponent.func_35312_a(p_35382_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return structureboundingbox;
        }
    }

    public boolean func_35310_a(World p_35310_1_, Random p_35310_2_, StructureBoundingBox p_35310_3_)
    {
        if(field_35383_a < 0)
        {
            field_35383_a = func_35367_b(p_35310_1_, p_35310_3_);
            if(field_35383_a < 0)
            {
                return true;
            }
            field_35316_g.func_35670_a(0, ((field_35383_a - field_35316_g.field_35675_e) + 4) - 1, 0);
        }
        func_35294_a(p_35310_1_, p_35310_3_, 0, 0, 0, 2, 3, 1, 0, 0, false);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 1, 0, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 1, 1, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9050_aZ.field_573_bc, 0, 1, 2, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_616_ac.field_573_bc, 15, 1, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 15, 0, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 15, 1, 3, 1, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 15, 2, 3, 0, p_35310_3_);
        func_35309_a(p_35310_1_, Block.field_9046_aq.field_573_bc, 15, 1, 3, -1, p_35310_3_);
        return true;
    }
}
