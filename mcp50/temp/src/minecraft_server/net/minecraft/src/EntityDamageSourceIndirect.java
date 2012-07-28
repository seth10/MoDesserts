// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityDamageSource, EntityPlayer, Entity, StatCollector

public class EntityDamageSourceIndirect extends EntityDamageSource
{

    private Entity field_35102_n;

    public EntityDamageSourceIndirect(String p_i193_1_, Entity p_i193_2_, Entity p_i193_3_)
    {
        super(p_i193_1_, p_i193_2_);
        field_35102_n = p_i193_3_;
    }

    public Entity func_35079_e()
    {
        return field_35101_n;
    }

    public Entity func_35080_a()
    {
        return field_35102_n;
    }

    public String func_35075_a(EntityPlayer p_35075_1_)
    {
        return StatCollector.func_25135_a((new StringBuilder()).append("death.").append(field_35095_m).toString(), new Object[] {
            p_35075_1_.field_409_aq, field_35102_n.func_35150_Y()
        });
    }
}
