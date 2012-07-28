// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityCreature, DataWatcher, NBTTagCompound, World

public abstract class EntityAgeable extends EntityCreature
{

    public EntityAgeable(World p_i1085_1_)
    {
        super(p_i1085_1_);
    }

    protected void func_21044_a()
    {
        super.func_21044_a();
        field_21045_af.func_21153_a(12, new Integer(0));
    }

    public int func_48351_J()
    {
        return field_21045_af.func_25075_b(12);
    }

    public void func_48350_c(int p_48350_1_)
    {
        field_21045_af.func_21155_b(12, Integer.valueOf(p_48350_1_));
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_405_a("Age", func_48351_J());
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        func_48350_c(p_99_1_.func_395_d("Age"));
    }

    public void func_153_y()
    {
        super.func_153_y();
        int i = func_48351_J();
        if(i < 0)
        {
            i++;
            func_48350_c(i);
        } else
        if(i > 0)
        {
            i--;
            func_48350_c(i);
        }
    }

    public boolean func_40104_l()
    {
        return func_48351_J() < 0;
    }
}
