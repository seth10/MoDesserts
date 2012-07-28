// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, Material, Block, EntityPlayer, 
//            MathHelper, ItemStack, World

public class ItemDoor extends Item
{

    private Material field_260_a;

    public ItemDoor(int p_i197_1_, Material p_i197_2_)
    {
        super(p_i197_1_);
        field_260_a = p_i197_2_;
        field_233_aT = 1;
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(p_78_7_ != 1)
        {
            return false;
        }
        p_78_5_++;
        Block block;
        if(field_260_a == Material.field_524_c)
        {
            block = Block.field_639_aF;
        } else
        {
            block = Block.field_632_aM;
        }
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_) || !p_78_2_.func_35200_c(p_78_4_, p_78_5_ + 1, p_78_6_))
        {
            return false;
        }
        if(!block.func_259_a(p_78_3_, p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        } else
        {
            int i = MathHelper.func_584_b((double)(((p_78_2_.field_316_r + 180F) * 4F) / 360F) - 0.5D) & 3;
            func_35418_a(p_78_3_, p_78_4_, p_78_5_, p_78_6_, i, block);
            p_78_1_.field_853_a--;
            return true;
        }
    }

    public static void func_35418_a(World p_35418_0_, int p_35418_1_, int p_35418_2_, int p_35418_3_, int p_35418_4_, Block p_35418_5_)
    {
        byte byte0 = 0;
        byte byte1 = 0;
        if(p_35418_4_ == 0)
        {
            byte1 = 1;
        }
        if(p_35418_4_ == 1)
        {
            byte0 = -1;
        }
        if(p_35418_4_ == 2)
        {
            byte1 = -1;
        }
        if(p_35418_4_ == 3)
        {
            byte0 = 1;
        }
        int i = (p_35418_0_.func_445_d(p_35418_1_ - byte0, p_35418_2_, p_35418_3_ - byte1) ? 1 : 0) + (p_35418_0_.func_445_d(p_35418_1_ - byte0, p_35418_2_ + 1, p_35418_3_ - byte1) ? 1 : 0);
        int j = (p_35418_0_.func_445_d(p_35418_1_ + byte0, p_35418_2_, p_35418_3_ + byte1) ? 1 : 0) + (p_35418_0_.func_445_d(p_35418_1_ + byte0, p_35418_2_ + 1, p_35418_3_ + byte1) ? 1 : 0);
        boolean flag = p_35418_0_.func_444_a(p_35418_1_ - byte0, p_35418_2_, p_35418_3_ - byte1) == p_35418_5_.field_573_bc || p_35418_0_.func_444_a(p_35418_1_ - byte0, p_35418_2_ + 1, p_35418_3_ - byte1) == p_35418_5_.field_573_bc;
        boolean flag1 = p_35418_0_.func_444_a(p_35418_1_ + byte0, p_35418_2_, p_35418_3_ + byte1) == p_35418_5_.field_573_bc || p_35418_0_.func_444_a(p_35418_1_ + byte0, p_35418_2_ + 1, p_35418_3_ + byte1) == p_35418_5_.field_573_bc;
        boolean flag2 = false;
        if(flag && !flag1)
        {
            flag2 = true;
        } else
        if(j > i)
        {
            flag2 = true;
        }
        p_35418_0_.field_808_h = true;
        p_35418_0_.func_507_b(p_35418_1_, p_35418_2_, p_35418_3_, p_35418_5_.field_573_bc, p_35418_4_);
        p_35418_0_.func_507_b(p_35418_1_, p_35418_2_ + 1, p_35418_3_, p_35418_5_.field_573_bc, 8 | (flag2 ? 1 : 0));
        p_35418_0_.field_808_h = false;
        p_35418_0_.func_449_g(p_35418_1_, p_35418_2_, p_35418_3_, p_35418_5_.field_573_bc);
        p_35418_0_.func_449_g(p_35418_1_, p_35418_2_ + 1, p_35418_3_, p_35418_5_.field_573_bc);
    }
}
