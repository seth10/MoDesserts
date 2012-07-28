// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureStart, StructureVillagePieces, ComponentVillageStartPiece, World, 
//            StructureComponent, ComponentVillageRoadPiece

class StructureVillageStart extends StructureStart
{

    private boolean field_35548_c;

    public StructureVillageStart(World p_i151_1_, Random p_i151_2_, int p_i151_3_, int p_i151_4_, int p_i151_5_)
    {
        field_35548_c = false;
        int i = p_i151_5_;
        ArrayList arraylist = StructureVillagePieces.func_35646_a(p_i151_2_, i);
        ComponentVillageStartPiece componentvillagestartpiece = new ComponentVillageStartPiece(p_i151_1_.func_4077_a(), 0, p_i151_2_, (p_i151_3_ << 4) + 2, (p_i151_4_ << 4) + 2, arraylist, i);
        field_35547_a.add(componentvillagestartpiece);
        componentvillagestartpiece.func_35308_a(componentvillagestartpiece, field_35547_a, p_i151_2_);
        ArrayList arraylist1 = componentvillagestartpiece.field_35387_f;
        for(ArrayList arraylist2 = componentvillagestartpiece.field_35389_e; !arraylist1.isEmpty() || !arraylist2.isEmpty();)
        {
            if(!arraylist1.isEmpty())
            {
                int j = p_i151_2_.nextInt(arraylist1.size());
                StructureComponent structurecomponent = (StructureComponent)arraylist1.remove(j);
                structurecomponent.func_35308_a(componentvillagestartpiece, field_35547_a, p_i151_2_);
            } else
            {
                int k = p_i151_2_.nextInt(arraylist2.size());
                StructureComponent structurecomponent1 = (StructureComponent)arraylist2.remove(k);
                structurecomponent1.func_35308_a(componentvillagestartpiece, field_35547_a, p_i151_2_);
            }
        }

        func_35544_c();
        int l = 0;
        Iterator iterator = field_35547_a.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            StructureComponent structurecomponent2 = (StructureComponent)iterator.next();
            if(!(structurecomponent2 instanceof ComponentVillageRoadPiece))
            {
                l++;
            }
        } while(true);
        field_35548_c = l > 2;
    }

    public boolean func_35542_a()
    {
        return field_35548_c;
    }
}
