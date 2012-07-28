// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructurePieceBlockSelector, Block, StructureStrongholdPieceWeight2

class StructureStrongholdStones extends StructurePieceBlockSelector
{

    private StructureStrongholdStones()
    {
    }

    public void func_35565_a(Random p_35565_1_, int p_35565_2_, int p_35565_3_, int p_35565_4_, boolean p_35565_5_)
    {
        if(!p_35565_5_)
        {
            field_35569_a = 0;
            field_35568_b = 0;
        } else
        {
            field_35569_a = Block.field_35052_bn.field_573_bc;
            float f = p_35565_1_.nextFloat();
            if(f < 0.2F)
            {
                field_35568_b = 2;
            } else
            if(f < 0.5F)
            {
                field_35568_b = 1;
            } else
            if(f < 0.55F)
            {
                field_35569_a = Block.field_35056_bm.field_573_bc;
                field_35568_b = 2;
            } else
            {
                field_35568_b = 0;
            }
        }
    }

    StructureStrongholdStones(StructureStrongholdPieceWeight2 p_i512_1_)
    {
        this();
    }
}
