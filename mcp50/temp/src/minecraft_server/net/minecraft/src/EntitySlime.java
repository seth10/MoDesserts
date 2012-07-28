// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityLiving, IMob, DataWatcher, NBTTagCompound, 
//            World, MathHelper, AxisAlignedBB, DamageSource, 
//            EntityPlayer, Item, Chunk

public class EntitySlime extends EntityLiving
    implements IMob
{

    public float field_40122_a;
    public float field_401_a;
    public float field_400_b;
    private int field_402_ae;

    public EntitySlime(World p_i495_1_)
    {
        super(p_i495_1_);
        field_402_ae = 0;
        field_9119_aG = "/mob/slime.png";
        int i = 1 << field_9064_W.nextInt(3);
        field_9076_H = 0.0F;
        field_402_ae = field_9064_W.nextInt(20) + 10;
        func_160_c(i);
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, new Byte((byte)1));
    }

    public void func_160_c(int p_160_1_)
    {
        field_21045_af.func_21155_b(16, new Byte((byte)p_160_1_));
        func_113_a(0.6F * (float)p_160_1_, 0.6F * (float)p_160_1_);
        func_86_a(field_322_l, field_321_m, field_320_n);
        func_40103_i(func_40095_c());
        field_35192_ax = p_160_1_;
    }

    public int func_40095_c()
    {
        int i = func_25027_m();
        return i * i;
    }

    public int func_25027_m()
    {
        return field_21045_af.func_21156_a(16);
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_405_a("Size", func_25027_m() - 1);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        func_160_c(p_99_1_.func_395_d("Size") + 1);
    }

    protected String func_40120_w()
    {
        return "slime";
    }

    protected String func_40118_E()
    {
        return "mob.slime";
    }

    public void func_106_b_()
    {
        if(!field_9093_l.field_792_x && field_9093_l.field_804_l == 0 && func_25027_m() > 0)
        {
            field_304_B = true;
        }
        field_401_a = field_401_a + (field_40122_a - field_401_a) * 0.5F;
        field_400_b = field_401_a;
        boolean flag = field_9086_A;
        super.func_106_b_();
        if(field_9086_A && !flag)
        {
            int i = func_25027_m();
            for(int j = 0; j < i * 8; j++)
            {
                float f = field_9064_W.nextFloat() * 3.141593F * 2.0F;
                float f1 = field_9064_W.nextFloat() * 0.5F + 0.5F;
                float f2 = MathHelper.func_585_a(f) * (float)i * 0.5F * f1;
                float f3 = MathHelper.func_582_b(f) * (float)i * 0.5F * f1;
                field_9093_l.func_514_a(func_40120_w(), field_322_l + (double)f2, field_312_v.field_963_b, field_320_n + (double)f3, 0.0D, 0.0D, 0.0D);
            }

            if(func_40121_G())
            {
                field_9093_l.func_506_a(this, func_40118_E(), func_6102_h(), ((field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F + 1.0F) / 0.8F);
            }
            field_40122_a = -0.5F;
        }
        func_40116_B();
    }

    protected void func_152_d_()
    {
        func_27013_Q();
        EntityPlayer entityplayer = field_9093_l.func_40211_b(this, 16D);
        if(entityplayer != null)
        {
            func_147_b(entityplayer, 10F, 20F);
        }
        if(field_9086_A && field_402_ae-- <= 0)
        {
            field_402_ae = func_40115_A();
            if(entityplayer != null)
            {
                field_402_ae /= 3;
            }
            field_9128_br = true;
            if(func_40117_I())
            {
                field_9093_l.func_506_a(this, func_40118_E(), func_6102_h(), ((field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F + 1.0F) * 0.8F);
            }
            field_40122_a = 1.0F;
            field_9131_bo = 1.0F - field_9064_W.nextFloat() * 2.0F;
            field_9130_bp = 1 * func_25027_m();
        } else
        {
            field_9128_br = false;
            if(field_9086_A)
            {
                field_9131_bo = field_9130_bp = 0.0F;
            }
        }
    }

    protected void func_40116_B()
    {
        field_40122_a = field_40122_a * 0.6F;
    }

    protected int func_40115_A()
    {
        return field_9064_W.nextInt(20) + 10;
    }

    protected EntitySlime func_40114_y()
    {
        return new EntitySlime(field_9093_l);
    }

    public void func_118_j()
    {
        int i = func_25027_m();
        if(!field_9093_l.field_792_x && i > 1 && func_40097_ai() <= 0)
        {
            int j = 2 + field_9064_W.nextInt(3);
            for(int k = 0; k < j; k++)
            {
                float f = (((float)(k % 2) - 0.5F) * (float)i) / 4F;
                float f1 = (((float)(k / 2) - 0.5F) * (float)i) / 4F;
                EntitySlime entityslime = func_40114_y();
                entityslime.func_160_c(i / 2);
                entityslime.func_107_c(field_322_l + (double)f, field_321_m + 0.5D, field_320_n + (double)f1, field_9064_W.nextFloat() * 360F, 0.0F);
                field_9093_l.func_526_a(entityslime);
            }

        }
        super.func_118_j();
    }

    public void func_6093_b(EntityPlayer p_6093_1_)
    {
        if(func_40119_C())
        {
            int i = func_25027_m();
            if(func_145_g(p_6093_1_) && (double)func_94_a(p_6093_1_) < 0.59999999999999998D * (double)i && p_6093_1_.func_121_a(DamageSource.func_35072_a(this), func_40113_D()))
            {
                field_9093_l.func_506_a(this, "mob.slimeattack", 1.0F, (field_9064_W.nextFloat() - field_9064_W.nextFloat()) * 0.2F + 1.0F);
            }
        }
    }

    protected boolean func_40119_C()
    {
        return func_25027_m() > 1;
    }

    protected int func_40113_D()
    {
        return func_25027_m();
    }

    protected String func_6100_e()
    {
        return "mob.slime";
    }

    protected String func_6098_f()
    {
        return "mob.slime";
    }

    protected int func_149_g()
    {
        if(func_25027_m() == 1)
        {
            return Item.field_242_aK.field_234_aS;
        } else
        {
            return 0;
        }
    }

    public boolean func_155_a()
    {
        Chunk chunk = field_9093_l.func_492_a(MathHelper.func_584_b(field_322_l), MathHelper.func_584_b(field_320_n));
        if((func_25027_m() == 1 || field_9093_l.field_804_l > 0) && field_9064_W.nextInt(10) == 0 && chunk.func_334_a(0x3ad8025fL).nextInt(10) == 0 && field_321_m < 40D)
        {
            return super.func_155_a();
        } else
        {
            return false;
        }
    }

    protected float func_6102_h()
    {
        return 0.4F * (float)func_25027_m();
    }

    public int func_25018_n_()
    {
        return 0;
    }

    protected boolean func_40117_I()
    {
        return func_25027_m() > 1;
    }

    protected boolean func_40121_G()
    {
        return func_25027_m() > 2;
    }
}
