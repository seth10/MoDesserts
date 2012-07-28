// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityCreature, IAnimals, World, NBTTagCompound, 
//            EntityPlayer

public abstract class EntityWaterMob extends EntityCreature
    implements IAnimals
{

    public EntityWaterMob(World p_i20_1_)
    {
        super(p_i20_1_);
    }

    public boolean func_21046_d_()
    {
        return true;
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
    }

    public boolean func_155_a()
    {
        return field_9093_l.func_522_a(field_312_v);
    }

    public int func_146_b()
    {
        return 120;
    }

    protected boolean func_25020_s()
    {
        return true;
    }

    protected int func_36000_a(EntityPlayer p_36000_1_)
    {
        return 1 + field_9093_l.field_803_m.nextInt(3);
    }
}
