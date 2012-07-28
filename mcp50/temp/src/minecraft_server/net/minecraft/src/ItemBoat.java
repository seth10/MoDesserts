// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, Vec3D, MathHelper, 
//            World, AxisAlignedBB, Entity, MovingObjectPosition, 
//            EnumMovingObjectType, Block, EntityBoat, PlayerCapabilities, 
//            ItemStack

public class ItemBoat extends Item
{

    public ItemBoat(int p_i507_1_)
    {
        super(p_i507_1_);
        field_233_aT = 1;
    }

    public ItemStack func_6152_a(ItemStack p_6152_1_, World p_6152_2_, EntityPlayer p_6152_3_)
    {
        float f = 1.0F;
        float f1 = p_6152_3_.field_9088_y + (p_6152_3_.field_315_s - p_6152_3_.field_9088_y) * f;
        float f2 = p_6152_3_.field_9089_x + (p_6152_3_.field_316_r - p_6152_3_.field_9089_x) * f;
        double d = p_6152_3_.field_9092_m + (p_6152_3_.field_322_l - p_6152_3_.field_9092_m) * (double)f;
        double d1 = (p_6152_3_.field_9091_n + (p_6152_3_.field_321_m - p_6152_3_.field_9091_n) * (double)f + 1.6200000000000001D) - (double)p_6152_3_.field_9076_H;
        double d2 = p_6152_3_.field_9090_o + (p_6152_3_.field_320_n - p_6152_3_.field_9090_o) * (double)f;
        Vec3D vec3d = Vec3D.func_768_b(d, d1, d2);
        float f3 = MathHelper.func_582_b(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.func_585_a(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.func_582_b(-f1 * 0.01745329F);
        float f6 = MathHelper.func_585_a(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f8 = f6;
        float f9 = f3 * f5;
        double d3 = 5D;
        Vec3D vec3d1 = vec3d.func_757_c((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
        MovingObjectPosition movingobjectposition = p_6152_2_.func_505_a(vec3d, vec3d1, true);
        if(movingobjectposition == null)
        {
            return p_6152_1_;
        }
        Vec3D vec3d2 = p_6152_3_.func_141_d(f);
        boolean flag = false;
        float f10 = 1.0F;
        List list = p_6152_2_.func_450_b(p_6152_3_, p_6152_3_.field_312_v.func_700_a(vec3d2.field_1055_a * d3, vec3d2.field_1054_b * d3, vec3d2.field_1058_c * d3).func_708_b(f10, f10, f10));
        for(int l = 0; l < list.size(); l++)
        {
            Entity entity = (Entity)list.get(l);
            if(!entity.func_129_c_())
            {
                continue;
            }
            float f11 = entity.func_41010_j_();
            AxisAlignedBB axisalignedbb = entity.field_312_v.func_708_b(f11, f11, f11);
            if(axisalignedbb.func_28183_a(vec3d))
            {
                flag = true;
            }
        }

        if(flag)
        {
            return p_6152_1_;
        }
        if(movingobjectposition.field_927_a == EnumMovingObjectType.TILE)
        {
            int i = movingobjectposition.field_926_b;
            int j = movingobjectposition.field_932_c;
            int k = movingobjectposition.field_931_d;
            if(!p_6152_2_.field_792_x)
            {
                if(p_6152_2_.func_444_a(i, j, k) == Block.field_625_aT.field_573_bc)
                {
                    j--;
                }
                p_6152_2_.func_526_a(new EntityBoat(p_6152_2_, (float)i + 0.5F, (float)j + 1.0F, (float)k + 0.5F));
            }
            if(!p_6152_3_.field_35214_K.field_35657_d)
            {
                p_6152_1_.field_853_a--;
            }
        }
        return p_6152_1_;
    }
}
