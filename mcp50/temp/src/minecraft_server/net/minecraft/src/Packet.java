// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IntHashMap, PacketCount, ItemStack, Item, 
//            CompressedStreamTools, Packet0KeepAlive, Packet1Login, Packet2Handshake, 
//            Packet3Chat, Packet4UpdateTime, Packet5PlayerInventory, Packet6SpawnPosition, 
//            Packet7UseEntity, Packet8UpdateHealth, Packet9Respawn, Packet10Flying, 
//            Packet11PlayerPosition, Packet12PlayerLook, Packet13PlayerLookMove, Packet14BlockDig, 
//            Packet15Place, Packet16BlockItemSwitch, Packet17Sleep, Packet18Animation, 
//            Packet19EntityAction, Packet20NamedEntitySpawn, Packet21PickupSpawn, Packet22Collect, 
//            Packet23VehicleSpawn, Packet24MobSpawn, Packet25EntityPainting, Packet26EntityExpOrb, 
//            Packet28EntityVelocity, Packet29DestroyEntity, Packet30Entity, Packet31RelEntityMove, 
//            Packet32EntityLook, Packet33RelEntityMoveLook, Packet34EntityTeleport, Packet35EntityHeadRotation, 
//            Packet38EntityStatus, Packet39AttachEntity, Packet40EntityMetadata, Packet41EntityEffect, 
//            Packet42RemoveEntityEffect, Packet43Experience, Packet50PreChunk, Packet51MapChunk, 
//            Packet52MultiBlockChange, Packet53BlockChange, Packet54PlayNoteBlock, Packet60Explosion, 
//            Packet61DoorChange, Packet70Bed, Packet71Weather, Packet100OpenWindow, 
//            Packet101CloseWindow, Packet102WindowClick, Packet103SetSlot, Packet104WindowItems, 
//            Packet105UpdateProgressbar, Packet106Transaction, Packet107CreativeSetSlot, Packet108EnchantItem, 
//            Packet130UpdateSign, Packet131MapData, Packet132TileEntityData, Packet200Statistic, 
//            Packet201PlayerInfo, Packet202PlayerAbilities, Packet250CustomPayload, Packet254ServerPing, 
//            Packet255KickDisconnect, NetHandler, NBTTagCompound

public abstract class Packet
{

    public static IntHashMap field_39_a = new IntHashMap();
    private static Map field_38_b = new HashMap();
    private static Set field_27994_c = new HashSet();
    private static Set field_27993_d = new HashSet();
    public final long field_20009_j = System.currentTimeMillis();
    public static long field_48101_l;
    public static long field_48102_m;
    public static long field_48099_n;
    public static long field_48100_o;
    public boolean field_40_j;

    public Packet()
    {
        field_40_j = false;
    }

