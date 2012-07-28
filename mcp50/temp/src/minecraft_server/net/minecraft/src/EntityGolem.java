// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityCreature, IAnimals, World, NBTTagCompound

public abstract class EntityGolem extends EntityCreature
    implements IAnimals
{

    public EntityGolem(World p_i1089_1_)
    {
        super(p_i1089_1_);
    }

    protected void func_114_a(float f)
    {
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
    }

    protected String func_6097_d()
    {
        return "none";
    }

    protected String func_6100_e()
    {
        return "none";
    }

    protected String func_6098_f()
    {
        return "none";
    }

    public int func_146_b()
    {
        return 120;
    }

    protected boolean func_25020_s()
    {
        return false;
    }
}
