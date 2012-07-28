// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            ServerCommand, ICommandListener, ServerConfigurationManager, WorldServer, 
//            EntityPlayerMP, NetServerHandler, Item, ItemStack, 
//            WorldSettings, ItemInWorldManager, Packet70Bed, Packet3Chat, 
//            PropertyManager

public class ConsoleCommandHandler
{

    private static Logger field_22117_a = Logger.getLogger("Minecraft");
    private MinecraftServer field_22116_b;

    public ConsoleCommandHandler(MinecraftServer p_i461_1_)
    {
        field_22116_b = p_i461_1_;
    }

    public synchronized void func_22114_a(ServerCommand p_22114_1_)
    {
        String s = p_22114_1_.field_1060_a;
        String as[] = s.split(" ");
        String s1 = as[0];
        String s2 = s.substring(s1.length()).trim();
        ICommandListener icommandlistener = p_22114_1_.field_1059_b;
        String s3 = icommandlistener.func_1_c();
        ServerConfigurationManager serverconfigurationmanager = field_22116_b.field_6033_f;
        if(s1.equalsIgnoreCase("help") || s1.equalsIgnoreCase("?"))
        {
            func_22111_a(icommandlistener);
        } else
        if(s1.equalsIgnoreCase("list"))
        {
            icommandlistener.func_2_b((new StringBuilder()).append("Connected players: ").append(serverconfigurationmanager.func_633_c()).toString());
        } else
        if(s1.equalsIgnoreCase("stop"))
        {
            func_22115_a(s3, "Stopping the server..");
            field_22116_b.func_6016_a();
        } else
        if(s1.equalsIgnoreCase("save-all"))
        {
            func_22115_a(s3, "Forcing save..");
            if(serverconfigurationmanager != null)
            {
                serverconfigurationmanager.func_617_d();
            }
            for(int i = 0; i < field_22116_b.field_6034_e.length; i++)
            {
                WorldServer worldserver = field_22116_b.field_6034_e[i];
                boolean flag = worldserver.field_816_A;
                worldserver.field_816_A = false;
                worldserver.func_485_a(true, null);
                worldserver.field_816_A = flag;
            }

            func_22115_a(s3, "Save complete.");
        } else
        if(s1.equalsIgnoreCase("save-off"))
        {
            func_22115_a(s3, "Disabling level saving..");
            for(int j = 0; j < field_22116_b.field_6034_e.length; j++)
            {
                WorldServer worldserver1 = field_22116_b.field_6034_e[j];
                worldserver1.field_816_A = true;
            }

        } else
        if(s1.equalsIgnoreCase("save-on"))
        {
            func_22115_a(s3, "Enabling level saving..");
            for(int k = 0; k < field_22116_b.field_6034_e.length; k++)
            {
                WorldServer worldserver2 = field_22116_b.field_6034_e[k];
                worldserver2.field_816_A = false;
            }

        } else
        if(s1.equalsIgnoreCase("op"))
        {
            serverconfigurationmanager.func_35479_e(s2);
            func_22115_a(s3, (new StringBuilder()).append("Opping ").append(s2).toString());
            serverconfigurationmanager.func_628_a(s2, "\247eYou are now op!");
        } else
        if(s1.equalsIgnoreCase("deop"))
        {
            String s4 = s2;
            serverconfigurationmanager.func_35478_f(s4);
            serverconfigurationmanager.func_628_a(s4, "\247eYou are no longer op!");
            func_22115_a(s3, (new StringBuilder()).append("De-opping ").append(s4).toString());
        } else
        if(s1.equalsIgnoreCase("ban-ip"))
        {
            String s5 = s2;
            serverconfigurationmanager.func_22162_c(s5);
            func_22115_a(s3, (new StringBuilder()).append("Banning ip ").append(s5).toString());
        } else
        if(s1.equalsIgnoreCase("pardon-ip"))
        {
            String s6 = s2;
            serverconfigurationmanager.func_22163_d(s6);
            func_22115_a(s3, (new StringBuilder()).append("Pardoning ip ").append(s6).toString());
        } else
        if(s1.equalsIgnoreCase("ban"))
        {
            String s7 = s2;
            serverconfigurationmanager.func_22159_a(s7);
            func_22115_a(s3, (new StringBuilder()).append("Banning ").append(s7).toString());
            EntityPlayerMP entityplayermp1 = serverconfigurationmanager.func_620_h(s7);
            if(entityplayermp1 != null)
            {
                entityplayermp1.field_20908_a.func_43_c("Banned by admin");
            }
        } else
        if(s1.equalsIgnoreCase("pardon"))
        {
            String s8 = s2;
            serverconfigurationmanager.func_22161_b(s8);
            func_22115_a(s3, (new StringBuilder()).append("Pardoning ").append(s8).toString());
        } else
        if(s1.equalsIgnoreCase("kick"))
        {
            String s9 = s2;
            EntityPlayerMP entityplayermp2 = null;
            for(int i1 = 0; i1 < serverconfigurationmanager.field_924_b.size(); i1++)
            {
                EntityPlayerMP entityplayermp7 = (EntityPlayerMP)serverconfigurationmanager.field_924_b.get(i1);
                if(entityplayermp7.field_409_aq.equalsIgnoreCase(s9))
                {
                    entityplayermp2 = entityplayermp7;
                }
            }

            if(entityplayermp2 != null)
            {
                entityplayermp2.field_20908_a.func_43_c("Kicked by admin");
                func_22115_a(s3, (new StringBuilder()).append("Kicking ").append(entityplayermp2.field_409_aq).toString());
            } else
            {
                icommandlistener.func_2_b((new StringBuilder()).append("Can't find user ").append(s9).append(". No kick.").toString());
            }
        } else
        if(s1.equalsIgnoreCase("tp"))
        {
            if(as.length == 3)
            {
                EntityPlayerMP entityplayermp = serverconfigurationmanager.func_620_h(as[1]);
                EntityPlayerMP entityplayermp3 = serverconfigurationmanager.func_620_h(as[2]);
                if(entityplayermp == null)
                {
                    icommandlistener.func_2_b((new StringBuilder()).append("Can't find user ").append(as[1]).append(". No tp.").toString());
                } else
                if(entityplayermp3 == null)
                {
                    icommandlistener.func_2_b((new StringBuilder()).append("Can't find user ").append(as[2]).append(". No tp.").toString());
                } else
                if(entityplayermp.field_4110_as != entityplayermp3.field_4110_as)
                {
                    icommandlistener.func_2_b((new StringBuilder()).append("User ").append(as[1]).append(" and ").append(as[2]).append(" are in different dimensions. No tp.").toString());
                } else
                {
                    entityplayermp.field_20908_a.func_41_a(entityplayermp3.field_322_l, entityplayermp3.field_321_m, entityplayermp3.field_320_n, entityplayermp3.field_316_r, entityplayermp3.field_315_s);
                    func_22115_a(s3, (new StringBuilder()).append("Teleporting ").append(as[1]).append(" to ").append(as[2]).append(".").toString());
                }
            } else
            {
                icommandlistener.func_2_b("Syntax error, please provide a source and a target.");
            }
        } else
        if(s1.equalsIgnoreCase("give"))
        {
            if(as.length != 3 && as.length != 4 && as.length != 5)
            {
                return;
            }
            String s10 = as[1];
            EntityPlayerMP entityplayermp4 = serverconfigurationmanager.func_620_h(s10);
            if(entityplayermp4 != null)
            {
                try
                {
                    int j1 = Integer.parseInt(as[2]);
                    if(Item.field_176_c[j1] != null)
                    {
                        func_22115_a(s3, (new StringBuilder()).append("Giving ").append(entityplayermp4.field_409_aq).append(" some ").append(j1).toString());
                        int k2 = 1;
                        int l2 = 0;
                        if(as.length > 3)
                        {
                            k2 = func_22112_a(as[3], 1);
                        }
                        if(as.length > 4)
                        {
                            l2 = func_22112_a(as[4], 1);
                        }
                        if(k2 < 1)
                        {
                            k2 = 1;
                        }
                        if(k2 > 64)
                        {
                            k2 = 64;
                        }
                        entityplayermp4.func_48348_b(new ItemStack(j1, k2, l2));
                    } else
                    {
                        icommandlistener.func_2_b((new StringBuilder()).append("There's no item with id ").append(j1).toString());
                    }
                }
                catch(NumberFormatException numberformatexception1)
                {
                    icommandlistener.func_2_b((new StringBuilder()).append("There's no item with id ").append(as[2]).toString());
                }
            } else
            {
                icommandlistener.func_2_b((new StringBuilder()).append("Can't find user ").append(s10).toString());
            }
        } else
        if(s1.equalsIgnoreCase("xp"))
        {
            if(as.length != 3)
            {
                return;
            }
            String s11 = as[1];
            EntityPlayerMP entityplayermp5 = serverconfigurationmanager.func_620_h(s11);
            if(entityplayermp5 != null)
            {
                try
                {
                    int k1 = Integer.parseInt(as[2]);
                    k1 = k1 <= 5000 ? k1 : 5000;
                    func_22115_a(s3, (new StringBuilder()).append("Giving ").append(k1).append(" orbs to ").append(entityplayermp5.field_409_aq).toString());
                    entityplayermp5.func_35195_d(k1);
                }
                catch(NumberFormatException numberformatexception2)
                {
                    icommandlistener.func_2_b((new StringBuilder()).append("Invalid orb count: ").append(as[2]).toString());
                }
            } else
            {
                icommandlistener.func_2_b((new StringBuilder()).append("Can't find user ").append(s11).toString());
            }
        } else
        if(s1.equalsIgnoreCase("gamemode"))
        {
            if(as.length != 3)
            {
                return;
            }
            String s12 = as[1];
            EntityPlayerMP entityplayermp6 = serverconfigurationmanager.func_620_h(s12);
            if(entityplayermp6 != null)
            {
                try
                {
                    int l1 = Integer.parseInt(as[2]);
                    l1 = WorldSettings.func_35037_a(l1);
                    if(entityplayermp6.field_425_ad.func_35697_a() != l1)
                    {
                        func_22115_a(s3, (new StringBuilder()).append("Setting ").append(entityplayermp6.field_409_aq).append(" to game mode ").append(l1).toString());
                        entityplayermp6.field_425_ad.func_35696_a(l1);
                        entityplayermp6.field_20908_a.func_39_b(new Packet70Bed(3, l1));
                    } else
                    {
                        func_22115_a(s3, (new StringBuilder()).append(entityplayermp6.field_409_aq).append(" already has game mode ").append(l1).toString());
                    }
                }
                catch(NumberFormatException numberformatexception3)
                {
                    icommandlistener.func_2_b((new StringBuilder()).append("There's no game mode with id ").append(as[2]).toString());
                }
            } else
            {
                icommandlistener.func_2_b((new StringBuilder()).append("Can't find user ").append(s12).toString());
            }
        } else
        if(s1.equalsIgnoreCase("time"))
        {
            if(as.length != 3)
            {
                return;
            }
            String s13 = as[1];
            try
            {
                int l = Integer.parseInt(as[2]);
                if("add".equalsIgnoreCase(s13))
                {
                    for(int i2 = 0; i2 < field_22116_b.field_6034_e.length; i2++)
                    {
                        WorldServer worldserver3 = field_22116_b.field_6034_e[i2];
                        worldserver3.func_32005_b(worldserver3.func_22080_k() + (long)l);
                    }

                    func_22115_a(s3, (new StringBuilder()).append("Added ").append(l).append(" to time").toString());
                } else
                if("set".equalsIgnoreCase(s13))
                {
                    for(int j2 = 0; j2 < field_22116_b.field_6034_e.length; j2++)
                    {
                        WorldServer worldserver4 = field_22116_b.field_6034_e[j2];
                        worldserver4.func_32005_b(l);
                    }

                    func_22115_a(s3, (new StringBuilder()).append("Set time to ").append(l).toString());
                } else
                {
                    icommandlistener.func_2_b("Unknown method, use either \"add\" or \"set\"");
                }
            }
            catch(NumberFormatException numberformatexception)
            {
                icommandlistener.func_2_b((new StringBuilder()).append("Unable to convert time value, ").append(as[2]).toString());
            }
        } else
        if(s1.equalsIgnoreCase("say") && s2.length() > 0)
        {
            field_22117_a.info((new StringBuilder()).append("[").append(s3).append("] ").append(s2).toString());
            serverconfigurationmanager.func_631_a(new Packet3Chat((new StringBuilder()).append("\247d[Server] ").append(s2).toString()));
        } else
        if(s1.equalsIgnoreCase("tell"))
        {
            if(as.length >= 3)
            {
                s = s.substring(s.indexOf(" ")).trim();
                s = s.substring(s.indexOf(" ")).trim();
                field_22117_a.info((new StringBuilder()).append("[").append(s3).append("->").append(as[1]).append("] ").append(s).toString());
                s = (new StringBuilder()).append("\2477").append(s3).append(" whispers ").append(s).toString();
                field_22117_a.info(s);
                if(!serverconfigurationmanager.func_621_a(as[1], new Packet3Chat(s)))
                {
                    icommandlistener.func_2_b("There's no player by that name online.");
                }
            }
        } else
        if(s1.equalsIgnoreCase("whitelist"))
        {
            func_22113_a(s3, s, icommandlistener);
        } else
        if(s1.equalsIgnoreCase("toggledownfall"))
        {
            field_22116_b.field_6034_e[0].func_40218_j();
            icommandlistener.func_2_b("Toggling rain and snow, hold on...");
        } else
        if(s1.equalsIgnoreCase("banlist"))
        {
            if(as.length == 2)
            {
                if(as[1].equals("ips"))
                {
                    icommandlistener.func_2_b((new StringBuilder()).append("IP Ban list:").append(func_40648_a(field_22116_b.func_40026_q(), ", ")).toString());
                }
            } else
            {
                icommandlistener.func_2_b((new StringBuilder()).append("Ban list:").append(func_40648_a(field_22116_b.func_40025_r(), ", ")).toString());
            }
        } else
        {
            field_22117_a.info("Unknown console command. Type \"help\" for help.");
        }
    }

