// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, MovingObjectPosition, EnumMovingObjectType, World, 
//            EntityPlayer, Material, ItemStack, InventoryPlayer, 
//            ItemPotion

public class ItemGlassBottle extends Item
{

    public ItemGlassBottle(int p_i478_1_)
    {
        super(p_i478_1_);
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
            if(p_6152_2_.func_443_c(i, j, k) == Material.field_521_f)
            {
                p_6152_1_.field_853_a--;
                if(p_6152_1_.field_853_a <= 0)
                {
                    return new ItemStack(Item.field_40238_bq);
                }
                if(!p_6152_3_.field_416_aj.func_201_a(new ItemStack(Item.field_40238_bq)))
                {
                    p_6152_3_.func_48348_b(new ItemStack(Item.field_40238_bq.field_234_aS, 1, 0));
                }
            }
        }
        return p_6152_1_;
    }
}
