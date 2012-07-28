// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IRecipe, ItemStack, InventoryCrafting

public class ShapedRecipes
    implements IRecipe
{

    private int field_21140_b;
    private int field_21144_c;
    private ItemStack field_21143_d[];
    private ItemStack field_21142_e;
    public final int field_21141_a;

    public ShapedRecipes(int p_i215_1_, int p_i215_2_, ItemStack p_i215_3_[], ItemStack p_i215_4_)
    {
        field_21141_a = p_i215_4_.field_855_c;
        field_21140_b = p_i215_1_;
        field_21144_c = p_i215_2_;
        field_21143_d = p_i215_3_;
        field_21142_e = p_i215_4_;
    }

    public ItemStack func_25077_b()
    {
        return field_21142_e;
    }

    public boolean func_21134_a(InventoryCrafting p_21134_1_)
    {
        for(int i = 0; i <= 3 - field_21140_b; i++)
        {
            for(int j = 0; j <= 3 - field_21144_c; j++)
            {
                if(func_21139_a(p_21134_1_, i, j, true))
                {
                    return true;
                }
                if(func_21139_a(p_21134_1_, i, j, false))
                {
                    return true;
                }
            }

        }

        return false;
    }

    private boolean func_21139_a(InventoryCrafting p_21139_1_, int p_21139_2_, int p_21139_3_, boolean p_21139_4_)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int k = i - p_21139_2_;
                int l = j - p_21139_3_;
                ItemStack itemstack = null;
                if(k >= 0 && l >= 0 && k < field_21140_b && l < field_21144_c)
                {
                    if(p_21139_4_)
                    {
                        itemstack = field_21143_d[(field_21140_b - k - 1) + l * field_21140_b];
                    } else
                    {
                        itemstack = field_21143_d[k + l * field_21140_b];
                    }
                }
                ItemStack itemstack1 = p_21139_1_.func_21084_a(i, j);
                if(itemstack1 == null && itemstack == null)
                {
                    continue;
                }
                if(itemstack1 == null && itemstack != null || itemstack1 != null && itemstack == null)
                {
                    return false;
                }
                if(itemstack.field_855_c != itemstack1.field_855_c)
                {
                    return false;
                }
                if(itemstack.func_21125_h() != -1 && itemstack.func_21125_h() != itemstack1.func_21125_h())
                {
                    return false;
                }
            }

        }

        return true;
    }

    public ItemStack func_21136_b(InventoryCrafting p_21136_1_)
    {
        return new ItemStack(field_21142_e.field_855_c, field_21142_e.field_853_a, field_21142_e.func_21125_h());
    }

    public int func_20165_a()
    {
        return field_21140_b * field_21144_c;
    }
}
