// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.net.Socket;
import java.util.*;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            NetHandler, NetworkManager, Packet255KickDisconnect, Packet2Handshake, 
//            Packet1Login, ThreadLoginVerifier, ServerConfigurationManager, EntityPlayerMP, 
//            WorldServer, ItemInWorldManager, WorldInfo, NetServerHandler, 
//            WorldProvider, Packet6SpawnPosition, ChunkCoordinates, Packet202PlayerAbilities, 
//            Packet3Chat, NetworkListenThread, Packet4UpdateTime, PotionEffect, 
//            Packet41EntityEffect, Packet254ServerPing, Packet

public class NetLoginHandler extends NetHandler
{

    public static Logger field_9_a = Logger.getLogger("Minecraft");
    private static Random field_6_d = new Random();
    public NetworkManager field_8_b;
    public boolean field_7_c;
    private MinecraftServer field_5_e;
    private int field_9005_f;
    private String field_3_g;
    private Packet1Login field_9004_h;
    private String field_1_i;

    public NetLoginHandler(MinecraftServer p_i160_1_, Socket p_i160_2_, String p_i160_3_)
        throws IOException
    {
        field_7_c = false;
        field_9005_f = 0;
        field_3_g = null;
        field_9004_h = null;
        field_1_i = "";
        field_5_e = p_i160_1_;
        field_8_b = new NetworkManager(p_i160_2_, p_i160_3_, this);
        field_8_b.field_1034_t = 0;
    }

    public void func_33_a()
    {
        if(field_9004_h != null)
        {
            func_6007_b(field_9004_h);
            field_9004_h = null;
        }
        if(field_9005_f++ == 600)
        {
            func_34_b("Took too long to log in");
        } else
        {
            field_8_b.func_747_a();
        }
    }

    public void func_34_b(String p_34_1_)
    {
        try
        {
            field_9_a.info((new StringBuilder()).append("Disconnecting ").append(func_35_b()).append(": ").append(p_34_1_).toString());
            field_8_b.func_745_a(new Packet255KickDisconnect(p_34_1_));
            field_8_b.func_752_c();
            field_7_c = true;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_6004_a(Packet2Handshake p_6004_1_)
    {
        if(field_5_e.field_6027_l)
        {
            field_1_i = Long.toString(field_6_d.nextLong(), 16);
            field_8_b.func_745_a(new Packet2Handshake(field_1_i));
        } else
        {
            field_8_b.func_745_a(new Packet2Handshake("-"));
        }
    }

    public void func_4001_a(Packet1Login p_4001_1_)
    {
        field_3_g = p_4001_1_.field_113_b;
        if(p_4001_1_.field_4024_a != 29)
        {
            if(p_4001_1_.field_4024_a > 29)
            {
                func_34_b("Outdated server!");
            } else
            {
                func_34_b("Outdated client!");
            }
            return;
        }
        if(!field_5_e.field_6027_l)
        {
            func_6007_b(p_4001_1_);
        } else
        {
            (new ThreadLoginVerifier(this, p_4001_1_)).start();
        }
    }

    public void func_6007_b(Packet1Login p_6007_1_)
    {
        EntityPlayerMP entityplayermp = field_5_e.field_6033_f.func_619_a(this, p_6007_1_.field_113_b);
        if(entityplayermp != null)
        {
            field_5_e.field_6033_f.func_28166_b(entityplayermp);
            entityplayermp.func_28007_a(field_5_e.func_28004_a(entityplayermp.field_4110_as));
            entityplayermp.field_425_ad.func_35694_a((WorldServer)entityplayermp.field_9093_l);
            field_9_a.info((new StringBuilder()).append(func_35_b()).append(" logged in with entity id ").append(entityplayermp.field_331_c).append(" at (").append(entityplayermp.field_322_l).append(", ").append(entityplayermp.field_321_m).append(", ").append(entityplayermp.field_320_n).append(")").toString());
            WorldServer worldserver = field_5_e.func_28004_a(entityplayermp.field_4110_as);
            ChunkCoordinates chunkcoordinates = worldserver.func_22078_l();
            entityplayermp.field_425_ad.func_35695_b(worldserver.func_22081_n().func_35501_n());
            NetServerHandler netserverhandler = new NetServerHandler(field_5_e, field_8_b, entityplayermp);
            netserverhandler.func_39_b(new Packet1Login("", entityplayermp.field_331_c, worldserver.func_22081_n().func_46069_q(), entityplayermp.field_425_ad.func_35697_a(), worldserver.field_4272_q.field_6165_g, (byte)worldserver.field_804_l, (byte)worldserver.func_48095_y(), (byte)field_5_e.field_6033_f.func_35480_h()));
            netserverhandler.func_39_b(new Packet6SpawnPosition(chunkcoordinates.field_22216_a, chunkcoordinates.field_529_a, chunkcoordinates.field_528_b));
            netserverhandler.func_39_b(new Packet202PlayerAbilities(entityplayermp.field_35214_K));
            field_5_e.field_6033_f.func_28170_a(entityplayermp, worldserver);
            field_5_e.field_6033_f.func_631_a(new Packet3Chat((new StringBuilder()).append("\247e").append(entityplayermp.field_409_aq).append(" joined the game.").toString()));
            field_5_e.field_6033_f.func_627_a(entityplayermp);
            netserverhandler.func_41_a(entityplayermp.field_322_l, entityplayermp.field_321_m, entityplayermp.field_320_n, entityplayermp.field_316_r, entityplayermp.field_315_s);
            field_5_e.field_6036_c.func_4108_a(netserverhandler);
            netserverhandler.func_39_b(new Packet4UpdateTime(worldserver.func_22080_k()));
            PotionEffect potioneffect;
            for(Iterator iterator = entityplayermp.func_35183_ak().iterator(); iterator.hasNext(); netserverhandler.func_39_b(new Packet41EntityEffect(entityplayermp.field_331_c, potioneffect)))
            {
                potioneffect = (PotionEffect)iterator.next();
            }

            entityplayermp.func_20057_k();
        }
        field_7_c = true;
    }

    public void func_6_a(String p_6_1_, Object p_6_2_[])
    {
        field_9_a.info((new StringBuilder()).append(func_35_b()).append(" lost connection").toString());
        field_7_c = true;
    }

    public void func_35007_a(Packet254ServerPing p_35007_1_)
    {
        try
        {
            String s = (new StringBuilder()).append(field_5_e.field_35014_p).append("\247").append(field_5_e.field_6033_f.func_35481_g()).append("\247").append(field_5_e.field_6033_f.func_35480_h()).toString();
            field_8_b.func_745_a(new Packet255KickDisconnect(s));
            field_8_b.func_752_c();
            field_5_e.field_6036_c.func_35505_a(field_8_b.func_35596_f());
            field_7_c = true;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_6001_a(Packet p_6001_1_)
    {
        func_34_b("Protocol error");
    }

    public String func_35_b()
    {
        if(field_3_g != null)
        {
            return (new StringBuilder()).append(field_3_g).append(" [").append(field_8_b.func_755_b().toString()).append("]").toString();
        } else
        {
            return field_8_b.func_755_b().toString();
        }
    }

    public boolean func_27003_c()
    {
        return true;
    }

    static String func_32_a(NetLoginHandler p_32_0_)
    {
        return p_32_0_.field_1_i;
    }

    static Packet1Login func_31_a(NetLoginHandler p_31_0_, Packet1Login p_31_1_)
    {
        return p_31_0_.field_9004_h = p_31_1_;
    }

}
