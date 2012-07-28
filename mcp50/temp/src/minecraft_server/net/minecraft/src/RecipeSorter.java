// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Comparator;

// Referenced classes of package net.minecraft.src:
//            ShapelessRecipes, ShapedRecipes, IRecipe, CraftingManager

class RecipeSorter
    implements Comparator
{

    final CraftingManager field_20108_a; /* synthetic field */

    RecipeSorter(CraftingManager p_i256_1_)
    {
        field_20108_a = p_i256_1_;
        super();
    }

    public int func_20107_a(IRecipe p_20107_1_, IRecipe p_20107_2_)
    {
        if((p_20107_1_ instanceof ShapelessRecipes) && (p_20107_2_ instanceof ShapedRecipes))
        {
            return 1;
        }
        if((p_20107_2_ instanceof ShapelessRecipes) && (p_20107_1_ instanceof ShapedRecipes))
        {
            return -1;
        }
        if(p_20107_2_.func_20165_a() < p_20107_1_.func_20165_a())
        {
            return -1;
        }
        return p_20107_2_.func_20165_a() <= p_20107_1_.func_20165_a() ? 0 : 1;
    }

    public int compare(Object p_compare_1_, Object p_compare_2_)
    {
        return func_20107_a((IRecipe)p_compare_1_, (IRecipe)p_compare_2_);
    }
}
