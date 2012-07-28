// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            EntityEggInfo, World, Entity, NBTTagCompound, 
//            EntityItem, EntityXPOrb, EntityPainting, EntityArrow, 
//            EntitySnowball, EntityFireball, EntitySmallFireball, EntityEnderPearl, 
//            EntityEnderEye, EntityPotion, EntityExpBottle, EntityTNTPrimed, 
//            EntityFallingSand, EntityMinecart, EntityBoat, EntityLiving, 
//            EntityMob, EntityCreeper, EntitySkeleton, EntitySpider, 
//            EntityGiantZombie, EntityZombie, EntitySlime, EntityGhast, 
//            EntityPigZombie, EntityEnderman, EntityCaveSpider, EntitySilverfish, 
//            EntityBlaze, EntityMagmaCube, EntityDragon, EntityPig, 
//            EntitySheep, EntityCow, EntityChicken, EntitySquid, 
//            EntityWolf, EntityMooshroom, EntitySnowman, EntityOcelot, 
//            EntityIronGolem, EntityVillager, EntityEnderCrystal

public class EntityList
{

    private static Map field_849_a = new HashMap();
    private static Map field_848_b = new HashMap();
    private static Map field_851_c = new HashMap();
    private static Map field_850_d = new HashMap();
    private static Map field_48583_f = new HashMap();
    public static HashMap field_44015_a = new HashMap();

    public EntityList()
    {
    }

    private static void func_563_a(Class p_563_0_, String p_563_1_, int p_563_2_)
    {
        field_849_a.put(p_563_1_, p_563_0_);
        field_848_b.put(p_563_0_, p_563_1_);
        field_851_c.put(Integer.valueOf(p_563_2_), p_563_0_);
        field_850_d.put(p_563_0_, Integer.valueOf(p_563_2_));
        field_48583_f.put(p_563_1_, Integer.valueOf(p_563_2_));
    }

    private static void func_46122_a(Class p_46122_0_, String p_46122_1_, int p_46122_2_, int p_46122_3_, int p_46122_4_)
    {
        func_563_a(p_46122_0_, p_46122_1_, p_46122_2_);
        field_44015_a.put(Integer.valueOf(p_46122_2_), new EntityEggInfo(p_46122_2_, p_46122_3_, p_46122_4_));
    }

