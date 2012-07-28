// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, EntityDragonBase, NBTTagCompound, DamageSource

public class EntityDragonPart extends Entity
{

    public final EntityDragonBase field_40039_a;
    public final String field_40038_b;

    public EntityDragonPart(EntityDragonBase p_i104_1_, String p_i104_2_, float p_i104_3_, float p_i104_4_)
    {
        super(p_i104_1_.field_9093_l);
        func_113_a(p_i104_3_, p_i104_4_);
        field_40039_a = p_i104_1_;
        field_40038_b = p_i104_2_;
    }

    protected void func_21044_a()
    {
    }

    protected void func_99_b(NBTTagCompound nbttagcompound)
    {
    }

    protected void func_97_a(NBTTagCompound nbttagcompound)
    {
    }

    public boolean func_129_c_()
    {
        return true;
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        return field_40039_a.func_40136_a(this, p_121_1_, p_121_2_);
    }

    public boolean func_41012_c_(Entity p_41012_1_)
    {
        return this == p_41012_1_ || field_40039_a == p_41012_1_;
    }
}
