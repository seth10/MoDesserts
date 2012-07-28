// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, EntityPlayer, MathHelper, InventoryPlayer, 
//            ItemStack, NetHandler

public class Packet20NamedEntitySpawn extends Packet
{

    public int field_143_a;
    public String field_142_b;
    public int field_149_c;
    public int field_148_d;
    public int field_147_e;
    public byte field_146_f;
    public byte field_145_g;
    public int field_144_h;

    public Packet20NamedEntitySpawn()
    {
    }

    public Packet20NamedEntitySpawn(EntityPlayer p_i293_1_)
    {
        field_143_a = p_i293_1_.field_331_c;
        field_142_b = p_i293_1_.field_409_aq;
        field_149_c = MathHelper.func_584_b(p_i293_1_.field_322_l * 32D);
        field_148_d = MathHelper.func_584_b(p_i293_1_.field_321_m * 32D);
        field_147_e = MathHelper.func_584_b(p_i293_1_.field_320_n * 32D);
        field_146_f = (byte)(int)((p_i293_1_.field_316_r * 256F) / 360F);
        field_145_g = (byte)(int)((p_i293_1_.field_315_s * 256F) / 360F);
        ItemStack itemstack = p_i293_1_.field_416_aj.func_213_b();
        field_144_h = itemstack != null ? itemstack.field_855_c : 0;
    }

    public void func_70_a(DataInputStream p_70_1_)
        throws IOException
    {
        field_143_a = p_70_1_.readInt();
        field_142_b = func_27037_a(p_70_1_, 16);
        field_149_c = p_70_1_.readInt();
        field_148_d = p_70_1_.readInt();
        field_147_e = p_70_1_.readInt();
        field_146_f = p_70_1_.readByte();
        field_145_g = p_70_1_.readByte();
        field_144_h = p_70_1_.readShort();
    }

    public void func_68_a(DataOutputStream p_68_1_)
        throws IOException
    {
        p_68_1_.writeInt(field_143_a);
        func_27038_a(field_142_b, p_68_1_);
        p_68_1_.writeInt(field_149_c);
        p_68_1_.writeInt(field_148_d);
        p_68_1_.writeInt(field_147_e);
        p_68_1_.writeByte(field_146_f);
        p_68_1_.writeByte(field_145_g);
        p_68_1_.writeShort(field_144_h);
    }

    public void func_72_a(NetHandler p_72_1_)
    {
        p_72_1_.func_4002_a(this);
    }

    public int func_71_a()
    {
        return 28;
    }
}