    public static Entity func_567_a(String p_567_0_, World p_567_1_)
    {
        Entity entity = null;
        try
        {
            Class class1 = (Class)field_849_a.get(p_567_0_);
            if(class1 != null)
            {
                entity = (Entity)class1.getConstructor(new Class[] {
                    net.minecraft.src.World.class
                }).newInstance(new Object[] {
                    p_567_1_
                });
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return entity;
    }

    public static Entity func_566_a(NBTTagCompound p_566_0_, World p_566_1_)
    {
        Entity entity = null;
        try
        {
            Class class1 = (Class)field_849_a.get(p_566_0_.func_401_h("id"));
            if(class1 != null)
            {
                entity = (Entity)class1.getConstructor(new Class[] {
                    net.minecraft.src.World.class
                }).newInstance(new Object[] {
                    p_566_1_
                });
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(entity != null)
        {
            entity.func_100_e(p_566_0_);
        } else
        {
            System.out.println((new StringBuilder()).append("Skipping Entity with id ").append(p_566_0_.func_401_h("id")).toString());
        }
        return entity;
    }

    public static Entity func_44014_a(int p_44014_0_, World p_44014_1_)
    {
        Entity entity = null;
        try
        {
            Class class1 = (Class)field_851_c.get(Integer.valueOf(p_44014_0_));
            if(class1 != null)
            {
                entity = (Entity)class1.getConstructor(new Class[] {
                    net.minecraft.src.World.class
                }).newInstance(new Object[] {
                    p_44014_1_
                });
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(entity == null)
        {
            System.out.println((new StringBuilder()).append("Skipping Entity with id ").append(p_44014_0_).toString());
        }
        return entity;
    }

    public static int func_565_a(Entity p_565_0_)
    {
        return ((Integer)field_850_d.get(p_565_0_.getClass())).intValue();
    }

    public static String func_564_b(Entity p_564_0_)
    {
        return (String)field_848_b.get(p_564_0_.getClass());
    }

    public static int func_48582_a(String p_48582_0_)
    {
        Integer integer = (Integer)field_48583_f.get(p_48582_0_);
        if(integer == null)
        {
            return 90;
        } else
        {
            return integer.intValue();
        }
    }

    static 
    {
        func_563_a(net.minecraft.src.EntityItem.class, "Item", 1);
        func_563_a(net.minecraft.src.EntityXPOrb.class, "XPOrb", 2);
        func_563_a(net.minecraft.src.EntityPainting.class, "Painting", 9);
        func_563_a(net.minecraft.src.EntityArrow.class, "Arrow", 10);
        func_563_a(net.minecraft.src.EntitySnowball.class, "Snowball", 11);
        func_563_a(net.minecraft.src.EntityFireball.class, "Fireball", 12);
        func_563_a(net.minecraft.src.EntitySmallFireball.class, "SmallFireball", 13);
        func_563_a(net.minecraft.src.EntityEnderPearl.class, "ThrownEnderpearl", 14);
        func_563_a(net.minecraft.src.EntityEnderEye.class, "EyeOfEnderSignal", 15);
        func_563_a(net.minecraft.src.EntityPotion.class, "ThrownPotion", 16);
        func_563_a(net.minecraft.src.EntityExpBottle.class, "ThrownExpBottle", 17);
        func_563_a(net.minecraft.src.EntityTNTPrimed.class, "PrimedTnt", 20);
        func_563_a(net.minecraft.src.EntityFallingSand.class, "FallingSand", 21);
        func_563_a(net.minecraft.src.EntityMinecart.class, "Minecart", 40);
        func_563_a(net.minecraft.src.EntityBoat.class, "Boat", 41);
        func_563_a(net.minecraft.src.EntityLiving.class, "Mob", 48);
        func_563_a(net.minecraft.src.EntityMob.class, "Monster", 49);
        func_46122_a(net.minecraft.src.EntityCreeper.class, "Creeper", 50, 0xda70b, 0);
        func_46122_a(net.minecraft.src.EntitySkeleton.class, "Skeleton", 51, 0xc1c1c1, 0x494949);
        func_46122_a(net.minecraft.src.EntitySpider.class, "Spider", 52, 0x342d27, 0xa80e0e);
        func_563_a(net.minecraft.src.EntityGiantZombie.class, "Giant", 53);
        func_46122_a(net.minecraft.src.EntityZombie.class, "Zombie", 54, 44975, 0x799c65);
        func_46122_a(net.minecraft.src.EntitySlime.class, "Slime", 55, 0x51a03e, 0x7ebf6e);
        func_46122_a(net.minecraft.src.EntityGhast.class, "Ghast", 56, 0xf9f9f9, 0xbcbcbc);
        func_46122_a(net.minecraft.src.EntityPigZombie.class, "PigZombie", 57, 0xea9393, 0x4c7129);
        func_46122_a(net.minecraft.src.EntityEnderman.class, "Enderman", 58, 0x161616, 0);
        func_46122_a(net.minecraft.src.EntityCaveSpider.class, "CaveSpider", 59, 0xc424e, 0xa80e0e);
        func_46122_a(net.minecraft.src.EntitySilverfish.class, "Silverfish", 60, 0x6e6e6e, 0x303030);
        func_46122_a(net.minecraft.src.EntityBlaze.class, "Blaze", 61, 0xf6b201, 0xfff87e);
        func_46122_a(net.minecraft.src.EntityMagmaCube.class, "LavaSlime", 62, 0x340000, 0xfcfc00);
        func_563_a(net.minecraft.src.EntityDragon.class, "EnderDragon", 63);
        func_46122_a(net.minecraft.src.EntityPig.class, "Pig", 90, 0xf0a5a2, 0xdb635f);
        func_46122_a(net.minecraft.src.EntitySheep.class, "Sheep", 91, 0xe7e7e7, 0xffb5b5);
        func_46122_a(net.minecraft.src.EntityCow.class, "Cow", 92, 0x443626, 0xa1a1a1);
        func_46122_a(net.minecraft.src.EntityChicken.class, "Chicken", 93, 0xa1a1a1, 0xff0000);
        func_46122_a(net.minecraft.src.EntitySquid.class, "Squid", 94, 0x223b4d, 0x708899);
        func_46122_a(net.minecraft.src.EntityWolf.class, "Wolf", 95, 0xd7d3d3, 0xceaf96);
        func_46122_a(net.minecraft.src.EntityMooshroom.class, "MushroomCow", 96, 0xa00f10, 0xb7b7b7);
        func_563_a(net.minecraft.src.EntitySnowman.class, "SnowMan", 97);
        func_46122_a(net.minecraft.src.EntityOcelot.class, "Ozelot", 98, 0xefde7d, 0x564434);
        func_563_a(net.minecraft.src.EntityIronGolem.class, "VillagerGolem", 99);
        func_46122_a(net.minecraft.src.EntityVillager.class, "Villager", 120, 0x563c33, 0xbd8b72);
        func_563_a(net.minecraft.src.EntityEnderCrystal.class, "EnderCrystal", 200);
    }
}
