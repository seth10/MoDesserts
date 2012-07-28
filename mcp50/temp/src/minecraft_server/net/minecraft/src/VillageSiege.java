// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            World, EntityPlayer, VillageCollection, Village, 
//            ChunkCoordinates, MathHelper, EntityZombie, Vec3D, 
//            EntityLiving, EnumCreatureType, SpawnerAnimals

public class VillageSiege
{

    private World field_48510_a;
    private boolean field_48508_b;
    private int field_48509_c;
    private int field_48506_d;
    private int field_48507_e;
    private Village field_48504_f;
    private int field_48505_g;
    private int field_48511_h;
    private int field_48512_i;

    public VillageSiege(World p_i1061_1_)
    {
        field_48508_b = false;
        field_48509_c = -1;
        field_48510_a = p_i1061_1_;
    }

    public void func_48500_a()
    {
        boolean flag = false;
        if(flag)
        {
            if(field_48509_c == 2)
            {
                field_48506_d = 100;
                return;
            }
        } else
        {
            if(field_48510_a.func_453_a())
            {
                field_48509_c = 0;
                return;
            }
            if(field_48509_c == 2)
            {
                return;
            }
            if(field_48509_c == 0)
            {
                float f = field_48510_a.func_477_b(0.0F);
                if((double)f < 0.5D || (double)f > 0.501D)
                {
                    return;
                }
                field_48509_c = field_48510_a.field_803_m.nextInt(10) != 0 ? 2 : 1;
                field_48508_b = false;
                if(field_48509_c == 2)
                {
                    return;
                }
            }
        }
        if(!field_48508_b)
        {
            if(func_48502_b())
            {
                field_48508_b = true;
            } else
            {
                return;
            }
        }
        if(field_48507_e > 0)
        {
            field_48507_e--;
            return;
        }
        field_48507_e = 2;
        if(field_48506_d > 0)
        {
            func_48503_c();
            field_48506_d--;
        } else
        {
            field_48509_c = 2;
        }
    }

    private boolean func_48502_b()
    {
        List list = field_48510_a.field_805_k;
        for(Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            EntityPlayer entityplayer = (EntityPlayer)iterator.next();
            field_48504_f = field_48510_a.field_48096_A.func_48632_a((int)entityplayer.field_322_l, (int)entityplayer.field_321_m, (int)entityplayer.field_320_n, 1);
            if(field_48504_f != null && field_48504_f.func_48525_c() >= 10 && field_48504_f.func_48520_d() >= 20 && field_48504_f.func_48521_e() >= 20)
            {
                ChunkCoordinates chunkcoordinates = field_48504_f.func_48526_a();
                float f = field_48504_f.func_48527_b();
                boolean flag = false;
                int i = 0;
                do
                {
                    if(i >= 10)
                    {
                        break;
                    }
                    field_48505_g = chunkcoordinates.field_22216_a + (int)((double)(MathHelper.func_582_b(field_48510_a.field_803_m.nextFloat() * 3.141593F * 2.0F) * f) * 0.90000000000000002D);
                    field_48511_h = chunkcoordinates.field_529_a;
                    field_48512_i = chunkcoordinates.field_528_b + (int)((double)(MathHelper.func_585_a(field_48510_a.field_803_m.nextFloat() * 3.141593F * 2.0F) * f) * 0.90000000000000002D);
                    flag = false;
                    Iterator iterator1 = field_48510_a.field_48096_A.func_48628_b().iterator();
                    do
                    {
                        if(!iterator1.hasNext())
                        {
                            break;
                        }
                        Village village = (Village)iterator1.next();
                        if(village == field_48504_f || !village.func_48528_a(field_48505_g, field_48511_h, field_48512_i))
                        {
                            continue;
                        }
                        flag = true;
                        break;
                    } while(true);
                    if(!flag)
                    {
                        break;
                    }
                    i++;
                } while(true);
                if(flag)
                {
                    return false;
                }
                Vec3D vec3d = func_48501_a(field_48505_g, field_48511_h, field_48512_i);
                if(vec3d != null)
                {
                    field_48507_e = 0;
                    field_48506_d = 20;
                    return true;
                }
            }
        }

        return false;
    }

    private boolean func_48503_c()
    {
        Vec3D vec3d = func_48501_a(field_48505_g, field_48511_h, field_48512_i);
        if(vec3d == null)
        {
            return false;
        }
        EntityZombie entityzombie;
        try
        {
            entityzombie = new EntityZombie(field_48510_a);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
        entityzombie.func_107_c(vec3d.field_1055_a, vec3d.field_1054_b, vec3d.field_1058_c, field_48510_a.field_803_m.nextFloat() * 360F, 0.0F);
        field_48510_a.func_526_a(entityzombie);
        ChunkCoordinates chunkcoordinates = field_48504_f.func_48526_a();
        entityzombie.func_48317_b(chunkcoordinates.field_22216_a, chunkcoordinates.field_529_a, chunkcoordinates.field_528_b, field_48504_f.func_48527_b());
        return true;
    }

    private Vec3D func_48501_a(int p_48501_1_, int p_48501_2_, int p_48501_3_)
    {
        for(int i = 0; i < 10; i++)
        {
            int j = (p_48501_1_ + field_48510_a.field_803_m.nextInt(16)) - 8;
            int k = (p_48501_2_ + field_48510_a.field_803_m.nextInt(6)) - 3;
            int l = (p_48501_3_ + field_48510_a.field_803_m.nextInt(16)) - 8;
            if(field_48504_f.func_48528_a(j, k, l) && SpawnerAnimals.func_21167_a(EnumCreatureType.monster, field_48510_a, j, k, l))
            {
                return Vec3D.func_768_b(j, k, l);
            }
        }

        return null;
    }
}