    private void func_22113_a(String p_22113_1_, String p_22113_2_, ICommandListener p_22113_3_)
    {
        String as[] = p_22113_2_.split(" ");
        if(as.length < 2)
        {
            return;
        }
        String s = as[1].toLowerCase();
        if("on".equals(s))
        {
            func_22115_a(p_22113_1_, "Turned on white-listing");
            field_22116_b.field_6035_d.func_22118_b("white-list", true);
        } else
        if("off".equals(s))
        {
            func_22115_a(p_22113_1_, "Turned off white-listing");
            field_22116_b.field_6035_d.func_22118_b("white-list", false);
        } else
        if("list".equals(s))
        {
            Set set = field_22116_b.field_6033_f.func_22167_e();
            String s3 = "";
            for(Iterator iterator = set.iterator(); iterator.hasNext();)
            {
                String s4 = (String)iterator.next();
                s3 = (new StringBuilder()).append(s3).append(s4).append(" ").toString();
            }

            p_22113_3_.func_2_b((new StringBuilder()).append("White-listed players: ").append(s3).toString());
        } else
        if("add".equals(s) && as.length == 3)
        {
            String s1 = as[2].toLowerCase();
            field_22116_b.field_6033_f.func_22169_k(s1);
            func_22115_a(p_22113_1_, (new StringBuilder()).append("Added ").append(s1).append(" to white-list").toString());
        } else
        if("remove".equals(s) && as.length == 3)
        {
            String s2 = as[2].toLowerCase();
            field_22116_b.field_6033_f.func_22170_l(s2);
            func_22115_a(p_22113_1_, (new StringBuilder()).append("Removed ").append(s2).append(" from white-list").toString());
        } else
        if("reload".equals(s))
        {
            field_22116_b.field_6033_f.func_22171_f();
            func_22115_a(p_22113_1_, "Reloaded white-list from file");
        }
    }

