// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Entity, EnumArt, AxisAlignedBB, World, 
//            EntityItem, ItemStack, Item, MathHelper, 
//            Material, NBTTagCompound, DamageSource

public class EntityPainting extends Entity
{

    private int field_452_ad;
    public int field_448_a;
    public int field_9188_d;
    public int field_9187_e;
    public int field_9186_f;
    public EnumArt field_9185_b;

    public EntityPainting(World p_i397_1_)
    {
        super(p_i397_1_);
        field_452_ad = 0;
        field_448_a = 0;
        field_9076_H = 0.0F;
        func_113_a(0.5F, 0.5F);
    }

    public EntityPainting(World p_i398_1_, int p_i398_2_, int p_i398_3_, int p_i398_4_, int p_i398_5_)
    {
        this(p_i398_1_);
        field_9188_d = p_i398_2_;
        field_9187_e = p_i398_3_;
        field_9186_f = p_i398_4_;
        ArrayList arraylist = new ArrayList();
        EnumArt aenumart[] = EnumArt.values();
        int i = aenumart.length;
        for(int j = 0; j < i; j++)
        {
            EnumArt enumart = aenumart[j];
            field_9185_b = enumart;
            func_179_a(p_i398_5_);
            if(func_181_b())
            {
                arraylist.add(enumart);
            }
        }

        if(arraylist.size() > 0)
        {
            field_9185_b = (EnumArt)arraylist.get(field_9064_W.nextInt(arraylist.size()));
        }
        func_179_a(p_i398_5_);
    }

    protected void func_21044_a()
    {
    }

    public void func_179_a(int p_179_1_)
    {
        field_448_a = p_179_1_;
        field_9089_x = field_316_r = p_179_1_ * 90;
        float f = field_9185_b.field_856_z;
        float f1 = field_9185_b.field_869_A;
        float f2 = field_9185_b.field_856_z;
        if(p_179_1_ == 0 || p_179_1_ == 2)
        {
            f2 = 0.5F;
        } else
        {
            f = 0.5F;
        }
        f /= 32F;
        f1 /= 32F;
        f2 /= 32F;
        float f3 = (float)field_9188_d + 0.5F;
        float f4 = (float)field_9187_e + 0.5F;
        float f5 = (float)field_9186_f + 0.5F;
        float f6 = 0.5625F;
        if(p_179_1_ == 0)
        {
            f5 -= f6;
        }
        if(p_179_1_ == 1)
        {
            f3 -= f6;
        }
        if(p_179_1_ == 2)
        {
            f5 += f6;
        }
        if(p_179_1_ == 3)
        {
            f3 += f6;
        }
        if(p_179_1_ == 0)
        {
            f3 -= func_180_c(field_9185_b.field_856_z);
        }
        if(p_179_1_ == 1)
        {
            f5 += func_180_c(field_9185_b.field_856_z);
        }
        if(p_179_1_ == 2)
        {
            f3 += func_180_c(field_9185_b.field_856_z);
        }
        if(p_179_1_ == 3)
        {
            f5 -= func_180_c(field_9185_b.field_856_z);
        }
        f4 += func_180_c(field_9185_b.field_869_A);
        func_86_a(f3, f4, f5);
        float f7 = -0.00625F;
        field_312_v.func_695_c(f3 - f - f7, f4 - f1 - f7, f5 - f2 - f7, f3 + f + f7, f4 + f1 + f7, f5 + f2 + f7);
    }

    private float func_180_c(int p_180_1_)
    {
        if(p_180_1_ == 32)
        {
            return 0.5F;
        }
        return p_180_1_ != 64 ? 0.0F : 0.5F;
    }

    public void func_106_b_()
    {
        if(field_452_ad++ == 100 && !field_9093_l.field_792_x)
        {
            field_452_ad = 0;
            if(!field_304_B && !func_181_b())
            {
                func_118_j();
                field_9093_l.func_526_a(new EntityItem(field_9093_l, field_322_l, field_321_m, field_320_n, new ItemStack(Item.field_213_aq)));
            }
        }
    }

