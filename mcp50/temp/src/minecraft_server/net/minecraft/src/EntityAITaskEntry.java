// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityAITasks

class EntityAITaskEntry
{

    public EntityAIBase field_46132_a;
    public int field_46130_b;
    final EntityAITasks field_46131_c; /* synthetic field */

    public EntityAITaskEntry(EntityAITasks p_i530_1_, int p_i530_2_, EntityAIBase p_i530_3_)
    {
        field_46131_c = p_i530_1_;
        super();
        field_46130_b = p_i530_2_;
        field_46132_a = p_i530_3_;
    }
}
