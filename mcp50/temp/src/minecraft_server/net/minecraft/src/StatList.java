// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            CraftingManager, IRecipe, ItemStack, FurnaceRecipes, 
//            StatBase, Item, StatCollector, StatCrafting, 
//            Block, BlockFlower, BlockGrass, StatBasic, 
//            AchievementList

public class StatList
{

    protected static Map field_25104_C = new HashMap();
    public static List field_25123_a = new ArrayList();
    public static List field_25122_b = new ArrayList();
    public static List field_25121_c = new ArrayList();
    public static List field_25120_d = new ArrayList();
    public static StatBase field_25119_e = (new StatBasic(1000, "stat.startGame")).func_27052_e().func_27053_d();
    public static StatBase field_25118_f = (new StatBasic(1001, "stat.createWorld")).func_27052_e().func_27053_d();
    public static StatBase field_25117_g = (new StatBasic(1002, "stat.loadWorld")).func_27052_e().func_27053_d();
    public static StatBase field_25116_h = (new StatBasic(1003, "stat.joinMultiplayer")).func_27052_e().func_27053_d();
    public static StatBase field_25115_i = (new StatBasic(1004, "stat.leaveGame")).func_27052_e().func_27053_d();
    public static StatBase field_25114_j;
    public static StatBase field_25113_k;
    public static StatBase field_25112_l;
    public static StatBase field_25111_m;
    public static StatBase field_25110_n;
    public static StatBase field_25109_o;
    public static StatBase field_25108_p;
    public static StatBase field_27095_r;
    public static StatBase field_27094_s;
    public static StatBase field_27093_t;
    public static StatBase field_25106_q = (new StatBasic(2010, "stat.jump")).func_27052_e().func_27053_d();
    public static StatBase field_25103_r = (new StatBasic(2011, "stat.drop")).func_27052_e().func_27053_d();
    public static StatBase field_25102_s = (new StatBasic(2020, "stat.damageDealt")).func_27053_d();
    public static StatBase field_25100_t = (new StatBasic(2021, "stat.damageTaken")).func_27053_d();
    public static StatBase field_25098_u = (new StatBasic(2022, "stat.deaths")).func_27053_d();
    public static StatBase field_25097_v = (new StatBasic(2023, "stat.mobKills")).func_27053_d();
    public static StatBase field_25096_w = (new StatBasic(2024, "stat.playerKills")).func_27053_d();
    public static StatBase field_25095_x = (new StatBasic(2025, "stat.fishCaught")).func_27053_d();
    public static StatBase field_25094_y[] = func_25089_a("stat.mineBlock", 0x1000000);
    public static StatBase field_25093_z[];
    public static StatBase field_25107_A[];
    public static StatBase field_25105_B[];
    private static boolean field_25101_D = false;
    private static boolean field_25099_E = false;

    public StatList()
    {
    }

    public static void func_27092_a()
    {
    }

    public static void func_25088_a()
    {
        field_25107_A = func_25090_a(field_25107_A, "stat.useItem", 0x1020000, 0, 256);
        field_25105_B = func_25087_b(field_25105_B, "stat.breakItem", 0x1030000, 0, 256);
        field_25101_D = true;
        func_25091_c();
    }

    public static void func_25086_b()
    {
        field_25107_A = func_25090_a(field_25107_A, "stat.useItem", 0x1020000, 256, 32000);
        field_25105_B = func_25087_b(field_25105_B, "stat.breakItem", 0x1030000, 256, 32000);
        field_25099_E = true;
        func_25091_c();
    }

