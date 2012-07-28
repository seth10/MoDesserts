// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ChunkCoordIntPair, PlayerManager, WorldServer, ChunkProviderServer, 
//            EntityPlayerMP, Packet50PreChunk, NetServerHandler, LongHashMap, 
//            Packet53BlockChange, Packet51MapChunk, TileEntity, Packet52MultiBlockChange, 
//            Packet

class PlayerInstance
{

    private List field_1072_b;
    private int field_1071_c;
    private int field_1070_d;
    private ChunkCoordIntPair field_1069_e;
    private short field_1068_f[];
    private int field_1067_g;
    private int field_48475_h;
    final PlayerManager field_1073_a; /* synthetic field */

    public PlayerInstance(PlayerManager p_i11_1_, int p_i11_2_, int p_i11_3_)
    {
        field_1073_a = p_i11_1_;
        super();
        field_1072_b = new ArrayList();
        field_1068_f = new short[64];
        field_1067_g = 0;
        field_1071_c = p_i11_2_;
        field_1070_d = p_i11_3_;
        field_1069_e = new ChunkCoordIntPair(p_i11_2_, p_i11_3_);
        p_i11_1_.func_540_a().field_20911_y.func_376_d(p_i11_2_, p_i11_3_);
    }

    public void func_779_a(EntityPlayerMP p_779_1_)
    {
        if(field_1072_b.contains(p_779_1_))
        {
            throw new IllegalStateException((new StringBuilder()).append("Failed to add player. ").append(p_779_1_).append(" already is in chunk ").append(field_1071_c).append(", ").append(field_1070_d).toString());
        } else
        {
            p_779_1_.field_420_ah.add(field_1069_e);
            p_779_1_.field_20908_a.func_39_b(new Packet50PreChunk(field_1069_e.field_152_a, field_1069_e.field_151_b, true));
            field_1072_b.add(p_779_1_);
            p_779_1_.field_422_ag.add(field_1069_e);
            return;
        }
    }

    public void func_778_b(EntityPlayerMP p_778_1_)
    {
        if(!field_1072_b.contains(p_778_1_))
        {
            return;
        }
        field_1072_b.remove(p_778_1_);
        if(field_1072_b.size() == 0)
        {
            long l = (long)field_1071_c + 0x7fffffffL | (long)field_1070_d + 0x7fffffffL << 32;
            PlayerManager.func_539_b(field_1073_a).func_670_b(l);
            if(field_1067_g > 0)
            {
                PlayerManager.func_533_c(field_1073_a).remove(this);
            }
            field_1073_a.func_540_a().field_20911_y.func_374_c(field_1071_c, field_1070_d);
        }
        p_778_1_.field_422_ag.remove(field_1069_e);
        if(p_778_1_.field_420_ah.contains(field_1069_e))
        {
            p_778_1_.field_20908_a.func_39_b(new Packet50PreChunk(field_1071_c, field_1070_d, false));
        }
    }

    public void func_775_a(int p_775_1_, int p_775_2_, int p_775_3_)
    {
        if(field_1067_g == 0)
        {
            PlayerManager.func_533_c(field_1073_a).add(this);
        }
        field_48475_h |= 1 << (p_775_2_ >> 4);
        if(field_1067_g < 64)
        {
            short word0 = (short)(p_775_1_ << 12 | p_775_3_ << 8 | p_775_2_);
            for(int i = 0; i < field_1067_g; i++)
            {
                if(field_1068_f[i] == word0)
                {
                    return;
                }
            }

            field_1068_f[field_1067_g++] = word0;
        }
    }

    public void func_776_a(Packet p_776_1_)
    {
        for(int i = 0; i < field_1072_b.size(); i++)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)field_1072_b.get(i);
            if(entityplayermp.field_420_ah.contains(field_1069_e) && !entityplayermp.field_422_ag.contains(field_1069_e))
            {
                entityplayermp.field_20908_a.func_39_b(p_776_1_);
            }
        }

    }

    public void func_777_a()
    {
        WorldServer worldserver = field_1073_a.func_540_a();
        if(field_1067_g == 0)
        {
            return;
        }
        if(field_1067_g == 1)
        {
            int i = field_1071_c * 16 + (field_1068_f[0] >> 12 & 0xf);
            int l = field_1068_f[0] & 0xff;
            int k1 = field_1070_d * 16 + (field_1068_f[0] >> 8 & 0xf);
            func_776_a(new Packet53BlockChange(i, l, k1, worldserver));
            if(worldserver.func_48084_h(i, l, k1))
            {
                func_20178_a(worldserver.func_451_k(i, l, k1));
            }
        } else
        if(field_1067_g == 64)
        {
            int j = field_1071_c * 16;
            int i1 = field_1070_d * 16;
            func_776_a(new Packet51MapChunk(worldserver.func_525_b(field_1071_c, field_1070_d), false, field_48475_h));
            for(int l1 = 0; l1 < 16; l1++)
            {
                if((field_48475_h & 1 << l1) != 0)
                {
                    int j2 = l1 << 4;
                    List list = worldserver.func_532_d(j, j2, i1, j + 16, j2 + 16, i1 + 16);
                    for(int l2 = 0; l2 < list.size(); l2++)
                    {
                        func_20178_a((TileEntity)list.get(l2));
                    }

                }
            }

        } else
        {
            func_776_a(new Packet52MultiBlockChange(field_1071_c, field_1070_d, field_1068_f, field_1067_g, worldserver));
            for(int k = 0; k < field_1067_g; k++)
            {
                int j1 = field_1071_c * 16 + (field_1068_f[k] >> 12 & 0xf);
                int i2 = field_1068_f[k] & 0xff;
                int k2 = field_1070_d * 16 + (field_1068_f[k] >> 8 & 0xf);
                if(worldserver.func_48084_h(j1, i2, k2))
                {
                    func_20178_a(worldserver.func_451_k(j1, i2, k2));
                }
            }

        }
        field_1067_g = 0;
        field_48475_h = 0;
    }

    private void func_20178_a(TileEntity p_20178_1_)
    {
        if(p_20178_1_ != null)
        {
            Packet packet = p_20178_1_.func_20070_f();
            if(packet != null)
            {
                func_776_a(packet);
            }
        }
    }
}
