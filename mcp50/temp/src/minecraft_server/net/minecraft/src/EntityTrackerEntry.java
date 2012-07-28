// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, Packet34EntityTeleport, Packet33RelEntityMoveLook, 
//            Packet31RelEntityMove, Packet32EntityLook, Packet28EntityVelocity, DataWatcher, 
//            Packet40EntityMetadata, Packet35EntityHeadRotation, EntityPlayerMP, NetServerHandler, 
//            Packet29DestroyEntity, Packet5PlayerInventory, EntityPlayer, Packet17Sleep, 
//            EntityLiving, PotionEffect, Packet41EntityEffect, EntityItem, 
//            Packet21PickupSpawn, Packet20NamedEntitySpawn, EntityMinecart, Packet23VehicleSpawn, 
//            EntityBoat, IAnimals, Packet24MobSpawn, EntityDragon, 
//            EntityFishHook, EntityArrow, EntitySnowball, EntityPotion, 
//            EntityExpBottle, EntityEnderPearl, EntityEnderEye, EntitySmallFireball, 
//            EntityFireball, EntityEgg, EntityTNTPrimed, EntityEnderCrystal, 
//            EntityFallingSand, Block, EntityPainting, Packet25EntityPainting, 
//            EntityXPOrb, Packet26EntityExpOrb, Packet

public class EntityTrackerEntry
{

    public Entity field_909_a;
    public int field_9235_d;
    public int field_9234_e;
    public int field_9233_f;
    public int field_9232_g;
    public int field_9231_h;
    public int field_9230_i;
    public int field_9229_j;
    public int field_48617_i;
    public double field_9228_k;
    public double field_9227_l;
    public double field_9226_m;
    public int field_9221_t;
    private double field_9224_q;
    private double field_9223_r;
    private double field_9222_s;
    private boolean field_12020_u;
    private boolean field_9220_u;
    private int field_28165_t;
    public boolean field_900_j;
    public Set field_899_k;

    public EntityTrackerEntry(Entity p_i196_1_, int p_i196_2_, int p_i196_3_, boolean p_i196_4_)
    {
        field_9221_t = 0;
        field_12020_u = false;
        field_28165_t = 0;
        field_900_j = false;
        field_899_k = new HashSet();
        field_909_a = p_i196_1_;
        field_9235_d = p_i196_2_;
        field_9234_e = p_i196_3_;
        field_9220_u = p_i196_4_;
        field_9233_f = MathHelper.func_584_b(p_i196_1_.field_322_l * 32D);
        field_9232_g = MathHelper.func_584_b(p_i196_1_.field_321_m * 32D);
        field_9231_h = MathHelper.func_584_b(p_i196_1_.field_320_n * 32D);
        field_9230_i = MathHelper.func_588_d((p_i196_1_.field_316_r * 256F) / 360F);
        field_9229_j = MathHelper.func_588_d((p_i196_1_.field_315_s * 256F) / 360F);
        field_48617_i = MathHelper.func_588_d((p_i196_1_.func_48314_aq() * 256F) / 360F);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ instanceof EntityTrackerEntry)
        {
            return ((EntityTrackerEntry)p_equals_1_).field_909_a.field_331_c == field_909_a.field_331_c;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return field_909_a.field_331_c;
    }

