// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, Block, BlockBed, EntityPlayer, 
//            MathHelper, World, ItemStack

public class ItemBed extends Item
{

    public ItemBed(int p_i276_1_)
    {
        super(p_i276_1_);
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(p_78_7_ != 1)
        {
            return false;
        }
        p_78_5_++;
        BlockBed blockbed = (BlockBed)Block.field_9037_S;
        int i = MathHelper.func_584_b((double)((p_78_2_.field_316_r * 4F) / 360F) + 0.5D) & 3;
        byte byte0 = 0;
        byte byte1 = 0;
        if(i == 0)
        {
            byte1 = 1;
        }
        if(i == 1)
        {
            byte0 = -1;
        }
        if(i == 2)
        {
            byte1 = -1;
        }
        if(i == 3)
        {
            byte0 = 1;
        }
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_) || !p_78_2_.func_35200_c(p_78_4_ + byte0, p_78_5_, p_78_6_ + byte1))
        {
            return false;
        }
        if(p_78_3_.func_20111_e(p_78_4_, p_78_5_, p_78_6_) && p_78_3_.func_20111_e(p_78_4_ + byte0, p_78_5_, p_78_6_ + byte1) && p_78_3_.func_445_d(p_78_4_, p_78_5_ - 1, p_78_6_) && p_78_3_.func_445_d(p_78_4_ + byte0, p_78_5_ - 1, p_78_6_ + byte1))
        {
            p_78_3_.func_507_b(p_78_4_, p_78_5_, p_78_6_, blockbed.field_573_bc, i);
            if(p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_) == blockbed.field_573_bc)
            {
                p_78_3_.func_507_b(p_78_4_ + byte0, p_78_5_, p_78_6_ + byte1, blockbed.field_573_bc, i + 8);
            }
            p_78_1_.field_853_a--;
            return true;
        } else
        {
            return false;
        }
    }
}
