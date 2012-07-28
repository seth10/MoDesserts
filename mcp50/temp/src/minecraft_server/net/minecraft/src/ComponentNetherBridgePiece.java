// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureNetherBridgePieceWeight, ComponentNetherBridgeStartPiece, StructureNetherBridgePieces, 
//            ComponentNetherBridgeEnd, StructureBoundingBox

abstract class ComponentNetherBridgePiece extends StructureComponent
{

    protected ComponentNetherBridgePiece(int p_i230_1_)
    {
        super(p_i230_1_);
    }

    private int func_40282_a(List p_40282_1_)
    {
        boolean flag = false;
        int i = 0;
        for(Iterator iterator = p_40282_1_.iterator(); iterator.hasNext();)
        {
            StructureNetherBridgePieceWeight structurenetherbridgepieceweight = (StructureNetherBridgePieceWeight)iterator.next();
            if(structurenetherbridgepieceweight.field_40651_d > 0 && structurenetherbridgepieceweight.field_40654_c < structurenetherbridgepieceweight.field_40651_d)
            {
                flag = true;
            }
            i += structurenetherbridgepieceweight.field_40653_b;
        }

        return flag ? i : -1;
    }

    private ComponentNetherBridgePiece func_40284_a(ComponentNetherBridgeStartPiece p_40284_1_, List p_40284_2_, List p_40284_3_, Random p_40284_4_, int p_40284_5_, int p_40284_6_, int p_40284_7_, 
            int p_40284_8_, int p_40284_9_)
    {
        int i;
        boolean flag;
        int j;
        i = func_40282_a(p_40284_2_);
        flag = i > 0 && p_40284_9_ <= 30;
        j = 0;
_L2:
        int k;
        Iterator iterator;
        if(j >= 5 || !flag)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        j++;
        k = p_40284_4_.nextInt(i);
        iterator = p_40284_2_.iterator();
_L4:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        StructureNetherBridgePieceWeight structurenetherbridgepieceweight;
        structurenetherbridgepieceweight = (StructureNetherBridgePieceWeight)iterator.next();
        k -= structurenetherbridgepieceweight.field_40653_b;
        if(k >= 0) goto _L4; else goto _L3
_L3:
        if(structurenetherbridgepieceweight.func_40649_a(p_40284_9_) && (structurenetherbridgepieceweight != p_40284_1_.field_40296_a || structurenetherbridgepieceweight.field_40652_e)) goto _L5; else goto _L2
_L5:
        ComponentNetherBridgePiece componentnetherbridgepiece = StructureNetherBridgePieces.func_40538_a(structurenetherbridgepieceweight, p_40284_3_, p_40284_4_, p_40284_5_, p_40284_6_, p_40284_7_, p_40284_8_, p_40284_9_);
        if(componentnetherbridgepiece == null) goto _L4; else goto _L6
_L6:
        structurenetherbridgepieceweight.field_40654_c++;
        p_40284_1_.field_40296_a = structurenetherbridgepieceweight;
        if(!structurenetherbridgepieceweight.func_40650_a())
        {
            p_40284_2_.remove(structurenetherbridgepieceweight);
        }
        return componentnetherbridgepiece;
        ComponentNetherBridgeEnd componentnetherbridgeend = ComponentNetherBridgeEnd.func_40301_a(p_40284_3_, p_40284_4_, p_40284_5_, p_40284_6_, p_40284_7_, p_40284_8_, p_40284_9_);
        return componentnetherbridgeend;
    }

    private StructureComponent func_40283_a(ComponentNetherBridgeStartPiece p_40283_1_, List p_40283_2_, Random p_40283_3_, int p_40283_4_, int p_40283_5_, int p_40283_6_, int p_40283_7_, 
            int p_40283_8_, boolean p_40283_9_)
    {
        if(Math.abs(p_40283_4_ - p_40283_1_.func_35313_b().field_35678_a) > 112 || Math.abs(p_40283_6_ - p_40283_1_.func_35313_b().field_35677_c) > 112)
        {
            ComponentNetherBridgeEnd componentnetherbridgeend = ComponentNetherBridgeEnd.func_40301_a(p_40283_2_, p_40283_3_, p_40283_4_, p_40283_5_, p_40283_6_, p_40283_7_, p_40283_8_);
            return componentnetherbridgeend;
        }
        List list = p_40283_1_.field_40294_b;
        if(p_40283_9_)
        {
            list = p_40283_1_.field_40295_c;
        }
        ComponentNetherBridgePiece componentnetherbridgepiece = func_40284_a(p_40283_1_, list, p_40283_2_, p_40283_3_, p_40283_4_, p_40283_5_, p_40283_6_, p_40283_7_, p_40283_8_ + 1);
        if(componentnetherbridgepiece != null)
        {
            p_40283_2_.add(componentnetherbridgepiece);
            p_40283_1_.field_40293_d.add(componentnetherbridgepiece);
        }
        return componentnetherbridgepiece;
    }

