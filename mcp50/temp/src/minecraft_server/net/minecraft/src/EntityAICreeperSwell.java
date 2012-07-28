// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreeper, PathNavigate, EntitySenses, 
//            EntityLiving

public class EntityAICreeperSwell extends EntityAIBase
{

    EntityCreeper field_48244_a;
    EntityLiving field_48243_b;

    public EntityAICreeperSwell(EntityCreeper p_i1073_1_)
    {
        field_48244_a = p_i1073_1_;
        func_46087_a(1);
    }

    public boolean func_46090_a()
    {
        EntityLiving entityliving = field_48244_a.func_48331_as();
        return field_48244_a.func_21048_K() > 0 || entityliving != null && field_48244_a.func_102_b(entityliving) < 9D;
    }

    public void func_46088_e()
    {
        field_48244_a.func_48333_ak().func_48662_f();
        field_48243_b = field_48244_a.func_48331_as();
    }

    public void func_46085_d()
    {
        field_48243_b = null;
    }

    public void func_46089_b()
    {
        if(field_48243_b == null)
        {
            field_48244_a.func_21049_a(-1);
            return;
        }
        if(field_48244_a.func_102_b(field_48243_b) > 49D)
        {
            field_48244_a.func_21049_a(-1);
            return;
        }
        if(!field_48244_a.func_48318_al().func_48546_a(field_48243_b))
        {
            field_48244_a.func_21049_a(-1);
            return;
        } else
        {
            field_48244_a.func_21049_a(1);
            return;
        }
    }
}
