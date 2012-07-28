// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            RecipesTools, RecipesWeapons, RecipesIngots, RecipesFood, 
//            RecipesCrafting, RecipesArmor, RecipesDyes, ItemStack, 
//            Item, Block, RecipeSorter, ShapedRecipes, 
//            ShapelessRecipes, InventoryCrafting, IRecipe

public class CraftingManager
{

    private static final CraftingManager field_20155_a = new CraftingManager();
    private List field_20154_b;

    public static final CraftingManager func_20151_a()
    {
        return field_20155_a;
    }

    private CraftingManager()
    {
        field_20154_b = new ArrayList();
        (new RecipesTools()).func_20156_a(this);
        (new RecipesWeapons()).func_20112_a(this);
        (new RecipesIngots()).func_20159_a(this);
        (new RecipesFood()).func_20177_a(this);
        (new RecipesCrafting()).func_20115_a(this);
        (new RecipesArmor()).func_20172_a(this);
        (new RecipesDyes()).func_21165_a(this);
        func_20153_a(new ItemStack(Item.field_4201_aI, 3), new Object[] {
            "###", Character.valueOf('#'), Item.field_4202_aH
        });
        func_20153_a(new ItemStack(Item.field_4200_aJ, 1), new Object[] {
            "#", "#", "#", Character.valueOf('#'), Item.field_4201_aI
        });
        func_20153_a(new ItemStack(Block.field_9050_aZ, 2), new Object[] {
            "###", "###", Character.valueOf('#'), Item.field_209_B
        });
        func_20153_a(new ItemStack(Block.field_40172_bC, 6), new Object[] {
            "###", "###", Character.valueOf('#'), Block.field_40171_bB
        });
        func_20153_a(new ItemStack(Block.field_35044_bw, 1), new Object[] {
            "#W#", "#W#", Character.valueOf('#'), Item.field_209_B, Character.valueOf('W'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Block.field_619_aZ, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Block.field_531_y, Character.valueOf('X'), Item.field_167_l
        });
        func_20153_a(new ItemStack(Block.field_9038_R, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Block.field_531_y, Character.valueOf('X'), Item.field_252_aA
        });
        func_20153_a(new ItemStack(Block.field_604_ao, 1), new Object[] {
            "###", "XXX", "###", Character.valueOf('#'), Block.field_531_y, Character.valueOf('X'), Item.field_4200_aJ
        });
        func_20153_a(new ItemStack(Block.field_4076_aV, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_251_aB
        });
        func_20153_a(new ItemStack(Block.field_621_aX, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_246_aG
        });
        func_20153_a(new ItemStack(Block.field_9047_al, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_4203_aF
        });
        func_20153_a(new ItemStack(Block.field_6065_bd, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_4194_aR
        });
        func_20153_a(new ItemStack(Block.field_616_ac, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_196_I
        });
        func_20153_a(new ItemStack(Block.field_605_an, 1), new Object[] {
            "X#X", "#X#", "X#X", Character.valueOf('X'), Item.field_193_K, Character.valueOf('#'), Block.field_590_F
        });
        func_20153_a(new ItemStack(Block.field_607_al, 6, 3), new Object[] {
            "###", Character.valueOf('#'), Block.field_532_x
        });
        func_20153_a(new ItemStack(Block.field_607_al, 6, 0), new Object[] {
            "###", Character.valueOf('#'), Block.field_535_u
        });
        func_20153_a(new ItemStack(Block.field_607_al, 6, 1), new Object[] {
            "###", Character.valueOf('#'), Block.field_9039_Q
        });
        func_20153_a(new ItemStack(Block.field_607_al, 6, 2), new Object[] {
            "###", Character.valueOf('#'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Block.field_607_al, 6, 4), new Object[] {
            "###", Character.valueOf('#'), Block.field_9047_al
        });
        func_20153_a(new ItemStack(Block.field_607_al, 6, 5), new Object[] {
            "###", Character.valueOf('#'), Block.field_35052_bn
        });
        func_20153_a(new ItemStack(Block.field_638_aG, 3), new Object[] {
            "# #", "###", "# #", Character.valueOf('#'), Item.field_209_B
        });
        func_20153_a(new ItemStack(Item.field_208_at, 1), new Object[] {
            "##", "##", "##", Character.valueOf('#'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Block.field_28030_bl, 2), new Object[] {
            "###", "###", Character.valueOf('#'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Item.field_195_az, 1), new Object[] {
            "##", "##", "##", Character.valueOf('#'), Item.field_166_m
        });
        func_20153_a(new ItemStack(Item.field_4174_as, 1), new Object[] {
            "###", "###", " X ", Character.valueOf('#'), Block.field_531_y, Character.valueOf('X'), Item.field_209_B
        });
        func_20153_a(new ItemStack(Item.field_21098_aX, 1), new Object[] {
            "AAA", "BEB", "CCC", Character.valueOf('A'), Item.field_4204_aE, Character.valueOf('B'), Item.field_21095_aW, Character.valueOf('C'), Item.field_186_R, Character.valueOf('E'), 
            Item.field_239_aN
        });
        func_20153_a(new ItemStack(Item.field_21095_aW, 1), new Object[] {
            "#", Character.valueOf('#'), Item.field_4202_aH
        });
        func_20153_a(new ItemStack(Block.field_531_y, 4, 0), new Object[] {
            "#", Character.valueOf('#'), new ItemStack(Block.field_582_K, 1, 0)
        });
        func_20153_a(new ItemStack(Block.field_531_y, 4, 1), new Object[] {
            "#", Character.valueOf('#'), new ItemStack(Block.field_582_K, 1, 1)
        });
        func_20153_a(new ItemStack(Block.field_531_y, 4, 2), new Object[] {
            "#", Character.valueOf('#'), new ItemStack(Block.field_582_K, 1, 2)
        });
        func_20153_a(new ItemStack(Block.field_531_y, 4, 3), new Object[] {
            "#", Character.valueOf('#'), new ItemStack(Block.field_582_K, 1, 3)
        });
        func_20153_a(new ItemStack(Item.field_209_B, 4), new Object[] {
            "#", "#", Character.valueOf('#'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Block.field_9046_aq, 4), new Object[] {
            "X", "#", Character.valueOf('X'), Item.field_168_k, Character.valueOf('#'), Item.field_209_B
        });
        func_20153_a(new ItemStack(Block.field_9046_aq, 4), new Object[] {
            "X", "#", Character.valueOf('X'), new ItemStack(Item.field_168_k, 1, 1), Character.valueOf('#'), Item.field_209_B
        });
        func_20153_a(new ItemStack(Item.field_4173_C, 4), new Object[] {
            "# #", " # ", Character.valueOf('#'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Item.field_40232_br, 3), new Object[] {
            "# #", " # ", Character.valueOf('#'), Block.field_4056_N
        });
        func_20153_a(new ItemStack(Block.field_637_aH, 16), new Object[] {
            "X X", "X#X", "X X", Character.valueOf('X'), Item.field_166_m, Character.valueOf('#'), Item.field_209_B
        });
        func_20153_a(new ItemStack(Block.field_9036_T, 6), new Object[] {
            "X X", "X#X", "XRX", Character.valueOf('X'), Item.field_4147_n, Character.valueOf('R'), Item.field_252_aA, Character.valueOf('#'), Item.field_209_B
        });
        func_20153_a(new ItemStack(Block.field_9034_U, 6), new Object[] {
            "X X", "X#X", "XRX", Character.valueOf('X'), Item.field_166_m, Character.valueOf('R'), Item.field_252_aA, Character.valueOf('#'), Block.field_9053_aK
        });
        func_20153_a(new ItemStack(Item.field_199_ax, 1), new Object[] {
            "# #", "###", Character.valueOf('#'), Item.field_166_m
        });
        func_20153_a(new ItemStack(Item.field_40230_bx, 1), new Object[] {
            "# #", "# #", "###", Character.valueOf('#'), Item.field_166_m
        });
        func_20153_a(new ItemStack(Item.field_40227_bw, 1), new Object[] {
            " B ", "###", Character.valueOf('#'), Block.field_532_x, Character.valueOf('B'), Item.field_40239_bm
        });
        func_20153_a(new ItemStack(Block.field_9035_bf, 1), new Object[] {
            "A", "B", Character.valueOf('A'), Block.field_4052_bb, Character.valueOf('B'), Block.field_9046_aq
        });
        func_20153_a(new ItemStack(Item.field_4199_aL, 1), new Object[] {
            "A", "B", Character.valueOf('A'), Block.field_593_av, Character.valueOf('B'), Item.field_199_ax
        });
        func_20153_a(new ItemStack(Item.field_4198_aM, 1), new Object[] {
            "A", "B", Character.valueOf('A'), Block.field_642_aC, Character.valueOf('B'), Item.field_199_ax
        });
        func_20153_a(new ItemStack(Item.field_4205_aC, 1), new Object[] {
            "# #", "###", Character.valueOf('#'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Item.field_205_au, 1), new Object[] {
            "# #", " # ", Character.valueOf('#'), Item.field_166_m
        });
        func_20153_a(new ItemStack(Item.field_4150_g, 1), new Object[] {
            "A ", " B", Character.valueOf('A'), Item.field_166_m, Character.valueOf('B'), Item.field_216_an
        });
        func_20153_a(new ItemStack(Item.field_185_S, 1), new Object[] {
            "###", Character.valueOf('#'), Item.field_186_R
        });
        func_20153_a(new ItemStack(Block.field_9045_at, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Item.field_4196_aP, 1), new Object[] {
            "  #", " #X", "# X", Character.valueOf('#'), Item.field_209_B, Character.valueOf('X'), Item.field_196_I
        });
        func_20153_a(new ItemStack(Block.field_9055_aH, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_532_x
        });
        func_20153_a(new ItemStack(Block.field_35047_bx, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_9047_al
        });
        func_20153_a(new ItemStack(Block.field_35046_by, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_35052_bn
        });
        func_20153_a(new ItemStack(Block.field_40169_bD, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_40171_bB
        });
        func_20153_a(new ItemStack(Item.field_213_aq, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Item.field_209_B, Character.valueOf('X'), Block.field_616_ac
        });
        func_20153_a(new ItemStack(Item.field_212_ar, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Item.field_40236_bo, Character.valueOf('X'), Item.field_171_h
        });
        func_20153_a(new ItemStack(Block.field_9054_aJ, 1), new Object[] {
            "X", "#", Character.valueOf('#'), Block.field_532_x, Character.valueOf('X'), Item.field_209_B
        });
        func_20153_a(new ItemStack(Block.field_627_aR, 1), new Object[] {
            "X", "#", Character.valueOf('#'), Item.field_209_B, Character.valueOf('X'), Item.field_252_aA
        });
        func_20153_a(new ItemStack(Item.field_22007_aZ, 1), new Object[] {
            "#X#", "III", Character.valueOf('#'), Block.field_627_aR, Character.valueOf('X'), Item.field_252_aA, Character.valueOf('I'), Block.field_535_u
        });
        func_20153_a(new ItemStack(Item.field_4195_aQ, 1), new Object[] {
            " # ", "#X#", " # ", Character.valueOf('#'), Item.field_4147_n, Character.valueOf('X'), Item.field_252_aA
        });
        func_20153_a(new ItemStack(Item.field_4197_aO, 1), new Object[] {
            " # ", "#X#", " # ", Character.valueOf('#'), Item.field_166_m, Character.valueOf('X'), Item.field_252_aA
        });
        func_20153_a(new ItemStack(Item.field_28021_bb, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Item.field_4201_aI, Character.valueOf('X'), Item.field_4197_aO
        });
        func_20153_a(new ItemStack(Block.field_9051_aR, 1), new Object[] {
            "#", "#", Character.valueOf('#'), Block.field_535_u
        });
        func_20153_a(new ItemStack(Block.field_9053_aK, 1), new Object[] {
            "##", Character.valueOf('#'), Block.field_535_u
        });
        func_20153_a(new ItemStack(Block.field_9052_aM, 1), new Object[] {
            "##", Character.valueOf('#'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Block.field_9040_P, 1), new Object[] {
            "###", "#X#", "#R#", Character.valueOf('#'), Block.field_532_x, Character.valueOf('X'), Item.field_4149_i, Character.valueOf('R'), Item.field_252_aA
        });
        func_20153_a(new ItemStack(Block.field_9029_Z, 1), new Object[] {
            "TTT", "#X#", "#R#", Character.valueOf('#'), Block.field_532_x, Character.valueOf('X'), Item.field_166_m, Character.valueOf('R'), Item.field_252_aA, Character.valueOf('T'), 
            Block.field_531_y
        });
        func_20153_a(new ItemStack(Block.field_9033_V, 1), new Object[] {
            "S", "P", Character.valueOf('S'), Item.field_242_aK, Character.valueOf('P'), Block.field_9029_Z
        });
        func_20153_a(new ItemStack(Item.field_22008_aY, 1), new Object[] {
            "###", "XXX", Character.valueOf('#'), Block.field_616_ac, Character.valueOf('X'), Block.field_531_y
        });
        func_20153_a(new ItemStack(Block.field_40175_bF, 1), new Object[] {
            " B ", "D#D", "###", Character.valueOf('#'), Block.field_602_aq, Character.valueOf('B'), Item.field_4200_aJ, Character.valueOf('D'), Item.field_167_l
        });
        func_21146_b(new ItemStack(Item.field_40229_by, 1), new Object[] {
            Item.field_35411_bl, Item.field_40233_bu
        });
        func_21146_b(new ItemStack(Item.field_48388_bD, 3), new Object[] {
            Item.field_193_K, Item.field_40233_bu, Item.field_168_k
        });
        func_21146_b(new ItemStack(Item.field_48388_bD, 3), new Object[] {
            Item.field_193_K, Item.field_40233_bu, new ItemStack(Item.field_168_k, 1, 1)
        });
        Collections.sort(field_20154_b, new RecipeSorter(this));
        System.out.println((new StringBuilder()).append(field_20154_b.size()).append(" recipes").toString());
    }

    void func_20153_a(ItemStack p_20153_1_, Object p_20153_2_[])
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;
        if(p_20153_2_[i] instanceof String[])
        {
            String as[] = (String[])p_20153_2_[i++];
            for(int l = 0; l < as.length; l++)
            {
                String s2 = as[l];
                k++;
                j = s2.length();
                s = (new StringBuilder()).append(s).append(s2).toString();
            }

        } else
        {
            while(p_20153_2_[i] instanceof String) 
            {
                String s1 = (String)p_20153_2_[i++];
                k++;
                j = s1.length();
                s = (new StringBuilder()).append(s).append(s1).toString();
            }
        }
        HashMap hashmap = new HashMap();
        for(; i < p_20153_2_.length; i += 2)
        {
            Character character = (Character)p_20153_2_[i];
            ItemStack itemstack = null;
            if(p_20153_2_[i + 1] instanceof Item)
            {
                itemstack = new ItemStack((Item)p_20153_2_[i + 1]);
            } else
            if(p_20153_2_[i + 1] instanceof Block)
            {
                itemstack = new ItemStack((Block)p_20153_2_[i + 1], 1, -1);
            } else
            if(p_20153_2_[i + 1] instanceof ItemStack)
            {
                itemstack = (ItemStack)p_20153_2_[i + 1];
            }
            hashmap.put(character, itemstack);
        }

        ItemStack aitemstack[] = new ItemStack[j * k];
        for(int i1 = 0; i1 < j * k; i1++)
        {
            char c = s.charAt(i1);
            if(hashmap.containsKey(Character.valueOf(c)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c))).func_578_d();
            } else
            {
                aitemstack[i1] = null;
            }
        }

        field_20154_b.add(new ShapedRecipes(j, k, aitemstack, p_20153_1_));
    }

    void func_21146_b(ItemStack p_21146_1_, Object p_21146_2_[])
    {
        ArrayList arraylist = new ArrayList();
        Object aobj[] = p_21146_2_;
        int i = aobj.length;
        for(int j = 0; j < i; j++)
        {
            Object obj = aobj[j];
            if(obj instanceof ItemStack)
            {
                arraylist.add(((ItemStack)obj).func_578_d());
                continue;
            }
            if(obj instanceof Item)
            {
                arraylist.add(new ItemStack((Item)obj));
                continue;
            }
            if(obj instanceof Block)
            {
                arraylist.add(new ItemStack((Block)obj));
            } else
            {
                throw new RuntimeException("Invalid shapeless recipy!");
            }
        }

        field_20154_b.add(new ShapelessRecipes(p_21146_1_, arraylist));
    }

    public ItemStack func_21147_a(InventoryCrafting p_21147_1_)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        for(int j = 0; j < p_21147_1_.func_83_a(); j++)
        {
            ItemStack itemstack2 = p_21147_1_.func_82_a(j);
            if(itemstack2 == null)
            {
                continue;
            }
            if(i == 0)
            {
                itemstack = itemstack2;
            }
            if(i == 1)
            {
                itemstack1 = itemstack2;
            }
            i++;
        }

        if(i == 2 && itemstack.field_855_c == itemstack1.field_855_c && itemstack.field_853_a == 1 && itemstack1.field_853_a == 1 && Item.field_176_c[itemstack.field_855_c].func_25005_e())
        {
            Item item = Item.field_176_c[itemstack.field_855_c];
            int l = item.func_77_b() - itemstack.func_21131_g();
            int i1 = item.func_77_b() - itemstack1.func_21131_g();
            int j1 = l + i1 + (item.func_77_b() * 10) / 100;
            int k1 = item.func_77_b() - j1;
            if(k1 < 0)
            {
                k1 = 0;
            }
            return new ItemStack(itemstack.field_855_c, 1, k1);
        }
        for(int k = 0; k < field_20154_b.size(); k++)
        {
            IRecipe irecipe = (IRecipe)field_20154_b.get(k);
            if(irecipe.func_21134_a(p_21147_1_))
            {
                return irecipe.func_21136_b(p_21147_1_);
            }
        }

        return null;
    }

    public List func_25126_b()
    {
        return field_20154_b;
    }

}
