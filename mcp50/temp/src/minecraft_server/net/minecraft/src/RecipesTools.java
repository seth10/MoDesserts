// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Item, ItemStack, CraftingManager

public class RecipesTools
{

    private String field_20158_a[][] = {
        {
            "XXX", " # ", " # "
        }, {
            "X", "#", "#"
        }, {
            "XX", "X#", " #"
        }, {
            "XX", " #", " #"
        }
    };
    private Object field_20157_b[][];

    public RecipesTools()
    {
        field_20157_b = (new Object[][] {
            new Object[] {
                Block.field_531_y, Block.field_532_x, Item.field_166_m, Item.field_167_l, Item.field_4147_n
            }, new Object[] {
                Item.field_4143_r, Item.field_4139_v, Item.field_4152_e, Item.field_4135_z, Item.field_4168_G
            }, new Object[] {
                Item.field_4144_q, Item.field_4140_u, Item.field_4153_d, Item.field_4136_y, Item.field_4169_F
            }, new Object[] {
                Item.field_4142_s, Item.field_4138_w, Item.field_4151_f, Item.field_4175_A, Item.field_4167_H
            }, new Object[] {
                Item.field_4166_L, Item.field_4165_M, Item.field_4164_N, Item.field_4163_O, Item.field_4162_P
            }
        });
    }

    public void func_20156_a(CraftingManager p_20156_1_)
    {
        for(int i = 0; i < field_20157_b[0].length; i++)
        {
            Object obj = field_20157_b[0][i];
            for(int j = 0; j < field_20157_b.length - 1; j++)
            {
                Item item = (Item)field_20157_b[j + 1][i];
                p_20156_1_.func_20153_a(new ItemStack(item), new Object[] {
                    field_20158_a[j], Character.valueOf('#'), Item.field_209_B, Character.valueOf('X'), obj
                });
            }

        }

        p_20156_1_.func_20153_a(new ItemStack(Item.field_31022_bc), new Object[] {
            " #", "# ", Character.valueOf('#'), Item.field_166_m
        });
    }
}
