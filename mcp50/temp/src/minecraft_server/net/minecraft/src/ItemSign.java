// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, World, Material, EntityPlayer, 
//            Block, MathHelper, ItemStack, TileEntitySign

public class ItemSign extends Item
{

    public ItemSign(int p_i505_1_)
    {
        super(p_i505_1_);
        field_233_aT = 1;
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(p_78_7_ == 0)
        {
            return false;
        }
        if(!p_78_3_.func_443_c(p_78_4_, p_78_5_, p_78_6_).func_216_a())
        {
            return false;
        }
        if(p_78_7_ == 1)
        {
            p_78_5_++;
        }
        if(p_78_7_ == 2)
        {
            p_78_6_--;
        }
        if(p_78_7_ == 3)
        {
            p_78_6_++;
        }
        if(p_78_7_ == 4)
        {
            p_78_4_--;
        }
        if(p_78_7_ == 5)
        {
            p_78_4_++;
        }
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        }
        if(!Block.field_4084_aE.func_259_a(p_78_3_, p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        }
        if(p_78_7_ == 1)
        {
            int i = MathHelper.func_584_b((double)(((p_78_2_.field_316_r + 180F) * 16F) / 360F) + 0.5D) & 0xf;
            p_78_3_.func_507_b(p_78_4_, p_78_5_, p_78_6_, Block.field_4084_aE.field_573_bc, i);
        } else
        {
            p_78_3_.func_507_b(p_78_4_, p_78_5_, p_78_6_, Block.field_4082_aJ.field_573_bc, p_78_7_);
        }
        p_78_1_.field_853_a--;
        TileEntitySign tileentitysign = (TileEntitySign)p_78_3_.func_451_k(p_78_4_, p_78_5_, p_78_6_);
        if(tileentitysign != null)
        {
            p_78_2_.func_4048_a(tileentitysign);
        }
        return true;
    }
}
