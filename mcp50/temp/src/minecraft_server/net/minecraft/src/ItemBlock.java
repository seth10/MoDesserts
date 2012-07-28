// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, Block, World, BlockTallGrass, 
//            BlockDeadBush, ItemStack, EntityPlayer, Material, 
//            StepSound

public class ItemBlock extends Item
{

    private int field_272_a;

    public ItemBlock(int p_i65_1_)
    {
        super(p_i65_1_);
        field_272_a = p_i65_1_ + 256;
        func_4049_a(Block.field_542_n[p_i65_1_ + 256].func_241_a(2));
    }

    public int func_35419_a()
    {
        return field_272_a;
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        int i = p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_);
        if(i == Block.field_625_aT.field_573_bc)
        {
            p_78_7_ = 1;
        } else
        if(i != Block.field_35045_bv.field_573_bc && i != Block.field_9031_X.field_573_bc && i != Block.field_9030_Y.field_573_bc)
        {
            if(p_78_7_ == 0)
            {
                p_78_5_--;
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
        }
        if(p_78_1_.field_853_a == 0)
        {
            return false;
        }
        if(!p_78_2_.func_35200_c(p_78_4_, p_78_5_, p_78_6_))
        {
            return false;
        }
        if(p_78_5_ == 255 && Block.field_542_n[field_272_a].field_553_bn.func_216_a())
        {
            return false;
        }
        if(p_78_3_.func_516_a(field_272_a, p_78_4_, p_78_5_, p_78_6_, false, p_78_7_))
        {
            Block block = Block.field_542_n[field_272_a];
            if(p_78_3_.func_507_b(p_78_4_, p_78_5_, p_78_6_, field_272_a, func_21089_a(p_78_1_.func_21125_h())))
            {
                if(p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_) == field_272_a)
                {
                    Block.field_542_n[field_272_a].func_255_c(p_78_3_, p_78_4_, p_78_5_, p_78_6_, p_78_7_);
                    Block.field_542_n[field_272_a].func_4027_a(p_78_3_, p_78_4_, p_78_5_, p_78_6_, p_78_2_);
                }
                p_78_3_.func_502_a((float)p_78_4_ + 0.5F, (float)p_78_5_ + 0.5F, (float)p_78_6_ + 0.5F, block.field_555_bl.func_737_c(), (block.field_555_bl.func_738_a() + 1.0F) / 2.0F, block.field_555_bl.func_739_b() * 0.8F);
                p_78_1_.field_853_a--;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public String func_35407_a(ItemStack p_35407_1_)
    {
        return Block.field_542_n[field_272_a].func_20036_e();
    }

    public String func_20106_a()
    {
        return Block.field_542_n[field_272_a].func_20036_e();
    }
}
