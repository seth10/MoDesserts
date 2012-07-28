// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Vec3D, EntityCreature, MathHelper, ChunkCoordinates

public class RandomPositionGenerator
{

    private static Vec3D field_48397_a = Vec3D.func_760_a(0.0D, 0.0D, 0.0D);

    public RandomPositionGenerator()
    {
    }

    public static Vec3D func_48396_a(EntityCreature p_48396_0_, int p_48396_1_, int p_48396_2_)
    {
        return func_48393_c(p_48396_0_, p_48396_1_, p_48396_2_, null);
    }

    public static Vec3D func_48395_a(EntityCreature p_48395_0_, int p_48395_1_, int p_48395_2_, Vec3D p_48395_3_)
    {
        field_48397_a.field_1055_a = p_48395_3_.field_1055_a - p_48395_0_.field_322_l;
        field_48397_a.field_1054_b = p_48395_3_.field_1054_b - p_48395_0_.field_321_m;
        field_48397_a.field_1058_c = p_48395_3_.field_1058_c - p_48395_0_.field_320_n;
        return func_48393_c(p_48395_0_, p_48395_1_, p_48395_2_, field_48397_a);
    }

    public static Vec3D func_48394_b(EntityCreature p_48394_0_, int p_48394_1_, int p_48394_2_, Vec3D p_48394_3_)
    {
        field_48397_a.field_1055_a = p_48394_0_.field_322_l - p_48394_3_.field_1055_a;
        field_48397_a.field_1054_b = p_48394_0_.field_321_m - p_48394_3_.field_1054_b;
        field_48397_a.field_1058_c = p_48394_0_.field_320_n - p_48394_3_.field_1058_c;
        return func_48393_c(p_48394_0_, p_48394_1_, p_48394_2_, field_48397_a);
    }

    private static Vec3D func_48393_c(EntityCreature p_48393_0_, int p_48393_1_, int p_48393_2_, Vec3D p_48393_3_)
    {
        Random random = p_48393_0_.func_46019_ai();
        boolean flag = false;
        int i = 0;
        int j = 0;
        int k = 0;
        float f = -99999F;
        boolean flag1;
        if(p_48393_0_.func_48329_ax())
        {
            double d = p_48393_0_.func_48323_au().func_27127_a(MathHelper.func_584_b(p_48393_0_.field_322_l), MathHelper.func_584_b(p_48393_0_.field_321_m), MathHelper.func_584_b(p_48393_0_.field_320_n)) + 4D;
            flag1 = d < (double)(p_48393_0_.func_48330_av() + (float)p_48393_1_);
        } else
        {
            flag1 = false;
        }
        for(int l = 0; l < 10; l++)
        {
            int i1 = random.nextInt(2 * p_48393_1_) - p_48393_1_;
            int j1 = random.nextInt(2 * p_48393_2_) - p_48393_2_;
            int k1 = random.nextInt(2 * p_48393_1_) - p_48393_1_;
            if(p_48393_3_ != null && (double)i1 * p_48393_3_.field_1055_a + (double)k1 * p_48393_3_.field_1058_c < 0.0D)
            {
                continue;
            }
            i1 += MathHelper.func_584_b(p_48393_0_.field_322_l);
            j1 += MathHelper.func_584_b(p_48393_0_.field_321_m);
            k1 += MathHelper.func_584_b(p_48393_0_.field_320_n);
            if(flag1 && !p_48393_0_.func_48328_e(i1, j1, k1))
            {
                continue;
            }
            float f1 = p_48393_0_.func_159_a(i1, j1, k1);
            if(f1 > f)
            {
                f = f1;
                i = i1;
                j = j1;
                k = k1;
                flag = true;
            }
        }

        if(flag)
        {
            return Vec3D.func_768_b(i, j, k);
        } else
        {
            return null;
        }
    }

}
