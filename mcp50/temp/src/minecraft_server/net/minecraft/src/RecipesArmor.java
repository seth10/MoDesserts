// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, Block, ItemStack, CraftingManager

public class RecipesArmor
{

    private String field_20174_a[][] = {
        {
            "XXX", "X X"
        }, {
            "X X", "XXX", "XXX"
        }, {
            "XXX", "X X", "X X"
        }, {
            "X X", "X X"
        }
    };
    private Object field_20173_b[][];

    public RecipesArmor()
    {
        field_20173_b = (new Object[][] {
            new Object[] {
                Item.field_249_aD, Block.field_599_as, Item.field_166_m, Item.field_167_l, Item.field_4147_n
            }, new Object[] {
                Item.field_4161_T, Item.field_4157_X, Item.field_4188_ab, Item.field_4184_af, Item.field_4180_aj
            }, new Object[] {
                Item.field_4160_U, Item.field_4156_Y, Item.field_4187_ac, Item.field_4183_ag, Item.field_4179_ak
            }, new Object[] {
                Item.field_4159_V, Item.field_4155_Z, Item.field_4186_ad, Item.field_4182_ah, Item.field_4178_al
            }, new Object[] {
                Item.field_4158_W, Item.field_4189_aa, Item.field_4185_ae, Item.field_4181_ai, Item.field_4177_am
            }
        });
    }

    public void func_20172_a(CraftingManager p_20172_1_)
    {
        for(int i = 0; i < field_20173_b[0].length; i++)
        {
            Object obj = field_20173_b[0][i];
            for(int j = 0; j < field_20173_b.length - 1; j++)
            {
                Item item = (Item)field_20173_b[j + 1][i];
                p_20172_1_.func_20153_a(new ItemStack(item), new Object[] {
                    field_20174_a[j], Character.valueOf('X'), obj
                });
            }

        }

    }
}
