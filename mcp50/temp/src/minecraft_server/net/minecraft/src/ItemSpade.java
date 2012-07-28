// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemTool, Block, EnumToolMaterial

public class ItemSpade extends ItemTool
{

    private static Block field_4206_bb[];

    public ItemSpade(int p_i549_1_, EnumToolMaterial p_i549_2_)
    {
        super(p_i549_1_, 1, p_i549_2_, field_4206_bb);
    }

    public boolean func_80_a(Block p_80_1_)
    {
        if(p_80_1_ == Block.field_625_aT)
        {
            return true;
        }
        return p_80_1_ == Block.field_4076_aV;
    }

    static 
    {
        field_4206_bb = (new Block[] {
            Block.field_534_v, Block.field_533_w, Block.field_590_F, Block.field_4062_G, Block.field_625_aT, Block.field_4076_aV, Block.field_621_aX, Block.field_643_aB, Block.field_4048_bd, Block.field_40164_bz
        });
    }
}
