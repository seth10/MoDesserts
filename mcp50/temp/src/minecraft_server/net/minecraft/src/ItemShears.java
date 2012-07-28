// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, Block, BlockLeaves, BlockTallGrass, 
//            ItemStack, EntityLiving

public class ItemShears extends Item
{

    public ItemShears(int p_i40_1_)
    {
        super(p_i40_1_);
        func_21086_c(1);
        func_21090_d(238);
    }

    public boolean func_25007_a(ItemStack p_25007_1_, int p_25007_2_, int p_25007_3_, int p_25007_4_, int p_25007_5_, EntityLiving p_25007_6_)
    {
        if(p_25007_2_ == Block.field_581_L.field_573_bc || p_25007_2_ == Block.field_9032_W.field_573_bc || p_25007_2_ == Block.field_9031_X.field_573_bc || p_25007_2_ == Block.field_35045_bv.field_573_bc)
        {
            p_25007_1_.func_25125_a(1, p_25007_6_);
            return true;
        } else
        {
            return super.func_25007_a(p_25007_1_, p_25007_2_, p_25007_3_, p_25007_4_, p_25007_5_, p_25007_6_);
        }
    }

    public boolean func_80_a(Block p_80_1_)
    {
        return p_80_1_.field_573_bc == Block.field_9032_W.field_573_bc;
    }

    public float func_79_a(ItemStack p_79_1_, Block p_79_2_)
    {
        if(p_79_2_.field_573_bc == Block.field_9032_W.field_573_bc || p_79_2_.field_573_bc == Block.field_581_L.field_573_bc)
        {
            return 15F;
        }
        if(p_79_2_.field_573_bc == Block.field_616_ac.field_573_bc)
        {
            return 5F;
        } else
        {
            return super.func_79_a(p_79_1_, p_79_2_);
        }
    }
}
