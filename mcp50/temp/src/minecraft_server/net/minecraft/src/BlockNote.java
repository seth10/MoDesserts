// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, World, TileEntityNote, 
//            EntityPlayer, TileEntity

public class BlockNote extends BlockContainer
{

    public BlockNote(int p_i373_1_)
    {
        super(p_i373_1_, 74, Material.field_524_c);
    }

    public int func_241_a(int p_241_1_)
    {
        return field_575_bb;
    }

    public void func_234_b(World p_234_1_, int p_234_2_, int p_234_3_, int p_234_4_, int p_234_5_)
    {
        if(p_234_5_ > 0)
        {
            boolean flag = p_234_1_.func_474_n(p_234_2_, p_234_3_, p_234_4_);
            TileEntityNote tileentitynote = (TileEntityNote)p_234_1_.func_451_k(p_234_2_, p_234_3_, p_234_4_);
            if(tileentitynote != null && tileentitynote.field_21076_f != flag)
            {
                if(flag)
                {
                    tileentitynote.func_21074_a(p_234_1_, p_234_2_, p_234_3_, p_234_4_);
                }
                tileentitynote.field_21076_f = flag;
            }
        }
    }

    public boolean func_246_a(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_, EntityPlayer p_246_5_)
    {
        if(p_246_1_.field_792_x)
        {
            return true;
        }
        TileEntityNote tileentitynote = (TileEntityNote)p_246_1_.func_451_k(p_246_2_, p_246_3_, p_246_4_);
        if(tileentitynote != null)
        {
            tileentitynote.func_21075_a();
            tileentitynote.func_21074_a(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
        }
        return true;
    }

    public void func_235_b(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_, EntityPlayer p_235_5_)
    {
        if(p_235_1_.field_792_x)
        {
            return;
        }
        TileEntityNote tileentitynote = (TileEntityNote)p_235_1_.func_451_k(p_235_2_, p_235_3_, p_235_4_);
        if(tileentitynote != null)
        {
            tileentitynote.func_21074_a(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        }
    }

    public TileEntity func_294_a_()
    {
        return new TileEntityNote();
    }

    public void func_21024_a(World p_21024_1_, int p_21024_2_, int p_21024_3_, int p_21024_4_, int p_21024_5_, int p_21024_6_)
    {
        float f = (float)Math.pow(2D, (double)(p_21024_6_ - 12) / 12D);
        String s = "harp";
        if(p_21024_5_ == 1)
        {
            s = "bd";
        }
        if(p_21024_5_ == 2)
        {
            s = "snare";
        }
        if(p_21024_5_ == 3)
        {
            s = "hat";
        }
        if(p_21024_5_ == 4)
        {
            s = "bassattack";
        }
        p_21024_1_.func_502_a((double)p_21024_2_ + 0.5D, (double)p_21024_3_ + 0.5D, (double)p_21024_4_ + 0.5D, (new StringBuilder()).append("note.").append(s).toString(), 3F, f);
        p_21024_1_.func_514_a("note", (double)p_21024_2_ + 0.5D, (double)p_21024_3_ + 1.2D, (double)p_21024_4_ + 0.5D, (double)p_21024_6_ / 24D, 0.0D, 0.0D);
    }
}
