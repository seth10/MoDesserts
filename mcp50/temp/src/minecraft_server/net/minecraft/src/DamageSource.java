// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityDamageSource, EntityDamageSourceIndirect, EntityPlayer, StatCollector, 
//            EntityLiving, EntityArrow, Entity, EntityFireball

public class DamageSource
{

    public static DamageSource field_35091_a = (new DamageSource("inFire")).func_40276_j();
    public static DamageSource field_35089_b = (new DamageSource("onFire")).func_35078_f().func_40276_j();
    public static DamageSource field_35090_c = (new DamageSource("lava")).func_40276_j();
    public static DamageSource field_35087_d = (new DamageSource("inWall")).func_35078_f();
    public static DamageSource field_35088_e = (new DamageSource("drown")).func_35078_f();
    public static DamageSource field_35085_f = (new DamageSource("starve")).func_35078_f();
    public static DamageSource field_35086_g = new DamageSource("cactus");
    public static DamageSource field_35098_h = (new DamageSource("fall")).func_35078_f();
    public static DamageSource field_35099_i = (new DamageSource("outOfWorld")).func_35078_f().func_35084_g();
    public static DamageSource field_35096_j = (new DamageSource("generic")).func_35078_f();
    public static DamageSource field_35097_k = new DamageSource("explosion");
    public static DamageSource field_35094_l = (new DamageSource("magic")).func_35078_f();
    private boolean field_35092_n;
    private boolean field_35093_o;
    private float field_35100_p;
    private boolean field_40278_q;
    private boolean field_40277_r;
    public String field_35095_m;

    public static DamageSource func_35072_a(EntityLiving p_35072_0_)
    {
        return new EntityDamageSource("mob", p_35072_0_);
    }

    public static DamageSource func_35076_b(EntityPlayer p_35076_0_)
    {
        return new EntityDamageSource("player", p_35076_0_);
    }

    public static DamageSource func_35073_a(EntityArrow p_35073_0_, Entity p_35073_1_)
    {
        return (new EntityDamageSourceIndirect("arrow", p_35073_0_, p_35073_1_)).func_40273_c();
    }

    public static DamageSource func_35082_a(EntityFireball p_35082_0_, Entity p_35082_1_)
    {
        return (new EntityDamageSourceIndirect("fireball", p_35082_0_, p_35082_1_)).func_40276_j().func_40273_c();
    }

    public static DamageSource func_35081_a(Entity p_35081_0_, Entity p_35081_1_)
    {
        return (new EntityDamageSourceIndirect("thrown", p_35081_0_, p_35081_1_)).func_40273_c();
    }

    public static DamageSource func_40271_b(Entity p_40271_0_, Entity p_40271_1_)
    {
        return (new EntityDamageSourceIndirect("indirectMagic", p_40271_0_, p_40271_1_)).func_35078_f();
    }

    public boolean func_40275_b()
    {
        return field_40277_r;
    }

    public DamageSource func_40273_c()
    {
        field_40277_r = true;
        return this;
    }

    public boolean func_35083_b()
    {
        return field_35092_n;
    }

    public float func_35074_c()
    {
        return field_35100_p;
    }

    public boolean func_35077_d()
    {
        return field_35093_o;
    }

    protected DamageSource(String p_i388_1_)
    {
        field_35092_n = false;
        field_35093_o = false;
        field_35100_p = 0.3F;
        field_35095_m = p_i388_1_;
    }

    public Entity func_35079_e()
    {
        return func_35080_a();
    }

    public Entity func_35080_a()
    {
        return null;
    }

    protected DamageSource func_35078_f()
    {
        field_35092_n = true;
        field_35100_p = 0.0F;
        return this;
    }

    protected DamageSource func_35084_g()
    {
        field_35093_o = true;
        return this;
    }

    protected DamageSource func_40276_j()
    {
        field_40278_q = true;
        return this;
    }

    public String func_35075_a(EntityPlayer p_35075_1_)
    {
        return StatCollector.func_25135_a((new StringBuilder()).append("death.").append(field_35095_m).toString(), new Object[] {
            p_35075_1_.field_409_aq
        });
    }

    public boolean func_40272_k()
    {
        return field_40278_q;
    }

    public String func_40274_l()
    {
        return field_35095_m;
    }

}
