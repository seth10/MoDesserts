// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, PathNavigate

public class EntityAIRestrictSun extends EntityAIBase
{

    private EntityCreature field_48239_a;

    public EntityAIRestrictSun(EntityCreature p_i1086_1_)
    {
        field_48239_a = p_i1086_1_;
    }

    public boolean func_46090_a()
    {
        return field_48239_a.field_9093_l.func_453_a();
    }

    public void func_46088_e()
    {
        field_48239_a.func_48333_ak().func_48669_d(true);
    }

    public void func_46085_d()
    {
        field_48239_a.func_48333_ak().func_48669_d(false);
    }
}
