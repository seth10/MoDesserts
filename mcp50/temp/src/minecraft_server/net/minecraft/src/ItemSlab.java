// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemBlock, ItemStack, BlockStep, EntityPlayer, 
//            World, Block, StepSound

public class ItemSlab extends ItemBlock
{

    public ItemSlab(int p_i117_1_)
    {
        super(p_i117_1_);
        func_21090_d(0);
        func_21091_a(true);
    }

    public int func_21089_a(int p_21089_1_)
    {
        return p_21089_1_;
    }

    public String func_35407_a(ItemStack p_35407_1_)
    {
        int i = p_35407_1_.func_21125_h();
        if(i < 0 || i >= BlockStep.field_35062_a.length)
        {
            i = 0;
        }
        return (new StringBuilder()).append(super.func_20106_a()).append(".").append(BlockStep.field_35062_a[i]).toString();
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(p_78_1_.field_853_a == 0)
        {
            return false;
        }
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        }
        int i = p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_);
        int j = p_78_3_.func_446_b(p_78_4_, p_78_5_, p_78_6_);
        int k = j & 7;
        boolean flag = (j & 8) != 0;
        if((p_78_7_ == 1 && !flag || p_78_7_ == 0 && flag) && i == Block.field_607_al.field_573_bc && k == p_78_1_.func_21125_h())
        {
            if(p_78_3_.func_522_a(Block.field_608_ak.func_248_d(p_78_3_, p_78_4_, p_78_5_, p_78_6_)) && p_78_3_.func_507_b(p_78_4_, p_78_5_, p_78_6_, Block.field_608_ak.field_573_bc, k))
            {
                p_78_3_.func_502_a((float)p_78_4_ + 0.5F, (float)p_78_5_ + 0.5F, (float)p_78_6_ + 0.5F, Block.field_608_ak.field_555_bl.func_737_c(), (Block.field_608_ak.field_555_bl.func_738_a() + 1.0F) / 2.0F, Block.field_608_ak.field_555_bl.func_739_b() * 0.8F);
                p_78_1_.field_853_a--;
            }
            return true;
        }
        if(func_50020_b(p_78_1_, p_78_2_, p_78_3_, p_78_4_, p_78_5_, p_78_6_, p_78_7_))
        {
            return true;
        } else
        {
            return super.func_78_a(p_78_1_, p_78_2_, p_78_3_, p_78_4_, p_78_5_, p_78_6_, p_78_7_);
        }
    }

    private static boolean func_50020_b(ItemStack p_50020_0_, EntityPlayer p_50020_1_, World p_50020_2_, int p_50020_3_, int p_50020_4_, int p_50020_5_, int p_50020_6_)
    {
        if(p_50020_6_ == 0)
        {
            p_50020_4_--;
        }
        if(p_50020_6_ == 1)
        {
            p_50020_4_++;
        }
        if(p_50020_6_ == 2)
        {
            p_50020_5_--;
        }
        if(p_50020_6_ == 3)
        {
            p_50020_5_++;
        }
        if(p_50020_6_ == 4)
        {
            p_50020_3_--;
        }
        if(p_50020_6_ == 5)
        {
            p_50020_3_++;
        }
        int i = p_50020_2_.func_444_a(p_50020_3_, p_50020_4_, p_50020_5_);
        int j = p_50020_2_.func_446_b(p_50020_3_, p_50020_4_, p_50020_5_);
        int k = j & 7;
        if(i == Block.field_607_al.field_573_bc && k == p_50020_0_.func_21125_h())
        {
            if(p_50020_2_.func_522_a(Block.field_608_ak.func_248_d(p_50020_2_, p_50020_3_, p_50020_4_, p_50020_5_)) && p_50020_2_.func_507_b(p_50020_3_, p_50020_4_, p_50020_5_, Block.field_608_ak.field_573_bc, k))
            {
                p_50020_2_.func_502_a((float)p_50020_3_ + 0.5F, (float)p_50020_4_ + 0.5F, (float)p_50020_5_ + 0.5F, Block.field_608_ak.field_555_bl.func_737_c(), (Block.field_608_ak.field_555_bl.func_738_a() + 1.0F) / 2.0F, Block.field_608_ak.field_555_bl.func_739_b() * 0.8F);
                p_50020_0_.field_853_a--;
            }
            return true;
        } else
        {
            return false;
        }
    }
}
