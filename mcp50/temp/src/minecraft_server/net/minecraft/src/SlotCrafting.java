// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ItemStack, EntityPlayer, Block, 
//            AchievementList, Item, IInventory, InventoryPlayer

public class SlotCrafting extends Slot
{

    private final IInventory field_20103_a;
    private EntityPlayer field_25004_e;
    private int field_48418_g;

    public SlotCrafting(EntityPlayer p_i615_1_, IInventory p_i615_2_, IInventory p_i615_3_, int p_i615_4_, int p_i615_5_, int p_i615_6_)
    {
        super(p_i615_3_, p_i615_4_, p_i615_5_, p_i615_6_);
        field_25004_e = p_i615_1_;
        field_20103_a = p_i615_2_;
    }

    public boolean func_20095_a(ItemStack p_20095_1_)
    {
        return false;
    }

    public ItemStack func_20088_a(int p_20088_1_)
    {
        if(func_27006_b())
        {
            field_48418_g += Math.min(p_20088_1_, func_20092_c().field_853_a);
        }
        return super.func_20088_a(p_20088_1_);
    }

    protected void func_48415_a(ItemStack p_48415_1_, int p_48415_2_)
    {
        field_48418_g += p_48415_2_;
        func_48416_b(p_48415_1_);
    }

    protected void func_48416_b(ItemStack p_48416_1_)
    {
        p_48416_1_.func_48584_a(field_25004_e.field_9093_l, field_25004_e, field_48418_g);
        field_48418_g = 0;
        if(p_48416_1_.field_855_c == Block.field_9044_ay.field_573_bc)
        {
            field_25004_e.func_25046_a(AchievementList.field_25130_d, 1);
        } else
        if(p_48416_1_.field_855_c == Item.field_4143_r.field_234_aS)
        {
            field_25004_e.func_25046_a(AchievementList.field_27110_i, 1);
        } else
        if(p_48416_1_.field_855_c == Block.field_642_aC.field_573_bc)
        {
            field_25004_e.func_25046_a(AchievementList.field_27109_j, 1);
        } else
        if(p_48416_1_.field_855_c == Item.field_4166_L.field_234_aS)
        {
            field_25004_e.func_25046_a(AchievementList.field_27107_l, 1);
        } else
        if(p_48416_1_.field_855_c == Item.field_185_S.field_234_aS)
        {
            field_25004_e.func_25046_a(AchievementList.field_27106_m, 1);
        } else
        if(p_48416_1_.field_855_c == Item.field_21098_aX.field_234_aS)
        {
            field_25004_e.func_25046_a(AchievementList.field_27105_n, 1);
        } else
        if(p_48416_1_.field_855_c == Item.field_4139_v.field_234_aS)
        {
            field_25004_e.func_25046_a(AchievementList.field_27104_o, 1);
        } else
        if(p_48416_1_.field_855_c == Item.field_4145_p.field_234_aS)
        {
            field_25004_e.func_25046_a(AchievementList.field_27101_r, 1);
        } else
        if(p_48416_1_.field_855_c == Block.field_40175_bF.field_573_bc)
        {
            field_25004_e.func_25046_a(AchievementList.field_40472_D, 1);
        } else
        if(p_48416_1_.field_855_c == Block.field_604_ao.field_573_bc)
        {
            field_25004_e.func_25046_a(AchievementList.field_40474_F, 1);
        }
    }

    public void func_20091_b(ItemStack p_20091_1_)
    {
        func_48416_b(p_20091_1_);
        for(int i = 0; i < field_20103_a.func_83_a(); i++)
        {
            ItemStack itemstack = field_20103_a.func_82_a(i);
            if(itemstack == null)
            {
                continue;
            }
            field_20103_a.func_20069_a(i, 1);
            if(!itemstack.func_569_a().func_21088_g())
            {
                continue;
            }
            ItemStack itemstack1 = new ItemStack(itemstack.func_569_a().func_21087_f());
            if(itemstack.func_569_a().func_46004_e(itemstack) && field_25004_e.field_416_aj.func_201_a(itemstack1))
            {
                continue;
            }
            if(field_20103_a.func_82_a(i) == null)
            {
                field_20103_a.func_206_a(i, itemstack1);
            } else
            {
                field_25004_e.func_48348_b(itemstack1);
            }
        }

    }
}
