// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, World, Material, 
//            AxisAlignedBB, Block, DamageSource, NBTTagCompound, 
//            ItemStack, EntityPlayer, InventoryPlayer, AchievementList, 
//            Item, StatCollector

public class EntityItem extends Entity
{

    public ItemStack field_429_a;
    public int field_9169_b;
    public int field_433_ad;
    private int field_430_ag;
    public float field_432_ae;

    public EntityItem(World p_i187_1_, double p_i187_2_, double p_i187_4_, double p_i187_6_, 
            ItemStack p_i187_8_)
    {
        super(p_i187_1_);
        field_9169_b = 0;
        field_430_ag = 5;
        field_432_ae = (float)(Math.random() * 3.1415926535897931D * 2D);
        func_113_a(0.25F, 0.25F);
        field_9076_H = field_298_E / 2.0F;
        func_86_a(p_i187_2_, p_i187_4_, p_i187_6_);
        field_429_a = p_i187_8_;
        field_316_r = (float)(Math.random() * 360D);
        field_319_o = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
        field_318_p = 0.20000000298023224D;
        field_317_q = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    public EntityItem(World p_i188_1_)
    {
        super(p_i188_1_);
        field_9169_b = 0;
        field_430_ag = 5;
        field_432_ae = (float)(Math.random() * 3.1415926535897931D * 2D);
        func_113_a(0.25F, 0.25F);
        field_9076_H = field_298_E / 2.0F;
    }

    protected void func_21044_a()
    {
    }

    public void func_106_b_()
    {
        super.func_106_b_();
        if(field_433_ad > 0)
        {
            field_433_ad--;
        }
        field_9092_m = field_322_l;
        field_9091_n = field_321_m;
        field_9090_o = field_320_n;
        field_318_p -= 0.039999999105930328D;
        if(field_9093_l.func_443_c(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_321_m), MathHelper.func_584_b(field_320_n)) == Material.field_520_g)
        {
            field_318_p = 0.20000000298023224D;
            field_319_o = (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F;
            field_317_q = (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F;
            field_9093_l.func_506_a(this, "random.fizz", 0.4F, 2.0F + field_9064_W.nextFloat() * 0.4F);
        }
        func_28005_g(field_322_l, (field_312_v.field_963_b + field_312_v.field_968_e) / 2D, field_320_n);
        func_88_c(field_319_o, field_318_p, field_317_q);
        float f = 0.98F;
        if(field_9086_A)
        {
            f = 0.5880001F;
            int i = field_9093_l.func_444_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_312_v.field_963_b) - 1, MathHelper.func_584_b(field_320_n));
            if(i > 0)
            {
                f = Block.field_542_n[i].field_552_bo * 0.98F;
            }
        }
        field_319_o *= f;
        field_318_p *= 0.98000001907348633D;
        field_317_q *= f;
        if(field_9086_A)
        {
            field_318_p *= -0.5D;
        }
        field_9169_b++;
        if(field_9169_b >= 6000)
        {
            func_118_j();
        }
    }

    public void func_48316_k()
    {
        field_9169_b = 4800;
    }

    public boolean func_119_o()
    {
        return field_9093_l.func_490_a(field_312_v, Material.field_521_f, this);
    }

    protected void func_125_b(int p_125_1_)
    {
        func_121_a(DamageSource.field_35091_a, p_125_1_);
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        func_9060_u();
        field_430_ag -= p_121_2_;
        if(field_430_ag <= 0)
        {
            func_118_j();
        }
        return false;
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_394_a("Health", (byte)field_430_ag);
        p_97_1_.func_394_a("Age", (short)field_9169_b);
        p_97_1_.func_392_a("Item", field_429_a.func_570_a(new NBTTagCompound()));
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        field_430_ag = p_99_1_.func_406_c("Health") & 0xff;
        field_9169_b = p_99_1_.func_406_c("Age");
        NBTTagCompound nbttagcompound = p_99_1_.func_397_j("Item");
        field_429_a = ItemStack.func_35618_a(nbttagcompound);
        if(field_429_a == null)
        {
            func_118_j();
        }
    }

    public void func_6093_b(EntityPlayer p_6093_1_)
    {
        if(field_9093_l.field_792_x)
        {
            return;
        }
        int i = field_429_a.field_853_a;
        if(field_433_ad == 0 && p_6093_1_.field_416_aj.func_201_a(field_429_a))
        {
            if(field_429_a.field_855_c == Block.field_582_K.field_573_bc)
            {
                p_6093_1_.func_27017_a(AchievementList.field_25131_c);
            }
            if(field_429_a.field_855_c == Item.field_249_aD.field_234_aS)
            {
                p_6093_1_.func_27017_a(AchievementList.field_27099_t);
            }
            if(field_429_a.field_855_c == Item.field_167_l.field_234_aS)
            {
                p_6093_1_.func_27017_a(AchievementList.field_40478_w);
            }
            if(field_429_a.field_855_c == Item.field_40239_bm.field_234_aS)
            {
                p_6093_1_.func_27017_a(AchievementList.field_40479_z);
            }
            field_9093_l.func_506_a(this, "random.pop", 0.2F, ((field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            p_6093_1_.func_163_c(this, i);
            if(field_429_a.field_853_a <= 0)
            {
                func_118_j();
            }
        }
    }

    public String func_35150_Y()
    {
        return StatCollector.func_25136_a((new StringBuilder()).append("item.").append(field_429_a.func_35616_k()).toString());
    }

    public boolean func_48313_k_()
    {
        return false;
    }
}
