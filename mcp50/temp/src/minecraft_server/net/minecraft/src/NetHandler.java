// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Packet51MapChunk, Packet, Packet255KickDisconnect, Packet1Login, 
//            Packet10Flying, Packet52MultiBlockChange, Packet14BlockDig, Packet53BlockChange, 
//            Packet50PreChunk, Packet20NamedEntitySpawn, Packet30Entity, Packet34EntityTeleport, 
//            Packet15Place, Packet16BlockItemSwitch, Packet29DestroyEntity, Packet21PickupSpawn, 
//            Packet22Collect, Packet3Chat, Packet23VehicleSpawn, Packet18Animation, 
//            Packet19EntityAction, Packet2Handshake, Packet24MobSpawn, Packet4UpdateTime, 
//            Packet6SpawnPosition, Packet28EntityVelocity, Packet40EntityMetadata, Packet39AttachEntity, 
//            Packet7UseEntity, Packet38EntityStatus, Packet8UpdateHealth, Packet9Respawn, 
//            Packet60Explosion, Packet100OpenWindow, Packet101CloseWindow, Packet102WindowClick, 
//            Packet103SetSlot, Packet104WindowItems, Packet130UpdateSign, Packet105UpdateProgressbar, 
//            Packet5PlayerInventory, Packet106Transaction, Packet25EntityPainting, Packet54PlayNoteBlock, 
//            Packet200Statistic, Packet17Sleep, Packet70Bed, Packet71Weather, 
//            Packet131MapData, Packet61DoorChange, Packet254ServerPing, Packet41EntityEffect, 
//            Packet42RemoveEntityEffect, Packet201PlayerInfo, Packet0KeepAlive, Packet43Experience, 
//            Packet107CreativeSetSlot, Packet26EntityExpOrb, Packet108EnchantItem, Packet250CustomPayload, 
//            Packet35EntityHeadRotation, Packet132TileEntityData, Packet202PlayerAbilities

public abstract class NetHandler
{

    public NetHandler()
    {
    }

    public abstract boolean func_27003_c();

    public void func_48070_a(Packet51MapChunk packet51mapchunk)
    {
    }

    public void func_6001_a(Packet packet)
    {
    }

    public void func_6_a(String s, Object aobj[])
    {
    }

    public void func_4009_a(Packet255KickDisconnect p_4009_1_)
    {
        func_6001_a(p_4009_1_);
    }

    public void func_4001_a(Packet1Login p_4001_1_)
    {
        func_6001_a(p_4001_1_);
    }

    public void func_18_a(Packet10Flying p_18_1_)
    {
        func_6001_a(p_18_1_);
    }

    public void func_13_a(Packet52MultiBlockChange p_13_1_)
    {
        func_6001_a(p_13_1_);
    }

    public void func_26_a(Packet14BlockDig p_26_1_)
    {
        func_6001_a(p_26_1_);
    }

    public void func_12_a(Packet53BlockChange p_12_1_)
    {
        func_6001_a(p_12_1_);
    }

    public void func_29_a(Packet50PreChunk p_29_1_)
    {
        func_6001_a(p_29_1_);
    }

    public void func_4002_a(Packet20NamedEntitySpawn p_4002_1_)
    {
        func_6001_a(p_4002_1_);
    }

    public void func_30_a(Packet30Entity p_30_1_)
    {
        func_6001_a(p_30_1_);
    }

    public void func_4007_a(Packet34EntityTeleport p_4007_1_)
    {
        func_6001_a(p_4007_1_);
    }

    public void func_24_a(Packet15Place p_24_1_)
    {
        func_6001_a(p_24_1_);
    }

    public void func_11_a(Packet16BlockItemSwitch p_11_1_)
    {
        func_6001_a(p_11_1_);
    }

    public void func_8_a(Packet29DestroyEntity p_8_1_)
    {
        func_6001_a(p_8_1_);
    }

    public void func_4004_a(Packet21PickupSpawn p_4004_1_)
    {
        func_6001_a(p_4004_1_);
    }

    public void func_28_a(Packet22Collect p_28_1_)
    {
        func_6001_a(p_28_1_);
    }

    public void func_23_a(Packet3Chat p_23_1_)
    {
        func_6001_a(p_23_1_);
    }

    public void func_4003_a(Packet23VehicleSpawn p_4003_1_)
    {
        func_6001_a(p_4003_1_);
    }

    public void func_3_a(Packet18Animation p_3_1_)
    {
        func_6001_a(p_3_1_);
    }

    public void func_21001_a(Packet19EntityAction p_21001_1_)
    {
        func_6001_a(p_21001_1_);
    }

    public void func_6004_a(Packet2Handshake p_6004_1_)
    {
        func_6001_a(p_6004_1_);
    }

    public void func_4006_a(Packet24MobSpawn p_4006_1_)
    {
        func_6001_a(p_4006_1_);
    }

    public void func_25_a(Packet4UpdateTime p_25_1_)
    {
        func_6001_a(p_25_1_);
    }