    public boolean func_181_b()
    {
        if(field_9093_l.func_481_a(this, field_312_v).size() > 0)
        {
            return false;
        }
        int i = field_9185_b.field_856_z / 16;
        int j = field_9185_b.field_869_A / 16;
        int k = field_9188_d;
        int l = field_9187_e;
        int i1 = field_9186_f;
        if(field_448_a == 0)
        {
            k = MathHelper.func_584_b(field_322_l - (double)((float)field_9185_b.field_856_z / 32F));
        }
        if(field_448_a == 1)
        {
            i1 = MathHelper.func_584_b(field_320_n - (double)((float)field_9185_b.field_856_z / 32F));
        }
        if(field_448_a == 2)
        {
            k = MathHelper.func_584_b(field_322_l - (double)((float)field_9185_b.field_856_z / 32F));
        }
        if(field_448_a == 3)
        {
            i1 = MathHelper.func_584_b(field_320_n - (double)((float)field_9185_b.field_856_z / 32F));
        }
        l = MathHelper.func_584_b(field_321_m - (double)((float)field_9185_b.field_869_A / 32F));
        for(int j1 = 0; j1 < i; j1++)
        {
            for(int k1 = 0; k1 < j; k1++)
            {
                Material material;
                if(field_448_a == 0 || field_448_a == 2)
                {
                    material = field_9093_l.func_443_c(k + j1, l + k1, field_9186_f);
                } else
                {
                    material = field_9093_l.func_443_c(field_9188_d, l + k1, i1 + j1);
                }
                if(!material.func_216_a())
                {
                    return false;
                }
            }

        }

        List list = field_9093_l.func_450_b(this, field_312_v);
        for(int l1 = 0; l1 < list.size(); l1++)
        {
            if(list.get(l1) instanceof EntityPainting)
            {
                return false;
            }
        }

        return true;
    }

    public boolean func_129_c_()
    {
        return true;
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        if(!field_304_B && !field_9093_l.field_792_x)
        {
            func_118_j();
            func_9060_u();
            field_9093_l.func_526_a(new EntityItem(field_9093_l, field_322_l, field_321_m, field_320_n, new ItemStack(Item.field_213_aq)));
        }
        return true;
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        p_97_1_.func_409_a("Dir", (byte)field_448_a);
        p_97_1_.func_403_a("Motive", field_9185_b.field_857_y);
        p_97_1_.func_405_a("TileX", field_9188_d);
        p_97_1_.func_405_a("TileY", field_9187_e);
        p_97_1_.func_405_a("TileZ", field_9186_f);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        field_448_a = p_99_1_.func_408_b("Dir");
        field_9188_d = p_99_1_.func_395_d("TileX");
        field_9187_e = p_99_1_.func_395_d("TileY");
        field_9186_f = p_99_1_.func_395_d("TileZ");
        String s = p_99_1_.func_401_h("Motive");
        EnumArt aenumart[] = EnumArt.values();
        int i = aenumart.length;
        for(int j = 0; j < i; j++)
        {
            EnumArt enumart = aenumart[j];
            if(enumart.field_857_y.equals(s))
            {
                field_9185_b = enumart;
            }
        }

        if(field_9185_b == null)
        {
            field_9185_b = EnumArt.Kebab;
        }
        func_179_a(field_448_a);
    }

    public void func_88_c(double p_88_1_, double p_88_3_, double p_88_5_)
    {
        if(!field_9093_l.field_792_x && !field_304_B && p_88_1_ * p_88_1_ + p_88_3_ * p_88_3_ + p_88_5_ * p_88_5_ > 0.0D)
        {
            func_118_j();
            field_9093_l.func_526_a(new EntityItem(field_9093_l, field_322_l, field_321_m, field_320_n, new ItemStack(Item.field_213_aq)));
        }
    }

    public void func_87_f(double p_87_1_, double p_87_3_, double p_87_5_)
    {
        if(!field_9093_l.field_792_x && !field_304_B && p_87_1_ * p_87_1_ + p_87_3_ * p_87_3_ + p_87_5_ * p_87_5_ > 0.0D)
        {
            func_118_j();
            field_9093_l.func_526_a(new EntityItem(field_9093_l, field_322_l, field_321_m, field_320_n, new ItemStack(Item.field_213_aq)));
        }
    }
}