    public static void func_25091_c()
    {
        if(!field_25101_D || !field_25099_E)
        {
            return;
        }
        HashSet hashset = new HashSet();
        IRecipe irecipe;
        for(Iterator iterator = CraftingManager.func_20151_a().func_25126_b().iterator(); iterator.hasNext(); hashset.add(Integer.valueOf(irecipe.func_25077_b().field_855_c)))
        {
            irecipe = (IRecipe)iterator.next();
        }

        ItemStack itemstack;
        for(Iterator iterator1 = FurnaceRecipes.func_21162_a().func_25127_b().values().iterator(); iterator1.hasNext(); hashset.add(Integer.valueOf(itemstack.field_855_c)))
        {
            itemstack = (ItemStack)iterator1.next();
        }

        field_25093_z = new StatBase[32000];
        Iterator iterator2 = hashset.iterator();
        do
        {
            if(!iterator2.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator2.next();
            if(Item.field_176_c[integer.intValue()] != null)
            {
                String s = StatCollector.func_25135_a("stat.craftItem", new Object[] {
                    Item.field_176_c[integer.intValue()].func_25006_i()
                });
                field_25093_z[integer.intValue()] = (new StatCrafting(0x1010000 + integer.intValue(), s, integer.intValue())).func_27053_d();
            }
        } while(true);
        func_25092_a(field_25093_z);
    }

    private static StatBase[] func_25089_a(String p_25089_0_, int p_25089_1_)
    {
        StatBase astatbase[] = new StatBase[256];
        for(int i = 0; i < 256; i++)
        {
            if(Block.field_542_n[i] != null && Block.field_542_n[i].func_27022_g())
            {
                String s = StatCollector.func_25135_a(p_25089_0_, new Object[] {
                    Block.field_542_n[i].func_25012_e()
                });
                astatbase[i] = (new StatCrafting(p_25089_1_ + i, s, i)).func_27053_d();
                field_25120_d.add((StatCrafting)astatbase[i]);
            }
        }

        func_25092_a(astatbase);
        return astatbase;
    }

    private static StatBase[] func_25090_a(StatBase p_25090_0_[], String p_25090_1_, int p_25090_2_, int p_25090_3_, int p_25090_4_)
    {
        if(p_25090_0_ == null)
        {
            p_25090_0_ = new StatBase[32000];
        }
        for(int i = p_25090_3_; i < p_25090_4_; i++)
        {
            if(Item.field_176_c[i] == null)
            {
                continue;
            }
            String s = StatCollector.func_25135_a(p_25090_1_, new Object[] {
                Item.field_176_c[i].func_25006_i()
            });
            p_25090_0_[i] = (new StatCrafting(p_25090_2_ + i, s, i)).func_27053_d();
            if(i >= 256)
            {
                field_25121_c.add((StatCrafting)p_25090_0_[i]);
            }
        }

        func_25092_a(p_25090_0_);
        return p_25090_0_;
    }

    private static StatBase[] func_25087_b(StatBase p_25087_0_[], String p_25087_1_, int p_25087_2_, int p_25087_3_, int p_25087_4_)
    {
        if(p_25087_0_ == null)
        {
            p_25087_0_ = new StatBase[32000];
        }
        for(int i = p_25087_3_; i < p_25087_4_; i++)
        {
            if(Item.field_176_c[i] != null && Item.field_176_c[i].func_25005_e())
            {
                String s = StatCollector.func_25135_a(p_25087_1_, new Object[] {
                    Item.field_176_c[i].func_25006_i()
                });
                p_25087_0_[i] = (new StatCrafting(p_25087_2_ + i, s, i)).func_27053_d();
            }
        }

        func_25092_a(p_25087_0_);
        return p_25087_0_;
    }

    private static void func_25092_a(StatBase p_25092_0_[])
    {
        func_25085_a(p_25092_0_, Block.field_596_C.field_573_bc, Block.field_598_B.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_592_E.field_573_bc, Block.field_592_E.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_9035_bf.field_573_bc, Block.field_4052_bb.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_641_aD.field_573_bc, Block.field_642_aC.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_629_aP.field_573_bc, Block.field_630_aO.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_22010_bi.field_573_bc, Block.field_22011_bh.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_627_aR.field_573_bc, Block.field_628_aQ.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_4069_ah.field_573_bc, Block.field_4070_ag.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_608_ak.field_573_bc, Block.field_607_al.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_534_v.field_573_bc, Block.field_533_w.field_573_bc);
        func_25085_a(p_25092_0_, Block.field_643_aB.field_573_bc, Block.field_533_w.field_573_bc);
    }

    private static void func_25085_a(StatBase p_25085_0_[], int p_25085_1_, int p_25085_2_)
    {
        if(p_25085_0_[p_25085_1_] != null && p_25085_0_[p_25085_2_] == null)
        {
            p_25085_0_[p_25085_2_] = p_25085_0_[p_25085_1_];
            return;
        } else
        {
            field_25123_a.remove(p_25085_0_[p_25085_1_]);
            field_25120_d.remove(p_25085_0_[p_25085_1_]);
            field_25122_b.remove(p_25085_0_[p_25085_1_]);
            p_25085_0_[p_25085_1_] = p_25085_0_[p_25085_2_];
            return;
        }
    }

    static 
    {
        field_25114_j = (new StatBasic(1100, "stat.playOneMinute", StatBase.field_27055_j)).func_27052_e().func_27053_d();
        field_25113_k = (new StatBasic(2000, "stat.walkOneCm", StatBase.field_27054_k)).func_27052_e().func_27053_d();
        field_25112_l = (new StatBasic(2001, "stat.swimOneCm", StatBase.field_27054_k)).func_27052_e().func_27053_d();
        field_25111_m = (new StatBasic(2002, "stat.fallOneCm", StatBase.field_27054_k)).func_27052_e().func_27053_d();
        field_25110_n = (new StatBasic(2003, "stat.climbOneCm", StatBase.field_27054_k)).func_27052_e().func_27053_d();
        field_25109_o = (new StatBasic(2004, "stat.flyOneCm", StatBase.field_27054_k)).func_27052_e().func_27053_d();
        field_25108_p = (new StatBasic(2005, "stat.diveOneCm", StatBase.field_27054_k)).func_27052_e().func_27053_d();
        field_27095_r = (new StatBasic(2006, "stat.minecartOneCm", StatBase.field_27054_k)).func_27052_e().func_27053_d();
        field_27094_s = (new StatBasic(2007, "stat.boatOneCm", StatBase.field_27054_k)).func_27052_e().func_27053_d();
        field_27093_t = (new StatBasic(2008, "stat.pigOneCm", StatBase.field_27054_k)).func_27052_e().func_27053_d();
        AchievementList.func_27097_a();
    }
}
