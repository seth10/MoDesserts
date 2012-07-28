// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, NBTTagCompound, World, Material

public class TileEntityNote extends TileEntity
{

    public byte field_21077_e;
    public boolean field_21076_f;

    public TileEntityNote()
    {
        field_21077_e = 0;
        field_21076_f = false;
    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        super.func_188_b(p_188_1_);
        p_188_1_.func_409_a("note", field_21077_e);
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        super.func_186_a(p_186_1_);
        field_21077_e = p_186_1_.func_408_b("note");
        if(field_21077_e < 0)
        {
            field_21077_e = 0;
        }
        if(field_21077_e > 24)
        {
            field_21077_e = 24;
        }
    }

    public void func_21075_a()
    {
        field_21077_e = (byte)((field_21077_e + 1) % 25);
        func_183_c();
    }

    public void func_21074_a(World p_21074_1_, int p_21074_2_, int p_21074_3_, int p_21074_4_)
    {
        if(p_21074_1_.func_443_c(p_21074_2_, p_21074_3_ + 1, p_21074_4_) != Material.field_526_a)
        {
            return;
        }
        Material material = p_21074_1_.func_443_c(p_21074_2_, p_21074_3_ - 1, p_21074_4_);
        byte byte0 = 0;
        if(material == Material.field_523_d)
        {
            byte0 = 1;
        }
        if(material == Material.field_514_m)
        {
            byte0 = 2;
        }
        if(material == Material.field_4216_o)
        {
            byte0 = 3;
        }
        if(material == Material.field_524_c)
        {
            byte0 = 4;
        }
        p_21074_1_.func_21117_c(p_21074_2_, p_21074_3_, p_21074_4_, byte0, field_21077_e);
    }
}
