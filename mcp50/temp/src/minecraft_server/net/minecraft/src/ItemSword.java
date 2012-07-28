// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EnumToolMaterial, Block, ItemStack, 
//            EnumAction, EntityPlayer, EntityLiving, Entity, 
//            World

public class ItemSword extends Item
{

    private int field_4210_a;
    private final EnumToolMaterial field_40249_bQ;

    public ItemSword(int p_i381_1_, EnumToolMaterial p_i381_2_)
    {
        super(p_i381_1_);
        field_40249_bQ = p_i381_2_;
        field_233_aT = 1;
        func_21090_d(p_i381_2_.func_21180_a());
        field_4210_a = 4 + p_i381_2_.func_21178_c();
    }

    public float func_79_a(ItemStack p_79_1_, Block p_79_2_)
    {
        return p_79_2_.field_573_bc != Block.field_9032_W.field_573_bc ? 1.5F : 15F;
    }

    public boolean func_9201_a(ItemStack p_9201_1_, EntityLiving p_9201_2_, EntityLiving p_9201_3_)
    {
        p_9201_1_.func_25125_a(1, p_9201_3_);
        return true;
    }

    public boolean func_25007_a(ItemStack p_25007_1_, int p_25007_2_, int p_25007_3_, int p_25007_4_, int p_25007_5_, EntityLiving p_25007_6_)
    {
        p_25007_1_.func_25125_a(2, p_25007_6_);
        return true;
    }

    public int func_9203_a(Entity p_9203_1_)
    {
        return field_4210_a;
    }

    public EnumAction func_35406_b(ItemStack p_35406_1_)
    {
        return EnumAction.block;
    }

    public int func_35404_c(ItemStack p_35404_1_)
    {
        return 0x11940;
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        p_6152_3_.func_35201_a(p_6152_1_, func_35404_c(p_6152_1_));
        return p_6152_1_;
    }

    public boolean func_80_a(Block p_80_1_)
    {
        return p_80_1_.field_573_bc == Block.field_9032_W.field_573_bc;
    }

    public int func_40224_c()
    {
        return field_40249_bQ.func_40487_e();
    }
}