    public void func_605_a(List p_605_1_)
    {
        field_900_j = false;
        if(!field_12020_u || field_909_a.func_101_d(field_9224_q, field_9223_r, field_9222_s) > 16D)
        {
            field_9224_q = field_909_a.field_322_l;
            field_9223_r = field_909_a.field_321_m;
            field_9222_s = field_909_a.field_320_n;
            field_12020_u = true;
            field_900_j = true;
            func_601_b(p_605_1_);
        }
        field_28165_t++;
        if(field_9221_t++ % field_9234_e == 0 || field_909_a.field_35151_ca)
        {
            int i = MathHelper.func_584_b(field_909_a.field_322_l * 32D);
            int j = MathHelper.func_584_b(field_909_a.field_321_m * 32D);
            int k = MathHelper.func_584_b(field_909_a.field_320_n * 32D);
            int l = MathHelper.func_588_d((field_909_a.field_316_r * 256F) / 360F);
            int i1 = MathHelper.func_588_d((field_909_a.field_315_s * 256F) / 360F);
            int j1 = i - field_9233_f;
            int k1 = j - field_9232_g;
            int l1 = k - field_9231_h;
            Object obj = null;
            boolean flag = Math.abs(j1) >= 4 || Math.abs(k1) >= 4 || Math.abs(l1) >= 4;
            boolean flag1 = Math.abs(l - field_9230_i) >= 4 || Math.abs(i1 - field_9229_j) >= 4;
            if(j1 < -128 || j1 >= 128 || k1 < -128 || k1 >= 128 || l1 < -128 || l1 >= 128 || field_28165_t > 400)
            {
                field_28165_t = 0;
                field_909_a.field_322_l = (double)i / 32D;
                field_909_a.field_321_m = (double)j / 32D;
                field_909_a.field_320_n = (double)k / 32D;
                obj = new Packet34EntityTeleport(field_909_a.field_331_c, i, j, k, (byte)l, (byte)i1);
            } else
            if(flag && flag1)
            {
                obj = new Packet33RelEntityMoveLook(field_909_a.field_331_c, (byte)j1, (byte)k1, (byte)l1, (byte)l, (byte)i1);
            } else
            if(flag)
            {
                obj = new Packet31RelEntityMove(field_909_a.field_331_c, (byte)j1, (byte)k1, (byte)l1);
            } else
            if(flag1)
            {
                obj = new Packet32EntityLook(field_909_a.field_331_c, (byte)l, (byte)i1);
            }
            if(field_9220_u)
            {
                double d = field_909_a.field_319_o - field_9228_k;
                double d1 = field_909_a.field_318_p - field_9227_l;
                double d2 = field_909_a.field_317_q - field_9226_m;
                double d3 = 0.02D;
                double d4 = d * d + d1 * d1 + d2 * d2;
                if(d4 > d3 * d3 || d4 > 0.0D && field_909_a.field_319_o == 0.0D && field_909_a.field_318_p == 0.0D && field_909_a.field_317_q == 0.0D)
                {
                    field_9228_k = field_909_a.field_319_o;
                    field_9227_l = field_909_a.field_318_p;
                    field_9226_m = field_909_a.field_317_q;
                    func_603_a(new Packet28EntityVelocity(field_909_a.field_331_c, field_9228_k, field_9227_l, field_9226_m));
                }
            }
            if(obj != null)
            {
                func_603_a(((Packet) (obj)));
            }
            DataWatcher datawatcher = field_909_a.func_21039_p();
            if(datawatcher.func_21150_a())
            {
                func_12018_b(new Packet40EntityMetadata(field_909_a.field_331_c, datawatcher));
            }
            int i2 = MathHelper.func_588_d((field_909_a.func_48314_aq() * 256F) / 360F);
            if(Math.abs(i2 - field_48617_i) >= 4)
            {
                func_603_a(new Packet35EntityHeadRotation(field_909_a.field_331_c, (byte)i2));
                field_48617_i = i2;
            }
            if(flag)
            {
                field_9233_f = i;
                field_9232_g = j;
                field_9231_h = k;
            }
            if(flag1)
            {
                field_9230_i = l;
                field_9229_j = i1;
            }
        }
        field_909_a.field_35151_ca = false;
        if(field_909_a.field_9078_E)
        {
            func_12018_b(new Packet28EntityVelocity(field_909_a));
            field_909_a.field_9078_E = false;
        }
    }

    public void func_603_a(Packet p_603_1_)
    {
        EntityPlayerMP entityplayermp;
        for(Iterator iterator = field_899_k.iterator(); iterator.hasNext(); entityplayermp.field_20908_a.func_39_b(p_603_1_))
        {
            entityplayermp = (EntityPlayerMP)iterator.next();
        }

    }

    public void func_12018_b(Packet p_12018_1_)
    {
        func_603_a(p_12018_1_);
        if(field_909_a instanceof EntityPlayerMP)
        {
            ((EntityPlayerMP)field_909_a).field_20908_a.func_39_b(p_12018_1_);
        }
    }

    public void func_604_a()
    {
        func_603_a(new Packet29DestroyEntity(field_909_a.field_331_c));
    }

    public void func_12019_a(EntityPlayerMP p_12019_1_)
    {
        if(field_899_k.contains(p_12019_1_))
        {
            field_899_k.remove(p_12019_1_);
        }
    }

