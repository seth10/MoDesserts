// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, ItemStack, Item, CraftingManager

public class RecipesIngots
{

    private Object field_20160_a[][];

    public RecipesIngots()
    {
        field_20160_a = (new Object[][] {
            new Object[] {
                Block.field_4068_ai, new ItemStack(Item.field_4147_n, 9)
            }, new Object[] {
                Block.field_4067_aj, new ItemStack(Item.field_166_m, 9)
            }, new Object[] {
                Block.field_4060_ay, new ItemStack(Item.field_167_l, 9)
            }, new Object[] {
                Block.field_9041_O, new ItemStack(Item.field_21097_aU, 9, 4)
            }
        });
    }

    public void func_20159_a(CraftingManager p_20159_1_)
    {
        for(int i = 0; i < field_20160_a.length; i++)
        {
            Block block = (Block)field_20160_a[i][0];
            ItemStack itemstack = (ItemStack)field_20160_a[i][1];
            p_20159_1_.func_20153_a(new ItemStack(block), new Object[] {
                "###", "###", "###", Character.valueOf('#'), itemstack
            });
            p_20159_1_.func_20153_a(itemstack, new Object[] {
                "#", Character.valueOf('#'), block
            });
        }

        p_20159_1_.func_20153_a(new ItemStack(Item.field_4147_n), new Object[] {
            "###", "###", "###", Character.valueOf('#'), Item.field_40236_bo
        });
        p_20159_1_.func_20153_a(new ItemStack(Item.field_40236_bo, 9), new Object[] {
            "#", Character.valueOf('#'), Item.field_4147_n
        });
    }
}
