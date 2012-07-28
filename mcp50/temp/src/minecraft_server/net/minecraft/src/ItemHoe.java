// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EnumToolMaterial, EntityPlayer, World, 
//            Block, BlockGrass, StepSound, ItemStack

public class ItemHoe extends Item
{

    public ItemHoe(int p_i262_1_, EnumToolMaterial p_i262_2_)
    {
        super(p_i262_1_);
        field_233_aT = 1;
        func_21090_d(p_i262_2_.func_21180_a());
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        }
        int i = p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_);
        int j = p_78_3_.func_444_a(p_78_4_, p_78_5_ + 1, p_78_6_);
        if(p_78_7_ != 0 && j == 0 && i == Block.field_534_v.field_573_bc || i == Block.field_533_w.field_573_bc)
        {
            Block block = Block.field_643_aB;
            p_78_3_.func_502_a((float)p_78_4_ + 0.5F, (float)p_78_5_ + 0.5F, (float)p_78_6_ + 0.5F, block.field_555_bl.func_737_c(), (block.field_555_bl.func_738_a() + 1.0F) / 2.0F, block.field_555_bl.func_739_b() * 0.8F);
            if(p_78_3_.field_792_x)
            {
                return true;
            } else
            {
                p_78_3_.func_508_d(p_78_4_, p_78_5_, p_78_6_, block.field_573_bc);
                p_78_1_.func_25125_a(1, p_78_2_);
                return true;
            }
        } else
        {
            return false;
        }
    }
}