    public void func_606_a(EntityPlayerMP p_606_1_)
    {
        if(p_606_1_ == field_909_a)
        {
            return;
        }
        double d = p_606_1_.field_322_l - (double)(field_9233_f / 32);
        double d1 = p_606_1_.field_320_n - (double)(field_9231_h / 32);
        if(d >= (double)(-field_9235_d) && d <= (double)field_9235_d && d1 >= (double)(-field_9235_d) && d1 <= (double)field_9235_d)
        {
            if(!field_899_k.contains(p_606_1_))
            {
                field_899_k.add(p_606_1_);
                p_606_1_.field_20908_a.func_39_b(func_602_b());
                if(field_9220_u)
                {
                    p_606_1_.field_20908_a.func_39_b(new Packet28EntityVelocity(field_909_a.field_331_c, field_909_a.field_319_o, field_909_a.field_318_p, field_909_a.field_317_q));
                }
                ItemStack aitemstack[] = field_909_a.func_20042_E();
                if(aitemstack != null)
                {
                    for(int i = 0; i < aitemstack.length; i++)
                    {
                        p_606_1_.field_20908_a.func_39_b(new Packet5PlayerInventory(field_909_a.field_331_c, i, aitemstack[i]));
                    }

                }
                if(field_909_a instanceof EntityPlayer)
                {
                    EntityPlayer entityplayer = (EntityPlayer)field_909_a;
                    if(entityplayer.func_22057_E())
                    {
                        p_606_1_.field_20908_a.func_39_b(new Packet17Sleep(field_909_a, 0, MathHelper.func_584_b(field_909_a.field_322_l), MathHelper.func_584_b(field_909_a.field_321_m), MathHelper.func_584_b(field_909_a.field_320_n)));
                    }
                }
                if(field_909_a instanceof EntityLiving)
                {
                    EntityLiving entityliving = (EntityLiving)field_909_a;
                    PotionEffect potioneffect;
                    for(Iterator iterator = entityliving.func_35183_ak().iterator(); iterator.hasNext(); p_606_1_.field_20908_a.func_39_b(new Packet41EntityEffect(field_909_a.field_331_c, potioneffect)))
                    {
                        potioneffect = (PotionEffect)iterator.next();
                    }

                }
            }
        } else
        if(field_899_k.contains(p_606_1_))
        {
            field_899_k.remove(p_606_1_);
            p_606_1_.field_20908_a.func_39_b(new Packet29DestroyEntity(field_909_a.field_331_c));
        }
    }

    public void func_601_b(List p_601_1_)
    {
        for(int i = 0; i < p_601_1_.size(); i++)
        {
            func_606_a((EntityPlayerMP)p_601_1_.get(i));
        }

    }

