// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.lang.reflect.Constructor;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            World, Chunk, ChunkPosition, EntityPlayer, 
//            MathHelper, ChunkCoordIntPair, EnumCreatureType, ChunkCoordinates, 
//            SpawnListEntry, EntityLiving, Material, Block, 
//            EntitySpider, EntitySkeleton, EntitySheep, EntityOcelot, 
//            BiomeGenBase, WeightedRandom, EntityZombie

public final class SpawnerAnimals
{

    private static HashMap field_4311_a = new HashMap();
    protected static final Class field_22213_a[];

    public SpawnerAnimals()
    {
    }

    protected static ChunkPosition func_4112_a(World p_4112_0_, int p_4112_1_, int p_4112_2_)
    {
        Chunk chunk = p_4112_0_.func_525_b(p_4112_1_, p_4112_2_);
        int i = p_4112_1_ * 16 + p_4112_0_.field_803_m.nextInt(16);
        int j = p_4112_0_.field_803_m.nextInt(chunk != null ? Math.max(128, chunk.func_48561_g()) : 128);
        int k = p_4112_2_ * 16 + p_4112_0_.field_803_m.nextInt(16);
        return new ChunkPosition(i, j, k);
    }

    public static final int func_4111_a(World p_4111_0_, boolean p_4111_1_, boolean p_4111_2_)
    {
        int j;
        ChunkCoordinates chunkcoordinates;
        EnumCreatureType aenumcreaturetype[];
        int i1;
        int j1;
        if(!p_4111_1_ && !p_4111_2_)
        {
            return 0;
        }
        field_4311_a.clear();
        for(int i = 0; i < p_4111_0_.field_805_k.size(); i++)
        {
            EntityPlayer entityplayer = (EntityPlayer)p_4111_0_.field_805_k.get(i);
            int k = MathHelper.func_584_b(entityplayer.field_322_l / 16D);
            int l = MathHelper.func_584_b(entityplayer.field_320_n / 16D);
            byte byte0 = 8;
            for(int k1 = -byte0; k1 <= byte0; k1++)
            {
                for(int l1 = -byte0; l1 <= byte0; l1++)
                {
                    boolean flag = k1 == -byte0 || k1 == byte0 || l1 == -byte0 || l1 == byte0;
                    ChunkCoordIntPair chunkcoordintpair1 = new ChunkCoordIntPair(k1 + k, l1 + l);
                    if(!flag)
                    {
                        field_4311_a.put(chunkcoordintpair1, Boolean.valueOf(false));
                        continue;
                    }
                    if(!field_4311_a.containsKey(chunkcoordintpair1))
                    {
                        field_4311_a.put(chunkcoordintpair1, Boolean.valueOf(true));
                    }
                }

            }

        }

        j = 0;
        chunkcoordinates = p_4111_0_.func_22078_l();
        aenumcreaturetype = EnumCreatureType.values();
        i1 = aenumcreaturetype.length;
        j1 = 0;
_L10:
        if(j1 >= i1) goto _L2; else goto _L1
_L1:
        EnumCreatureType enumcreaturetype;
        Iterator iterator;
        enumcreaturetype = aenumcreaturetype[j1];
        if(enumcreaturetype.func_21103_d() && !p_4111_2_ || !enumcreaturetype.func_21103_d() && !p_4111_1_ || p_4111_0_.func_487_a(enumcreaturetype.func_21105_a()) > (enumcreaturetype.func_21104_b() * field_4311_a.size()) / 256)
        {
            continue; /* Loop/switch isn't completed */
        }
        iterator = field_4311_a.keySet().iterator();
_L4:
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        do
        {
            ChunkCoordIntPair chunkcoordintpair;
            do
            {
                if(!iterator.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                chunkcoordintpair = (ChunkCoordIntPair)iterator.next();
            } while(((Boolean)field_4311_a.get(chunkcoordintpair)).booleanValue());
            ChunkPosition chunkposition = func_4112_a(p_4111_0_, chunkcoordintpair.field_152_a, chunkcoordintpair.field_151_b);
            i2 = chunkposition.field_846_a;
            j2 = chunkposition.field_845_b;
            k2 = chunkposition.field_847_c;
        } while(p_4111_0_.func_445_d(i2, j2, k2) || p_4111_0_.func_443_c(i2, j2, k2) != enumcreaturetype.func_21102_c());
        l2 = 0;
        i3 = 0;
_L9:
        if(i3 >= 3) goto _L4; else goto _L3
_L3:
        int j3;
        int k3;
        int l3;
        byte byte1;
        SpawnListEntry spawnlistentry;
        int i4;
        j3 = i2;
        k3 = j2;
        l3 = k2;
        byte1 = 6;
        spawnlistentry = null;
        i4 = 0;
_L8:
        if(i4 >= 4) goto _L6; else goto _L5
_L5:
        EntityLiving entityliving;
        j3 += p_4111_0_.field_803_m.nextInt(byte1) - p_4111_0_.field_803_m.nextInt(byte1);
        k3 += p_4111_0_.field_803_m.nextInt(1) - p_4111_0_.field_803_m.nextInt(1);
        l3 += p_4111_0_.field_803_m.nextInt(byte1) - p_4111_0_.field_803_m.nextInt(byte1);
        if(!func_21167_a(enumcreaturetype, p_4111_0_, j3, k3, l3))
        {
            continue; /* Loop/switch isn't completed */
        }
        float f = (float)j3 + 0.5F;
        float f1 = k3;
        float f2 = (float)l3 + 0.5F;
        if(p_4111_0_.func_456_a(f, f1, f2, 24D) != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        float f3 = f - (float)chunkcoordinates.field_22216_a;
        float f4 = f1 - (float)chunkcoordinates.field_529_a;
        float f5 = f2 - (float)chunkcoordinates.field_528_b;
        float f6 = f3 * f3 + f4 * f4 + f5 * f5;
        if(f6 < 576F)
        {
            continue; /* Loop/switch isn't completed */
        }
        if(spawnlistentry == null)
        {
            spawnlistentry = p_4111_0_.func_40216_a(enumcreaturetype, j3, k3, l3);
            if(spawnlistentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        try
        {
            entityliving = (EntityLiving)spawnlistentry.field_25145_a.getConstructor(new Class[] {
                net.minecraft.src.World.class
            }).newInstance(new Object[] {
                p_4111_0_
            });
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return j;
        }
        entityliving.func_107_c(f, f1, f2, p_4111_0_.field_803_m.nextFloat() * 360F, 0.0F);
        if(!entityliving.func_155_a())
        {
            break; /* Loop/switch isn't completed */
        }
        l2++;
        p_4111_0_.func_526_a(entityliving);
        func_21166_a(entityliving, p_4111_0_, f, f1, f2);
        if(l2 < entityliving.func_4045_i()) goto _L7; else goto _L4
_L7:
        j += l2;
        i4++;
          goto _L8
_L6:
        i3++;
          goto _L9
        j1++;
          goto _L10
_L2:
        return j;
    }

    public static boolean func_21167_a(EnumCreatureType p_21167_0_, World p_21167_1_, int p_21167_2_, int p_21167_3_, int p_21167_4_)
    {
        if(p_21167_0_.func_21102_c() == Material.field_521_f)
        {
            return p_21167_1_.func_443_c(p_21167_2_, p_21167_3_, p_21167_4_).func_217_d() && !p_21167_1_.func_445_d(p_21167_2_, p_21167_3_ + 1, p_21167_4_);
        } else
        {
            int i = p_21167_1_.func_444_a(p_21167_2_, p_21167_3_ - 1, p_21167_4_);
            return Block.func_48126_g(i) && i != Block.field_4064_A.field_573_bc && !p_21167_1_.func_445_d(p_21167_2_, p_21167_3_, p_21167_4_) && !p_21167_1_.func_443_c(p_21167_2_, p_21167_3_, p_21167_4_).func_217_d() && !p_21167_1_.func_445_d(p_21167_2_, p_21167_3_ + 1, p_21167_4_);
        }
    }

    private static void func_21166_a(EntityLiving p_21166_0_, World p_21166_1_, float p_21166_2_, float p_21166_3_, float p_21166_4_)
    {
        if((p_21166_0_ instanceof EntitySpider) && p_21166_1_.field_803_m.nextInt(100) == 0)
        {
            EntitySkeleton entityskeleton = new EntitySkeleton(p_21166_1_);
            entityskeleton.func_107_c(p_21166_2_, p_21166_3_, p_21166_4_, p_21166_0_.field_316_r, 0.0F);
            p_21166_1_.func_526_a(entityskeleton);
            entityskeleton.func_6094_e(p_21166_0_);
        } else
        if(p_21166_0_ instanceof EntitySheep)
        {
            ((EntitySheep)p_21166_0_).func_21070_a(EntitySheep.func_21066_a(p_21166_1_.field_803_m));
        } else
        if((p_21166_0_ instanceof EntityOcelot) && p_21166_1_.field_803_m.nextInt(7) == 0)
        {
            for(int i = 0; i < 2; i++)
            {
                EntityOcelot entityocelot = new EntityOcelot(p_21166_1_);
                entityocelot.func_107_c(p_21166_2_, p_21166_3_, p_21166_4_, p_21166_0_.field_316_r, 0.0F);
                entityocelot.func_48350_c(-24000);
                p_21166_1_.func_526_a(entityocelot);
            }

        }
    }

    public static void func_35573_a(World p_35573_0_, BiomeGenBase p_35573_1_, int p_35573_2_, int p_35573_3_, int p_35573_4_, int p_35573_5_, Random p_35573_6_)
    {
        List list = p_35573_1_.func_25055_a(EnumCreatureType.creature);
        if(list.isEmpty())
        {
            return;
        }
        while(p_35573_6_.nextFloat() < p_35573_1_.func_4078_a()) 
        {
            SpawnListEntry spawnlistentry = (SpawnListEntry)WeightedRandom.func_35689_a(p_35573_0_.field_803_m, list);
            int i = spawnlistentry.field_35484_b + p_35573_6_.nextInt((1 + spawnlistentry.field_35485_c) - spawnlistentry.field_35484_b);
            int j = p_35573_2_ + p_35573_6_.nextInt(p_35573_4_);
            int k = p_35573_3_ + p_35573_6_.nextInt(p_35573_5_);
            int l = j;
            int i1 = k;
            int j1 = 0;
            while(j1 < i) 
            {
                boolean flag = false;
                for(int k1 = 0; !flag && k1 < 4; k1++)
                {
                    int l1 = p_35573_0_.func_4075_e(j, k);
                    if(func_21167_a(EnumCreatureType.creature, p_35573_0_, j, l1, k))
                    {
                        float f = (float)j + 0.5F;
                        float f1 = l1;
                        float f2 = (float)k + 0.5F;
                        EntityLiving entityliving;
                        try
                        {
                            entityliving = (EntityLiving)spawnlistentry.field_25145_a.getConstructor(new Class[] {
                                net.minecraft.src.World.class
                            }).newInstance(new Object[] {
                                p_35573_0_
                            });
                        }
                        catch(Exception exception)
                        {
                            exception.printStackTrace();
                            continue;
                        }
                        entityliving.func_107_c(f, f1, f2, p_35573_6_.nextFloat() * 360F, 0.0F);
                        p_35573_0_.func_526_a(entityliving);
                        func_21166_a(entityliving, p_35573_0_, f, f1, f2);
                        flag = true;
                    }
                    j += p_35573_6_.nextInt(5) - p_35573_6_.nextInt(5);
                    for(k += p_35573_6_.nextInt(5) - p_35573_6_.nextInt(5); j < p_35573_2_ || j >= p_35573_2_ + p_35573_4_ || k < p_35573_3_ || k >= p_35573_3_ + p_35573_4_; k = (i1 + p_35573_6_.nextInt(5)) - p_35573_6_.nextInt(5))
                    {
                        j = (l + p_35573_6_.nextInt(5)) - p_35573_6_.nextInt(5);
                    }

                }

                j1++;
            }
        }
    }

    static 
    {
        field_22213_a = (new Class[] {
            net.minecraft.src.EntitySpider.class, net.minecraft.src.EntityZombie.class, net.minecraft.src.EntitySkeleton.class
        });
    }
}
