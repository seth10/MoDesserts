// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            Block, ItemStack, Item

public class FurnaceRecipes
{

    private static final FurnaceRecipes field_21164_a = new FurnaceRecipes();
    private Map field_21163_b;

    public static final FurnaceRecipes func_21162_a()
    {
        return field_21164_a;
    }

    private FurnaceRecipes()
    {
        field_21163_b = new HashMap();
        func_21160_a(Block.field_4059_I.field_573_bc, new ItemStack(Item.field_166_m));
        func_21160_a(Block.field_4061_H.field_573_bc, new ItemStack(Item.field_4147_n));
        func_21160_a(Block.field_588_ax.field_573_bc, new ItemStack(Item.field_167_l));
        func_21160_a(Block.field_590_F.field_573_bc, new ItemStack(Block.field_4056_N));
        func_21160_a(Item.field_215_ao.field_234_aS, new ItemStack(Item.field_4176_ap));
        func_21160_a(Item.field_35413_bg.field_234_aS, new ItemStack(Item.field_35414_bh));
        func_21160_a(Item.field_35415_bi.field_234_aS, new ItemStack(Item.field_35409_bj));
        func_21160_a(Item.field_4193_aS.field_234_aS, new ItemStack(Item.field_4192_aT));
        func_21160_a(Block.field_532_x.field_573_bc, new ItemStack(Block.field_535_u));
        func_21160_a(Item.field_246_aG.field_234_aS, new ItemStack(Item.field_4203_aF));
        func_21160_a(Block.field_622_aW.field_573_bc, new ItemStack(Item.field_21097_aU, 1, 2));
        func_21160_a(Block.field_582_K.field_573_bc, new ItemStack(Item.field_168_k, 1, 1));
        func_21160_a(Block.field_583_J.field_573_bc, new ItemStack(Item.field_168_k));
        func_21160_a(Block.field_630_aO.field_573_bc, new ItemStack(Item.field_252_aA));
        func_21160_a(Block.field_9042_N.field_573_bc, new ItemStack(Item.field_21097_aU, 1, 4));
    }

    public void func_21160_a(int p_21160_1_, ItemStack p_21160_2_)
    {
        field_21163_b.put(Integer.valueOf(p_21160_1_), p_21160_2_);
    }

    public ItemStack func_21161_a(int p_21161_1_)
    {
        return (ItemStack)field_21163_b.get(Integer.valueOf(p_21161_1_));
    }

    public Map func_25127_b()
    {
        return field_21163_b;
    }

}