    private Packet func_602_b()
    {
        if(field_909_a.field_304_B)
        {
            System.out.println("Fetching addPacket for removed entity");
        }
        if(field_909_a instanceof EntityItem)
        {
            EntityItem entityitem = (EntityItem)field_909_a;
            Packet21PickupSpawn packet21pickupspawn = new Packet21PickupSpawn(entityitem);
            entityitem.field_322_l = (double)packet21pickupspawn.field_128_b / 32D;
            entityitem.field_321_m = (double)packet21pickupspawn.field_127_c / 32D;
            entityitem.field_320_n = (double)packet21pickupspawn.field_126_d / 32D;
            return packet21pickupspawn;
        }
        if(field_909_a instanceof EntityPlayerMP)
        {
            return new Packet20NamedEntitySpawn((EntityPlayer)field_909_a);
        }
        if(field_909_a instanceof EntityMinecart)
        {
            EntityMinecart entityminecart = (EntityMinecart)field_909_a;
            if(entityminecart.field_476_ae == 0)
            {
                return new Packet23VehicleSpawn(field_909_a, 10);
            }
            if(entityminecart.field_476_ae == 1)
            {
                return new Packet23VehicleSpawn(field_909_a, 11);
            }
            if(entityminecart.field_476_ae == 2)
            {
                return new Packet23VehicleSpawn(field_909_a, 12);
            }
        }
        if(field_909_a instanceof EntityBoat)
        {
            return new Packet23VehicleSpawn(field_909_a, 1);
        }
        if(field_909_a instanceof IAnimals)
        {
            return new Packet24MobSpawn((EntityLiving)field_909_a);
        }
        if(field_909_a instanceof EntityDragon)
        {
            return new Packet24MobSpawn((EntityLiving)field_909_a);
        }
        if(field_909_a instanceof EntityFishHook)
        {
            return new Packet23VehicleSpawn(field_909_a, 90);
        }
        if(field_909_a instanceof EntityArrow)
        {
            Entity entity = ((EntityArrow)field_909_a).field_439_ah;
            return new Packet23VehicleSpawn(field_909_a, 60, entity == null ? field_909_a.field_331_c : entity.field_331_c);
        }
        if(field_909_a instanceof EntitySnowball)
        {
            return new Packet23VehicleSpawn(field_909_a, 61);
        }
        if(field_909_a instanceof EntityPotion)
        {
            return new Packet23VehicleSpawn(field_909_a, 73, ((EntityPotion)field_909_a).func_40054_n_());
        }
        if(field_909_a instanceof EntityExpBottle)
        {
            return new Packet23VehicleSpawn(field_909_a, 75);
        }
        if(field_909_a instanceof EntityEnderPearl)
        {
            return new Packet23VehicleSpawn(field_909_a, 65);
        }
        if(field_909_a instanceof EntityEnderEye)
        {
            return new Packet23VehicleSpawn(field_909_a, 72);
        }
        if(field_909_a instanceof EntitySmallFireball)
        {
            EntitySmallFireball entitysmallfireball = (EntitySmallFireball)field_909_a;
            Packet23VehicleSpawn packet23vehiclespawn = null;
            if(entitysmallfireball.field_9191_am != null)
            {
                packet23vehiclespawn = new Packet23VehicleSpawn(field_909_a, 64, entitysmallfireball.field_9191_am.field_331_c);
            } else
            {
                packet23vehiclespawn = new Packet23VehicleSpawn(field_909_a, 64, 0);
            }
            packet23vehiclespawn.field_28044_e = (int)(entitysmallfireball.field_9199_b * 8000D);
            packet23vehiclespawn.field_28043_f = (int)(entitysmallfireball.field_9198_c * 8000D);
            packet23vehiclespawn.field_28042_g = (int)(entitysmallfireball.field_9196_d * 8000D);
            return packet23vehiclespawn;
        }
        if(field_909_a instanceof EntityFireball)
        {
            EntityFireball entityfireball = (EntityFireball)field_909_a;
            Packet23VehicleSpawn packet23vehiclespawn1 = null;
            if(entityfireball.field_9191_am != null)
            {
                packet23vehiclespawn1 = new Packet23VehicleSpawn(field_909_a, 63, ((EntityFireball)field_909_a).field_9191_am.field_331_c);
            } else
            {
                packet23vehiclespawn1 = new Packet23VehicleSpawn(field_909_a, 63, 0);
            }
            packet23vehiclespawn1.field_28044_e = (int)(entityfireball.field_9199_b * 8000D);
            packet23vehiclespawn1.field_28043_f = (int)(entityfireball.field_9198_c * 8000D);
            packet23vehiclespawn1.field_28042_g = (int)(entityfireball.field_9196_d * 8000D);
            return packet23vehiclespawn1;
        }
        if(field_909_a instanceof EntityEgg)
        {
            return new Packet23VehicleSpawn(field_909_a, 62);
        }
        if(field_909_a instanceof EntityTNTPrimed)
        {
            return new Packet23VehicleSpawn(field_909_a, 50);
        }
        if(field_909_a instanceof EntityEnderCrystal)
        {
            return new Packet23VehicleSpawn(field_909_a, 51);
        }
        if(field_909_a instanceof EntityFallingSand)
        {
            EntityFallingSand entityfallingsand = (EntityFallingSand)field_909_a;
            if(entityfallingsand.field_427_a == Block.field_590_F.field_573_bc)
            {
                return new Packet23VehicleSpawn(field_909_a, 70);
            }
            if(entityfallingsand.field_427_a == Block.field_4062_G.field_573_bc)
            {
                return new Packet23VehicleSpawn(field_909_a, 71);
            }
            if(entityfallingsand.field_427_a == Block.field_41002_bK.field_573_bc)
            {
                return new Packet23VehicleSpawn(field_909_a, 74);
            }
        }
        if(field_909_a instanceof EntityPainting)
        {
            return new Packet25EntityPainting((EntityPainting)field_909_a);
        }
        if(field_909_a instanceof EntityXPOrb)
        {
            return new Packet26EntityExpOrb((EntityXPOrb)field_909_a);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Don't know how to add ").append(field_909_a.getClass()).append("!").toString());
        }
    }

    public void func_9219_b(EntityPlayerMP p_9219_1_)
    {
        if(field_899_k.contains(p_9219_1_))
        {
            field_899_k.remove(p_9219_1_);
            p_9219_1_.field_20908_a.func_39_b(new Packet29DestroyEntity(field_909_a.field_331_c));
        }
    }
}
