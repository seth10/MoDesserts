// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, NBTTagCompound

public class TileEntityRecordPlayer extends TileEntity
{

    public int field_28009_a;

    public TileEntityRecordPlayer()
    {
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        super.func_186_a(p_186_1_);
        field_28009_a = p_186_1_.func_395_d("Record");
    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        super.func_188_b(p_188_1_);
        if(field_28009_a > 0)
        {
            p_188_1_.func_405_a("Record", field_28009_a);
        }
    }
}
