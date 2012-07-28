// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityTameable, EntityLiving, PathNavigate

public class EntityAISit extends EntityAIBase
{

    private EntityTameable field_48212_a;
    private boolean field_48211_b;

    public EntityAISit(EntityTameable p_i1043_1_)
    {
        field_48211_b = false;
        field_48212_a = p_i1043_1_;
        func_46087_a(5);
    }

    public boolean func_46090_a()
    {
        if(!field_48212_a.func_48373_u_())
        {
            return false;
        }
        if(field_48212_a.func_27011_Z())
        {
            return false;
        }
        if(!field_48212_a.field_9086_A)
        {
            return false;
        }
        EntityLiving entityliving = field_48212_a.func_48368_w_();
        if(entityliving == null)
        {
            return true;
        }
        if(field_48212_a.func_102_b(entityliving) < 144D && entityliving.func_46020_aj() != null)
        {
            return false;
        } else
        {
            return field_48211_b;
        }
    }

    public void func_46088_e()
    {
        field_48212_a.func_48333_ak().func_48662_f();
        field_48212_a.func_48369_c(true);
    }

    public void func_46085_d()
    {
        field_48212_a.func_48369_c(false);
    }

    public void func_48210_a(boolean p_48210_1_)
    {
        field_48211_b = p_48210_1_;
    }
}
