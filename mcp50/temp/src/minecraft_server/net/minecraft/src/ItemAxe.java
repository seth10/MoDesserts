// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemTool, Block, Material, EnumToolMaterial, 
//            ItemStack

public class ItemAxe extends ItemTool
{

    private static Block field_4207_bb[];

    protected ItemAxe(int p_i452_1_, EnumToolMaterial p_i452_2_)
    {
        super(p_i452_1_, 3, p_i452_2_, field_4207_bb);
    }

    public float func_79_a(ItemStack p_79_1_, Block p_79_2_)
    {
        if(p_79_2_ != null && p_79_2_.field_553_bn == Material.field_524_c)
        {
            return field_264_aY;
        } else
        {
            return super.func_79_a(p_79_1_, p_79_2_);
        }
    }

    static 
    {
        field_4207_bb = (new Block[] {
            Block.field_531_y, Block.field_604_ao, Block.field_582_K, Block.field_593_av, Block.field_608_ak, Block.field_607_al, Block.field_4052_bb, Block.field_9035_bf
        });
    }
}
