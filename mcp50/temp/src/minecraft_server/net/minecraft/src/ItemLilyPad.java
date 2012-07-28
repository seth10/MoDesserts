// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemColored, MovingObjectPosition, EnumMovingObjectType, World, 
//            EntityPlayer, Material, Block, PlayerCapabilities, 
//            ItemStack

public class ItemLilyPad extends ItemColored
{

    public ItemLilyPad(int p_i415_1_)
    {
        super(p_i415_1_, false);
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        MovingObjectPosition movingobjectposition = func_40225_a(p_6152_2_, p_6152_3_, true);
        if(movingobjectposition == null)
        {
            return p_6152_1_;
        }
        if(movingobjectposition.field_927_a == EnumMovingObjectType.TILE)
        {
            int i = movingobjectposition.field_926_b;
            int j = movingobjectposition.field_932_c;
            int k = movingobjectposition.field_931_d;
            if(!p_6152_2_.func_6157_a(p_6152_3_, i, j, k))
            {
                return p_6152_1_;
            }
            if(!p_6152_3_.func_35200_c(i, j, k))
            {
                return p_6152_1_;
            }
            if(p_6152_2_.func_443_c(i, j, k) == Material.field_521_f && p_6152_2_.func_446_b(i, j, k) == 0 && p_6152_2_.func_20111_e(i, j + 1, k))
            {
                p_6152_2_.func_508_d(i, j + 1, k, Block.field_40165_bA.field_573_bc);
                if(!p_6152_3_.field_35214_K.field_35657_d)
                {
                    p_6152_1_.field_853_a--;
                }
            }
        }
        return p_6152_1_;
    }
}