    protected StructureComponent func_40287_a(ComponentNetherBridgeStartPiece p_40287_1_, List p_40287_2_, Random p_40287_3_, int p_40287_4_, int p_40287_5_, boolean p_40287_6_)
    {
        switch(field_35317_h)
        {
        case 2: // '\002'
            return func_40283_a(p_40287_1_, p_40287_2_, p_40287_3_, field_35316_g.field_35678_a + p_40287_4_, field_35316_g.field_35676_b + p_40287_5_, field_35316_g.field_35677_c - 1, field_35317_h, func_35305_c(), p_40287_6_);

        case 0: // '\0'
            return func_40283_a(p_40287_1_, p_40287_2_, p_40287_3_, field_35316_g.field_35678_a + p_40287_4_, field_35316_g.field_35676_b + p_40287_5_, field_35316_g.field_35673_f + 1, field_35317_h, func_35305_c(), p_40287_6_);

        case 1: // '\001'
            return func_40283_a(p_40287_1_, p_40287_2_, p_40287_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + p_40287_5_, field_35316_g.field_35677_c + p_40287_4_, field_35317_h, func_35305_c(), p_40287_6_);

        case 3: // '\003'
            return func_40283_a(p_40287_1_, p_40287_2_, p_40287_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + p_40287_5_, field_35316_g.field_35677_c + p_40287_4_, field_35317_h, func_35305_c(), p_40287_6_);
        }
        return null;
    }

    protected StructureComponent func_40285_b(ComponentNetherBridgeStartPiece p_40285_1_, List p_40285_2_, Random p_40285_3_, int p_40285_4_, int p_40285_5_, boolean p_40285_6_)
    {
        switch(field_35317_h)
        {
        case 2: // '\002'
            return func_40283_a(p_40285_1_, p_40285_2_, p_40285_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + p_40285_4_, field_35316_g.field_35677_c + p_40285_5_, 1, func_35305_c(), p_40285_6_);

        case 0: // '\0'
            return func_40283_a(p_40285_1_, p_40285_2_, p_40285_3_, field_35316_g.field_35678_a - 1, field_35316_g.field_35676_b + p_40285_4_, field_35316_g.field_35677_c + p_40285_5_, 1, func_35305_c(), p_40285_6_);

        case 1: // '\001'
            return func_40283_a(p_40285_1_, p_40285_2_, p_40285_3_, field_35316_g.field_35678_a + p_40285_5_, field_35316_g.field_35676_b + p_40285_4_, field_35316_g.field_35677_c - 1, 2, func_35305_c(), p_40285_6_);

        case 3: // '\003'
            return func_40283_a(p_40285_1_, p_40285_2_, p_40285_3_, field_35316_g.field_35678_a + p_40285_5_, field_35316_g.field_35676_b + p_40285_4_, field_35316_g.field_35677_c - 1, 2, func_35305_c(), p_40285_6_);
        }
        return null;
    }

    protected StructureComponent func_40288_c(ComponentNetherBridgeStartPiece p_40288_1_, List p_40288_2_, Random p_40288_3_, int p_40288_4_, int p_40288_5_, boolean p_40288_6_)
    {
        switch(field_35317_h)
        {
        case 2: // '\002'
            return func_40283_a(p_40288_1_, p_40288_2_, p_40288_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + p_40288_4_, field_35316_g.field_35677_c + p_40288_5_, 3, func_35305_c(), p_40288_6_);

        case 0: // '\0'
            return func_40283_a(p_40288_1_, p_40288_2_, p_40288_3_, field_35316_g.field_35674_d + 1, field_35316_g.field_35676_b + p_40288_4_, field_35316_g.field_35677_c + p_40288_5_, 3, func_35305_c(), p_40288_6_);

        case 1: // '\001'
            return func_40283_a(p_40288_1_, p_40288_2_, p_40288_3_, field_35316_g.field_35678_a + p_40288_5_, field_35316_g.field_35676_b + p_40288_4_, field_35316_g.field_35673_f + 1, 0, func_35305_c(), p_40288_6_);

        case 3: // '\003'
            return func_40283_a(p_40288_1_, p_40288_2_, p_40288_3_, field_35316_g.field_35678_a + p_40288_5_, field_35316_g.field_35676_b + p_40288_4_, field_35316_g.field_35673_f + 1, 0, func_35305_c(), p_40288_6_);
        }
        return null;
    }

    protected static boolean func_40286_a(StructureBoundingBox p_40286_0_)
    {
        return p_40286_0_ != null && p_40286_0_.field_35676_b > 10;
    }
}
