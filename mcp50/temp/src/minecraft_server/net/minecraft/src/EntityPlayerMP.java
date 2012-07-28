// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;
import net.minecraft.server.MinecraftServer;

// Referenced classes of package net.minecraft.src:
//            EntityPlayer, ICrafting, ItemStack, ItemInWorldManager, 
//            World, ChunkCoordinates, WorldProvider, NBTTagCompound, 
//            Container, Packet5PlayerInventory, EntityTracker, InventoryPlayer, 
//            Packet3Chat, DamageSource, ServerConfigurationManager, EntityDamageSource, 
//            EntityArrow, Item, NetServerHandler, ItemMapBase, 
//            ChunkCoordIntPair, WorldServer, Chunk, Packet51MapChunk, 
//            TileEntity, PropertyManager, AchievementList, FoodStats, 
//            Packet8UpdateHealth, Packet43Experience, Packet70Bed, Entity, 
//            EntityItem, Packet22Collect, EntityXPOrb, Packet18Animation, 
//            EnumStatus, Packet17Sleep, Packet39AttachEntity, Packet100OpenWindow, 
//            ContainerWorkbench, ContainerEnchantment, IInventory, ContainerChest, 
//            TileEntityFurnace, ContainerFurnace, TileEntityDispenser, ContainerDispenser, 
//            TileEntityBrewingStand, ContainerBrewingStand, SlotCrafting, Packet103SetSlot, 
//            Packet104WindowItems, Packet105UpdateProgressbar, Packet101CloseWindow, StatBase, 
//            Packet200Statistic, StringTranslate, Packet38EntityStatus, EnumAction, 
//            Packet41EntityEffect, Packet42RemoveEntityEffect, Packet202PlayerAbilities, PotionEffect

