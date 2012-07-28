// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAnimal, EntityAISit, DataWatcher, NBTTagCompound, 
//            World, EntityLiving

public abstract class EntityTameable extends EntityAnimal
{

    protected EntityAISit field_48374_a;

    public EntityTameable(World p_i1027_1_)
    {
        super(p_i1027_1_);
        field_48374_a = new EntityAISit(this);
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(16, Byte.valueOf((byte)0));
        field_21045_af.func_21153_a(17, "");
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        if(func_48367_A() == null)
        {
            p_97_1_.func_403_a("Owner", "");
        } else
        {
            p_97_1_.func_403_a("Owner", func_48367_A());
        }
        p_97_1_.func_393_a("Sitting", func_48371_v_());
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        String s = p_99_1_.func_401_h("Owner");
        if(s.length() > 0)
        {
            func_48372_a(s);
            func_48366_b(true);
        }
        field_48374_a.func_48210_a(p_99_1_.func_402_l("Sitting"));
    }

    protected void func_48370_a(boolean p_48370_1_)
    {
        String s = "heart";
        if(!p_48370_1_)
        {
            s = "smoke";
        }
        for(int i = 0; i < 7; i++)
        {
            double d = field_9064_W.nextGaussian() * 0.02D;
            double d1 = field_9064_W.nextGaussian() * 0.02D;
            double d2 = field_9064_W.nextGaussian() * 0.02D;
            field_9093_l.func_514_a(s, (field_322_l + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, field_321_m + 0.5D + (double)(field_9064_W.nextFloat() * field_298_E), (field_320_n + (double)(field_9064_W.nextFloat() * field_300_D * 2.0F)) - (double)field_300_D, d, d1, d2);
        }

    }

    public boolean func_48373_u_()
    {
        return (field_21045_af.func_21156_a(16) & 4) != 0;
    }

    public void func_48366_b(boolean p_48366_1_)
    {
        byte byte0 = field_21045_af.func_21156_a(16);
        if(p_48366_1_)
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 | 4)));
        } else
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 & -5)));
        }
    }

    public boolean func_48371_v_()
    {
        return (field_21045_af.func_21156_a(16) & 1) != 0;
    }

    public void func_48369_c(boolean p_48369_1_)
    {
        byte byte0 = field_21045_af.func_21156_a(16);
        if(p_48369_1_)
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 | 1)));
        } else
        {
            field_21045_af.func_21155_b(16, Byte.valueOf((byte)(byte0 & -2)));
        }
    }

    public String func_48367_A()
    {
        return field_21045_af.func_25076_c(17);
    }

    public void func_48372_a(String p_48372_1_)
    {
        field_21045_af.func_21155_b(17, p_48372_1_);
    }

    public EntityLiving func_48368_w_()
    {
        return field_9093_l.func_25071_a(func_48367_A());
    }

    public EntityAISit func_50021_C()
    {
        return field_48374_a;
    }
}
