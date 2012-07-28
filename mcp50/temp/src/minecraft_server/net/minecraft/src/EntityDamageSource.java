// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            DamageSource, EntityPlayer, Entity, StatCollector

public class EntityDamageSource extends DamageSource
{

    protected Entity field_35101_n;

    public EntityDamageSource(String p_i180_1_, Entity p_i180_2_)
    {
        super(p_i180_1_);
        field_35101_n = p_i180_2_;
    }

    public Entity func_35080_a()
    {
        return field_35101_n;
    }

    public String func_35075_a(EntityPlayer p_35075_1_)
    {
        return StatCollector.func_25135_a((new StringBuilder()).append("death.").append(field_35095_m).toString(), new Object[] {
            p_35075_1_.field_409_aq, field_35101_n.func_35150_Y()
        });
    }
}
