// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemTool, Block, EnumToolMaterial, Material, 
//            ItemStack

public class ItemPickaxe extends ItemTool
{

    private static Block field_4209_bb[];

    protected ItemPickaxe(int p_i25_1_, EnumToolMaterial p_i25_2_)
    {
        super(p_i25_1_, 2, p_i25_2_, field_4209_bb);
    }

    public boolean func_80_a(Block p_80_1_)
    {
        if(p_80_1_ == Block.field_602_aq)
        {
            return field_20913_a.func_21181_d() == 3;
        }
        if(p_80_1_ == Block.field_4060_ay || p_80_1_ == Block.field_588_ax)
        {
            return field_20913_a.func_21181_d() >= 2;
        }
        if(p_80_1_ == Block.field_4068_ai || p_80_1_ == Block.field_4061_H)
        {
            return field_20913_a.func_21181_d() >= 2;
        }
        if(p_80_1_ == Block.field_4067_aj || p_80_1_ == Block.field_4059_I)
        {
            return field_20913_a.func_21181_d() >= 1;
        }
        if(p_80_1_ == Block.field_9041_O || p_80_1_ == Block.field_9042_N)
        {
            return field_20913_a.func_21181_d() >= 1;
        }
        if(p_80_1_ == Block.field_630_aO || p_80_1_ == Block.field_629_aP)
        {
            return field_20913_a.func_21181_d() >= 2;
        }
        if(p_80_1_.field_553_bn == Material.field_523_d)
        {
            return true;
        }
        return p_80_1_.field_553_bn == Material.field_522_e;
    }

    public float func_79_a(ItemStack p_79_1_, Block p_79_2_)
    {
        if(p_79_2_ != null && (p_79_2_.field_553_bn == Material.field_522_e || p_79_2_.field_553_bn == Material.field_523_d))
        {
            return field_264_aY;
        } else
        {
            return super.func_79_a(p_79_1_, p_79_2_);
        }
    }

    static 
    {
        field_4209_bb = (new Block[] {
            Block.field_532_x, Block.field_608_ak, Block.field_607_al, Block.field_535_u, Block.field_9039_Q, Block.field_603_ap, Block.field_4059_I, Block.field_4067_aj, Block.field_583_J, Block.field_4068_ai, 
            Block.field_4061_H, Block.field_588_ax, Block.field_4060_ay, Block.field_4077_aU, Block.field_4050_bc, Block.field_9042_N, Block.field_9041_O, Block.field_630_aO, Block.field_629_aP, Block.field_637_aH, 
            Block.field_9034_U, Block.field_9036_T
        });
    }
}
