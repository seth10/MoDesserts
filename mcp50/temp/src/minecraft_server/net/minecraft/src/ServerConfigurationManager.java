// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            PlayerManager, PropertyManager, WorldServer, ISaveHandler, 
//            EntityPlayerMP, ChunkProviderServer, IPlayerFileData, Packet201PlayerInfo, 
//            NetServerHandler, NetLoginHandler, NetworkManager, ItemInWorldManager, 
//            EntityTracker, WorldInfo, EntityPlayer, ChunkCoordinates, 
//            Packet70Bed, Packet9Respawn, World, Teleporter, 
//            Packet3Chat, Packet4UpdateTime, PlayerUsageSnooper, Packet, 
//            TileEntity

public class ServerConfigurationManager
{

    public static Logger field_925_a = Logger.getLogger("Minecraft");
    public List field_924_b;
    private MinecraftServer field_923_c;
    private PlayerManager field_922_d[];
    private int field_9253_e;
    private Set field_9252_f;
    private Set field_919_g;
    private Set field_918_h;
    private Set field_22174_i;
    private File field_917_i;
    private File field_9251_j;
    private File field_9250_k;
    private File field_22173_m;
    private IPlayerFileData field_914_l;
    private boolean field_22172_o;
    private int field_35482_p;

    public ServerConfigurationManager(MinecraftServer p_i194_1_)
    {
        field_924_b = new ArrayList();
        field_9252_f = new HashSet();
        field_919_g = new HashSet();
        field_918_h = new HashSet();
        field_22174_i = new HashSet();
        field_35482_p = 0;
        field_922_d = new PlayerManager[3];
        field_923_c = p_i194_1_;
        field_917_i = p_i194_1_.func_6009_a("banned-players.txt");
        field_9251_j = p_i194_1_.func_6009_a("banned-ips.txt");
        field_9250_k = p_i194_1_.func_6009_a("ops.txt");
        field_22173_m = p_i194_1_.func_6009_a("white-list.txt");
        int i = p_i194_1_.field_6035_d.func_722_a("view-distance", 10);
        field_922_d[0] = new PlayerManager(p_i194_1_, 0, i);
        field_922_d[1] = new PlayerManager(p_i194_1_, -1, i);
        field_922_d[2] = new PlayerManager(p_i194_1_, 1, i);
        field_9253_e = p_i194_1_.field_6035_d.func_722_a("max-players", 20);
        field_22172_o = p_i194_1_.field_6035_d.func_724_a("white-list", false);
        func_623_e();
        func_9245_g();
        func_9249_i();
        func_22168_m();
        func_626_f();
        func_9248_h();
        func_9239_j();
        func_22160_n();
    }

    public void func_618_a(WorldServer p_618_1_[])
    {
        field_914_l = p_618_1_[0].func_22075_m().func_22090_d();
    }

    public void func_28172_a(EntityPlayerMP p_28172_1_)
    {
        field_922_d[0].func_9213_b(p_28172_1_);
        field_922_d[1].func_9213_b(p_28172_1_);
        field_922_d[2].func_9213_b(p_28172_1_);
        func_28167_a(p_28172_1_.field_4110_as).func_9214_a(p_28172_1_);
        WorldServer worldserver = field_923_c.func_28004_a(p_28172_1_.field_4110_as);
        worldserver.field_20911_y.func_376_d((int)p_28172_1_.field_322_l >> 4, (int)p_28172_1_.field_320_n >> 4);
    }

    public int func_640_a()
    {
        return field_922_d[0].func_542_b();
    }

    private PlayerManager func_28167_a(int p_28167_1_)
    {
        if(p_28167_1_ == -1)
        {
            return field_922_d[1];
        }
        if(p_28167_1_ == 0)
        {
            return field_922_d[0];
        }
        if(p_28167_1_ == 1)
        {
            return field_922_d[2];
        } else
        {
            return null;
        }
    }