public class EntityPlayerMP extends EntityPlayer
    implements ICrafting
{

    public NetServerHandler field_20908_a;
    public MinecraftServer field_419_b;
    public ItemInWorldManager field_425_ad;
    public double field_9155_d;
    public double field_9154_e;
    public List field_422_ag;
    public Set field_420_ah;
    private int field_9156_bu;
    private int field_35221_cc;
    private boolean field_35222_cd;
    private int field_35220_ce;
    private int field_15004_bw;
    private ItemStack field_20066_bG[] = {
        null, null, null, null, null
    };
    private int field_20065_bH;
    public boolean field_20064_am;
    public int field_35219_i;
    public boolean field_41032_j;

    public EntityPlayerMP(MinecraftServer p_i133_1_, World p_i133_2_, String p_i133_3_, ItemInWorldManager p_i133_4_)
    {
        super(p_i133_2_);
        field_422_ag = new LinkedList();
        field_420_ah = new HashSet();
        field_9156_bu = 0xfa0a1f01;
        field_35221_cc = 0xfa0a1f01;
        field_35222_cd = true;
        field_35220_ce = 0xfa0a1f01;
        field_15004_bw = 60;
        field_20065_bH = 0;
        field_41032_j = false;
        p_i133_4_.field_675_a = this;
        field_425_ad = p_i133_4_;
        ChunkCoordinates chunkcoordinates = p_i133_2_.func_22078_l();
        int i = chunkcoordinates.field_22216_a;
        int j = chunkcoordinates.field_528_b;
        int k = chunkcoordinates.field_529_a;
        if(!p_i133_2_.field_4272_q.field_4306_c)
        {
            i += field_9064_W.nextInt(20) - 10;
            k = p_i133_2_.func_4075_e(i, j);
            j += field_9064_W.nextInt(20) - 10;
        }
        func_107_c((double)i + 0.5D, k, (double)j + 0.5D, 0.0F, 0.0F);
        field_419_b = p_i133_1_;
        field_9067_S = 0.0F;
        field_409_aq = p_i133_3_;
        field_9076_H = 0.0F;
    }

    public void func_99_b(NBTTagCompound p_99_1_)
    {
        super.func_99_b(p_99_1_);
        if(p_99_1_.func_410_a("playerGameType"))
        {
            field_425_ad.func_35696_a(p_99_1_.func_395_d("playerGameType"));
        }
    }

    public void func_97_a(NBTTagCompound p_97_1_)
    {
        super.func_97_a(p_97_1_);
        p_97_1_.func_405_a("playerGameType", field_425_ad.func_35697_a());
    }

    public void func_28007_a(World p_28007_1_)
    {
        super.func_28007_a(p_28007_1_);
    }

    public void func_40108_b(int p_40108_1_)
    {
        super.func_40108_b(p_40108_1_);
        field_35220_ce = -1;
    }

    public void func_20057_k()
    {
        field_20052_ap.func_20128_a(this);
    }

    public ItemStack[] func_20042_E()
    {
        return field_20066_bG;
    }

    protected void func_22064_l_()
    {
        field_9076_H = 0.0F;
    }

    public float func_104_p()
    {
        return 1.62F;
    }

    public void func_106_b_()
    {
        field_425_ad.func_328_a();
        field_15004_bw--;
        field_20052_ap.func_20125_a();
        for(int i = 0; i < 5; i++)
        {
            ItemStack itemstack = func_21073_a(i);
            if(itemstack != field_20066_bG[i])
            {
                field_419_b.func_28003_b(field_4110_as).func_12021_a(this, new Packet5PlayerInventory(field_331_c, i, itemstack));
                field_20066_bG[i] = itemstack;
            }
        }

    }

    public ItemStack func_21073_a(int p_21073_1_)
    {
        if(p_21073_1_ == 0)
        {
            return field_416_aj.func_213_b();
        } else
        {
            return field_416_aj.field_495_b[p_21073_1_ - 1];
        }
    }

    public void func_142_f(DamageSource p_142_1_)
    {
        field_419_b.field_6033_f.func_631_a(new Packet3Chat(p_142_1_.func_35075_a(this)));
        field_416_aj.func_199_f();
    }

    public boolean func_121_a(DamageSource p_121_1_, int p_121_2_)
    {
        if(field_15004_bw > 0)
        {
            return false;
        }
        if(!field_419_b.field_9011_n && (p_121_1_ instanceof EntityDamageSource))
        {
            Entity entity = p_121_1_.func_35080_a();
            if(entity instanceof EntityPlayer)
            {
                return false;
            }
            if(entity instanceof EntityArrow)
            {
                EntityArrow entityarrow = (EntityArrow)entity;
                if(entityarrow.field_439_ah instanceof EntityPlayer)
                {
                    return false;
                }
            }
        }
        return super.func_121_a(p_121_1_, p_121_2_);
    }

    protected boolean func_27016_t()
    {
        return field_419_b.field_9011_n;
    }

    public void func_137_a(int p_137_1_)
    {
        super.func_137_a(p_137_1_);
    }

    public void func_22070_a(boolean p_22070_1_)
    {
        super.func_106_b_();
        for(int i = 0; i < field_416_aj.func_83_a(); i++)
        {
            ItemStack itemstack = field_416_aj.func_82_a(i);
            if(itemstack == null || !Item.field_176_c[itemstack.field_855_c].func_28019_b() || field_20908_a.func_38_b() > 2)
            {
                continue;
            }
            Packet packet = ((ItemMapBase)Item.field_176_c[itemstack.field_855_c]).func_28022_b(itemstack, field_9093_l, this);
            if(packet != null)
            {
                field_20908_a.func_39_b(packet);
            }
        }

        if(p_22070_1_ && !field_422_ag.isEmpty())
        {
            ChunkCoordIntPair chunkcoordintpair = (ChunkCoordIntPair)field_422_ag.get(0);
            double d = chunkcoordintpair.func_48477_a(this);
            for(int j = 0; j < field_422_ag.size(); j++)
            {
                ChunkCoordIntPair chunkcoordintpair1 = (ChunkCoordIntPair)field_422_ag.get(j);
                double d1 = chunkcoordintpair1.func_48477_a(this);
                if(d1 < d)
                {
                    chunkcoordintpair = chunkcoordintpair1;
                    d = d1;
                }
            }

            if(chunkcoordintpair != null)
            {
                boolean flag = false;
                if(field_20908_a.func_38_b() < 4)
                {
                    flag = true;
                }
                if(flag)
                {
                    WorldServer worldserver = field_419_b.func_28004_a(field_4110_as);
                    if(worldserver.func_530_e(chunkcoordintpair.field_152_a << 4, 0, chunkcoordintpair.field_151_b << 4))
                    {
                        Chunk chunk = worldserver.func_525_b(chunkcoordintpair.field_152_a, chunkcoordintpair.field_151_b);
                        if(chunk.field_681_n)
                        {
                            field_422_ag.remove(chunkcoordintpair);
                            field_20908_a.func_39_b(new Packet51MapChunk(worldserver.func_525_b(chunkcoordintpair.field_152_a, chunkcoordintpair.field_151_b), true, 0));
                            List list = worldserver.func_532_d(chunkcoordintpair.field_152_a * 16, 0, chunkcoordintpair.field_151_b * 16, chunkcoordintpair.field_152_a * 16 + 16, 256, chunkcoordintpair.field_151_b * 16 + 16);
                            for(int k = 0; k < list.size(); k++)
                            {
                                func_20063_a((TileEntity)list.get(k));
                            }

                        }
                    }
                }
            }
        }
        if(field_28015_D)
        {
            if(field_419_b.field_6035_d.func_724_a("allow-nether", true))
            {
                if(field_20052_ap != field_20053_ao)
                {
                    func_20043_I();
                }
                if(field_327_g != null)
                {
                    func_6094_e(field_327_g);
                } else
                {
                    field_28014_E += 0.0125F;
                    if(field_28014_E >= 1.0F)
                    {
                        field_28014_E = 1.0F;
                        field_28016_C = 10;
                        byte byte0 = 0;
                        if(field_4110_as == -1)
                        {
                            byte0 = 0;
                        } else
                        {
                            byte0 = -1;
                        }
                        field_419_b.field_6033_f.func_28168_f(this, byte0);
                        field_35220_ce = -1;
                        field_9156_bu = -1;
                        field_35221_cc = -1;
                        func_27017_a(AchievementList.field_40481_x);
                    }
                }
                field_28015_D = false;
            }
        } else
        {
            if(field_28014_E > 0.0F)
            {
                field_28014_E -= 0.05F;
            }
            if(field_28014_E < 0.0F)
            {
                field_28014_E = 0.0F;
            }
        }
        if(field_28016_C > 0)
        {
            field_28016_C--;
        }
        if(func_40097_ai() != field_9156_bu || field_35221_cc != field_35217_m.func_35585_a() || (field_35217_m.func_35586_c() == 0.0F) != field_35222_cd)
        {
            field_20908_a.func_39_b(new Packet8UpdateHealth(func_40097_ai(), field_35217_m.func_35585_a(), field_35217_m.func_35586_c()));
            field_9156_bu = func_40097_ai();
            field_35221_cc = field_35217_m.func_35585_a();
            field_35222_cd = field_35217_m.func_35586_c() == 0.0F;
        }
        if(field_35212_N != field_35220_ce)
        {
            field_35220_ce = field_35212_N;
            field_20908_a.func_39_b(new Packet43Experience(field_35210_L, field_35212_N, field_35211_M));
        }
    }

    public void func_40107_e(int p_40107_1_)
    {
        if(field_4110_as == 1 && p_40107_1_ == 1)
        {
            func_27017_a(AchievementList.field_40477_C);
            field_9093_l.func_22085_d(this);
            field_41032_j = true;
            field_20908_a.func_39_b(new Packet70Bed(4, 0));
        } else
        {
            func_27017_a(AchievementList.field_40476_B);
            ChunkCoordinates chunkcoordinates = field_419_b.func_28004_a(p_40107_1_).func_40212_d();
            if(chunkcoordinates != null)
            {
                field_20908_a.func_41_a(chunkcoordinates.field_22216_a, chunkcoordinates.field_529_a, chunkcoordinates.field_528_b, 0.0F, 0.0F);
            }
            field_419_b.field_6033_f.func_28168_f(this, 1);
            field_35220_ce = -1;
            field_9156_bu = -1;
            field_35221_cc = -1;
        }
    }

    private void func_20063_a(TileEntity p_20063_1_)
    {
        if(p_20063_1_ != null)
        {
            Packet packet = p_20063_1_.func_20070_f();
            if(packet != null)
            {
                field_20908_a.func_39_b(packet);
            }
        }
    }

    public void func_163_c(Entity p_163_1_, int p_163_2_)
    {
        if(!p_163_1_.field_304_B)
        {
            EntityTracker entitytracker = field_419_b.func_28003_b(field_4110_as);
            if(p_163_1_ instanceof EntityItem)
            {
                entitytracker.func_12021_a(p_163_1_, new Packet22Collect(p_163_1_.field_331_c, field_331_c));
            }
            if(p_163_1_ instanceof EntityArrow)
            {
                entitytracker.func_12021_a(p_163_1_, new Packet22Collect(p_163_1_.field_331_c, field_331_c));
            }
            if(p_163_1_ instanceof EntityXPOrb)
            {
                entitytracker.func_12021_a(p_163_1_, new Packet22Collect(p_163_1_.field_331_c, field_331_c));
            }
        }
        super.func_163_c(p_163_1_, p_163_2_);
        field_20052_ap.func_20125_a();
    }

    public void func_168_z()
    {
        if(!field_9148_aq)
        {
            field_9147_ar = -1;
            field_9148_aq = true;
            EntityTracker entitytracker = field_419_b.func_28003_b(field_4110_as);
            entitytracker.func_12021_a(this, new Packet18Animation(this, 1));
        }
    }

    public void func_22068_s()
    {
    }

    public EnumStatus func_22060_a(int p_22060_1_, int p_22060_2_, int p_22060_3_)
    {
        EnumStatus enumstatus = super.func_22060_a(p_22060_1_, p_22060_2_, p_22060_3_);
        if(enumstatus == EnumStatus.OK)
        {
            EntityTracker entitytracker = field_419_b.func_28003_b(field_4110_as);
            Packet17Sleep packet17sleep = new Packet17Sleep(this, 0, p_22060_1_, p_22060_2_, p_22060_3_);
            entitytracker.func_12021_a(this, packet17sleep);
            field_20908_a.func_41_a(field_322_l, field_321_m, field_320_n, field_316_r, field_315_s);
            field_20908_a.func_39_b(packet17sleep);
        }
        return enumstatus;
    }

    public void func_22062_a(boolean p_22062_1_, boolean p_22062_2_, boolean p_22062_3_)
    {
        if(func_22057_E())
        {
            EntityTracker entitytracker = field_419_b.func_28003_b(field_4110_as);
            entitytracker.func_609_a(this, new Packet18Animation(this, 3));
        }
        super.func_22062_a(p_22062_1_, p_22062_2_, p_22062_3_);
        if(field_20908_a != null)
        {
            field_20908_a.func_41_a(field_322_l, field_321_m, field_320_n, field_316_r, field_315_s);
        }
    }

    public void func_6094_e(Entity p_6094_1_)
    {
        super.func_6094_e(p_6094_1_);
        field_20908_a.func_39_b(new Packet39AttachEntity(this, field_327_g));
        field_20908_a.func_41_a(field_322_l, field_321_m, field_320_n, field_316_r, field_315_s);
    }

    protected void func_122_m(double d, boolean flag)
    {
    }

    public void func_9153_b(double p_9153_1_, boolean p_9153_3_)
    {
        super.func_122_m(p_9153_1_, p_9153_3_);
    }

    private void func_20060_R()
    {
        field_20065_bH = field_20065_bH % 100 + 1;
    }

    public void func_174_A(int p_174_1_, int p_174_2_, int p_174_3_)
    {
        func_20060_R();
        field_20908_a.func_39_b(new Packet100OpenWindow(field_20065_bH, 1, "Crafting", 9));
        field_20052_ap = new ContainerWorkbench(field_416_aj, field_9093_l, p_174_1_, p_174_2_, p_174_3_);
        field_20052_ap.field_20134_f = field_20065_bH;
        field_20052_ap.func_20128_a(this);
    }

    public void func_40106_c(int p_40106_1_, int p_40106_2_, int p_40106_3_)
    {
        func_20060_R();
        field_20908_a.func_39_b(new Packet100OpenWindow(field_20065_bH, 4, "Enchanting", 9));
        field_20052_ap = new ContainerEnchantment(field_416_aj, field_9093_l, p_40106_1_, p_40106_2_, p_40106_3_);
        field_20052_ap.field_20134_f = field_20065_bH;
        field_20052_ap.func_20128_a(this);
    }

    public void func_166_a(IInventory p_166_1_)
    {
        func_20060_R();
        field_20908_a.func_39_b(new Packet100OpenWindow(field_20065_bH, 0, p_166_1_.func_20068_b(), p_166_1_.func_83_a()));
        field_20052_ap = new ContainerChest(field_416_aj, p_166_1_);
        field_20052_ap.field_20134_f = field_20065_bH;
        field_20052_ap.func_20128_a(this);
    }

    public void func_170_a(TileEntityFurnace p_170_1_)
    {
        func_20060_R();
        field_20908_a.func_39_b(new Packet100OpenWindow(field_20065_bH, 2, p_170_1_.func_20068_b(), p_170_1_.func_83_a()));
        field_20052_ap = new ContainerFurnace(field_416_aj, p_170_1_);
        field_20052_ap.field_20134_f = field_20065_bH;
        field_20052_ap.func_20128_a(this);
    }

    public void func_21072_a(TileEntityDispenser p_21072_1_)
    {
        func_20060_R();
        field_20908_a.func_39_b(new Packet100OpenWindow(field_20065_bH, 3, p_21072_1_.func_20068_b(), p_21072_1_.func_83_a()));
        field_20052_ap = new ContainerDispenser(field_416_aj, p_21072_1_);
        field_20052_ap.field_20134_f = field_20065_bH;
        field_20052_ap.func_20128_a(this);
    }

    public void func_40110_a(TileEntityBrewingStand p_40110_1_)
    {
        func_20060_R();
        field_20908_a.func_39_b(new Packet100OpenWindow(field_20065_bH, 5, p_40110_1_.func_20068_b(), p_40110_1_.func_83_a()));
        field_20052_ap = new ContainerBrewingStand(field_416_aj, p_40110_1_);
        field_20052_ap.field_20134_f = field_20065_bH;
        field_20052_ap.func_20128_a(this);
    }

    public void func_20055_a(Container p_20055_1_, int p_20055_2_, ItemStack p_20055_3_)
    {
        if(p_20055_1_.func_20120_a(p_20055_2_) instanceof SlotCrafting)
        {
            return;
        }
        if(field_20064_am)
        {
            return;
        } else
        {
            field_20908_a.func_39_b(new Packet103SetSlot(p_20055_1_.field_20134_f, p_20055_2_, p_20055_3_));
            return;
        }
    }

    public void func_28017_a(Container p_28017_1_)
    {
        func_20054_a(p_28017_1_, p_28017_1_.func_28127_b());
    }

    public void func_20054_a(Container p_20054_1_, List p_20054_2_)
    {
        field_20908_a.func_39_b(new Packet104WindowItems(p_20054_1_.field_20134_f, p_20054_2_));
        field_20908_a.func_39_b(new Packet103SetSlot(-1, -1, field_416_aj.func_20072_i()));
    }

    public void func_20056_a(Container p_20056_1_, int p_20056_2_, int p_20056_3_)
    {
        field_20908_a.func_39_b(new Packet105UpdateProgressbar(p_20056_1_.field_20134_f, p_20056_2_, p_20056_3_));
    }

    public void func_20045_a(ItemStack itemstack)
    {
    }

    public void func_20043_I()
    {
        field_20908_a.func_39_b(new Packet101CloseWindow(field_20052_ap.field_20134_f));
        func_20059_K();
    }

    public void func_20058_J()
    {
        if(field_20064_am)
        {
            return;
        } else
        {
            field_20908_a.func_39_b(new Packet103SetSlot(-1, -1, field_416_aj.func_20072_i()));
            return;
        }
    }

    public void func_20059_K()
    {
        field_20052_ap.func_20130_a(this);
        field_20052_ap = field_20053_ao;
    }

    public void func_25046_a(StatBase p_25046_1_, int p_25046_2_)
    {
        if(p_25046_1_ == null)
        {
            return;
        }
        if(!p_25046_1_.field_27058_g)
        {
            for(; p_25046_2_ > 100; p_25046_2_ -= 100)
            {
                field_20908_a.func_39_b(new Packet200Statistic(p_25046_1_.field_25063_d, 100));
            }

            field_20908_a.func_39_b(new Packet200Statistic(p_25046_1_.field_25063_d, p_25046_2_));
        }
    }

    public void func_30002_A()
    {
        if(field_327_g != null)
        {
            func_6094_e(field_327_g);
        }
        if(field_328_f != null)
        {
            field_328_f.func_6094_e(this);
        }
        if(field_21900_a)
        {
            func_22062_a(true, false, false);
        }
    }

    public void func_30001_B()
    {
        field_9156_bu = 0xfa0a1f01;
    }

    public void func_22061_a(String p_22061_1_)
    {
        StringTranslate stringtranslate = StringTranslate.func_25079_a();
        String s = stringtranslate.func_25080_a(p_22061_1_);
        field_20908_a.func_39_b(new Packet3Chat(s));
    }

    protected void func_35199_C()
    {
        field_20908_a.func_39_b(new Packet38EntityStatus(field_331_c, (byte)9));
        super.func_35199_C();
    }

    public void func_35201_a(ItemStack p_35201_1_, int p_35201_2_)
    {
        super.func_35201_a(p_35201_1_, p_35201_2_);
        if(p_35201_1_ != null && p_35201_1_.func_569_a() != null && p_35201_1_.func_569_a().func_35406_b(p_35201_1_) == EnumAction.eat)
        {
            EntityTracker entitytracker = field_419_b.func_28003_b(field_4110_as);
            entitytracker.func_609_a(this, new Packet18Animation(this, 5));
        }
    }

    protected void func_35181_a(PotionEffect p_35181_1_)
    {
        super.func_35181_a(p_35181_1_);
        field_20908_a.func_39_b(new Packet41EntityEffect(field_331_c, p_35181_1_));
    }

    protected void func_35179_b(PotionEffect p_35179_1_)
    {
        super.func_35179_b(p_35179_1_);
        field_20908_a.func_39_b(new Packet41EntityEffect(field_331_c, p_35179_1_));
    }

    protected void func_35185_c(PotionEffect p_35185_1_)
    {
        super.func_35185_c(p_35185_1_);
        field_20908_a.func_39_b(new Packet42RemoveEntityEffect(field_331_c, p_35185_1_));
    }

    public void func_40098_a_(double p_40098_1_, double p_40098_3_, double p_40098_5_)
    {
        field_20908_a.func_41_a(p_40098_1_, p_40098_3_, p_40098_5_, field_316_r, field_315_s);
    }

    public void func_35202_e(Entity p_35202_1_)
    {
        EntityTracker entitytracker = field_419_b.func_28003_b(field_4110_as);
        entitytracker.func_609_a(this, new Packet18Animation(p_35202_1_, 6));
    }

    public void func_40109_c(Entity p_40109_1_)
    {
        EntityTracker entitytracker = field_419_b.func_28003_b(field_4110_as);
        entitytracker.func_609_a(this, new Packet18Animation(p_40109_1_, 7));
    }

    public void func_50022_L()
    {
        if(field_20908_a == null)
        {
            return;
        } else
        {
            field_20908_a.func_39_b(new Packet202PlayerAbilities(field_35214_K));
            return;
        }
    }
}
