// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            TileEntity, World, EntityList, EntityLiving, 
//            AxisAlignedBB, NBTTagCompound, Packet132TileEntityData, Packet

public class TileEntityMobSpawner extends TileEntity
{

    public int field_493_e;
    private String field_492_f;
    public double field_491_g;
    public double field_490_h;

    public TileEntityMobSpawner()
    {
        field_493_e = -1;
        field_490_h = 0.0D;
        field_492_f = "Pig";
        field_493_e = 20;
    }

    public void func_21078_a(String p_21078_1_)
    {
        field_492_f = p_21078_1_;
    }

    public boolean func_195_a()
    {
        return field_479_a.func_456_a((double)field_478_b + 0.5D, (double)field_483_c + 0.5D, (double)field_482_d + 0.5D, 16D) != null;
    }

    public void func_184_b()
    {
        field_490_h = field_491_g;
        if(!func_195_a())
        {
            return;
        }
        double d = (float)field_478_b + field_479_a.field_803_m.nextFloat();
        double d1 = (float)field_483_c + field_479_a.field_803_m.nextFloat();
        double d2 = (float)field_482_d + field_479_a.field_803_m.nextFloat();
        field_479_a.func_514_a("smoke", d, d1, d2, 0.0D, 0.0D, 0.0D);
        field_479_a.func_514_a("flame", d, d1, d2, 0.0D, 0.0D, 0.0D);
        for(field_491_g += 1000F / ((float)field_493_e + 200F); field_491_g > 360D;)
        {
            field_491_g -= 360D;
            field_490_h -= 360D;
        }

        if(!field_479_a.field_792_x)
        {
            if(field_493_e == -1)
            {
                func_196_d();
            }
            if(field_493_e > 0)
            {
                field_493_e--;
                return;
            }
            byte byte0 = 4;
            for(int i = 0; i < byte0; i++)
            {
                EntityLiving entityliving = (EntityLiving)EntityList.func_567_a(field_492_f, field_479_a);
                if(entityliving == null)
                {
                    return;
                }
                int j = field_479_a.func_457_a(entityliving.getClass(), AxisAlignedBB.func_693_b(field_478_b, field_483_c, field_482_d, field_478_b + 1, field_483_c + 1, field_482_d + 1).func_708_b(8D, 4D, 8D)).size();
                if(j >= 6)
                {
                    func_196_d();
                    return;
                }
                if(entityliving == null)
                {
                    continue;
                }
                double d3 = (double)field_478_b + (field_479_a.field_803_m.nextDouble() - field_479_a.field_803_m.nextDouble()) * 4D;
                double d4 = (field_483_c + field_479_a.field_803_m.nextInt(3)) - 1;
                double d5 = (double)field_482_d + (field_479_a.field_803_m.nextDouble() - field_479_a.field_803_m.nextDouble()) * 4D;
                entityliving.func_107_c(d3, d4, d5, field_479_a.field_803_m.nextFloat() * 360F, 0.0F);
                if(entityliving.func_155_a())
                {
                    field_479_a.func_526_a(entityliving);
                    field_479_a.func_28097_e(2004, field_478_b, field_483_c, field_482_d, 0);
                    entityliving.func_156_D();
                    func_196_d();
                }
            }

        }
        super.func_184_b();
    }

    private void func_196_d()
    {
        field_493_e = 200 + field_479_a.field_803_m.nextInt(600);
    }

    public void func_186_a(NBTTagCompound p_186_1_)
    {
        super.func_186_a(p_186_1_);
        field_492_f = p_186_1_.func_401_h("EntityId");
        field_493_e = p_186_1_.func_406_c("Delay");
    }

    public void func_188_b(NBTTagCompound p_188_1_)
    {
        super.func_188_b(p_188_1_);
        p_188_1_.func_403_a("EntityId", field_492_f);
        p_188_1_.func_394_a("Delay", (short)field_493_e);
    }

    public Packet func_20070_f()
    {
        int i = EntityList.func_48582_a(field_492_f);
        return new Packet132TileEntityData(field_478_b, field_483_c, field_482_d, 1, i);
    }
}
