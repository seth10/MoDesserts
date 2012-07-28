// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityMob, World

public class EntityGiantZombie extends EntityMob
{

    public EntityGiantZombie(World p_i328_1_)
    {
        super(p_i328_1_);
        field_9119_aG = "/mob/zombie.png";
        field_9126_bt = 0.5F;
        field_404_af = 50;
        field_9076_H *= 6F;
        func_113_a(field_300_D * 6F, field_298_E * 6F);
    }

    public int func_40095_c()
    {
        return 100;
    }

    public float func_159_a(int p_159_1_, int p_159_2_, int p_159_3_)
    {
        return field_9093_l.func_455_j(p_159_1_, p_159_2_, p_159_3_) - 0.5F;
    }
}