    public void func_28166_b(EntityPlayerMP p_28166_1_)
    {
        field_914_l.func_725_b(p_28166_1_);
    }

    public void func_627_a(EntityPlayerMP p_627_1_)
    {
        func_631_a(new Packet201PlayerInfo(p_627_1_.field_409_aq, true, 1000));
        field_924_b.add(p_627_1_);
        WorldServer worldserver = field_923_c.func_28004_a(p_627_1_.field_4110_as);
        worldserver.field_20911_y.func_376_d((int)p_627_1_.field_322_l >> 4, (int)p_627_1_.field_320_n >> 4);
        for(; worldserver.func_481_a(p_627_1_, p_627_1_.field_312_v).size() != 0; p_627_1_.func_86_a(p_627_1_.field_322_l, p_627_1_.field_321_m + 1.0D, p_627_1_.field_320_n)) { }
        worldserver.func_526_a(p_627_1_);
        func_28167_a(p_627_1_.field_4110_as).func_9214_a(p_627_1_);
        func_52018_u();
        for(int i = 0; i < field_924_b.size(); i++)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)field_924_b.get(i);
            p_627_1_.field_20908_a.func_39_b(new Packet201PlayerInfo(entityplayermp.field_409_aq, true, entityplayermp.field_35219_i));
        }

    }

    public void func_613_b(EntityPlayerMP p_613_1_)
    {
        func_28167_a(p_613_1_.field_4110_as).func_543_c(p_613_1_);
    }

    public void func_616_c(EntityPlayerMP p_616_1_)
    {
        field_914_l.func_726_a(p_616_1_);
        field_923_c.func_28004_a(p_616_1_.field_4110_as).func_22085_d(p_616_1_);
        field_924_b.remove(p_616_1_);
        func_28167_a(p_616_1_.field_4110_as).func_9213_b(p_616_1_);
        func_631_a(new Packet201PlayerInfo(p_616_1_.field_409_aq, false, 9999));
    }

    public EntityPlayerMP func_619_a(NetLoginHandler p_619_1_, String p_619_2_)
    {
        if(field_9252_f.contains(p_619_2_.trim().toLowerCase()))
        {
            p_619_1_.func_34_b("You are banned from this server!");
            return null;
        }
        if(!func_22166_g(p_619_2_))
        {
            p_619_1_.func_34_b("You are not white-listed on this server!");
            return null;
        }
        String s = p_619_1_.field_8_b.func_755_b().toString();
        s = s.substring(s.indexOf("/") + 1);
        s = s.substring(0, s.indexOf(":"));
        if(field_919_g.contains(s))
        {
            p_619_1_.func_34_b("Your IP address is banned from this server!");
            return null;
        }
        if(field_924_b.size() >= field_9253_e)
        {
            p_619_1_.func_34_b("The server is full!");
            return null;
        }
        for(int i = 0; i < field_924_b.size(); i++)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)field_924_b.get(i);
            if(entityplayermp.field_409_aq.equalsIgnoreCase(p_619_2_))
            {
                entityplayermp.field_20908_a.func_43_c("You logged in from another location");
            }
        }

        return new EntityPlayerMP(field_923_c, field_923_c.func_28004_a(0), p_619_2_, new ItemInWorldManager(field_923_c.func_28004_a(0)));
    }

    public EntityPlayerMP func_9242_d(EntityPlayerMP p_9242_1_, int p_9242_2_, boolean p_9242_3_)
    {
        field_923_c.func_28003_b(p_9242_1_.field_4110_as).func_9238_a(p_9242_1_);
        field_923_c.func_28003_b(p_9242_1_.field_4110_as).func_610_b(p_9242_1_);
        func_28167_a(p_9242_1_.field_4110_as).func_9213_b(p_9242_1_);
        field_924_b.remove(p_9242_1_);
        field_923_c.func_28004_a(p_9242_1_.field_4110_as).func_22073_e(p_9242_1_);
        ChunkCoordinates chunkcoordinates = p_9242_1_.func_25049_H();
        p_9242_1_.field_4110_as = p_9242_2_;
        EntityPlayerMP entityplayermp = new EntityPlayerMP(field_923_c, field_923_c.func_28004_a(p_9242_1_.field_4110_as), p_9242_1_.field_409_aq, new ItemInWorldManager(field_923_c.func_28004_a(p_9242_1_.field_4110_as)));
        if(p_9242_3_)
        {
            entityplayermp.func_41031_d(p_9242_1_);
        }
        entityplayermp.field_331_c = p_9242_1_.field_331_c;
        entityplayermp.field_20908_a = p_9242_1_.field_20908_a;
        WorldServer worldserver = field_923_c.func_28004_a(p_9242_1_.field_4110_as);
        entityplayermp.field_425_ad.func_35696_a(p_9242_1_.field_425_ad.func_35697_a());
        entityplayermp.field_425_ad.func_35695_b(worldserver.func_22081_n().func_35501_n());
        if(chunkcoordinates != null)
        {
            ChunkCoordinates chunkcoordinates1 = EntityPlayer.func_25051_a(field_923_c.func_28004_a(p_9242_1_.field_4110_as), chunkcoordinates);
            if(chunkcoordinates1 != null)
            {
                entityplayermp.func_107_c((float)chunkcoordinates1.field_22216_a + 0.5F, (float)chunkcoordinates1.field_529_a + 0.1F, (float)chunkcoordinates1.field_528_b + 0.5F, 0.0F, 0.0F);
                entityplayermp.func_25050_a(chunkcoordinates);
            } else
            {
                entityplayermp.field_20908_a.func_39_b(new Packet70Bed(0, 0));
            }
        }
        worldserver.field_20911_y.func_376_d((int)entityplayermp.field_322_l >> 4, (int)entityplayermp.field_320_n >> 4);
        for(; worldserver.func_481_a(entityplayermp, entityplayermp.field_312_v).size() != 0; entityplayermp.func_86_a(entityplayermp.field_322_l, entityplayermp.field_321_m + 1.0D, entityplayermp.field_320_n)) { }
        entityplayermp.field_20908_a.func_39_b(new Packet9Respawn(entityplayermp.field_4110_as, (byte)entityplayermp.field_9093_l.field_804_l, entityplayermp.field_9093_l.func_22081_n().func_46069_q(), entityplayermp.field_9093_l.func_48095_y(), entityplayermp.field_425_ad.func_35697_a()));
        entityplayermp.field_20908_a.func_41_a(entityplayermp.field_322_l, entityplayermp.field_321_m, entityplayermp.field_320_n, entityplayermp.field_316_r, entityplayermp.field_315_s);
        func_28170_a(entityplayermp, worldserver);
        func_28167_a(entityplayermp.field_4110_as).func_9214_a(entityplayermp);
        worldserver.func_526_a(entityplayermp);
        field_924_b.add(entityplayermp);
        entityplayermp.func_20057_k();
        entityplayermp.func_22068_s();
        return entityplayermp;
    }

    public void func_28168_f(EntityPlayerMP p_28168_1_, int p_28168_2_)
    {
        int i = p_28168_1_.field_4110_as;
        WorldServer worldserver = field_923_c.func_28004_a(p_28168_1_.field_4110_as);
        p_28168_1_.field_4110_as = p_28168_2_;
        WorldServer worldserver1 = field_923_c.func_28004_a(p_28168_1_.field_4110_as);
        p_28168_1_.field_20908_a.func_39_b(new Packet9Respawn(p_28168_1_.field_4110_as, (byte)p_28168_1_.field_9093_l.field_804_l, worldserver1.func_22081_n().func_46069_q(), worldserver1.func_48095_y(), p_28168_1_.field_425_ad.func_35697_a()));
        worldserver.func_22073_e(p_28168_1_);
        p_28168_1_.field_304_B = false;
        double d = p_28168_1_.field_322_l;
        double d1 = p_28168_1_.field_320_n;
        double d2 = 8D;
        if(p_28168_1_.field_4110_as == -1)
        {
            d /= d2;
            d1 /= d2;
            p_28168_1_.func_107_c(d, p_28168_1_.field_321_m, d1, p_28168_1_.field_316_r, p_28168_1_.field_315_s);
            if(p_28168_1_.func_120_t())
            {
                worldserver.func_4074_a(p_28168_1_, false);
            }
        } else
        if(p_28168_1_.field_4110_as == 0)
        {
            d *= d2;
            d1 *= d2;
            p_28168_1_.func_107_c(d, p_28168_1_.field_321_m, d1, p_28168_1_.field_316_r, p_28168_1_.field_315_s);
            if(p_28168_1_.func_120_t())
            {
                worldserver.func_4074_a(p_28168_1_, false);
            }
        } else
        {
            ChunkCoordinates chunkcoordinates = worldserver1.func_40212_d();
            d = chunkcoordinates.field_22216_a;
            p_28168_1_.field_321_m = chunkcoordinates.field_529_a;
            d1 = chunkcoordinates.field_528_b;
            p_28168_1_.func_107_c(d, p_28168_1_.field_321_m, d1, 90F, 0.0F);
            if(p_28168_1_.func_120_t())
            {
                worldserver.func_4074_a(p_28168_1_, false);
            }
        }
        if(i != 1 && p_28168_1_.func_120_t())
        {
            worldserver1.func_526_a(p_28168_1_);
            p_28168_1_.func_107_c(d, p_28168_1_.field_321_m, d1, p_28168_1_.field_316_r, p_28168_1_.field_315_s);
            worldserver1.func_4074_a(p_28168_1_, false);
            worldserver1.field_20911_y.field_28068_a = true;
            (new Teleporter()).func_28115_a(worldserver1, p_28168_1_);
            worldserver1.field_20911_y.field_28068_a = false;
        }
        func_28172_a(p_28168_1_);
        p_28168_1_.field_20908_a.func_41_a(p_28168_1_.field_322_l, p_28168_1_.field_321_m, p_28168_1_.field_320_n, p_28168_1_.field_316_r, p_28168_1_.field_315_s);
        p_28168_1_.func_28007_a(worldserver1);
        p_28168_1_.field_425_ad.func_35694_a(worldserver1);
        func_28170_a(p_28168_1_, worldserver1);
        func_30008_g(p_28168_1_);
    }

    public void func_637_b()
    {
        if(++field_35482_p > 200)
        {
            field_35482_p = 0;
        }
        if(field_35482_p < field_924_b.size())
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)field_924_b.get(field_35482_p);
            func_631_a(new Packet201PlayerInfo(entityplayermp.field_409_aq, true, entityplayermp.field_35219_i));
        }
        for(int i = 0; i < field_922_d.length; i++)
        {
            field_922_d[i].func_538_a();
        }

    }

    public void func_622_a(int p_622_1_, int p_622_2_, int p_622_3_, int p_622_4_)
    {
        func_28167_a(p_622_4_).func_535_a(p_622_1_, p_622_2_, p_622_3_);
    }

    public void func_631_a(Packet p_631_1_)
    {
        for(int i = 0; i < field_924_b.size(); i++)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)field_924_b.get(i);
            entityplayermp.field_20908_a.func_39_b(p_631_1_);
        }

    }

    public void func_28169_a(Packet p_28169_1_, int p_28169_2_)
    {
        for(int i = 0; i < field_924_b.size(); i++)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)field_924_b.get(i);
            if(entityplayermp.field_4110_as == p_28169_2_)
            {
                entityplayermp.field_20908_a.func_39_b(p_28169_1_);
            }
        }

    }

    public String func_633_c()
    {
        String s = "";
        for(int i = 0; i < field_924_b.size(); i++)
        {
            if(i > 0)
            {
                s = (new StringBuilder()).append(s).append(", ").toString();
            }
            s = (new StringBuilder()).append(s).append(((EntityPlayerMP)field_924_b.get(i)).field_409_aq).toString();
        }

        return s;
    }

    public String[] func_40575_d()
    {
        String as[] = new String[field_924_b.size()];
        for(int i = 0; i < field_924_b.size(); i++)
        {
            as[i] = ((EntityPlayerMP)field_924_b.get(i)).field_409_aq;
        }

        return as;
    }

    public void func_22159_a(String p_22159_1_)
    {
        field_9252_f.add(p_22159_1_.toLowerCase());
        func_626_f();
    }

    public void func_22161_b(String p_22161_1_)
    {
        field_9252_f.remove(p_22161_1_.toLowerCase());
        func_626_f();
    }

    private void func_623_e()
    {
        try
        {
            field_9252_f.clear();
            BufferedReader bufferedreader = new BufferedReader(new FileReader(field_917_i));
            for(String s = ""; (s = bufferedreader.readLine()) != null;)
            {
                field_9252_f.add(s.trim().toLowerCase());
            }

            bufferedreader.close();
        }
        catch(Exception exception)
        {
            field_925_a.warning((new StringBuilder()).append("Failed to load ban list: ").append(exception).toString());
        }
    }

    private void func_626_f()
    {
        try
        {
            PrintWriter printwriter = new PrintWriter(new FileWriter(field_917_i, false));
            String s;
            for(Iterator iterator = field_9252_f.iterator(); iterator.hasNext(); printwriter.println(s))
            {
                s = (String)iterator.next();
            }

            printwriter.close();
        }
        catch(Exception exception)
        {
            field_925_a.warning((new StringBuilder()).append("Failed to save ban list: ").append(exception).toString());
        }
    }

    public Set func_40576_e()
    {
        return field_9252_f;
    }

    public Set func_40574_f()
    {
        return field_919_g;
    }

    public void func_22162_c(String p_22162_1_)
    {
        field_919_g.add(p_22162_1_.toLowerCase());
        func_9248_h();
    }

    public void func_22163_d(String p_22163_1_)
    {
        field_919_g.remove(p_22163_1_.toLowerCase());
        func_9248_h();
    }

    private void func_9245_g()
    {
        try
        {
            field_919_g.clear();
            BufferedReader bufferedreader = new BufferedReader(new FileReader(field_9251_j));
            for(String s = ""; (s = bufferedreader.readLine()) != null;)
            {
                field_919_g.add(s.trim().toLowerCase());
            }

            bufferedreader.close();
        }
        catch(Exception exception)
        {
            field_925_a.warning((new StringBuilder()).append("Failed to load ip ban list: ").append(exception).toString());
        }
    }

    private void func_9248_h()
    {
        try
        {
            PrintWriter printwriter = new PrintWriter(new FileWriter(field_9251_j, false));
            String s;
            for(Iterator iterator = field_919_g.iterator(); iterator.hasNext(); printwriter.println(s))
            {
                s = (String)iterator.next();
            }

            printwriter.close();
        }
        catch(Exception exception)
        {
            field_925_a.warning((new StringBuilder()).append("Failed to save ip ban list: ").append(exception).toString());
        }
    }

    public void func_35479_e(String p_35479_1_)
    {
        field_918_h.add(p_35479_1_.toLowerCase());
        func_9239_j();
    }

    public void func_35478_f(String p_35478_1_)
    {
        field_918_h.remove(p_35478_1_.toLowerCase());
        func_9239_j();
    }

    private void func_9249_i()
    {
        try
        {
            field_918_h.clear();
            BufferedReader bufferedreader = new BufferedReader(new FileReader(field_9250_k));
            for(String s = ""; (s = bufferedreader.readLine()) != null;)
            {
                field_918_h.add(s.trim().toLowerCase());
            }

            bufferedreader.close();
        }
        catch(Exception exception)
        {
            field_925_a.warning((new StringBuilder()).append("Failed to load operators list: ").append(exception).toString());
        }
    }

    private void func_9239_j()
    {
        try
        {
            PrintWriter printwriter = new PrintWriter(new FileWriter(field_9250_k, false));
            String s;
            for(Iterator iterator = field_918_h.iterator(); iterator.hasNext(); printwriter.println(s))
            {
                s = (String)iterator.next();
            }

            printwriter.close();
        }
        catch(Exception exception)
        {
            field_925_a.warning((new StringBuilder()).append("Failed to save operators list: ").append(exception).toString());
        }
    }

    private void func_22168_m()
    {
        try
        {
            field_22174_i.clear();
            BufferedReader bufferedreader = new BufferedReader(new FileReader(field_22173_m));
            for(String s = ""; (s = bufferedreader.readLine()) != null;)
            {
                field_22174_i.add(s.trim().toLowerCase());
            }

            bufferedreader.close();
        }
        catch(Exception exception)
        {
            field_925_a.warning((new StringBuilder()).append("Failed to load white-list: ").append(exception).toString());
        }
    }

    private void func_22160_n()
    {
        try
        {
            PrintWriter printwriter = new PrintWriter(new FileWriter(field_22173_m, false));
            String s;
            for(Iterator iterator = field_22174_i.iterator(); iterator.hasNext(); printwriter.println(s))
            {
                s = (String)iterator.next();
            }

            printwriter.close();
        }
        catch(Exception exception)
        {
            field_925_a.warning((new StringBuilder()).append("Failed to save white-list: ").append(exception).toString());
        }
    }

    public boolean func_22166_g(String p_22166_1_)
    {
        p_22166_1_ = p_22166_1_.trim().toLowerCase();
        return !field_22172_o || field_918_h.contains(p_22166_1_) || field_22174_i.contains(p_22166_1_);
    }

    public boolean func_639_g(String p_639_1_)
    {
        return field_918_h.contains(p_639_1_.trim().toLowerCase());
    }

    public EntityPlayerMP func_620_h(String p_620_1_)
    {
        for(int i = 0; i < field_924_b.size(); i++)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)field_924_b.get(i);
            if(entityplayermp.field_409_aq.equalsIgnoreCase(p_620_1_))
            {
                return entityplayermp;
            }
        }

        return null;
    }

    public void func_628_a(String p_628_1_, String p_628_2_)
    {
        EntityPlayerMP entityplayermp = func_620_h(p_628_1_);
        if(entityplayermp != null)
        {
            entityplayermp.field_20908_a.func_39_b(new Packet3Chat(p_628_2_));
        }
    }

    public void func_12022_a(double p_12022_1_, double p_12022_3_, double p_12022_5_, double p_12022_7_, int p_12022_9_, Packet p_12022_10_)
    {
        func_28171_a(null, p_12022_1_, p_12022_3_, p_12022_5_, p_12022_7_, p_12022_9_, p_12022_10_);
    }

    public void func_28171_a(EntityPlayer p_28171_1_, double p_28171_2_, double p_28171_4_, double p_28171_6_, 
            double p_28171_8_, int p_28171_10_, Packet p_28171_11_)
    {
        for(int i = 0; i < field_924_b.size(); i++)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)field_924_b.get(i);
            if(entityplayermp == p_28171_1_ || entityplayermp.field_4110_as != p_28171_10_)
            {
                continue;
            }
            double d = p_28171_2_ - entityplayermp.field_322_l;
            double d1 = p_28171_4_ - entityplayermp.field_321_m;
            double d2 = p_28171_6_ - entityplayermp.field_320_n;
            if(d * d + d1 * d1 + d2 * d2 < p_28171_8_ * p_28171_8_)
            {
                entityplayermp.field_20908_a.func_39_b(p_28171_11_);
            }
        }

    }

    public void func_630_i(String p_630_1_)
    {
        Packet3Chat packet3chat = new Packet3Chat(p_630_1_);
        for(int i = 0; i < field_924_b.size(); i++)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)field_924_b.get(i);
            if(func_639_g(entityplayermp.field_409_aq))
            {
                entityplayermp.field_20908_a.func_39_b(packet3chat);
            }
        }

    }

    public boolean func_621_a(String p_621_1_, Packet p_621_2_)
    {
        EntityPlayerMP entityplayermp = func_620_h(p_621_1_);
        if(entityplayermp != null)
        {
            entityplayermp.field_20908_a.func_39_b(p_621_2_);
            return true;
        } else
        {
            return false;
        }
    }

    public void func_617_d()
    {
        for(int i = 0; i < field_924_b.size(); i++)
        {
            field_914_l.func_726_a((EntityPlayer)field_924_b.get(i));
        }

    }

    public void func_636_a(int i, int j, int k, TileEntity tileentity)
    {
    }

    public void func_22169_k(String p_22169_1_)
    {
        field_22174_i.add(p_22169_1_);
        func_22160_n();
    }

    public void func_22170_l(String p_22170_1_)
    {
        field_22174_i.remove(p_22170_1_);
        func_22160_n();
    }

    public Set func_22167_e()
    {
        return field_22174_i;
    }

    public void func_22171_f()
    {
        func_22168_m();
    }

    public void func_28170_a(EntityPlayerMP p_28170_1_, WorldServer p_28170_2_)
    {
        p_28170_1_.field_20908_a.func_39_b(new Packet4UpdateTime(p_28170_2_.func_22080_k()));
        if(p_28170_2_.func_27068_v())
        {
            p_28170_1_.field_20908_a.func_39_b(new Packet70Bed(1, 0));
        }
    }

    public void func_30008_g(EntityPlayerMP p_30008_1_)
    {
        p_30008_1_.func_28017_a(p_30008_1_.field_20053_ao);
        p_30008_1_.func_30001_B();
    }

    public int func_35481_g()
    {
        return field_924_b.size();
    }

    public int func_35480_h()
    {
        return field_9253_e;
    }

    public String[] func_52019_t()
    {
        return field_923_c.field_6034_e[0].func_22075_m().func_22090_d().func_52007_g();
    }

    private void func_52018_u()
    {
        PlayerUsageSnooper playerusagesnooper = new PlayerUsageSnooper("server");
        playerusagesnooper.func_52014_a("version", field_923_c.func_40012_i());
        playerusagesnooper.func_52014_a("os_name", System.getProperty("os.name"));
        playerusagesnooper.func_52014_a("os_version", System.getProperty("os.version"));
        playerusagesnooper.func_52014_a("os_architecture", System.getProperty("os.arch"));
        playerusagesnooper.func_52014_a("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
        playerusagesnooper.func_52014_a("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
        playerusagesnooper.func_52014_a("memory_free", Long.valueOf(Runtime.getRuntime().freeMemory()));
        playerusagesnooper.func_52014_a("java_version", System.getProperty("java.version"));
        playerusagesnooper.func_52014_a("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        playerusagesnooper.func_52014_a("players_current", Integer.valueOf(func_35481_g()));
        playerusagesnooper.func_52014_a("players_max", Integer.valueOf(func_35480_h()));
        playerusagesnooper.func_52014_a("players_seen", Integer.valueOf(func_52019_t().length));
        playerusagesnooper.func_52014_a("uses_auth", Boolean.valueOf(field_923_c.field_6027_l));
        playerusagesnooper.func_52014_a("server_brand", field_923_c.func_52003_getServerModName());
        playerusagesnooper.func_52012_a();
    }

}
