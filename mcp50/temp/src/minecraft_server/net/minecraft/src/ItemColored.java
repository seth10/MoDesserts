// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemBlock, Block, ItemStack

public class ItemColored extends ItemBlock
{

    private final Block field_35421_a;
    private String field_41041_b[];

    public ItemColored(int p_i572_1_, boolean p_i572_2_)
    {
        super(p_i572_1_);
        field_35421_a = Block.field_542_n[func_35419_a()];
        if(p_i572_2_)
        {
            func_21090_d(0);
            func_21091_a(true);
        }
    }

    public int func_21089_a(int p_21089_1_)
    {
        return p_21089_1_;
    }

    public ItemColored func_41040_a(String p_41040_1_[])
    {
        field_41041_b = p_41040_1_;
        return this;
    }

    public String func_35407_a(ItemStack p_35407_1_)
    {
        if(field_41041_b == null)
        {
            return super.func_35407_a(p_35407_1_);
        }
        int i = p_35407_1_.func_21125_h();
        if(i >= 0 && i < field_41041_b.length)
        {
            return (new StringBuilder()).append(super.func_35407_a(p_35407_1_)).append(".").append(field_41041_b[i]).toString();
        } else
        {
            return super.func_35407_a(p_35407_1_);
        }
    }
}
