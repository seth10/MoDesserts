// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Item, ItemStack, CraftingManager

public class RecipesWeapons
{

    private String field_20114_a[][] = {
        {
            "X", "X", "#"
        }
    };
    private Object field_20113_b[][];

    public RecipesWeapons()
    {
        field_20113_b = (new Object[][] {
            new Object[] {
                Block.field_531_y, Block.field_532_x, Item.field_166_m, Item.field_167_l, Item.field_4147_n
            }, new Object[] {
                Item.field_4145_p, Item.field_4141_t, Item.field_4146_o, Item.field_4137_x, Item.field_4171_E
            }
        });
    }

    public void func_20112_a(CraftingManager p_20112_1_)
    {
        for(int i = 0; i < field_20113_b[0].length; i++)
        {
            Object obj = field_20113_b[0][i];
            for(int j = 0; j < field_20113_b.length - 1; j++)
            {
                Item item = (Item)field_20113_b[j + 1][i];
                p_20112_1_.func_20153_a(new ItemStack(item), new Object[] {
                    field_20114_a[j], Character.valueOf('#'), Item.field_209_B, Character.valueOf('X'), obj
                });
            }

        }

        p_20112_1_.func_20153_a(new ItemStack(Item.field_4149_i, 1), new Object[] {
            " #X", "# X", " #X", Character.valueOf('X'), Item.field_196_I, Character.valueOf('#'), Item.field_209_B
        });
        p_20112_1_.func_20153_a(new ItemStack(Item.field_4148_j, 4), new Object[] {
            "X", "#", "Y", Character.valueOf('Y'), Item.field_194_J, Character.valueOf('X'), Item.field_216_an, Character.valueOf('#'), Item.field_209_B
        });
    }
}
