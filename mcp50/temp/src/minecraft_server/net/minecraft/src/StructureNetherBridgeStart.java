// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureStart, ComponentNetherBridgeStartPiece, StructureComponent, World

class StructureNetherBridgeStart extends StructureStart
{

    public StructureNetherBridgeStart(World p_i30_1_, Random p_i30_2_, int p_i30_3_, int p_i30_4_)
    {
        ComponentNetherBridgeStartPiece componentnetherbridgestartpiece = new ComponentNetherBridgeStartPiece(p_i30_2_, (p_i30_3_ << 4) + 2, (p_i30_4_ << 4) + 2);
        field_35547_a.add(componentnetherbridgestartpiece);
        componentnetherbridgestartpiece.func_35308_a(componentnetherbridgestartpiece, field_35547_a, p_i30_2_);
        StructureComponent structurecomponent;
        for(ArrayList arraylist = componentnetherbridgestartpiece.field_40293_d; !arraylist.isEmpty(); structurecomponent.func_35308_a(componentnetherbridgestartpiece, field_35547_a, p_i30_2_))
        {
            int i = p_i30_2_.nextInt(arraylist.size());
            structurecomponent = (StructureComponent)arraylist.remove(i);
        }

        func_35544_c();
        func_40209_a(p_i30_1_, p_i30_2_, 48, 70);
    }
}
