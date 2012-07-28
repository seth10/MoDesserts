// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, World, Block, BlockJukeBox, 
//            ItemStack, EntityPlayer

public class ItemRecord extends Item
{

    public final String field_261_a;

    protected ItemRecord(int p_i470_1_, String p_i470_2_)
    {
        super(p_i470_1_);
        field_261_a = p_i470_2_;
        field_233_aT = 1;
    }

    public boolean func_78_a(ItemStack p_78_1_, EntityPlayer p_78_2_, World p_78_3_, int p_78_4_, int p_78_5_, int p_78_6_, int p_78_7_)
    {
        if(p_78_3_.func_444_a(p_78_4_, p_78_5_, p_78_6_) == Block.field_619_aZ.field_573_bc && p_78_3_.func_446_b(p_78_4_, p_78_5_, p_78_6_) == 0)
        {
            if(p_78_3_.field_792_x)
            {
                return true;
            } else
            {
                ((BlockJukeBox)Block.field_619_aZ).func_286_f(p_78_3_, p_78_4_, p_78_5_, p_78_6_, field_234_aS);
                p_78_3_.func_28101_a(null, 1005, p_78_4_, p_78_5_, p_78_6_, field_234_aS);
                p_78_1_.field_853_a--;
                return true;
            }
        } else
        {
            return false;
        }
    }
}