    public void func_15_a(Packet6SpawnPosition p_15_1_)
    {
        func_6001_a(p_15_1_);
    }

    public void func_6002_a(Packet28EntityVelocity p_6002_1_)
    {
        func_6001_a(p_6002_1_);
    }

    public void func_21002_a(Packet40EntityMetadata p_21002_1_)
    {
        func_6001_a(p_21002_1_);
    }

    public void func_6003_a(Packet39AttachEntity p_6003_1_)
    {
        func_6001_a(p_6003_1_);
    }

    public void func_6006_a(Packet7UseEntity p_6006_1_)
    {
        func_6001_a(p_6006_1_);
    }

    public void func_9001_a(Packet38EntityStatus p_9001_1_)
    {
        func_6001_a(p_9001_1_);
    }

    public void func_9003_a(Packet8UpdateHealth p_9003_1_)
    {
        func_6001_a(p_9003_1_);
    }

    public void func_9002_a(Packet9Respawn p_9002_1_)
    {
        func_6001_a(p_9002_1_);
    }

    public void func_12001_a(Packet60Explosion p_12001_1_)
    {
        func_6001_a(p_12001_1_);
    }

    public void func_20004_a(Packet100OpenWindow p_20004_1_)
    {
        func_6001_a(p_20004_1_);
    }

    public void func_20006_a(Packet101CloseWindow p_20006_1_)
    {
        func_6001_a(p_20006_1_);
    }

    public void func_20007_a(Packet102WindowClick p_20007_1_)
    {
        func_6001_a(p_20007_1_);
    }

    public void func_20003_a(Packet103SetSlot p_20003_1_)
    {
        func_6001_a(p_20003_1_);
    }

    public void func_20001_a(Packet104WindowItems p_20001_1_)
    {
        func_6001_a(p_20001_1_);
    }

    public void func_20005_a(Packet130UpdateSign p_20005_1_)
    {
        func_6001_a(p_20005_1_);
    }

    public void func_20002_a(Packet105UpdateProgressbar p_20002_1_)
    {
        func_6001_a(p_20002_1_);
    }

    public void func_16_a(Packet5PlayerInventory p_16_1_)
    {
        func_6001_a(p_16_1_);
    }

    public void func_20008_a(Packet106Transaction p_20008_1_)
    {
        func_6001_a(p_20008_1_);
    }

    public void func_21003_a(Packet25EntityPainting p_21003_1_)
    {
        func_6001_a(p_21003_1_);
    }

    public void func_21004_a(Packet54PlayNoteBlock p_21004_1_)
    {
        func_6001_a(p_21004_1_);
    }

    public void func_27001_a(Packet200Statistic p_27001_1_)
    {
        func_6001_a(p_27001_1_);
    }

    public void func_22002_a(Packet17Sleep p_22002_1_)
    {
        func_6001_a(p_22002_1_);
    }

    public void func_25001_a(Packet70Bed p_25001_1_)
    {
        func_6001_a(p_25001_1_);
    }

    public void func_27002_a(Packet71Weather p_27002_1_)
    {
        func_6001_a(p_27002_1_);
    }

    public void func_28001_a(Packet131MapData p_28001_1_)
    {
        func_6001_a(p_28001_1_);
    }

    public void func_28002_a(Packet61DoorChange p_28002_1_)
    {
        func_6001_a(p_28002_1_);
    }

    public void func_35007_a(Packet254ServerPing p_35007_1_)
    {
        func_6001_a(p_35007_1_);
    }

    public void func_35002_a(Packet41EntityEffect p_35002_1_)
    {
        func_6001_a(p_35002_1_);
    }

    public void func_35003_a(Packet42RemoveEntityEffect p_35003_1_)
    {
        func_6001_a(p_35003_1_);
    }

    public void func_35006_a(Packet201PlayerInfo p_35006_1_)
    {
        func_6001_a(p_35006_1_);
    }

    public void func_35005_a(Packet0KeepAlive p_35005_1_)
    {
        func_6001_a(p_35005_1_);
    }

    public void func_35001_a(Packet43Experience p_35001_1_)
    {
        func_6001_a(p_35001_1_);
    }

    public void func_35004_a(Packet107CreativeSetSlot p_35004_1_)
    {
        func_6001_a(p_35004_1_);
    }

    public void func_35008_a(Packet26EntityExpOrb p_35008_1_)
    {
        func_6001_a(p_35008_1_);
    }

    public void func_40001_a(Packet108EnchantItem packet108enchantitem)
    {
    }

    public void func_44001_a(Packet250CustomPayload packet250custompayload)
    {
    }

    public void func_48072_a(Packet35EntityHeadRotation p_48072_1_)
    {
        func_6001_a(p_48072_1_);
    }

    public void func_48071_a(Packet132TileEntityData p_48071_1_)
    {
        func_6001_a(p_48071_1_);
    }

    public void func_50003_a(Packet202PlayerAbilities p_50003_1_)
    {
        func_6001_a(p_50003_1_);
    }
}