    private void func_22111_a(ICommandListener p_22111_1_)
    {
        p_22111_1_.func_2_b("To run the server without a gui, start it like this:");
        p_22111_1_.func_2_b("   java -Xmx1024M -Xms1024M -jar minecraft_server.jar nogui");
        p_22111_1_.func_2_b("Console commands:");
        p_22111_1_.func_2_b("   help  or  ?               shows this message");
        p_22111_1_.func_2_b("   kick <player>             removes a player from the server");
        p_22111_1_.func_2_b("   ban <player>              bans a player from the server");
        p_22111_1_.func_2_b("   pardon <player>           pardons a banned player so that they can connect again");
        p_22111_1_.func_2_b("   ban-ip <ip>               bans an IP address from the server");
        p_22111_1_.func_2_b("   pardon-ip <ip>            pardons a banned IP address so that they can connect again");
        p_22111_1_.func_2_b("   op <player>               turns a player into an op");
        p_22111_1_.func_2_b("   deop <player>             removes op status from a player");
        p_22111_1_.func_2_b("   tp <player1> <player2>    moves one player to the same location as another player");
        p_22111_1_.func_2_b("   give <player> <id> [num]  gives a player a resource");
        p_22111_1_.func_2_b("   tell <player> <message>   sends a private message to a player");
        p_22111_1_.func_2_b("   stop                      gracefully stops the server");
        p_22111_1_.func_2_b("   save-all                  forces a server-wide level save");
        p_22111_1_.func_2_b("   save-off                  disables terrain saving (useful for backup scripts)");
        p_22111_1_.func_2_b("   save-on                   re-enables terrain saving");
        p_22111_1_.func_2_b("   list                      lists all currently connected players");
        p_22111_1_.func_2_b("   say <message>             broadcasts a message to all players");
        p_22111_1_.func_2_b("   time <add|set> <amount>   adds to or sets the world time (0-24000)");
        p_22111_1_.func_2_b("   gamemode <player> <mode>  sets player's game mode (0 or 1)");
        p_22111_1_.func_2_b("   toggledownfall            toggles rain on or off");
        p_22111_1_.func_2_b("   xp <player> <amount>      gives the player the amount of xp (0-5000)");
    }

    private void func_22115_a(String p_22115_1_, String p_22115_2_)
    {
        String s = (new StringBuilder()).append(p_22115_1_).append(": ").append(p_22115_2_).toString();
        field_22116_b.field_6033_f.func_630_i((new StringBuilder()).append("\2477(").append(s).append(")").toString());
        field_22117_a.info(s);
    }

    private int func_22112_a(String p_22112_1_, int p_22112_2_)
    {
        try
        {
            return Integer.parseInt(p_22112_1_);
        }
        catch(NumberFormatException numberformatexception)
        {
            return p_22112_2_;
        }
    }

    private String func_40648_a(String p_40648_1_[], String p_40648_2_)
    {
        int i = p_40648_1_.length;
        if(0 == i)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(p_40648_1_[0]);
        for(int j = 1; j < i; j++)
        {
            stringbuilder.append(p_40648_2_).append(p_40648_1_[j]);
        }

        return stringbuilder.toString();
    }

}
