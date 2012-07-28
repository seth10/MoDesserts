// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.HashMap;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, World, Facing, Block, 
//            ItemStack, EntityPlayer, PlayerCapabilities, EntityList, 
//            Entity, EntityLiving

public class ItemMonsterPlacer extends Item
{

    public ItemMonsterPlacer(int p_i289_1_)
    {
        super(p_i289_1_);
        func_21091_a(true);
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(p_78_3_.field_792_x)
        {
            return true;
        }
        int i = p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_);
        p_78_4_ += Facing.field_31051_b[p_78_7_];
        p_78_5_ += Facing.field_31054_c[p_78_7_];
        p_78_6_ += Facing.field_31053_d[p_78_7_];
        double d = 0.0D;
        if(p_78_7_ == 1 && i == Block.field_9050_aZ.field_573_bc || i == Block.field_40172_bC.field_573_bc)
        {
            d = 0.5D;
        }
        if(func_48390_a(p_78_3_, p_78_1_.func_21125_h(), (double)p_78_4_ + 0.5D, (double)p_78_5_ + d, (double)p_78_6_ + 0.5D) && !p_78_2_.field_35214_K.field_35657_d)
        {
            p_78_1_.field_853_a--;
        }
        return true;
    }

    public static boolean func_48390_a(World p_48390_0_, int p_48390_1_, double p_48390_2_, double p_48390_4_, double p_48390_6_)
    {
        if(!EntityList.field_44015_a.containsKey(Integer.valueOf(p_48390_1_)))
        {
            return false;
        }
        Entity entity = EntityList.func_44014_a(p_48390_1_, p_48390_0_);
        if(entity != null)
        {
            entity.func_107_c(p_48390_2_, p_48390_4_, p_48390_6_, p_48390_0_.field_803_m.nextFloat() * 360F, 0.0F);
            p_48390_0_.func_526_a(entity);
            ((EntityLiving)entity).func_22056_G();
        }
        return entity != null;
    }
}
