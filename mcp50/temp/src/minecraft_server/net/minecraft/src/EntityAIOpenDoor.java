// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIDoorInteract, EntityLiving, BlockDoor

public class EntityAIOpenDoor extends EntityAIDoorInteract
{

    boolean field_48196_i;
    int field_48195_j;

    public EntityAIOpenDoor(EntityLiving p_i1059_1_, boolean p_i1059_2_)
    {
        super(p_i1059_1_);
        field_48192_a = p_i1059_1_;
        field_48196_i = p_i1059_2_;
    }

    public boolean func_46092_g()
    {
        return field_48196_i && field_48195_j > 0 && super.func_46092_g();
    }

    public void func_46088_e()
    {
        field_48195_j = 20;
        field_48189_e.func_272_a(field_48192_a.field_9093_l, field_48190_b, field_48191_c, field_48188_d, true);
    }

    public void func_46085_d()
    {
        if(field_48196_i)
        {
            field_48189_e.func_272_a(field_48192_a.field_9093_l, field_48190_b, field_48191_c, field_48188_d, false);
        }
    }

    public void func_46089_b()
    {
        field_48195_j--;
        super.func_46089_b();
    }
}
