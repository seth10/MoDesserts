// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EnumToolMaterial, ItemStack, Block, 
//            EntityLiving, Entity

public class ItemTool extends Item
{

    private Block field_265_aX[];
    protected float field_264_aY;
    private int field_263_aZ;
    protected EnumToolMaterial field_20913_a;

    protected ItemTool(int p_i100_1_, int p_i100_2_, EnumToolMaterial p_i100_3_, Block p_i100_4_[])
    {
        super(p_i100_1_);
        field_264_aY = 4F;
        field_20913_a = p_i100_3_;
        field_265_aX = p_i100_4_;
        field_233_aT = 1;
        func_21090_d(p_i100_3_.func_21180_a());
        field_264_aY = p_i100_3_.func_21179_b();
        field_263_aZ = p_i100_2_ + p_i100_3_.func_21178_c();
    }

    public float func_79_a(ItemStack p_79_1_, Block p_79_2_)
    {
        for(int i = 0; i < field_265_aX.length; i++)
        {
            if(field_265_aX[i] == p_79_2_)
            {
                return field_264_aY;
            }
        }

        return 1.0F;
    }

    public boolean func_9201_a(ItemStack p_9201_1_, EntityLiving p_9201_2_, EntityLiving p_9201_3_)
    {
        p_9201_1_.func_25125_a(2, p_9201_3_);
        return true;
    }

    public boolean func_25007_a(ItemStack p_25007_1_, int p_25007_2_, int p_25007_3_, int p_25007_4_, int p_25007_5_, EntityLiving p_25007_6_)
    {
        p_25007_1_.func_25125_a(1, p_25007_6_);
        return true;
    }

    public int func_9203_a(Entity p_9203_1_)
    {
        return field_263_aZ;
    }

    public int func_40224_c()
    {
        return field_20913_a.func_40487_e();
    }
}