    static void func_64_a(int p_64_0_, boolean p_64_1_, boolean p_64_2_, Class p_64_3_)
    {
        if(field_39_a.func_556_b(p_64_0_))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet id:").append(p_64_0_).toString());
        }
        if(field_38_b.containsKey(p_64_3_))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet class:").append(p_64_3_).toString());
        }
        field_39_a.func_554_a(p_64_0_, p_64_3_);
        field_38_b.put(p_64_3_, Integer.valueOf(p_64_0_));
        if(p_64_1_)
        {
            field_27994_c.add(Integer.valueOf(p_64_0_));
        }
        if(p_64_2_)
        {
            field_27993_d.add(Integer.valueOf(p_64_0_));
        }
    }

    public static Packet func_67_a(int p_67_0_)
    {
        try
        {
            Class class1 = (Class)field_39_a.func_550_a(p_67_0_);
            if(class1 == null)
            {
                return null;
            } else
            {
                return (Packet)class1.newInstance();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        System.out.println((new StringBuilder()).append("Skipping packet with id ").append(p_67_0_).toString());
        return null;
    }

    public final int func_69_b()
    {
        return ((Integer)field_38_b.get(getClass())).intValue();
    }

    public static Packet func_65_b(DataInputStream p_65_0_, boolean p_65_1_)
        throws IOException
    {
        int i = 0;
        Packet packet = null;
        try
        {
            i = p_65_0_.read();
            if(i == -1)
            {
                return null;
            }
            if(p_65_1_ && !field_27993_d.contains(Integer.valueOf(i)) || !p_65_1_ && !field_27994_c.contains(Integer.valueOf(i)))
            {
                throw new IOException((new StringBuilder()).append("Bad packet id ").append(i).toString());
            }
            packet = func_67_a(i);
            if(packet == null)
            {
                throw new IOException((new StringBuilder()).append("Bad packet id ").append(i).toString());
            }
            packet.func_70_a(p_65_0_);
            field_48101_l++;
            field_48102_m += packet.func_71_a();
        }
        catch(EOFException eofexception)
        {
            System.out.println("Reached end of stream");
            return null;
        }
        PacketCount.func_40615_a(i, packet.func_71_a());
        field_48101_l++;
        field_48102_m += packet.func_71_a();
        return packet;
    }

    public static void func_66_a(Packet p_66_0_, DataOutputStream p_66_1_)
        throws IOException
    {
        p_66_1_.write(p_66_0_.func_69_b());
        p_66_0_.func_68_a(p_66_1_);
        field_48099_n++;
        field_48100_o += p_66_0_.func_71_a();
    }

    public static void func_27038_a(String p_27038_0_, DataOutputStream p_27038_1_)
        throws IOException
    {
        if(p_27038_0_.length() > 32767)
        {
            throw new IOException("String too big");
        } else
        {
            p_27038_1_.writeShort(p_27038_0_.length());
            p_27038_1_.writeChars(p_27038_0_);
            return;
        }
    }

    public static String func_27037_a(DataInputStream p_27037_0_, int p_27037_1_)
        throws IOException
    {
        short word0 = p_27037_0_.readShort();
        if(word0 > p_27037_1_)
        {
            throw new IOException((new StringBuilder()).append("Received string length longer than maximum allowed (").append(word0).append(" > ").append(p_27037_1_).append(")").toString());
        }
        if(word0 < 0)
        {
            throw new IOException("Received string length is less than zero! Weird string!");
        }
        StringBuilder stringbuilder = new StringBuilder();
        for(int i = 0; i < word0; i++)
        {
            stringbuilder.append(p_27037_0_.readChar());
        }

        return stringbuilder.toString();
    }

    public abstract void func_70_a(DataInputStream datainputstream)
        throws IOException;

    public abstract void func_68_a(DataOutputStream dataoutputstream)
        throws IOException;

    public abstract void func_72_a(NetHandler nethandler);

    public abstract int func_71_a();

    protected ItemStack func_40262_b(DataInputStream p_40262_1_)
        throws IOException
    {
        ItemStack itemstack = null;
        short word0 = p_40262_1_.readShort();
        if(word0 >= 0)
        {
            byte byte0 = p_40262_1_.readByte();
            short word1 = p_40262_1_.readShort();
            itemstack = new ItemStack(word0, byte0, word1);
            if(Item.field_176_c[word0].func_25005_e() || Item.field_176_c[word0].func_46003_i())
            {
                itemstack.field_40611_d = func_40259_c(p_40262_1_);
            }
        }
        return itemstack;
    }

    protected void func_40261_a(ItemStack p_40261_1_, DataOutputStream p_40261_2_)
        throws IOException
    {
        if(p_40261_1_ == null)
        {
            p_40261_2_.writeShort(-1);
        } else
        {
            p_40261_2_.writeShort(p_40261_1_.field_855_c);
            p_40261_2_.writeByte(p_40261_1_.field_853_a);
            p_40261_2_.writeShort(p_40261_1_.func_21125_h());
            if(p_40261_1_.func_569_a().func_25005_e() || p_40261_1_.func_569_a().func_46003_i())
            {
                func_40260_a(p_40261_1_.field_40611_d, p_40261_2_);
            }
        }
    }

    protected NBTTagCompound func_40259_c(DataInputStream p_40259_1_)
        throws IOException
    {
        short word0 = p_40259_1_.readShort();
        if(word0 < 0)
        {
            return null;
        } else
        {
            byte abyte0[] = new byte[word0];
            p_40259_1_.readFully(abyte0);
            return CompressedStreamTools.func_40515_a(abyte0);
        }
    }

    protected void func_40260_a(NBTTagCompound p_40260_1_, DataOutputStream p_40260_2_)
        throws IOException
    {
        if(p_40260_1_ == null)
        {
            p_40260_2_.writeShort(-1);
        } else
        {
            byte abyte0[] = CompressedStreamTools.func_40516_a(p_40260_1_);
            p_40260_2_.writeShort((short)abyte0.length);
            p_40260_2_.write(abyte0);
        }
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static 
    {
        func_64_a(0, true, true, net.minecraft.src.Packet0KeepAlive.class);
        func_64_a(1, true, true, net.minecraft.src.Packet1Login.class);
        func_64_a(2, true, true, net.minecraft.src.Packet2Handshake.class);
        func_64_a(3, true, true, net.minecraft.src.Packet3Chat.class);
        func_64_a(4, true, false, net.minecraft.src.Packet4UpdateTime.class);
        func_64_a(5, true, false, net.minecraft.src.Packet5PlayerInventory.class);
        func_64_a(6, true, false, net.minecraft.src.Packet6SpawnPosition.class);
        func_64_a(7, false, true, net.minecraft.src.Packet7UseEntity.class);
        func_64_a(8, true, false, net.minecraft.src.Packet8UpdateHealth.class);
        func_64_a(9, true, true, net.minecraft.src.Packet9Respawn.class);
        func_64_a(10, true, true, net.minecraft.src.Packet10Flying.class);
        func_64_a(11, true, true, net.minecraft.src.Packet11PlayerPosition.class);
        func_64_a(12, true, true, net.minecraft.src.Packet12PlayerLook.class);
        func_64_a(13, true, true, net.minecraft.src.Packet13PlayerLookMove.class);
        func_64_a(14, false, true, net.minecraft.src.Packet14BlockDig.class);
        func_64_a(15, false, true, net.minecraft.src.Packet15Place.class);
        func_64_a(16, false, true, net.minecraft.src.Packet16BlockItemSwitch.class);
        func_64_a(17, true, false, net.minecraft.src.Packet17Sleep.class);
        func_64_a(18, true, true, net.minecraft.src.Packet18Animation.class);
        func_64_a(19, false, true, net.minecraft.src.Packet19EntityAction.class);
        func_64_a(20, true, false, net.minecraft.src.Packet20NamedEntitySpawn.class);
        func_64_a(21, true, false, net.minecraft.src.Packet21PickupSpawn.class);
        func_64_a(22, true, false, net.minecraft.src.Packet22Collect.class);
        func_64_a(23, true, false, net.minecraft.src.Packet23VehicleSpawn.class);
        func_64_a(24, true, false, net.minecraft.src.Packet24MobSpawn.class);
        func_64_a(25, true, false, net.minecraft.src.Packet25EntityPainting.class);
        func_64_a(26, true, false, net.minecraft.src.Packet26EntityExpOrb.class);
        func_64_a(28, true, false, net.minecraft.src.Packet28EntityVelocity.class);
        func_64_a(29, true, false, net.minecraft.src.Packet29DestroyEntity.class);
        func_64_a(30, true, false, net.minecraft.src.Packet30Entity.class);
        func_64_a(31, true, false, net.minecraft.src.Packet31RelEntityMove.class);
        func_64_a(32, true, false, net.minecraft.src.Packet32EntityLook.class);
        func_64_a(33, true, false, net.minecraft.src.Packet33RelEntityMoveLook.class);
        func_64_a(34, true, false, net.minecraft.src.Packet34EntityTeleport.class);
        func_64_a(35, true, false, net.minecraft.src.Packet35EntityHeadRotation.class);
        func_64_a(38, true, false, net.minecraft.src.Packet38EntityStatus.class);
        func_64_a(39, true, false, net.minecraft.src.Packet39AttachEntity.class);
        func_64_a(40, true, false, net.minecraft.src.Packet40EntityMetadata.class);
        func_64_a(41, true, false, net.minecraft.src.Packet41EntityEffect.class);
        func_64_a(42, true, false, net.minecraft.src.Packet42RemoveEntityEffect.class);
        func_64_a(43, true, false, net.minecraft.src.Packet43Experience.class);
        func_64_a(50, true, false, net.minecraft.src.Packet50PreChunk.class);
        func_64_a(51, true, false, net.minecraft.src.Packet51MapChunk.class);
        func_64_a(52, true, false, net.minecraft.src.Packet52MultiBlockChange.class);
        func_64_a(53, true, false, net.minecraft.src.Packet53BlockChange.class);
        func_64_a(54, true, false, net.minecraft.src.Packet54PlayNoteBlock.class);
        func_64_a(60, true, false, net.minecraft.src.Packet60Explosion.class);
        func_64_a(61, true, false, net.minecraft.src.Packet61DoorChange.class);
        func_64_a(70, true, false, net.minecraft.src.Packet70Bed.class);
        func_64_a(71, true, false, net.minecraft.src.Packet71Weather.class);
        func_64_a(100, true, false, net.minecraft.src.Packet100OpenWindow.class);
        func_64_a(101, true, true, net.minecraft.src.Packet101CloseWindow.class);
        func_64_a(102, false, true, net.minecraft.src.Packet102WindowClick.class);
        func_64_a(103, true, false, net.minecraft.src.Packet103SetSlot.class);
        func_64_a(104, true, false, net.minecraft.src.Packet104WindowItems.class);
        func_64_a(105, true, false, net.minecraft.src.Packet105UpdateProgressbar.class);
        func_64_a(106, true, true, net.minecraft.src.Packet106Transaction.class);
        func_64_a(107, true, true, net.minecraft.src.Packet107CreativeSetSlot.class);
        func_64_a(108, false, true, net.minecraft.src.Packet108EnchantItem.class);
        func_64_a(130, true, true, net.minecraft.src.Packet130UpdateSign.class);
        func_64_a(131, true, false, net.minecraft.src.Packet131MapData.class);
        func_64_a(132, true, false, net.minecraft.src.Packet132TileEntityData.class);
        func_64_a(200, true, false, net.minecraft.src.Packet200Statistic.class);
        func_64_a(201, true, false, net.minecraft.src.Packet201PlayerInfo.class);
        func_64_a(202, true, true, net.minecraft.src.Packet202PlayerAbilities.class);
        func_64_a(250, true, true, net.minecraft.src.Packet250CustomPayload.class);
        func_64_a(254, false, true, net.minecraft.src.Packet254ServerPing.class);
        func_64_a(255, true, true, net.minecraft.src.Packet255KickDisconnect.class);
    }
}
