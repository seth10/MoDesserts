// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IRecipe, InventoryCrafting, ItemStack

public class ShapelessRecipes
    implements IRecipe
{

    private final ItemStack field_21138_a;
    private final List field_21137_b;

    public ShapelessRecipes(ItemStack p_i472_1_, List p_i472_2_)
    {
        field_21138_a = p_i472_1_;
        field_21137_b = p_i472_2_;
    }

    public ItemStack func_25077_b()
    {
        return field_21138_a;
    }

    public boolean func_21134_a(InventoryCrafting p_21134_1_)
    {
        ArrayList arraylist = new ArrayList(field_21137_b);
        int i = 0;
        do
        {
            if(i >= 3)
            {
                break;
            }
            for(int j = 0; j < 3; j++)
            {
                ItemStack itemstack = p_21134_1_.func_21084_a(j, i);
                if(itemstack == null)
                {
                    continue;
                }
                boolean flag = false;
                Iterator iterator = arraylist.iterator();
                do
                {
                    if(!iterator.hasNext())
                    {
                        break;
                    }
                    ItemStack itemstack1 = (ItemStack)iterator.next();
                    if(itemstack.field_855_c != itemstack1.field_855_c || itemstack1.func_21125_h() != -1 && itemstack.func_21125_h() != itemstack1.func_21125_h())
                    {
                        continue;
                    }
                    flag = true;
                    arraylist.remove(itemstack1);
                    break;
                } while(true);
                if(!flag)
                {
                    return false;
                }
            }

            i++;
        } while(true);
        return arraylist.isEmpty();
    }

    public ItemStack func_21136_b(InventoryCrafting p_21136_1_)
    {
        return field_21138_a.func_578_d();
    }

    public int func_20165_a()
    {
        return field_21137_b.size();
    }
}
