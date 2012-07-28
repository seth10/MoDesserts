// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            NetHandler, ICommandListener, IntHashMap, NetworkManager, 
//            EntityPlayerMP, Packet0KeepAlive, Packet255KickDisconnect, Packet3Chat, 
//            ServerConfigurationManager, Packet10Flying, Entity, WorldServer, 
//            AxisAlignedBB, ItemInWorldManager, Packet13PlayerLookMove, Packet14BlockDig, 
//            WorldProvider, ChunkCoordinates, MathHelper, Packet53BlockChange, 
//            InventoryPlayer, Packet15Place, ItemStack, Container, 
//            Packet103SetSlot, Slot, Packet16BlockItemSwitch, ChatAllowedCharacters, 
//            DamageSource, Packet18Animation, Packet19EntityAction, Packet7UseEntity, 
//            Packet102WindowClick, Packet106Transaction, Packet108EnchantItem, Packet107CreativeSetSlot, 
//            Item, EntityItem, Packet130UpdateSign, TileEntitySign, 
//            Packet202PlayerAbilities, PlayerCapabilities, Packet, Packet9Respawn, 
//            Packet101CloseWindow

public class NetServerHandler extends NetHandler
    implements ICommandListener
{

    public static Logger field_20_a = Logger.getLogger("Minecraft");
    public NetworkManager field_19_b;
    public boolean field_18_c;
    private MinecraftServer field_17_d;
    private EntityPlayerMP field_16_e;
    private int field_35009_f;
    private int field_27004_h;
    private boolean field_22003_h;
    private int field_35013_i;
    private long field_35011_j;
    private static Random field_35012_k = new Random();
    private long field_35010_l;
    private int field_45001_m;
    private int field_48073_n;
    private double field_9009_g;
    private double field_9008_h;
    private double field_9007_i;
    private boolean field_9006_j;
    private IntHashMap field_10_k;

    public NetServerHandler(MinecraftServer p_i263_1_, NetworkManager p_i263_2_, EntityPlayerMP p_i263_3_)
    {
        field_18_c = false;
        field_45001_m = 0;
        field_48073_n = 0;
        field_9006_j = true;
        field_10_k = new IntHashMap();
        field_17_d = p_i263_1_;
        field_19_b = p_i263_2_;
        p_i263_2_.func_754_a(this);
        field_16_e = p_i263_3_;
        p_i263_3_.field_20908_a = this;
    }

    public void func_42_a()
    {
        field_22003_h = false;
        field_35009_f++;
        field_19_b.func_747_a();
        if((long)field_35009_f - field_35010_l > 20L)
        {
            field_35010_l = field_35009_f;
            field_35011_j = System.nanoTime() / 0xf4240L;
            field_35013_i = field_35012_k.nextInt();
            func_39_b(new Packet0KeepAlive(field_35013_i));
        }
        if(field_45001_m > 0)
        {
            field_45001_m--;
        }
        if(field_48073_n > 0)
        {
            field_48073_n--;
        }
    }

    public void func_43_c(String p_43_1_)
    {
        if(field_18_c)
        {
            return;
        } else
        {
            field_16_e.func_30002_A();
            func_39_b(new Packet255KickDisconnect(p_43_1_));
            field_19_b.func_752_c();
            field_17_d.field_6033_f.func_631_a(new Packet3Chat((new StringBuilder()).append("\247e").append(field_16_e.field_409_aq).append(" left the game.").toString()));
            field_17_d.field_6033_f.func_616_c(field_16_e);
            field_18_c = true;
            return;
        }
    }

    public void func_18_a(Packet10Flying p_18_1_)
    {
        WorldServer worldserver = field_17_d.func_28004_a(field_16_e.field_4110_as);
        field_22003_h = true;
        if(field_16_e.field_41032_j)
        {
            return;
        }
        if(!field_9006_j)
        {
            double d = p_18_1_.field_72_b - field_9008_h;
            if(p_18_1_.field_73_a == field_9009_g && d * d < 0.01D && p_18_1_.field_71_c == field_9007_i)
            {
                field_9006_j = true;
            }
        }
        if(field_9006_j)
        {
            if(field_16_e.field_327_g != null)
            {
                float f = field_16_e.field_316_r;
                float f1 = field_16_e.field_315_s;
                field_16_e.field_327_g.func_127_w();
                double d2 = field_16_e.field_322_l;
                double d4 = field_16_e.field_321_m;
                double d6 = field_16_e.field_320_n;
                double d8 = 0.0D;
                double d9 = 0.0D;
                if(p_18_1_.field_65_i)
                {
                    f = p_18_1_.field_69_e;
                    f1 = p_18_1_.field_68_f;
                }
                if(p_18_1_.field_66_h && p_18_1_.field_72_b == -999D && p_18_1_.field_70_d == -999D)
                {
                    if(p_18_1_.field_73_a > 1.0D || p_18_1_.field_71_c > 1.0D)
                    {
                        System.err.println((new StringBuilder()).append(field_16_e.field_409_aq).append(" was caught trying to crash the server with an invalid position.").toString());
                        func_43_c("Nope!");
                        return;
                    }
                    d8 = p_18_1_.field_73_a;
                    d9 = p_18_1_.field_71_c;
                }
                field_16_e.field_9086_A = p_18_1_.field_67_g;
                field_16_e.func_22070_a(true);
                field_16_e.func_88_c(d8, 0.0D, d9);
                field_16_e.func_6095_b(d2, d4, d6, f, f1);
                field_16_e.field_319_o = d8;
                field_16_e.field_317_q = d9;
                if(field_16_e.field_327_g != null)
                {
                    worldserver.func_12017_b(field_16_e.field_327_g, true);
                }
                if(field_16_e.field_327_g != null)
                {
                    field_16_e.field_327_g.func_127_w();
                }
                field_17_d.field_6033_f.func_613_b(field_16_e);
                field_9009_g = field_16_e.field_322_l;
                field_9008_h = field_16_e.field_321_m;
                field_9007_i = field_16_e.field_320_n;
                worldserver.func_520_e(field_16_e);
                return;
            }
            if(field_16_e.func_22057_E())
            {
                field_16_e.func_22070_a(true);
                field_16_e.func_6095_b(field_9009_g, field_9008_h, field_9007_i, field_16_e.field_316_r, field_16_e.field_315_s);
                worldserver.func_520_e(field_16_e);
                return;
            }
            double d1 = field_16_e.field_321_m;
            field_9009_g = field_16_e.field_322_l;
            field_9008_h = field_16_e.field_321_m;
            field_9007_i = field_16_e.field_320_n;
            double d3 = field_16_e.field_322_l;
            double d5 = field_16_e.field_321_m;
            double d7 = field_16_e.field_320_n;
            float f2 = field_16_e.field_316_r;
            float f3 = field_16_e.field_315_s;
            if(p_18_1_.field_66_h && p_18_1_.field_72_b == -999D && p_18_1_.field_70_d == -999D)
            {
                p_18_1_.field_66_h = false;
            }
            if(p_18_1_.field_66_h)
            {
                d3 = p_18_1_.field_73_a;
                d5 = p_18_1_.field_72_b;
                d7 = p_18_1_.field_71_c;
                double d10 = p_18_1_.field_70_d - p_18_1_.field_72_b;
                if(!field_16_e.func_22057_E() && (d10 > 1.6499999999999999D || d10 < 0.10000000000000001D))
                {
                    func_43_c("Illegal stance");
                    field_20_a.warning((new StringBuilder()).append(field_16_e.field_409_aq).append(" had an illegal stance: ").append(d10).toString());
                    return;
                }
                if(Math.abs(p_18_1_.field_73_a) > 32000000D || Math.abs(p_18_1_.field_71_c) > 32000000D)
                {
                    func_43_c("Illegal position");
                    return;
                }
            }
            if(p_18_1_.field_65_i)
            {
                f2 = p_18_1_.field_69_e;
                f3 = p_18_1_.field_68_f;
            }
            field_16_e.func_22070_a(true);
            field_16_e.field_9068_R = 0.0F;
            field_16_e.func_6095_b(field_9009_g, field_9008_h, field_9007_i, f2, f3);
            if(!field_9006_j)
            {
                return;
            }
            double d11 = d3 - field_16_e.field_322_l;
            double d12 = d5 - field_16_e.field_321_m;
            double d13 = d7 - field_16_e.field_320_n;
            double d14 = d11 * d11 + d12 * d12 + d13 * d13;
            if(d14 > 100D)
            {
                field_20_a.warning((new StringBuilder()).append(field_16_e.field_409_aq).append(" moved too quickly!").toString());
                func_43_c("You moved too quickly :( (Hacking?)");
                return;
            }
            float f4 = 0.0625F;
            boolean flag = worldserver.func_481_a(field_16_e, field_16_e.field_312_v.func_711_b().func_694_e(f4, f4, f4)).size() == 0;
            if(field_16_e.field_9086_A && !p_18_1_.field_67_g && d12 > 0.0D)
            {
                field_16_e.func_35198_b(0.2F);
            }
            field_16_e.func_88_c(d11, d12, d13);
            field_16_e.field_9086_A = p_18_1_.field_67_g;
            field_16_e.func_25045_g(d11, d12, d13);
            double d15 = d12;
            d11 = d3 - field_16_e.field_322_l;
            d12 = d5 - field_16_e.field_321_m;
            if(d12 > -0.5D || d12 < 0.5D)
            {
                d12 = 0.0D;
            }
            d13 = d7 - field_16_e.field_320_n;
            d14 = d11 * d11 + d12 * d12 + d13 * d13;
            boolean flag1 = false;
            if(d14 > 0.0625D && !field_16_e.func_22057_E() && !field_16_e.field_425_ad.func_35698_b())
            {
                flag1 = true;
                field_20_a.warning((new StringBuilder()).append(field_16_e.field_409_aq).append(" moved wrongly!").toString());
                System.out.println((new StringBuilder()).append("Got position ").append(d3).append(", ").append(d5).append(", ").append(d7).toString());
                System.out.println((new StringBuilder()).append("Expected ").append(field_16_e.field_322_l).append(", ").append(field_16_e.field_321_m).append(", ").append(field_16_e.field_320_n).toString());
            }
            field_16_e.func_6095_b(d3, d5, d7, f2, f3);
            boolean flag2 = worldserver.func_481_a(field_16_e, field_16_e.field_312_v.func_711_b().func_694_e(f4, f4, f4)).size() == 0;
            if(flag && (flag1 || !flag2) && !field_16_e.func_22057_E())
            {
                func_41_a(field_9009_g, field_9008_h, field_9007_i, f2, f3);
                return;
            }
            AxisAlignedBB axisalignedbb = field_16_e.field_312_v.func_711_b().func_708_b(f4, f4, f4).func_700_a(0.0D, -0.55000000000000004D, 0.0D);
            if(!field_17_d.field_27005_o && !field_16_e.field_425_ad.func_35698_b() && !worldserver.func_27069_b(axisalignedbb))
            {
                if(d15 >= -0.03125D)
                {
                    field_27004_h++;
                    if(field_27004_h > 80)
                    {
                        field_20_a.warning((new StringBuilder()).append(field_16_e.field_409_aq).append(" was kicked for floating too long!").toString());
                        func_43_c("Flying is not enabled on this server");
                        return;
                    }
                }
            } else
            {
                field_27004_h = 0;
            }
            field_16_e.field_9086_A = p_18_1_.field_67_g;
            field_17_d.field_6033_f.func_613_b(field_16_e);
            field_16_e.func_9153_b(field_16_e.field_321_m - d1, p_18_1_.field_67_g);
        }
    }

    public void func_41_a(double p_41_1_, double p_41_3_, double p_41_5_, float p_41_7_, 
            float p_41_8_)
    {
        field_9006_j = false;
        field_9009_g = p_41_1_;
        field_9008_h = p_41_3_;
        field_9007_i = p_41_5_;
        field_16_e.func_6095_b(p_41_1_, p_41_3_, p_41_5_, p_41_7_, p_41_8_);
        field_16_e.field_20908_a.func_39_b(new Packet13PlayerLookMove(p_41_1_, p_41_3_ + 1.6200000047683716D, p_41_3_, p_41_5_, p_41_7_, p_41_8_, false));
    }

    public void func_26_a(Packet14BlockDig p_26_1_)
    {
        WorldServer worldserver = field_17_d.func_28004_a(field_16_e.field_4110_as);
        if(p_26_1_.field_55_e == 4)
        {
            field_16_e.func_48347_R();
            return;
        }
        if(p_26_1_.field_55_e == 5)
        {
            field_16_e.func_35196_E();
            return;
        }
        boolean flag = worldserver.field_819_z = worldserver.field_4272_q.field_6165_g != 0 || field_17_d.field_6033_f.func_639_g(field_16_e.field_409_aq);
        boolean flag1 = false;
        if(p_26_1_.field_55_e == 0)
        {
            flag1 = true;
        }
        if(p_26_1_.field_55_e == 2)
        {
            flag1 = true;
        }
        int i = p_26_1_.field_54_a;
        int j = p_26_1_.field_53_b;
        int k = p_26_1_.field_57_c;
        if(flag1)
        {
            double d = field_16_e.field_322_l - ((double)i + 0.5D);
            double d1 = (field_16_e.field_321_m - ((double)j + 0.5D)) + 1.5D;
            double d3 = field_16_e.field_320_n - ((double)k + 0.5D);
            double d5 = d * d + d1 * d1 + d3 * d3;
            if(d5 > 36D)
            {
                return;
            }
            if(j >= field_17_d.field_48081_t)
            {
                return;
            }
        }
        ChunkCoordinates chunkcoordinates = worldserver.func_22078_l();
        int l = MathHelper.func_35475_a(i - chunkcoordinates.field_22216_a);
        int i1 = MathHelper.func_35475_a(k - chunkcoordinates.field_528_b);
        if(l > i1)
        {
            i1 = l;
        }
        if(p_26_1_.field_55_e == 0)
        {
            if(i1 > 16 || flag)
            {
                field_16_e.field_425_ad.func_324_a(i, j, k, p_26_1_.field_56_d);
            } else
            {
                field_16_e.field_20908_a.func_39_b(new Packet53BlockChange(i, j, k, worldserver));
            }
        } else
        if(p_26_1_.field_55_e == 2)
        {
            field_16_e.field_425_ad.func_22045_b(i, j, k);
            if(worldserver.func_444_a(i, j, k) != 0)
            {
                field_16_e.field_20908_a.func_39_b(new Packet53BlockChange(i, j, k, worldserver));
            }
        } else
        if(p_26_1_.field_55_e == 3)
        {
            double d2 = field_16_e.field_322_l - ((double)i + 0.5D);
            double d4 = field_16_e.field_321_m - ((double)j + 0.5D);
            double d6 = field_16_e.field_320_n - ((double)k + 0.5D);
            double d7 = d2 * d2 + d4 * d4 + d6 * d6;
            if(d7 < 256D)
            {
                field_16_e.field_20908_a.func_39_b(new Packet53BlockChange(i, j, k, worldserver));
            }
        }
        worldserver.field_819_z = false;
    }

    public void func_24_a(Packet15Place p_24_1_)
    {
        WorldServer worldserver = field_17_d.func_28004_a(field_16_e.field_4110_as);
        ItemStack itemstack = field_16_e.field_416_aj.func_213_b();
        boolean flag = false;
        int i = p_24_1_.field_78_a;
        int j = p_24_1_.field_77_b;
        int k = p_24_1_.field_81_c;
        int l = p_24_1_.field_80_d;
        boolean flag1 = worldserver.field_819_z = worldserver.field_4272_q.field_6165_g != 0 || field_17_d.field_6033_f.func_639_g(field_16_e.field_409_aq);
        if(p_24_1_.field_80_d == 255)
        {
            if(itemstack == null)
            {
                return;
            }
            field_16_e.field_425_ad.func_6154_a(field_16_e, worldserver, itemstack);
        } else
        if(p_24_1_.field_77_b < field_17_d.field_48081_t - 1 || p_24_1_.field_80_d != 1 && p_24_1_.field_77_b < field_17_d.field_48081_t)
        {
            ChunkCoordinates chunkcoordinates = worldserver.func_22078_l();
            int i1 = MathHelper.func_35475_a(i - chunkcoordinates.field_22216_a);
            int j1 = MathHelper.func_35475_a(k - chunkcoordinates.field_528_b);
            if(i1 > j1)
            {
                j1 = i1;
            }
            if(field_9006_j && field_16_e.func_101_d((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D) < 64D && (j1 > 16 || flag1))
            {
                field_16_e.field_425_ad.func_327_a(field_16_e, worldserver, itemstack, i, j, k, l);
            }
            flag = true;
        } else
        {
            field_16_e.field_20908_a.func_39_b(new Packet3Chat((new StringBuilder()).append("\2477Height limit for building is ").append(field_17_d.field_48081_t).toString()));
            flag = true;
        }
        if(flag)
        {
            field_16_e.field_20908_a.func_39_b(new Packet53BlockChange(i, j, k, worldserver));
            if(l == 0)
            {
                j--;
            }
            if(l == 1)
            {
                j++;
            }
            if(l == 2)
            {
                k--;
            }
            if(l == 3)
            {
                k++;
            }
            if(l == 4)
            {
                i--;
            }
            if(l == 5)
            {
                i++;
            }
            field_16_e.field_20908_a.func_39_b(new Packet53BlockChange(i, j, k, worldserver));
        }
        itemstack = field_16_e.field_416_aj.func_213_b();
        if(itemstack != null && itemstack.field_853_a == 0)
        {
            field_16_e.field_416_aj.field_496_a[field_16_e.field_416_aj.field_499_d] = null;
            itemstack = null;
        }
        if(itemstack == null || itemstack.func_35614_l() == 0)
        {
            field_16_e.field_20064_am = true;
            field_16_e.field_416_aj.field_496_a[field_16_e.field_416_aj.field_499_d] = ItemStack.func_20117_a(field_16_e.field_416_aj.field_496_a[field_16_e.field_416_aj.field_499_d]);
            Slot slot = field_16_e.field_20052_ap.func_20127_a(field_16_e.field_416_aj, field_16_e.field_416_aj.field_499_d);
            field_16_e.field_20052_ap.func_20125_a();
            field_16_e.field_20064_am = false;
            if(!ItemStack.func_20119_a(field_16_e.field_416_aj.func_213_b(), p_24_1_.field_79_e))
            {
                func_39_b(new Packet103SetSlot(field_16_e.field_20052_ap.field_20134_f, slot.field_20100_c, field_16_e.field_416_aj.func_213_b()));
            }
        }
        worldserver.field_819_z = false;
    }

    public void func_6_a(String p_6_1_, Object p_6_2_[])
    {
        field_20_a.info((new StringBuilder()).append(field_16_e.field_409_aq).append(" lost connection: ").append(p_6_1_).toString());
        field_17_d.field_6033_f.func_631_a(new Packet3Chat((new StringBuilder()).append("\247e").append(field_16_e.field_409_aq).append(" left the game.").toString()));
        field_17_d.field_6033_f.func_616_c(field_16_e);
        field_18_c = true;
    }

    public void func_6001_a(Packet p_6001_1_)
    {
        field_20_a.warning((new StringBuilder()).append(getClass()).append(" wasn't prepared to deal with a ").append(p_6001_1_.getClass()).toString());
        func_43_c("Protocol error, unexpected packet");
    }

    public void func_39_b(Packet p_39_1_)
    {
        field_19_b.func_745_a(p_39_1_);
    }

    public void func_11_a(Packet16BlockItemSwitch p_11_1_)
    {
        if(p_11_1_.field_74_b < 0 || p_11_1_.field_74_b >= InventoryPlayer.func_25054_e())
        {
            field_20_a.warning((new StringBuilder()).append(field_16_e.field_409_aq).append(" tried to set an invalid carried item").toString());
            return;
        } else
        {
            field_16_e.field_416_aj.field_499_d = p_11_1_.field_74_b;
            return;
        }
    }

    public void func_23_a(Packet3Chat p_23_1_)
    {
        String s = p_23_1_.field_150_a;
        if(s.length() > 100)
        {
            func_43_c("Chat message too long");
            return;
        }
        s = s.trim();
        for(int i = 0; i < s.length(); i++)
        {
            if(!ChatAllowedCharacters.func_48409_a(s.charAt(i)))
            {
                func_43_c("Illegal characters in chat");
                return;
            }
        }

        if(s.startsWith("/"))
        {
            func_4010_d(s);
        } else
        {
            s = (new StringBuilder()).append("<").append(field_16_e.field_409_aq).append("> ").append(s).toString();
            field_20_a.info(s);
            field_17_d.field_6033_f.func_631_a(new Packet3Chat(s));
        }
        field_45001_m += 20;
        if(field_45001_m > 200)
        {
            func_43_c("disconnect.spam");
        }
    }

    private void func_4010_d(String p_4010_1_)
    {
        if(p_4010_1_.toLowerCase().startsWith("/me "))
        {
            p_4010_1_ = (new StringBuilder()).append("* ").append(field_16_e.field_409_aq).append(" ").append(p_4010_1_.substring(p_4010_1_.indexOf(" ")).trim()).toString();
            field_20_a.info(p_4010_1_);
            field_17_d.field_6033_f.func_631_a(new Packet3Chat(p_4010_1_));
        } else
        if(p_4010_1_.toLowerCase().startsWith("/kill"))
        {
            field_16_e.func_121_a(DamageSource.field_35096_j, 1000);
        } else
        if(p_4010_1_.toLowerCase().startsWith("/tell "))
        {
            String as[] = p_4010_1_.split(" ");
            if(as.length >= 3)
            {
                p_4010_1_ = p_4010_1_.substring(p_4010_1_.indexOf(" ")).trim();
                p_4010_1_ = p_4010_1_.substring(p_4010_1_.indexOf(" ")).trim();
                p_4010_1_ = (new StringBuilder()).append("\2477").append(field_16_e.field_409_aq).append(" whispers ").append(p_4010_1_).toString();
                field_20_a.info((new StringBuilder()).append(p_4010_1_).append(" to ").append(as[1]).toString());
                if(!field_17_d.field_6033_f.func_621_a(as[1], new Packet3Chat(p_4010_1_)))
                {
                    func_39_b(new Packet3Chat("\247cThere's no player by that name online."));
                }
            }
        } else
        if(field_17_d.field_6033_f.func_639_g(field_16_e.field_409_aq))
        {
            String s = p_4010_1_.substring(1);
            field_20_a.info((new StringBuilder()).append(field_16_e.field_409_aq).append(" issued server command: ").append(s).toString());
            field_17_d.func_6010_a(s, this);
        } else
        {
            String s1 = p_4010_1_.substring(1);
            field_20_a.info((new StringBuilder()).append(field_16_e.field_409_aq).append(" tried command: ").append(s1).toString());
        }
    }

    public void func_3_a(Packet18Animation p_3_1_)
    {
        if(p_3_1_.field_119_b == 1)
        {
            field_16_e.func_168_z();
        }
    }

    public void func_21001_a(Packet19EntityAction p_21001_1_)
    {
        if(p_21001_1_.field_21020_b == 1)
        {
            field_16_e.func_21043_b(true);
        } else
        if(p_21001_1_.field_21020_b == 2)
        {
            field_16_e.func_21043_b(false);
        } else
        if(p_21001_1_.field_21020_b == 4)
        {
            field_16_e.func_35146_g(true);
        } else
        if(p_21001_1_.field_21020_b == 5)
        {
            field_16_e.func_35146_g(false);
        } else
        if(p_21001_1_.field_21020_b == 3)
        {
            field_16_e.func_22062_a(false, true, true);
            field_9006_j = false;
        }
    }

    public void func_4009_a(Packet255KickDisconnect p_4009_1_)
    {
        field_19_b.func_753_a("disconnect.quitting", new Object[0]);
    }

    public int func_38_b()
    {
        return field_19_b.func_744_d();
    }

    public void func_2_b(String p_2_1_)
    {
        func_39_b(new Packet3Chat((new StringBuilder()).append("\2477").append(p_2_1_).toString()));
    }

    public String func_1_c()
    {
        return field_16_e.field_409_aq;
    }

    public void func_6006_a(Packet7UseEntity p_6006_1_)
    {
        WorldServer worldserver = field_17_d.func_28004_a(field_16_e.field_4110_as);
        Entity entity = worldserver.func_6158_a(p_6006_1_.field_9018_b);
        if(entity != null)
        {
            boolean flag = field_16_e.func_145_g(entity);
            double d = 36D;
            if(!flag)
            {
                d = 9D;
            }
            if(field_16_e.func_102_b(entity) < d)
            {
                if(p_6006_1_.field_9020_c == 0)
                {
                    field_16_e.func_9145_g(entity);
                } else
                if(p_6006_1_.field_9020_c == 1)
                {
                    field_16_e.func_9146_h(entity);
                }
            }
        }
    }

    public void func_9002_a(Packet9Respawn p_9002_1_)
    {
        if(field_16_e.field_41032_j)
        {
            field_16_e = field_17_d.field_6033_f.func_9242_d(field_16_e, 0, true);
        } else
        {
            if(field_16_e.func_40097_ai() > 0)
            {
                return;
            }
            field_16_e = field_17_d.field_6033_f.func_9242_d(field_16_e, 0, false);
        }
    }

    public void func_20006_a(Packet101CloseWindow p_20006_1_)
    {
        field_16_e.func_20059_K();
    }

    public void func_20007_a(Packet102WindowClick p_20007_1_)
    {
        if(field_16_e.field_20052_ap.field_20134_f == p_20007_1_.field_20024_a && field_16_e.field_20052_ap.func_20124_c(field_16_e))
        {
            ItemStack itemstack = field_16_e.field_20052_ap.func_27085_a(p_20007_1_.field_20023_b, p_20007_1_.field_20027_c, p_20007_1_.field_27039_f, field_16_e);
            if(ItemStack.func_20119_a(p_20007_1_.field_20025_e, itemstack))
            {
                field_16_e.field_20908_a.func_39_b(new Packet106Transaction(p_20007_1_.field_20024_a, p_20007_1_.field_20026_d, true));
                field_16_e.field_20064_am = true;
                field_16_e.field_20052_ap.func_20125_a();
                field_16_e.func_20058_J();
                field_16_e.field_20064_am = false;
            } else
            {
                field_10_k.func_554_a(field_16_e.field_20052_ap.field_20134_f, Short.valueOf(p_20007_1_.field_20026_d));
                field_16_e.field_20908_a.func_39_b(new Packet106Transaction(p_20007_1_.field_20024_a, p_20007_1_.field_20026_d, false));
                field_16_e.field_20052_ap.func_20129_a(field_16_e, false);
                ArrayList arraylist = new ArrayList();
                for(int i = 0; i < field_16_e.field_20052_ap.field_20135_e.size(); i++)
                {
                    arraylist.add(((Slot)field_16_e.field_20052_ap.field_20135_e.get(i)).func_20092_c());
                }

                field_16_e.func_20054_a(field_16_e.field_20052_ap, arraylist);
            }
        }
    }

    public void func_40001_a(Packet108EnchantItem p_40001_1_)
    {
        if(field_16_e.field_20052_ap.field_20134_f == p_40001_1_.field_40265_a && field_16_e.field_20052_ap.func_20124_c(field_16_e))
        {
            field_16_e.field_20052_ap.func_40331_a(field_16_e, p_40001_1_.field_40264_b);
            field_16_e.field_20052_ap.func_20125_a();
        }
    }

    public void func_35004_a(Packet107CreativeSetSlot p_35004_1_)
    {
        if(field_16_e.field_425_ad.func_35698_b())
        {
            boolean flag = p_35004_1_.field_35108_a < 0;
            ItemStack itemstack = p_35004_1_.field_40263_b;
            boolean flag1 = p_35004_1_.field_35108_a >= 36 && p_35004_1_.field_35108_a < 36 + InventoryPlayer.func_25054_e();
            boolean flag2 = itemstack == null || itemstack.field_855_c < Item.field_176_c.length && itemstack.field_855_c >= 0 && Item.field_176_c[itemstack.field_855_c] != null;
            boolean flag3 = itemstack == null || itemstack.func_21125_h() >= 0 && itemstack.func_21125_h() >= 0 && itemstack.field_853_a <= 64 && itemstack.field_853_a > 0;
            if(flag1 && flag2 && flag3)
            {
                if(itemstack == null)
                {
                    field_16_e.field_20053_ao.func_35498_a(p_35004_1_.field_35108_a, null);
                } else
                {
                    field_16_e.field_20053_ao.func_35498_a(p_35004_1_.field_35108_a, itemstack);
                }
                field_16_e.field_20053_ao.func_20129_a(field_16_e, true);
            } else
            if(flag && flag2 && flag3 && field_48073_n < 200)
            {
                field_48073_n += 20;
                EntityItem entityitem = field_16_e.func_48348_b(itemstack);
                if(entityitem != null)
                {
                    entityitem.func_48316_k();
                }
            }
        }
    }

    public void func_20008_a(Packet106Transaction p_20008_1_)
    {
        Short short1 = (Short)field_10_k.func_550_a(field_16_e.field_20052_ap.field_20134_f);
        if(short1 != null && p_20008_1_.field_20033_b == short1.shortValue() && field_16_e.field_20052_ap.field_20134_f == p_20008_1_.field_20034_a && !field_16_e.field_20052_ap.func_20124_c(field_16_e))
        {
            field_16_e.field_20052_ap.func_20129_a(field_16_e, true);
        }
    }

    public void func_20005_a(Packet130UpdateSign p_20005_1_)
    {
        WorldServer worldserver = field_17_d.func_28004_a(field_16_e.field_4110_as);
        if(worldserver.func_530_e(p_20005_1_.field_20020_a, p_20005_1_.field_20019_b, p_20005_1_.field_20022_c))
        {
            TileEntity tileentity = worldserver.func_451_k(p_20005_1_.field_20020_a, p_20005_1_.field_20019_b, p_20005_1_.field_20022_c);
            if(tileentity instanceof TileEntitySign)
            {
                TileEntitySign tileentitysign = (TileEntitySign)tileentity;
                if(!tileentitysign.func_25052_a())
                {
                    field_17_d.func_25002_c((new StringBuilder()).append("Player ").append(field_16_e.field_409_aq).append(" just tried to change non-editable sign").toString());
                    return;
                }
            }
            for(int i = 0; i < 4; i++)
            {
                boolean flag = true;
                if(p_20005_1_.field_20021_d[i].length() > 15)
                {
                    flag = false;
                } else
                {
                    for(int l = 0; l < p_20005_1_.field_20021_d[i].length(); l++)
                    {
                        if(ChatAllowedCharacters.field_20162_a.indexOf(p_20005_1_.field_20021_d[i].charAt(l)) < 0)
                        {
                            flag = false;
                        }
                    }

                }
                if(!flag)
                {
                    p_20005_1_.field_20021_d[i] = "!?";
                }
            }

            if(tileentity instanceof TileEntitySign)
            {
                int j = p_20005_1_.field_20020_a;
                int k = p_20005_1_.field_20019_b;
                int i1 = p_20005_1_.field_20022_c;
                TileEntitySign tileentitysign1 = (TileEntitySign)tileentity;
                for(int j1 = 0; j1 < 4; j1++)
                {
                    tileentitysign1.field_485_e[j1] = p_20005_1_.field_20021_d[j1];
                }

                tileentitysign1.func_183_c();
                worldserver.func_521_f(j, k, i1);
            }
        }
    }

    public void func_35005_a(Packet0KeepAlive p_35005_1_)
    {
        if(p_35005_1_.field_35126_a == field_35013_i)
        {
            int i = (int)(System.nanoTime() / 0xf4240L - field_35011_j);
            field_16_e.field_35219_i = (field_16_e.field_35219_i * 3 + i) / 4;
        }
    }

    public boolean func_27003_c()
    {
        return true;
    }

    public void func_50003_a(Packet202PlayerAbilities p_50003_1_)
    {
        field_16_e.field_35214_K.field_35658_b = p_50003_1_.field_50005_b && field_16_e.field_35214_K.field_35659_c;
    }

}
