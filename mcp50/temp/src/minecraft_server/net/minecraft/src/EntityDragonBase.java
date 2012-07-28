// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving, World, EntityDragonPart, DamageSource

public class EntityDragonBase extends EntityLiving
{

    protected int field_40138_s;

    public EntityDragonBase(World p_i517_1_)
    {
        super(p_i517_1_);
        field_40138_s = 100;
    }

    public int func_40095_c()
    {
        return field_40138_s;
    }

    public boolean func_40136_a(EntityDragonPart p_40136_1_, DamageSource p_40136_2_, int p_40136_3_)
    {
        return func_121_a(p_40136_2_, p_40136_3_);
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        return false;
    }

    protected boolean func_40137_e(DamageSource p_40137_1_, int p_40137_2_)
    {
        return super.func_121_a(p_40137_1_, p_40137_2_);
    }
}
