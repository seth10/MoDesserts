// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            IntHashMap, ServerConfigurationManager, EntityPlayerMP, EntityTrackerEntry, 
//            EntityFishHook, EntityArrow, EntitySmallFireball, EntityFireball, 
//            EntitySnowball, EntityEnderPearl, EntityEnderEye, EntityEgg, 
//            EntityPotion, EntityExpBottle, EntityItem, EntityMinecart, 
//            EntityBoat, EntitySquid, IAnimals, EntityDragon, 
//            EntityTNTPrimed, EntityFallingSand, EntityPainting, EntityXPOrb, 
//            EntityEnderCrystal, Entity, WorldServer, Packet

public class EntityTracker
{

    private Set field_911_a;
    private IntHashMap field_910_b;
    private MinecraftServer field_913_c;
    private int field_912_d;
    private int field_28113_e;

    public EntityTracker(MinecraftServer p_i516_1_, int p_i516_2_)
    {
        field_911_a = new HashSet();
        field_910_b = new IntHashMap();
        field_913_c = p_i516_1_;
        field_28113_e = p_i516_2_;
        field_912_d = p_i516_1_.field_6033_f.func_640_a();
    }

    public void func_611_a(Entity p_611_1_)
    {
        if(p_611_1_ instanceof EntityPlayerMP)
        {
            func_6187_a(p_611_1_, 512, 2);
            EntityPlayerMP entityplayermp = (EntityPlayerMP)p_611_1_;
            Iterator iterator = field_911_a.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                EntityTrackerEntry entitytrackerentry = (EntityTrackerEntry)iterator.next();
                if(entitytrackerentry.field_909_a != entityplayermp)
                {
                    entitytrackerentry.func_606_a(entityplayermp);
                }
            } while(true);
        } else
        if(p_611_1_ instanceof EntityFishHook)
        {
            func_6186_a(p_611_1_, 64, 5, true);
        } else
        if(p_611_1_ instanceof EntityArrow)
        {
            func_6186_a(p_611_1_, 64, 20, false);
        } else
        if(p_611_1_ instanceof EntitySmallFireball)
        {
            func_6186_a(p_611_1_, 64, 10, false);
        } else
        if(p_611_1_ instanceof EntityFireball)
        {
            func_6186_a(p_611_1_, 64, 10, false);
        } else
        if(p_611_1_ instanceof EntitySnowball)
        {
            func_6186_a(p_611_1_, 64, 10, true);
        } else
        if(p_611_1_ instanceof EntityEnderPearl)
        {
            func_6186_a(p_611_1_, 64, 10, true);
        } else
        if(p_611_1_ instanceof EntityEnderEye)
        {
            func_6186_a(p_611_1_, 64, 10, true);
        } else
        if(p_611_1_ instanceof EntityEgg)
        {
            func_6186_a(p_611_1_, 64, 10, true);
        } else
        if(p_611_1_ instanceof EntityPotion)
        {
            func_6186_a(p_611_1_, 64, 10, true);
        } else
        if(p_611_1_ instanceof EntityExpBottle)
        {
            func_6186_a(p_611_1_, 64, 10, true);
        } else
        if(p_611_1_ instanceof EntityItem)
        {
            func_6186_a(p_611_1_, 64, 20, true);
        } else
        if(p_611_1_ instanceof EntityMinecart)
        {
            func_6186_a(p_611_1_, 80, 3, true);
        } else
        if(p_611_1_ instanceof EntityBoat)
        {
            func_6186_a(p_611_1_, 80, 3, true);
        } else
        if(p_611_1_ instanceof EntitySquid)
        {
            func_6186_a(p_611_1_, 64, 3, true);
        } else
        if(p_611_1_ instanceof IAnimals)
        {
            func_6186_a(p_611_1_, 80, 3, true);
        } else
        if(p_611_1_ instanceof EntityDragon)
        {
            func_6186_a(p_611_1_, 160, 3, true);
        } else
        if(p_611_1_ instanceof EntityTNTPrimed)
        {
            func_6186_a(p_611_1_, 160, 10, true);
        } else
        if(p_611_1_ instanceof EntityFallingSand)
        {
            func_6186_a(p_611_1_, 160, 20, true);
        } else
        if(p_611_1_ instanceof EntityPainting)
        {
            func_6186_a(p_611_1_, 160, 0x7fffffff, false);
        } else
        if(p_611_1_ instanceof EntityXPOrb)
        {
            func_6186_a(p_611_1_, 160, 20, true);
        } else
        if(p_611_1_ instanceof EntityEnderCrystal)
        {
            func_6186_a(p_611_1_, 256, 0x7fffffff, false);
        }
    }

    public void func_6187_a(Entity p_6187_1_, int p_6187_2_, int p_6187_3_)
    {
        func_6186_a(p_6187_1_, p_6187_2_, p_6187_3_, false);
    }

    public void func_6186_a(Entity p_6186_1_, int p_6186_2_, int p_6186_3_, boolean p_6186_4_)
    {
        if(p_6186_2_ > field_912_d)
        {
            p_6186_2_ = field_912_d;
        }
        if(field_910_b.func_556_b(p_6186_1_.field_331_c))
        {
            throw new IllegalStateException("Entity is already tracked!");
        } else
        {
            EntityTrackerEntry entitytrackerentry = new EntityTrackerEntry(p_6186_1_, p_6186_2_, p_6186_3_, p_6186_4_);
            field_911_a.add(entitytrackerentry);
            field_910_b.func_554_a(p_6186_1_.field_331_c, entitytrackerentry);
            entitytrackerentry.func_601_b(field_913_c.func_28004_a(field_28113_e).field_805_k);
            return;
        }
    }

    public void func_610_b(Entity p_610_1_)
    {
        if(p_610_1_ instanceof EntityPlayerMP)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)p_610_1_;
            EntityTrackerEntry entitytrackerentry1;
            for(Iterator iterator = field_911_a.iterator(); iterator.hasNext(); entitytrackerentry1.func_12019_a(entityplayermp))
            {
                entitytrackerentry1 = (EntityTrackerEntry)iterator.next();
            }

        }
        EntityTrackerEntry entitytrackerentry = (EntityTrackerEntry)field_910_b.func_553_d(p_610_1_.field_331_c);
        if(entitytrackerentry != null)
        {
            field_911_a.remove(entitytrackerentry);
            entitytrackerentry.func_604_a();
        }
    }

    public void func_607_a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = field_911_a.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            EntityTrackerEntry entitytrackerentry = (EntityTrackerEntry)iterator.next();
            entitytrackerentry.func_605_a(field_913_c.func_28004_a(field_28113_e).field_805_k);
            if(entitytrackerentry.field_900_j && (entitytrackerentry.field_909_a instanceof EntityPlayerMP))
            {
                arraylist.add((EntityPlayerMP)entitytrackerentry.field_909_a);
            }
        } while(true);
