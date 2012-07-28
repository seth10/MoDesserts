// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, DataWatcher, MathHelper, World, 
//            Block, BlockFire, NBTTagCompound, DamageSource

public class EntityEnderCrystal extends Entity
{

    public int field_41023_a;
    public int field_41022_b;

    public EntityEnderCrystal(World p_i149_1_)
    {
        super(p_i149_1_);
        field_41023_a = 0;
        field_329_e = true;
        func_113_a(2.0F, 2.0F);
        field_9076_H = field_298_E / 2.0F;
        field_41022_b = 5;
        field_41023_a = field_9064_W.nextInt(0x186a0);
    }

    protected boolean func_25017_l()
    {
        return false;
    }

    protected void func_21044_a()
    {
        field_21045_af.func_21153_a(8, Integer.valueOf(field_41022_b));
    }

    public void func_106_b_()
    {
        field_9092_m = field_322_l;
        field_9091_n = field_321_m;
        field_9090_o = field_320_n;
        field_41023_a++;
        field_21045_af.func_21155_b(8, Integer.valueOf(field_41022_b));
        int i = MathHelper.func_584_b(field_322_l);
        int j = MathHelper.func_584_b(field_321_m);
        int k = MathHelper.func_584_b(field_320_n);
        if(field_9093_l.func_444_a(i, j, k) != Block.field_599_as.field_573_bc)
        {
            field_9093_l.func_508_d(i, j, k, Block.field_599_as.field_573_bc);
        }
    }

    protected void func_97_a(NBTTagCompound nbttagcompound)
    {
    }

    protected void func_99_b(NBTTagCompound nbttagcompound)
    {
    }

    public boolean func_129_c_()
    {
        return true;
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        if(!field_304_B && !field_9093_l.field_792_x)
        {
            field_41022_b = 0;
            if(field_41022_b <= 0)
            {
                if(!field_9093_l.field_792_x)
                {
                    func_118_j();
                    field_9093_l.func_12013_a(null, field_322_l, field_321_m, field_320_n, 6F);
                } else
                {
                    func_118_j();
                }
            }
        }
        return true;
    }
}
