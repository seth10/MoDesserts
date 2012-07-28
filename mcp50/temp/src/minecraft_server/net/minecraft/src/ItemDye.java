// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, ItemStack, MathHelper, EntityPlayer, 
//            World, Block, BlockSapling, BlockFlower, 
//            BlockMushroom, BlockStem, BlockCrops, BlockGrass, 
//            BlockTallGrass, EntitySheep, BlockCloth, EntityLiving

public class ItemDye extends Item
{

    public static final String field_21099_a[] = {
        "black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", 
        "lime", "yellow", "lightBlue", "magenta", "orange", "white"
    };
    public static final int field_31023_bk[] = {
        0x1e1b1b, 0xb3312c, 0x3b511a, 0x51301a, 0x253192, 0x7b2fbe, 0x287697, 0x287697, 0x434343, 0xd88198, 
        0x41cd34, 0xdecf2a, 0x6689d3, 0xc354cd, 0xeb8844, 0xf0f0f0
    };

    public ItemDye(int p_i250_1_)
    {
        super(p_i250_1_);
        func_21091_a(true);
        func_21090_d(0);
    }

    public String func_35407_a(ItemStack p_35407_1_)
    {
        int i = MathHelper.func_41051_a(p_35407_1_.func_21125_h(), 0, 15);
        return (new StringBuilder()).append(super.func_20106_a()).append(".").append(field_21099_a[i]).toString();
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        }
        if(p_78_1_.func_21125_h() == 15)
        {
            int i = p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_);
            if(i == Block.field_6047_y.field_573_bc)
            {
                if(!p_78_3_.field_792_x)
                {
                    ((BlockSapling)Block.field_6047_y).func_21027_b(p_78_3_, p_78_4_, p_78_5_, p_78_6_, p_78_3_.field_803_m);
                    p_78_1_.field_853_a--;
                }
                return true;
            }
            if(i == Block.field_4070_ag.field_573_bc || i == Block.field_4069_ah.field_573_bc)
            {
                if(!p_78_3_.field_792_x && ((BlockMushroom)Block.field_542_n[i]).func_35065_b(p_78_3_, p_78_4_, p_78_5_, p_78_6_, p_78_3_.field_803_m))
                {
                    p_78_1_.field_853_a--;
                }
                return true;
            }
            if(i == Block.field_35050_bu.field_573_bc || i == Block.field_35051_bt.field_573_bc)
            {
                if(!p_78_3_.field_792_x)
                {
                    ((BlockStem)Block.field_542_n[i]).func_35066_f_(p_78_3_, p_78_4_, p_78_5_, p_78_6_);
                    p_78_1_.field_853_a--;
                }
                return true;
            }
            if(i == Block.field_644_aA.field_573_bc)
            {
                if(!p_78_3_.field_792_x)
                {
                    ((BlockCrops)Block.field_644_aA).func_21028_c(p_78_3_, p_78_4_, p_78_5_, p_78_6_);
                    p_78_1_.field_853_a--;
                }
                return true;
            }
            if(i == Block.field_534_v.field_573_bc)
            {
                if(!p_78_3_.field_792_x)
                {
                    p_78_1_.field_853_a--;
label0:
                    for(int j = 0; j < 128; j++)
                    {
                        int k = p_78_4_;
                        int l = p_78_5_ + 1;
                        int i1 = p_78_6_;
                        for(int j1 = 0; j1 < j / 16; j1++)
                        {
                            k += field_4154_b.nextInt(3) - 1;
                            l += ((field_4154_b.nextInt(3) - 1) * field_4154_b.nextInt(3)) / 2;
                            i1 += field_4154_b.nextInt(3) - 1;
                            if(p_78_3_.func_444_a(k, l - 1, i1) != Block.field_534_v.field_573_bc || p_78_3_.func_445_d(k, l, i1))
                            {
                                continue label0;
                            }
                        }

                        if(p_78_3_.func_444_a(k, l, i1) != 0)
                        {
                            continue;
                        }
                        if(field_4154_b.nextInt(10) != 0)
                        {
                            p_78_3_.func_507_b(k, l, i1, Block.field_9031_X.field_573_bc, 1);
                            continue;
                        }
                        if(field_4154_b.nextInt(3) != 0)
                        {
                            p_78_3_.func_508_d(k, l, i1, Block.field_4072_ae.field_573_bc);
                        } else
                        {
                            p_78_3_.func_508_d(k, l, i1, Block.field_4071_af.field_573_bc);
                        }
                    }

                }
                return true;
            }
        }
        return false;
    }

    public void func_9202_b(ItemStack p_9202_1_, EntityLiving p_9202_2_)
    {
        if(p_9202_2_ instanceof EntitySheep)
        {
            EntitySheep entitysheep = (EntitySheep)p_9202_2_;
            int i = BlockCloth.func_21033_c(p_9202_1_.func_21125_h());
            if(!entitysheep.func_21069_f_() && entitysheep.func_21068_e_() != i)
            {
                entitysheep.func_21070_a(i);
                p_9202_1_.field_853_a--;
            }
        }
    }

}