label0:
        for(int i = 0; i < arraylist.size(); i++)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)arraylist.get(i);
            Iterator iterator1 = field_911_a.iterator();
            do
            {
                if(!iterator1.hasNext())
                {
                    continue label0;
                }
                EntityTrackerEntry entitytrackerentry1 = (EntityTrackerEntry)iterator1.next();
                if(entitytrackerentry1.field_909_a != entityplayermp)
                {
                    entitytrackerentry1.func_606_a(entityplayermp);
                }
            } while(true);
        }

    }

    public void func_12021_a(Entity p_12021_1_, Packet p_12021_2_)
    {
        EntityTrackerEntry entitytrackerentry = (EntityTrackerEntry)field_910_b.func_550_a(p_12021_1_.field_331_c);
        if(entitytrackerentry != null)
        {
            entitytrackerentry.func_603_a(p_12021_2_);
        }
    }

    public void func_609_a(Entity p_609_1_, Packet p_609_2_)
    {
        EntityTrackerEntry entitytrackerentry = (EntityTrackerEntry)field_910_b.func_550_a(p_609_1_.field_331_c);
        if(entitytrackerentry != null)
        {
            entitytrackerentry.func_12018_b(p_609_2_);
        }
    }

    public void func_9238_a(EntityPlayerMP p_9238_1_)
    {
        EntityTrackerEntry entitytrackerentry;
        for(Iterator iterator = field_911_a.iterator(); iterator.hasNext(); entitytrackerentry.func_9219_b(p_9238_1_))
        {
            entitytrackerentry = (EntityTrackerEntry)iterator.next();
        }

    }
}
